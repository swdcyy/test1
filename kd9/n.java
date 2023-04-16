package kd9.n;
import erd.g;
import com.yxcorp.gifshow.camera.record.frame.c;
import java.lang.Object;
import fd9.a;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8c.a;
import java.lang.StringBuilder;
import android.content.res.Configuration;
import q87.c;
import com.yxcorp.gifshow.camera.record.base.d;
import android.view.Window;
import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import kd9.r;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

public final class n implements g	// class@002c60
{
    public final c b;

    public void n(c p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       n tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, c.class, "40")) {
       }else {
          Object[] objArray = new Object[0];
          a.D().s("FrameBaseController", "ActivityOnConfigurationChanged...config:"+p0.a.toString(), objArray);
          if (tb.A2(p0.a)) {
             tb.D2();
          }else if(tb.e.getWindow() != null && tb.e.getWindow().getDecorView() != null){
             View decorView = tb.e.getWindow().getDecorView();
             decorView.getViewTreeObserver().addOnGlobalLayoutListener(new r(tb, p0, decorView));
          }else {
             tb.D2();
          }
       }
       return;
    }
}
