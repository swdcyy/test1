package l11.b;
import im8.g;
import c12.f;
import java.util.ArrayList;
import no1.j;
import l11.b$a;
import m11.l;
import java.util.List;
import l11.b$b;
import l11.a;
import q11.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import n11.e;
import p11.c;
import o11.a;
import r11.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import m11.p;
import e93.f;
import com.kwai.video.waynelive.listeners.LivePlayerTypeChangeListener;
import com.kwai.video.waynelive.ILivePlayerStatusMonitor;
import com.kwai.video.player.IMediaPlayer$OnVideoSizeChangedListener;
import mq5.h;
import mq5.b;
import com.kwai.robust.PatchProxyResult;
import l11.h;
import java.util.Map;
import java.util.HashMap;
import t02.a0;
import android.app.Activity;
import m11.a;
import m11.i;
import com.kuaishou.livestream.message.nano.LiveLineChatMessages$SCLiveLineChatReady;
import m11.d;
import lf3.g;
import hf3.a;
import com.kuaishou.livestream.message.nano.LiveLineChatMessages$SCLiveLineChatEnd;
import m11.e;
import com.kuaishou.livestream.message.nano.LiveLineChatMessages$SCLiveLineChatInfoUpdate;
import m11.f;
import m11.k;
import com.kwai.video.waynelive.LivePlayerController;
import m11.o;
import java.lang.Runnable;

public class b extends f implements g	// class@002e56
{
    public final List K;
    public b L;
    public a0 M;
    public j N;
    public j O;
    public l P;
    public a Q;
    public h R;
    public static String sLivePresenterClassName = "LiveAudienceLinePresenter";

    public void b(){
       super();
       ArrayList uArrayList = new ArrayList();
       this.K = uArrayList;
       this.N = new j();
       this.O = new b$a(this);
       this.P = new l(uArrayList);
       this.Q = new b$b(this);
       this.R = new a(this);
       this.U7(new a());
       this.U7(new e());
       this.U7(new c());
       this.U7(new a());
       this.U7(new a());
    }
    public void Q(boolean p0){
       b uob = b.class;
       String str = "3";
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, str)) {
          return;
       }
       this.K.clear();
       this.P.d("USER_EXIT");
       b tP = this.P;
       Objects.requireNonNull(tP);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, tP, l.class, "10")) {
          l e = tP.e;
          Objects.requireNonNull(e);
          if (!PatchProxy.applyVoid(objArray, e, p.class, str)) {
             f.g(e);
             e.a.removeLivePlayerTypeChangeListener(e.e);
             e.a.removeOnVideoSizeChangedListener(e.f);
             e.c = -1;
             e.d = false;
          }
          tP.f = false;
          tP.c.a();
       }
       this.L.le(this.R);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new h();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(b.class, new h());
       }else {
          obj.put(b.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       super.j8();
       this.L = this.r8("LIVE_AUDIENCE_LIVE_END_SERVICE");
       this.M = this.q8(a0.class);
       return;
    }
    public void x(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "2")) {
          return;
       }
       b tP = this.P;
       uob = this.M;
       b tN = this.N;
       Activity activity = this.getActivity();
       Objects.requireNonNull(tP);
       if (!PatchProxy.applyVoidThreeRefs(uob, tN, activity, tP, l.class, "1")) {
          tP.b = uob;
          tP.c = tN;
          tP.h = activity;
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, tP, l.class, "2")) {
             a uoa = new a();
             tP.d = uoa;
             uoa.h = new i(tP);
          }
          a0 c = uob.C;
          if (!PatchProxy.applyVoidOneRefs(c, tP, l.class, "7")) {
             c.u0(732, LiveLineChatMessages$SCLiveLineChatReady.class, new d(tP));
             c.u0(733, LiveLineChatMessages$SCLiveLineChatEnd.class, new e(tP));
             c.u0(734, LiveLineChatMessages$SCLiveLineChatInfoUpdate.class, new f(tP));
          }
          if (!PatchProxy.applyVoid(objArray, tP, l.class, "3")) {
             p op = new p(tP.b);
             tP.e = op;
             op.b = new k(tP);
             l e = tP.e;
             Objects.requireNonNull(e);
             if (!PatchProxy.applyVoid(objArray, e, p.class, "2")) {
                e.a.addLivePlayerTypeChangeListener(e.e);
                e.a.addOnVideoSizeChangedListener(e.f);
                if (e.a.isPlaying()) {
                   f.k("init.handleLiveStreamTypeChanged", new o(e), e, 0);
                }
             }
          }
       }
    label_00c8 :
       this.L.Km(this.R);
       return;
    }
}
