package com.kuaishou.live.core.voiceparty.core.shared.teampk.TeamPkManager$a;
import np2.a;
import java.lang.Object;
import com.kuaishou.live.core.voiceparty.core.shared.teampk.TeamPkManager$d;
import np2.j;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import hp2.m;
import msd.a;

public class TeamPkManager$a implements a	// class@00144a
{
    public a a;
    public m b;
    public String c;
    public boolean d;
    public final TeamPkManager$d e;
    public String f;

    public void TeamPkManager$a(){
       super();
       this.c = "";
       this.e = new TeamPkManager$d();
       this.f = "";
    }
    public j a(){
       return this.e();
    }
    public boolean b(){
       return this.d;
    }
    public String c(){
       TeamPkManager$a obj = PatchProxy.apply(null, this, TeamPkManager$a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       if (obj == null) {
          a.S("param");
       }
       return obj.a();
    }
    public final String d(){
       TeamPkManager$a obj = PatchProxy.apply(null, this, TeamPkManager$a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       if (obj == null) {
          a.S("liveStreamIdFetcher");
       }
       return obj.invoke();
    }
    public TeamPkManager$d e(){
       return this.e;
    }
    public final String f(){
       return this.f;
    }
    public void g(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TeamPkManager$a.class, "6")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.c = p0;
       return;
    }
    public void h(boolean p0){
       this.d = p0;
    }
    public String m(){
       return this.c;
    }
}
