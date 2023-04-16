package hr4.j;
import com.google.protobuf.MessageLiteOrBuilder;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.kuaishou.protobuf.kfs.feature.Feature;
import java.util.List;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtSpeechRecognitionResultDetail;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$WordDetail;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$SpeechRobotInfo;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtAsrStatus;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtSpeechRecognitionResultCode;

public interface abstract j implements MessageLiteOrBuilder	// class@0023c2
{

    String getDebugInfo();
    ByteString getDebugInfoBytes();
    String getDynamicResult();
    ByteString getDynamicResultBytes();
    Feature getExtraInfo(int p0);
    int getExtraInfoCount();
    List getExtraInfoList();
    long getMissSerialNo(int p0);
    int getMissSerialNoCount();
    List getMissSerialNoList();
    String getNewDynamicResult();
    ByteString getNewDynamicResultBytes();
    StentorMMU$RtSpeechRecognitionResultDetail getNewResultDetail(int p0);
    int getNewResultDetailCount();
    List getNewResultDetailList();
    StentorMMU$WordDetail getPhoneResult(int p0);
    int getPhoneResultCount();
    List getPhoneResultList();
    String getRecognitionResult();
    ByteString getRecognitionResultBytes();
    String getReqId();
    ByteString getReqIdBytes();
    StentorMMU$RtSpeechRecognitionResultDetail getResultDetail(int p0);
    int getResultDetailCount();
    List getResultDetailList();
    StentorMMU$SpeechRobotInfo getRobotInfo();
    StentorMMU$RtAsrStatus getRtAsrStatus();
    int getRtAsrStatusValue();
    long getSerialNo();
    StentorMMU$RtSpeechRecognitionResultCode getStatus();
    int getStatusValue();
    boolean hasRobotInfo();
}
