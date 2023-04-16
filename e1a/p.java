package e1a.p;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import p5a.b;
import java.lang.Number;
import com.yxcorp.gifshow.detail.helper.d;
import java.util.Objects;
import java.lang.Long;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.System;
import com.yxcorp.gifshow.detail.helper.PlayPositionInfo;
import java.lang.Math;
import wkd.b;
import com.kwai.framework.player.core.b;
import com.kwai.video.player.IKwaiMediaPlayer;

public class p	// class@002053
{
    public static final long a;
    public static final int b;

    static {
       p.a = a.t().b("continuedPlayExpiredTimeInterval", 600) * 1000;
    }
    public void p(){
       super();
    }
    public static boolean a(QPhoto p0,int p1){
       boolean b1;
       if (PatchProxy.isSupport(p.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, p.class, "8");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = true;
       if (r1.g2(p0.mEntity)) {
          return b;
       }else if(p1 != b){
          if (p1 != 2) {
             Object obj1 = PatchProxy.applyOneRefs(p0, null, p.class, "9");
             if (obj1 != PatchProxyResult.class) {
                b1 = obj1.booleanValue();
             }else if(r1.Y2(p0.mEntity) || b.h(p0)){
                b = 0;
             }
             b1 = b;
             return b1;
          }else {
             return false;
          }
       }else {
          return b;
       }
    }
    public static long b(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, p.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return p.d().b(p0);
    }
    public static long c(QPhoto p0,int p1){
       p op = p.class;
       d obj = null;
       if (PatchProxy.isSupport(op)) {
          Object obj1 = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), obj, op, "11");
          if (obj1 != PatchProxyResult.class) {
             return obj1.longValue();
          }
       }
       if (!p.a(p0, p1)) {
          return 0;
       }else if(p1 != 3 || PatchProxy.applyVoid(obj, obj, op, "5")){
          d uod = p.d();
          long a = p.a;
          Objects.requireNonNull(uod);
          obj = d.class;
          if (!PatchProxy.isSupport(obj) || (!PatchProxy.applyVoidOneRefs(Long.valueOf(a), uod, obj, "7") && (uod.a("clearExpiredPosition") && !uod.a.isEmpty()))) {
             Object e = d.e;
             _monitor_enter(e);
             Iterator iterator = uod.a.entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                long l = uEntry.getValue().mSaveTimestamp + uEntry.getValue().mExtraKeepSaveTimeMs;
                long l1 = System.currentTimeMillis() - l;
                if (l1 - a > 0) {
                   iterator.remove();
                }
             }
             _monitor_exit(e);
          }
       }
       return Math.max(p.b(p0), 0);
    }
    public static d d(){
       Object obj = PatchProxy.apply(null, null, p.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(-1917741477);
    }
    public static boolean e(QPhoto p0,int p1,int p2){
       if (PatchProxy.isSupport(p.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), null, p.class, "7");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (r1.g2(p0.mEntity)) {
          return true;
       }else if(p1 != 1){
          if (p1 != 2) {
             return p.a(p0, p2);
          }else {
             return false;
          }
       }else {
          return true;
       }
    }
    public static void f(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, p.class, "3")) {
          return;
       }
       p.d().h(p0);
       return;
    }
    public static void g(b p0,QPhoto p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, p.class, "1")) {
          return;
       }
       if (p0 != null && p0.getIKwaiMediaPlayer() != null) {
          long currentPosit = p0.getCurrentPosition();
          if (currentPosit > 0) {
             p.d().f(p1, currentPosit);
          }else if(p0.isVideoRenderingStart() || p0.isAudioRenderingStart()){
             p.d().h(p1);
          }
       }
       return;
    }
}
