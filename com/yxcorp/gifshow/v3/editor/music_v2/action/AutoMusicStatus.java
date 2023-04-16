package com.yxcorp.gifshow.v3.editor.music_v2.action.AutoMusicStatus;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class AutoMusicStatus extends Enum	// class@001061
{
    public static final AutoMusicStatus[] $VALUES;
    public static final AutoMusicStatus FAILED;
    public static final AutoMusicStatus FINISH;
    public static final AutoMusicStatus IDLE;
    public static final AutoMusicStatus LOADING;

    static {
       AutoMusicStatus uAutoMusicSt1;
       AutoMusicStatus[] uAutoMusicSt = new AutoMusicStatus[]{uAutoMusicSt1,uAutoMusicSt1,uAutoMusicSt1,uAutoMusicSt1};
       uAutoMusicSt1 = new AutoMusicStatus("IDLE", 0);
       AutoMusicStatus.IDLE = uAutoMusicSt1;
       uAutoMusicSt1 = new AutoMusicStatus("LOADING", 1);
       AutoMusicStatus.LOADING = uAutoMusicSt1;
       uAutoMusicSt1 = new AutoMusicStatus("FINISH", 2);
       AutoMusicStatus.FINISH = uAutoMusicSt1;
       uAutoMusicSt1 = new AutoMusicStatus("FAILED", 3);
       AutoMusicStatus.FAILED = uAutoMusicSt1;
       AutoMusicStatus.$VALUES = uAutoMusicSt;
    }
    public void AutoMusicStatus(String p0,int p1){
       super(p0, p1);
    }
    public static AutoMusicStatus valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, AutoMusicStatus.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(AutoMusicStatus.class, p0);
    }
    public static AutoMusicStatus[] values(){
       Object obj = PatchProxy.apply(null, null, AutoMusicStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return AutoMusicStatus.$VALUES.clone();
    }
}
