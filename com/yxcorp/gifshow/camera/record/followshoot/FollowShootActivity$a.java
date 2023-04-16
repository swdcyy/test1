package com.yxcorp.gifshow.camera.record.followshoot.FollowShootActivity$a;
import kq.b;
import com.yxcorp.gifshow.camera.record.followshoot.FollowShootActivity;
import java.lang.Object;
import kq.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.edit.draft.DraftUtils$DraftRecoverFlag;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.followshoot.FollowShootActivity$b;
import java.lang.Enum;
import android.app.Activity;

public class FollowShootActivity$a implements b	// class@000dc2
{
    public final FollowShootActivity a;

    public void FollowShootActivity$a(FollowShootActivity p0){
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FollowShootActivity$a.class, "1")) {
          return;
       }
       int i = FollowShootActivity$b.a[p1.ordinal()];
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
