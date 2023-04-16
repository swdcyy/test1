package com.yxcorp.gifshow.detail.fragments.milano.poi.view.PoiBottomBarViewV2;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import android.widget.LinearLayout;
import android.widget.ImageView;
import java.lang.Boolean;
import android.graphics.drawable.Drawable;
import lnc.a1;
import android.content.res.ColorStateList;
import e2.d;

public class PoiBottomBarViewV2 extends RelativeLayout	// class@001513
{
    public View b;
    public KwaiImageView c;
    public TextView d;
    public TextView e;
    public TextView f;
    public View g;
    public LinearLayout h;
    public ImageView i;
    public TextView j;
    public LinearLayout k;
    public TextView l;
    public TextView m;
    public a n;
    public boolean o;
    public Context p;
    public static final int q;

    public void PoiBottomBarViewV2(Context p0){
       super(p0, null);
    }
    public void PoiBottomBarViewV2(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void PoiBottomBarViewV2(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.p = p0;
       View view = a.c(this.getContext(), R.layout.arg_RES_7f0d1178, this);
       this.b = view;
       if (PatchProxy.applyVoidOneRefs(view, this, PoiBottomBarViewV2.class, "1")) {
       }else {
          this.c = m1.f(view, 0x7f0a315b);
          this.d = m1.f(view, 0x7f0a3161);
          this.e = m1.f(view, 0x7f0a3154);
          this.f = m1.f(view, 0x7f0a315c);
          this.g = m1.f(view, 0x7f0a43b7);
          this.h = m1.f(view, 0x7f0a3143);
          this.i = m1.f(view, 0x7f0a3140);
          this.j = m1.f(view, 0x7f0a3142);
          this.k = m1.f(view, 0x7f0a313b);
          this.l = m1.f(view, 0x7f0a313d);
          this.m = m1.f(view, 0x7f0a313c);
       }
       return;
    }
    public LinearLayout getPoiCollectBtnV2(){
       return this.h;
    }
    public void setCollectState(boolean p0){
       if (PatchProxy.isSupport(PoiBottomBarViewV2.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, PoiBottomBarViewV2.class, "4")) {
          return;
       }
       this.o = p0;
       this.h.setSelected(p0);
       if (p0) {
          this.i.setImageDrawable(a1.f(R.drawable.arg_RES_7f0809f2));
          d.c(this.i, null);
          this.j.setText(R.string.arg_RES_7f103cfa);
       }else {
          this.i.setImageDrawable(a1.f(R.drawable.arg_RES_7f0809f1));
          d.c(this.i, ColorStateList.valueOf(a1.a(R.color.arg_RES_7f061dc4)));
          this.j.setText(R.string.arg_RES_7f103cfb);
       }
       return;
    }
}
