package hr4.l;
import com.google.protobuf.MessageLiteOrBuilder;
import java.lang.String;
import com.google.protobuf.ByteString;

public interface abstract l implements MessageLiteOrBuilder	// class@0023c4
{

    String getReqId();
    ByteString getReqIdBytes();
    long getSerialNo();
    String getSpeechText();
    ByteString getSpeechTextBytes();
}
