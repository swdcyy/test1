package com.yxcorp.gifshow.relation.contacts.initmodule.d;
import java.lang.Runnable;
import java.lang.Object;
import com.yxcorp.gifshow.relation.contacts.initmodule.ContactInitModule;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.String;
import wwb.o;
import com.kwai.sdk.switchconfig.a;
import wwb.f;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import com.yxcorp.gifshow.util.PermissionUtils;
import java.util.List;

public final class d implements Runnable	// class@0017e9
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final void run(){
       String id = QCurrentUser.me().getId();
       if (QCurrentUser.me().isLogined() && (!o.c(id) && (a.t().d("contactAuthOptimize", false) && (f.a() && PermissionUtils.a(a.a().a(), "android.permission.READ_CONTACTS"))))) {
          List list = o.b();
          list.add(id);
          o.d(list);
       }else {
          o.e();
       }
       f.d(false);
       return;
    }
}
