package com.yxcorp.gifshow.homepage.log.fps.HomeSceneLifecycleHelper;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.Fragment;
import wq6.d;
import as6.a;
import on5.b;
import com.kwai.kcube.TabIdentifier;
import wq6.h;
import isa.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.trello.rxlifecycle3.android.FragmentEvent;
import gr8.b;
import gr8.c;
import brd.x;
import lta.a;
import erd.g;
import crd.b;
import androidx.lifecycle.Lifecycle;
import com.yxcorp.gifshow.homepage.log.fps.HomeSceneLifecycleHelper$1;
import androidx.lifecycle.LifecycleObserver;

public class HomeSceneLifecycleHelper	// class@00176d
{
    public final BaseFragment a;
    public String b;
    public String c;

    public void HomeSceneLifecycleHelper(BaseFragment p0){
       super();
       this.c = "";
       this.a = p0;
    }
    public String a(BaseFragment p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HomeSceneLifecycleHelper.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       d uod = a.e(p0);
       String str = (uod != null && b.e.equals(uod.M2()))? uod.q("KEY_OPERATE_TAB_CONFIG").m(): "";
       return str;
    }
    public String b(BaseFragment p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, HomeSceneLifecycleHelper.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String str = p0.o();
       if (!TextUtils.isEmpty(p1)) {
          str = "OP_ACTIVITY_PAGE";
       }
       return str;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, HomeSceneLifecycleHelper.class, "1")) {
          return;
       }
       StringBuilder str = "add observer for "+this.a;
       this.a.Vg().j().compose(c.c(this.a.m(), FragmentEvent.DESTROY_VIEW)).subscribe(new a(this));
       this.a.getLifecycle().addObserver(new HomeSceneLifecycleHelper$1(this));
       return;
    }
}
