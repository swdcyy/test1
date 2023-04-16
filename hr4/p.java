package hr4.p;
import com.google.protobuf.MessageLiteOrBuilder;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtSpeechRecognitionRequest;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$BizType;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RobotReqType;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtTextToSpeechRequest;

public interface abstract p implements MessageLiteOrBuilder	// class@0023c8
{

    StentorMMU$RtSpeechRecognitionRequest getAsrRequest();
    String getBizId();
    ByteString getBizIdBytes();
    StentorMMU$BizType getBizType();
    int getBizTypeValue();
    String getRecognitionResult();
    ByteString getRecognitionResultBytes();
    String getReqId();
    ByteString getReqIdBytes();
    StentorMMU$RobotReqType getReqType();
    int getReqTypeValue();
    StentorMMU$RtTextToSpeechRequest getTtsRequest();
    boolean hasAsrRequest();
    boolean hasTtsRequest();
}
