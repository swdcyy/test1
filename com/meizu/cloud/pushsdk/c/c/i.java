package com.meizu.cloud.pushsdk.c.c.i;
import com.meizu.cloud.pushsdk.c.c.i$a;
import java.lang.Object;
import com.meizu.cloud.pushsdk.c.c.f;
import java.lang.String;
import com.meizu.cloud.pushsdk.c.c.c$a;
import com.meizu.cloud.pushsdk.c.c.c;
import com.meizu.cloud.pushsdk.c.c.j;
import com.meizu.cloud.pushsdk.c.c.i$1;
import java.lang.StringBuilder;

public class i	// class@0014d9
{
    public final f a;
    public final String b;
    public final c c;
    public final j d;
    public final Object e;

    public void i(i$a p0){
       super();
       this.a = i$a.a(p0);
       this.b = i$a.b(p0);
       this.c = i$a.c(p0).a();
       this.d = i$a.d(p0);
       p0 = (i$a.e(p0) != null)? i$a.e(p0): this;
       this.e = p0;
       return;
    }
    public void i(i$a p0,i$1 p1){
       super(p0);
    }
    public f a(){
       return this.a;
    }
    public String a(String p0){
       return this.c.a(p0);
    }
    public String b(){
       return this.b;
    }
    public int c(){
       int i;
       if (("POST").equals(this.b())) {
          i = 1;
       }else if(("PUT").equals(this.b())){
          i = 2;
       }else if(("DELETE").equals(this.b())){
          i = 3;
       }else if(("HEAD").equals(this.b())){
          i = 4;
       }else if(("PATCH").equals(this.b())){
          i = 5;
       }else {
          i = 0;
       }
       return i;
    }
    public c d(){
       return this.c;
    }
    public j e(){
       return this.d;
    }
    public String toString(){
       StringBuilder str = "Request{method="+this.b+", url="+this.a+", tag=";
       i te = this.e;
       if (te != this) {
       }else {
          te = null;
       }
       return str+te+'}';
    }
}
