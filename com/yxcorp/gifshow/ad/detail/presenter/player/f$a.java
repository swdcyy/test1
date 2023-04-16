package com.yxcorp.gifshow.ad.detail.presenter.player.f$a;
import d6a.a;
import com.yxcorp.gifshow.ad.detail.presenter.player.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.ad.detail.presenter.player.b;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import im8.f;
import java.lang.Boolean;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.entity.QPhoto;

public class f$a extends a	// class@00167c
{
    public final f b;

    public void f$a(f p0){
       this.b = p0;
       super();
    }
    public void B0(){
       if (PatchProxy.applyVoid(null, this, f$a.class, "1")) {
          return;
       }
       f$a tb = this.b;
       if (tb.D == null && (tb.r.enableSlidePlay() && !this.b.p.get().booleanValue())) {
          tb = this.b;
          tb.D = true;
          tb.V8(tb.P8(), this.b.q.getColor(), true);
       }
    label_003e :
       return;
    }
}
