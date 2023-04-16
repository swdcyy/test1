package com.kwai.slide.play.detail.rightactionbar.follow.element.b;
import androidx.lifecycle.Observer;
import com.kwai.slide.play.detail.rightactionbar.follow.element.f;
import java.lang.Object;
import os7.a$a;
import java.util.Objects;
import os7.a$c;
import java.lang.String;
import com.yxcorp.gifshow.widget.AvatarWithPendantView;
import ekd.j;
import com.facebook.imagepipeline.request.ImageRequest;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.widget.ImageView;
import ub.b;
import pb.d;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import com.yxcorp.image.callercontext.ImageSource;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.controller.AbstractDraweeController;
import ac.a;
import android.view.View;
import ns7.m;
import android.view.View$OnClickListener;
import ns7.v;
import android.view.View$OnLongClickListener;
import ns7.w;
import android.view.View$OnTouchListener;

public final class b implements Observer	// class@001854
{
    public final f b;

    public void b(f p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       a$a c = p0.c;
       a$a d = p0.d;
       f n = tb.n;
       if (n != null) {
          if (c != null) {
             n.s(c.a, c.b, c.c);
          }else if(!j.h(d)){
             tb.n.setStaticPendantRequest(d);
          }else {
             tb.n.r();
             tb.A(true, true);
          }
       }
       tb.m.setPlaceHolderImage(p0.b);
       tb.m.setScaleX(0x3f800000);
       tb.m.setScaleY(0x3f800000);
       b uob = null;
       p0 = tb.m.g0(uob, uob, p0.a);
       if (p0 != null) {
          c = a.d();
          c.b(":ks-components:slide-play-detail-framework");
          c.d(ImageSource.FEED_AVATAR);
          p0.r(c.a());
       }
       f m = tb.m;
       if (p0 != null) {
          uob = p0.e();
       }
       m.setController(uob);
       tb.v().setOnClickListener(new m(tb));
       tb.v().setOnLongClickListener(new v(tb));
       tb.v().setOnTouchListener(new w(tb));
       return;
    }
}
