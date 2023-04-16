package com.yxcorp.gifshow.detail.post.bubble.NasaDetailPostBubblePresenter$b;
import an6.f;
import com.yxcorp.gifshow.detail.post.bubble.NasaDetailPostBubblePresenter;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.gifshow.post.api.feature.postentrance.bubble.HomePostBubbleManager;
import an6.o;

public final class NasaDetailPostBubblePresenter$b implements f	// class@0016ab
{
    public final NasaDetailPostBubblePresenter a;

    public void NasaDetailPostBubblePresenter$b(NasaDetailPostBubblePresenter p0){
       this.a = p0;
       super();
    }
    public final boolean onClick(View p0){
       p0 = PatchProxy.applyOneRefs(p0, this, NasaDetailPostBubblePresenter$b.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       o oo = this.a.P8().g();
       boolean b = (oo != null)? oo.d(): false;
       return b;
    }
}
