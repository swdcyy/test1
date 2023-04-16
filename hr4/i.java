package hr4.i;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.ByteString;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$ClientRequestInfo;
import java.lang.String;
import java.util.List;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$LyricsInfo;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtSpeechRecognitionType;

public interface abstract i implements MessageLiteOrBuilder	// class@0023c1
{

    ByteString getAudioData();
    int getChannel();
    StentorMMU$ClientRequestInfo getClientInfo();
    boolean getDetectEndPoint();
    int getDisableDigit();
    int getDisablePunctuation();
    String getFormat();
    ByteString getFormatBytes();
    String getHotWord(int p0);
    ByteString getHotWordBytes(int p0);
    int getHotWordCount();
    List getHotWordList();
    String getLiveId();
    ByteString getLiveIdBytes();
    StentorMMU$LyricsInfo getLyricsInfo();
    String getModel();
    ByteString getModelBytes();
    String getReqId();
    ByteString getReqIdBytes();
    boolean getReturnRecognitionResult();
    int getSampleRate();
    long getSerialNo();
    int getTimePerPackage();
    StentorMMU$RtSpeechRecognitionType getType();
    int getTypeValue();
    boolean getUseStreamAsr();
    String getUserId();
    ByteString getUserIdBytes();
    boolean hasClientInfo();
    boolean hasLyricsInfo();
}
