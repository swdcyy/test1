package dk2.b;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewStub;
import ekd.m1;
import android.widget.TextView;
import android.widget.ImageView;
import tkd.b;
import tkd.d;
import ym5.a;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import lnc.a1;
import java.lang.Float;
import java.lang.Boolean;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.lang.System;
import java.util.Calendar;
import java.lang.StringBuilder;
import java.util.Date;
import java.text.DateFormat;
import java.lang.CharSequence;
import android.app.Application;
import o56.a;
import android.content.Context;
import ekd.p0;
import android.net.wifi.WifiManager;

public class b	// class@00253a
{
    public View a;
    public View b;
    public View c;
    public TextView d;
    public TextView e;
    public ImageView f;
    public DateFormat g;
    public boolean h;

    public void b(){
       super();
    }
    public void a(View p0){
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uob, "1")) {
          return;
       }
       if (this.h == null) {
          this.h = true;
          p0 = p0.findViewById(R.id.live_landscape_status_bar_viewstub).inflate();
          this.a = p0;
          this.b = m1.f(p0, 0x7f0a1e96);
          this.c = m1.f(this.a, 0x7f0a1e9b);
          this.d = m1.f(this.a, 0x7f0a1f8b);
          this.e = m1.f(this.a, 0x7f0a1f8a);
          this.f = m1.f(this.a, 0x7f0a1f89);
          if (!PatchProxy.applyVoid(null, this, uob, "2") && (d.a(0x4c5dd1b8).f2() && this.d.getLayoutParams() instanceof FrameLayout$LayoutParams)) {
             FrameLayout$LayoutParams layoutParams = this.d.getLayoutParams();
             layoutParams.gravity = 3;
             layoutParams.leftMargin = a1.e(11.00f);
             this.d.setLayoutParams(layoutParams);
          }
       }
       return;
    }
    public void b(float p0,boolean p1){
       b tb;
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Boolean.valueOf(p1), this, uob, "5")) {
          return;
       }
       if (this.h != null && (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Boolean.valueOf(p1), this, uob, "8"))) {
          boolean i = (int)(p0 * (float)a1.d(0x7f0707bb));
          if (this.b.getLayoutParams().width != i) {
             this.b.getLayoutParams().width = i;
             tb = this.b;
             tb.setLayoutParams(tb.getLayoutParams());
          }
          int i1 = 0;
          i = (!this.c.getVisibility())? true: false;
          if (p1 != i) {
             tb = this.c;
             if (!p1) {
                i1 = 8;
             }
             tb.setVisibility(i1);
          }
       }
    label_0072 :
       return;
    }
    public void c(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "4")) {
          return;
       }
       if (this.h != null) {
          uob = this.a;
          int i = (p0)? 0: 8;
          uob.setVisibility(i);
       }
       return;
    }
    public void d(){
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "3")) {
          return;
       }
       if (this.h != null) {
          if (!PatchProxy.applyVoid(objArray, this, uob, "7")) {
             if (this.g == null) {
                this.g = new SimpleDateFormat("HH:mm", Locale.getDefault());
             }
             Calendar instance = Calendar.getInstance();
             instance.setTimeInMillis(System.currentTimeMillis());
             int i1 = instance.get(11);
             String str1 = this.g.format(instance.getTime());
             if (i1 < 3) {
                str1 = str1+" "+a1.p(0x7f10243d);
             }
             this.d.setText(str1);
          }
          if (!PatchProxy.applyVoid(objArray, this, uob, "6")) {
             Application uApplication = a.b();
             if (p0.F(uApplication)) {
                int i = WifiManager.calculateSignalLevel(p0.y(uApplication), 3);
                if (!i) {
                   this.f.setImageResource(R.drawable.arg_RES_7f08129e);
                }else if(i == 1){
                   this.f.setImageResource(R.drawable.arg_RES_7f08129f);
                }else {
                   this.f.setImageResource(R.drawable.arg_RES_7f0812a0);
                }
                this.e.setVisibility(8);
                this.f.setVisibility(0);
             }else if(p0.A(uApplication)){
                this.f.setVisibility(8);
                String str = p0.u(uApplication);
                if (!("Notfound").equals(str)) {
                   this.e.setText(str.toUpperCase());
                   this.e.setVisibility(0);
                }else {
                   this.e.setVisibility(8);
                }
             }else if(!p0.C(uApplication)){
                this.e.setText(R.string.arg_RES_7f101426);
                this.e.setVisibility(0);
                this.f.setVisibility(8);
             }else {
                this.e.setVisibility(8);
                this.f.setVisibility(8);
             }
          }
       }
       return;
    }
}
