package com.kwai.chat.kwailink.data.ClientAppInfo$b;
import java.lang.Object;
import java.util.HashMap;
import com.kwai.chat.kwailink.data.ClientAppInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;

public class ClientAppInfo$b	// class@000a43
{
    public int a;
    public int b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public int l;
    public Map m;

    public void ClientAppInfo$b(){
       super();
       this.a = 0;
       this.b = 0;
       this.c = "N/A";
       this.d = "N/A";
       this.e = "N/A";
       this.f = "N/A";
       this.g = "N/A";
       this.h = "N/A";
       this.i = "N/A";
       this.j = "N/A";
       this.k = "N/A";
       this.l = 0;
       this.m = new HashMap();
    }
    public ClientAppInfo a(){
       Object obj = PatchProxy.apply(null, this, ClientAppInfo$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ClientAppInfo(this);
    }
    public ClientAppInfo$b b(String p0){
       this.c = p0;
       return this;
    }
    public ClientAppInfo$b c(String p0){
       this.f = p0;
       return this;
    }
    public ClientAppInfo$b d(String p0){
       this.e = p0;
       return this;
    }
    public ClientAppInfo$b e(String p0){
       this.d = p0;
       return this;
    }
    public ClientAppInfo$b f(String p0){
       this.g = p0;
       return this;
    }
    public ClientAppInfo$b g(int p0){
       this.l = p0;
       return this;
    }
    public ClientAppInfo$b h(Map p0){
       this.m = p0;
       return this;
    }
    public ClientAppInfo$b i(String p0){
       this.i = p0;
       return this;
    }
    public ClientAppInfo$b j(String p0){
       this.j = p0;
       return this;
    }
    public ClientAppInfo$b k(String p0){
       this.h = p0;
       return this;
    }
}
