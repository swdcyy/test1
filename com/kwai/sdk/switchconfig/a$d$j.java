package com.kwai.sdk.switchconfig.a$d$j;
import lo7.a;
import com.kwai.sdk.switchconfig.a$d;
import io7.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.sdk.switchconfig.v1.SwitchConfig;
import io7.f;

public class a$d$j implements a	// class@000f0b
{
    public final a a;
    public final a$d b;

    public void a$d$j(a$d p0,a p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(String p0,SwitchConfig p1){
       f uof = new f();
       uof.a = p1;
       uof.e(p0);
       this.a.a(p0, uof);
    }
}
