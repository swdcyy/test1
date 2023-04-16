package com.kuaishou.live.core.show.wish.b;
import c12.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.core.show.wish.LiveAudienceWishRoomKrnDialogPresenter$b;
import bn2.b$b;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.net.Uri;
import ekd.x0;
import brd.t;
import ry1.b;
import pa1.i;
import brd.w;
import erd.c;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import com.kuaishou.live.core.show.wish.a;
import erd.o;
import wm2.a;
import erd.g;
import crd.b;

public class b extends f	// class@001297
{
    public long K;
    public LiveAudienceWishRoomKrnDialogPresenter$b L;
    public b$b M;
    public a0 N;
    public static String sLivePresenterClassName = "LiveAudienceWishRoomAutoShowPresenter";

    public void b(){
       super();
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       super.j8();
       this.N = this.q8(a0.class);
       this.L = this.q8(LiveAudienceWishRoomKrnDialogPresenter$b.class);
       this.M = this.q8(b$b.class);
       return;
    }
    public void x(boolean p0){
       boolean b;
       t ot;
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "2")) {
          return;
       }
       if (!this.M.a()) {
          Object[] objArray = null;
          Uri obj = PatchProxy.apply(objArray, this, uob, "3");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(!TextUtils.x(this.N.m)){
             obj = x0.f(this.N.m);
             if (obj != null) {
                b = TextUtils.x(x0.a(obj, "internaljump")) ^ 0x01;
             }
          }
          b = 0;
          if (!b && !PatchProxy.applyVoid(objArray, this, uob, "4")) {
             b tN = this.N;
             a0 b3 = tN.b3;
             if (b3 != null && tN.L != null) {
                ot = t.zip(b3.T3(), this.N.L, i.a);
             }else {
                z c = d.c;
                ot = t.timer(1000, TimeUnit.MILLISECONDS, c).subscribeOn(c).map(a.b);
             }
             this.X7(ot.observeOn(d.a).subscribe(new a(this)));
          }
       }
    label_009b :
       return;
    }
}
