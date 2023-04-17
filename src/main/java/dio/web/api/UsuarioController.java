package dio.web.api;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dio.web.api.model.Usuario;
import dio.web.api.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UsuarioController {
	@Autowired
	private UserRepository repository;
	@GetMapping()
	public List<Usuario> getUsers(){
		return repository.findAll();
		
	}
	
	@GetMapping("/{username}")
	public Usuario getOne(@PathVariable("username") String username) {
		return repository.findByUsername(username);
		
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable ("id") Integer id) {
		repository.remove(id);
		// parei no min 20:44
	}
	@PostMapping()
	public void postUser(Usuario usuario) {
		repository.save(usuario);
	}

}