package model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "offers")
@Getter
@Setter
public class Offer {

    @NotNull(message = "İsim boş bırakılamaz")
    private String name;

    @NotNull(message = "id boş bırakılamaz.")
    private int id;

    @NotNull(message = "Fiyat boş bırakılamaz.")
    @Size(message = "Negatif sayı veya karakter girilemez.")
    private int price;

    @NotNull(message = "Açıklama boş bırakılamaz.")
    @Size(message = "10.000 karakterden fazla yazılamaz.")
    private String terms;

    public @NotNull(message = "İsim boş bırakılamaz") String getName() {
        return name;
    }

    public void setName(@NotNull(message = "İsim boş bırakılamaz") String name) {
        this.name = name;
    }

    @NotNull(message = "Fiyat boş bırakılamaz.")
    @Size(message = "Negatif sayı veya karakter girilemez.")
    public int getPrice() {
        return price;
    }

    public void setPrice(@NotNull(message = "Fiyat boş bırakılamaz.") @Size(message = "Negatif sayı veya karakter girilemez.") int price) {
        this.price = price;
    }

    public @NotNull(message = "Açıklama boş bırakılamaz.") @Size(message = "10.000 karakterden fazla yazılamaz.") String getTerms() {
        return terms;
    }

    public void setTerms(@NotNull(message = "Açıklama boş bırakılamaz.") @Size(message = "10.000 karakterden fazla yazılamaz.") String terms) {
        this.terms = terms;
    }

    @NotNull(message = "id boş bırakılamaz.")
    public int getId() {
        return id;
    }

    public void setId(@NotNull(message = "id boş bırakılamaz.") int id) {
        this.id = id;
    }
}
