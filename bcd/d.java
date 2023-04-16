package bcd.d;
import y8c.g;
import bcd.g;
import y8c.f$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import g9c.a;
import bcd.m;
import bcd.d$a;
import java.lang.Integer;
import java.lang.Number;
import bcd.o;
import android.view.ViewGroup;
import y8c.f;
import android.view.View;
import i2b.a;
import dcd.e;
import ml8.c;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import dcd.d;

public class d extends g	// class@0003e0
{
    public final g w;
    public final boolean x;

    public void d(g p0,boolean p1){
       super();
       this.x = p1;
       this.w = p0;
    }
    public f$b d1(f$b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       d$a uoa = new d$a(p0);
       uoa.h = this.N0(p0.b);
       return uoa;
    }
    public int f0(int p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uod, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       m om = this.N0(p0);
       if (this.x != null) {
          return 5;
       }else {
          return om instanceof o;
       }
    }
    public f h1(ViewGroup p0,int p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uod, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i = 0x7f0d07d3;
       if (p1) {
          if (p1 != 1) {
             if (p1 == 5) {
                return new f(a.i(p0, i), new e(this.w));
             }else {
                throw new IllegalStateException("illegal viewType:"+p1);
             }
          }else {
             return new f(a.i(p0, 0x7f0d07d5), new PresenterV2());
          }
       }else {
          return new f(a.i(p0, i), new d(this.w));
       }
    }
}
