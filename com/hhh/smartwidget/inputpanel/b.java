package com.hhh.smartwidget.inputpanel.b;
import com.hhh.smartwidget.inputpanel.d$b;
import com.hhh.smartwidget.inputpanel.InputPanel;
import com.hhh.smartwidget.inputpanel.InputPanel$b;
import java.lang.Object;
import com.hhh.smartwidget.popup.c;
import android.view.View;
import mm.l;

public class b implements d$b	// class@000584
{
    public final InputPanel$b a;
    public final InputPanel b;

    public void b(InputPanel p0,InputPanel$b p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(int p0){
       b ta;
       if (this.b.o == null) {
          ta = this.a;
          if (ta.F == null && !ta.m()) {
             ta = this.b;
             ta.s(ta.g.getHeight(), (- p0));
          label_0039 :
             ta = this.b;
             ta.o = p0;
             InputPanel$b u = this.a.U;
             if (u != null) {
                u.a(ta, p0, true);
             }
             return;
          }
       }
       ta = this.b;
       boolean b = false;
       if (ta.n != null) {
          ta.n = b;
          ta.r(b);
       }
       ta = this.b;
       if (ta.m != null) {
          ta.m = b;
       }
       ta.s(b, (ta.p - p0));
       goto label_0039 ;
    }
    public void b(int p0){
       b tb;
       b uob = null;
       if (this.a.I != null) {
          tb = this.b;
          if (tb.l != null) {
             tb.d(0);
          }else {
             tb.l = true;
             if (tb.n != null) {
                tb.s((tb.p - p0), 0);
             }else {
                c g = tb.g;
                if (tb.p <= null) {
                   uob = (float)(- p0);
                }
                g.setTranslationY(uob);
             }
          }
       }else {
          tb = this.b;
          if (tb.n == null) {
             tb.g.setTranslationY(uob);
          }
       }
       InputPanel$b u = this.a.U;
       if (u != null) {
          u.a(this.b, p0, 0);
       }
       return;
    }
}
