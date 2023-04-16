package com.gifshow.tuna.player.poi.f;
import nj.a;
import nj.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import oj.b;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import oj.d;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import android.view.View;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import android.widget.LinearLayout;
import android.widget.ImageView;
import com.gifshow.tuna.player.poi.PoiFoodFeedListModel$PoiFoodVideoModel;
import java.lang.CharSequence;
import oj.j;
import oj.a;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.StringBuilder;
import nj.b;
import com.kwai.library.widget.popup.common.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.graphics.drawable.Drawable;
import lnc.a1;
import android.content.res.ColorStateList;
import e2.d;
import com.gifshow.tuna.player.poi.a;
import android.view.View$OnClickListener;

public class f extends a	// class@0015f5
{
    public KwaiImageView c;
    public TextView d;
    public TextView e;
    public LinearLayout f;
    public ImageView g;
    public TextView h;
    public TextView i;
    public TextView j;
    public TextView k;
    public c l;

    public void f(){
       super();
    }
    public void a(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       super.a(p0);
       this.c(RxBus.f.g(b.class, RxBus$ThreadMode.MAIN).subscribe(new d(this), Functions.e));
       g d = p0.d;
       if (d != null) {
          this.c = d.findViewById(0x7f0a3152);
          this.d = p0.d.findViewById(0x7f0a315f);
          this.e = p0.d.findViewById(0x7f0a315d);
          this.f = p0.d.findViewById(0x7f0a313e);
          this.g = p0.d.findViewById(0x7f0a313f);
          this.h = p0.d.findViewById(0x7f0a3141);
          this.i = p0.d.findViewById(0x7f0a3150);
          this.j = p0.d.findViewById(0x7f0a3151);
          this.k = p0.d.findViewById(0x7f0a314e);
          d = p0.c;
          if (d != null) {
             this.i.setText(d.mDishName);
             this.j.setText(d.mPrice);
          }
          j e = p0.e;
          if (e != null) {
             this.c.L(e.getPoiIconUrl());
             this.d.setText(e.getPoiName());
             this.e.setText(e.getPoiAddress());
             this.f(e.isPoiCollected());
             if (p0.a != null) {
                this.k.setText((p0.a.getPosition() + 1)+"/"+e.getVideoListSize());
             }
          }
       }
    label_0103 :
       return;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, f.class, "4")) {
          return;
       }
       f tl = this.l;
       if (tl != null && tl.K()) {
          this.l.o();
       }
       return;
    }
    public final String e(){
       a obj = PatchProxy.apply(null, this, f.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       if (obj != null) {
          return obj.e.getPoiId();
       }
       return null;
    }
    public final void f(boolean p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uof, "2")) {
          return;
       }
       this.f.setSelected(p0);
       if (p0) {
          this.g.setImageDrawable(a1.f(R.drawable.arg_RES_7f0809f2));
          d.c(this.g, null);
          this.h.setText(R.string.arg_RES_7f103cfa);
       }else {
          this.g.setImageDrawable(a1.f(R.drawable.arg_RES_7f080587));
          d.c(this.g, ColorStateList.valueOf(a1.a(R.color.arg_RES_7f06060a)));
          this.h.setText(R.string.arg_RES_7f103cf9);
       }
       this.f.setOnClickListener(new a(this, p0));
       return;
    }
}
