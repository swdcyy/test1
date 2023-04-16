package g0a.e;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import ml8.d;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import android.widget.ImageView;
import ekd.m1;
import android.widget.TextView;
import g0a.a;
import android.view.View$OnClickListener;
import g0a.b;
import g0a.c;
import g0a.d;

public abstract class e implements PopupInterface$f, d	// class@002395
{
    public ImageView b;
    public ImageView c;
    public TextView d;
    public TextView e;
    public final QPhoto f;
    public final GifshowActivity g;
    public c h;

    public void e(QPhoto p0,GifshowActivity p1){
       super();
       this.f = p0;
       this.g = p1;
    }
    public View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       p3 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, e.class, "2");
       if (p3 != PatchProxyResult.class) {
          return p3;
       }
       this.h = p0;
       View view = a.g(p1, R.layout.arg_RES_7f0d02b7, p2, false);
       this.doBindView(view);
       return view;
    }
    public void b(c p0){
       this.h = null;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, e.class, "5")) {
          return;
       }
       this.h.q(4);
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, e.class, "4")) {
          return;
       }
       this.b.setSelected(false);
       this.c.setSelected(true);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       this.e = m1.f(p0, 0x7f0a339d);
       this.d = m1.f(p0, 0x7f0a339e);
       this.c = m1.f(p0, 0x7f0a339b);
       this.b = m1.f(p0, 0x7f0a339f);
       m1.a(p0, new a(this), R.id.quality_switch_cancel);
       m1.a(p0, new b(this), R.id.quality_switch_confirm);
       m1.a(p0, new c(this), R.id.quality_switch_hd_mode_wrapper);
       m1.a(p0, new d(this), R.id.quality_switch_auto_mode_wrapper);
       return;
    }
    public abstract void e();
    public abstract void f();
    public void g(){
       if (PatchProxy.applyVoid(null, this, e.class, "3")) {
          return;
       }
       this.c.setSelected(false);
       this.b.setSelected(true);
       return;
    }
}
