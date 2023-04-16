package com.kuaishou.live.core.show.pk.k$b;
import iw1.a;
import com.kuaishou.live.core.show.pk.k;
import java.lang.Object;
import lp3.e;
import lp3.c;
import lp3.b;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import hd2.f;
import ic3.a;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Boolean;
import com.kuaishou.live.common.core.component.pk.audience.LiveAudiencePKState;
import com.kuaishou.live.lite.pk.MultiPkGameState;
import com.kuaishou.live.core.show.pk.i$b;
import com.kuaishou.live.core.show.pk.k$e;

public class k$b implements a	// class@000d8e
{
    public final k b;

    public void k$b(k p0){
       this.b = p0;
       super();
    }
    public void create(e p0){
       b.a(this, p0);
    }
    public void destroy(){
       b.b(this);
    }
    public String m(){
       Object obj = PatchProxy.apply(null, this, k$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!f.b()) {
          return this.b.S8();
       }
       if (this.b.B.Vf()) {
          return this.b.B.M9();
       }
       return "";
    }
    public UserInfo r3(){
       Object obj = PatchProxy.apply(null, this, k$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (f.b()) {
          return this.b.B.Y6();
       }
       return this.b.R8();
    }
    public boolean wn(){
       Object obj = PatchProxy.apply(null, this, k$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (f.b()) {
          return this.b.B.Vf();
       }
       return this.b.V8();
    }
    public LiveAudiencePKState zh(){
       MultiPkGameState obj = PatchProxy.apply(null, this, k$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (f.b()) {
          if (this.b.B.Vf()) {
             obj = this.b.B.Si();
             if (obj == MultiPkGameState.VOTE) {
                return LiveAudiencePKState.PLAYING;
             }else if(obj == MultiPkGameState.PUNISH || obj == MultiPkGameState.POST_PUNISH){
                return LiveAudiencePKState.PUNISH;
             }
          }
          return LiveAudiencePKState.IDLE;
       }else {
          i$b uob = this.b.D.b();
          if (uob == null) {
             return LiveAudiencePKState.IDLE;
          }
          return uob.r;
       }
    }
}
