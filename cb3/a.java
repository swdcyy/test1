package cb3.a;
import com.kuaishou.live.viewcontroller.dialog.DialogViewController;
import msd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import com.kuaishou.live.viewcontroller.ViewController;
import android.view.View;
import ha1.a;
import cb3.a$a;
import android.view.View$OnTouchListener;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.app.Dialog;
import android.view.Window;
import java.lang.Number;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import eq3.d;
import com.kwai.robust.PatchProxyResult;

public final class a extends DialogViewController	// class@0004db
{
    public boolean l;
    public final a m;

    public void a(a p0){
       a.p(p0, "windowHeightProvider");
       super();
       this.m = p0;
    }
    public void F2(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       super.F2();
       this.R2(a.a(this, this.D2(), R.layout.live_lite_layout_manager_decor_layer));
       this.P2().setOnTouchListener(new a$a(this));
       b.Z(LiveLiteLogTag.LAYOUT_MANAGER, "DialogHostVC onCreate");
       return;
    }
    public void J2(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       super.J2();
       this.l = true;
       b.Z(LiveLiteLogTag.LAYOUT_MANAGER, "DialogHostVC onDestroy");
       return;
    }
    public void X2(Dialog p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "4")) {
          return;
       }
       a.p(p0, "dialog");
       boolean b = false;
       p0.setCanceledOnTouchOutside(b);
       Window window = p0.getWindow();
       if (window != null) {
          window.setLayout(-1, this.m.invoke().intValue());
          window.setGravity(80);
          window.setDimAmount(0);
          window.setBackgroundDrawable(new ColorDrawable(b));
          window.addFlags(8);
          window.addFlags(0x20000);
       }
       return;
    }
    public final d Y2(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.E2();
    }
}
