package com.tencent.open.a.b;
import okhttp3.Response;
import java.lang.Object;
import okhttp3.ResponseBody;
import java.lang.String;

public class b	// class@000f3d
{
    public Response a;
    public String b;
    public int c;
    public int d;
    public int e;

    public void b(Response p0,int p1){
       super();
       this.b = null;
       this.a = p0;
       this.d = p1;
       this.c = p0.code();
       ResponseBody responseBody = this.a.body();
       this.e = (responseBody != null)? (int)responseBody.contentLength(): 0;
       return;
    }
    public String a(){
       if (this.b == null) {
          ResponseBody responseBody = this.a.body();
          if (responseBody != null) {
             this.b = responseBody.string();
          }
          if (this.b == null) {
             this.b = "";
          }
       }
       return this.b;
    }
    public int b(){
       return this.e;
    }
    public int c(){
       return this.d;
    }
    public int d(){
       return this.c;
    }
}
