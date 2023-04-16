package com.yxcorp.gifshow.camera.record.toolbox.PostToolBoxFragment;
import mm6.c;
import im8.g;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import b9c.b0;
import b9c.w;
import b9c.a;
import b9c.c;
import nsd.u;
import io.reactivex.subjects.PublishSubject;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import java.lang.CharSequence;
import k2b.u1;
import kotlin.jvm.internal.a;
import android.app.Activity;
import mm6.b;
import ih9.p;
import java.util.Map;
import java.util.HashMap;
import java.lang.StringBuilder;
import android.graphics.drawable.Drawable;
import android.content.Intent;
import java.lang.Integer;
import ih9.a;
import androidx.fragment.app.FragmentActivity;
import mm6.a;
import java.util.Objects;
import lnc.a1;
import com.kwai.feature.post.api.feature.kuaishan.model.KuaishanPageParam$a;
import com.kwai.feature.post.api.feature.kuaishan.model.KuaishanPageParam;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.KeyEvent;
import hka.d;
import hka.c;
import com.yxcorp.utility.TextUtils;
import lh9.d;
import jh9.d;
import jh9.a;
import jh9.e;
import qrd.l1;
import ekd.m1;

public final class PostToolBoxFragment extends BaseFragment implements c, g	// class@000f5c
{
    public PostToolBoxFragment j;
    public String k;
    public KuaishanPageParam l;
    public PublishSubject m;
    public PublishSubject n;
    public PublishSubject o;
    public PublishSubject p;
    public String q;
    public int r;
    public PresenterV2 s;
    public boolean t;
    public View u;
    public boolean v;

    public void PostToolBoxFragment(){
       super(null, null, null, null, 15, null);
       this.m = PublishSubject.g();
       this.n = PublishSubject.g();
       this.o = PublishSubject.g();
       this.p = PublishSubject.g();
    }
    public int Ff(){
       return 0x7f062022;
    }
    public int S5(){
       return 0x7f082465;
    }
    public String Xa(){
       Object obj = PatchProxy.apply(null, this, PostToolBoxFragment.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PRODUCE_PLAY_LIBRARY";
    }
    public boolean Xg(){
       Object obj = PatchProxy.apply(null, this, PostToolBoxFragment.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (this.isHidden() ^ 0x01);
    }
    public boolean a4(){
       return true;
    }
    public final String ch(){
       PostToolBoxFragment postToolBoxF;
       Object[] objArray = null;
       Bundle obj = PatchProxy.apply(objArray, this, PostToolBoxFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.q == null) {
          obj = this.getArguments();
          if (obj != null) {
             objArray = obj.getString("task_id");
          }
          postToolBoxF = (objArray == null || !objArray.length())? 1: null;
          if (postToolBoxF) {
             objArray = u1.f();
          }
          a.m(objArray);
          this.q = objArray;
       }
       postToolBoxF = this.q;
       if (postToolBoxF == null) {
          a.S("taskId");
       }
       return postToolBoxF;
    }
    public void dg(Activity p0){
    }
    public boolean f9(){
       return b.f(this);
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PostToolBoxFragment.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new p();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, PostToolBoxFragment.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(PostToolBoxFragment.class, new p());
       }else {
          obj.put(PostToolBoxFragment.class, null);
       }
       return obj;
    }
    public String getPageParams(){
       Object obj = PatchProxy.apply(null, this, PostToolBoxFragment.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "task_id="+this.ch();
    }
    public Drawable i9(){
       return b.i(this);
    }
    public boolean lf(){
       return b.h(this);
    }
    public String o(){
       return "PRODUCE_PLAY_LIBRARY";
    }
    public void onActivityResult(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(PostToolBoxFragment.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, PostToolBoxFragment.class, "19")) {
          return;
       }
       super.onActivityResult(p0, p1, p2);
       PostToolBoxFragment tp = this.p;
       if (tp != null) {
          tp.onNext(new a(p0, p1, p2));
       }
       return;
    }
    public boolean onBackPressed(){
       FragmentActivity obj = PatchProxy.apply(null, this, PostToolBoxFragment.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.getActivity() == null) {
          return false;
       }
       if (this.t == null && (this.getActivity() instanceof a && this.v == null)) {
          obj = this.getActivity();
          Objects.requireNonNull(obj, "null cannot be cast to non-null type com.kwai.gifshow.post.api.core.interfaces.CameraActivityService");
          obj.A0();
       }else {
          obj = this.getActivity();
          if (obj != null) {
             obj.finish();
          }
          obj = this.getActivity();
          if (obj != null) {
             obj.overridePendingTransition(R.anim.arg_RES_7f0100e5, 0x7f010112);
          }
       }
       return true;
    }
    public void onCreate(Bundle p0){
       String str;
       String str1;
       if (PatchProxy.applyVoidOneRefs(p0, this, PostToolBoxFragment.class, "9")) {
          return;
       }
       super.onCreate(p0);
       this.q = this.ch();
       p0 = this.getArguments();
       if (p0 != null) {
          str = p0.getString("toolbox_title");
          if (str != null) {
          label_002f :
             this.k = str;
             str = this.getArguments();
             boolean b = false;
             int intx = (str != null)? str.getInt("recordByMusicRequestDuartion"): 0;
             this.r = intx;
             KuaishanPageParam$a uoa = new KuaishanPageParam$a();
             PostToolBoxFragment tq = this.q;
             if (tq == null) {
                a.S("taskId");
             }
             uoa = uoa.k(tq);
             Bundle arguments = this.getArguments();
             if (arguments != null) {
                str1 = arguments.getString("toolboxJumpToKuaishanGroupId");
                if (str1 != null) {
                label_0065 :
                   KuaishanPageParam kuaishanPage = uoa.h(str1).f();
                   a.o(kuaishanPage, "KuaishanPageParam.Builde\x20\x02ID\) ?: \"\"\)\n      .build\(\)\x00");
                   this.l = kuaishanPage;
                   FragmentActivity activity = this.getActivity();
                   Intent intent = (activity != null)? activity.getIntent(): null;
                   if (intent != null && intent.getBooleanExtra("backToKuaishan", b) == true) {
                      b = true;
                   }
                   this.v = b;
                   return;
                }
             }
             str1 = "";
             goto label_0065 ;
          }
       }
       str = a1.p(R.string.arg_RES_7f104d5c);
       a.o(str, "CommonUtil.string\(R.string.toolbox_name_v2\)");
       goto label_002f ;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, PostToolBoxFragment.class, "11");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       return a.g(p0, 0x7f0d15bb, p1, false);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, PostToolBoxFragment.class, "13")) {
          return;
       }
       super.onDestroyView();
       PostToolBoxFragment ts = this.s;
       if (ts == null) {
          a.S("presenter");
       }
       ts.unbind();
       this.t = false;
       return;
    }
    public void onHiddenChanged(boolean p0){
       if (PatchProxy.isSupport(PostToolBoxFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, PostToolBoxFragment.class, "16")) {
          return;
       }
       super.onHiddenChanged(p0);
       this.t = false;
       if (!p0) {
          this.Yg();
       }
       return;
    }
    public boolean onKeyDown(int p0,KeyEvent p1){
       return c.a(this, p0, p1);
    }
    public boolean onKeyUp(int p0,KeyEvent p1){
       return c.b(this, p0, p1);
    }
    public void onViewCreated(View p0,Bundle p1){
       boolean b;
       View view;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PostToolBoxFragment.class, "12")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       this.j = this;
       PostToolBoxFragment tl = this.l;
       String str = "kuaishanPageParam";
       if (tl == null) {
          a.S(str);
       }
       if (TextUtils.x(tl.mGroupId)) {
          tl = this.l;
          if (tl == null) {
             a.S(str);
          }
          tl.mGroupId = d.a(this.getActivity());
       }
       tl = this.l;
       if (tl == null) {
          a.S(str);
       }
       KuaishanPageParam mGroupId = tl.mGroupId;
       tl = (mGroupId == null || !mGroupId.length())? 1: null;
       if (!tl) {
          tl = this.l;
          if (tl == null) {
             a.S(str);
          }
          mGroupId = tl.mInitTemplateId;
          mGroupId = (mGroupId == null || !mGroupId.length())? 1: 0;
          if (!mGroupId) {
             b = true;
          label_006a :
             this.t = b;
             if (!PatchProxy.applyVoidOneRefs(p0, this, PostToolBoxFragment.class, "14")) {
                PresenterV2 presenterV2 = new PresenterV2();
                presenterV2.U7(new d());
                presenterV2.U7(new a());
                presenterV2.U7(new e());
                this.s = presenterV2;
                presenterV2.f(p0);
                tl = this.s;
                if (tl == null) {
                   a.S("presenter");
                }
                Object[] objArray = new Object[]{this};
                tl.i(objArray);
             }
             view = m1.f(p0, R.id.toolbox_content);
             a.o(view, "ViewBindUtils.bindWidget¡­ew, R.id.toolbox_content\)");
             this.u = view;
             p0 = p0.findViewById(R.id.title_root);
             if (p0 != null) {
                p0.setVisibility(8);
             }
             return;
          }
       }
       b = false;
       goto label_006a ;
    }
    public boolean re(){
       return true;
    }
    public boolean x2(){
       return true;
    }
}
