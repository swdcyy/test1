package i2.e$a;
import androidx.emoji.text.EmojiCompat$InitCallback;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.lang.Object;
import java.lang.ref.Reference;
import androidx.emoji.text.EmojiCompat;
import java.lang.CharSequence;
import android.text.Selection;
import android.text.Spannable;
import i2.e;

public class e$a extends EmojiCompat$InitCallback	// class@002169
{
    public final Reference a;

    public void e$a(TextView p0){
       super();
       this.a = new WeakReference(p0);
    }
    public void onInitialized(){
       super.onInitialized();
       TextView textView = this.a.get();
       if (textView != null && textView.isAttachedToWindow()) {
          CharSequence uCharSequenc = EmojiCompat.get().process(textView.getText());
          int selectionSta = Selection.getSelectionStart(uCharSequenc);
          int selectionEnd = Selection.getSelectionEnd(uCharSequenc);
          textView.setText(uCharSequenc);
          if (uCharSequenc instanceof Spannable) {
             e.b(uCharSequenc, selectionSta, selectionEnd);
          }
       }
       return;
    }
}
