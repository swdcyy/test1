package com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtSpeechRecognitionResultDetail$a;
import hr4.k;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtSpeechRecognitionResultDetail;
import com.google.protobuf.GeneratedMessageLite;
import hr4.a;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$WordDetail;
import java.util.List;
import java.util.Collections;

public final class StentorMMU$RtSpeechRecognitionResultDetail$a extends GeneratedMessageLite$Builder implements k	// class@000da8
{

    public void StentorMMU$RtSpeechRecognitionResultDetail$a(){
       super(StentorMMU$RtSpeechRecognitionResultDetail.DEFAULT_INSTANCE);
    }
    public void StentorMMU$RtSpeechRecognitionResultDetail$a(a p0){
       super(StentorMMU$RtSpeechRecognitionResultDetail.DEFAULT_INSTANCE);
    }
    public float getEndTime(){
       return this.instance.getEndTime();
    }
    public String getFixedResult(){
       return this.instance.getFixedResult();
    }
    public ByteString getFixedResultBytes(){
       return this.instance.getFixedResultBytes();
    }
    public float getStartTime(){
       return this.instance.getStartTime();
    }
    public StentorMMU$WordDetail getWords(int p0){
       return this.instance.getWords(p0);
    }
    public int getWordsCount(){
       return this.instance.getWordsCount();
    }
    public List getWordsList(){
       return Collections.unmodifiableList(this.instance.getWordsList());
    }
}
