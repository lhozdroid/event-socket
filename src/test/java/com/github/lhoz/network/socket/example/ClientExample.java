/**
 * 
 */
package com.github.lhoz.network.socket.example;

import com.github.lhoz.network.socket.client.ClientSocket;
import com.github.lhoz.network.socket.client.ClientSocketBuilder;

/**
 * @author Lhoz
 *
 */
public class ClientExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ClientSocket client = new ClientSocketBuilder() //
				.withAddress("localhost")//
				.withPort(9797)//
				.withReadTries(3)//
				.withWriteTries(3)//
				.withTimeout(250)//
				.build();

		ClientListener listener = new ClientListener();
		client.add(listener);

		client.start();

		while (true) {
			client.send("Hello server, from client!");

			try {
				Thread.sleep(10000);
			} catch (Exception e) {
			}
		}
	}

}
