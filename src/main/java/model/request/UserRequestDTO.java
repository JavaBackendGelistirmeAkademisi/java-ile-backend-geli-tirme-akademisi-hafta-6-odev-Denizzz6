package model.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
@Getter
@Setter
public class UserRequestDTO {
    @NotNull(message = "İsim boş bırakılamaz.")
    private String name;


    @NotNull(message = "kullanıcı rolü boş bırakılamaz.")
    private String role;


    @NotNull(message = "Email boş bırakılamaz.")
    private String email;

}
