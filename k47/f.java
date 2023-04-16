package k47.f;
import android.view.View$OnClickListener;
import com.kwai.live.gzone.widget.e;
import androidx.fragment.app.FragmentActivity;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.graphics.drawable.ColorDrawable;
import lnc.a1;
import java.lang.Number;
import android.view.View;
import android.os.Bundle;
import com.kuaishou.live.gzone.widget.swipe.LiveGzoneSwipeContainerLayout;
import k47.f$a;
import com.kuaishou.live.gzone.widget.swipe.LiveGzoneSwipeContainerLayout$b;
import k47.f$b;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import java.lang.Integer;

public abstract class f extends e implements View$OnClickListener	// class@002af6
{
    public PopupInterface$h x;
    public FragmentActivity y;

    public void f(FragmentActivity p0){
       a.p(p0, "mActivity");
       super(p0);
       this.y = p0;
    }
    public Drawable b0(){
       ColorDrawable uColorDrawab = PatchProxy.apply(null, this, f.class, "3");
       if (uColorDrawab != PatchProxyResult.class) {
       }else {
          uColorDrawab = new ColorDrawable(a1.a(0x7f062040));
       }
       return uColorDrawab;
    }
    public int e0(){
       Object obj = PatchProxy.apply(null, this, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a1.e(560.00f);
    }
    public void f0(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f.class, "1")) {
          return;
       }
       if (p0 != null) {
          p0.findViewById(R.id.live_gzone_competition_filter_swipe_layout).setOnScrollListener(new f$a(this));
       }
       super.i0(new f$b(this));
       return;
    }
    public e i0(PopupInterface$h p0){
       this.x = p0;
       return this;
    }
    public boolean j0(){
       return true;
    }
    public final FragmentActivity l0(){
       return this.y;
    }
    public abstract void m0(c p0,int p1);
    public abstract void n0(Integer p0);
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "4")) {
          return;
       }
       Integer integer = (p0 != null)? Integer.valueOf(p0.getId()): null;
       this.n0(integer);
       return;
    }
}
