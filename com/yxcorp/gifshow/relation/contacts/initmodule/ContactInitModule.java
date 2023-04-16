package com.yxcorp.gifshow.relation.contacts.initmodule.ContactInitModule;
import com.kwai.framework.init.a;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.init.CoreInitModule;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import b76.a;
import oe6.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Integer;
import java.lang.NumberFormatException;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import com.yxcorp.gifshow.util.PermissionUtils;
import ny5.a;
import tkd.b;
import tkd.d;
import pv5.c;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import com.kwai.feature.api.social.login.model.SwitchAccountModel;
import wwb.o;
import z9c.b;
import java.lang.Runnable;
import t45.c;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.l;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import z9c.a;
import erd.g;
import crd.b;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.gifshow.relation.contacts.initmodule.e;
import java.util.concurrent.Callable;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.relation.contacts.initmodule.b;
import io.reactivex.internal.functions.Functions;
import com.yxcorp.gifshow.relation.contacts.initmodule.d;

public class ContactInitModule extends a	// class@0017e5
{
    public static final int q;

    public void ContactInitModule(){
       super();
    }
    public boolean C(){
       return true;
    }
    public int f0(){
       return 13;
    }
    public List g(){
       Class[] obj = PatchProxy.apply(null, this, ContactInitModule.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Class[]{CoreInitModule.class};
       return Lists.e(obj);
    }
    public void i0(){
       if (PatchProxy.applyVoid(null, this, ContactInitModule.class, "5")) {
          return;
       }
       if (this.g0()) {
          this.l0();
       }
       return;
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ContactInitModule.class, "1")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, ContactInitModule.class, "2")) {
          String str = a.s();
          if (!TextUtils.x(str)) {
             int i = 0;
             try{
                i = Integer.parseInt(str.substring((str.lastIndexOf(".") + 1)));
             }catch(java.lang.NumberFormatException e3){
                e3.printStackTrace();
             }
             if (i <= 0x412a && (PermissionUtils.a(a.a().a(), "android.permission.READ_CONTACTS") && a.a())) {
                List list = d.a(0x6154d94e).k6();
                ArrayList uArrayList = new ArrayList(2);
                if (!q.f(list)) {
                   Iterator iterator = list.iterator();
                   while (iterator.hasNext()) {
                      uArrayList.add(iterator.next().mUserId);
                   }
                }
                o.d(uArrayList);
             }
          }
          c.a(new b(this));
          RxBus.f.g(l.class, RxBus$ThreadMode.MAIN).subscribe(new a(this));
       }
       this.l0();
       return;
    }
    public final void l0(){
       if (PatchProxy.applyVoid(null, this, ContactInitModule.class, "6")) {
          return;
       }
       if (!PermissionUtils.a(a.B, "android.permission.READ_CONTACTS") && QCurrentUser.me().isLogined()) {
          t.fromCallable(e.b).subscribeOn(d.c).observeOn(d.a).subscribe(b.b, Functions.d());
          return;
       }else {
          c.a(d.b);
          return;
       }
    }
    public void n(){
    }
}
