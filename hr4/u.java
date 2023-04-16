package hr4.u;
import com.google.protobuf.MessageLiteOrBuilder;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.kuaishou.protobuf.livestream.stentor.StreamSoundHound$RtMusicStatus;
import com.kuaishou.mmu.common.Result$ResultCode;

public interface abstract u implements MessageLiteOrBuilder	// class@0023cd
{

    String getDebugInfo();
    ByteString getDebugInfoBytes();
    String getReqId();
    ByteString getReqIdBytes();
    StreamSoundHound$RtMusicStatus getRtMusicStatus();
    int getRtMusicStatusValue();
    long getSerialNo();
    Result$ResultCode getStatus();
    int getStatusValue();
}
