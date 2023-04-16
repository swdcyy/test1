package com.kuaishou.protobuf.livestream.stentor.StreamSoundHound$RtSoundHoundRequest$a;
import hr4.t;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.protobuf.livestream.stentor.StreamSoundHound$RtSoundHoundRequest;
import com.google.protobuf.GeneratedMessageLite;
import hr4.s;
import com.google.protobuf.ByteString;
import java.lang.String;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtSpeechRecognitionType;

public final class StreamSoundHound$RtSoundHoundRequest$a extends GeneratedMessageLite$Builder implements t	// class@000dcd
{

    public void StreamSoundHound$RtSoundHoundRequest$a(){
       super(StreamSoundHound$RtSoundHoundRequest.DEFAULT_INSTANCE);
    }
    public void StreamSoundHound$RtSoundHoundRequest$a(s p0){
       super(StreamSoundHound$RtSoundHoundRequest.DEFAULT_INSTANCE);
    }
    public ByteString getAudioData(){
       return this.instance.getAudioData();
    }
    public int getChannel(){
       return this.instance.getChannel();
    }
    public String getFormat(){
       return this.instance.getFormat();
    }
    public ByteString getFormatBytes(){
       return this.instance.getFormatBytes();
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
    public int getSampleRate(){
       return this.instance.getSampleRate();
    }
    public long getSerialNo(){
       return this.instance.getSerialNo();
    }
    public StentorMMU$RtSpeechRecognitionType getType(){
       return this.instance.getType();
    }
    public int getTypeValue(){
       return this.instance.getTypeValue();
    }
    public String getUserId(){
       return this.instance.getUserId();
    }
    public ByteString getUserIdBytes(){
       return this.instance.getUserIdBytes();
    }
}
