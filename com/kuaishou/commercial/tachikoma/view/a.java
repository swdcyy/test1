package com.kuaishou.commercial.tachikoma.view.a;
import android.content.Context;
import k00.d;
import java.lang.Object;
import com.kuaishou.commercial.tachikoma.view.a$a;
import com.kuaishou.commercial.tachikoma.view.a$b;
import k00.b;
import com.kuaishou.commercial.tachikoma.view.a$c;
import com.kuaishou.commercial.tachikoma.view.a$d;
import k00.c;
import java.lang.StringBuilder;
import java.util.Formatter;
import java.util.Locale;
import java.lang.Appendable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.widget.ImageView;
import yx.j0;
import java.lang.Integer;
import com.yxcorp.gifshow.widget.cdn.KwaiCDNImageView;
import java.lang.Runnable;
import com.kwai.robust.PatchProxyResult;

public class a	// class@001695
{
    public final d a;
    public final Context b;
    public View c;
    public SeekBar d;
    public TextView e;
    public KwaiCDNImageView f;
    public final StringBuilder g;
    public final Formatter h;
    public View i;
    public TextView j;
    public KwaiCDNImageView k;
    public boolean l;
    public boolean m;
    public KwaiCDNImageView n;
    public View o;
    public View p;
    public boolean q;
    public final View$OnClickListener r;
    public final View$OnClickListener s;
    public final View$OnClickListener t;
    public final View$OnClickListener u;
    public final SeekBar$OnSeekBarChangeListener v;
    public final Runnable w;

    public void a(Context p0,d p1){
       super();
       this.q = true;
       this.r = new a$a(this);
       this.s = new a$b(this);
       this.t = new b(this);
       this.u = new a$c(this);
       this.v = new a$d(this);
       this.w = new c(this);
       this.a = p1;
       this.b = p0;
       StringBuilder str = "";
       this.g = str;
       this.h = new Formatter(str, Locale.getDefault());
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, a.class, "8")) {
          return;
       }
       this.l = false;
       this.i.setVisibility(8);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       this.k.setVisibility(8);
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       this.e("hideReplayView");
       this.o.setVisibility(8);
       this.m = false;
       return;
    }
    public boolean d(){
       return this.l;
    }
    public final void e(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "14")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.f("MKVideoController", p0, objArray);
       return;
    }
    public void f(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "9")) {
          return;
       }
       this.e("show controller isShowing : "+this.d());
       Object[] objArray = null;
       if (this.l == null) {
          if (!PatchProxy.applyVoid(objArray, this, uoa, "7")) {
             this.i.setVisibility(0);
          }
          this.l = true;
       }
       this.h();
       if (!PatchProxy.applyVoid(objArray, this, uoa, "10")) {
          if (this.a.a()) {
             this.n.n0(R.string.arg_RES_7f1007b9);
          }else {
             this.n.n0(R.string.arg_RES_7f1007bd);
          }
       }
       if (p0) {
          this.c.removeCallbacks(this.w);
          this.c.postDelayed(this.w, (long)p0);
       }
       return;
    }
    public String g(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "13");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       p0 = p0 / 1000;
       int i = p0 % 60;
       int i1 = (p0 / 60) % 60;
       p0 = p0 / 3600;
       (this.g).setLength(0);
       int i2 = 2;
       if (p0 > 0) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(i1),Integer.valueOf(i)};
          return this.h.format("%d:%02d:%02d", objArray).toString();
       }else {
          Object[] objArray1 = new Object[i2];
          objArray1[0] = Integer.valueOf(i1);
          objArray1[1] = Integer.valueOf(i);
          return this.h.format("%02d:%02d", objArray1).toString();
       }
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, a.class, "6")) {
          return;
       }
       if (this.a.isPlaying()) {
          this.f.n0(R.string.arg_RES_7f1007ba);
       }else {
          this.f.n0(R.string.arg_RES_7f1007bb);
       }
       return;
    }
}
