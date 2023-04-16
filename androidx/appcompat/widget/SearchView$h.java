package androidx.appcompat.widget.SearchView$h;
import android.widget.TextView$OnEditorActionListener;
import androidx.appcompat.widget.SearchView;
import java.lang.Object;
import android.widget.TextView;
import android.view.KeyEvent;

public class SearchView$h implements TextView$OnEditorActionListener	// class@000620
{
    public final SearchView a;

    public void SearchView$h(SearchView p0){
       this.a = p0;
       super();
    }
    public boolean onEditorAction(TextView p0,int p1,KeyEvent p2){
       this.a.W();
       return true;
    }
}
