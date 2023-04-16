package ad8.b;
import android.widget.TextView$OnEditorActionListener;
import ad8.g;
import java.lang.Object;
import android.widget.TextView;
import android.view.KeyEvent;
import ma8.i;
import qc8.a;
import android.text.Editable;
import android.widget.EditText;
import java.lang.String;
import bd8.a;

public final class b implements TextView$OnEditorActionListener	// class@000079
{
    public final g a;

    public void b(g p0){
       this.a = p0;
    }
    public final boolean onEditorAction(TextView p0,int p1,KeyEvent p2){
       b ta = this.a;
       ta.z.f.c(p1, ta.e, ta.d, ta.s.getText().toString());
       ta.J();
       return false;
    }
}
