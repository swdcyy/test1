package com.yxcorp.gifshow.growth.d;
import java.lang.Runnable;
import java.lang.Object;
import wkd.b;
import com.yxcorp.gifshow.growth.util.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import vma.a;
import android.content.SharedPreferences;
import java.util.Set;
import qe6.b;
import java.lang.Boolean;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import vk7.g0;
import java.util.List;
import com.yxcorp.utility.SystemUtil;
import java.util.ArrayList;
import fg6.a;
import com.google.gson.Gson;
import com.kwai.framework.security.LogEncryptor;
import android.util.Base64;
import cra.w;
import java.lang.StringBuilder;
import java.lang.Exception;
import q87.c;
import h30.a;
import cra.o;
import lnc.i3;
import java.lang.Number;
import k2b.u1;
import yma.a;
import yma.b;
import android.net.Uri;
import android.content.ContentResolver;
import android.database.Cursor;
import c66.h$a;
import brd.t;
import cjd.e;
import erd.o;
import t45.d;
import brd.z;
import cra.h;
import cra.i;
import erd.g;
import crd.b;

public final class d implements Runnable	// class@001357
{
    public final int b;

    public void d(int p0){
       this.b = p0;
    }
    public final void run(){
       String str2;
       String str3;
       i3 obj;
       Cursor uCursor;
       Object[] objArray1;
       d b = this.b;
       a uoa = b.a(-1166008586);
       Objects.requireNonNull(uoa);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa1 = a.class;
       if (!PatchProxy.isSupport(uoa1) || (!PatchProxy.applyVoidOneRefs(Integer.valueOf(b), uoa, uoa1, "5") && (!a.a.getBoolean("coldStartDeepLinkActioned", false) && !a.b.contains(Integer.valueOf(b))))) {
          a.b.add(Integer.valueOf(b));
          boolean b1 = b.a();
          String str = "GrowthDeepLinkManager";
          String str1 = "";
          if (PatchProxy.isSupport(uoa1)) {
             str2 = PatchProxy.applyOneRefs(Boolean.valueOf(b1), uoa, uoa1, "6");
             if (str2 != patchProxyRe) {
             label_00a1 :
                str3 = str2;
             label_00c3 :
                String str4 = a.d();
                if (!PatchProxy.isSupport(o.class) || !PatchProxy.applyVoidThreeRefs(str3, str4, Boolean.valueOf(b1), null, o.class, "1")) {
                   obj = i3.f();
                   obj.d("imei", str3);
                   obj.d("oaid", str4);
                   obj.c("isAgreePrivacy", Integer.valueOf(b1));
                   u1.R("NEW_INSTALL_ACTIVE_SEND_SERVER_DP_SIGNAL", obj.e(), 9);
                }
                b uob = b.a(-1257347683).b();
                String str5 = uoa.b(b1, true);
                Object[] objArray = null;
                obj = PatchProxy.apply(objArray, uoa, uoa1, "8");
                if (obj != patchProxyRe) {
                }else if((a.k).equals("HUAWEI")){
                   obj = PatchProxy.apply(objArray, uoa, uoa1, "9");
                   if (obj != patchProxyRe) {
                   }else {
                      Uri uri = Uri.parse("content://com.huawei.appmarket.commondata/item/14");
                      ContentResolver contentResol = a.b().getContentResolver();
                      try{
                         int i = 0;
                         uCursor = contentResol.query(uri, null, null, null, i);
                         if (uCursor != null) {
                            uCursor.moveToFirst();
                            str1 = uCursor.getString(false);
                            objArray1 = new Object[false];
                            w.C().w(str, "clientDeeplink="+str1, objArray1);
                         }else {
                            objArray1 = new Object[false];
                            w.C().t(str, "clientDeeplink is null", objArray1);
                         }
                         if (uCursor != null) {
                         }
                      }catch(java.lang.Exception e0){
                         objArray1 = new Object[false];
                         w.C().t(str, e0.getMessage(), objArray1);
                         if (uCursor) {
                         }
                      }
                      uCursor.close();
                   }
                }
                obj = str1;
                uob.w("deepLink", str3, str4, str5, obj, h$a.a, b1).map(new e()).observeOn(d.c).subscribe(new h(uoa, b1), new i(b1));
             }
          }
          try{
             if (b1 && !g0.a(a.a().a(), "android.permission.READ_PHONE_STATE")) {
                List list = SystemUtil.j(a.b());
                if (list.size() > 0) {
                   str2 = Base64.encodeToString(LogEncryptor.c.a((a.a.q(list)).getBytes()), 2);
                   goto label_00a1 ;
                }
             }
          }catch(java.lang.Exception e0){
             Object[] objArray2 = new Object[false];
             w.C().t(str, "get imei crash->"+e0.getLocalizedMessage(), objArray2);
          }
          str3 = str1;
          goto label_00c3 ;
       }
    label_01c9 :
       return;
    }
}
