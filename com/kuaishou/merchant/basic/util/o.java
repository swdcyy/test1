package com.kuaishou.merchant.basic.util.o;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import lnc.a1;
import java.lang.Integer;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Number;
import wkd.b;
import com.kwai.framework.network.sntp.a;
import java.lang.System;
import com.lsjwzh.widget.text.FastTextView;
import com.kuaishou.merchant.basic.util.o$c;
import com.kuaishou.merchant.basic.util.o$b;
import android.os.CountDownTimer;
import ot3.s0;
import com.kuaishou.merchant.basic.util.n;
import com.kuaishou.merchant.basic.util.o$a;

public class o	// class@0015e7
{

    public void o(){
       super();
    }
    public static String a(long p0){
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), null, oo, "17");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 >= 0 && p0 - 9 <= 0) {
          return "0"+p0;
       }else {
          return Long.toString(p0);
       }
    }
    public static String b(long p0){
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), null, oo, "14");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       long l = p0 / 0x5265c00;
       p0 = p0 % 0x5265c00;
       long l1 = p0 / 0x36ee80;
       p0 = p0 % 0x36ee80;
       long l2 = p0 / 0xea60;
       p0 = (p0 % 0xea60) / 1000;
       if (l - null > 0) {
          return a1.q(0x7f103a3f, (int)l)+o.a(l1)+":"+o.a(l2)+":"+o.a(p0);
       }else {
          return o.a(l1)+":"+o.a(l2)+":"+o.a(p0);
       }
    }
    public static String c(String p0,String p1,int p2,long p3){
       String str;
       long l2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(o.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), Long.valueOf(p3), null, o.class, "12");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       if (p2 != 2) {
          Object obj1 = null;
          long l = 1000;
          long l1 = 0x36ee80;
          if (p2 != 3) {
             if (PatchProxy.isSupport(o.class)) {
                str = PatchProxy.applyOneRefs(Long.valueOf(p3), obj1, o.class, "13");
                if (str != patchProxyRe) {
                }
             }
             if (p3 - l1 > 0) {
                str = o.b(p3);
             }else {
                p3 = p3 % 0xea60;
                l2 = p3 / l;
                str = o.a((p3 / 0xea60))+":"+o.a(l2)+":"+((p3 % l) / 100);
             }
          }else if(PatchProxy.isSupport(o.class)){
             str = PatchProxy.applyOneRefs(Long.valueOf(p3), obj1, o.class, "15");
             if (str != patchProxyRe) {
             }
          }
          l2 = p3 / 0x5265c00;
          p3 = p3 % 0x5265c00;
          long l3 = p3 / l1;
          p3 = p3 % l1;
          l1 = p3 / 0xea60;
          p3 = (p3 % 0xea60) / l;
          l = 0;
          if (l2 - l > 0) {
             str = a1.q(0x7f103a3f, (int)l2)+o.a(l3)+":"+o.a(l1)+":"+o.a(p3);
          }else if(l3 - l > 0){
             str = o.a(l3)+":"+o.a(l1)+":"+o.a(p3);
          }else {
             str = o.a(l1)+":"+o.a(p3);
          }
       }else {
          str = o.b(p3);
       }
       if (!TextUtils.x(p0)) {
          str = p0+" "+str;
       }
       if (!TextUtils.x(p1)) {
          str = str+" "+p1;
       }
       return str;
    }
    public static long d(){
       Long obj = PatchProxy.apply(null, null, o.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = b.a(0x3b1f7b44).a();
       if (obj != null) {
          return obj.longValue();
       }
       return System.currentTimeMillis();
    }
    public static CountDownTimer e(FastTextView p0,long p1,int p2,String p3,String p4,o$c p5,o$b p6){
       object oobject;
       Object obj;
       n on;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object[] objArray = new Object[]{p0,Long.valueOf(p1),Integer.valueOf(p2),p3,p4,p5,oobject};
          oobject = null;
          obj = PatchProxy.apply(objArray, oobject, oo, "6");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       s0 os0 = new s0(p3, p4, p2, null, p0);
       if (PatchProxy.isSupport(oo)) {
          on = PatchProxy.applyThreeRefs(Long.valueOf(p1), p5, obj, null, o.class, "8");
          if (on != patchProxyRe) {
          label_007a :
             return on;
          }
       }
       long l = p1 - o.d();
       if (l <= 0) {
          p5.onFinish();
       }
       n on1 = new n(l, 100, obj, p5);
       on.start();
       goto label_007a ;
    }
}
