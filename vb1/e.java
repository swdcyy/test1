package vb1.e;
import vb1.d;
import lp3.a;
import java.util.HashSet;
import vb1.e$b;
import vb1.e$a;
import vb1.d$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import lp3.e;
import v51.a;
import lp3.c;
import hf3.a;
import com.kuaishou.livestream.message.nano.LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceStart;
import lf3.g;
import com.kuaishou.livestream.message.nano.LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceEnd;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;

public class e extends a implements d	// class@00431b
{
    public final HashSet d;
    public a e;
    public final g f;
    public final g g;

    public void e(){
       super();
       this.d = new HashSet();
       this.f = new e$b(this);
       this.g = new e$a(this);
    }
    public void L9(d$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "3")) {
          return;
       }
       a.p(p0, "observer");
       this.d.remove(p0);
       return;
    }
    public void Qo(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       c uoc = this.Po().a(a.class);
       a.o(uoc, "serviceManager.getServic¡­nnectManager::class.java\)");
       a uoa = uoc.u();
       this.e = uoa;
       if (uoa != null) {
          uoa.u0(994, LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceStart.class, this.f);
       }
       e te = this.e;
       if (te != null) {
          te.u0(995, LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceEnd.class, this.g);
       }
       return;
    }
    public void Ro(){
       if (PatchProxy.applyVoid(null, this, e.class, "6")) {
          return;
       }
       e te = this.e;
       if (te != null) {
          te.o(994, this.f);
       }
       te = this.e;
       if (te != null) {
          te.o(995, this.g);
       }
       return;
    }
    public void So(LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceEnd p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "5")) {
          return;
       }
       a.p(p0, "chatServiceEnd");
       b.Z(LiveCommonLogTag.BLIND_DATE, "onBlindDateChatServiceEnd");
       Iterator iterator = this.d.iterator();
       while (iterator.hasNext()) {
          iterator.next().h6();
       }
       return;
    }
    public void To(LiveBlindDateSignalMessages$SCLiveBlindDateChatServiceStart p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "4")) {
          return;
       }
       a.p(p0, "chatServiceStart");
       b.Z(LiveCommonLogTag.BLIND_DATE, "onBlindDateChatServiceStart");
       p0 = p0.servingUser;
       e uoe = null;
       if (p0 != null) {
          List list = (!p0.length)? 1: null;
          if (!list) {
          label_0026 :
             if (!uoe) {
                Iterator iterator = this.d.iterator();
                while (iterator.hasNext()) {
                   iterator.next().m2(ArraysKt___ArraysKt.uy(p0));
                }
             }
             return;
          }
       }
       uoe = 1;
       goto label_0026 ;
    }
    public void Z6(d$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "2")) {
          return;
       }
       a.p(p0, "observer");
       this.d.add(p0);
       return;
    }
    public final a u(){
       return this.e;
    }
}
