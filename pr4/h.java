package pr4.h;
import com.google.protobuf.MessageLiteOrBuilder;
import java.lang.String;
import com.google.protobuf.ByteString;

public interface abstract h implements MessageLiteOrBuilder	// class@002e0d
{

    String getName();
    ByteString getNameBytes();
    String getStage();
    ByteString getStageBytes();
    String getTime();
    ByteString getTimeBytes();
}
