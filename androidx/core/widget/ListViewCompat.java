package androidx.core.widget.ListViewCompat;
import java.lang.Object;
import android.widget.ListView;

public final class ListViewCompat	// class@000729
{

    public void ListViewCompat(){
       super();
    }
    public static boolean a(ListView p0,int p1){
       return p0.canScrollList(p1);
    }
    public static void b(ListView p0,int p1){
       p0.scrollListBy(p1);
    }
}
