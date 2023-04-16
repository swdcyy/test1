package com.yxcorp.gifshow.reminder.friend.heartbeat.RedDotRepository;
import com.yxcorp.gifshow.reminder.friend.heartbeat.RedDotRepository$mLocalRedDotCache$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.reminder.friend.heartbeat.FriendTabNotify$Common;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.concurrent.ConcurrentHashMap;
import jdc.f;
import java.lang.StringBuilder;
import k2b.f2;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public final class RedDotRepository	// class@001a9b
{
    public static final p a;
    public static final FriendTabNotify$Common b;
    public static final RedDotRepository c;

    static {
       RedDotRepository.c = new RedDotRepository();
       RedDotRepository.a = s.c(RedDotRepository$mLocalRedDotCache$2.INSTANCE);
       RedDotRepository.b = new FriendTabNotify$Common();
    }
    public void RedDotRepository(){
       super();
    }
    public static final void a(int p0){
       RedDotRepository redDotReposi = RedDotRepository.class;
       if (PatchProxy.isSupport(redDotReposi) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), null, redDotReposi, "9")) {
          return;
       }
       RedDotRepository.c.e().remove(Integer.valueOf(p0));
       if (p0 == 1) {
          f.d.b(RedDotRepository.b);
       }
       Object[] objArray = new Object[0];
       f2.b("RedDotRepository", "consumeLocalRedDot:"+p0, objArray);
       return;
    }
    public static final void b(FriendTabNotify$Common p0){
       RedDotRepository redDotReposi = RedDotRepository.class;
       if (PatchProxy.applyVoidOneRefs(p0, null, redDotReposi, "2")) {
          return;
       }
       String str = "common";
       a.p(p0, str);
       f d = f.d;
       Objects.requireNonNull(d);
       if (!PatchProxy.applyVoidOneRefs(p0, d, f.class, "5")) {
          a.p(p0, str);
          if (p0.b == null) {
             p0.b = true;
             FriendTabNotify$Common uCommon = RedDotRepository.c(1);
             if (uCommon != p0 && uCommon != null) {
                FriendTabNotify$Common e = uCommon.e;
                a.o(e, "cached.mFilteredItems");
                if (e.isEmpty() ^ 1) {
                   e = uCommon.e;
                   p0.e = e;
                   a.o(e, "common.mFilteredItems");
                   d.e(p0, e);
                }
                e = uCommon.d;
                a.o(e, "cached.mClcFilteredItems");
                if (e.isEmpty() ^ 1) {
                   uCommon = uCommon.d;
                   p0.d = uCommon;
                   a.o(uCommon, "common.mClcFilteredItems");
                   d.e(p0, uCommon);
                }
             }
          }
       }
       RedDotRepository c = RedDotRepository.c;
       Objects.requireNonNull(c);
       if (!PatchProxy.applyVoidOneRefs(p0, c, redDotReposi, "3")) {
          c.e().put(Integer.valueOf(1), p0);
          c.e().put(Integer.valueOf(2), p0);
       }
       d.b(p0);
       return;
    }
    public static final FriendTabNotify$Common c(int p0){
       RedDotRepository redDotReposi = RedDotRepository.class;
       if (PatchProxy.isSupport(redDotReposi)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, redDotReposi, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return RedDotRepository.c.e().get(Integer.valueOf(p0));
    }
    public static final int d(int p0){
       RedDotRepository redDotReposi = RedDotRepository.class;
       if (PatchProxy.isSupport(redDotReposi)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, redDotReposi, "4");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       FriendTabNotify$Common uCommon = RedDotRepository.c.e().get(Integer.valueOf(p0));
       uCommon = (uCommon != null)? uCommon.mUnreadCount: 0;
       return uCommon;
    }
    public static final void f(int p0,FriendTabNotify$Common p1){
       RedDotRepository redDotReposi = RedDotRepository.class;
       if (PatchProxy.isSupport(redDotReposi) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, null, redDotReposi, "5")) {
          return;
       }
       RedDotRepository.c.e().put(Integer.valueOf(p0), p1);
       return;
    }
    public final ConcurrentHashMap e(){
       Object obj = PatchProxy.apply(null, this, RedDotRepository.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return RedDotRepository.a.getValue();
    }
}
