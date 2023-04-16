package com.kuaishou.live.core.show.wishlight.spring.view.LiveBottomBarWishLightGiftView;
import kn2.e;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LifecycleOwner;
import mn2.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.kuaishou.android.live.log.b;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import androidx.lifecycle.LiveData;
import xh3.b;
import android.view.View;
import xh3.l;
import kn2.d;
import androidx.lifecycle.Observer;
import com.kuaishou.live.mvvm.viewmodel.state.LiveEvent;
import kn2.b;
import kn2.c;
import kn2.a;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import i2b.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.live.core.show.wishlight.spring.view.c;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.util.Objects;
import android.animation.AnimatorSet;
import ln2.a;
import java.lang.Boolean;
import java.lang.Integer;
import lnc.a1;
import gn2.c;
import java.lang.StringBuilder;

public class LiveBottomBarWishLightGiftView extends FrameLayout implements e	// class@0012b9
{
    public ViewGroup b;
    public KwaiImageView c;
    public KwaiImageView d;
    public LiveGiftComboAnimationView e;
    public c f;
    public a g;
    public static final int h;

    public void LiveBottomBarWishLightGiftView(Context p0){
       super(p0);
       this.c();
    }
    public void LiveBottomBarWishLightGiftView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.c();
    }
    public void LiveBottomBarWishLightGiftView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.c();
    }
    public void a(AndroidViewModel p0,LifecycleOwner p1){
       this.b(p0, p1);
    }
    public void b(c p0,LifecycleOwner p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveBottomBarWishLightGiftView.class, "7")) {
          return;
       }
       b.P(this.getLogTag(), "bindViewModel");
       b.b(this.c, p1, p0.b);
       LiveBottomBarWishLightGiftView td = this.d;
       if (td != null) {
          b.b(td, p1, p0.c);
       }
       l.c(this.b, p1, p0.d);
       p0.e.observe(p1, new d(this, p0));
       p0.f.observe(p1, new b(this));
       p0.g.observe(p1, new c(this, p0));
       this.setOnClickListener(new a(p0));
       return;
    }
    public final void c(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveBottomBarWishLightGiftView.class, "1")) {
          return;
       }
       this.setClipChildren(false);
       this.setClipToPadding(false);
       a.k(this, R.layout.arg_RES_7f0d0a01, true);
       if (!PatchProxy.applyVoid(objArray, this, LiveBottomBarWishLightGiftView.class, "5")) {
          b.P(this.getLogTag(), "findView");
          this.c = this.findViewById(0x7f0a1ac7);
          this.b = this.findViewById(0x7f0a1ac6);
       }
       this.f = new c(this.c);
       return;
    }
    public View getComboView(){
       return this.e;
    }
    public final List getLogTag(){
       Object obj = PatchProxy.apply(null, this, LiveBottomBarWishLightGiftView.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveLogTag.LIVE_WISH_LIGHT.appendTag("WishLightGiftView");
    }
    public void onDetachedFromWindow(){
       LiveBottomBarWishLightGiftView tg;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveBottomBarWishLightGiftView.class, "9")) {
          return;
       }
       super.onDetachedFromWindow();
       if (!PatchProxy.applyVoid(objArray, this, LiveBottomBarWishLightGiftView.class, "10")) {
          tg = this.f;
          Objects.requireNonNull(tg);
          if (!PatchProxy.applyVoid(objArray, tg, c.class, "6")) {
             tg.c.cancel();
             tg.c.removeAllListeners();
          }
       }
       tg = this.g;
       if (tg != null) {
          tg.b();
       }
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       int i = 2;
       if (PatchProxy.isSupport(LiveBottomBarWishLightGiftView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, LiveBottomBarWishLightGiftView.class, "2")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       if (p0 && !PatchProxy.applyVoid(null, this, LiveBottomBarWishLightGiftView.class, "3")) {
          int[] ointArray = new int[i];
          this.getLocationInWindow(ointArray);
          p1 = ointArray[0] + (this.getWidth() / i);
          int i1 = ointArray[1] + (this.getHeight() / i);
          p2 = p1 - (a1.d(0x7f070a38) / i);
          p3 = i1 - (a1.d(0x7f070a37) / i);
          LiveBottomBarWishLightGiftView te = this.e;
          if (te != null) {
             float f = (float)p2;
             if (te.getTranslationX() - f || this.e.getTranslationY() - (float)p3) {
                this.e.setTranslationX(f);
                this.e.setTranslationY((float)p3);
                b.P(c.U, "centerX = "+p1+" centerY = "+i1+" comboViewX = "+p2+" comboViewY = "+p3);
             }
          }
       }
       return;
    }
}
