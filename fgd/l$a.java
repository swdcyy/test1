package fgd.l$a;
import android.view.View$OnClickListener;
import fgd.l;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.concurrent.atomic.AtomicBoolean;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import kotlin.jvm.internal.a;
import bgd.c;
import lnc.y6;
import com.yxcorp.gifshow.util.LoadPolicy;
import om6.d;
import brd.a0;
import fgd.l$a$a;
import erd.g;
import crd.b;
import com.kwai.framework.cache.initmodule.CheckDiskModule;
import com.yxcorp.plugin.setting.cache.activity.CacheDetailActivity;
import android.content.Intent;
import android.content.Context;
import java.util.Objects;
import androidx.fragment.app.FragmentActivity;
import com.kwai.moved.ks_page.fragment.AttrAnimProgressFragment;
import java.lang.ref.WeakReference;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.AlbumKwaiDialogFragment;
import x56.d;
import java.util.concurrent.TimeUnit;
import brd.t;
import fgd.p;
import erd.o;
import fgd.o;
import io.reactivex.g;
import t45.d;
import brd.z;
import brd.w;
import fgd.n;

public final class l$a implements View$OnClickListener	// class@000e2c
{
    public final l b;

    public void l$a(l p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, l$a.class, str)) {
          return;
       }
       if (!this.b.v.get() && this.b.getActivity() != null) {
          Activity activity = this.b.getActivity();
          a.m(activity);
          String str1 = "activity!!";
          a.o(activity, str1);
          if (!activity.isFinishing()) {
             activity = this.b.getActivity();
             a.m(activity);
             a.o(activity, str1);
             if (!activity.isDestroyed()) {
                l q = this.b.q;
                if (q == null) {
                   a.S("mClearCacheInfo");
                }
                if (q.a() == 1) {
                   this.b.R8("DRAFT_BOX");
                   y6.s(d.class, LoadPolicy.DIALOG).Q(new l$a$a(this));
                   return;
                }else {
                   int i = 0;
                   if (CheckDiskModule.y) {
                      this.b.R8("TO_CLEAN");
                      activity = this.b.getActivity();
                      CacheDetailActivity uCacheDetail = CacheDetailActivity.class;
                      if (!PatchProxy.applyVoidOneRefs(activity, null, uCacheDetail, str)) {
                         Intent intent = new Intent(activity, uCacheDetail);
                         intent.putExtra("KEY_PAGE_TYPE", i);
                         activity.startActivity(intent);
                      }
                   }else {
                      l$a tb = this.b;
                      Activity activity1 = tb.getActivity();
                      Objects.requireNonNull(activity1, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                      Objects.requireNonNull(tb);
                      if (!PatchProxy.applyVoidOneRefs(activity1, tb, l.class, "6")) {
                         AttrAnimProgressFragment uAttrAnimPro = new AttrAnimProgressFragment();
                         WeakReference weakReferenc = new WeakReference(uAttrAnimPro);
                         uAttrAnimPro.jh(R.string.arg_RES_7f1005aa);
                         uAttrAnimPro.setCancelable(i);
                         uAttrAnimPro.show(activity1.getSupportFragmentManager(), "runner");
                         d t = CheckDiskModule.t;
                         if (t != null) {
                            a.m(t);
                            t = t.manualClearCacheTimeout;
                         }else {
                            i = 5;
                         }
                         tb.x = t.merge(t.create(new o(tb)).subscribeOn(d.c), t.timer((long)t, TimeUnit.SECONDS).map(p.b)).observeOn(d.a).subscribe(new n(tb, weakReferenc));
                      }
                   }
                }
             }
          }
       }
       return;
    }
}
