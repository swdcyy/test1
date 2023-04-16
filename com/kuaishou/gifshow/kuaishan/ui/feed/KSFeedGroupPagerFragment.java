package com.kuaishou.gifshow.kuaishan.ui.feed.KSFeedGroupPagerFragment;
import mm6.c;
import h26.a;
import im8.g;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.gifshow.kuaishan.ui.feed.KSFeedGroupPagerFragment$a;
import nsd.u;
import b9c.b0;
import b9c.w;
import b9c.a;
import b9c.c;
import androidx.lifecycle.MutableLiveData;
import mm6.b;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.post.api.feature.kuaishan.model.KuaishanPageParam;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import u80.e;
import java.lang.StringBuilder;
import w46.b;
import q87.c;
import com.kuaishou.gifshow.kuaishan.model.KSLaunchParams;
import java.util.Objects;
import q90.f;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import com.kuaishou.gifshow.kuaishan.ui.preview.KSPostPreviewActivity;
import brd.t;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$a;
import kotlin.Pair;
import java.lang.Boolean;
import com.kuaishou.gifshow.kuaishan.ui.feed.KSFeedListFragment;
import crd.b;
import q90.e;
import java.util.Map;
import java.util.HashMap;
import android.graphics.drawable.Drawable;
import java.lang.Integer;
import androidx.fragment.app.c;
import java.util.List;
import java.util.Iterator;
import q90.p;
import q90.y;
import android.os.Bundle;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;
import android.content.Intent;
import q90.i;
import java.lang.Runnable;
import ekd.k1;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.kuaishou.gifshow.kuaishan.model.KSLaunchParams$b;
import com.kuaishou.gifshow.kuaishan.logic.m1;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import i2b.a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import android.view.KeyEvent;
import hka.d;
import hka.c;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;

public final class KSFeedGroupPagerFragment extends BaseFragment implements c, a, g	// class@001ac5
{
    public KSLaunchParams j;
    public BaseFragment k;
    public final MutableLiveData l;
    public PresenterV2 m;
    public f n;
    public final MutableLiveData o;
    public static final KSFeedGroupPagerFragment$a p;

    static {
       KSFeedGroupPagerFragment.p = new KSFeedGroupPagerFragment$a(null);
    }
    public void KSFeedGroupPagerFragment(){
       super(null, null, null, null, 15, null);
       this.l = super();
       this.o = new MutableLiveData();
    }
    public int Ff(){
       return b.c(this);
    }
    public int S5(){
       return b.d(this);
    }
    public String Xa(){
       Object obj = PatchProxy.apply(null, this, KSFeedGroupPagerFragment.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PRODUCE_PLAY_LIBRARY";
    }
    public void Zb(KuaishanPageParam p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSFeedGroupPagerFragment.class, "15")) {
          return;
       }
       a.p(p0, "pageParam");
       String str = "KSFeedGroupPager";
       int i = 0;
       if (TextUtils.x(p0.mInitTemplateId)) {
          Object[] objArray = new Object[i];
          e.D().t(str, "navigateToTemplate: templateId is invalid, cannot navigate with: "+p0, objArray);
          return;
       }else {
          Object[] objArray1 = new Object[i];
          e.D().w(str, "navigateToTemplate: "+p0, objArray1);
          KSLaunchParams kSLaunchPara = KSLaunchParams.createdByKSPageParam(p0);
          a.o(kSLaunchPara, "KSLaunchParams.createdByKSPageParam\(pageParam\)");
          this.j = kSLaunchPara;
          KSFeedGroupPagerFragment tn = this.n;
          if (tn == null) {
             a.S("mKSFeedGroupPagerPresenter");
          }
          KSFeedGroupPagerFragment tj = this.j;
          str = "mKSLaunchParam";
          if (tj == null) {
             a.S(str);
          }
          Objects.requireNonNull(tn);
          if (!PatchProxy.applyVoidOneRefs(tj, tn, f.class, "22")) {
             a.p(tj, "newParam");
             tn.v = tj;
          }
          tn = this.j;
          if (tn == null) {
             a.S(str);
          }
          if (!PatchProxy.applyVoidOneRefs(tn, this, KSFeedGroupPagerFragment.class, "14")) {
             FragmentActivity activity = this.getActivity();
             if (activity != null) {
                KSPostPreviewActivity.I3(tn, activity, i);
             }
          }
          return;
       }
    }
    public t a(){
       Object[] objArray2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       KSFeedGroupPagerFragment obj = PatchProxy.apply(objArray, this, KSFeedGroupPagerFragment.class, "17");
       if (obj != patchProxyRe) {
          return obj;
       }
       int i = 0;
       Object[] objArray1 = new Object[i];
       e.D().w("KSFeedGroupPager", "refresh:", objArray1);
       obj = this.n;
       if (obj == null) {
          a.S("mKSFeedGroupPagerPresenter");
       }
       Objects.requireNonNull(obj);
       t ot = PatchProxy.apply(objArray, obj, f.class, "24");
       if (ot != patchProxyRe) {
       }else {
          String str = "KSFeedGroupPagerPresenter";
          if (!KSDataManager.q.a().i0()) {
             f u = obj.u;
             if (u == null) {
                a.S("mFragment");
             }
             if (u instanceof KSFeedGroupPagerFragment) {
                objArray2 = new Object[i];
                e.D().s(str, "refresh\(\): No groups data yet, fetch groups first", objArray2);
                obj.A.setValue(new Pair(objArray, Boolean.TRUE));
                obj.V8();
                ot = obj.S8(objArray);
             }
          }
          KSFeedListFragment kSFeedListFr = obj.W8();
          String str1 = "Observable.just\(false\)";
          if (kSFeedListFr == null) {
             Object[] objArray3 = new Object[i];
             e.D().t(str, "refresh\(\): page not ready, ignore", objArray3);
             ot = t.just(Boolean.FALSE);
             a.o(ot, str1);
          }else {
             String str2 = kSFeedListFr.Hh();
             f b = obj.B;
             String str3 = "refresh\(\): Group ";
             if (b != null) {
                a.m(b);
                if (!b.isDisposed()) {
                   objArray2 = new Object[i];
                   e.D().s(str, str3+str2+" is loading, ignore", objArray2);
                   ot = t.just(Boolean.FALSE);
                   a.o(ot, str1);
                }
             }
             objArray2 = new Object[i];
             e.D().s(str, str3+str2+" pull to refreshing", objArray2);
             obj.A.setValue(new Pair(str2, Boolean.TRUE));
             ot = obj.S8(kSFeedListFr);
          }
       }
       return ot;
    }
    public boolean a4(){
       return true;
    }
    public void dg(Activity p0){
    }
    public boolean f9(){
       return b.f(this);
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KSFeedGroupPagerFragment.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new e();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, KSFeedGroupPagerFragment.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(KSFeedGroupPagerFragment.class, new e());
       }else {
          obj.put(KSFeedGroupPagerFragment.class, null);
       }
       return obj;
    }
    public String getPageParams(){
       StringBuilder obj = PatchProxy.apply(null, this, KSFeedGroupPagerFragment.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "task_id=";
       KSFeedGroupPagerFragment tj = this.j;
       if (tj == null) {
          a.S("mKSLaunchParam");
       }
       return obj+tj.getTaskId();
    }
    public Drawable i9(){
       return b.i(this);
    }
    public MutableLiveData k5(){
       Object obj = PatchProxy.apply(null, this, KSFeedGroupPagerFragment.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[0];
       e.D().w("KSFeedGroupPager", "observeHeaderCollapseRequest:", objArray);
       this.o.setValue(Boolean.FALSE);
       return this.o;
    }
    public void ld(int p0,int p1){
       KSFeedListFragment h;
       String str = "11";
       if (PatchProxy.isSupport(KSFeedGroupPagerFragment.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, KSFeedGroupPagerFragment.class, str)) {
          return;
       }
       Object[] objArray = new Object[0];
       e.D().s("KSFeedGroupPager", "OnAppBarLayoutOffsetChanged appBarLayoutHeight:"+p0+", offset:"+p1, objArray);
       c childFragmen = this.getChildFragmentManager();
       a.o(childFragmen, "childFragmentManager");
       Iterator iterator = childFragmen.getFragments().iterator();
       while (iterator.hasNext()) {
          Fragment uFragment = iterator.next();
          if (uFragment instanceof KSFeedListFragment) {
             Objects.requireNonNull(uFragment);
             if (PatchProxy.isSupport(KSFeedListFragment.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), uFragment, KSFeedListFragment.class, str)) {
                continue ;
             }else {
                h = uFragment.H;
                if (h != null) {
                   p op = p.class;
                   if (PatchProxy.isSupport(op) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), h, op, "5")) {
                      continue ;
                   }
                }
             }
          }
          h.m.b(p0, p1);
       }
       KSFeedGroupPagerFragment tn = this.n;
       if (tn == null) {
          a.S("mKSFeedGroupPagerPresenter");
       }
       Objects.requireNonNull(tn);
       f uof = f.class;
       if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), tn, uof, "37")) {
          tn.D.b(p0, p1);
       }
       return;
    }
    public boolean lf(){
       return b.h(this);
    }
    public String o(){
       return "PRODUCE_PLAY_LIBRARY";
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSFeedGroupPagerFragment.class, "8")) {
          return;
       }
       super.onActivityCreated(p0);
       this.k = this;
       if (!PatchProxy.applyVoid(null, this, KSFeedGroupPagerFragment.class, "13")) {
          this.m = new PresenterV2();
          f uof = new f();
          this.n = uof;
          KSFeedGroupPagerFragment tm = this.m;
          if (tm != null) {
             tm.U7(uof);
          }
          KSFeedGroupPagerFragment tm1 = this.m;
          if (tm1 != null) {
             View view = this.getView();
             a.m(view);
             tm1.f(view);
          }
          tm1 = this.m;
          if (tm1 != null) {
             Object[] objArray = new Object[]{this};
             tm1.i(objArray);
          }
       }
       return;
    }
    public void onActivityResult(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(KSFeedGroupPagerFragment.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, KSFeedGroupPagerFragment.class, "9")) {
          return;
       }
       super.onActivityResult(p0, p1, p2);
       if (p0 == 1006) {
          KSFeedGroupPagerFragment tn = this.n;
          if (tn == null) {
             a.S("mKSFeedGroupPagerPresenter");
          }
          Objects.requireNonNull(tn);
          if (!PatchProxy.applyVoid(null, tn, f.class, "23")) {
             tn.b9();
             KSFeedListFragment kSFeedListFr = tn.W8();
             if (kSFeedListFr != null) {
                kSFeedListFr.Jh();
             }
             f v = tn.v;
             if (v == null) {
                a.S("mKSLaunchParam");
             }
             if (!v.getDisallowTemplateLocating()) {
                KSFeedListFragment kSFeedListFr1 = tn.W8();
                if (kSFeedListFr1 != null) {
                   k1.r(new i(kSFeedListFr1), 1);
                }
             }
          }
       label_0068 :
          tn = this.j;
          if (tn == null) {
             a.S("mKSLaunchParam");
          }
          if (!tn.getDisallowTemplateLocating() && KSDataManager.q.a().O() > 1) {
             this.o.setValue(Boolean.TRUE);
          }
          tn = this.j;
          if (tn == null) {
             a.S("mKSLaunchParam");
          }
          tn.setDisallowTemplateLocating(false);
       }
       return;
    }
    public boolean onBackPressed(){
       return false;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSFeedGroupPagerFragment.class, "5")) {
          return;
       }
       super.onCreate(p0);
       p0 = this.getArguments();
       Serializable serializable = (p0 != null)? SerializableHook.getSerializable(p0, "intent_ks_launch_param"): null;
       if (serializable == null) {
          serializable = new KSLaunchParams$b().a();
          a.o(serializable, "KSLaunchParams.Builder\(\).build\(\)");
       }
       this.j = serializable;
       m1 om1 = m1.w0();
       KSFeedGroupPagerFragment tj = this.j;
       if (tj == null) {
          a.S("mKSLaunchParam");
       }
       om1.f = tj.getTaskId();
       om1 = m1.w0();
       tj = this.j;
       if (tj == null) {
          a.S("mKSLaunchParam");
       }
       om1.g = tj.getTemplateId();
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, KSFeedGroupPagerFragment.class, "6");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       a.p(p0, "inflater");
       return a.f(p0, 0x7f0d0724, null);
    }
    public void onDestroyView(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, KSFeedGroupPagerFragment.class, "12")) {
          return;
       }
       super.onDestroyView();
       KSFeedGroupPagerFragment tm = this.m;
       if (tm != null) {
          tm.unbind();
          tm.destroy();
       }
       this.m = objArray;
       tm = this.o;
       KSFeedGroupPagerFragment tk = this.k;
       if (tk == null) {
          a.S("mFragment");
       }
       tm.removeObservers(tk);
       tm = this.l;
       tk = this.k;
       if (tk == null) {
          a.S("mFragment");
       }
       tm.removeObservers(tk);
       return;
    }
    public boolean onKeyDown(int p0,KeyEvent p1){
       return c.a(this, p0, p1);
    }
    public boolean onKeyUp(int p0,KeyEvent p1){
       return c.b(this, p0, p1);
    }
    public void onResume(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, KSFeedGroupPagerFragment.class, "7")) {
          return;
       }
       super.onResume();
       KSFeedGroupPagerFragment tn = this.n;
       if (tn == null) {
          a.S("mKSFeedGroupPagerPresenter");
       }
       Objects.requireNonNull(tn);
       if (!PatchProxy.applyVoid(objArray, tn, f.class, "40")) {
          f x = tn.x;
          if (x == null) {
             a.S("mSelectedGroupId");
          }
          if (a.g(x, "999")) {
             KSFeedListFragment kSFeedListFr = tn.W8();
             if (kSFeedListFr != null) {
                kSFeedListFr.a();
             }
          }
       }
    label_0040 :
       return;
    }
    public boolean re(){
       return b.g(this);
    }
    public MutableLiveData u9(){
       Object obj = PatchProxy.apply(null, this, KSFeedGroupPagerFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[0];
       e.D().w("KSFeedGroupPager", "observeGroupFeedStatus:", objArray);
       this.l.setValue(Boolean.FALSE);
       return this.l;
    }
    public boolean x2(){
       return true;
    }
}
