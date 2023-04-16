package hr4.t;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.ByteString;
import java.lang.String;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtSpeechRecognitionType;

public interface abstract t implements MessageLiteOrBuilder	// class@0023cc
{

    ByteString getAudioData();
    int getChannel();
    String getFormat();
    ByteString getFormatBytes();
    String getModel();
    ByteString getModelBytes();
    String getReqId();
    ByteString getReqIdBytes();
    int getSampleRate();
    long getSerialNo();
    StentorMMU$RtSpeechRecognitionType getType();
    int getTypeValue();
    String getUserId();
    ByteString getUserIdBytes();
}
