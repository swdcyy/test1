package com.kuaishou.growth.privacy.dialog.helper.s;
import java.lang.String;
import java.util.regex.Pattern;
import java.lang.Object;
import android.content.Context;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import wf0.o0;
import java.util.concurrent.Callable;
import brd.t;
import t45.d;
import brd.z;
import com.kuaishou.growth.privacy.dialog.helper.r;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;

public class s	// class@000723
{
    public static final Pattern a;
    public static final byte[] b;

    static {
       s.a = Pattern.compile("\(\\d\\D*\){6}$");
       s.b = ("gifshow$1801").getBytes();
    }
    public void s(){
       super();
    }
    public static void a(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, s.class, "1")) {
          return;
       }
       t.fromCallable(new o0(p0)).subscribeOn(d.c).observeOn(d.b).subscribe(r.b, Functions.d());
       return;
    }
}
