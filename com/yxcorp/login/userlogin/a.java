package com.yxcorp.login.userlogin.a;
import du5.g;
import com.yxcorp.login.userlogin.b;
import android.app.Activity;
import java.lang.String;
import com.yxcorp.login.model.AccountRiskParams;
import androidx.fragment.app.Fragment;
import com.yxcorp.login.userlogin.b$a;
import java.lang.Object;
import du5.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.login.userlogin.a$a;
import du5.c;

public class a implements g	// class@001afe
{
    public final Activity a;
    public final String b;
    public final AccountRiskParams c;
    public final Fragment d;
    public final b$a e;
    public final b f;

    public void a(b p0,Activity p1,String p2,AccountRiskParams p3,Fragment p4,b$a p5){
       this.f = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       this.e = p5;
       super();
    }
    public void a(int p0){
    }
    public void b(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       p0.Dc(this.a, this.b, new a$a(this));
       return;
    }
}
