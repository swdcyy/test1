package com.kuaishou.live.core.show.redpacket.redpackrain2.snatch.k;
import th2.d;
import java.lang.String;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import android.widget.TextView;
import com.kuaishou.live.core.show.redpacket.redpackrain2.snatch.j;
import crd.b;
import ok.h;
import lnc.b9;

public class k extends d	// class@000f2e
{
    public TextView c;
    public b d;
    public static final String[] e;

    static {
       String[] stringArray = new String[]{".","..","...","....",".....","......"};
       k.e = stringArray;
    }
    public void k(ViewGroup p0){
       super(p0);
       View view = this.b();
       if (PatchProxy.applyVoidOneRefs(view, this, k.class, "1")) {
       }else if(view == null){
          this.c = m1.f(view, 0x7f0a24be);
          this.d = b9.c(this.d, new j(this));
       }
       return;
    }
    public int a(){
       return 0x7f0d0d8d;
    }
    public void c(){
       k ok = k.class;
       if (PatchProxy.applyVoid(null, this, ok, "2")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, ok, "3")) {
          b9.a(this.d);
       }
       return;
    }
}
