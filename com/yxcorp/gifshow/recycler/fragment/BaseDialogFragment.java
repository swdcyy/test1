package com.yxcorp.gifshow.recycler.fragment.BaseDialogFragment;
import lnc.s5;
import k2b.e0;
import k2b.j0;
import y8c.a;
import androidx.fragment.app.KwaiDialogFragment;
import k2b.d0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTrans;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import java.lang.String;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.FragmentActivity;
import java.lang.Integer;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.activity.x;
import k2b.u1;
import android.app.Activity;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kwai.robust.PatchProxyResult;
import f3b.o;
import android.content.DialogInterface;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;

public abstract class BaseDialogFragment extends KwaiDialogFragment implements s5, e0, j0, a	// class@001794
{

    public void BaseDialogFragment(){
       super();
    }
    public int Ab(){
       return 0;
    }
    public int D4(){
       return d0.h(this);
    }
    public ClientEvent$ExpTagTrans I1(){
       return d0.e(this);
    }
    public ClientEvent$ExpTagTrans K5(){
       return d0.d(this);
    }
    public int Lb(){
       return d0.j(this);
    }
    public int M(){
       return 0;
    }
    public ClientContent$ContentPackage Nf(){
       return null;
    }
    public String P7(){
       return d0.i(this);
    }
    public ClientContent$ContentPackage Q3(){
       return null;
    }
    public void S2(Fragment p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseDialogFragment.class, "5")) {
          return;
       }
       if (this.getActivity() instanceof j0) {
          this.getActivity().S2(p0);
       }
       return;
    }
    public String a2(){
       return "";
    }
    public void b2(int p0){
       if (PatchProxy.isSupport(BaseDialogFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, BaseDialogFragment.class, "4")) {
          return;
       }
       if (this.sh()) {
          if (this.getActivity() instanceof GifshowActivity) {
             this.getActivity().N2().i(false);
          }
          u1.L0(this);
       }
       return;
    }
    public Activity cd(){
       return d0.f(this);
    }
    public boolean eg(){
       return d0.a(this);
    }
    public int f(){
       return 0;
    }
    public Fragment g0(){
       return this;
    }
    public int getPage(){
       return 0;
    }
    public String getPageParams(){
       return "";
    }
    public String h5(){
       return d0.g(this);
    }
    public ClientEvent$ElementPackage j4(){
       return d0.c(this);
    }
    public String o(){
       Object obj = PatchProxy.apply(null, this, BaseDialogFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int page = this.getPage();
       if (page) {
          return o.i(page);
       }
       return "";
    }
    public void onDismiss(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseDialogFragment.class, "2")) {
          return;
       }
       super.onDismiss(p0);
       if (this.sh()) {
          if (this.getActivity() instanceof GifshowActivity) {
             this.getActivity().N2().i(true);
          }
          u1.a();
       }
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, BaseDialogFragment.class, "1")) {
          return;
       }
       super.onResume();
       this.b2(1);
       return;
    }
    public String pg(){
       return d0.k(this);
    }
    public final boolean sh(){
       Object obj = PatchProxy.apply(null, this, BaseDialogFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.M() && (this.getPage() || !TextUtils.isEmpty(this.o())))? true: false;
       return b;
    }
    public ClientContentWrapper$ContentWrapper ye(){
       return d0.b(this);
    }
}
