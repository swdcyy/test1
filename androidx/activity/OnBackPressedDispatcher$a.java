package androidx.activity.OnBackPressedDispatcher$a;
import o0.a;
import androidx.activity.OnBackPressedDispatcher;
import o0.b;
import java.lang.Object;
import java.util.ArrayDeque;

public class OnBackPressedDispatcher$a implements a	// class@000551
{
    public final b b;
    public final OnBackPressedDispatcher c;

    public void OnBackPressedDispatcher$a(OnBackPressedDispatcher p0,b p1){
       this.c = p0;
       super();
       this.b = p1;
    }
    public void cancel(){
       this.c.b.remove(this.b);
       this.b.e(this);
    }
}
