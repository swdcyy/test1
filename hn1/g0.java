package hn1.g0;
import androidx.recyclerview.widget.h$b;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ln1.b;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Number;

public final class g0 extends h$b	// class@002731
{
    public final List a;
    public final List b;

    public void g0(List p0,List p1){
       a.p(p0, "oldList");
       a.p(p1, "newList");
       super();
       this.a = p0;
       this.b = p1;
    }
    public boolean a(int p0,int p1){
       return false;
    }
    public boolean b(int p0,int p1){
       String obj;
       g0 og0 = g0.class;
       if (PatchProxy.isSupport(og0)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, og0, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       BaseFeed baseFeed = this.a.get(p0).getBaseFeed();
       obj = null;
       String id = (baseFeed != null)? baseFeed.getId(): obj;
       BaseFeed baseFeed1 = this.b.get(p1).getBaseFeed();
       if (baseFeed1 != null) {
          obj = baseFeed1.getId();
       }
       return a.g(id, obj);
    }
    public int d(){
       Object obj = PatchProxy.apply(null, this, g0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.size();
    }
    public int e(){
       Object obj = PatchProxy.apply(null, this, g0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.size();
    }
}
