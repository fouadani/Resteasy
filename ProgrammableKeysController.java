import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.PostConstruct;

@RestController
public class ProgrammableKeysController implements ProgrammableKeysApi {

    @PostConstruct
    public void init() {
        System.out.println(">>> Controller LOADED !");
    }

    @Override
    public ResponseEntity<DeviceResponseDto> getDeviceDetails(String tenant, String site, String userId) {
        return ResponseEntity.ok(DeviceResponseDto.builder().code(1).build());
    }

    @Override
    public ResponseEntity<PhoneButtonsResponseDto> getDeviceDetailsButtons(String tenant, String site, String userId) {
        // Implement your logic here
        return ResponseEntity.ok(PhoneButtonsResponseDto.builder().build());
    }

    @Override
    public ResponseEntity<Void> updateDeviceDetailsButtons(String tenant, String site, String userId, PhoneButtonsRequestDto phoneButtonsRequestDto) {
        // Implement your logic here
        return ResponseEntity.noContent().build();
    }
}