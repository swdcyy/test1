package com.kwai.sdk.switchconfig.v2.logger.a$a;
import java.lang.String;
import com.kwai.sdk.switchconfig.v2.SwitchConfig;
import java.lang.Object;
import com.google.gson.JsonObject;

public class a$a	// class@001689
{
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;

    public void a$a(String p0,SwitchConfig p1,SwitchConfig p2){
       super();
       this.a = "";
       this.b = "";
       this.c = "";
       this.d = "";
       this.e = "";
       this.a = p0;
       this.b = p1.getVersion();
       this.d = p1.getVarTag();
       if (p2 != null) {
          this.c = p2.getVersion();
          this.e = p2.getVarTag();
       }
       return;
    }
    public JsonObject a(){
       JsonObject jsonObject = new JsonObject();
       jsonObject.c0("name", this.a);
       jsonObject.c0("version", this.b);
       jsonObject.c0("oldVersion", this.c);
       jsonObject.c0("vartag", this.d);
       jsonObject.c0("oldVartag", this.e);
       return jsonObject;
    }
}
