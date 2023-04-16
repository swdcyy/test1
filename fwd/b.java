package fwd.b;
import java.lang.String;
import java.lang.Object;
import org.java_websocket.drafts.b;
import java.net.InetSocketAddress;
import org.java_websocket.enums.ReadyState;
import java.nio.ByteBuffer;
import org.java_websocket.enums.Opcode;
import iwd.c;
import java.util.Collection;

public interface abstract b	// class@000eee
{

    void close();
    void close(int p0);
    void close(int p0,String p1);
    void closeConnection(int p0,String p1);
    Object getAttachment();
    b getDraft();
    InetSocketAddress getLocalSocketAddress();
    ReadyState getReadyState();
    InetSocketAddress getRemoteSocketAddress();
    String getResourceDescriptor();
    boolean hasBufferedData();
    boolean isClosed();
    boolean isClosing();
    boolean isFlushAndClose();
    boolean isOpen();
    void send(String p0);
    void send(ByteBuffer p0);
    void send(byte[] p0);
    void sendFragmentedFrame(Opcode p0,ByteBuffer p1,boolean p2);
    void sendFrame(c p0);
    void sendFrame(Collection p0);
    void sendPing();
    void setAttachment(Object p0);
}
