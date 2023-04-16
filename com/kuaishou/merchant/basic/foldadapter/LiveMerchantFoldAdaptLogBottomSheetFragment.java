package com.kuaishou.merchant.basic.foldadapter.LiveMerchantFoldAdaptLogBottomSheetFragment;
import k2b.e0;
import k2b.j0;
import com.kuaishou.merchant.basic.foldadapter.LiveMerchantFoldAdaptBottomSheetFragment;
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
import android.app.Activity;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import androidx.fragment.app.KwaiDialogFragment;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;

public abstract class LiveMerchantFoldAdaptLogBottomSheetFragment extends LiveMerchantFoldAdaptBottomSheetFragment implements e0, j0	// class@0015b1
{

    public void LiveMerchantFoldAdaptLogBottomSheetFragment(){
       super();
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
       return 1;
    }
    public ClientContent$ContentPackage Nf(){
       return null;
    }
    public String P7(){
       return d0.i(this);
    }
    public void S2(Fragment p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantFoldAdaptLogBottomSheetFragment.class, "2")) {
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
       if (PatchProxy.isSupport(LiveMerchantFoldAdaptLogBottomSheetFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveMerchantFoldAdaptLogBottomSheetFragment.class, "3")) {
          return;
       }
       if (this.getActivity() instanceof j0) {
          this.getActivity().b2(p0);
       }
       return;
    }
    public Activity cd(){
       return d0.f(this);
    }
    public boolean eg(){
       return d0.a(this);
    }
    public int getPage(){
       return 0;
    }
    public String h5(){
       return d0.g(this);
    }
    public ClientEvent$ElementPackage j4(){
       return d0.c(this);
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, LiveMerchantFoldAdaptLogBottomSheetFragment.class, "1")) {
          return;
       }
       super.onResume();
       this.S2(this);
       return;
    }
    public String pg(){
       return d0.k(this);
    }
    public ClientContentWrapper$ContentWrapper ye(){
       return d0.b(this);
    }
}
