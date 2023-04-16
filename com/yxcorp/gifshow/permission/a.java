package com.yxcorp.gifshow.permission.a;
import com.yxcorp.gifshow.util.PermissionUtils$b;
import java.lang.Object;
import zq8.a;
import java.lang.String;
import wwb.f;

public final class a implements PermissionUtils$b	// class@0012cf
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final void a(a p0){
       if (("android.permission.READ_CONTACTS").equals(p0.a) && p0.b != null) {
          f.c(true);
       }
       return;
    }
}
