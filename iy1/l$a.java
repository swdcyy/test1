package iy1.l$a;
import iy1.l;
import java.lang.Object;
import jy1.b;
import iy1.k;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.lang.Boolean;

public class l$a implements l	// class@0029c9
{
    public final int k;

    public void l$a(int p0){
       super();
       this.k = p0;
    }
    public b a(){
       return k.a(this);
    }
    public String b(){
       Object obj = PatchProxy.apply(null, this, l$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "temporaryEnhance_liteTextNotice_"+this.k;
    }
    public boolean equals(Object p0){
       l$a uoa = l$a.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, uoa, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null || uoa != p0.getClass()) {
          return false;
       }
       if (this.k != p0.k) {
          b = false;
       }
       return b;
    }
    public int getPriority(){
       return k.b(this);
    }
    public int hashCode(){
       return this.k;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, l$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiteTextNoticeMessageType{mLiteTextNoticeBizType="+this.k+'}';
    }
}
