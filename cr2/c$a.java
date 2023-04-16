package cr2.c$a;
import pr2.f$b;
import cr2.c;
import java.lang.Object;
import com.kuaishou.livestream.message.nano.SCLiveVoicePartyPkStatistic;
import pr2.g;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.System;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.livestream.message.nano.SCLiveVoicePartyPkOpMicSeats;

public class c$a implements f$b	// class@0023ca
{
    public final c a;

    public void c$a(c p0){
       this.a = p0;
       super();
    }
    public void a(SCLiveVoicePartyPkStatistic p0){
       g.f(this, p0);
    }
    public void b(int p0){
       c$a uoa = c$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "2")) {
          return;
       }
       this.a.m();
       p0.n = 0;
       return;
    }
    public void c(long p0){
       g.j(this, p0);
    }
    public void d(SCLiveVoicePartyPkStatistic p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "1")) {
          return;
       }
       this.a.n = System.currentTimeMillis();
       this.a.o = TextUtils.k(p0.pkId);
       return;
    }
    public void e(){
       g.h(this);
    }
    public void f(){
       g.k(this);
    }
    public void g(){
       g.g(this);
    }
    public void h(SCLiveVoicePartyPkStatistic p0){
       g.i(this, p0);
    }
    public void i(long p0){
       g.c(this, p0);
    }
    public void j(SCLiveVoicePartyPkOpMicSeats p0){
       g.a(this, p0);
    }
    public void k(int p0,String p1){
       g.b(this, p0, p1);
    }
}
