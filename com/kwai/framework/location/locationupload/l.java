package com.kwai.framework.location.locationupload.l;
import java.lang.Object;
import com.kwai.framework.location.locationupload.LocationUploadConfig;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import r96.u;
import java.lang.Runnable;
import java.util.concurrent.Future;
import t45.c;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.location.locationupload.LocationUploadConfig$DynamicConfig;
import com.yxcorp.utility.NetworkUtilsCached;
import p96.a;
import q87.c;
import ekd.e0;
import android.content.Context;
import com.yxcorp.utility.WifiUtil$a;
import com.yxcorp.utility.WifiUtil;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import r96.x;
import java.lang.Long;
import wkd.b;
import r96.c;
import d60.h;
import d60.g;
import com.google.protobuf.nano.MessageNano;
import r96.z;
import d60.e;
import com.kwai.framework.location.k;
import r96.w;
import brd.t;
import t45.d;
import brd.z;
import r96.t;
import r96.s;
import erd.g;
import crd.b;

public class l	// class@00164a
{
    public String a;
    public long b;
    public static final String c = "l";

    public void l(){
       super();
       this.a = "";
    }
    public void a(LocationUploadConfig p0,boolean p1){
       l ol = l.class;
       if (PatchProxy.isSupport(ol) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, ol, "2")) {
          return;
       }
       c.k(new u(this, p0, p1));
       return;
    }
    public final void b(LocationUploadConfig p0,boolean p1){
       String obj2;
       boolean b1;
       Object[] objArray;
       WifiUtil$a a;
       long l;
       int i1;
       long l2;
       String str1;
       Object obj = this;
       Object obj1 = p0;
       boolean b = p1;
       if (PatchProxy.isSupport(l.class) && PatchProxy.applyVoidTwoRefs(obj1, Boolean.valueOf(p1), obj, l.class, "3")) {
          return;
       }
       if (obj1 != null) {
          LocationUploadConfig locationUplo = LocationUploadConfig.class;
          if (PatchProxy.isSupport(locationUplo)) {
             obj2 = PatchProxy.applyOneRefs(Boolean.valueOf(p1), obj1, locationUplo, "7");
             if (obj2 != PatchProxyResult.class) {
                b1 = obj2.booleanValue();
             }else if(b){
                locationUplo = obj1.dynamicConfig;
                if (locationUplo != null && locationUplo.collectMacWhileKeepAlive != null) {
                label_0046 :
                   b1 = true;
                }
             }else {
                locationUplo = obj1.dynamicConfig;
                if (locationUplo != null && locationUplo.collectMacWithoutPermission != null) {
                   goto label_0046 ;
                }
             }
             b1 = false;
          }else {
             goto label_003c ;
          }
          if (b1) {
             if (!NetworkUtilsCached.l()) {
                objArray = new Object[0];
                a.C().s(l.c, "uploadWifiMacAddressSeparate wifi is not connected!", objArray);
                return;
             }else {
                WifiUtil$a uoa = WifiUtil.c(e0.b);
                a = uoa.a;
                String c = l.c;
                objArray = new Object[0];
                a.C().w(c, "uploadWifiMacAddressSeparate macAddress = "+a, objArray);
                if (TextUtils.x(a)) {
                   return;
                }else {
                   l = x.a();
                   int i = (obj.a).equals(a) ^ 0x01;
                   long l1 = l - obj.b;
                   if (PatchProxy.isSupport(l.class)) {
                      i1 = i;
                      l2 = l;
                      obj2 = PatchProxy.applyThreeRefs(p0, Long.valueOf(l1), Boolean.valueOf(p1), 0, l.class, "4");
                      if (obj2 != PatchProxyResult.class) {
                         b1 = obj2.booleanValue();
                      }else {
                      label_00d5 :
                         locationUplo = obj1.dynamicConfig;
                         if (locationUplo != null) {
                            long l4 = 1000;
                            if (b) {
                               if (l1 - ((long)locationUplo.collectMacWhileKeepAliveMinInterval * l4) <= 0) {
                               label_00e9 :
                                  b1 = false;
                               }
                            }else if(l1 - ((long)locationUplo.collectMacWithoutPermissionMinInterval * l4) > 0){
                            }
                            b1 = true;
                         }
                      }
                   }else {
                      i1 = i;
                      l2 = l;
                      goto label_00d5 ;
                   }
                   if (!i1 && !b1) {
                      objArray = new Object[0];
                      a.C().w(c, "uploadWifiMacAddressSeparate failed:  macAddressChanged = "+i1+" isOutOfInterval = "+b1, objArray);
                      return;
                   }else {
                      Object obj3 = b.a(0x7e473ecc);
                      WifiUtil$a obj4 = null;
                      if (PatchProxy.isSupport(l.class)) {
                         obj2 = PatchProxy.applyTwoRefs(a, Boolean.valueOf(p1), obj4, l.class, "5");
                         if (obj2 != PatchProxyResult.class) {
                         label_015e :
                            Object obj5 = obj2;
                            String str = p0.c();
                            obj2 = PatchProxy.applyOneRefs(uoa, obj4, l.class, "6");
                            if (obj2 != PatchProxyResult.class) {
                            }else {
                               e uoe = new e();
                               uoe.a = k.f();
                               uoe.b = k.e(e0.b);
                               uoe.f = uoa.b;
                               obj4 = uoa.c;
                               if (obj4 == null) {
                                  str1 = "";
                               }
                               uoe.g = str1;
                               obj2 = z.a(uoe);
                            }
                            Object obj6 = obj2;
                            long l3 = l2;
                            obj3.c(l2, "", "", "", obj5, null, str, 0, obj6, w.b(), 0, "", "").subscribeOn(d.c).subscribe(new t(obj, l3, a), new s(l3));
                            return;
                         }
                      }
                      h oh = new h();
                      oh.b = b;
                      g[] ogArray = new g[1];
                      oh.a = ogArray;
                      g og = new g();
                      og.a = a;
                      og.h = true;
                      og.g = true;
                      og.f = true;
                      oh.a[0] = og;
                      obj2 = z.a(oh);
                      goto label_015e ;
                   }
                }
             }
          }
       }
       objArray = new Object[0];
       a.C().w(l.c, "uploadWifiMacAddressSeparate config invalid!", objArray);
       return;
    }
}
