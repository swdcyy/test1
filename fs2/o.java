package fs2.o;
import jp2.r;
import com.kuaishou.live.viewcontroller.ViewController;
import fs2.p;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.livestream.message.nano.KtvMusicOrderInfo;
import jp2.q;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;
import crd.b;
import ws5.c;
import com.kuaishou.live.core.voiceparty.theater.util.AutoDisposeKt;
import com.yxcorp.gifshow.model.Lyrics;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;

public abstract class o extends ViewController implements r	// class@0029b6
{
    public final p j;

    public void o(p p0){
       a.p(p0, "dependency");
       super();
       this.j = p0;
    }
    public void C1(KtvMusicOrderInfo p0,boolean p1,long p2){
       q.b(this, p0, p1, p2);
    }
    public void F2(){
       if (PatchProxy.applyVoid(null, this, o.class, "1")) {
          return;
       }
       this.Q2(R.layout.arg_RES_7f0d16b3);
       AutoDisposeKt.b(this.j.h.a(this.A2(R.id.top_bar_place_holder)), this);
       return;
    }
    public void J(KtvMusicOrderInfo p0,Lyrics p1){
       q.g(this, p0, p1);
    }
    public void K1(KtvMusicOrderInfo p0){
       q.j(this, p0);
    }
    public void S0(KtvMusicOrderInfo p0){
       q.h(this, p0);
    }
    public void Z(KtvMusicOrderInfo p0){
       q.e(this, p0);
    }
    public void b2(KtvMusicOrderInfo p0){
       q.c(this, p0);
    }
    public void p0(KtvMusicOrderInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "2")) {
          return;
       }
       a.p(p0, "music");
       i.e(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f10254c), 0);
       return;
    }
    public void q2(KtvMusicOrderInfo p0,Lyrics p1){
       q.i(this, p0, p1);
    }
    public void u1(){
       q.a(this);
    }
    public void x1(KtvMusicOrderInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "3")) {
          return;
       }
       a.p(p0, "music");
       i.e(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f10254c), 0);
       return;
    }
}
