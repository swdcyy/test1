package pr4.m;
import com.google.protobuf.MessageLiteOrBuilder;
import java.lang.String;
import com.google.protobuf.ByteString;

public interface abstract m implements MessageLiteOrBuilder	// class@002e12
{

    String getId();
    ByteString getIdBytes();
    String getName();
    ByteString getNameBytes();
    float getValue();
}
