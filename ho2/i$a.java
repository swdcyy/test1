package ho2.i$a;
import android.view.View;
import android.graphics.drawable.Animatable;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class i$a	// class@002de5
{
    public final View a;
    public final Animatable b;

    public void i$a(View p0,Animatable p1){
       a.p(p0, "view");
       a.p(p1, "animatable");
       super();
       this.a = p0;
       this.b = p1;
    }
    public final Animatable a(){
       return this.b;
    }
}
