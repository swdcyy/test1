package com.kwai.locallife.live.widget.bubble.a;
import java.lang.Runnable;
import kotlin.jvm.internal.Ref$IntRef;
import android.view.View;
import o87.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;

public final class a implements Runnable	// class@000ebd
{
    public final Ref$IntRef b;
    public final View c;
    public final Ref$IntRef d;
    public final d e;
    public final int f;

    public void a(Ref$IntRef p0,View p1,Ref$IntRef p2,d p3,int p4){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       try{
          a tb = this.b;
          if (tb.element <= null) {
             tb.element = this.c.getMeasuredWidth();
          }
          tb = this.d;
          if (tb.element <= null) {
             tb.element = this.c.getMeasuredHeight();
          }
          this.c.getMeasuredWidth();
          this.c.getMeasuredHeight();
          Objects.requireNonNull(this.e);
          return;
       }catch(java.lang.Exception e0){
       }
    }
}
