package fx8.a0;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.model.topic.HotRecommendResponse;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class a0	// class@002371
{
    public Map a;
    public boolean b;
    public HotRecommendResponse c;
    public final String d;
    public final String e;
    public final String f;
    public final int g;
    public final int h;

    public void a0(String p0,String p1,String p2,int p3,int p4){
       a.p(p0, "taskId");
       a.p(p1, "editSession");
       a.p(p2, "sharePageFrom");
       super();
       this.d = p0;
       this.e = p1;
       this.f = p2;
       this.g = p3;
       this.h = p4;
    }
    public final String a(){
       return this.e;
    }
    public final HotRecommendResponse b(){
       return this.c;
    }
    public final int c(){
       return this.h;
    }
    public final int d(){
       return this.g;
    }
    public final void e(Map p0){
       this.a = p0;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a0.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof a0 && (a.g(this.d, p0.d) && (a.g(this.e, p0.e) && (a.g(this.f, p0.f) && (this.g == p0.g && this.h == p0.h)))))) {
          return true;
       }
       return false;
    }
    public final void f(HotRecommendResponse p0){
       this.c = p0;
    }
    public int hashCode(){
       a0 obj = PatchProxy.apply(null, this, a0.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.d;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       a0 te = this.e;
       int i2 = (te != null)? te.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       te = this.f;
       if (te != null) {
          i = te.hashCode();
       }
       return (((((i1 + i) * 31) + this.g) * 31) + this.h);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "TopicGuideListParams\(taskId="+this.d+", editSession="+this.e+", sharePageFrom="+this.f+", recommendIndex="+this.g+", maxNum="+this.h+"\)";
    }
}
