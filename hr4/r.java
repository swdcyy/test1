package hr4.r;
import com.google.protobuf.MessageLiteOrBuilder;
import java.lang.String;
import com.google.protobuf.ByteString;

public interface abstract r implements MessageLiteOrBuilder	// class@0023ca
{

    float getConfidence();
    float getEndTime();
    String getFixedResult();
    ByteString getFixedResultBytes();
    float getStartTime();
}
