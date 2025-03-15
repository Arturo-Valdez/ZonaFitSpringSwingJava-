package gm.zona_fit.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

//Se utilizan objetos en vez de tipos primitivos
@Entity
//Generador de metodos get y set con la anotacion
@Data
//Generador de constructor con ningun argumento
@NoArgsConstructor
//Generador de constructor con todos los argumento
@AllArgsConstructor
//Generador de Equials y HashCode que nos agiliza la busqueda
@EqualsAndHashCode
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String apellido;
    private Integer membresia;

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", membresia=" + membresia +
                '}';
    }
}
