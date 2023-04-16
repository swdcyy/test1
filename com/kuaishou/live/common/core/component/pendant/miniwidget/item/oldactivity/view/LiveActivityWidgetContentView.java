package com.kuaishou.live.common.core.component.pendant.miniwidget.item.oldactivity.view.LiveActivityWidgetContentView;
import android.widget.RelativeLayout;
import android.content.Context;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.view.ViewStub;
import uv1.a;
import android.view.View$OnClickListener;
import com.kuaishou.live.common.core.component.pendant.miniwidget.item.oldactivity.view.LiveActivityWidgetLineView;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import p91.m;
import android.widget.LinearLayout$LayoutParams;
import lnc.a1;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout;
import com.kuaishou.livestream.message.nano.LiveActivityWidgetProto$SCActivityWidgetUpdated;
import com.kuaishou.livestream.message.nano.LiveActivityWidgetProto$LiveActivityWidgetBase;
import com.kuaishou.livestream.message.nano.LiveActivityWidgetProto$LiveActivityWidgetMessage;
import com.facebook.drawee.generic.RoundingParams;
import android.graphics.Color;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.widget.ImageView;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;
import uv1.b;
import ub.b;
import com.kuaishou.live.common.core.component.pendant.miniwidget.item.oldactivity.view.LiveActivityWidgetContentView$a;

public class LiveActivityWidgetContentView extends RelativeLayout	// class@0016f9
{
    public m b;
    public KwaiImageView c;
    public ViewStub d;
    public ViewGroup e;
    public boolean f;
    public int g;
    public LiveActivityWidgetContentView$a h;
    public LiveActivityWidgetProto$SCActivityWidgetUpdated i;
    public static final int j;

    public void LiveActivityWidgetContentView(Context p0){
       super(p0);
       this.f = false;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveActivityWidgetContentView.class, "2")) {
       }else {
          this.c = this.findViewById(0x7f0a187a);
          this.d = this.findViewById(0x7f0a1879);
          a.c(p0, R.layout.arg_RES_7f0d09bf, this).setOnClickListener(new a(this));
       }
       return;
    }
    public final LiveActivityWidgetLineView a(int p0){
       LiveActivityWidgetLineView obj;
       if (PatchProxy.isSupport(LiveActivityWidgetContentView.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, LiveActivityWidgetContentView.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new LiveActivityWidgetLineView(this.getContext());
       obj.setLiveBasicContext(this.b);
       LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(-1, a1.e(14.00f));
       layoutParams.topMargin = a1.e((float)p0);
       obj.setLayoutParams(layoutParams);
       return obj;
    }
    public void b(LiveActivityWidgetProto$SCActivityWidgetUpdated p0){
       LiveActivityWidgetContentView tg;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveActivityWidgetContentView.class, "1")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.i = p0;
       Object[] objArray = null;
       String str = 1;
       if (!PatchProxy.applyVoid(objArray, this, LiveActivityWidgetContentView.class, "4") && this.f == null) {
          tg = this.i;
          if (tg != null) {
             tg = tg.base;
             if (tg != null) {
                this.f = str;
                if (tg.type != str) {
                   tg = this.d;
                   if (tg != null && this.e == null) {
                      this.e = tg.inflate();
                   }
                }
             }
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, LiveActivityWidgetContentView.class, "7")) {
          p0 = this.i.message;
          if (p0 != null) {
             LiveActivityWidgetProto$LiveActivityWidgetMessage template = p0.template;
             if (this.g != template) {
                this.g = template;
                this.e.removeAllViews();
                int i = 2;
                if (this.i.base.type == i) {
                   tg = this.g;
                   if (tg != i) {
                      if (tg != 4) {
                         if (tg == 5) {
                            tg = this.e;
                            KwaiImageView kwaiImageVie = PatchProxy.apply(objArray, this, LiveActivityWidgetContentView.class, "5");
                            if (kwaiImageVie != PatchProxyResult.class) {
                            }else {
                               kwaiImageVie = new KwaiImageView(this.getContext());
                               RoundingParams roundingPara = new RoundingParams();
                               roundingPara.j(Color.parseColor("#4DE6E6E6"), (float)a1.e(0x3f800000));
                               roundingPara.q(str);
                               a hierarchy = kwaiImageVie.getHierarchy();
                               hierarchy.L(roundingPara);
                               kwaiImageVie.setHierarchy(hierarchy);
                               kwaiImageVie.setPlaceHolderImage(a1.f(R.drawable.arg_RES_7f0810a2));
                               LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(a1.e(28.00f), a1.e(28.00f));
                               layoutParams.gravity = str;
                               layoutParams.topMargin = a1.e(25.00f);
                               kwaiImageVie.setLayoutParams(layoutParams);
                            }
                            tg.addView(kwaiImageVie);
                            this.e.addView(this.a(str));
                         }
                      }else {
                         this.e.addView(this.a(34));
                         this.e.addView(this.a(i));
                      }
                   }else {
                      this.e.addView(this.a(25));
                      this.e.addView(this.a(0));
                      this.e.addView(this.a(0));
                   }
                }
             }
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, LiveActivityWidgetContentView.class, "3")) {
          p0 = this.i.message;
          if (p0 != null) {
             this.c.a0(e0.i(p0.backgroundPic), new b(this));
          }
       }
       return;
    }
    public void setContentViewClickListener(LiveActivityWidgetContentView$a p0){
       this.h = p0;
    }
    public void setLiveBasicContext(m p0){
       this.b = p0;
    }
}
