package bh8.j;
import bh8.n;
import bh8.m;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import android.widget.EditText;
import android.text.Editable;
import java.lang.CharSequence;
import android.text.TextUtils;

public class j implements n	// class@000368
{
    public final m a;

    public void j(m p0){
       this.a = p0;
       super();
    }
    public void keyBoardHide(int p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oj, "2")) {
          return;
       }
       j ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(null, ta, m.class, "3")) {
          ta.a = false;
          ta.e.setCursorVisible(false);
          ta.e.clearFocus();
       }
       return;
    }
    public void keyBoardShow(int p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oj, "1")) {
          return;
       }
       j ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(null, ta, m.class, "2")) {
          ta.a = true;
          ta.e.setCursorVisible(true);
          Editable text = ta.e.getText();
          if (!TextUtils.isEmpty(text)) {
             ta.e.setSelection(text.length());
          }
          ta.e.requestFocus();
          ta.b(text);
       }
       return;
    }
}
