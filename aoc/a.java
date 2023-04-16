package aoc.a;
import aoc.a$a;
import nsd.u;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.LinkedHashSet;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import java.util.Set;

public final class a	// class@000299
{
    public final Set a;
    public final View b;
    public static final a$a c;

    static {
       a.c = new a$a(null);
    }
    public void a(View p0){
       a.p(p0, "targetView");
       super();
       this.b = p0;
       this.a = new LinkedHashSet();
    }
    public final a a(String p0){
       a.p(p0, "callerFlag");
       Log.g("ViewPropertyController", "freeze by "+p0);
       this.a.add(p0);
       return this;
    }
    public final View b(){
       return this.b;
    }
    public final a c(float p0){
       if (this.a.isEmpty()) {
          this.b.setAlpha(p0);
       }
       return this;
    }
    public final void d(boolean p0){
       Log.g("ViewPropertyController", "setClickable "+p0+", "+this.b);
       this.b.setClickable(p0);
    }
    public final void e(int p0){
       this.b.setVisibility(p0);
    }
    public final a f(String p0){
       a.p(p0, "callerFlag");
       Log.g("ViewPropertyController", "unfreeze by "+p0);
       this.a.remove(p0);
       return this;
    }
}
