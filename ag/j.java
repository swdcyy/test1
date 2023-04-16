package ag.j;
import android.widget.EditText;
import java.lang.Object;
import android.text.SpannableStringBuilder;
import android.text.Editable;
import java.lang.CharSequence;
import android.os.Build$VERSION;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class j	// class@0001f9
{
    public final SpannableStringBuilder a;
    public final float b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final CharSequence g;

    public void j(EditText p0){
       super();
       this.a = new SpannableStringBuilder(p0.getText());
       this.b = p0.getTextSize();
       this.e = p0.getInputType();
       this.g = p0.getHint();
       this.c = p0.getMinLines();
       this.d = p0.getMaxLines();
       this.f = (Build$VERSION.SDK_INT >= 23)? p0.getBreakStrategy(): 0;
       return;
    }
    public void a(EditText p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "1")) {
          return;
       }
       p0.setText(this.a);
       p0.setTextSize(0, this.b);
       p0.setMinLines(this.c);
       p0.setMaxLines(this.d);
       p0.setInputType(this.e);
       p0.setHint(this.g);
       if (Build$VERSION.SDK_INT >= 23) {
          p0.setBreakStrategy(this.f);
       }
       return;
    }
}
