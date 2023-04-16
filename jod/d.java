package jod.d;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class d	// class@001723
{
    public final int a;
    public final int b;
    public final String c;
    public final double d;
    public final String e;
    public final float f;
    public final String g;
    public final String h;

    public void d(int p0,int p1,String p2,double p3,String p4,float p5,String p6,String p7){
       a.p(p2, "text");
       a.p(p4, "filePath");
       a.p(p6, "identifier");
       a.p(p7, "speakerName");
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
    public final String a(){
       return this.e;
    }
    public final String b(){
       return this.g;
    }
    public final int c(){
       return this.b;
    }
    public final int d(){
       return this.a;
    }
    public final String e(){
       return this.h;
    }
    public final double f(){
       return this.d;
    }
    public final String g(){
       return this.c;
    }
    public final float h(){
       return this.f;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "speakerId = "+this.a+" languageType = "+this.b+" text = "+this.c+' '+"start = "+this.d+" filePath = "+this.e+" volume = "+this.f+" identifier = "+this.g+' '+"speakerName = "+this.h;
    }
}
