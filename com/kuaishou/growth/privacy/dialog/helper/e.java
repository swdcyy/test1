package com.kuaishou.growth.privacy.dialog.helper.e;
import java.lang.Object;
import android.app.Activity;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uf0.a;
import android.content.SharedPreferences;
import tkd.b;
import tkd.d;
import ayb.i;
import android.content.Context;
import com.yxcorp.gifshow.util.PermissionUtils;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.content.SharedPreferences$Editor;
import oe6.g;
import java.util.ArrayList;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.util.HashMap;
import fg6.a;
import com.google.gson.Gson;
import q2b.h$b;
import k2b.u1;
import uf0.c;
import android.app.Dialog;
import java.lang.System;
import wf0.b;
import brd.t;
import wf0.d;
import wf0.e;
import erd.a;
import wf0.c;
import erd.g;
import crd.b;
import com.kuaishou.growth.privacy.dialog.helper.c;
import java.util.concurrent.Callable;
import t45.d;
import brd.z;
import com.kuaishou.growth.privacy.dialog.helper.a;
import io.reactivex.internal.functions.Functions;

public class e	// class@000713
{
    public boolean a;

    public void e(){
       super();
    }
    public void a(Activity p0){
       ArrayList uArrayList1;
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, e.class, "1")) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(obj1, obj, e.class, "3")) {
          SharedPreferences a = a.a;
          String str = "ShouldShowGeneralPermissionGuidance";
          int i = 2;
          int i1 = 0x4f878389;
          if (!a.getBoolean(str, true)) {
             d.a(i1).zH(i);
          }else {
             String str1 = "android.permission.READ_PHONE_STATE";
             boolean b = false;
             boolean b1 = (d.a(i1).BS() && !PermissionUtils.a(obj1, str1))? true: false;
             Object obj2 = PatchProxy.apply(null, obj, e.class, "10");
             boolean b2 = (obj2 != PatchProxyResult.class)? obj2.booleanValue(): false;
             boolean b3 = (b2 && !PermissionUtils.a(obj1, "android.permission.ACCESS_FINE_LOCATION"))? true: false;
             SharedPreferences$Editor uEditor = a.edit();
             uEditor.putBoolean(str, b);
             g.a(uEditor);
             int i2 = d.a(i1).BS() ^ 0x01;
             int i3 = (i2 && !PermissionUtils.a(obj1, str1))? -1: b1;
             ArrayList uArrayList = new ArrayList();
             if (b1) {
                uArrayList.add("READ_PHONE_STATE");
             }
             if (b3) {
                uArrayList.add("ACCESS_FINE_LOCATION");
             }
             if (PatchProxy.isSupport(e.class)) {
                uArrayList1 = uArrayList;
                if (PatchProxy.applyVoidThreeRefs(Boolean.valueOf(i2), Integer.valueOf(i3), uArrayList, this, e.class, "2")) {
                label_00fb :
                   if (!PatchProxy.isSupport(e.class) || !PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(b1), Boolean.valueOf(b3), this, e.class, "4")) {
                      if (!b1) {
                         d.a(i1).zH(i);
                      }
                      if (!b1 && !b3) {
                         d.a(i1).WO(b, true);
                      }else {
                         d.a(i1).WO(true, b);
                         uArrayList1 = (!b1 && b3)? 1: 0;
                         if (!uArrayList1) {
                            ArrayList uArrayList2 = new ArrayList();
                            if (b1) {
                               uArrayList2.add(str1);
                            }
                            c uoc = new c(obj1, 0x7f103bd6, 0x7f103bce);
                            uoc.show();
                            super(uoc, b1, b3, p0, System.currentTimeMillis());
                            String[] stringArray = new String[uArrayList2.size()];
                            PermissionUtils.j(obj1, uArrayList2.toArray(stringArray)).subscribe(new d(obj1, uArrayList2), new e(this), new c(this));
                         }
                      }
                   }
                }
             }else {
                uArrayList1 = uArrayList;
             }
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "APP_REQUEST_DEVICE_INFORMATION";
             HashMap hashMap = new HashMap();
             hashMap.put("is_ab_work", Integer.valueOf(i2));
             hashMap.put("is_device_information_pop_out", Integer.valueOf(i3));
             hashMap.put("permission_pop_out_type", uArrayList1);
             uElementPack.params = a.a.q(hashMap);
             h$b uob = h$b.d(b, 831);
             uob.k(uElementPack);
             u1.r0(uob);
             goto label_00fb ;
          }
       }
       if (!PatchProxy.applyVoidOneRefs(obj1, obj, e.class, "5") && obj.a == null) {
          t.fromCallable(c.b).subscribeOn(d.c).observeOn(d.a).subscribe(new a(obj, obj1), Functions.d());
       }
       return;
    }
}
