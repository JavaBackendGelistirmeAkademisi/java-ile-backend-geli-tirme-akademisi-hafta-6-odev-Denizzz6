package model.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
@Getter
@Setter
public class ProjectRequestDTO {

    @NotNull(message = "proje adı boş olamaz.")
    private String name;

    @NotNull(message = "açıklama boş olamaz.")
    private String note;


}
