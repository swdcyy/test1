package com.kuaishou.live.preview.item.useraction.LivePreviewRecoEnterActionPresenter$b;
import z1.k;
import com.kuaishou.live.preview.item.useraction.LivePreviewRecoEnterActionPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import k2b.e0;
import kotlin.jvm.internal.a;

public final class LivePreviewRecoEnterActionPresenter$b implements k	// class@000e4b
{
    public final LivePreviewRecoEnterActionPresenter b;

    public void LivePreviewRecoEnterActionPresenter$b(LivePreviewRecoEnterActionPresenter p0){
       this.b = p0;
       super();
    }
    public Object get(){
       LivePreviewRecoEnterActionPresenter livePreviewR = PatchProxy.apply(null, this, LivePreviewRecoEnterActionPresenter$b.class, "1");
       if (livePreviewR != PatchProxyResult.class) {
       }else {
          livePreviewR = this.b.y;
          if (livePreviewR == null) {
             a.S("fragment");
          }
       }
       return livePreviewR;
    }
}
