package ml9.f;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import ml9.d;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import m0d.l;
import android.graphics.Bitmap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import android.view.Window;
import android.graphics.Bitmap$Config;
import android.graphics.drawable.BitmapDrawable;
import ek9.l1;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import u07.t$a;
import u07.a;
import ml9.f$b;
import u07.u;
import com.kwai.library.widget.popup.common.PopupInterface$Excluded;
import com.kwai.library.widget.popup.common.c$b;
import ml9.f$a;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.activity.x;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;

public class f implements ImageCallback	// class@003050
{
    public final d b;

    public void f(d p0){
       this.b = p0;
       super();
    }
    public void onCompleted(Drawable p0){
       l.a(this, p0);
    }
    public void onCompletedBitmap(Bitmap p0){
       Object[] objArray1;
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       d b = this.b.b;
       if (b == null || (b.isFinishing() || (!this.b.b.isDestroyed() && this.b.b.getWindow() != null))) {
          Object[] objArray = null;
          p0 = (p0 != null && !p0.isRecycled())? p0.copy(p0.getConfig(), false): objArray;
          if (p0 != null) {
             SharedPreferences$Editor uEditor = l1.a.edit();
             uEditor.putInt("recommendGodCommentGuideCount", (l1.g() + 1));
             g.a(uEditor);
             f tb = this.b;
             t$a uoa = new t$a(tb.b);
             uoa.C0(new BitmapDrawable(p0));
             uoa.W0(R.string.arg_RES_7f103aa2);
             uoa.y0(R.string.arg_RES_7f103aa3);
             uoa.S0(R.string.arg_RES_7f103aa4);
             t$a uoa1 = a.a(uoa);
             uoa1.u0(new f$b(this));
             c$b uob = uoa1.D(PopupInterface$Excluded.NOT_AGAINST);
             uob.z(1);
             tb.c = uob.M(new f$a(this)).k();
             this.b.c.Z();
             tb = this.b;
             Objects.requireNonNull(tb);
             if (!PatchProxy.applyVoid(objArray, tb, d.class, "6")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "GOD_PRIVILEGE_RECOMMEND_POPUP";
                i3 oi3 = i3.f();
                oi3.d("button_name", "х╔ак╫Б");
                uElementPack.params = oi3.e();
                u1.D0("", tb.b.N2(), 6, uElementPack, null, null);
             }
          }
       }
    label_00df :
       return;
    }
    public void onProgress(float p0){
       l.c(this, p0);
    }
}
