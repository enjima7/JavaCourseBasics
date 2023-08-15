package domain;

/**
 *
 * @author enriq
 */
public class Usuario {
    private String username;
    private String password;
    private int id;

    public Usuario() {
    }

    public Usuario(String username, String password, int id) {
        this.username = username;
        this.password = password;
        this.id = id;
    }

    public Usuario(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Usuario(int id) {
        this.id = id;
    }

    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Usuario{" + "username=" + username + ", password=" + password + ", id=" + id + '}';
    }
    
    
    
}
