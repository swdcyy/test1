package fd1.k;
import java.lang.Runnable;
import fd1.l;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import fd1.b;
import fd1.a;
import xp5.g;
import brd.t;
import cjd.e;
import erd.o;
import fd1.i;
import sfc.a;
import erd.g;
import crd.b;
import crd.a;

public final class k implements Runnable	// class@0022f7
{
    public final l b;
    public final String c;
    public final String d;
    public final boolean e;
    public final int f;
    public final int g;

    public void k(l p0,String p1,String p2,boolean p3,int p4,int p5){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
    }
    public final void run(){
       k tb = this.b;
       k tc = this.c;
       k td = this.d;
       k te = this.e;
       k tf = this.f;
       k tg = this.g;
       Objects.requireNonNull(tb);
       l ol = l.class;
       int i = 1;
       if (PatchProxy.isSupport(ol)) {
          Object[] objArray = new Object[]{tc,td,Boolean.valueOf(te),Integer.valueOf(tf),Integer.valueOf(tg)};
          if (PatchProxy.applyVoid(objArray, tb, ol, "5")) {
          label_0079 :
             return;
          }
       }
       b.c0(LiveLogTag.LIVE_QUESTIONNAIRE, "request questionnaire info", "questionnaireId", td);
       l t = tb.t;
       b uob = a.a();
       String str = (tf == i)? "/rest/n/live/plus/recruit/audience/job/questionnaire/banner": "/rest/n/live/questionnaire/info";
       t.c(uob.a(str, tb.q.getLiveStreamId(), td, te, 1, tf).map(new e()).subscribe(new i(tb, tc, tg), new a()));
       goto label_0079 ;
    }
}
