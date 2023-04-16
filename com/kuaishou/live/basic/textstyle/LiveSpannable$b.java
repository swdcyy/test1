package com.kuaishou.live.basic.textstyle.LiveSpannable$b;
import java.lang.CharSequence;
import java.lang.Object;
import android.view.View$OnClickListener;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import lnc.a1;
import android.graphics.Typeface;

public class LiveSpannable$b	// class@000d06
{
    public CharSequence a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public Typeface f;
    public View$OnClickListener g;

    public void LiveSpannable$b(CharSequence p0){
       super();
       this.a = p0;
    }
    public LiveSpannable$b a(){
       this.e = true;
       return this;
    }
    public LiveSpannable$b b(View$OnClickListener p0){
       this.g = p0;
       return this;
    }
    public LiveSpannable$b c(int p0){
       this.b = p0;
       return this;
    }
    public LiveSpannable$b d(int p0){
       LiveSpannable$b uob = LiveSpannable$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.c(a1.a(p0));
       return this;
    }
    public LiveSpannable$b e(int p0){
       this.d = p0;
       return this;
    }
    public LiveSpannable$b f(int p0){
       LiveSpannable$b uob = LiveSpannable$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0) {
          this.e(a1.a(p0));
       }
       return this;
    }
    public LiveSpannable$b g(int p0){
       this.c = p0;
       return this;
    }
    public LiveSpannable$b h(Typeface p0){
       this.f = p0;
       return this;
    }
}
