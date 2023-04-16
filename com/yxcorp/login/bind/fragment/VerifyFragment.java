package com.yxcorp.login.bind.fragment.VerifyFragment;
import im8.g;
import com.yxcorp.login.userlogin.fragment.LoginPresenterFragment;
import io.reactivex.subjects.PublishSubject;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import d1d.v0;
import java.util.Map;
import java.util.HashMap;
import android.os.Bundle;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public abstract class VerifyFragment extends LoginPresenterFragment implements g	// class@001a55
{
    public int A;
    public PhoneVerifyParams B;
    public b C;
    public String k;
    public String l;
    public String m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public int r;
    public String s;
    public String t;
    public String u;
    public String v;
    public PublishSubject w;
    public PublishSubject x;
    public int y;
    public boolean z;

    public void VerifyFragment(){
       super();
       this.w = PublishSubject.g();
       this.x = PublishSubject.g();
    }
    public void ch(){
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VerifyFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new v0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, VerifyFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(VerifyFragment.class, new v0());
       }else {
          obj.put(VerifyFragment.class, null);
       }
       return obj;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VerifyFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.ch();
       return;
    }
}
