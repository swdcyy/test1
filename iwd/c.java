package iwd.c;
import org.java_websocket.enums.Opcode;
import java.nio.ByteBuffer;

public interface abstract c	// class@00151f
{

    void a(c p0);
    Opcode getOpcode();
    ByteBuffer getPayloadData();
    boolean getTransfereMasked();
    boolean isFin();
    boolean isRSV1();
    boolean isRSV2();
    boolean isRSV3();
}
