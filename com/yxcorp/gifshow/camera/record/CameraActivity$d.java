package com.yxcorp.gifshow.camera.record.CameraActivity$d;
import kq.b;
import com.yxcorp.gifshow.camera.record.CameraActivity;
import java.lang.Object;
import kq.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.edit.draft.DraftUtils$DraftRecoverFlag;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.CameraActivity$e;
import java.lang.Enum;
import android.app.Activity;

public class CameraActivity$d implements b	// class@001c88
{
    public final CameraActivity a;

    public void CameraActivity$d(CameraActivity p0){
       this.a = p0;
       super();
    }
    public void a(){
       a.a(this);
    }
    public void b(){
       a.e(this);
    }
    public void c(c p0,boolean p1){
       a.b(this, p0, p1);
    }
    public void d(c p0,DraftUtils$DraftRecoverFlag p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CameraActivity$d.class, "1")) {
          return;
       }
       int i = CameraActivity$e.a[p1.ordinal()];
       if (i != 1) {
          if (i == 2) {
             this.a.finish();
             this.a.overridePendingTransition(R.anim.arg_RES_7f01004a, 0x7f01004c);
          }
       }else {
          this.a.finish();
          this.a.overridePendingTransition(R.anim.arg_RES_7f01004a, 0x7f01004c);
       }
       return;
    }
    public void e(c p0){
       a.d(this, p0);
    }
}
