package androidx.room.w$e;
import androidx.room.w$c;
import androidx.room.w;
import java.lang.String;
import java.lang.ref.WeakReference;
import java.lang.Object;
import java.util.Set;

public class w$e extends w$c	// class@000979
{
    public final w b;
    public final WeakReference c;

    public void w$e(w p0,w$c p1){
       super(p1.a);
       this.b = p0;
       this.c = new WeakReference(p1);
    }
    public void b(Set p0){
       w$c uoc = this.c.get();
       if (uoc == null) {
          this.b.k(this);
       }else {
          uoc.b(p0);
       }
       return;
    }
}
