package b86.i;
import android.os.Handler;
import java.lang.Object;
import java.lang.Long;
import android.os.Message;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import b86.a;
import nsd.u;
import b86.g;
import s76.a;
import p76.a;
import z76.a;
import kotlin.jvm.internal.a;
import p76.g;
import b86.h;
import yb6.d;
import q76.a;
import kotlin.Triple;

public final class i	// class@000440
{

    public static final Message a(Handler p0,int p1,int p2,Object p3,Long p4,Long p5,Long p6,Long p7,Long p8,Long p9){
       Object[] objArray;
       Message obj;
       i oi = i.class;
       if (PatchProxy.isSupport(oi)) {
          objArray = new Object[10];
          objArray[0] = p0;
          objArray[1] = Integer.valueOf(p1);
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = p3;
          objArray[4] = p4;
          objArray[5] = p5;
          objArray[6] = p6;
          objArray[7] = p7;
          objArray[8] = p8;
          objArray[9] = p9;
          obj = PatchProxy.apply(objArray, null, oi, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = Message.obtain(p0);
       if (obj == null) {
          obj = new Message();
       }
       obj.what = p1;
       a uoa = new a(p2, p3, p4, p5, p6, p7, p8, p9, 0, 256, null);
       obj.obj = objArray;
       return obj;
    }
    public static Message b(Handler p0,int p1,int p2,Object p3,Long p4,Long p5,Long p6,Long p7,Long p8,Long p9,int p10,Object p11){
       int i = p10;
       Object obj = (i & 0x04)? null: p3;
       Long longx = (i & 0x08)? null: p4;
       Long longx1 = (i & 0x40)? null: p7;
       Long longx2 = (i & 0x0080)? null: p8;
       return i.a(p0, p1, p2, obj, longx, null, null, longx1, longx2, null);
    }
    public static final void c(int p0,Object p1){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, null, oi, "12")) {
          return;
       }
       Handler handler = g.f();
       Message message = i.b(handler, -2, p0, null, null, null, null, null, null, null, 508, null);
       message.obj = p1;
       if (a.h(p0)) {
          handler.sendMessage(message);
       }
       return;
    }
    public static final void d(int p0,a p1,a p2){
       if (PatchProxy.isSupport(i.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, null, i.class, "6")) {
          return;
       }
       a.p(p2, "callTimeStack");
       if (p1 == null || p1.b != p0) {
          i.e(p0, p2);
          return;
       }else {
          Handler handler = g.i(p0).a();
          Message message = i.b(handler, 4, p0, p1, null, null, null, p2.e, p2.f, null, 312, null);
          if (a.f(p0)) {
             handler.sendMessage(message);
          }
          return;
       }
    }
    public static final void e(int p0,a p1){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, null, oi, "7")) {
          return;
       }
       a.p(p1, "callTimeStack");
       Handler handler = g.f();
       handler.sendMessage(i.a(handler, 5, p0, null, p1.b, p1.c, p1.d, p1.e, p1.f, Long.valueOf(d.a())));
       return;
    }
    public static final void f(int p0,a p1){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, null, oi, "3")) {
          return;
       }
       a.p(p1, "kgiFeature");
       Handler handler = g.i(p0).b();
       Message message = i.b(handler, 1, p0, p1, null, null, null, null, null, null, 504, null);
       if (a.f(p0)) {
          handler.sendMessage(message);
       }
       return;
    }
    public static final void g(int p0){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), null, oi, "4")) {
          return;
       }
       Handler handler = g.i(p0).b();
       Message message = i.b(handler, 2, p0, null, Long.valueOf(d.a()), null, null, null, null, null, 500, null);
       if (a.f(p0)) {
          handler.sendMessage(message);
       }
       return;
    }
    public static final void h(Handler p0,int p1,Object p2){
       if (PatchProxy.isSupport(i.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, null, i.class, "11")) {
          return;
       }
       Message message = i.b(p0, -1, p1, null, null, null, null, null, null, null, 508, null);
       message.obj = p2;
       if (a.h(p1)) {
          p0.sendMessage(message);
       }
       return;
    }
    public static final Triple i(Message p0){
       a i;
       a uoa = null;
       a obj = PatchProxy.applyOneRefs(p0, uoa, i.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "$this$unwrapChannelMessage");
       p0 = p0.obj;
       if (!p0 instanceof a) {
          return uoa;
       }
       obj = p0.h;
       i = p0.i;
       if (i instanceof Object) {
          uoa = i;
       }
       return new Triple(Integer.valueOf(obj), uoa, p0);
    }
}
