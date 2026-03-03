package com.aquinourban.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    // Esta función le dice a Java que cuando entres a la página, abra el index.html
    @GetMapping("/")
    public String mostrarIndex() {
        return "index"; 
    }
    
    <script>
    function validarLogin() {
        // No importa lo que escriban aquí, la función se ejecutará
        var user = document.getElementById('user').value;
        var pass = document.getElementById('pass').value;

        // Quitamos la validación de "jeremy" y "123"
        // Ahora, con solo darle clic al botón, hace esto:
        document.getElementById('login-section').style.display = 'none'; // Oculta el login
        document.getElementById('main-content').style.display = 'block'; // Muestra tu catálogo
    }

    function comprar(producto) {
        alert("¡Excelente! Has añadido " + producto + " a tu carrito de Aquino Urban.");
    }
</script>
}