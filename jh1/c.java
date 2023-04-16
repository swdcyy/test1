package jh1.c;
import jh1.a;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import android.content.Context;
import android.app.Activity;
import p91.m;
import ug1.u;
import s51.c;
import lh1.a;
import com.yxcorp.gifshow.models.Gift;
import java.lang.Object;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.gift.detailhint.widget.LiveGiftDetailHintView;
import ekd.j;
import va1.l0;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable$Orientation;
import java.lang.CharSequence;
import android.widget.TextView;
import java.util.Collection;
import ekd.q;
import android.widget.ImageView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import jh1.b;
import nh1.b;

public class c extends a	// class@002ba7
{
    public Context b;
    public Activity c;
    public m d;
    public u e;
    public final c f;
    public a g;
    public Gift h;
    public static final List i;

    static {
       c.i = LiveLogTag.GIFT.appendTag("LiveGiftDetailHintItem");
    }
    public void c(Context p0,Activity p1,m p2,u p3,c p4,a p5,Gift p6){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
    }
    public Object a(){
       return this.g;
    }
    public View b(){
       float h;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveGiftDetailHintView liveGiftDeta = PatchProxy.apply(null, this, c.class, "1");
       if (liveGiftDeta != patchProxyRe) {
       }else {
          liveGiftDeta = new LiveGiftDetailHintView(this.b);
          c tg = this.g;
          if (!PatchProxy.applyVoidOneRefs(tg, liveGiftDeta, LiveGiftDetailHintView.class, "4") && tg != null) {
             liveGiftDeta.G = tg;
             a k = tg.k;
             int i = 2;
             if (j.g(k) || k.length < i) {
                String[] stringArray = new String[]{"#CC19191E","#0019191E"};
                k = l0.k(stringArray);
             }
             LiveGiftDetailHintView b = liveGiftDeta.B;
             GradientDrawable gradientDraw = PatchProxy.applyOneRefs(k, liveGiftDeta, LiveGiftDetailHintView.class, "5");
             if (gradientDraw != patchProxyRe) {
             }else {
                gradientDraw = new GradientDrawable(GradientDrawable$Orientation.LEFT_RIGHT, k);
                gradientDraw.setShape(0);
                float[] uofloatArray = new float[]{h,h,h,h,h,h,h,h};
                h = LiveGiftDetailHintView.H;
                gradientDraw.setCornerRadii(uofloatArray);
             }
             b.setBackgroundDrawable(gradientDraw);
             liveGiftDeta.C.setText(liveGiftDeta.G.b);
             liveGiftDeta.D.setText(liveGiftDeta.G.i);
             if (q.f(liveGiftDeta.G.c)) {
                liveGiftDeta.E.setVisibility(8);
             }else {
                liveGiftDeta.E.P(liveGiftDeta.G.c);
                liveGiftDeta.E.setVisibility(0);
             }
          }
          liveGiftDeta.setHintViewListener(new b(this));
       }
       return liveGiftDeta;
    }
}
