package lk.ijse.gdse.Vehicle.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class ResponseUtil {
    private int code;
    private String message;
    private Object data;
}
