import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class DatabaseInıtializer {
    @PostConstruct
    public void init() {
        // Uygulama başlatıldığında tabloları oluştur
        DatabaseManager.createTables();
    }
}
