package ekd.m1;
import android.view.View;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.widget.m;
import android.view.View$OnFocusChangeListener;
import android.view.View$OnLongClickListener;
import android.text.TextWatcher;
import android.widget.EditText;

public class m1	// class@000d60
{

    public static void a(View p0,View$OnClickListener p1,int p2){
       p0 = p0.findViewById(p2);
       if (p0 != null) {
          p0.setOnClickListener(p1);
       }
       return;
    }
    public static void b(View p0,m p1,int p2){
       p0 = p0.findViewById(p2);
       if (p0 != null) {
          p0.setOnClickListener(p1);
       }
       return;
    }
    public static void c(View p0,View$OnFocusChangeListener p1,int p2){
       p0 = p0.findViewById(p2);
       if (p0 != null) {
          p0.setOnFocusChangeListener(p1);
       }
       return;
    }
    public static void d(View p0,View$OnLongClickListener p1,int p2){
       p0 = p0.findViewById(p2);
       if (p0 != null) {
          p0.setOnLongClickListener(p1);
       }
       return;
    }
    public static void e(View p0,TextWatcher p1,int p2){
       EditText uEditText = p0.findViewById(p2);
       if (uEditText != null) {
          uEditText.addTextChangedListener(p1);
       }
       return;
    }
    public static View f(View p0,int p1){
       return p0.findViewById(p1);
    }
}
