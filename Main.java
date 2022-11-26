import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;


public class Main{
	public static void main(String[]args) throws UnsupportedAudioFileException, IOException, LineUnavailableException{
		Scanner scanner = new Scanner(System.in);
		String respuesta = "";

		File file = new File("/home/frank/Documentos/Programacion/Java/ProyectosJava/ReproductorJava/JavaMusic/MusicaPrueba/NotTooCry-HumaHuma.wav");
		AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
		Clip clip = AudioSystem.getClip();
		clip.open(audioStream);
		
		clip.start();

		while(!respuesta.equals("Q")){
			System.out.println("P = play, S = Stop, R = Reset, Q = Quit");
			System.out.print("Escriba la opcion:: ");
			
			respuesta = scanner.next();
			respuesta = respuesta.toUpperCase();

			switch(respuesta){
				case ("P"):
					clip.start();
					break;
				case ("S"):
					clip.stop();
					break;
				case ("R"):
					clip.setMicrosecondPosition(0);
					break;
				case ("Q"):
					clip.close();
					break;
				default:
					System.out.println("Opcion erronea");
			}	 
		
		}
		System.out.println("Byeeee :) ");
	}

}
