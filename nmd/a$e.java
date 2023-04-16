package nmd.a$e;
import java.lang.Runnable;
import com.yxcorp.gifshow.v3.editor.sticker.vote.VoteTextView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.text.Editable;
import android.widget.EditText;
import java.lang.CharSequence;

public final class a$e implements Runnable	// class@001e49
{
    public final VoteTextView b;

    public void a$e(VoteTextView p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, a$e.class, "1")) {
          return;
       }
       a$e tb = this.b;
       tb.setText(tb.getText());
       this.b.setEndEllipseAvailability(true);
       return;
    }
}
