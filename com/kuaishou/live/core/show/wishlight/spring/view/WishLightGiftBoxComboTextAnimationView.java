package com.kuaishou.live.core.show.wishlight.spring.view.WishLightGiftBoxComboTextAnimationView;
import android.widget.LinearLayout;
import lnc.a1;
import android.content.Context;
import android.util.SparseArray;
import java.util.LinkedList;
import kn2.g;
import android.util.AttributeSet;
import android.graphics.Bitmap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Bitmap$Config;
import com.yxcorp.gifshow.util.BitmapUtil;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import android.widget.ImageView;
import android.view.View;

public class WishLightGiftBoxComboTextAnimationView extends LinearLayout	// class@0012ba
{
    public int b;
    public int c;
    public final SparseArray d;
    public final List e;
    public final List f;
    public LinearLayout g;
    public ImageView h;
    public final Runnable i;
    public static final int j;
    public static final int k;
    public static final int l;
    public static final int m;
    public static final int[] n;

    static {
       WishLightGiftBoxComboTextAnimationView.j = a1.e(13.00f);
       WishLightGiftBoxComboTextAnimationView.k = a1.e(25.00f);
       WishLightGiftBoxComboTextAnimationView.l = a1.e(14.00f);
       WishLightGiftBoxComboTextAnimationView.m = a1.d(0x7f070a35);
       WishLightGiftBoxComboTextAnimationView.n = new int[11]{0x7f081403,0x7f081404,0x7f081405,0x7f081406,0x7f081407,0x7f081408,0x7f081409,0x7f08140a,0x7f08140b,0x7f08140c,0x7f08140d};
    }
    public void WishLightGiftBoxComboTextAnimationView(Context p0){
       super(p0);
       this.d = new SparseArray(11);
       this.e = new LinkedList();
       this.f = new LinkedList();
       this.i = new g(this);
       this.f();
    }
    public void WishLightGiftBoxComboTextAnimationView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.d = new SparseArray(11);
       this.e = new LinkedList();
       this.f = new LinkedList();
       this.i = new g(this);
       this.f();
    }
    public void WishLightGiftBoxComboTextAnimationView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.d = new SparseArray(11);
       this.e = new LinkedList();
       this.f = new LinkedList();
       this.i = new g(this);
       this.f();
    }
    public static void a(WishLightGiftBoxComboTextAnimationView p0){
       p0.e();
    }
    public final Bitmap b(int p0){
       Bitmap obj;
       if (PatchProxy.isSupport(WishLightGiftBoxComboTextAnimationView.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, WishLightGiftBoxComboTextAnimationView.class, "15");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.d.get(p0);
       if (obj != null) {
          return obj;
       }else {
          obj = BitmapFactory.decodeResource(a1.m(), p0);
          int m = WishLightGiftBoxComboTextAnimationView.m;
          if (obj.getHeight() != m) {
             obj = BitmapUtil.U(obj, (int)(((float)(obj.getWidth() * m) * 0x3f800000) / (float)obj.getHeight()), m, Bitmap$Config.ARGB_8888, false);
          }
          this.d.put(p0, obj);
          return obj;
       }
    }
    public final List c(int p0){
       ArrayList obj;
       if (PatchProxy.isSupport(WishLightGiftBoxComboTextAnimationView.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, WishLightGiftBoxComboTextAnimationView.class, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ArrayList();
       while (p0 > 0) {
          int i = p0 % 10;
          obj.add(Integer.valueOf(i));
          p0 = p0 / 10;
       }
       Collections.reverse(obj);
       return obj;
    }
    public final int d(int p0){
       int[] n = WishLightGiftBoxComboTextAnimationView.n;
       if (p0 > (n.length - 1)) {
          return 0;
       }
       return n[p0];
    }
    public final void e(){
       if (PatchProxy.applyVoid(null, this, WishLightGiftBoxComboTextAnimationView.class, "10")) {
          return;
       }
       this.setVisibility(8);
       return;
    }
    public final void f(){
       if (PatchProxy.applyVoid(null, this, WishLightGiftBoxComboTextAnimationView.class, "9")) {
          return;
       }
       this.e();
       return;
    }
    public final ImageView getComboNumberImageView(){
       ImageView obj = PatchProxy.apply(null, this, WishLightGiftBoxComboTextAnimationView.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (!this.f.isEmpty())? this.f.remove(0): new ImageView(this.getContext());
       this.g.addView(obj, WishLightGiftBoxComboTextAnimationView.j, -1);
       return obj;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, WishLightGiftBoxComboTextAnimationView.class, "1")) {
          return;
       }
       super.onFinishInflate();
       this.g = this.findViewById(0x7f0a1d1c);
       this.h = this.findViewById(0x7f0a1d2e);
       return;
    }
    public final void setComboTextVisibility(int p0){
       if (PatchProxy.isSupport(WishLightGiftBoxComboTextAnimationView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, WishLightGiftBoxComboTextAnimationView.class, "11")) {
          return;
       }
       WishLightGiftBoxComboTextAnimationView th = this.h;
       if (th != null) {
          th.setVisibility(p0);
       }
       th = this.g;
       if (th != null) {
          th.setVisibility(p0);
       }
       return;
    }
}
