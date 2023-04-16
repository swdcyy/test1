package d82.f;
import ml8.d;
import android.app.Dialog;
import android.app.Activity;
import t02.a0;
import d82.f$a;
import android.content.Context;
import com.kwai.framework.model.user.User;
import p91.m;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.b;
import lnc.b9;
import h91.d;
import h91.c;
import brd.t;
import cjd.e;
import erd.o;
import d82.d;
import d82.c;
import erd.g;
import android.view.View;
import ekd.m1;
import android.widget.TextView;
import com.yxcorp.gifshow.image.KwaiImageView;
import d82.b;
import android.view.View$OnClickListener;
import d82.a;
import android.os.Bundle;
import android.view.Window;
import java.lang.CharSequence;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import wb5.g;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveEscrowNoticeConfig;
import java.lang.reflect.Type;
import wg3.a;

public class f extends Dialog implements d	// class@00248f
{
    public TextView b;
    public TextView c;
    public KwaiImageView d;
    public final a0 e;
    public final Activity f;
    public b g;
    public final f$a h;
    public User i;
    public b j;
    public long k;
    public boolean l;

    public void f(Activity p0,a0 p1,f$a p2){
       super(p0, 0x7f110362);
       this.k = 0;
       this.l = false;
       this.f = p0;
       this.e = p1;
       this.h = p2;
       this.i = p1.Z2.I();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, f.class, "4")) {
          return;
       }
       b9.a(this.g);
       this.g = c.b().e(this.e.Z2.getLiveStreamId()).map(new e()).subscribe(new d(this), new c(this));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       this.b = m1.f(p0, 0x7f0a1c3b);
       this.d = m1.f(p0, 0x7f0a1c3a);
       this.c = m1.f(p0, 0x7f0a1c3d);
       m1.a(p0, new b(this), R.id.live_escrow_entry_start_button);
       m1.a(p0, new a(this), R.id.live_escrow_entry_close);
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "2")) {
          return;
       }
       super.onCreate(p0);
       this.setContentView(R.layout.arg_RES_7f0d0aef);
       this.doBindView(this.getWindow().getDecorView());
       this.setCancelable(false);
       f ti = this.i;
       if (ti != null) {
          this.b.setText(ti.mName);
          g.b(this.d, this.i, HeadImageSize.MIDDLE);
       }
       LiveConfigStartupResponse$LiveEscrowNoticeConfig liveEscrowNo = a.n(LiveConfigStartupResponse$LiveEscrowNoticeConfig.class);
       if (liveEscrowNo != null) {
          this.c.setText(liveEscrowNo.mOpenEscrowMessage);
       }
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, f.class, "7")) {
          return;
       }
       super.onDetachedFromWindow();
       b9.a(this.g);
       b9.a(this.j);
       return;
    }
}
