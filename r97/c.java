package r97.c;
import r97.o;
import java.lang.String;
import com.google.gson.JsonObject;
import r97.c$a;
import java.lang.Object;
import java.lang.Float;
import r97.o$a;
import r97.c$b;
import java.lang.StringBuilder;

public final class c extends o	// class@00233d
{
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final float e;
    public final String f;
    public final String g;
    public final JsonObject h;

    public void c(String p0,String p1,boolean p2,boolean p3,float p4,String p5,String p6,JsonObject p7,c$a p8){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       this.h = p7;
    }
    public String container(){
       return this.g;
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof o) {
          return false;
       }
       if ((this.a).equals(p0.sdkName())) {
          c tb = this.b;
          if (tb == null) {
             if (p0.subBiz() != null) {
             label_0083 :
                b = false;
             label_0084 :
                return b;
             }
          }else if(tb.equals(p0.subBiz())){
          }
          if (this.c == p0.needEncrypt() && (this.d == p0.realtime() && Float.floatToIntBits(this.e) == Float.floatToIntBits(p0.sampleRatio()))) {
             tb = this.f;
             if (tb == null) {
                if (p0.h5ExtraAttr() != null) {
                }
             }else if(tb.equals(p0.h5ExtraAttr())){
             }
             if ((this.g).equals(p0.container())) {
                tb = this.h;
                if (tb == null) {
                   if (p0.feedLogCtx() == null) {
                      goto label_0084 ;
                   }else {
                      goto label_0083 ;
                   }
                }else if(tb.equals(p0.feedLogCtx())){
                   goto label_0084 ;
                }else {
                   goto label_0083 ;
                }
             }else {
                goto label_0083 ;
             }
          }else {
             goto label_0083 ;
          }
       }else {
          goto label_0083 ;
       }
    }
    public JsonObject feedLogCtx(){
       return this.h;
    }
    public String h5ExtraAttr(){
       return this.f;
    }
    public int hashCode(){
       int i = 0xf4243;
       int i1 = ((this.a).hashCode() ^ i) * i;
       c tb = this.b;
       int i2 = 0;
       int i3 = (tb == null)? 0: tb.hashCode();
       i1 = (i1 ^ i3) * i;
       int i4 = 1231;
       i3 = (this.c != null)? 1231: 1237;
       i1 = (i1 ^ i3) * i;
       if (this.d == null) {
          i4 = 1237;
       }
       i1 = (((i1 ^ i4) * i) ^ Float.floatToIntBits(this.e)) * i;
       tb = this.f;
       i3 = (tb == null)? 0: tb.hashCode();
       i1 = (((i1 ^ i3) * i) ^ (this.g).hashCode()) * i;
       c th = this.h;
       if (th != null) {
          i2 = th.hashCode();
       }
       return (i1 ^ i2);
    }
    public boolean needEncrypt(){
       return this.c;
    }
    public boolean realtime(){
       return this.d;
    }
    public float sampleRatio(){
       return this.e;
    }
    public String sdkName(){
       return this.a;
    }
    public String subBiz(){
       return this.b;
    }
    public o$a toBuilder(){
       return new c$b(this);
    }
    public String toString(){
       return "CommonParams{sdkName="+this.a+", subBiz="+this.b+", needEncrypt="+this.c+", realtime="+this.d+", sampleRatio="+this.e+", h5ExtraAttr="+this.f+", container="+this.g+", feedLogCtx="+this.h+"}";
    }
}
