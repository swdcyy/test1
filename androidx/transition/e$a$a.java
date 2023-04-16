package androidx.transition.e$a$a;
import androidx.transition.d;
import androidx.transition.e$a;
import androidx.collection.ArrayMap;
import androidx.transition.Transition;
import java.lang.Object;
import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;
import androidx.transition.Transition$f;

public class e$a$a extends d	// class@0009f4
{
    public final ArrayMap a;
    public final e$a b;

    public void e$a$a(e$a p0,ArrayMap p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void b(Transition p0){
       this.a.get(this.b.c).remove(p0);
       p0.T(this);
    }
}
