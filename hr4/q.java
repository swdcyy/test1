package hr4.q;
import com.google.protobuf.MessageLiteOrBuilder;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtSpeechRecognitionResponse;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$BizType;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtNLUResponse;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtTextToSpeechResponse;

public interface abstract q implements MessageLiteOrBuilder	// class@0023c9
{

    StentorMMU$RtSpeechRecognitionResponse getAsrResponse();
    String getBizId();
    ByteString getBizIdBytes();
    StentorMMU$BizType getBizType();
    int getBizTypeValue();
    StentorMMU$RtNLUResponse getNluResponse();
    String getReqId();
    ByteString getReqIdBytes();
    StentorMMU$RtTextToSpeechResponse getTtsResponse();
    boolean hasAsrResponse();
    boolean hasNluResponse();
    boolean hasTtsResponse();
}
