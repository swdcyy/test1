package com.yxcorp.gifshow.camera.record.music.reco.BaseRecoCollectMusicController$c;
import java.lang.Runnable;
import com.yxcorp.gifshow.camera.record.music.reco.BaseRecoCollectMusicController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.android.model.music.Music;

public final class BaseRecoCollectMusicController$c implements Runnable	// class@000e8e
{
    public final BaseRecoCollectMusicController b;

    public void BaseRecoCollectMusicController$c(BaseRecoCollectMusicController p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, BaseRecoCollectMusicController$c.class, "1")) {
          return;
       }
       BaseRecoCollectMusicController$c tb = this.b;
       tb.u = false;
       BaseRecoCollectMusicController v = tb.v;
       a.m(v);
       tb.s2(v);
       return;
    }
}
