package com.kuaishou.merchant.home.mall.a;
import zr6.b;
import java.lang.Object;
import java.util.List;
import zq6.q;
import androidx.fragment.app.FragmentActivity;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import zr6.j;
import wq6.h;
import wn5.b;
import bo5.a;
import zq6.p;
import gsa.e0;
import ro5.b;
import hn5.n;
import hn5.m;
import rn5.a;
import yw3.e;
import msd.a;
import tkd.b;
import tkd.d;
import hn5.d;
import sn5.a;
import androidx.fragment.app.Fragment;
import com.kwai.robust.PatchProxyResult;
import yr3.e;
import yr3.a;
import yr3.f;
import android.os.Bundle;
import zr6.e;
import com.kuaishou.merchant.home.mall.c;

public class a extends b	// class@0016da
{

    public void a(Object p0){
       super(p0);
    }
    public void b(List p0,q p1,FragmentActivity p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "3")) {
          return;
       }
       p1.b(a.s, this.b.q("KEY_TAB_NAME_DEST"));
       p1.b(a.e, b.a(this.b, p2));
       if (m.a().s6()) {
          p1.a(a.b, new e(this, p2));
       }else {
          p1.b(a.b, d.a(-683509148).P4(p2, this.b));
       }
       return;
    }
    public Fragment c(FragmentActivity p0,h p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return f.r(e.class).I7(null);
    }
    public e d(h p0){
       p0 = PatchProxy.applyOneRefs(p0, this, a.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return new c();
    }
}
