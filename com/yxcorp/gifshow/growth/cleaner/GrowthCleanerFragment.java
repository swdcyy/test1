package com.yxcorp.gifshow.growth.cleaner.GrowthCleanerFragment;
import im8.g;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import b9c.b0;
import b9c.w;
import b9c.a;
import b9c.c;
import nsd.u;
import io.reactivex.subjects.PublishSubject;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ena.f;
import java.util.Map;
import java.util.HashMap;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import i2b.a;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import fna.k;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerCorePresenter;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerSuccessPresenter;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerReDispatchPresenter;
import fna.f0;
import qrd.l1;

public final class GrowthCleanerFragment extends BaseFragment implements g	// class@0012fa
{
    public final PublishSubject j;
    public final ArrayList k;
    public final ArrayList l;
    public PresenterV2 m;

    public void GrowthCleanerFragment(){
       super(null, null, null, null, 15, null);
       PublishSubject this = PublishSubject.g();
       a.o(this, "PublishSubject.create\(\)");
       this.j = this;
       this.k = super();
       this.l = new ArrayList();
    }
    public int M(){
       return 1;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GrowthCleanerFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new f();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, GrowthCleanerFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(GrowthCleanerFragment.class, new f());
       }else {
          obj.put(GrowthCleanerFragment.class, null);
       }
       return obj;
    }
    public String getUrl(){
       return "ks://growth_cleaner";
    }
    public String o(){
       return "CLEAN_RUBBISH";
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, GrowthCleanerFragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       return a.g(p0, 0x7f0d0552, p1, false);
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, GrowthCleanerFragment.class, "4")) {
          return;
       }
       super.onDestroy();
       GrowthCleanerFragment tm = this.m;
       if (tm != null) {
          tm.destroy();
       }
       this.m = null;
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, GrowthCleanerFragment.class, "3")) {
          return;
       }
       super.onDestroyView();
       GrowthCleanerFragment tm = this.m;
       if (tm != null) {
          tm.unbind();
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, GrowthCleanerFragment.class, "2")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       PresenterV2 presenterV2 = new PresenterV2();
       presenterV2.U7(new k());
       presenterV2.U7(new GrowthCleanerCorePresenter());
       presenterV2.U7(new GrowthCleanerSuccessPresenter());
       presenterV2.U7(new GrowthCleanerReDispatchPresenter());
       presenterV2.U7(new f0());
       presenterV2.f(p0);
       Object[] objArray = new Object[]{this};
       presenterV2.i(objArray);
       this.m = presenterV2;
       return;
    }
}
