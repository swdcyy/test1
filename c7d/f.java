package c7d.f;
import i8d.j0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import nfd.t0;
import android.view.View;
import com.yxcorp.plugin.search.utils.j0;
import com.yxcorp.plugin.search.entity.SearchItem;
import com.yxcorp.plugin.search.result.fragment.SearchResultFragment;
import gbd.s;
import c7d.f$a;
import java.util.List;
import q7d.b;
import g9c.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Number;
import nfd.r2;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ekd.m1;
import androidx.recyclerview.widget.RecyclerView$n;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class f extends j0	// class@0004f2
{
    public f$a A;
    public SearchItem x;
    public SearchResultFragment y;
    public RecyclerView z;

    public void f(){
       super();
    }
    public void E8(){
       f uof = f.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uof, "3")) {
          return;
       }
       j0.D(this.z, (float)t0.e);
       if (!PatchProxy.applyVoid(objArray, this, uof, "4")) {
          if (!PatchProxy.applyVoid(objArray, this, uof, "5") && !this.x.isShowed()) {
             this.x.setShowed(true);
             s.c(this.y, 0, 0, this.x);
          }
          f$a uoa = new f$a(this.x, this.y);
          this.A = uoa;
          uoa.W0(b.c(this.x));
          this.z.setAdapter(this.A);
       }
       return;
    }
    public View V8(int p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uof, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.h0().getLayoutManager().findViewByPosition(p0);
    }
    public int W8(QPhoto p0){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       List obj = PatchProxy.applyOneRefs(p0, this, f.class, "6");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       obj = b.c(this.x);
       Object obj1 = PatchProxy.applyTwoRefs(obj, p0, null, r2.class, "5");
       if (obj1 != patchProxyRe) {
          i = obj1.intValue();
       }else if(obj == null || p0 == null){
          int i1 = 0;
          while (true) {
             if (i1 < obj.size()) {
                if (TextUtils.n(r2.b(obj.get(i1)), r2.b(p0))) {
                   i = i1;
                   break ;
                }else {
                   i1 = i1 + 1;
                }
             }
          }
       }
       i = -1;
       return i;
    }
    public void doBindView(View p0){
       Object obj1;
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "2")) {
          return;
       }
       RecyclerView recyclerView = m1.f(p0, R.id.puzzle);
       this.z = recyclerView;
       int i = t0.b + t0.a;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       j0 oj0 = j0.class;
       Object obj = null;
       if (PatchProxy.isSupport(oj0)) {
          obj1 = PatchProxy.applyOneRefs(Integer.valueOf(i), obj, oj0, "8");
          if (obj1 != patchProxyRe) {
          }else if(PatchProxy.isSupport(oj0)){
             Object obj2 = PatchProxy.applyTwoRefs(Integer.valueOf(i), Integer.valueOf(i), obj, oj0, "9");
             if (obj2 != patchProxyRe) {
                obj1 = obj2;
             }
          }
          obj1 = j0.n(0, 0, 0, 0, i, i);
       }else {
          goto label_0038 ;
       }
       recyclerView.addItemDecoration(obj1);
       return;
    }
    public RecyclerView h0(){
       return this.z;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       super.j8();
       this.x = this.q8(SearchItem.class);
       this.y = this.r8("FRAGMENT");
       return;
    }
}
