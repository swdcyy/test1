package cb8.e;
import java.util.concurrent.Callable;
import cb8.f;
import java.lang.Object;
import na8.a;
import ma8.g;
import ma8.i;
import android.view.ViewGroup;
import android.view.View;
import android.widget.EditText;
import java.lang.Class;
import ic8.f;
import cb8.f$a;

public final class e implements Callable	// class@0003dd
{
    public final f b;

    public void e(f p0){
       this.b = p0;
    }
    public final Object call(){
       EditText uEditText = f.b(this.b.b.h().getContainer().findFocus(), EditText.class);
       f$a uoa = (uEditText != null)? new f$a(uEditText.getSelectionStart(), uEditText.getSelectionEnd()): null;
       return uoa;
    }
}
