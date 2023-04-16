package com.yxcorp.gifshow.magic.ui.widget.SwapLoadingFragment;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import androidx.fragment.app.DialogFragment;

public class SwapLoadingFragment extends ProgressFragment	// class@001c53
{

    public void SwapLoadingFragment(){
       super();
    }
    public void setStyle(int p0,int p1){
       if (PatchProxy.isSupport(SwapLoadingFragment.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, SwapLoadingFragment.class, "1")) {
          return;
       }
       super.setStyle(p0, R.style.arg_RES_7f110360);
       return;
    }
}
