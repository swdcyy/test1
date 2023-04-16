package com.yxcorp.login.debuglogin.a$a$a;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.login.debuglogin.a$a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.login.debuglogin.a;
import android.widget.TextView;
import com.yxcorp.login.debuglogin.DebugAccountInfo;
import com.yxcorp.login.debuglogin.a$b;

public class a$a$a extends m	// class@001aa9
{
    public final a$a c;

    public void a$a$a(a$a p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a$a.class, "1")) {
          return;
       }
       a$a$a tc = this.c;
       if (tc.t.w != null && tc.r.getVisibility() == 4) {
          tc = this.c;
          tc.t.w.a(tc.p, tc.q);
       }
       return;
    }
}
