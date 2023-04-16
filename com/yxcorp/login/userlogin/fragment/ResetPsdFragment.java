package com.yxcorp.login.userlogin.fragment.ResetPsdFragment;
import com.yxcorp.login.userlogin.fragment.LoginFragment;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.CharSequence;
import android.text.TextUtils;
import e17.i;
import java.security.InvalidParameterException;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import android.os.Bundle;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.l;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import y1d.e5;
import erd.g;
import crd.b;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.trello.rxlifecycle3.components.support.RxFragment;
import lnc.b9;

public abstract class ResetPsdFragment extends LoginFragment	// class@001b45
{
    public b r;
    public static final int s;

    public void ResetPsdFragment(){
       super();
    }
    public static void jh(String p0,int p1){
       if (PatchProxy.isSupport(ResetPsdFragment.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, ResetPsdFragment.class, "2")) {
          return;
       }
       if (!TextUtils.isEmpty(p0)) {
          return;
       }
       i.a(R.style.arg_RES_7f11066a, p1);
       throw new InvalidParameterException();
    }
    public abstract int getLayoutResId();
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ResetPsdFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(ResetPsdFragment.class, null);
       return objectsByTag;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ResetPsdFragment.class, "3")) {
          return;
       }
       super.onCreate(p0);
       this.r = RxBus.f.g(l.class, RxBus$ThreadMode.MAIN).subscribe(new e5(this));
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, ResetPsdFragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, this.getLayoutResId(), p1, false);
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, ResetPsdFragment.class, "4")) {
          return;
       }
       super.onDestroy();
       b9.a(this.r);
       return;
    }
}
