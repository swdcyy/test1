package fgd.e;
import u07.u;
import fgd.k;
import android.app.Activity;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.util.Objects;
import androidx.fragment.app.FragmentActivity;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.i3;
import com.kwai.moved.ks_page.fragment.AttrAnimProgressFragment;
import java.lang.ref.WeakReference;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.AlbumKwaiDialogFragment;
import com.kwai.framework.cache.initmodule.CheckDiskModule;
import kotlin.jvm.internal.a;
import x56.d;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import bgd.a;
import cgd.b;
import java.util.concurrent.TimeUnit;
import brd.t;
import fgd.h;
import io.reactivex.g;
import t45.d;
import brd.z;
import brd.w;
import fgd.i;
import erd.g;
import crd.b;

public final class e implements u	// class@000e24
{
    public final k b;
    public final Activity c;

    public void e(k p0,Activity p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void a(t p0,View p1){
       e tb = this.b;
       e tc = this.c;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(tc, tb, k.class, "13")) {
       }else {
          i3 oi3 = i3.f();
          oi3.d("btn_type", "CONFIRM");
          tb.V8(tc, "CACHE_CONFIRM_POPUP", oi3.e());
          AttrAnimProgressFragment uAttrAnimPro = new AttrAnimProgressFragment();
          WeakReference weakReferenc = new WeakReference(uAttrAnimPro);
          uAttrAnimPro.jh(R.string.arg_RES_7f1005aa);
          uAttrAnimPro.setCancelable(false);
          uAttrAnimPro.show(tc.getSupportFragmentManager(), "runner");
          d t = CheckDiskModule.t;
          if (t != null) {
             a.m(t);
             t = t.manualClearCacheTimeout;
          }else {
             int i = 5;
          }
          tb.y.clear();
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = tb.x.iterator();
          while (iterator.hasNext()) {
             a uoa = iterator.next();
             if (!uoa.a()) {
                tb.y.add(uoa);
                uArrayList.add(uoa.c());
             }else if(tb.u.L0(uoa.c())){
                long l = 0;
                uoa.f(l);
                if (uoa.b()) {
                   uoa.d = l;
                }
                tb.y.add(uoa);
             }
          }
          tb.w = t.merge(t.create(new h(tb, uArrayList)).subscribeOn(d.c), t.timer((long)t, TimeUnit.SECONDS)).observeOn(d.a).subscribe(new i(tb, weakReferenc));
       }
       return;
    }
}
