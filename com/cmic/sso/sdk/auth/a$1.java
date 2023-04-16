package com.cmic.sso.sdk.auth.a$1;
import com.cmic.sso.sdk.c.c.d;
import com.cmic.sso.sdk.auth.a;
import com.cmic.sso.sdk.a;
import com.cmic.sso.sdk.auth.b;
import java.lang.Object;
import java.lang.String;
import org.json.JSONObject;

public class a$1 implements d	// class@000f2f
{
    public final a a;
    public final b b;
    public final a c;

    public void a$1(a p0,a p1,b p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void a(String p0,String p1,JSONObject p2){
       a.a(this.c, this.a, this.b, p0, p1, p2);
    }
}
