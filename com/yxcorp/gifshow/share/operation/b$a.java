package com.yxcorp.gifshow.share.operation.b$a;
import uo7.c0;
import com.yxcorp.gifshow.share.operation.b;
import uo7.k;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import com.kwai.framework.ui.popupmanager.dialog.a;
import com.yxcorp.gifshow.share.operation.b$a$a;
import erd.o;
import kotlin.jvm.internal.a;

public final class b$a extends c0	// class@001c03
{
    public final b c;
    public final k d;

    public void b$a(b p0,k p1,k p2){
       this.c = p0;
       this.d = p1;
       super(p2);
    }
    public t s(){
       t obj = PatchProxy.apply(null, this, b$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String[] stringArray = new String[]{"android.permission.WRITE_EXTERNAL_STORAGE","android.permission.READ_EXTERNAL_STORAGE"};
       obj = a.k(this.c.b, stringArray).flatMap(new b$a$a(this));
       a.o(obj, "PermissionDlgUtils.reque¡­  }\n          }\n        }");
       return obj;
    }
}
