package com.kwai.framework.krn.init.network.KdsUploadProgressListener$progressFragment$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.framework.krn.init.network.KdsUploadProgressListener;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.activitycontext.ActivityContext;
import kotlin.jvm.internal.a;
import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import java.util.Objects;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.KwaiDialogFragment;

public final class KdsUploadProgressListener$progressFragment$2 extends Lambda implements a	// class@0015e1
{
    public final KdsUploadProgressListener this$0;

    public void KdsUploadProgressListener$progressFragment$2(KdsUploadProgressListener p0){
       this.this$0 = p0;
       super(0);
    }
    public final ProgressFragment invoke(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       KdsUploadProgressListener obj = PatchProxy.apply(objArray, this, KdsUploadProgressListener$progressFragment$2.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.this$0.c;
       if (obj == null) {
          ActivityContext uActivityCon = ActivityContext.g();
          a.o(uActivityCon, "ActivityContext.getInstance\(\)");
          Activity uActivity = uActivityCon.e();
       }
       if (obj instanceof FragmentActivity) {
          KdsUploadProgressListener$progressFragment$2 tthis$0 = this.this$0;
          Objects.requireNonNull(tthis$0);
          objArray = PatchProxy.applyOneRefs(obj, tthis$0, KdsUploadProgressListener.class, "4");
          if (objArray != patchProxyRe) {
          }else {
             ProgressFragment progressFrag = new ProgressFragment();
             progressFrag.Eh(0, 100);
             progressFrag.setCancelable(0);
             progressFrag.show(obj.getSupportFragmentManager(), "runner");
             objArray = progressFrag;
          }
       }
       return objArray;
    }
    public Object invoke(){
       return this.invoke();
    }
}
