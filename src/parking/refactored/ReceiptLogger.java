package parking.refactored;

import java.io.IOException;

public interface ReceiptLogger {
    void log(String receipt) throws IOException;
}