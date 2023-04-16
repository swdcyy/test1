package c7d.f$a;
import y8c.g;
import com.yxcorp.plugin.search.entity.SearchItem;
import com.yxcorp.plugin.search.result.fragment.SearchResultFragment;
import y8c.f;
import java.util.ArrayList;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import nfd.i2;
import g9c.a;
import java.util.Objects;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import c7d.e;
import ml8.c;

public class f$a extends g	// class@0004f1
{
    public SearchItem w;
    public SearchResultFragment x;

    public void f$a(SearchItem p0,SearchResultFragment p1){
       super();
       this.w = p0;
       this.x = p1;
    }
    public ArrayList a1(int p0,f p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       f$a uoa = f$a.class;
       if (PatchProxy.isSupport(uoa)) {
          p1 = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uoa, "2");
          if (p1 != patchProxyRe) {
             return p1;
          }
       }
       i2 oi2 = i2.c().a("SEARCH_ITEM", this.w).a("SEARCH_PHOTO", this.N0(p0));
       f$a tx = this.x;
       Objects.requireNonNull(oi2);
       Object obj = PatchProxy.applyOneRefs(tx, oi2, i2.class, "3");
       if (obj != patchProxyRe) {
          oi2 = obj;
       }else {
          oi2.a.add(tx);
       }
       return oi2.b();
    }
    public f h1(ViewGroup p0,int p1){
       PresenterV2 obj;
       f$a uoa = f$a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new PresenterV2();
       obj.U7(new e());
       return new f(a.i(p0, 0x7f0d13af), obj);
    }
}
