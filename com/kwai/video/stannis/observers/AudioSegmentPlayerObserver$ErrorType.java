package com.kwai.video.stannis.observers.AudioSegmentPlayerObserver$ErrorType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class AudioSegmentPlayerObserver$ErrorType extends Enum	// class@000c52
{
    public static final AudioSegmentPlayerObserver$ErrorType[] $VALUES;
    public static final AudioSegmentPlayerObserver$ErrorType ErrorIo;
    public static final AudioSegmentPlayerObserver$ErrorType Malformed;
    public static final AudioSegmentPlayerObserver$ErrorType None;
    public static final AudioSegmentPlayerObserver$ErrorType NotSupported;
    public static final AudioSegmentPlayerObserver$ErrorType StartFailed;
    public static final AudioSegmentPlayerObserver$ErrorType Unknown;

    static {
       AudioSegmentPlayerObserver$ErrorType uErrorType = new AudioSegmentPlayerObserver$ErrorType("None", 0);
       AudioSegmentPlayerObserver$ErrorType.None = uErrorType;
       AudioSegmentPlayerObserver$ErrorType uErrorType1 = new AudioSegmentPlayerObserver$ErrorType("Unknown", 1);
       AudioSegmentPlayerObserver$ErrorType.Unknown = uErrorType1;
       AudioSegmentPlayerObserver$ErrorType uErrorType2 = new AudioSegmentPlayerObserver$ErrorType("NotSupported", 2);
       AudioSegmentPlayerObserver$ErrorType.NotSupported = uErrorType2;
       AudioSegmentPlayerObserver$ErrorType uErrorType3 = new AudioSegmentPlayerObserver$ErrorType("ErrorIo", 3);
       AudioSegmentPlayerObserver$ErrorType.ErrorIo = uErrorType3;
       AudioSegmentPlayerObserver$ErrorType uErrorType4 = new AudioSegmentPlayerObserver$ErrorType("Malformed", 4);
       AudioSegmentPlayerObserver$ErrorType.Malformed = uErrorType4;
       AudioSegmentPlayerObserver$ErrorType uErrorType5 = new AudioSegmentPlayerObserver$ErrorType("StartFailed", 5);
       AudioSegmentPlayerObserver$ErrorType.StartFailed = uErrorType5;
       AudioSegmentPlayerObserver$ErrorType[] uErrorTypeAr = new AudioSegmentPlayerObserver$ErrorType[]{uErrorType,uErrorType1,uErrorType2,uErrorType3,uErrorType4,uErrorType5};
       AudioSegmentPlayerObserver$ErrorType.$VALUES = uErrorTypeAr;
    }
    public void AudioSegmentPlayerObserver$ErrorType(String p0,int p1){
       super(p0, p1);
    }
    public static AudioSegmentPlayerObserver$ErrorType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, AudioSegmentPlayerObserver$ErrorType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(AudioSegmentPlayerObserver$ErrorType.class, p0);
    }
    public static AudioSegmentPlayerObserver$ErrorType[] values(){
       Object obj = PatchProxy.apply(null, null, AudioSegmentPlayerObserver$ErrorType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return AudioSegmentPlayerObserver$ErrorType.$VALUES.clone();
    }
}
