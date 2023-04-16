package com.yxcorp.gifshow.camera.record.CameraActivity$c;
import kq.b;
import com.yxcorp.gifshow.camera.record.CameraActivity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.KwaiDialogFragment;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import kq.a;
import com.yxcorp.gifshow.edit.draft.DraftUtils$DraftRecoverFlag;
import android.app.Activity;

public class CameraActivity$c implements b	// class@001c87
{
    public final CameraActivity a;

    public void CameraActivity$c(CameraActivity p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, CameraActivity$c.class, "3")) {
          return;
       }
       CameraActivity r1 = this.a.r1;
       if (r1 != null) {
          r1.dismiss();
          this.a.r1 = null;
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, CameraActivity$c.class, "2")) {
          return;
       }
       this.a.r1 = new ProgressFragment();
       this.a.r1.Fh(0, 0, 0);
       this.a.r1.setCancelable(0);
       CameraActivity$c ta = this.a;
       ta.r1.show(ta.getSupportFragmentManager(), "CameraActivity");
       return;
    }
    public void c(c p0,boolean p1){
       a.b(this, p0, p1);
    }
    public void d(c p0,DraftUtils$DraftRecoverFlag p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CameraActivity$c.class, "1")) {
          return;
       }
       this.a.finish();
       this.a.overridePendingTransition(R.anim.arg_RES_7f01004a, 0x7f01004c);
       return;
    }
    public void e(c p0){
       a.d(this, p0);
    }
}
