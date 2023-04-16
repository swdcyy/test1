package org.java_websocket.d;
import fwd.c;
import org.java_websocket.a;
import org.java_websocket.drafts.b;
import fwd.d;
import java.util.List;
import java.nio.channels.SocketChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.ByteChannel;

public interface abstract d implements c	// class@00213d
{

    d a(a p0,b p1);
    d b(a p0,List p1);
    void close();
    ByteChannel wrapChannel(SocketChannel p0,SelectionKey p1);
}
