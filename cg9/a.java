package cg9.a;
import android.view.View$OnClickListener;
import cg9.d;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.base.d;
import oc9.w;
import com.yxcorp.gifshow.camera.record.base.b;
import android.content.Intent;
import android.app.Activity;
import ekd.j0;
import com.kwai.feature.post.funnel.PostCommonFunnel;
import com.yxcorp.gifshow.camera.record.CameraLogger;
import com.yxcorp.gifshow.activity.GifshowActivity;

public final class a implements View$OnClickListener	// class@0005e2
{
    public final d b;

    public void a(d p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, d.class, "8")) {
       }else {
          tb.w = true;
          if (!tb.d.b().onBackPressed()) {
             if (tb.e.getIntent() != null && j0.a(tb.e.getIntent(), "canceled", false)) {
                tb.e.setResult(false);
             }
             PostCommonFunnel.b.b(objArray, "camera_close_btn");
             CameraLogger.i(406, "close");
             tb.e.finish();
          }
          tb.w = false;
       }
       return;
    }
}
