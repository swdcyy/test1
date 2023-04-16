package pr4.l;
import com.google.protobuf.MessageLiteOrBuilder;
import java.lang.String;
import com.google.protobuf.ByteString;

public interface abstract l implements MessageLiteOrBuilder	// class@002e11
{

    String getBlockTime();
    ByteString getBlockTimeBytes();
    String getBlockType();
    ByteString getBlockTypeBytes();
    String getFinishType();
    ByteString getFinishTypeBytes();
    String getType();
    ByteString getTypeBytes();
}
