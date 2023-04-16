package androidx.appcompat.widget.SearchView$g;
import android.view.View$OnKeyListener;
import androidx.appcompat.widget.SearchView;
import java.lang.Object;
import android.view.View;
import android.view.KeyEvent;
import android.widget.AutoCompleteTextView;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import android.text.Editable;
import java.lang.String;

public class SearchView$g implements View$OnKeyListener	// class@00061f
{
    public final SearchView b;

    public void SearchView$g(SearchView p0){
       this.b = p0;
       super();
    }
    public boolean onKey(View p0,int p1,KeyEvent p2){
       SearchView$g tb = this.b;
       if (tb.a1 == null) {
          return false;
       }
       if (tb.q.isPopupShowing() && this.b.q.getListSelection() != -1) {
          return this.b.X(p0, p1, p2);
       }
       if (this.b.q.b() || (!p2.hasNoModifiers() || (p2.getAction() != 1 || p1 != 66))) {
          return false;
       }
       p0.cancelLongPress();
       SearchView$g tb1 = this.b;
       tb1.P(false, null, tb1.q.getText().toString());
       return true;
    }
}
