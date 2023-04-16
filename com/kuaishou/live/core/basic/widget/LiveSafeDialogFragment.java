package com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;
import com.kuaishou.live.dialog.base.LiveBaseDialogFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Exception;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.fragment.app.KwaiDialogFragment;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public class LiveSafeDialogFragment extends LiveBaseDialogFragment	// class@00090d
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
          b.I(LiveLogTag.LIVE_EXCEPTION, "LiveSafeDialogFragment dismissDialog", e0);
       }
       return;
    }
    public void vh(){
       if (PatchProxy.applyVoid(null, this, LiveSafeDialogFragment.class, "3")) {
          return;
       }
       super.dismissAllowingStateLoss();
       return;
    }
}
