package com.yxcorp.gifshow.tti.module.l;
import java.lang.Runnable;
import java.lang.Object;
import com.yxcorp.gifshow.tti.module.UploadContactsServiceInitModule;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.upload.r;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Application;
import o56.a;
import android.content.Context;
import ekd.p0;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import ny5.a;
import qfc.b;
import android.content.SharedPreferences;
import java.lang.System;
import oe6.e;
import wwb.o;
import com.yxcorp.gifshow.bean.ContactInfo;
import com.yxcorp.gifshow.helper.d;
import wkd.b;
import sca.e;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import brd.t;
import com.yxcorp.gifshow.upload.k;
import erd.o;
import cjd.e;
import com.yxcorp.gifshow.upload.h;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import java.lang.Exception;

public final class l implements Runnable	// class@001dde
{
    public static final l b;

    static {
       l.b = new l();
    }
    public void l(){
       super();
    }
    public final void run(){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       r or = r.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, objArray, or, "3")) {
       }else if(p0.F(a.b()) && (QCurrentUser.ME == null || !QCurrentUser.ME.isLogined())){
          String obj = PatchProxy.apply(objArray, objArray, or, "7");
          boolean b = false;
          if (obj != patchProxyRe) {
             b1 = obj.booleanValue();
          }else {
             obj = QCurrentUser.me().getId();
             b1 = (QCurrentUser.me().isLogined() && !TextUtils.isEmpty(obj))? a.a(): false;
          }
          if (b1) {
             Object obj1 = PatchProxy.apply(objArray, objArray, or, "8");
             if (obj1 != patchProxyRe) {
                b = obj1.booleanValue();
             }else {
                RequestTiming requestTimin = null;
                if (b.a.getLong("upload_contacts_interval", -1) - requestTimin >= 0 && (System.currentTimeMillis() - e.a.getLong("last_upload_contacts_time", requestTimin)) - 0x5265c00 > 0) {
                   b = true;
                }
             }
             if (b && o.c(QCurrentUser.me().getId())) {
                ContactInfo uContactInfo = d.a();
                if (uContactInfo != null && (!uContactInfo.hasContactItem() || uContactInfo.mUserAddressBook == null)) {
                   e.q0(System.currentTimeMillis());
                }else {
                   b.a(0x5419c6da).c(RequestTiming.COLD_START, uContactInfo).flatMap(k.b).map(new e()).subscribe(h.b, Functions.d());
                }
             }
          }
       }
    }
}
