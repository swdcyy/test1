package rp7.a;
import java.lang.Object;
import com.kwai.slide.play.detail.biz.ElementCategoryLayoutInfo;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public abstract class a	// class@0035b0
{

    public void a(){
       super();
    }
    public ElementCategoryLayoutInfo a(){
       return ElementCategoryLayoutInfo.ILLEGAL;
    }
    public List b(){
       return null;
    }
    public final int c(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.d() * 0x186a0;
       if (this.f() >= 0) {
          i = i + this.f();
       }
       return i;
    }
    public abstract int d();
    public int e(){
       return -1;
    }
    public int f(){
       return -1;
    }
}
