package okhttp3.Connection;
import okhttp3.Handshake;
import okhttp3.Protocol;
import okhttp3.Route;
import java.net.Socket;

public interface abstract Connection	// class@002068
{

    Handshake handshake();
    Protocol protocol();
    Route route();
    Socket socket();
}
