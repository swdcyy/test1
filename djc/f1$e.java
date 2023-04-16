package djc.f1$e;
import java.lang.Runnable;
import com.google.gson.JsonElement;
import djc.f1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.library.kwaiplayerkit.framework.KwaiPlayerKitView;
import android.widget.FrameLayout;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.widget.ImageView;
import java.lang.NullPointerException;

public final class f1$e implements Runnable	// class@0021ee
{
    public final JsonElement b;
    public final f1 c;

    public void f1$e(JsonElement p0,f1 p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       float f;
       ViewGroup$LayoutParams layoutParams;
       if (PatchProxy.applyVoidWithListener(null, this, f1$e.class, "1")) {
          return;
       }
       if (this.c.d().getWidth() > this.c.d().getHeight()) {
          f = (float)(this.c.d().getHeight() * this.c.b().getMeasuredWidth()) / (float)this.c.d().getWidth();
          layoutParams = this.c.b().getLayoutParams();
          if (layoutParams != null) {
             layoutParams.height = (int)f;
             this.c.b().setLayoutParams(layoutParams);
             this.c.j.setLayoutParams(layoutParams);
          }else {
             PatchProxy.onMethodExit(f1$e.class, "1");
             throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
          }
       }else {
          f = (float)(this.c.d().getWidth() * this.c.b().getMeasuredHeight()) / (float)this.c.d().getHeight();
          layoutParams = this.c.b().getLayoutParams();
          if (layoutParams != null) {
             layoutParams.width = (int)f;
             this.c.b().setLayoutParams(layoutParams);
             this.c.j.setLayoutParams(layoutParams);
          }else {
             PatchProxy.onMethodExit(f1$e.class, "1");
             throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
          }
       }
       PatchProxy.onMethodExit(f1$e.class, "1");
       return;
    }
}
