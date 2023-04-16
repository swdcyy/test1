package d0c.a;
import java.lang.String;
import java.util.List;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class a	// class@0020a6
{
    public String a;
    public String b;
    public String c;
    public List d;
    public String e;
    public String f;
    public List g;
    public String h;
    public int i;

    public void a(){
       super(null, null, null, null, null, null, null, null, 0, 511, null);
    }
    public void a(String p0,String p1,String p2,List p3,String p4,String p5,List p6,String p7,int p8,int p9,u p10){
       if (p9 & 0x01) {
          p0 = null;
       }
       if (p9 & 0x02) {
          p1 = null;
       }
       if (p9 & 0x04) {
          p2 = null;
       }
       if (p9 & 0x08) {
          p3 = null;
       }
       if (p9 & 0x10) {
          p4 = null;
       }
       if (p9 & 0x20) {
          p5 = null;
       }
       if (p9 & 0x40) {
          p6 = null;
       }
       if (p9 & 0x0100) {
          p8 = 0;
       }
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       this.h = null;
       this.i = p8;
       return;
    }
    public final List a(){
       return this.d;
    }
    public final String b(){
       return this.e;
    }
    public final String c(){
       return this.c;
    }
    public final String d(){
       return this.a;
    }
    public final String e(){
       return this.b;
    }
    public final int f(){
       return this.i;
    }
    public final String g(){
       return this.h;
    }
    public final List h(){
       return this.g;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "FontConfig\(fontId="+this.a+", fontName="+this.b+", fontFileName="+this.c+", fontCoverNormal="+this.d+", fontCoverSelected="+this.e+", statisticsName="+this.f+", resUrl="+this.g+", md5="+this.h+", lineSpace="+this.i+')';
    }
}
