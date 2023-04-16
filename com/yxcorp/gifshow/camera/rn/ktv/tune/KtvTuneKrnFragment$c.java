package com.yxcorp.gifshow.camera.rn.ktv.tune.KtvTuneKrnFragment$c;
import java.lang.Runnable;
import com.yxcorp.gifshow.camera.rn.ktv.tune.KtvTuneKrnFragment;
import java.util.Map;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import androidx.fragment.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;

public final class KtvTuneKrnFragment$c implements Runnable	// class@000ff8
{
    public final KtvTuneKrnFragment b;
    public final Map c;

    public void KtvTuneKrnFragment$c(KtvTuneKrnFragment p0,Map p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, KtvTuneKrnFragment$c.class, "1")) {
          return;
       }
       KtvTuneKrnFragment$c tc = this.c;
       if (tc != null) {
          Intent obj = tc.get("ret");
          if (obj instanceof Boolean) {
             objArray = obj;
          }
          if (this.b.isResumed() && (objArray != null && objArray.booleanValue())) {
             obj = new Intent();
             Bundle arguments = this.b.getArguments();
             boolean booleanx = (arguments != null)? arguments.getBoolean("is_launcher_from_template", false): false;
             obj.putExtra("isMusicActivityLaunchFromTemplate", booleanx);
             FragmentActivity activity = this.b.getActivity();
             if (activity != null) {
                activity.setResult(false, obj);
             }
             FragmentActivity activity1 = this.b.getActivity();
             if (activity1 != null) {
                activity1.finish();
             }
          }
       }
    label_005f :
       return;
    }
}
