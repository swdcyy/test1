package com.yxcorp.gifshow.follow.stagger.presenter.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.String;
import okhttp3.MediaType;
import java.lang.Object;
import com.google.common.collect.ImmutableList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import f3b.o;
import com.yxcorp.gifshow.follow.stagger.presenter.b;
import erd.r;
import brd.t;
import eja.g;
import kga.c;
import erd.g;
import crd.b;
import java.util.Objects;
import eha.d;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import eha.d$a;
import wkd.b;
import l66.a;
import eja.n;
import com.yxcorp.gifshow.follow.stagger.presenter.d;
import erd.o;
import eja.k;
import eha.e;
import eha.e$a;
import eja.h;
import com.yxcorp.gifshow.follow.stagger.presenter.e;
import eja.l;
import eha.b;
import com.yxcorp.gifshow.util.rx.RxBus;
import cx5.a;
import eha.a;
import io.reactivex.subjects.PublishSubject;
import eja.i;
import com.yxcorp.gifshow.follow.stagger.presenter.f;
import eja.m;
import brd.w;
import eja.j;
import com.yxcorp.gifshow.follow.stagger.presenter.c;
import java.lang.Boolean;
import java.util.Iterator;
import java.util.List;
import vja.e;
import k2b.k2;
import k2b.u1;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class g extends PresenterV2	// class@001211
{
    public d p;
    public e q;
    public b r;
    public PublishSubject s;
    public BaseFeed t;
    public static final MediaType u;
    public static final List v;

    static {
       g.u = MediaType.parse("application/octet-stream");
       g.v = ImmutableList.of(ImmutableList.of(g.R8(7), g.R8(237), g.R8(2)), ImmutableList.of(g.R8(7), "ACQUAINTANCE_CIRCLE", g.R8(2)), ImmutableList.of(g.R8(7), g.R8(4), g.R8(237), g.R8(2)), ImmutableList.of(g.R8(4), g.R8(7), g.R8(237), g.R8(2)), ImmutableList.of(g.R8(4), g.R8(7), "ACQUAINTANCE_CIRCLE", g.R8(2)));
    }
    public void g(){
       super();
    }
    public static String R8(int p0){
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, og, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return o.i(p0);
    }
    public void E8(){
       t ot1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, g.class, "2")) {
          return;
       }
       g a = c.a;
       this.X7(this.s.filter(b.b).subscribe(new g(this), a));
       g tp = this.p;
       Objects.requireNonNull(tp);
       String str = "1";
       d uod = PatchProxy.apply(objArray, tp, d.class, str);
       e uoe = 0x6d2a4fdd;
       if (uod != patchProxyRe) {
       }else if(tp.a.isDetached() || tp.a.getActivity() == null){
          tp.a();
          ot1 = t.empty();
       }else if(tp.c == null){
          tp.c = new d$a(tp);
          b.a(uoe).a(tp.c);
       }
       uod = tp.b;
       t ot = uod.filter(new n(this)).map(d.b).map(new k(this));
       g tq = this.q;
       Objects.requireNonNull(tq);
       e uoe1 = PatchProxy.apply(objArray, tq, e.class, str);
       if (uoe1 != patchProxyRe) {
       }else if(tq.a.isDetached() || tq.a.getActivity() == null){
          tq.a();
          uoe1 = t.empty();
       }else if(tq.c == null){
          tq.c = new e$a(tq);
          b.a(uoe).a(tq.c);
       }
       uoe1 = tq.b;
       ot1 = uoe1.filter(new h(this)).map(e.b).map(new l(this));
       g tr = this.r;
       Objects.requireNonNull(tr);
       b uob = PatchProxy.apply(objArray, tr, b.class, str);
       if (uob != patchProxyRe) {
       }else if(tr.a.isDetached() || tr.a.getActivity() == null){
          tr.a();
          uob = t.empty();
       }else if(tr.c == null){
          uob = tr.b;
          Objects.requireNonNull(uob);
          tr.c = RxBus.f.f(a.class).subscribe(new a(uob), a);
       }
       uob = tr.b;
       this.X7(t.merge(ot, ot1, uob.filter(new i(this)).map(f.b).map(new m(this))).subscribe(new j(this), c.b));
       return;
    }
    public final boolean P8(){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Iterator obj = PatchProxy.apply(null, this, g.class, "4");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = g.v.iterator();
       while (true) {
          boolean b = false;
          if (!obj.hasNext()) {
             return b;
          }
          List list = obj.next();
          k2 obj1 = PatchProxy.applyOneRefs(list, null, e.class, "1");
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else {
             obj1 = u1.j();
             if (obj1 != null) {
                Iterator iterator = list.iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      String str = iterator.next();
                      if (obj1 != null) {
                         String obj2 = PatchProxy.applyTwoRefs(obj1, str, null, e.class, "2");
                         if (obj2 != patchProxyRe) {
                            b1 = obj2.booleanValue();
                         }else if(TextUtils.x(obj1.d)){
                            obj2 = o.i(obj1.c);
                         }else {
                            k2 d = obj1.d;
                         }
                         b1 = TextUtils.n(str, obj2);
                         if (b1) {
                            obj1 = obj1.t;
                         }
                      }
                   }else {
                      b = true;
                   }
                }
                return true;
             }
          }
          if (b) {
          }else {
             continue ;
          }
       }
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       this.p = this.r8("HOME_FOLLOW_PHOTO_COMMENTED_STATE");
       this.q = this.r8("HOME_FOLLOW_PHOTO_LIKED_STATE");
       this.r = this.r8("HOME_FOLLOW_ENTER_PROFILE_STATE");
       this.s = this.r8("HOME_FOLLOW_PHOTO_CLICK_EVENT");
       return;
    }
}
