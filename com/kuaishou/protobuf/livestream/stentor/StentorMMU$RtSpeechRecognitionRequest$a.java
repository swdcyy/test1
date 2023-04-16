package com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtSpeechRecognitionRequest$a;
import hr4.i;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtSpeechRecognitionRequest;
import com.google.protobuf.GeneratedMessageLite;
import hr4.a;
import com.google.protobuf.ByteString;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$ClientRequestInfo;
import java.lang.String;
import java.util.List;
import java.util.Collections;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$LyricsInfo;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtSpeechRecognitionType;

public final class StentorMMU$RtSpeechRecognitionRequest$a extends GeneratedMessageLite$Builder implements i	// class@000da1
{

    public void StentorMMU$RtSpeechRecognitionRequest$a(){
       super(StentorMMU$RtSpeechRecognitionRequest.DEFAULT_INSTANCE);
    }
    public void StentorMMU$RtSpeechRecognitionRequest$a(a p0){
       super(StentorMMU$RtSpeechRecognitionRequest.DEFAULT_INSTANCE);
    }
    public ByteString getAudioData(){
       return this.instance.getAudioData();
    }
    public int getChannel(){
       return this.instance.getChannel();
    }
    public StentorMMU$ClientRequestInfo getClientInfo(){
       return this.instance.getClientInfo();
    }
    public boolean getDetectEndPoint(){
       return this.instance.getDetectEndPoint();
    }
    public int getDisableDigit(){
       return this.instance.getDisableDigit();
    }
    public int getDisablePunctuation(){
       return this.instance.getDisablePunctuation();
    }
    public String getFormat(){
       return this.instance.getFormat();
    }
    public ByteString getFormatBytes(){
       return this.instance.getFormatBytes();
    }
    public String getHotWord(int p0){
       return this.instance.getHotWord(p0);
    }
    public ByteString getHotWordBytes(int p0){
       return this.instance.getHotWordBytes(p0);
    }
    public int getHotWordCount(){
       return this.instance.getHotWordCount();
    }
    public List getHotWordList(){
       return Collections.unmodifiableList(this.instance.getHotWordList());
    }
    public String getLiveId(){
       return this.instance.getLiveId();
    }
    public ByteString getLiveIdBytes(){
       return this.instance.getLiveIdBytes();
    }
    public StentorMMU$LyricsInfo getLyricsInfo(){
       return this.instance.getLyricsInfo();
    }
    public String getModel(){
       return this.instance.getModel();
    }
    public ByteString getModelBytes(){
       return this.instance.getModelBytes();
    }
    public String getReqId(){
       return this.instance.getReqId();
    }
    public ByteString getReqIdBytes(){
       return this.instance.getReqIdBytes();
    }
    public boolean getReturnRecognitionResult(){
       return this.instance.getReturnRecognitionResult();
    }
    public int getSampleRate(){
       return this.instance.getSampleRate();
    }
    public long getSerialNo(){
       return this.instance.getSerialNo();
    }
    public int getTimePerPackage(){
       return this.instance.getTimePerPackage();
    }
    public StentorMMU$RtSpeechRecognitionType getType(){
       return this.instance.getType();
    }
    public int getTypeValue(){
       return this.instance.getTypeValue();
    }
    public boolean getUseStreamAsr(){
       return this.instance.getUseStreamAsr();
    }
    public String getUserId(){
       return this.instance.getUserId();
    }
    public ByteString getUserIdBytes(){
       return this.instance.getUserIdBytes();
    }
    public boolean hasClientInfo(){
       return this.instance.hasClientInfo();
    }
    public boolean hasLyricsInfo(){
       return this.instance.hasLyricsInfo();
    }
}
