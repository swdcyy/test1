package aoa.b;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d$b;
import h3.a;
import yna.g;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.Result;
import java.util.Collection;
import qrd.l1;
import java.lang.Throwable;
import qrd.j0;
import cra.w;
import q87.c;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.view.ViewGroup;
import java.util.Map;
import android.view.View;
import com.kwai.feature.api.feed.growth.model.InterestTagResponse$InterestTagItem;
import i2b.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import yna.h;
import java.lang.Boolean;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.yxcorp.utility.n;
import android.widget.TextView;

public final class b extends a implements PagerSlidingTabStrip$d$b	// class@000297
{
    public final List d;
    public final Map e;
    public final g f;
    public final BaseFragment g;

    public void b(g p0,BaseFragment p1){
       a.p(p0, "caller");
       a.p(p1, "fragment");
       super();
       this.d = new ArrayList();
       this.e = new HashMap();
       this.f = p0;
       this.g = p1;
    }
    public final void A(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       this.d.clear();
       this.d.addAll(p0);
       this.q();
       p0 = Result.constructor-impl(l1.a);
       Throwable throwable = Result.exceptionOrNull-impl(p0);
       if (throwable != null) {
          w.C().e("interestEdit", "TagPageAdapter updateSource", throwable);
       }
       return;
    }
    public PagerSlidingTabStrip$d b(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.z(p0);
    }
    public int c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       int i1 = this.j();
       while (true) {
          if (i < i1) {
             if (TextUtils.n(p0, this.b(i).c())) {
                break ;
             }else {
                i = i + 1;
             }
          }else {
             Result.constructor-impl(l1.a);
             return -1;
          }
       }
       return i;
    }
    public String d(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       PagerSlidingTabStrip$d uod = this.b(p0);
       if (TextUtils.x(uod.c())) {
          return "";
       }else {
          String str = uod.c();
          a.o(str, "tab.id");
          return str;
       }
    }
    public PagerSlidingTabStrip$d e(String p0){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, uob, "10");
       if (obj != patchProxyRe) {
          return obj;
       }
       Object obj1 = PatchProxy.applyOneRefs(p0, this, uob, "11");
       if (obj1 != patchProxyRe) {
          i = obj1.intValue();
       }else {
          int i1 = 0;
          int i2 = this.j();
          while (true) {
             if (i1 < i2) {
                if (TextUtils.n(p0, this.b(i1).c())) {
                   i = i1;
                   break ;
                }else {
                   i1 = i1 + 1;
                }
             }else {
                Result.constructor-impl(l1.a);
                i = -1;
                break ;
             }
          }
       }
       return this.z(i);
    }
    public void h(ViewGroup p0,int p1,Object p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, b.class, "6")) {
          return;
       }
       a.p(p0, "container");
       a.p(p2, "object");
       p0.removeView(this.e.get(Integer.valueOf(p1)));
       p0 = Result.constructor-impl(l1.a);
       Throwable throwable = Result.exceptionOrNull-impl(p0);
       if (throwable != null) {
          w.C().e("interestEdit", "TagPageAdapter destroyItem", throwable);
       }
       return;
    }
    public int j(){
       Object obj = PatchProxy.apply(null, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.d.size();
    }
    public CharSequence l(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.d.get(p0).mTagName;
    }
    public Object o(ViewGroup p0,int p1){
       View obj;
       View view;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "2");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       a.p(p0, "container");
       obj = this.e.get(Integer.valueOf(p1));
       if (obj != null) {
          p0.addView(obj);
          return obj;
       }else if(PatchProxy.isSupport(uob)){
          view = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "3");
          if (view != patchProxyRe) {
          label_00ad :
             return view;
          }
       }
       view = a.i(p0, R.layout.arg_RES_7f0d055d);
       p0.addView(view);
       PresenterV2 presenterV2 = new PresenterV2();
       presenterV2.U7(new h(this.d.get(p1)));
       presenterV2.f(view);
       Object[] objArray = new Object[]{this.f};
       presenterV2.i(objArray);
       a.o(view, "view");
       view.setTag(Integer.valueOf(p1));
       this.e.put(Integer.valueOf(p1), view);
       presenterV2 = Result.constructor-impl(l1.a);
       Throwable throwable = Result.exceptionOrNull-impl(presenterV2);
       if (throwable != null) {
          w.C().e("interestEdit", "TagPageAdapter getHolderView", throwable);
       }
       a.o(view, "view");
       goto label_00ad ;
    }
    public boolean p(View p0,Object p1){
       boolean b;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "view");
       a.p(p1, "object");
       b = (p0 == p1)? true: false;
       return b;
    }
    public final PagerSlidingTabStrip$d z(int p0){
       PagerSlidingTabStrip$d obj;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "13");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       View view = n.G(this.g.getContext(), R.layout.arg_RES_7f0d0561);
       a.o(view, "ViewUtil.inflate\(mFragme¡­growth_interest_tab_view\)");
       view.setText(this.d.get(p0).mTagName);
       obj = new PagerSlidingTabStrip$d(String.valueOf(p0), view);
       obj.g(false);
       return obj;
    }
}
