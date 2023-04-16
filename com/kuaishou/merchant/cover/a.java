package com.kuaishou.merchant.cover.a;
import erd.g;
import java.lang.Object;
import eda.n;
import java.lang.String;
import nv.c;
import js6.a;
import com.kuaishou.cover.Link;
import androidx.fragment.app.FragmentActivity;
import android.content.ComponentName;
import android.app.Activity;
import ev.b;

public final class a implements g	// class@001654
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final void accept(Object p0){
       c.f("logout");
       a.b.GO("KSUserDidLogoutEvent", "");
       if (Link.h().k() != null && (Link.h().k().getComponentName() != null && ("com.yxcorp.gifshow.HomeActivity").equals(Link.h().k().getComponentName().getClassName()))) {
          Link.h().f();
          p0.b = 0;
       }
    label_004f :
       return;
    }
}
