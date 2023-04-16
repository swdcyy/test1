package de.l;
import de.f;
import java.lang.Object;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;
import ce.b;
import java.util.Objects;
import com.facebook.react.bridge.UiThreadUtil;
import ce.b$a;
import android.view.View$MeasureSpec;
import android.view.View;
import android.view.ViewParent;
import ze.h0;
import java.lang.IllegalStateException;

public class l implements f	// class@001e45
{
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public void l(int p0,int p1,int p2,int p3,int p4,int p5){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       p0 = 2;
       if (p5) {
          if (p5 != 1) {
             if (p5 == p0) {
                p0 = 1;
             }else {
                throw new IllegalArgumentException("Unsupported layout direction: "+p5);
             }
          }else {
             p0 = 0;
          }
       }
       this.f = p0;
       return;
    }
    public void a(b p0){
       l ta = this.a;
       l tb = this.b;
       l tc = this.c;
       l td = this.d;
       l te = this.e;
       Objects.requireNonNull(p0);
       UiThreadUtil.assertOnUiThread();
       b$a uoa = p0.f(ta);
       if (uoa.c != null) {
       }else {
          uoa = uoa.a;
          if (uoa != null) {
             uoa.measure(View$MeasureSpec.makeMeasureSpec(td, 0x40000000), View$MeasureSpec.makeMeasureSpec(te, 0x40000000));
             ViewParent parent = uoa.getParent();
             if (parent instanceof h0) {
                parent.requestLayout();
             }
             uoa.layout(tb, tc, (td + tb), (te + tc));
          }else {
             throw new IllegalStateException("Unable to find View for tag: "+ta);
          }
       }
       return;
    }
    public String toString(){
       return "UpdateLayoutMountItem ["+this.a+"] - x: "+this.b+" - y: "+this.c+" - height: "+this.e+" - width: "+this.d+" - layoutDirection: "+this.f;
    }
}
