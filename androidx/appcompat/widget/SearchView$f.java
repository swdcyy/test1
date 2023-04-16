package androidx.appcompat.widget.SearchView$f;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.SearchView;
import java.lang.Object;
import android.view.View;

public class SearchView$f implements View$OnClickListener	// class@00061e
{
    public final SearchView b;

    public void SearchView$f(SearchView p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       SearchView$f tb = this.b;
       if (p0 == tb.u) {
          tb.V();
       }else if(p0 == tb.w){
          tb.R();
       }else if(p0 == tb.v){
          tb.W();
       }else if(p0 == tb.x){
          tb.a0();
       }else if(p0 == tb.q){
          tb.H();
       }
       return;
    }
}
