package co.com.poli.subastasjcdr.errors;

public class ResourceBadRequest extends RuntimeException {
    public ResourceBadRequest(String message) {
        super(message);
    }
}
