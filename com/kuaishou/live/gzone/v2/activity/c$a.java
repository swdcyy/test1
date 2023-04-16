package com.kuaishou.live.gzone.v2.activity.c$a;
import androidx.viewpager.widget.ViewPager$i;
import com.kuaishou.live.gzone.v2.activity.c;
import java.lang.Object;
import android.animation.ArgbEvaluator;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Float;
import java.lang.String;
import pp.a;
import java.lang.StringBuilder;
import q87.c;
import w53.b;
import android.content.res.ColorStateList;
import com.yxcorp.gifshow.widget.GzonePagerSlidingTabStrip;
import w53.j0;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import java.lang.CharSequence;
import y43.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import fq5.b;
import dz1.a;
import com.kwai.live.gzone.tab.bean.LiveGzoneTabSource;

public class c$a implements ViewPager$i	// class@001cb3
{
    public final ArgbEvaluator b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public int g;
    public int h;
    public final c i;

    public void c$a(c p0){
       this.i = p0;
       super();
       this.b = new ArgbEvaluator();
    }
    public void onPageScrollStateChanged(int p0){
       c$a ti = this.i;
       if (ti.J != null) {
          return;
       }
       if (p0 == 1) {
          ti.J = 2;
       }else if(p0 == 2){
          ti.J = 3;
       }
       return;
    }
    public void onPageScrolled(int p0,float p1,int p2){
       c$a te;
       if (PatchProxy.isSupport(c$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Float.valueOf(p1), Integer.valueOf(p2), this, c$a.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().s("LiveGzonePlayStationPopPresenter", "onPageScrolled: position"+p0+" ,offset:"+p1+",px"+p2, objArray);
       boolean b = this.i.C.A(p0);
       this.c = b;
       int i = 0xff000000;
       int i1 = -1;
       int i2 = (b)? 0xff000000: -1;
       this.e = i2;
       b = (b)? c.P: -1;
       this.f = b;
       if (p1 > 0) {
          p0++;
          boolean b1 = this.i.C.A(p0);
          this.d = b1;
          if (!b1) {
             i = -1;
          }
          this.g = i;
          if (b1) {
             i1 = c.P;
          }
          this.h = i1;
          te = this.e;
          if (i != te) {
             this.i.r.setTextColor(ColorStateList.valueOf(this.b.evaluate(p1, Integer.valueOf(te), Integer.valueOf(this.g)).intValue()));
             te = this.i;
             if (te.M != null) {
                te.r.setIndicatorColorInt(this.b.evaluate(p1, Integer.valueOf(this.f), Integer.valueOf(this.h)).intValue());
             }
          }
       }else {
          this.i.r.setTextColor(ColorStateList.valueOf(i2));
          te = this.i;
          if (te.M != null) {
             te.r.setIndicatorColorInt(this.f);
          }
       }
       return;
    }
    public void onPageSelected(int p0){
       c$a uoa = c$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "2")) {
          return;
       }
       uoa = this.i;
       uoa.I = p0;
       if (uoa.J == 2) {
          j0 oj0 = uoa.C.z(p0);
          c o = this.i.O;
          String str = (oj0.b().f() != null)? oj0.b().f().toString(): null;
          uoa = this.i;
          c o1 = uoa.O;
          a.k(o, str, oj0.b().c(), p0, o1, o1, 0, true, uoa.C.B(p0), this.i.t.m.a());
          this.i.K = LiveGzoneTabSource.SWITCH;
       }
       uoa = this.i;
       uoa.Z8(p0, uoa.K);
       p0.J = 0;
       return;
    }
}
