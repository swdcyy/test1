package gg9.e;
import java.lang.Runnable;
import com.yxcorp.gifshow.camera.record.permission.b;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.s6;
import bn8.a;
import com.yxcorp.gifshow.camera.record.base.d;
import yc9.b;
import com.yxcorp.gifshow.camera.record.base.b;
import android.content.Intent;
import com.yxcorp.gifshow.camera.record.permission.CameraPermissionActivity;
import android.content.Context;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.app.Activity;

public final class e implements Runnable	// class@002477
{
    public final b b;

    public void e(b p0){
       this.b = p0;
    }
    public final void run(){
       e tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, b.class, "7")) {
       }else {
          int i = s6.x();
          if (i != 1) {
             if (i == 2 && !a.g()) {
                if (tb.d.d(b.b()).c()) {
                   tb.e.startActivityForResult(new Intent(tb.e, CameraPermissionActivity.class), 6);
                   tb.e.overridePendingTransition(0, 0);
                }else {
                   tb.r2(tb.e);
                }
                a.m(true);
             }
          }else if(!a.g()){
             tb.r2(tb.e);
             a.m(true);
          }
       }
       return;
    }
}
