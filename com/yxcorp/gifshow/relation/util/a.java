package com.yxcorp.gifshow.relation.util.a;
import erd.g;
import android.widget.Button;
import android.widget.TextView;
import java.lang.Object;
import dac.a;
import com.yxcorp.gifshow.relation.util.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import n7c.e;
import brd.t;
import com.yxcorp.gifshow.b;
import cjd.e;
import erd.o;
import t45.d;
import brd.z;
import hcc.e;
import com.gifshow.tuna.player.poi.e;
import crd.b;

public final class a implements g	// class@001a52
{
    public final Button b;
    public final TextView c;
    public final TextView d;
    public final Button e;

    public void a(Button p0,TextView p1,TextView p2,Button p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void accept(Object p0){
       a tb = this.b;
       a tc = this.c;
       a td = this.d;
       a te = this.e;
       tb.setVisibility(8);
       if (PatchProxy.applyVoidFourRefs(tc, td, te, tb, null, b.class, "2")) {
       }else {
          int a = b.a;
          if (a != -1) {
             e.f(a, tc, td, te, tb);
          }else {
             b.f().map(new e()).observeOn(d.a).subscribe(new e(tc, td, te, tb), e.b);
          }
       }
       return;
    }
}
