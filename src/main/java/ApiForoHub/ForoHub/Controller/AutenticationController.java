package ApiForoHub.ForoHub.Controller;

import ApiForoHub.ForoHub.domain.Usuario.DatosAutentication;
import ApiForoHub.ForoHub.domain.Usuario.Usuario;
import ApiForoHub.ForoHub.infra.TokenService;
import ApiForoHub.ForoHub.infra.security.DatosTokenJWT;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class AutenticationController {
    @Autowired
    private TokenService tokenService;

    @Autowired
    private AuthenticationManager manager;

    @PostMapping
    public ResponseEntity iniciarSesion(@RequestBody @Valid DatosAutentication datos){
        var autenticationToken = new UsernamePasswordAuthenticationToken(datos.login(), datos.password());
        var autentication = manager.authenticate(autenticationToken);
        var tokenJWT = tokenService.generateToken((Usuario) autentication.getPrincipal());

        return ResponseEntity.ok(new DatosTokenJWT(tokenJWT));

    }

}
