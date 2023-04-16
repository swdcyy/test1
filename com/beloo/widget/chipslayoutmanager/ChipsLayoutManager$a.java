package com.beloo.widget.chipslayoutmanager.ChipsLayoutManager$a;
import com.beloo.widget.chipslayoutmanager.ChipsLayoutManager;
import java.lang.Object;
import s9.k;
import java.lang.Integer;
import s9.b;
import t9.c0;
import t9.e;
import t9.g;
import t9.m;
import q9.c;
import p9.e;
import com.beloo.widget.chipslayoutmanager.anchor.AnchorViewState;
import com.beloo.widget.chipslayoutmanager.a;
import p9.a;
import s9.n;
import java.lang.String;
import x9.a;
import com.beloo.widget.chipslayoutmanager.ChipsLayoutManager$b;

public class ChipsLayoutManager$a	// class@000f00
{
    public Integer a;
    public final ChipsLayoutManager b;

    public void ChipsLayoutManager$a(ChipsLayoutManager p0){
       this.b = p0;
       super();
    }
    public ChipsLayoutManager a(){
       ChipsLayoutManager$a tb = this.b;
       if (tb.f == null) {
          ChipsLayoutManager$a ta = this.a;
          tb.f = (ta != null)? new k(ta.intValue()): new b();
       }
    label_001d :
       tb = this.b;
       c0 uoc0 = (tb.j == 1)? new c0(tb): new e(tb);
       tb.v = uoc0;
       tb = this.b;
       tb.b = tb.v.p();
       tb = this.b;
       tb.x = tb.v.f();
       tb = this.b;
       tb.y = tb.v.n();
       tb = this.b;
       tb.u = tb.x.a();
       tb = this.b;
       tb.c = new a(tb.b, tb.d, tb.v);
       return tb;
    }
    public ChipsLayoutManager$a b(int p0){
       this.a = Integer.valueOf(p0);
       return this;
    }
    public ChipsLayoutManager$a c(n p0){
       a.a(p0, "gravity resolver couldn\'t be null");
       this.b.f = p0;
       return this;
    }
    public ChipsLayoutManager$a d(int p0){
       if (p0 != 1 && p0 != 2) {
          return this;
       }
       this.b.j = p0;
       return this;
    }
    public ChipsLayoutManager$b e(int p0){
       this.b.k = p0;
       return this;
    }
}
