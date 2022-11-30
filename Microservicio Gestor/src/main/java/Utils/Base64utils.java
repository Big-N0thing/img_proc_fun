package Utils;

import java.util.Base64;

// https://www.baeldung.com/java-base64-encode-and-decode
public class Base64utils {

    public static void encodeBase64(String pathToFile) {
        String originalInput = "test input";
        String encodedString = Base64.getEncoder().encodeToString(originalInput.getBytes());
    }

    public static void decodeBase64(String pathToFile) {
        String encodedString = "AQUÍ HAY QUE METER EL CSV CONVERTIDO A STRING DIRECTAMENTE";
        byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
        String decodedString = new String(decodedBytes);
    }
}
