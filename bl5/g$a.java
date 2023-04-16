package bl5.g$a;
import android.text.TextWatcher;
import bl5.g;
import java.lang.Object;
import android.text.Editable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.emotionsdk.panel.EmotionPanelConfig;
import android.widget.ImageView;
import java.lang.CharSequence;

public class g$a implements TextWatcher	// class@0004d2
{
    public final g b;

    public void g$a(g p0){
       this.b = p0;
       super();
    }
    public void afterTextChanged(Editable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$a.class, "1")) {
          return;
       }
       g q = this.b.q;
       if (q != null && q.isShowEmojiPageDel()) {
          q = this.b.u;
          boolean b = (p0.length())? true: false;
          q.setEnabled(b);
       }
       return;
    }
    public void beforeTextChanged(CharSequence p0,int p1,int p2,int p3){
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
    }
}
