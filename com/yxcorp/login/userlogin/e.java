package com.yxcorp.login.userlogin.e;
import du5.g;
import com.yxcorp.login.userlogin.f;
import android.app.Activity;
import java.lang.String;
import androidx.fragment.app.Fragment;
import com.yxcorp.login.userlogin.f$a;
import java.lang.Object;
import du5.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.login.userlogin.e$a;
import du5.c;

public class e implements g	// class@001b25
{
    public final Activity a;
    public final String b;
    public final Fragment c;
    public final f$a d;
    public final f e;

    public void e(f p0,Activity p1,String p2,Fragment p3,f$a p4){
       this.e = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       super();
    }
    public void a(int p0){
    }
    public void b(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       p0.Dc(this.a, this.b, new e$a(this));
       return;
    }
}
