package parking.refactored;

import java.io.FileWriter;
import java.io.IOException;

public class FileLogger implements ReceiptLogger {
    private final String fileName;

    public FileLogger(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void log(String receipt) throws IOException {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write(receipt + System.lineSeparator());
        }
    }
}