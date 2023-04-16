package com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftTagView;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveClipBoundTextView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.gift.data.giftbox.UIMarkLabel;
import android.widget.ImageView;
import android.widget.TextView;
import rm1.c;
import com.kuaishou.live.common.core.component.gift.data.giftbox.UIDynamicTextLabel;
import com.kuaishou.live.common.core.component.gift.data.giftbox.UIBackground;
import rm1.c$a;
import com.kuaishou.live.common.core.component.gift.data.giftbox.UIImageLabel;
import com.kuaishou.live.common.core.component.gift.data.giftbox.UIImage;
import java.util.List;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import com.yxcorp.image.callercontext.ImageSource;
import zi1.k;
import ub.b;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.text.TextPaint;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import androidx.appcompat.widget.AppCompatTextView;
import java.lang.Boolean;

public final class LiveGiftTagView extends FrameLayout	// class@00122a
{
    public KwaiImageView b;
    public LiveClipBoundTextView c;
    public UIMarkLabel d;
    public UIMarkLabel e;
    public HashMap f;

    public void LiveGiftTagView(Context p0){
       super(p0, null);
    }
    public void LiveGiftTagView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
       LayoutInflater.from(p0).inflate(R.layout.arg_RES_7f0d0b38, this);
       View view = this.findViewById(R.id.v_image_tag);
       a.o(view, "findViewById\(R.id.v_image_tag\)");
       this.b = view;
       view = this.findViewById(R.id.tv_dynamic_tag);
       a.o(view, "findViewById\(R.id.tv_dynamic_tag\)");
       this.c = view;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, LiveGiftTagView.class, "6")) {
          return;
       }
       LiveGiftTagView te = this.e;
       if (te != null) {
          this.setDynamicText(te.b());
       }
       return;
    }
    public final void b(){
       c$a a;
       String str;
       if (PatchProxy.applyVoid(null, this, LiveGiftTagView.class, "4")) {
          return;
       }
       LiveGiftTagView te = this.e;
       if (te == null) {
          te = this.d;
       }
       int i = 8;
       if (te == null || this.isSelected()) {
          this.b.setVisibility(i);
          this.c.setVisibility(i);
          return;
       }else {
          int i1 = 0;
          if (te.g()) {
             this.b.setVisibility(i);
             this.c.setVisibility(i1);
             LiveGiftTagView tc = this.c;
             a = c.a;
             LiveGiftTagView te1 = this.e;
             if (te1 != null) {
                UIDynamicTextLabel uIDynamicTex = te1.c();
                if (uIDynamicTex != null) {
                   uIDynamicTex = uIDynamicTex.background;
                   if (uIDynamicTex != null) {
                      str = uIDynamicTex.a();
                      if (str != null) {
                      label_004b :
                         tc.setBackgroundColor(a.a(str));
                         this.setDynamicText(te.b());
                      }
                   }
                }
             }
             str = "";
             goto label_004b ;
          }else {
             this.c.setVisibility(i);
             te = this.b;
             if (!PatchProxy.applyVoidOneRefs(te, this, LiveGiftTagView.class, "8")) {
                LiveGiftTagView td = this.d;
                if (td != null) {
                   UIImageLabel uIImageLabel = td.d();
                   if (uIImageLabel != null) {
                      UIImage uIImage = uIImageLabel.a();
                      if (uIImage != null) {
                         List list = uIImage.a();
                         if (list != null && !PatchProxy.applyVoidTwoRefs(te, list, this, LiveGiftTagView.class, "9")) {
                            if (q.f(list)) {
                               te.setVisibility(i);
                            }else {
                               te.setVisibility(i1);
                               if (a.g(list.get(i1).getUrl(), te.getTag()) ^ 0x01) {
                                  i = list.size();
                                  CDNUrl[] uCDNUrlArray = new CDNUrl[i];
                                  for (int i2 = 0; i2 < i; i2 = i2 + 1) {
                                     uCDNUrlArray[i2] = list.get(i2);
                                  }
                                  a$a uoa = a.d();
                                  uoa.b(":ks-features:ft-live:live-features:live-gift");
                                  uoa.d(ImageSource.ICON);
                                  a uoa1 = uoa.a();
                                  a.o(uoa1, "KwaiImageCallerContext.n¡­.ICON\)\n          .build\(\)");
                                  te.Y(uCDNUrlArray, uoa1, new k(te));
                                  te.setTag(list.get(i1).getUrl());
                               }
                            }
                         }
                      }
                   }
                }
             }
          }
          return;
       }
    }
    public final UIMarkLabel getDynamicData(){
       return this.e;
    }
    public final LiveClipBoundTextView getDynamicView(){
       return this.c;
    }
    public final UIMarkLabel getImageData(){
       return this.d;
    }
    public final KwaiImageView getImageView(){
       return this.b;
    }
    public final TextPaint getTextPaint(){
       TextPaint obj = PatchProxy.apply(null, this, LiveGiftTagView.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c.getPaint();
       a.o(obj, "dynamicView.paint");
       return obj;
    }
    public final void setDynamicData(UIMarkLabel p0){
       this.e = p0;
    }
    public final void setDynamicText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftTagView.class, "5")) {
          return;
       }
       a.p(p0, "text");
       this.c.setText(p0);
       this.c.setTextAlpha(0x3f800000);
       this.c.setClipWidth((float)(int)(this.getTextPaint().measureText(this.c.getText().toString()) + (float)(this.c.getPaddingLeft() + this.c.getPaddingRight())));
       return;
    }
    public final void setDynamicView(LiveClipBoundTextView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftTagView.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.c = p0;
       return;
    }
    public final void setImageData(UIMarkLabel p0){
       this.d = p0;
    }
    public final void setImageView(KwaiImageView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftTagView.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.b = p0;
       return;
    }
    public void setSelected(boolean p0){
       if (PatchProxy.isSupport(LiveGiftTagView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveGiftTagView.class, "7")) {
          return;
       }
       super.setSelected(p0);
       this.b();
       return;
    }
}
