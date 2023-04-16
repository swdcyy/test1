package com.yxcorp.gifshow.prettify.base.PrettifyBaseFragment;
import im8.g;
import com.kwai.feature.post.api.fragment.FlyWheelBaseFragment;
import io.reactivex.subjects.PublishSubject;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import com.yxcorp.gifshow.prettify.beauty.BeautifyFilterFragment;
import java.util.Objects;
import com.yxcorp.gifshow.prettify.makeup.MakeupFragment;
import com.kwai.robust.PatchProxyResult;
import m0c.k;
import java.util.Map;
import java.util.HashMap;
import g16.c;
import p0c.h;
import p0c.d;
import o0c.a;
import java.lang.Integer;
import android.os.Bundle;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.bubble.PostBubbleManager;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import com.yxcorp.gifshow.prettify.v4.magic.filter.FilterFragment;
import p0c.c;
import com.yxcorp.gifshow.prettify.body.ui.BodySlimmingFragment;
import p0c.b;
import kotlin.jvm.internal.a;
import p0c.f;
import p0c.a;
import i2b.a;
import java.lang.IllegalArgumentException;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.prettify.v4.magic.filter.PrettifyTagView;
import android.util.SparseArray;
import p0c.e;
import oe6.e;
import com.yxcorp.gifshow.prettify.base.b;
import l0c.b;

public class PrettifyBaseFragment extends FlyWheelBaseFragment implements g	// class@0010e9
{
    public BaseFragment n;
    public BaseFragment o;
    public BaseFragment[] p;
    public a q;
    public PublishSubject r;
    public h s;
    public c t;
    public PostBubbleManager u;
    public PublishSubject v;
    public PresenterV2 w;
    public boolean x;
    public b y;

    public void PrettifyBaseFragment(){
       super();
       this.r = PublishSubject.g();
       this.v = PublishSubject.g();
    }
    public String E7(){
       return "Prettify";
    }
    public void ch(boolean p0){
       if (PatchProxy.isSupport(PrettifyBaseFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, PrettifyBaseFragment.class, "16")) {
          return;
       }
       this.v.onNext(Boolean.valueOf(p0));
       return;
    }
    public void dh(){
       if (PatchProxy.applyVoid(null, this, PrettifyBaseFragment.class, "9")) {
          return;
       }
       PrettifyBaseFragment tp = this.p;
       int len = tp.length;
       int i = 0;
       while (i < len) {
          object oobject = tp[i];
          if (oobject instanceof BeautifyFilterFragment) {
             Objects.requireNonNull(oobject);
             if (!PatchProxy.applyVoid(null, oobject, BeautifyFilterFragment.class, "11")) {
                oobject.q.onNext(Boolean.TRUE);
             }
          }
          i = i + 1;
       }
       return;
    }
    public void eh(){
       if (PatchProxy.applyVoid(null, this, PrettifyBaseFragment.class, "11")) {
          return;
       }
       PrettifyBaseFragment tp = this.p;
       int len = tp.length;
       int i = 0;
       while (i < len) {
          object oobject = tp[i];
          if (oobject instanceof MakeupFragment) {
             Objects.requireNonNull(oobject);
             if (!PatchProxy.applyVoid(null, oobject, MakeupFragment.class, "7")) {
                oobject.r.onNext(Boolean.TRUE);
             }
          }
          i = i + 1;
       }
       return;
    }
    public void fh(boolean p0){
       this.x = p0;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PrettifyBaseFragment.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new k();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, PrettifyBaseFragment.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(PrettifyBaseFragment.class, new k());
       }else {
          obj.put(PrettifyBaseFragment.class, null);
       }
       return obj;
    }
    public void gh(c p0){
       this.t = p0;
    }
    public void hh(h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PrettifyBaseFragment.class, "1")) {
          return;
       }
       this.n = this;
       this.s = p0;
       this.q = p0.g().a();
       return;
    }
    public void ih(int p0){
       if (PatchProxy.isSupport(PrettifyBaseFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, PrettifyBaseFragment.class, "8")) {
          return;
       }
       this.r.onNext(Integer.valueOf(p0));
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PrettifyBaseFragment.class, "2")) {
          return;
       }
       super.onCreate(p0);
       if (p0 != null && !p0.getBoolean("pageIsHidden", false)) {
          this.getFragmentManager().beginTransaction().p(this).m();
       }
       PrettifyBaseFragment ts = this.s;
       if (ts != null) {
          this.u = ts.k;
       }
       if (this.u == null) {
          ts = this.n;
          if (ts != null && ts.getActivity() != null) {
             this.u = PostBubbleManager.d(this.n);
          }
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, PrettifyBaseFragment.class, "3");
       if (p2 != patchProxyRe) {
          return p2;
       }
       if (!PatchProxy.applyVoid(null, this, PrettifyBaseFragment.class, "7")) {
          if (!q.f(this.s.g().c())) {
             ArrayList uArrayList = new ArrayList();
             Iterator iterator = this.s.g().c().iterator();
             while (iterator.hasNext()) {
                int i = iterator.next().intValue();
                String str = "1";
                if (i) {
                   if (i != 1) {
                      if (i != 2) {
                         if (i != 3) {
                            continue ;
                         }else {
                            FilterFragment uFilterFragm = new FilterFragment();
                            uFilterFragm.p = this.s.e();
                            uFilterFragm.q = this.s;
                            uFilterFragm.w = this.u;
                            uFilterFragm.v = this.r;
                            uArrayList.add(uFilterFragm);
                            PrettifyBaseFragment tq = this.q;
                            if (tq != null) {
                               tq.r6(uFilterFragm);
                            }
                         }
                      }else {
                         BodySlimmingFragment uBodySlimmin = new BodySlimmingFragment();
                         b uob = this.s.b();
                         Object obj = PatchProxy.applyOneRefs(uob, uBodySlimmin, BodySlimmingFragment.class, str);
                         if (obj != patchProxyRe) {
                            uBodySlimmin = obj;
                         }else {
                            a.p(uob, "_b");
                            uBodySlimmin.r = uob;
                         }
                         uArrayList.add(uBodySlimmin);
                      }
                   }else {
                      MakeupFragment makeupFragme = new MakeupFragment();
                      makeupFragme.o = this.s.i();
                      makeupFragme.p = this;
                      makeupFragme.u = this.r;
                      uArrayList.add(makeupFragme);
                   }
                }else {
                   BeautifyFilterFragment uBeautifyFil = new BeautifyFilterFragment();
                   a uoa = this.s.a();
                   if (!PatchProxy.applyVoidOneRefs(uoa, uBeautifyFil, BeautifyFilterFragment.class, str)) {
                      uBeautifyFil.p = uoa;
                      BeautifyFilterFragment.y = uoa.b;
                   }
                   uBeautifyFil.u = this.u;
                   uBeautifyFil.t = this;
                   uArrayList.add(uBeautifyFil);
                }
             }
             Iterator iterator1 = uArrayList.iterator();
             while (iterator1.hasNext()) {
                iterator1.next().setArguments(this.getArguments());
             }
             BaseFragment[] uBaseFragmen = new BaseFragment[uArrayList.size()];
             this.p = uBaseFragmen;
             this.p = uArrayList.toArray(uBaseFragmen);
          }else {
             throw new IllegalArgumentException("PrettifyFragment sub features can not be empty");
          }
       }
       return a.g(p0, this.s.g().e, p1, false);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, PrettifyBaseFragment.class, "5")) {
          return;
       }
       super.onDestroyView();
       this.w.unbind();
       if (!PatchProxy.applyVoid(null, null, PrettifyTagView.class, "1")) {
          PrettifyTagView.s.clear();
       }
       if (this.s.h() != null) {
          e.A0(false);
       }
       Objects.requireNonNull(this.y);
       return;
    }
    public void onHiddenChanged(boolean p0){
       if (PatchProxy.isSupport(PrettifyBaseFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, PrettifyBaseFragment.class, "6")) {
          return;
       }
       super.onHiddenChanged(p0);
       PrettifyBaseFragment to = this.o;
       if (to != null) {
          to.onHiddenChanged(p0);
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PrettifyBaseFragment.class, "4")) {
          return;
       }
       super.onViewCreated(p0, p1);
       PresenterV2 presenterV2 = new PresenterV2();
       this.w = presenterV2;
       presenterV2.U7(new b());
       this.w.f(p0);
       Object[] objArray = new Object[]{this};
       this.w.i(objArray);
       b uob = new b(p0, this.s);
       this.y = uob;
       Objects.requireNonNull(uob);
       return;
    }
}
