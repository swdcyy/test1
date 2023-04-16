package androidx.appcompat.widget.SearchView$c;
import java.lang.Runnable;
import androidx.appcompat.widget.SearchView;
import java.lang.Object;
import androidx.appcompat.widget.g;
import android.database.Cursor;
import f2.a;

public class SearchView$c implements Runnable	// class@00061b
{
    public final SearchView b;

    public void SearchView$c(SearchView p0){
       this.b = p0;
       super();
    }
    public void run(){
       SearchView s = this.b.S;
       if (s instanceof g) {
          s.b(null);
       }
       return;
    }
}
