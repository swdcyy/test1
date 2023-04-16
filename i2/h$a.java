package i2.h$a;
import androidx.emoji.text.EmojiCompat$InitCallback;
import android.widget.EditText;
import java.lang.ref.WeakReference;
import java.lang.Object;
import java.lang.ref.Reference;
import android.text.Editable;
import java.lang.CharSequence;
import android.text.Selection;
import androidx.emoji.text.EmojiCompat;
import android.text.Spannable;
import i2.e;

public class h$a extends EmojiCompat$InitCallback	// class@00216f
{
    public final Reference a;

    public void h$a(EditText p0){
       super();
       this.a = new WeakReference(p0);
    }
    public void onInitialized(){
       super.onInitialized();
       EditText uEditText = this.a.get();
       if (uEditText != null && uEditText.isAttachedToWindow()) {
          Editable editableText = uEditText.getEditableText();
          EmojiCompat.get().process(editableText);
          e.b(editableText, Selection.getSelectionStart(editableText), Selection.getSelectionEnd(editableText));
       }
       return;
    }
}
