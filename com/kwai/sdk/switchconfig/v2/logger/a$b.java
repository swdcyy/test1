package com.kwai.sdk.switchconfig.v2.logger.a$b;
import java.lang.String;
import com.kwai.sdk.switchconfig.v2.SwitchConfig;
import java.lang.Object;

public class a$b	// class@00168a
{
    public String a;
    public String b;
    public String c;

    public void a$b(String p0,SwitchConfig p1){
       super();
       this.a = "";
       this.b = "";
       this.c = "";
       this.a = p0;
       this.b = p1.getVersion();
       this.c = p1.getVarTag();
    }
}
