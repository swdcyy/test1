package org.java_websocket.framing.b;
import org.java_websocket.framing.d;
import org.java_websocket.enums.Opcode;
import org.java_websocket.exceptions.InvalidFrameException;
import java.lang.String;

public abstract class b extends d	// class@002151
{

    public void b(Opcode p0){
       super(p0);
    }
    public void b(){
       if (!this.isFin()) {
          throw new InvalidFrameException("Control frame cant have fin==false set");
       }
       if (this.isRSV1()) {
          throw new InvalidFrameException("Control frame cant have rsv1==true set");
       }
       if (this.isRSV2()) {
          throw new InvalidFrameException("Control frame cant have rsv2==true set");
       }
       if (!this.isRSV3()) {
          return;
       }
       throw new InvalidFrameException("Control frame cant have rsv3==true set");
    }
}
