import java.io.ByteArrayInputStream;

public class Main {
    public static void main(String[] args) throws Exception {
        // Test proprietary format processing
        byte[] audioData = {1, 2, 3, 4, 5};
        ProprietaryAudioFormat proprietaryAudio = new ProprietaryAudioFormat(audioData, 44100, 2);
        AudioProcessor processor = new AudioProcessor();
        processor.processAudio(proprietaryAudio);  // Call proprietary processing
        proprietaryAudio.saveAudioToFile("proprietary_audio.dat");

        // Test standard format processing using InputStream
        ByteArrayInputStream inputStream = new ByteArrayInputStream(audioData);
        processor.processAudio(inputStream);  // Call standard format processing
    }
}
