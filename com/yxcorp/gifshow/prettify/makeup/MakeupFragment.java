package com.yxcorp.gifshow.prettify.makeup.MakeupFragment;
import im8.g;
import com.kwai.feature.post.api.fragment.FlyWheelBaseFragment;
import io.reactivex.subjects.PublishSubject;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import f1c.c0;
import java.util.Map;
import java.util.HashMap;
import android.os.Bundle;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import p0c.f$a;
import p0c.f;
import o0c.d;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import p0c.e;
import oe6.e;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Boolean;
import com.yxcorp.gifshow.prettify.makeup.y;

public class MakeupFragment extends FlyWheelBaseFragment implements g	// class@00115d
{
    public MakeupFragment n;
    public f o;
    public BaseFragment p;
    public PublishSubject q;
    public PublishSubject r;
    public PublishSubject s;
    public PublishSubject t;
    public PublishSubject u;
    public PresenterV2 v;

    public void MakeupFragment(){
       super();
       this.q = PublishSubject.g();
       this.r = PublishSubject.g();
       this.s = PublishSubject.g();
       this.t = PublishSubject.g();
    }
    public String E7(){
       return "Makeup";
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MakeupFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new c0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, MakeupFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(MakeupFragment.class, new c0());
       }else {
          obj.put(MakeupFragment.class, null);
       }
       return obj;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MakeupFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.n = this;
       if (this.o == null) {
          this.o = new f$a().a();
       }
       if (this.o.g() != null) {
          this.o.g().f6();
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, MakeupFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       View view = a.g(p0, this.o.b, p1, false);
       if (this.o.g() != null) {
          this.o.g().W5();
       }
       return view;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, MakeupFragment.class, "5")) {
          return;
       }
       super.onDestroyView();
       if (this.o.g() != null) {
          this.o.g().f5();
       }
       if (this.o.d() != null) {
          e.A0(false);
       }
       this.v.unbind();
       return;
    }
    public void onHiddenChanged(boolean p0){
       if (PatchProxy.isSupport(MakeupFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, MakeupFragment.class, "6")) {
          return;
       }
       super.onHiddenChanged(p0);
       this.q.onNext(Boolean.valueOf(p0));
       if (this.o.g() != null) {
          this.o.g().v6(p0);
       }
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, MakeupFragment.class, "4")) {
          return;
       }
       super.onPause();
       if (this.o.g() != null) {
          this.o.g().n4();
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MakeupFragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       PresenterV2 presenterV2 = new PresenterV2();
       this.v = presenterV2;
       presenterV2.U7(new y());
       this.v.f(p0);
       Object[] objArray = new Object[]{this};
       this.v.i(objArray);
       if (this.o.g() != null) {
          this.o.g().q4(p0, p1);
       }
       return;
    }
}
