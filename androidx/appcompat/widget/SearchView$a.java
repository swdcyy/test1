package androidx.appcompat.widget.SearchView$a;
import android.text.TextWatcher;
import androidx.appcompat.widget.SearchView;
import java.lang.Object;
import android.text.Editable;
import java.lang.CharSequence;

public class SearchView$a implements TextWatcher	// class@000619
{
    public final SearchView b;

    public void SearchView$a(SearchView p0){
       this.b = p0;
       super();
    }
    public void afterTextChanged(Editable p0){
    }
    public void beforeTextChanged(CharSequence p0,int p1,int p2,int p3){
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
       this.b.Y(p0);
    }
}
