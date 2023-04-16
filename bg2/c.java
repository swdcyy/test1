package bg2.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import s00.a;
import android.util.Base64;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.Throwable;
import com.kuaishou.android.live.log.b;
import androidx.fragment.app.KwaiDialogFragment;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveFlvStreamMessage;
import java.lang.StringBuilder;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveQuiz2SyncMessage;
import p91.m;
import java.lang.Number;
import ta1.a;
import java.lang.System;
import java.lang.Long;
import ekd.k1;
import android.content.Context;
import java.lang.Boolean;
import com.kwai.framework.model.user.QCurrentUser;
import tkd.b;
import tkd.d;
import ou5.b;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import n3d.d;
import com.yxcorp.gifshow.image.KwaiImageView;
import d61.c0;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import xb.t$b;
import android.graphics.PointF;
import iv1.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.common.core.component.notification.LiveCommonNotificationMessage;
import iv1.b;

public class c	// class@0003ef
{

    public void c(){
       super();
    }
    public static byte[] a(byte[] p0,byte[] p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, c.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.a(p0, "0rdBzKBHVH7zkA4Z", p1);
    }
    public static String b(byte[] p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, c.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return (new String(c.a(p0, Base64.decode(p1, 2)))).split("_")[1];
    }
    public static void c(KwaiDialogFragment p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, c.class, "5")) {
          return;
       }
       if (p0 != null) {
          p0.dismissAllowingStateLoss();
       }
       return;
    }
    public static String d(LiveFlvStream$LiveFlvStreamMessage p0){
       StringBuilder obj = PatchProxy.applyOneRefs(p0, null, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "aac message: "+"message == null : "+false+", message.messageType = "+p0.messageType+", message.quiz2Sync = "+p0.quiz2Sync;
       if (p0.quiz2Sync != null) {
          obj = obj+", message.quiz2Sync.syncMessageType = "+p0.quiz2Sync.syncMessageType;
       }
       return obj;
    }
    public static long e(m p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       a uoa = p0.o();
       if (uoa != null) {
          return uoa.s();
       }
       return System.currentTimeMillis();
    }
    public static long f(long p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), null, uoc, "1");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       long l = 0;
       if (p0 - l > 0) {
          l = k1.k(p0);
       }
       return l;
    }
    public static boolean g(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, c.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (QCurrentUser.ME.isLogined() || p0 == null) {
          return false;
       }
       d.a(-1712118428).ne(p0, "", "", 111, "", null, null, null, null).h();
       return true;
    }
    public static void h(KwaiImageView p0,boolean p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, uoc, "11")) {
          return;
       }
       c0 a = c0.a;
       String str = (p1)? "/udata/pkg/kwai-client-image/live_live_answerbg3.webp": "/udata/pkg/kwai-client-image/live_live_answercardbg.webp";
       p0.L(a.b(str));
       p0.getHierarchy().u(t$b.j);
       p0.getHierarchy().t(new PointF(0x3f000000, 0));
       return;
    }
    public static void i(a p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, c.class, "4")) {
          return;
       }
       if (TextUtils.x(p1)) {
          return;
       }
       LiveCommonNotificationMessage liveCommonNo = new LiveCommonNotificationMessage();
       liveCommonNo.l0(14);
       liveCommonNo = liveCommonNo.g0("#FFFF7300").f0("#FFFF4A7B");
       liveCommonNo.t0("#FFFFFF");
       liveCommonNo.u0(p1);
       liveCommonNo.i0(0xea60);
       p0.a(liveCommonNo, null);
       return;
    }
}
