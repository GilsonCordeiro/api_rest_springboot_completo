package curso.example.api_curso.controllers;

import curso.example.api_curso.model.Category;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
public class CategoriaController {

    @GetMapping("/categorias")
    public List<Category> listar(){
        Category cat = new Category(1L, "Informátcia");
        Category cat2 = new Category(2L, "Escritório");
        List<Category> lista = new ArrayList<>();
        lista.add(cat);
        lista.add(cat2);
        return lista;

    }
}
