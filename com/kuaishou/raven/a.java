package com.kuaishou.raven.a;
import com.kuaishou.raven.b;
import java.lang.String;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import java.lang.Object;
import com.kuaishou.raven.b$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import okhttp3.Request$Builder;
import okhttp3.RequestBody;
import okhttp3.Request;
import okhttp3.Call;
import com.kuaishou.raven.a$a;
import okhttp3.Callback;

public class a implements b	// class@000e95
{
    public OkHttpClient a;
    public String b;
    public static final MediaType c;

    static {
       a.c = MediaType.parse("application/json");
    }
    public void a(OkHttpClient p0,String p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void a(String p0,byte[] p1,b$a p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "1")) {
          return;
       }
       if (p0 != null && p0.length()) {
          String str = "/";
          if (!p0.startsWith(str)) {
             p0 = str+p0;
          }
          Request$Builder uBuilder = new Request$Builder().url(this.b+p0);
          if (p1 != null && p1.length > 0) {
             uBuilder.post(RequestBody.create(a.c, p1));
          }
          this.a.newCall(uBuilder.build()).enqueue(new a$a(this, p2));
       }
       return;
    }
}
