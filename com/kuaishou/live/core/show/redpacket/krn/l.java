package com.kuaishou.live.core.show.redpacket.krn.l;
import im8.g;
import k51.c;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.String;
import java.util.List;
import po3.a;
import java.util.HashMap;
import io.reactivex.subjects.PublishSubject;
import com.kuaishou.live.core.show.redpacket.krn.k;
import com.kuaishou.live.core.show.redpacket.krn.l$a;
import com.kuaishou.live.core.show.redpacket.krn.j;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ch2.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import hf3.a;
import p91.m;
import com.kuaishou.livestream.message.nano.LiveKrnRedPackMessage$SCLiveKrnRedPackShow;
import lf3.g;
import java.util.Map;
import java.util.Collection;
import java.util.Iterator;
import crd.b;
import lnc.b9;
import ch2.j;
import java.lang.Runnable;
import ekd.k1;
import com.kwai.robust.PatchProxyResult;
import ch2.m;

public final class l extends c implements g	// class@000edf
{
    public final Map p;
    public final Map q;
    public final PublishSubject r;
    public m s;
    public final g t;
    public n u;
    public static String sLivePresenterClassName = "LiveKrnRedPacketPresenter";
    public static final List v;

    static {
       l.v = a.a(LiveLogTag.KRN_LEEE, "LiveKrnRedPacketPresenter");
    }
    public void l(){
       super();
       this.p = new HashMap();
       this.q = new HashMap();
       this.r = PublishSubject.g();
       this.t = new k(this);
       this.u = new l$a(this);
       this.U7(new j());
       this.U7(new a());
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, l.class, "2")) {
          return;
       }
       this.s.u().u0(920, LiveKrnRedPackMessage$SCLiveKrnRedPackShow.class, this.t);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, l.class, "3")) {
          return;
       }
       this.s.u().o(920, this.t);
       this.p.clear();
       Iterator iterator = this.q.values().iterator();
       while (iterator.hasNext()) {
          b9.a(iterator.next());
       }
       this.q.clear();
       return;
    }
    public void P8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "6")) {
          return;
       }
       k1.o(new j(this, p0));
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, l.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new m();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, l.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(l.class, new m());
       }else {
          obj.put(l.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, l.class, "1")) {
          return;
       }
       this.s = this.r8("LIVE_BASIC_CONTEXT");
       return;
    }
}
