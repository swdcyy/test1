package er.b;
import er.h;
import com.kuaishou.android.vader.Channel;
import er.i;
import er.j;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Enum;
import java.lang.Number;
import java.lang.StringBuilder;

public final class b extends h	// class@001589
{
    public final Channel a;
    public final i b;
    public final j c;

    public void b(Channel p0,i p1,j p2){
       super();
       Objects.requireNonNull(p0, "Null channel");
       this.a = p0;
       Objects.requireNonNull(p1, "Null logChannelConfig");
       this.b = p1;
       Objects.requireNonNull(p2, "Null logUploader");
       this.c = p2;
    }
    public Channel a(){
       return this.a;
    }
    public i c(){
       return this.b;
    }
    public j d(){
       return this.c;
    }
    public boolean equals(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof h) {
          return false;
       }
       if (!this.a.equals(p0.a()) || (!this.b.equals(p0.c()) || !this.c.equals(p0.d()))) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (((((this.a.hashCode() ^ 0xf4243) * 0xf4243) ^ this.b.hashCode()) * 0xf4243) ^ this.c.hashCode());
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ChannelNodeItem{channel="+this.a+", logChannelConfig="+this.b+", logUploader="+this.c+"}";
    }
}
