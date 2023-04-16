package com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtSpeechRecognitionResponse$a;
import hr4.j;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtSpeechRecognitionResponse;
import com.google.protobuf.GeneratedMessageLite;
import hr4.a;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.kuaishou.protobuf.kfs.feature.Feature;
import java.util.List;
import java.util.Collections;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtSpeechRecognitionResultDetail;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$WordDetail;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$SpeechRobotInfo;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtAsrStatus;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtSpeechRecognitionResultCode;

public final class StentorMMU$RtSpeechRecognitionResponse$a extends GeneratedMessageLite$Builder implements j	// class@000da3
{

    public void StentorMMU$RtSpeechRecognitionResponse$a(){
       super(StentorMMU$RtSpeechRecognitionResponse.DEFAULT_INSTANCE);
    }
    public void StentorMMU$RtSpeechRecognitionResponse$a(a p0){
       super(StentorMMU$RtSpeechRecognitionResponse.DEFAULT_INSTANCE);
    }
    public String getDebugInfo(){
       return this.instance.getDebugInfo();
    }
    public ByteString getDebugInfoBytes(){
       return this.instance.getDebugInfoBytes();
    }
    public String getDynamicResult(){
       return this.instance.getDynamicResult();
    }
    public ByteString getDynamicResultBytes(){
       return this.instance.getDynamicResultBytes();
    }
    public Feature getExtraInfo(int p0){
       return this.instance.getExtraInfo(p0);
    }
    public int getExtraInfoCount(){
       return this.instance.getExtraInfoCount();
    }
    public List getExtraInfoList(){
       return Collections.unmodifiableList(this.instance.getExtraInfoList());
    }
    public long getMissSerialNo(int p0){
       return this.instance.getMissSerialNo(p0);
    }
    public int getMissSerialNoCount(){
       return this.instance.getMissSerialNoCount();
    }
    public List getMissSerialNoList(){
       return Collections.unmodifiableList(this.instance.getMissSerialNoList());
    }
    public String getNewDynamicResult(){
       return this.instance.getNewDynamicResult();
    }
    public ByteString getNewDynamicResultBytes(){
       return this.instance.getNewDynamicResultBytes();
    }
    public StentorMMU$RtSpeechRecognitionResultDetail getNewResultDetail(int p0){
       return this.instance.getNewResultDetail(p0);
    }
    public int getNewResultDetailCount(){
       return this.instance.getNewResultDetailCount();
    }
    public List getNewResultDetailList(){
       return Collections.unmodifiableList(this.instance.getNewResultDetailList());
    }
    public StentorMMU$WordDetail getPhoneResult(int p0){
       return this.instance.getPhoneResult(p0);
    }
    public int getPhoneResultCount(){
       return this.instance.getPhoneResultCount();
    }
    public List getPhoneResultList(){
       return Collections.unmodifiableList(this.instance.getPhoneResultList());
    }
    public String getRecognitionResult(){
       return this.instance.getRecognitionResult();
    }
    public ByteString getRecognitionResultBytes(){
       return this.instance.getRecognitionResultBytes();
    }
    public String getReqId(){
       return this.instance.getReqId();
    }
    public ByteString getReqIdBytes(){
       return this.instance.getReqIdBytes();
    }
    public StentorMMU$RtSpeechRecognitionResultDetail getResultDetail(int p0){
       return this.instance.getResultDetail(p0);
    }
    public int getResultDetailCount(){
       return this.instance.getResultDetailCount();
    }
    public List getResultDetailList(){
       return Collections.unmodifiableList(this.instance.getResultDetailList());
    }
    public StentorMMU$SpeechRobotInfo getRobotInfo(){
       return this.instance.getRobotInfo();
    }
    public StentorMMU$RtAsrStatus getRtAsrStatus(){
       return this.instance.getRtAsrStatus();
    }
    public int getRtAsrStatusValue(){
       return this.instance.getRtAsrStatusValue();
    }
    public long getSerialNo(){
       return this.instance.getSerialNo();
    }
    public StentorMMU$RtSpeechRecognitionResultCode getStatus(){
       return this.instance.getStatus();
    }
    public int getStatusValue(){
       return this.instance.getStatusValue();
    }
    public boolean hasRobotInfo(){
       return this.instance.hasRobotInfo();
    }
}
