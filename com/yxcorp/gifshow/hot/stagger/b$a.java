package com.yxcorp.gifshow.hot.stagger.b$a;
import zr6.b;
import java.lang.Object;
import java.util.List;
import zq6.q;
import androidx.fragment.app.FragmentActivity;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import un5.b;
import wn5.a;
import zq6.p;
import zr6.j;
import wq6.h;
import wn5.b;
import rn5.a;
import bo5.a;
import hn5.n;
import hn5.m;
import kva.q;
import msd.a;
import ad7.e;
import kva.p;
import tkd.b;
import tkd.d;
import hn5.d;
import sn5.a;
import zf6.l;
import java.lang.Boolean;
import gsa.e0;
import ro5.b;
import androidx.fragment.app.Fragment;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.hot.stagger.HomeHotFragment;
import com.yxcorp.gifshow.util.l;

public class b$a extends b	// class@00189e
{

    public void b$a(Object p0){
       super(p0);
    }
    public void b(List p0,q p1,FragmentActivity p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, b$a.class, "2")) {
          return;
       }
       p1.b(b.e, new a("FIND", true));
       b uob = this.b.q("KEY_TAB_NAME_DEST");
       p1.b(a.n, uob);
       p1.b(a.s, uob);
       if (m.a().s6()) {
          p1.a(a.b, new q(this, p2));
          p1.a(b.a, e.b);
          p1.a(a.e, new p(this, p2));
       }else {
          p1.b(a.b, d.a(-683509148).P4(p2, this.b));
          p1.b(b.a, Boolean.valueOf(l.r()));
          p1.b(a.e, b.a(this.b, p2));
       }
       return;
    }
    public Fragment c(FragmentActivity p0,h p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, b$a.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       HomeHotFragment homeHotFragm = new HomeHotFragment();
       l.a(homeHotFragm);
       return homeHotFragm;
    }
}
