package ezb.f;
import java.lang.Comparable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kotlin.jvm.internal.a;
import ezb.l;
import android.view.View;
import com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomePostBubblePresenterV2$a;

public abstract class f implements Comparable	// class@00250b
{
    public final int b;

    public void f(int p0){
       super();
       this.b = p0;
    }
    public final int a(f p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       a.p(p0, "other");
       return (this.b - p0.b);
    }
    public l b(){
       return null;
    }
    public abstract View c();
    public int compareTo(Object p0){
       return this.a(p0);
    }
    public abstract String d();
    public boolean e(View p0){
       return (this instanceof HomePostBubblePresenterV2$a ^ 0x01);
    }
    public void f(){
    }
    public void g(){
    }
    public final int getPriority(){
       return this.b;
    }
    public void h(View p0){
    }
    public void i(){
    }
}
