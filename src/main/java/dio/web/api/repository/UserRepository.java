package dio.web.api.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import dio.web.api.model.Usuario;

@Repository
public class UserRepository {
    private Map<Integer, Usuario> users = new HashMap<>();
    private int nextId = 1;

    public void save(Usuario usuario) {
        usuario.setId(nextId);
        nextId++;
        users.put(usuario.getId(), usuario);
        System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        System.out.println(usuario);
    }

    public void update(Usuario usuario) {
        users.put(usuario.getId(), usuario);
        System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        System.out.println(usuario);
    }

    public void remove(Integer id) {
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
        users.remove(id);
        System.out.println("Usuário removido com sucesso.");
    }

    public List<Usuario> findAll() {
        List<Usuario> usuarios = new ArrayList<>(users.values());
        return usuarios;
    }

    public Usuario findById(Integer id) {
        return users.get(id);
    }

    public Usuario findByUsername(String username) {
        return users.values().stream().filter(u -> u.getNome().equals(username)).findFirst().orElse(null);
    }
}