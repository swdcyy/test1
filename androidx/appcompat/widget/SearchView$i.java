package androidx.appcompat.widget.SearchView$i;
import android.widget.AdapterView$OnItemClickListener;
import androidx.appcompat.widget.SearchView;
import java.lang.Object;
import android.widget.AdapterView;
import android.view.View;
import java.lang.String;

public class SearchView$i implements AdapterView$OnItemClickListener	// class@000621
{
    public final SearchView b;

    public void SearchView$i(SearchView p0){
       this.b = p0;
       super();
    }
    public void onItemClick(AdapterView p0,View p1,int p2,long p3){
       this.b.S(p2, 0, null);
    }
}
