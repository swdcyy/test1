package i51.o$a;
import lf3.b;
import i51.o;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Object;
import com.kuaishou.live.longconnection.connector.l$c;
import hf3.a;
import i51.p;
import i51.g;
import k2b.u1;
import com.kuaishou.android.live.model.Race;
import mf3.a;
import android.os.SystemClock;
import java.lang.Integer;
import java.lang.Throwable;
import com.kuaishou.live.longconnection.exception.LiveLongConnectionServerException;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Objects;
import java.lang.System;
import java.lang.StringBuilder;
import ekd.a0;

public class o$a extends b	// class@002830
{
    public final o a;

    public void o$a(o p0){
       this.a = p0;
       super();
    }
    public void b(String p0,long p1){
       o$a uoa = this;
       object oobject = p0;
       o$a uoa1 = o$a.class;
       String str = "2";
       if (PatchProxy.isSupport(uoa1) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, uoa1, str)) {
          return;
       }
       l$c uoc = uoa.a.a.j();
       o b = uoa.a.b;
       Object obj = null;
       object oobject1 = (uoc == null)? obj: uoc.a();
       object oobject2 = (uoc == null)? obj: String.valueOf(uoc.b());
       object oobject3 = (uoc == null)? obj: uoc.c();
       p op = p.class;
       if (PatchProxy.isSupport(op)) {
          Object[] objArray = new Object[]{b,oobject,oobject1,oobject2,oobject3,Long.valueOf(p1)};
          if (PatchProxy.applyVoid(objArray, obj, op, str)) {
          label_007d :
             uoa1 = uoa.a;
             uoa1.c(uoa1.b.getLiveStreamId(), uoa.a.a.h(), uoa.a.a.A0().a());
             uoa1 = uoa.a;
             if (!uoa1.c) {
                uoa1.c = SystemClock.elapsedRealtime();
             }
             return;
          }
       }
       u1.R("LS_LIVE_LONG_CONNECTION", p.a(b, p0, oobject1, oobject2, oobject3, p1, 7, 17), 3);
       goto label_007d ;
    }
    public void c(){
       Object obj = this;
       Object[] objArray = null;
       String str = "4";
       if (PatchProxy.applyVoid(objArray, obj, o$a.class, str)) {
          return;
       }
       l$c uoc = obj.a.a.j();
       if (uoc == null) {
          return;
       }
       o b = obj.a.b;
       String str1 = uoc.a();
       String str2 = String.valueOf(uoc.b());
       String str3 = uoc.c();
       o oo = null;
       long l = (obj.a.c - oo > 0)? SystemClock.elapsedRealtime() - obj.a.c: oo;
       int i = obj.a.a.A0().a();
       p op = p.class;
       int i1 = 3;
       if (PatchProxy.isSupport(op)) {
          Object[] objArray1 = new Object[]{b,str1,str2,str3,Long.valueOf(l),Integer.valueOf(i)};
          if (PatchProxy.applyVoid(objArray1, objArray, op, str)) {
          label_008e :
             return;
          }
       }
       u1.R("LS_LIVE_LONG_CONNECTION", p.b(b, "", str1, str2, str3, l, 10, 17, i, -1, null), 3);
       goto label_008e ;
    }
    public void e(LiveLongConnectionServerException p0){
       int i2;
       int i3;
       int i4;
       Object obj = this;
       Object obj1 = p0;
       String str = "5";
       if (PatchProxy.applyVoidOneRefs(obj1, obj, o$a.class, str)) {
          return;
       }
       l$c uoc = obj.a.a.j();
       o b = obj.a.b;
       Object obj2 = null;
       object oobject = (uoc == null)? obj2: uoc.a();
       object oobject1 = (uoc == null)? obj2: String.valueOf(uoc.b());
       object oobject2 = (uoc == null)? obj2: uoc.c();
       o$a uoa = null;
       long l = (obj.a.c - uoa > 0)? SystemClock.elapsedRealtime() - obj.a.c: uoa;
       int i = 1;
       int i1 = 2;
       if (uoc == null) {
          i2 = -1;
       }else {
          uoc = uoc.b;
          Object obj3 = PatchProxy.applyOneRefs(uoc, obj2, o.class, "7");
          if (obj3 != PatchProxyResult.class) {
             i3 = obj3.intValue();
          }else if(TextUtils.x(uoc)){
             Objects.requireNonNull(uoc);
             switch (uoc.hashCode()){
                 case 0x2fd85c:
                   if (uoc.equals("fast")) {
                      i4 = 0;
                   }
                   break;
                 case 0x33af38:
                   if (uoc.equals("none")) {
                      i4 = 1;
                   }
                   break;
                 case 0x35ea01:
                   if (uoc.equals("slow")) {
                      i4 = 2;
                   }
                   break;
                 default:
                label_007b :
                   i4 = -1;
             }
             switch (i4){
                 case 0:
                   i3 = 2;
                   break;
                 case 1:
                   i3 = 1;
                   break;
                 case 2:
                   i3 = 3;
                   break;
                 default:
             }
          }
          i3 = null;
          i2 = i3;
       }
       p op = p.class;
       if (PatchProxy.isSupport(op)) {
          Object[] objArray = new Object[]{b,oobject,oobject1,oobject2,Long.valueOf(l),Integer.valueOf(i2),obj1};
          if (PatchProxy.applyVoid(objArray, obj2, op, str)) {
          label_00ef :
             return;
          }
       }
       u1.R("LS_LIVE_LONG_CONNECTION", p.b(b, "", oobject, oobject1, oobject2, l, 8, 17, -1, i2, p0), 3);
       goto label_00ef ;
    }
    public void f(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, o$a.class, "6")) {
          return;
       }
       this.a.e = System.currentTimeMillis();
       l$c uoc = this.a.a.j();
       o b = this.a.b;
       Object[] objArray1 = (uoc == null)? objArray: uoc.a();
       if (uoc != null) {
          objArray = String.valueOf(uoc.b());
       }
       if (!PatchProxy.applyVoidThreeRefs(b, objArray1, objArray, null, p.class, "6")) {
          u1.R("LS_LIVE_LONG_CONNECTION_ENTERROOM", p.a(b, null, objArray1, objArray, null, 0, 1, 17), 3);
       }
       return;
    }
    public void k(long p0){
       o$a uoa = o$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uoa, "3")) {
          return;
       }
       o b = this.a.b;
       if (!PatchProxy.isSupport(p.class) || !PatchProxy.applyVoidThreeRefs(b, "", Long.valueOf(p0), null, p.class, "3")) {
          u1.R("LS_LIVE_LONG_CONNECTION", p.a(b, "", null, null, null, p0, 8, 17), 3);
       }
       o$a ta = this.a;
       ta.c(ta.b.getLiveStreamId(), this.a.a.h(), this.a.a.A0().a());
       return;
    }
    public void m(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, o$a.class, "1")) {
          return;
       }
       o b = this.a.b;
       long l = 0;
       p op = p.class;
       if (!PatchProxy.isSupport(op) || !PatchProxy.applyVoidThreeRefs(b, "", Long.valueOf(l), null, p.class, "1")) {
          if (!PatchProxy.applyVoidOneRefs(b, objArray, op, "13")) {
             l = SystemClock.elapsedRealtime();
             p.b = l;
             p.a = a0.c(TextUtils.k(b.getLiveStreamId())+TextUtils.k(b.d())+l);
          }
          u1.R("LS_LIVE_LONG_CONNECTION", p.a(b, "", null, null, null, 0, 1, 17), 3);
       }
       return;
    }
}
