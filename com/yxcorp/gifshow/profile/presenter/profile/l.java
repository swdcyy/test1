package com.yxcorp.gifshow.profile.presenter.profile.l;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import z5c.k0;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.profile.presenter.profile.l$a;
import java.lang.CharSequence;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lnc.a1;
import java.lang.StringBuilder;
import qvb.i;
import java.lang.Number;
import java.util.List;
import java.util.Iterator;
import com.yxcorp.gifshow.entity.QPhoto;
import w3c.h;
import java.lang.Math;
import s1c.r0;
import brd.t;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import com.yxcorp.gifshow.profile.presenter.profile.h;
import erd.o;
import j4c.f;
import z5c.l0;
import erd.g;
import crd.b;
import com.kwai.framework.model.user.User;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.profile.presenter.profile.f;
import qvb.q;
import qvb.j;
import com.kwai.framework.model.user.UserOwnerCount;
import java.lang.Integer;
import j4c.d;
import android.view.View$OnClickListener;
import l3c.g;
import com.yxcorp.gifshow.profile.constant.ProfileTab;
import k2b.e0;
import t3c.c;
import android.app.Activity;
import com.yxcorp.gifshow.profile.presenter.profile.i;
import kotlin.jvm.internal.a;
import u07.t$a;
import u07.f;
import l3c.h;
import msd.a;
import u07.u;
import l3c.i;
import l3c.j;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.c$b;
import y8c.t;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;

public class l extends PresenterV2	// class@001561
{
    public boolean p;
    public i q;
    public RecyclerFragment r;
    public t s;
    public r0 t;
    public UserOwnerCount u;
    public boolean v;
    public PublishSubject w;
    public final q x;
    public int y;

    public void l(){
       super();
       this.p = k0.c();
       this.w = PublishSubject.g();
       this.x = new l$a(this);
    }
    public static CharSequence P8(l p0){
       Objects.requireNonNull(p0);
       String str = PatchProxy.apply(null, p0, l.class, "15");
       if (str != PatchProxyResult.class) {
       }else if(p0.p != null){
          str = a1.p(R.string.arg_RES_7f10396b);
       }else {
          str = a1.p(0x7f100d28)+"\r\n ";
       }
       return str;
    }
    public static int V8(i p0){
       Iterator obj = PatchProxy.applyOneRefs(p0, null, l.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (!p0.getCount()) {
          return 0;
       }
       obj = p0.getItems().iterator();
       int i = 0;
       while (obj.hasNext()) {
          if (h.a(obj.next())) {
             i = i + 1;
          }
       }
       return Math.max((p0.getCount() - i), 0);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, l.class, "2")) {
          return;
       }
       this.X7(this.t.b.observable().distinctUntilChanged(h.b).subscribe(new f(this), l0.a));
       this.u = this.t.b.mOwnerCount;
       this.X7(this.w.debounce(500, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new f(this)));
       this.q.h(this.x);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, l.class, "4")) {
          return;
       }
       this.q.f(this.x);
       this.u = null;
       return;
    }
    public final int R8(){
       Object obj = PatchProxy.apply(null, this, l.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Math.max((this.u.mLike - l.V8(this.q)), 0);
    }
    public final CharSequence S8(int p0){
       l ol = l.class;
       if (PatchProxy.isSupport(ol)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ol, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return g.a(a1.q(0x7f103f24, p0), true, new d(this));
    }
    public final void W8(){
       if (PatchProxy.applyVoid(null, this, l.class, "14")) {
          return;
       }
       c.c(this.r, this.R8(), ProfileTab.TAB_LIKE);
       return;
    }
    public final void X8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, l.class, "8")) {
          return;
       }
       if (this.getActivity() == null) {
          return;
       }
       Activity activity = this.getActivity();
       l tr = this.r;
       r0 c = this.t.c;
       int i = this.R8();
       i oi = new i(this);
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          Object[] objArray1 = new Object[]{activity,tr,Integer.valueOf(c),Integer.valueOf(i),oi};
          if (PatchProxy.applyVoid(objArray1, objArray, og, "3")) {
          label_00bc :
             c.b(this.r, this.R8(), ProfileTab.TAB_LIKE);
             return;
          }
       }
       a.p(activity, "activity");
       a.p(tr, "logPage");
       a.p(oi, "onPositive");
       objArray = 6;
       ProfileTab tAB_LIKE = (c != objArray)? ProfileTab.TAB_LIKE: ProfileTab.TAB_COLLECT;
       t$a uoa = f.e(new t$a(activity));
       uoa.X0(a1.p(R.string.arg_RES_7f103f1f));
       Objects.requireNonNull(g.a);
       int i1 = (c != objArray)? 0x7f103f1e: 0x7f103f1c;
       uoa.z0(a1.p(i1));
       uoa.T0(a1.p(R.string.arg_RES_7f103f1d));
       uoa.R0(a1.p(R.string.cancel));
       uoa.u0(new h(tr, i, tAB_LIKE, oi));
       uoa.t0(new i(tr, i, tAB_LIKE));
       uoa.Y(new j(tr, i, tAB_LIKE));
       goto label_00bc ;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, l.class, "1")) {
          return;
       }
       this.q = this.r8("PAGE_LIST");
       this.s = this.q8(t.class);
       this.t = this.q8(r0.class);
       this.r = this.r8("FRAGMENT");
       return;
    }
}
