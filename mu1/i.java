package mu1.i;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import zs1.f;
import du1.d;
import zs1.b;
import java.lang.Object;
import java.util.HashSet;
import mu1.h;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.livestream.message.nano.LivePkMessages$SCLivePkState;
import com.kuaishou.live.common.core.component.multipk.core.a;
import lf3.g;
import java.util.Set;
import java.lang.Long;
import java.lang.Boolean;
import com.kuaishou.livestream.message.nano.LivePkMessages$PkPlayerState;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import st1.c;
import gu1.a;
import kotlin.jvm.internal.a;
import gu1.e;
import java.lang.Runnable;
import java.util.concurrent.Future;
import pu1.g;
import gu1.f;

public class i	// class@003223
{
    public final f a;
    public final Set b;
    public final g c;
    public final String d;
    public final d e;
    public final b f;
    public LivePkMessages$SCLivePkState g;
    public static final List h;

    static {
       i.h = LiveCommonLogTag.MULTI_PK.appendTag("LiveMultiPkWishListModel");
    }
    public void i(f p0,String p1,d p2,b p3){
       super();
       this.b = new HashSet();
       h oh = new h(this);
       this.c = oh;
       this.g = null;
       this.a = p0;
       this.d = p1;
       this.e = p2;
       this.f = p3;
       if (PatchProxy.applyVoid(null, this, i.class, "8")) {
       }else {
          p0.u0(974, LivePkMessages$SCLivePkState.class, oh);
       }
       return;
    }
    public void a(){
       i oi = i.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oi, "10")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, oi, "9")) {
          this.a.o(974, this.c);
       }
       this.b.clear();
       return;
    }
    public void b(long p0,boolean p1,boolean p2){
       int i;
       int this;
       object oobject;
       e uoe;
       i oi = this;
       if (PatchProxy.isSupport(i.class) && PatchProxy.applyVoidThreeRefs(Long.valueOf(p0), Boolean.valueOf(p1), Boolean.valueOf(p2), this, i.class, "5")) {
          return;
       }
       i g = oi.g;
       if (g != null) {
          LivePkMessages$SCLivePkState playerState = g.playerState;
          if (playerState != null) {
             int len = playerState.length;
             i = 0;
             this = 0;
             while (true) {
                if (this < len) {
                   oobject = playerState[this];
                   if (!oobject.playerId - p0) {
                   label_003e :
                      if (oobject == null) {
                         return;
                      }else {
                         int i1 = 1;
                         LivePkMessages$PkPlayerState[] pkPlayerStat = new LivePkMessages$PkPlayerState[i1];
                         pkPlayerStat[i] = oobject;
                         e0 uoe0 = oi.e.i();
                         ClientContent$LiveStreamPackage liveStreamPa = oi.e.a();
                         c uoc = oi.f.z();
                         if (PatchProxy.isSupport(a.class)) {
                            Object[] objArray = new Object[]{uoe0,pkPlayerStat,liveStreamPa,uoc,Boolean.valueOf(p1),Boolean.valueOf(p2)};
                            if (!PatchProxy.applyVoid(objArray, null, a.class, "2")) {
                            }
                         }else {
                         }
                      }
                   }else {
                      this++;
                   }
                }else {
                   oobject = null;
                   goto label_003e ;
                }
             }
          }
       }
       return;
    }
    public void c(long p0,e0 p1,boolean p2,Boolean p3){
       LivePkMessages$SCLivePkState this;
       f uof;
       if (PatchProxy.isSupport(i.class) && PatchProxy.applyVoidFourRefs(Long.valueOf(p0), p1, Boolean.valueOf(p2), p3, this, i.class, "4")) {
          return;
       }
       i tg = this.g;
       if (tg != null) {
          this = tg.playerState;
          if (this != null) {
             ClientContent$LiveStreamPackage liveStreamPa = this.e.a();
             c uoc = this.f.z();
             boolean b = p3.booleanValue();
             a uoa = a.class;
             if (PatchProxy.isSupport(uoa)) {
                Object[] objArray = new Object[]{this,p1,liveStreamPa,uoc,Long.valueOf(p0),Boolean.valueOf(p2),Boolean.valueOf(b)};
                if (!PatchProxy.applyVoid(objArray, null, uoa, "1")) {
                }
             }else {
             }
          }
       }
       return;
    }
}
