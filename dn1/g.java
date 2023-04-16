package dn1.g;
import yh3.a;
import hf3.a;
import vq5.d;
import android.app.Activity;
import p91.m;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.MutableLiveData;
import java.lang.Boolean;
import androidx.lifecycle.LiveData;
import dn1.g$c;
import dn1.g$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.livestream.message.nano.SCLiveHotspotRankShow;
import lf3.g;
import com.kuaishou.livestream.message.nano.SCLiveHotspotRankClose;
import dn1.g$a;
import dn1.g$a$b;
import android.content.Context;
import dn1.g$a$a;
import dn1.g$a$c;
import en1.c;
import lnc.i3;
import qrd.l1;

public final class g extends a	// class@001fd7
{
    public final LiveData a;
    public final LiveData b;
    public final LiveData c;
    public final LiveData d;
    public final LiveData e;
    public String f;
    public final g g;
    public final g h;
    public final a i;
    public final d j;
    public final Activity k;
    public final m l;

    public void g(a p0,d p1,Activity p2,m p3){
       a.p(p0, "liveLongConnection");
       a.p(p1, "liveRouterManager");
       a.p(p2, "activity");
       a.p(p3, "liveBasicContext");
       super();
       this.i = p0;
       this.j = p1;
       this.k = p2;
       this.l = p3;
       MutableLiveData mutableLiveD = new MutableLiveData(Boolean.TRUE);
       this.o0(mutableLiveD);
       this.a = mutableLiveD;
       mutableLiveD = new MutableLiveData();
       this.o0(mutableLiveD);
       this.b = mutableLiveD;
       mutableLiveD = new MutableLiveData();
       this.o0(mutableLiveD);
       this.c = mutableLiveD;
       mutableLiveD = new MutableLiveData();
       this.o0(mutableLiveD);
       this.d = mutableLiveD;
       mutableLiveD = new MutableLiveData();
       this.o0(mutableLiveD);
       this.e = mutableLiveD;
       g$c uoc = new g$c(this);
       this.g = uoc;
       g$b uob = new g$b(this);
       this.h = uob;
       if (PatchProxy.applyVoid(null, this, g.class, "2")) {
       }else {
          p0.u0(990, SCLiveHotspotRankShow.class, uoc);
          p0.u0(991, SCLiveHotspotRankClose.class, uob);
       }
       return;
    }
    public void onCleared(){
       g og = g.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, og, "1")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, og, "3")) {
          this.i.o(990, this.g);
          this.i.o(991, this.h);
       }
       return;
    }
    public final LiveData u0(){
       return this.c;
    }
    public void v0(g$a p0){
       g tf;
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "4")) {
          return;
       }
       a.p(p0, "intent");
       if (a.g(p0, g$a$b.a)) {
          tf = this.f;
          if (tf != null) {
             a.m(tf);
             this.j.r4(tf, this.k);
          }
          this.y0();
       }else if(a.g(p0, g$a$a.a)){
          tf = this.f;
          if (tf != null) {
             a.m(tf);
             this.j.r4(tf, this.k);
          }
          this.y0();
       }else if(p0 instanceof g$a$c){
          this.r0(this.e).setValue(Boolean.valueOf(p0.a));
       }
       return;
    }
    public final LiveData w0(){
       return this.a;
    }
    public final LiveData x0(){
       return this.d;
    }
    public final void y0(){
       if (PatchProxy.applyVoid(null, this, g.class, "5")) {
          return;
       }
       c uoc = new c("LIVE_HOTSPOT_STATIC_ENTRANCE", this.l);
       i3 oi3 = i3.f();
       oi3.a("is_related_author", this.a.getValue());
       String str = oi3.e();
       a.o(str, "JsonStringBuilder.newIns¡­ngBuilder\)\n      .build\(\)");
       uoc.a(str);
       uoc.b();
       return;
    }
}
