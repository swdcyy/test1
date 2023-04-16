package com.kwai.framework.krn.init.network.KdsUploadProgressListener;
import ojd.f;
import androidx.fragment.app.FragmentActivity;
import java.lang.String;
import java.lang.Object;
import com.kwai.framework.krn.init.network.KdsUploadProgressListener$progressFragment$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.CharSequence;
import android.text.TextUtils;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import js6.a;
import com.kwai.framework.krn.init.network.KdsUploadProgressListener$ProgressData;
import androidx.fragment.app.KwaiDialogFragment;

public final class KdsUploadProgressListener implements f	// class@0015e2
{
    public String a;
    public final p b;
    public final FragmentActivity c;
    public final boolean d;

    public void KdsUploadProgressListener(FragmentActivity p0,boolean p1,String p2){
       super();
       this.c = null;
       this.d = p1;
       this.a = "kds_upload_event";
       this.b = s.c(new KdsUploadProgressListener$progressFragment$2(this));
       if (!TextUtils.isEmpty(p2)) {
          a.m(p2);
          this.a = p2;
       }
       return;
    }
    public boolean a(int p0,int p1,Object p2){
       if (PatchProxy.isSupport(KdsUploadProgressListener.class)) {
          p2 = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, KdsUploadProgressListener.class, "3");
          if (p2 != PatchProxyResult.class) {
             return p2.booleanValue();
          }
       }
       if (this.d != null) {
          p2 = this.c();
          if (p2 != null) {
             p2.Oh(p0, p1);
          }
       }
       a.b.GO(this.a, new KdsUploadProgressListener$ProgressData(p0, p1));
       return false;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, KdsUploadProgressListener.class, "2")) {
          return;
       }
       if (this.d != null) {
          ProgressFragment progressFrag = this.c();
          if (progressFrag != null) {
             progressFrag.dismissAllowingStateLoss();
          }
       }
       return;
    }
    public final ProgressFragment c(){
       Object obj = PatchProxy.apply(null, this, KdsUploadProgressListener.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getValue();
    }
}
