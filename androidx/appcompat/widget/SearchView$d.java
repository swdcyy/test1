package androidx.appcompat.widget.SearchView$d;
import android.view.View$OnFocusChangeListener;
import androidx.appcompat.widget.SearchView;
import java.lang.Object;
import android.view.View;

public class SearchView$d implements View$OnFocusChangeListener	// class@00061c
{
    public final SearchView b;

    public void SearchView$d(SearchView p0){
       this.b = p0;
       super();
    }
    public void onFocusChange(View p0,boolean p1){
       SearchView$d tb = this.b;
       SearchView n = tb.N;
       if (n != null) {
          n.onFocusChange(tb, p1);
       }
       return;
    }
}
