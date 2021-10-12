package com.rbndigital.sprint1.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.rbndigital.sprint1.Entidades.Curso;
import com.rbndigital.sprint1.Servicios.CrudServicio;

@Controller
public class CrudController {
	
	@Autowired
	private CrudServicio cursoService;
	
	@GetMapping("/siaG42")
	public String seleccionarCursos(Model model){
		try {
			List<Curso> listaCursos = cursoService.findAll();
			model.addAttribute("cursos", listaCursos);
		}catch(Exception e) {
			System.out.println("Error: "+e.getCause());
		}
		
		return "index";
	}

	@RequestMapping("/estadisticas")
	public ModelAndView estadisticas() {
		return new ModelAndView("estadisticas");
	}
	@RequestMapping("/fajardo")
	public ModelAndView fajardo() {
		return new ModelAndView("fajardo");
	}
	@RequestMapping("/gaviria")
	public ModelAndView gaviria() {
		return new ModelAndView("gaviria");
	}
	@RequestMapping("/gutierrez")
	public ModelAndView gutierrez() {
		return new ModelAndView("gutierrez");
	}
	@RequestMapping("/mapa")
	public ModelAndView mapa() {
		return new ModelAndView("mapa");
	}
	@RequestMapping("/marquez")
	public ModelAndView marquez() {
		return new ModelAndView("marquez");
	}
	@RequestMapping("/petro")
	public ModelAndView petro() {
		return new ModelAndView("petro");
	}
	@RequestMapping("/registro")
	public ModelAndView registro() {
		return new ModelAndView("registro");
	}
	@RequestMapping("/Votación")
	public ModelAndView Votación() {
		return new ModelAndView("Votación");
	}
	@RequestMapping("/zuluaga")
	public ModelAndView zuluaga() {
		return new ModelAndView("zuluaga");
	}
	@RequestMapping("/acercaDe")
	public ModelAndView acercaDe() {
		return new ModelAndView("acercaDe");
	}
}
