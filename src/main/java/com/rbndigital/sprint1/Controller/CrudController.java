package com.rbndigital.sprint1.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.rbndigital.sprint1.Entidades.CrudEntidades;
import com.rbndigital.sprint1.Servicios.CrudServicio;

@Controller
public class CrudController {
	
	@Autowired
	private CrudServicio cursoService;
	
	@GetMapping("/siaG42")
	public String seleccionarCursos(Model model)
	{
		try {
			List<CrudEntidades> listaCursos = cursoService.findAll();
			model.addAttribute("cursos", listaCursos);
		}catch(Exception e) {
			System.out.println("Error: "+e.getCause());
		}
		
		return "index";
	}

}
