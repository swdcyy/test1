package ii9.b;
import android.view.View$OnClickListener;
import ii9.e;
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

public final class b implements View$OnClickListener	// class@002831
{
    public final e b;

    public void b(e p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, e.class, "2")) {
       }else {
          tb.o = true;
          if (!tb.d.b().onBackPressed()) {
             if (tb.e.getIntent() != null && j0.a(tb.e.getIntent(), "canceled", false)) {
                tb.e.setResult(false);
             }
             PostCommonFunnel.b.b(objArray, "camera_close_btn");
             CameraLogger.i(406, "close");
             tb.e.finish();
          }
          tb.o = false;
       }
       return;
    }
}
