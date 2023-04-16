package jod.g;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class g	// class@001726
{
    public int a;
    public int b;
    public String c;
    public String d;
    public double e;
    public double f;
    public String g;
    public float h;

    public void g(int p0,int p1,String p2,String p3,double p4,float p5){
       super();
       this.f = 0;
       this.g = null;
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.h = p5;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, g.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "speakerId = "+this.a+" languageType = "+this.b+" text = "+this.c+" identifier = "+this.d+" start = "+this.e+" duration = "+this.f+" filePath = "+this.g+" volume = "+this.h;
    }
}
