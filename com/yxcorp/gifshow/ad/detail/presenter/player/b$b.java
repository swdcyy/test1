package com.yxcorp.gifshow.ad.detail.presenter.player.b$b;
import ub.a;
import com.yxcorp.gifshow.ad.detail.presenter.player.b;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import com.yxcorp.image.callercontext.ImageSource;
import com.yxcorp.gifshow.entity.QPhoto;
import jp.a;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kwai.framework.model.feed.BaseFeed;
import ub.b;
import wb5.g;
import android.graphics.drawable.Animatable;
import bd.f;

public class b$b extends a	// class@001671
{
    public final KwaiImageView b;
    public final b c;

    public void b$b(b p0,KwaiImageView p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onFailure(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b$b.class, "3")) {
          return;
       }
       a$a uoa = a.d();
       uoa.b(":ks-features:ft-commercial:commercial");
       uoa.d(ImageSource.DETAIL_COVER_IMAGE);
       b$b tc = this.c;
       g.A(this.b, tc.q.mEntity, a.b, tc.v, uoa.a());
       b u = this.c.u;
       if (u != null) {
          u.onFailure(p0, p1);
       }
       return;
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, b$b.class, "2")) {
       }else {
          b u = this.c.u;
          if (u != null) {
             u.onFinalImageSet(p0, p1, p2);
          }
       }
       return;
    }
    public void onSubmit(String p0,Object p1){
       PatchProxy.applyVoidTwoRefs(p0, p1, this, b$b.class, "1");
    }
}
