package bz8.f;
import y8c.g;
import bz8.g;
import bz8.o;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import y8c.f;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import g9c.a;
import bz8.n;
import android.view.ViewGroup;
import android.view.View;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ml8.c;
import i2b.a;
import fz8.a;
import cz8.a;
import dz8.h;
import ez8.d;
import ez8.a;

public final class f extends g	// class@000499
{
    public final g w;
    public final o x;

    public void f(g p0,o p1){
       a.p(p0, "mPageCallerContext");
       a.p(p1, "mHalfLandingViewModel");
       super();
       this.w = p0;
       this.x = p1;
    }
    public ArrayList a1(int p0,f p1){
       ArrayList obj;
       if (PatchProxy.isSupport(f.class)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, f.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ArrayList();
       obj.add(this.w);
       obj.add(this.x);
       return obj;
    }
    public int f0(int p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uof, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       n on = this.N0(p0);
       on = (on != null)? on.a: 0;
       return on;
    }
    public f h1(ViewGroup p0,int p1){
       f uof;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(f.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, f.class, "1");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       if (p1 != 1) {
          if (p1 != 2) {
             if (p1 != 3) {
                if (p1 != 4) {
                   Context context = (p0 != null)? p0.getContext(): null;
                   uof = new f(new View(context), new PresenterV2());
                }else {
                   uof = PatchProxy.applyOneRefs(p0, this, f.class, "7");
                   if (uof != patchProxyRe) {
                   }else {
                      uof = new f(a.i(p0, 0x7f0d05a7), new a());
                   }
                }
             }else {
                uof = PatchProxy.applyOneRefs(p0, this, f.class, "6");
                if (uof != patchProxyRe) {
                }else {
                   uof = new f(a.i(p0, 0x7f0d05a3), new a());
                }
             }
          }else {
             uof = PatchProxy.applyOneRefs(p0, this, f.class, "5");
             if (uof != patchProxyRe) {
             }else {
                uof = new f(a.i(p0, 0x7f0d05a5), new h());
             }
          }
       }else {
          uof = PatchProxy.applyOneRefs(p0, this, f.class, "4");
          if (uof != patchProxyRe) {
          }else {
             PresenterV2 presenterV2 = new PresenterV2();
             presenterV2.U7(new d());
             presenterV2.U7(new a());
             uof = new f(a.i(p0, 0x7f0d05a6), presenterV2);
          }
       }
       return uof;
    }
}
