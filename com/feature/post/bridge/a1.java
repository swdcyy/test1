package com.feature.post.bridge.a1;
import erd.o;
import java.lang.String;
import com.feature.post.bridge.jsmodel.JsSaveImageParams;
import android.app.Activity;
import java.lang.Object;
import java.lang.Boolean;
import zq8.a;
import brd.t;
import com.kwai.framework.ui.popupmanager.dialog.a;
import mg.o4;

public final class a1 implements o	// class@00146a
{
    public final JsSaveImageParams b;
    public final Activity c;

    public void a1(String p0,JsSaveImageParams p1,Activity p2){
       super();
       this.b = p1;
       this.c = p2;
    }
    public final Object apply(Object p0){
       a1 tb = this.b;
       a1 tc = this.c;
       if (p0.booleanValue()) {
          p0 = t.just(new a("android.permission.WRITE_EXTERNAL_STORAGE", true));
       }else if(tb.isRequestPermissionsWithCancelEvent != null){
          p0 = new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"};
          p0 = a.l(tc, p0).map(new o4("android.permission.WRITE_EXTERNAL_STORAGE"));
       }else {
          p0 = a.g(tc, "android.permission.WRITE_EXTERNAL_STORAGE");
       }
       return p0;
    }
}
