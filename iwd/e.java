package iwd.e;
import org.java_websocket.framing.b;
import org.java_websocket.enums.Opcode;
import iwd.d;
import java.nio.ByteBuffer;
import org.java_websocket.framing.d;

public class e extends b	// class@001521
{

    public void e(){
       super(Opcode.PONG);
    }
    public void e(d p0){
       super(Opcode.PONG);
       this.d(p0.getPayloadData());
    }
}
