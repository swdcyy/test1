package okhttp3.internal.ws.RealWebSocket$Message;
import okio.ByteString;
import java.lang.Object;

public final class RealWebSocket$Message	// class@001fd9
{
    public final ByteString data;
    public final int formatOpcode;

    public void RealWebSocket$Message(int p0,ByteString p1){
       super();
       this.formatOpcode = p0;
       this.data = p1;
    }
}
