package d5c.o0;
import erd.g;
import d5c.t0;
import java.lang.Object;
import java.lang.Integer;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import s1c.r0;
import com.kwai.framework.model.user.ProfileTabModel;
import com.kwai.framework.model.user.User;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import s1c.a;
import s1c.n;
import h3.a;
import androidx.viewpager.widget.ViewPager;
import x5c.b;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import android.util.SparseArray;
import z2c.a;
import s1c.k0;
import com.kwai.robust.PatchProxyResult;
import x5c.c;
import z5c.d3;
import z2c.b;
import com.yxcorp.gifshow.profile.fragment.ProfileTabAsyncLoadFragment;
import s1c.l0;
import android.os.Bundle;
import s1c.m0;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.Iterator;
import java.util.List;
import com.kwai.library.widget.viewpager.tabstrip.b;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.HashMap;
import androidx.fragment.app.Fragment;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip;

public final class o0 implements g	// class@002105
{
    public final t0 b;

    public void o0(t0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       l0 ol0;
       Class uClass;
       o0 tb = this.b;
       int i = p0.intValue();
       Objects.requireNonNull(tb);
       t0 ot0 = t0.class;
       if (!PatchProxy.isSupport(ot0) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), tb, ot0, "11")) {
          r0 or0 = new r0(tb.r, i, tb.R8(i), tb.q, tb.p, tb.t);
          b adapter = tb.u.getAdapter();
          i = adapter.e(String.valueOf(i));
          Object obj = null;
          if (i != null) {
             int i1 = (tb.z.get(v8.c) == null)? obj: tb.z.get(v8.c).a();
             ol0 = PatchProxy.applyThreeRefs(v8, i1, i, null, k0.class, "2");
             if (ol0 != PatchProxyResult.class) {
             }else if(i1 == null){
                r0 c = v8.c;
                a uoa = (d3.a(v8.b))? b.a.get(c): b.b.get(c);
                uClass = (uoa == null)? obj: uoa.a();
                if (uClass == null) {
                   uClass = ProfileTabAsyncLoadFragment.class;
                }
                ol0 = new l0(i, uClass, new Bundle(), k0.b(v8), v8);
             }else {
                ol0 = new m0(i, i1, new Bundle(), k0.b(v8), v8);
             }
          }else {
             i = tb.getContext();
             uClass = (tb.z.get(v8.c) == null)? obj: tb.z.get(v8.c).a();
             ol0 = k0.a(i, v8, uClass);
          }
          if (!PatchProxy.applyVoidOneRefs(ol0, adapter, b.class, "4")) {
             i = 0;
             Iterator iterator = adapter.f.iterator();
             while (iterator.hasNext()) {
                c uoc = iterator.next();
                if (TextUtils.equals(ol0.c().c(), uoc.c().c())) {
                   obj = adapter.h.remove(uoc.f());
                   adapter.f.remove(uoc);
                   adapter.f.add(i, ol0);
                   break ;
                }
                i++;
             }
             b uob = -1;
             if (obj != null) {
                uob = adapter.g.indexOf(obj);
                if (uob >= 0) {
                   i = uob;
                }
             }
             Fragment uFragment = adapter.A(ol0.b(), ol0.a());
             ol0.d(i, uFragment);
             if (uob == i) {
                adapter.g.set(i, uFragment);
             }else {
                adapter.g.add(i, uFragment);
             }
             adapter.h.put(ol0.f(), uFragment);
             adapter.q();
          }
          tb.v.q();
       }
       return;
    }
}
