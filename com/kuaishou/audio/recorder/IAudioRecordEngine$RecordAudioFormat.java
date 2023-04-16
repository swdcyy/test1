package com.kuaishou.audio.recorder.IAudioRecordEngine$RecordAudioFormat;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class IAudioRecordEngine$RecordAudioFormat extends Enum	// class@000fa9
{
    public final int mArya5Format;
    public static final IAudioRecordEngine$RecordAudioFormat[] $VALUES;
    public static final IAudioRecordEngine$RecordAudioFormat AAC;
    public static final IAudioRecordEngine$RecordAudioFormat PCM;

    static {
       IAudioRecordEngine$RecordAudioFormat recordAudioF = new IAudioRecordEngine$RecordAudioFormat("PCM", 0, 1);
       IAudioRecordEngine$RecordAudioFormat.PCM = recordAudioF;
       IAudioRecordEngine$RecordAudioFormat recordAudioF1 = new IAudioRecordEngine$RecordAudioFormat("AAC", 1, 0);
       IAudioRecordEngine$RecordAudioFormat.AAC = recordAudioF1;
       IAudioRecordEngine$RecordAudioFormat[] recordAudioF2 = new IAudioRecordEngine$RecordAudioFormat[]{recordAudioF,recordAudioF1};
       IAudioRecordEngine$RecordAudioFormat.$VALUES = recordAudioF2;
    }
    public void IAudioRecordEngine$RecordAudioFormat(String p0,int p1,int p2){
       super(p0, p1);
       this.mArya5Format = p2;
    }
    public static IAudioRecordEngine$RecordAudioFormat valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, IAudioRecordEngine$RecordAudioFormat.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(IAudioRecordEngine$RecordAudioFormat.class, p0);
    }
    public static IAudioRecordEngine$RecordAudioFormat[] values(){
       Object obj = PatchProxy.apply(null, null, IAudioRecordEngine$RecordAudioFormat.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return IAudioRecordEngine$RecordAudioFormat.$VALUES.clone();
    }
}
