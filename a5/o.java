package a5.o;
import java.lang.Object;
import androidx.collection.ArraySet;
import java.util.HashMap;
import a5.o$a;

public class o	// class@0000f1
{
    public boolean a;
    public final Set b;
    public final Map c;
    public final Comparator d;

    public void o(){
       super();
       this.a = false;
       this.b = new ArraySet();
       this.c = new HashMap();
       this.d = new o$a(this);
    }
}
