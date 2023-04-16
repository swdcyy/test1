package e99.a$b;
import q0.e;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.os.Bundle;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.widget.RelativeLayout;
import android.app.Application;
import o56.a;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import com.kwai.library.widget.refresh.path.LoadingStyle;
import android.widget.RelativeLayout$LayoutParams;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.app.Dialog;
import android.view.Window;
import android.view.WindowManager$LayoutParams;

public final class a$b extends e	// class@00214f
{
    public final Context d;

    public void a$b(Context p0){
       a.p(p0, "mContext");
       super(p0, 0x7f11011b);
       this.d = p0;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "1")) {
          return;
       }
       super.onCreate(p0);
       RelativeLayout relativeLayo = new RelativeLayout(a.b());
       KwaiLoadingView kwaiLoadingV = new KwaiLoadingView(a.b());
       kwaiLoadingV.setLoadingStyle(LoadingStyle.GRAY);
       RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams(-1, -1);
       layoutParams.addRule(13, -1);
       relativeLayo.addView(kwaiLoadingV, layoutParams);
       this.setContentView(relativeLayo);
       return;
    }
    public void show(){
       if (PatchProxy.applyVoid(null, this, a$b.class, "2")) {
          return;
       }
       super.show();
       if (this.getWindow() == null) {
          return;
       }
       Window window = this.getWindow();
       a.m(window);
       a.o(window, "window!!");
       WindowManager$LayoutParams attributes = window.getAttributes();
       attributes.width = -1;
       attributes.height = -1;
       Window window1 = this.getWindow();
       a.m(window1);
       a.o(window1, "window!!");
       window1.setAttributes(attributes);
       return;
    }
}
