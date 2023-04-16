package com.yxcorp.gifshow.relation.util.b;
import java.lang.Object;
import android.view.ViewGroup;
import android.view.View;
import dac.b;
import k2b.e0;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import hcc.g;
import k2b.f3;
import lnc.i3;
import java.lang.Number;
import n7c.e;
import n7c.c;
import i2b.a;
import ekd.m1;
import android.widget.TextView;
import android.widget.Button;
import hcc.c;
import android.view.View$OnClickListener;
import hcc.d;
import com.yxcorp.gifshow.util.rx.RxBus;
import dac.a;
import brd.t;
import com.yxcorp.gifshow.relation.util.a;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.model.ContactGuideControlConfig;
import java.lang.reflect.Type;
import v6d.a;
import java.lang.System;
import java.lang.Long;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import km8.b;
import oe6.g;

public final class b	// class@001a53
{
    public static int a = 255;

    public void b(){
       super();
    }
    public static View a(ViewGroup p0,View p1,b p2,int p3,e0 p4){
       Button obj;
       g og;
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       String str = "1";
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),p4};
          obj = PatchProxy.apply(objArray, null, uob, str);
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       if (p1 == null) {
          og = g.class;
          if (!PatchProxy.isSupport(og) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p3), p4, null, og, "5")) {
             f3 uof3 = f3.j("OPEN_CONTACTS_CARD");
             i3 oi3 = i3.f();
             oi3.c("portal", Integer.valueOf(p3));
             uof3.m(oi3.e());
             uof3.h(p4);
          }
          og = PatchProxy.applyOneRefs(p0, null, e.class, str);
          if (og != patchProxyRe) {
          }else if(c.d()){
             i = 0x7f0d0219;
          }else {
             i = 0x7f0d021a;
          }
          i = a.i(p0, i);
       }
       TextView textView = m1.f(og, R.id.empty_title);
       TextView textView1 = m1.f(og, R.id.empty_subtitle);
       obj = m1.f(og, R.id.auth_button);
       Button uButton = m1.f(og, R.id.view_button);
       if (!p2.e()) {
          e.e(textView, textView1, obj, uButton);
       }
       obj.setOnClickListener(new c(p3, p4, p2));
       uButton.setOnClickListener(new d(p3, p4, p2));
       RxBus.f.f(a.class).subscribe(new a(obj, textView, textView1, uButton));
       return og;
    }
    public static void b(){
       if (PatchProxy.applyVoid(null, null, b.class, "4")) {
          return;
       }
       ContactGuideControlConfig uContactGuid = a.a(ContactGuideControlConfig.class);
       if (uContactGuid == null) {
          uContactGuid = new ContactGuideControlConfig();
       }
       uContactGuid.mMaxShowCount = uContactGuid.mMaxShowCount + 1;
       uContactGuid.mTime = Long.valueOf(System.currentTimeMillis());
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putString(b.d("user")+"contact_dialog_show_control", b.e(uContactGuid));
       g.a(uEditor);
       return;
    }
}
