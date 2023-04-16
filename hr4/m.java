package hr4.m;
import com.google.protobuf.MessageLiteOrBuilder;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtSpeechRecognitionResultCode;

public interface abstract m implements MessageLiteOrBuilder	// class@0023c5
{

    String getReqId();
    ByteString getReqIdBytes();
    boolean getRequestContinue();
    long getSerialNo();
    ByteString getSpeech();
    String getSpeechText();
    ByteString getSpeechTextBytes();
    StentorMMU$RtSpeechRecognitionResultCode getStatus();
    int getStatusValue();
}
