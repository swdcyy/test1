package androidx.appcompat.widget.SearchView$j;
import android.widget.AdapterView$OnItemSelectedListener;
import androidx.appcompat.widget.SearchView;
import java.lang.Object;
import android.widget.AdapterView;
import android.view.View;

public class SearchView$j implements AdapterView$OnItemSelectedListener	// class@000622
{
    public final SearchView b;

    public void SearchView$j(SearchView p0){
       this.b = p0;
       super();
    }
    public void onItemSelected(AdapterView p0,View p1,int p2,long p3){
       this.b.T(p2);
    }
    public void onNothingSelected(AdapterView p0){
    }
}
