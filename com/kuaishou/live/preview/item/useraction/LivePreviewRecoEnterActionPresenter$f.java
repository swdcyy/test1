package com.kuaishou.live.preview.item.useraction.LivePreviewRecoEnterActionPresenter$f;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlay$a;
import com.kuaishou.live.preview.item.useraction.LivePreviewRecoEnterActionPresenter;
import java.lang.Object;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlay$LiveAutoPlayerState;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kl3.b;
import java.lang.Enum;
import java.lang.StringBuilder;
import y12.b;

public final class LivePreviewRecoEnterActionPresenter$f implements LiveAutoPlay$a	// class@000e50
{
    public final LivePreviewRecoEnterActionPresenter a;

    public void LivePreviewRecoEnterActionPresenter$f(LivePreviewRecoEnterActionPresenter p0){
       this.a = p0;
       super();
    }
    public final void a(LiveAutoPlay$LiveAutoPlayerState p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePreviewRecoEnterActionPresenter$f.class, "1")) {
          return;
       }
       a.p(p0, "it");
       int i = b.a[p0.ordinal()];
       if (i != 1) {
          if (i == 2 || (i == 3 || i == 4)) {
             this.a.D.a("receive state:"+p0.name());
          }
       }else if(this.a.X8()){
          this.a.D.d("receive state:"+p0.name());
       }
       return;
    }
}
