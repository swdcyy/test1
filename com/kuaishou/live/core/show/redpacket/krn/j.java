package com.kuaishou.live.core.show.redpacket.krn.j;
import a51.c;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.String;
import java.util.List;
import po3.a;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import brd.t;
import ch2.n;
import brd.x;
import t45.d;
import brd.z;
import com.kuaishou.live.core.show.redpacket.krn.g;
import bp6.a;
import erd.g;
import crd.b;
import java.util.Iterator;
import com.kuaishou.live.core.show.redpacket.krn.f;
import com.kuaishou.livestream.message.nano.LiveKrnRedPackMessage$LiveKrnRedPack;
import java.util.Map;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.android.live.log.b;
import w81.c;
import w81.b;
import p91.m;
import cjd.e;
import erd.o;
import com.kuaishou.live.core.show.redpacket.krn.h;
import com.kuaishou.live.core.show.redpacket.krn.i;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ng2.s;
import uw1.m;

public class j extends c	// class@000edc
{
    public m v;
    public n w;
    public s x;
    public m y;
    public List z;
    public static final List A;
    public static String sLivePresenterClassName;

    static {
       j.A = a.a(LiveLogTag.KRN_LEEE, "LiveKrnRedPacketPendantPresenter");
    }
    public void j(){
       super();
       this.z = new ArrayList();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, j.class, "2")) {
          return;
       }
       super.E8();
       this.w.D3().compose(this.P8()).observeOn(d.a).subscribe(new g(this), new a());
       return;
    }
    public void J8(){
       j oj = j.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oj, "3")) {
          return;
       }
       super.J8();
       if (!PatchProxy.applyVoid(objArray, this, oj, "10")) {
          Iterator iterator = this.z.iterator();
          while (iterator.hasNext()) {
             iterator.next().a();
          }
          this.z.clear();
       }
       return;
    }
    public final void S8(LiveKrnRedPackMessage$LiveKrnRedPack p0){
       String str1;
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "8")) {
          return;
       }
       LiveKrnRedPackMessage$LiveKrnRedPack extraMessage = p0.extraMessage;
       if (extraMessage != null) {
          String str = "reportData";
          if (!TextUtils.isEmpty(extraMessage.get(str))) {
             str1 = p0.extraMessage.get(str);
          label_0028 :
             b.S(j.A, "adEventReport", "reportDataMapJson", str1);
             this.X7(b.b().a(this.v.getLiveStreamId(), 3, str1).map(new e()).subscribe(h.b, i.b));
             return;
          }
       }
       str1 = "";
       goto label_0028 ;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, j.class, "1")) {
          return;
       }
       this.w = this.q8(n.class);
       this.x = this.r8("LIVE_RED_PACKET_PENDANT_SERVICE");
       this.y = this.s8(m.class);
       this.v = this.r8("LIVE_BASIC_CONTEXT");
       return;
    }
}
