package com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtTextToSpeechRequest$a;
import hr4.l;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtTextToSpeechRequest;
import com.google.protobuf.GeneratedMessageLite;
import hr4.a;
import java.lang.String;
import com.google.protobuf.ByteString;

public final class StentorMMU$RtTextToSpeechRequest$a extends GeneratedMessageLite$Builder implements l	// class@000dad
{

    public void StentorMMU$RtTextToSpeechRequest$a(){
       super(StentorMMU$RtTextToSpeechRequest.DEFAULT_INSTANCE);
    }
    public void StentorMMU$RtTextToSpeechRequest$a(a p0){
       super(StentorMMU$RtTextToSpeechRequest.DEFAULT_INSTANCE);
    }
    public String getReqId(){
       return this.instance.getReqId();
    }
    public ByteString getReqIdBytes(){
       return this.instance.getReqIdBytes();
    }
    public long getSerialNo(){
       return this.instance.getSerialNo();
    }
    public String getSpeechText(){
       return this.instance.getSpeechText();
    }
    public ByteString getSpeechTextBytes(){
       return this.instance.getSpeechTextBytes();
    }
}
