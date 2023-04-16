package com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundImagePresenterV3$k;
import erd.g;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundImagePresenterV3;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import ii5.a;
import com.yxcorp.gifshow.profile.kslog.KsLogProfileTag;
import java.util.List;
import v2c.e;
import java.lang.StringBuilder;
import v2c.g;
import z5c.m2;
import xl8.b;
import android.view.View;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable$Orientation;
import android.os.Build$VERSION;
import lnc.a1;
import z5c.k1;
import usd.q;
import qrd.l1;
import android.graphics.drawable.ColorDrawable;

public final class ProfileHeaderBackgroundImagePresenterV3$k implements g	// class@0014ae
{
    public final ProfileHeaderBackgroundImagePresenterV3 b;
    public final ImageView c;
    public final Drawable d;

    public void ProfileHeaderBackgroundImagePresenterV3$k(ProfileHeaderBackgroundImagePresenterV3 p0,ImageView p1,Drawable p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void a(Integer p0){
       GradientDrawable gradientDraw1;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, ProfileHeaderBackgroundImagePresenterV3$k.class, "1")) {
          return;
       }
       a.o(p0, "color");
       int i = a.g(p0.intValue());
       g.e(KsLogProfileTag.BG_IMMERSIVE.appendTag("ProfileHeaderBackgroundImagePresenterV3"), "color: "+p0+" maskBaseColor: "+i);
       float f = 0x3f0ccccd;
       int i1 = m2.a(p0.intValue(), a.f(f, i));
       ProfileHeaderBackgroundImagePresenterV3.R8(this.b).d(Integer.valueOf(i1));
       ProfileHeaderBackgroundImagePresenterV3.Z8(this.b).setBackgroundColor(i1);
       GradientDrawable gradientDraw = new GradientDrawable();
       int i2 = 2;
       int[] ointArray = new int[i2];
       float f1 = 0;
       ointArray[0] = a.f(f1, p0.intValue());
       ointArray[1] = a.f(0x3f800000, p0.intValue());
       gradientDraw.setColors(ointArray);
       gradientDraw.setOrientation(GradientDrawable$Orientation.TOP_BOTTOM);
       ProfileHeaderBackgroundImagePresenterV3.V8(this.b).setBackground(gradientDraw);
       this.c.setImageDrawable(this.d);
       if (Build$VERSION.SDK_INT >= 23) {
          int i3 = a1.d(R.dimen.arg_RES_7f070268);
          int i4 = (this.b.h9() - i3) - a1.d(0x7f070335);
          ProfileHeaderBackgroundImagePresenterV3 m = this.b.M;
          if (m != null) {
             k1.c(m, i3);
          }
          k1.c(this.b.N, q.n(0, i4));
          ProfileHeaderBackgroundImagePresenterV3 m1 = this.b.M;
          float f2 = 0.30f;
          if (m1 != null) {
             gradientDraw1 = new GradientDrawable();
             int[] ointArray1 = new int[i2];
             ointArray1[0] = a.f(f1, i);
             ointArray1[1] = a.f(f2, i);
             gradientDraw1.setColors(ointArray1);
             gradientDraw1.setOrientation(GradientDrawable$Orientation.TOP_BOTTOM);
             m1.setForeground(gradientDraw1);
          }
          m1 = this.b.N;
          if (m1 != null) {
             gradientDraw1 = new GradientDrawable();
             int[] ointArray2 = new int[i2];
             ointArray2[0] = a.f(f2, i);
             ointArray2[1] = a.f(f, i);
             gradientDraw1.setColors(ointArray2);
             gradientDraw1.setOrientation(GradientDrawable$Orientation.TOP_BOTTOM);
             m1.setForeground(gradientDraw1);
          }
          ProfileHeaderBackgroundImagePresenterV3 o = this.b.O;
          if (o != null) {
             o.setForeground(new ColorDrawable(i1));
          }
          o = this.b.Q;
          if (o != null) {
             o.setBackground(new ColorDrawable(i1));
          }
          o = this.b.R;
          if (o != null) {
             o.setBackground(new ColorDrawable(i1));
          }
       }
       ProfileHeaderBackgroundImagePresenterV3.W8(this.b).setBackground(new ColorDrawable(p0.intValue()));
       PatchProxy.onMethodExit(ProfileHeaderBackgroundImagePresenterV3$k.class, "1");
       return;
    }
    public void accept(Object p0){
       this.a(p0);
    }
}
