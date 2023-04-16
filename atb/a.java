package atb.a;
import y8c.g;
import lcc.a;
import java.lang.Object;
import atb.b;
import a9c.e;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import y8c.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import g9c.a;
import ctb.a;
import android.view.ViewGroup;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import etb.v;
import etb.d0;
import android.view.View;
import i2b.a;
import ml8.c;
import etb.i0;
import ekd.p1;

public class a extends g	// class@000301
{
    public final a w;
    public final ArrayList x;

    public void a(a p0,Object[] p1){
       super(new b());
       this.w = p0;
       this.x = Lists.e(p1);
       this.G0(true);
    }
    public ArrayList a1(int p0,f p1){
       return this.x;
    }
    public long d0(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "2");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       return this.w.a(this.N0(p0));
    }
    public int f0(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       a uoa1 = this.N0(p0);
       uoa1 = (uoa1 == null)? 0: uoa1.d;
       return uoa1;
    }
    public f h1(ViewGroup p0,int p1){
       PresenterV2 presenterV2;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p1 == 1) {
          presenterV2 = new PresenterV2();
          presenterV2.U7(new v());
          presenterV2.U7(new d0());
          return new f(a.i(p0, 0x7f0d10b7), presenterV2);
       }else if(p1 == 2){
          presenterV2 = new PresenterV2();
          presenterV2.U7(new v());
          presenterV2.U7(new i0());
          return new f(a.i(p0, 0x7f0d10b9), presenterV2);
       }else if(p1 == 3){
          return new f(a.i(p0, 0x7f0d10ba), new PresenterV2());
       }else {
          return new f(p1.b(p0), new PresenterV2());
       }
    }
}
