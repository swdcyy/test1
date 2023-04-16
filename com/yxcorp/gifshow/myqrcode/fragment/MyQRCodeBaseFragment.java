package com.yxcorp.gifshow.myqrcode.fragment.MyQRCodeBaseFragment;
import im8.g;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import rqb.c;
import java.util.Map;
import java.util.HashMap;
import com.kwai.feature.api.router.social.myqrcode.model.MyQRCodeParam;
import com.yxcorp.utility.TextUtils;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import android.content.Intent;
import android.app.Activity;
import java.io.Serializable;
import ekd.j0;
import com.kwai.feature.api.router.social.myqrcode.model.MyQRCodeParam$a;

public class MyQRCodeBaseFragment extends BaseFragment implements g	// class@0020b5
{
    public MyQRCodeParam j;

    public void MyQRCodeBaseFragment(){
       super();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MyQRCodeBaseFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new c();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, MyQRCodeBaseFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(MyQRCodeBaseFragment.class, new c());
       }else {
          obj.put(MyQRCodeBaseFragment.class, null);
       }
       return obj;
    }
    public String getPageParams(){
       Object obj = PatchProxy.apply(null, this, MyQRCodeBaseFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TextUtils.I(this.j.mExtraInfo);
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MyQRCodeBaseFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.j = (this.getArguments() != null)? j0.e(this.getActivity().getIntent(), "KEY_MY_QRCODE_PARAM"): new MyQRCodeParam$a().a();
       return;
    }
}
