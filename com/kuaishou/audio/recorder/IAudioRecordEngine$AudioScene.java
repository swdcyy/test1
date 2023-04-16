package com.kuaishou.audio.recorder.IAudioRecordEngine$AudioScene;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class IAudioRecordEngine$AudioScene extends Enum	// class@000fa8
{
    public final int mArya5Scene;
    public static final IAudioRecordEngine$AudioScene[] $VALUES;
    public static final IAudioRecordEngine$AudioScene RecordAndPlay;
    public static final IAudioRecordEngine$AudioScene RecordOnly;

    static {
       IAudioRecordEngine$AudioScene uAudioScene = new IAudioRecordEngine$AudioScene("RecordOnly", 0, 1);
       IAudioRecordEngine$AudioScene.RecordOnly = uAudioScene;
       IAudioRecordEngine$AudioScene uAudioScene1 = new IAudioRecordEngine$AudioScene("RecordAndPlay", 1, 0);
       IAudioRecordEngine$AudioScene.RecordAndPlay = uAudioScene1;
       IAudioRecordEngine$AudioScene[] uAudioSceneA = new IAudioRecordEngine$AudioScene[]{uAudioScene,uAudioScene1};
       IAudioRecordEngine$AudioScene.$VALUES = uAudioSceneA;
    }
    public void IAudioRecordEngine$AudioScene(String p0,int p1,int p2){
       super(p0, p1);
       this.mArya5Scene = p2;
    }
    public static IAudioRecordEngine$AudioScene valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, IAudioRecordEngine$AudioScene.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(IAudioRecordEngine$AudioScene.class, p0);
    }
    public static IAudioRecordEngine$AudioScene[] values(){
       Object obj = PatchProxy.apply(null, null, IAudioRecordEngine$AudioScene.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return IAudioRecordEngine$AudioScene.$VALUES.clone();
    }
}
