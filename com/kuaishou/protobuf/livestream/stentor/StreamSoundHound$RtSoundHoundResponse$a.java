package com.kuaishou.protobuf.livestream.stentor.StreamSoundHound$RtSoundHoundResponse$a;
import hr4.u;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.protobuf.livestream.stentor.StreamSoundHound$RtSoundHoundResponse;
import com.google.protobuf.GeneratedMessageLite;
import hr4.s;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.kuaishou.protobuf.livestream.stentor.StreamSoundHound$RtMusicStatus;
import com.kuaishou.mmu.common.Result$ResultCode;

public final class StreamSoundHound$RtSoundHoundResponse$a extends GeneratedMessageLite$Builder implements u	// class@000dcf
{

    public void StreamSoundHound$RtSoundHoundResponse$a(){
       super(StreamSoundHound$RtSoundHoundResponse.DEFAULT_INSTANCE);
    }
    public void StreamSoundHound$RtSoundHoundResponse$a(s p0){
       super(StreamSoundHound$RtSoundHoundResponse.DEFAULT_INSTANCE);
    }
    public String getDebugInfo(){
       return this.instance.getDebugInfo();
    }
    public ByteString getDebugInfoBytes(){
       return this.instance.getDebugInfoBytes();
    }
    public String getReqId(){
       return this.instance.getReqId();
    }
    public ByteString getReqIdBytes(){
       return this.instance.getReqIdBytes();
    }
    public StreamSoundHound$RtMusicStatus getRtMusicStatus(){
       return this.instance.getRtMusicStatus();
    }
    public int getRtMusicStatusValue(){
       return this.instance.getRtMusicStatusValue();
    }
    public long getSerialNo(){
       return this.instance.getSerialNo();
    }
    public Result$ResultCode getStatus(){
       return this.instance.getStatus();
    }
    public int getStatusValue(){
       return this.instance.getStatusValue();
    }
}
