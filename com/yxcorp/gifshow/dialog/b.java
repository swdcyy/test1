package com.yxcorp.gifshow.dialog.b;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import ml8.d;
import com.yxcorp.gifshow.model.BindPhoneTipsModel;
import java.io.File;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import i2b.a;
import android.widget.ImageView;
import android.widget.Button;
import java.lang.CharSequence;
import android.widget.TextView;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.content.Context;
import android.content.res.Resources;
import cw9.c;
import java.lang.Math;
import android.graphics.Bitmap$Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Xfermode;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.l0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import android.app.Activity;
import ekd.m1;
import u9a.e;
import android.view.View$OnClickListener;
import u9a.h;
import u9a.g;
import u9a.f;

public class b implements PopupInterface$f, d	// class@001a9b
{
    public TextView b;
    public TextView c;
    public TextView d;
    public ImageView e;
    public ImageView f;
    public Button g;
    public Button h;
    public View i;
    public BindPhoneTipsModel j;
    public File k;
    public c l;

    public void b(BindPhoneTipsModel p0,File p1){
       super();
       this.j = p0;
       this.k = p1;
    }
    public View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p3 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, b.class, "2");
       if (p3 != patchProxyRe) {
          return p3;
       }
       this.l = p0;
       View view = a.g(p1, R.layout.arg_RES_7f0d05bb, p2, false);
       this.doBindView(view);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, b.class, "3")) {
          b tj = this.j;
          String str = 1;
          int i = 8;
          int i1 = 2;
          if (tj != null) {
             BindPhoneTipsModel mUIType = tj.mUIType;
             if (mUIType != str) {
                if (mUIType != i1) {
                   this.e.setVisibility(i);
                   this.h.setVisibility(i);
                   this.i.setVisibility(i);
                   this.d.setText(this.j.mIgnoreText);
                }else {
                   this.d.setVisibility(i);
                   this.h.setVisibility(i);
                   this.i.setVisibility(i);
                }
             }else {
                this.e.setVisibility(i);
                this.f.setVisibility(i);
                this.d.setVisibility(i);
             }
             this.b.setText(this.j.mTitle);
             this.c.setText(this.j.mContent);
             this.g.setText(this.j.mBindText);
             this.h.setText(this.j.mIgnoreText);
          }
          if (this.f.getVisibility() != i) {
             tj = this.k;
             if (tj != null && tj.exists()) {
                tj = this.f;
                Bitmap uBitmap = BitmapFactory.decodeFile(this.k.getAbsolutePath());
                Canvas obj = PatchProxy.applyOneRefs(uBitmap, this, b.class, "9");
                if (obj != patchProxyRe) {
                   uBitmap = obj;
                }else {
                   int i2 = Math.min((c.b(this.d().getResources(), R.dimen.arg_RES_7f07020e) - 2), (Math.min(uBitmap.getWidth(), uBitmap.getHeight()) / i1));
                   if (i2 > 0) {
                      Bitmap uBitmap1 = Bitmap.createBitmap(uBitmap.getWidth(), uBitmap.getHeight(), Bitmap$Config.ARGB_8888);
                      obj = new Canvas(uBitmap1);
                      Paint paint = new Paint();
                      paint.setAntiAlias(str);
                      float f = (float)i2;
                      obj.drawRoundRect(new RectF(0, 0, (float)uBitmap.getWidth(), (float)Math.min((i2 * 2), uBitmap.getHeight())), f, f, paint);
                      obj.drawRect(new RectF(0, f, (float)uBitmap.getWidth(), (float)uBitmap.getHeight()), paint);
                      paint.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.SRC_IN));
                      obj.drawBitmap(uBitmap, 0, 0, paint);
                      uBitmap = uBitmap1;
                   }
                }
                tj.setImageBitmap(uBitmap);
             }
          }
       }
    label_0140 :
       if (!PatchProxy.applyVoid(objArray, this, b.class, "8")) {
          u1.u0(4, l0.c(""), l0.b("pop_up_62_22_1"));
       }
       return view;
    }
    public void b(c p0){
       this.l = null;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, b.class, "10")) {
          return;
       }
       this.l.q(4);
       return;
    }
    public final Context d(){
       Object obj = PatchProxy.apply(null, this, b.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.l.u();
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       this.g = m1.f(p0, 0x7f0a0439);
       this.e = m1.f(p0, 0x7f0a0785);
       this.i = m1.f(p0, 0x7f0a1340);
       this.f = m1.f(p0, 0x7f0a03a4);
       this.d = m1.f(p0, 0x7f0a3f0d);
       this.c = m1.f(p0, 0x7f0a0962);
       this.b = m1.f(p0, 0x7f0a3f7b);
       this.h = m1.f(p0, 0x7f0a1341);
       m1.a(p0, new e(this), R.id.ignore_btn);
       m1.a(p0, new h(this), R.id.bind_btn);
       m1.a(p0, new g(this), R.id.close_btn);
       m1.a(p0, new f(this), R.id.tip_tv);
       return;
    }
}
