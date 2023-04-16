package com.yxcorp.gifshow.relation.contacts.initmodule.a;
import com.yxcorp.gifshow.util.PermissionUtils$b;
import java.lang.Object;
import zq8.a;
import com.yxcorp.gifshow.relation.contacts.initmodule.ContactInitModule;
import java.lang.String;
import com.kwai.framework.model.user.QCurrentUser;
import java.util.List;
import wwb.o;

public final class a implements PermissionUtils$b	// class@0017e6
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final void a(a p0){
       if ((p0.a).equals("android.permission.READ_CONTACTS") && (p0.b != null && QCurrentUser.me().isLogined())) {
          List list = o.b();
          String id = QCurrentUser.me().getId();
          if (!list.contains(id)) {
             list.add(id);
             o.d(list);
          }
       }
       return;
    }
}
