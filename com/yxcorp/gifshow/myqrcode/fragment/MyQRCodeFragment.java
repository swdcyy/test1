package com.yxcorp.gifshow.myqrcode.fragment.MyQRCodeFragment;
import com.yxcorp.gifshow.myqrcode.fragment.MyQRCodeBaseFragment;
import java.lang.String;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.os.Bundle;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.yxcorp.gifshow.myqrcode.fragment.a;
import erd.g;
import crd.b;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.view.Window;
import android.app.Activity;
import i2b.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import tqb.s;
import tqb.v;
import im8.c;

public class MyQRCodeFragment extends MyQRCodeBaseFragment	// class@0020b6
{
    public PresenterV2 k;
    public boolean l;
    public b m;
    public static final int n;

    public void MyQRCodeFragment(){
       super();
       this.l = true;
    }
    public int M(){
       return 1;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MyQRCodeFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(MyQRCodeFragment.class, null);
       return objectsByTag;
    }
    public int getPage(){
       return 19;
    }
    public String getUrl(){
       return "ks://myqrcode";
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MyQRCodeFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       if (!PatchProxy.applyVoid(null, this, MyQRCodeFragment.class, "4")) {
          this.m = this.m().subscribe(a.b);
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, MyQRCodeFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       this.getActivity().getWindow().setFlags(128, 128);
       return a.g(p0, 0x7f0d1039, p1, false);
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, MyQRCodeFragment.class, "5")) {
          return;
       }
       super.onPause();
       MyQRCodeFragment tm = this.m;
       if (tm != null && !tm.isDisposed()) {
          this.m.dispose();
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MyQRCodeFragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       PresenterV2 presenterV2 = new PresenterV2();
       this.k = presenterV2;
       presenterV2.U7(new s());
       this.k.U7(new v());
       this.k.f(p0);
       Object[] objArray = new Object[]{this,new c("FRAGMENT", this)};
       this.k.i(objArray);
       return;
    }
}
