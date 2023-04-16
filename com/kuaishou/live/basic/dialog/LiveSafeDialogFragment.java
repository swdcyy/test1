package com.kuaishou.live.basic.dialog.LiveSafeDialogFragment;
import androidx.fragment.app.KwaiDialogFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Exception;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import com.yxcorp.utility.Log;

public class LiveSafeDialogFragment extends KwaiDialogFragment	// class@000cc7
{

    public void LiveSafeDialogFragment(){
       super();
    }
    public void dismiss(){
       if (PatchProxy.applyVoid(null, this, LiveSafeDialogFragment.class, "1")) {
          return;
       }
       ExceptionHandler.handleCaughtException(new Exception("PLEASE NEVER USE DISMISS, use dismissAllowingStateLoss instead"));
       this.dismissAllowingStateLoss();
       return;
    }
    public void dismissAllowingStateLoss(){
       if (PatchProxy.applyVoid(null, this, LiveSafeDialogFragment.class, "2")) {
          return;
       }
       try{
          if (this.isAdded() && this.getFragmentManager() != null) {
             super.dismissAllowingStateLoss();
          }
       }catch(java.lang.Exception e0){
          Log.e("LiveSafeDialogFragment", "dismissDialog", e0);
       }
       return;
    }
}
