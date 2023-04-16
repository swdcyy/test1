package com.yxcorp.gifshow.camera.record.music.reco.RecoCollectMusicControllerV1$d;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.camera.record.music.reco.RecoCollectMusicControllerV1;
import com.kuaishou.android.model.music.Music;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import j8c.a;
import q87.c;
import com.yxcorp.gifshow.camera.record.music.reco.BaseRecoCollectMusicController;
import com.yxcorp.gifshow.camera.record.base.d;
import vf9.s;
import android.content.Intent;
import com.yxcorp.gifshow.camera.record.base.b;
import ag9.g;

public final class RecoCollectMusicControllerV1$d implements View$OnClickListener	// class@000e98
{
    public final RecoCollectMusicControllerV1 b;
    public final Music c;

    public void RecoCollectMusicControllerV1$d(RecoCollectMusicControllerV1 p0,Music p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, RecoCollectMusicControllerV1$d.class, "1")) {
          return;
       }
       RecoCollectMusicControllerV1$d tb = this.b;
       RecoCollectMusicControllerV1$d tc = this.c;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidOneRefs(tc, tb, RecoCollectMusicControllerV1.class, "8")) {
          tb.t2();
          Object[] objArray = new Object[0];
          a.D().w("RecoCollectMusicController", "cancel music apply", objArray);
          tb.n2(tc);
          s os = new s(null, false, false, false, false);
          tb.d.m(v8);
          if (tb.k2() == 3) {
             g.a.a();
          }
       }
       PatchProxy.onMethodExit(RecoCollectMusicControllerV1$d.class, "1");
       return;
    }
}
