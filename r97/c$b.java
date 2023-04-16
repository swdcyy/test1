package r97.c$b;
import r97.o$a;
import r97.o;
import java.lang.String;
import java.lang.Boolean;
import java.lang.Float;
import com.google.gson.JsonObject;
import java.lang.StringBuilder;
import r97.c;
import r97.c$a;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.util.Objects;

public final class c$b extends o$a	// class@00233b
{
    public String a;
    public String b;
    public Boolean c;
    public Boolean d;
    public Float e;
    public String f;
    public String g;
    public JsonObject h;

    public void c$b(){
       super();
    }
    public void c$b(o p0){
       super();
       this.a = p0.sdkName();
       this.b = p0.subBiz();
       this.c = Boolean.valueOf(p0.needEncrypt());
       this.d = Boolean.valueOf(p0.realtime());
       this.e = Float.valueOf(p0.sampleRatio());
       this.f = p0.h5ExtraAttr();
       this.g = p0.container();
       this.h = p0.feedLogCtx();
    }
    public o a(){
       String str = (this.a == null)? " sdkName": "";
       if (this.c == null) {
          str = str+" needEncrypt";
       }
       if (this.d == null) {
          str = str+" realtime";
       }
       if (this.e == null) {
          str = str+" sampleRatio";
       }
       if (this.g == null) {
          str = str+" container";
       }
       if (str.isEmpty()) {
          c uoc = new c(this.a, this.b, this.c.booleanValue(), this.d.booleanValue(), this.e.floatValue(), this.f, this.g, this.h, null);
          return str;
       }else {
          throw new IllegalStateException("Missing required properties:"+str);
       }
    }
    public o$a c(String p0){
       Objects.requireNonNull(p0, "Null container");
       this.g = p0;
       return this;
    }
    public o$a d(JsonObject p0){
       this.h = p0;
       return this;
    }
    public o$a e(String p0){
       this.f = p0;
       return this;
    }
    public o$a f(boolean p0){
       this.c = Boolean.valueOf(p0);
       return this;
    }
    public o$a g(boolean p0){
       this.d = Boolean.valueOf(p0);
       return this;
    }
    public o$a h(float p0){
       this.e = Float.valueOf(p0);
       return this;
    }
    public o$a i(String p0){
       Objects.requireNonNull(p0, "Null sdkName");
       this.a = p0;
       return this;
    }
    public o$a j(String p0){
       this.b = p0;
       return this;
    }
}
