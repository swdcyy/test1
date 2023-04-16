package com.yxcorp.login.authorization.fragment.AddPhoneNumFragment;
import lnc.g2$a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import a1d.k;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import k2b.e0;
import w0d.e;
import com.trello.rxlifecycle3.components.support.RxFragment;
import lnc.g2;

public class AddPhoneNumFragment extends BaseFragment implements g2$a	// class@001a30
{
    public g2 j;
    public String k;

    public void AddPhoneNumFragment(){
       super();
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, AddPhoneNumFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       obj.U7(new k(this.k, this));
       PatchProxy.onMethodExit(AddPhoneNumFragment.class, "4");
       return obj;
    }
    public String o(){
       return "THIRD_PARTY_AUTHORIZATION_ADD_INFORMATION";
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AddPhoneNumFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       if (!PatchProxy.applyVoid(null, this, AddPhoneNumFragment.class, "5")) {
          p0 = this.getArguments();
          if (p0 != null) {
             this.k = p0.getString("key_app_id");
          }
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, AddPhoneNumFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, 0x7f0d009a, p1, false);
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, AddPhoneNumFragment.class, "6")) {
          return;
       }
       e.b(this, this.k);
       super.onDestroy();
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AddPhoneNumFragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       if (this.j == null) {
          this.j = new g2(this, this);
       }
       Object[] objArray = new Object[]{this};
       this.j.b(objArray);
       return;
    }
}
