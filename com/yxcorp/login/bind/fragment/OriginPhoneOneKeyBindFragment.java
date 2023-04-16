package com.yxcorp.login.bind.fragment.OriginPhoneOneKeyBindFragment;
import com.yxcorp.login.bind.fragment.BindPhoneFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.login.bind.presenter.t;
import o2d.r;
import e1d.o0;
import e1d.l0;
import com.yxcorp.login.bind.presenter.w;
import com.yxcorp.login.bind.presenter.y;
import com.yxcorp.login.bind.presenter.e0;
import java.util.Map;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import ag6.a;

public class OriginPhoneOneKeyBindFragment extends BindPhoneFragment	// class@001a53
{

    public void OriginPhoneOneKeyBindFragment(){
       super();
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, OriginPhoneOneKeyBindFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       obj.U7(new t());
       obj.U7(new r());
       obj.U7(new o0());
       obj.U7(new l0());
       obj.U7(new w());
       obj.U7(new y());
       obj.U7(new e0());
       PatchProxy.onMethodExit(OriginPhoneOneKeyBindFragment.class, "3");
       return obj;
    }
    public int M(){
       return 1;
    }
    public int ch(){
       return 0;
    }
    public int getLayoutResId(){
       return 0x7f0d04f9;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, OriginPhoneOneKeyBindFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(OriginPhoneOneKeyBindFragment.class, null);
       return objectsByTag;
    }
    public String o(){
       return "ONE_CLICK_BIND_PHONE";
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, OriginPhoneOneKeyBindFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, OriginPhoneOneKeyBindFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.c(p0, 0x7f0d04f9, p1, false);
    }
}
