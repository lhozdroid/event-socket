/**
 *
 */
package dev.lhoz.socket.es.client;

/**
 * @author Lhoz
 *
 */
public class ClientSocketBuilder extends ClientSocket {
	/**
	 *
	 */
	public ClientSocketBuilder() {
	}

	/**
	 * @return
	 */
	public ClientSocket build() {
		return this;
	}

	/**
	 * @param address
	 * @return
	 */
	public ClientSocketBuilder withAddress(final String address) {
		this.options.setAddress(address);
		return this;
	}

	/**
	 * @param autoReconnect
	 * @return
	 */
	public ClientSocketBuilder withAutoReconnect(final boolean autoReconnect) {
		this.options.setAutoReconnect(autoReconnect);
		return this;
	}

	/**
	 * @param port
	 * @return
	 */
	public ClientSocketBuilder withPort(final int port) {
		if (port >= 0 && port <= 65535) {
			this.options.setPort(port);
		}
		return this;
	}

	/**
	 * @param readTries
	 * @return
	 */
	public ClientSocketBuilder withReadTries(final int readTries) {
		if (readTries > 0) {
			this.options.setReadTries(readTries);
		}
		return this;
	}

	/**
	 * @param timeout
	 * @return
	 */
	public ClientSocketBuilder withTimeout(final int timeout) {
		if (timeout > 0) {
			this.options.setTimeout(timeout);
		}
		return this;
	}

	/**
	 * @param writeTries
	 * @return
	 */
	public ClientSocketBuilder withWriteTries(final int writeTries) {
		if (writeTries > 0) {
			this.options.setWriteTries(writeTries);
		}
		return this;
	}
}
