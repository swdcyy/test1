package com.kuaishou.live.core.show.luckystar.v2.luckyuser.b;
import a51.c;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import bld.b;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import com.kuaishou.live.core.show.luckystar.util.b;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import mkc.b;
import android.view.View;
import mkc.c;
import yb2.i;
import dc2.a;
import p91.m;
import brd.t;
import zb2.o;
import t45.d;
import brd.z;
import ic2.c;
import com.kuaishou.live.core.show.luckystar.v2.luckyuser.b$a;
import erd.g;
import crd.b;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;

public class b extends c	// class@000d04
{
    public KwaiImageView A;
    public View B;
    public i C;
    public final String D;
    public KwaiImageView v;
    public View w;
    public TextView x;
    public KwaiImageView y;
    public RecyclerView z;
    public static String sLivePresenterClassName = "LiveLuckyStarLuckyUserPresenterV2";

    public void b(String p0){
       super();
       this.D = p0;
    }
    public void E8(){
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "3")) {
          return;
       }
       super.E8();
       b uob1 = new b();
       uob1.g(KwaiRadiusStyles.R32);
       uob1.v(b.e());
       this.v.setPlaceHolderImage(uob1.a());
       if (!PatchProxy.applyVoid(objArray, this, uob, "5")) {
          LinearLayoutManager linearLayout = new LinearLayoutManager(this.getContext());
          linearLayout.setOrientation(1);
          this.z.setLayoutManager(linearLayout);
       }
       this.S8();
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       super.J8();
       return;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, b.class, "6")) {
          return;
       }
       b[] uobArray = new b[]{b.g};
       c.d(this.B, uobArray);
       b.k(this.B);
       b tC = this.C;
       this.X7(tC.n.a(new a(tC.a.getLiveStreamId(), this.D)).observeOn(d.a).subscribe(new c(this), new b$a(this)));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       this.v = m1.f(p0, 0x7f0a2109);
       this.w = m1.f(p0, 0x7f0a212c);
       this.x = m1.f(p0, 0x7f0a212d);
       this.y = m1.f(p0, 0x7f0a212c);
       this.z = m1.f(p0, 0x7f0a2135);
       this.B = m1.f(p0, 0x7f0a2126);
       this.A = m1.f(p0, 0x7f0a214e);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       this.C = this.q8(i.class);
       return;
    }
}
