package ml9.f$b;
import u07.u;
import ml9.f;
import java.lang.Object;
import u07.t;
import android.view.View;
import ml9.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.activity.x;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import android.net.Uri;
import ekd.w0;
import wkd.b;
import nf6.i;
import android.content.Context;
import android.content.Intent;
import android.app.Activity;

public class f$b implements u	// class@00304f
{
    public boolean b;
    public final f c;

    public void f$b(f p0){
       this.c = p0;
       super();
       this.b = false;
    }
    public void a(t p0,View p1){
       d uod = d.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f$b.class, "1")) {
          return;
       }
       if (this.b != null) {
          return;
       }
       f b = this.c.b;
       Objects.requireNonNull(b);
       if (!PatchProxy.applyVoid(null, b, uod, "7")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "GOD_PRIVILEGE_RECOMMEND_POPUP";
          i3 oi3 = i3.f();
          oi3.d("button_name", "х╔ак╫Б");
          uElementPack.params = oi3.e();
          u1.M("", b.b.N2(), 6, uElementPack, null, null);
       }
       b = this.c.b;
       String str = "https://ppg.m.etoote.com/doodle/FeNVtsQx.html?hyId=doodle_FeNVtsQx";
       Objects.requireNonNull(b);
       if (!PatchProxy.applyVoidOneRefs(str, b, uod, "3")) {
          d b1 = b.b;
          if (b1 != null) {
             Intent intent = b.a(0x66dce92a).a(b1, w0.f(str));
             if (intent != null) {
                b1.startActivity(intent);
             }
          }
       }
       this.b = true;
       return;
    }
}
