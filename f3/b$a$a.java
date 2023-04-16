package f3.b$a$a;
import android.graphics.drawable.Animatable2$AnimationCallback;
import f3.b$a;
import android.graphics.drawable.Drawable;
import java.lang.Object;
import java.util.Objects;

public class b$a$a extends Animatable2$AnimationCallback	// class@001fb8
{
    public final b$a a;

    public void b$a$a(b$a p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Drawable p0){
       Objects.requireNonNull(this.a);
    }
    public void onAnimationStart(Drawable p0){
       Objects.requireNonNull(this.a);
    }
}
