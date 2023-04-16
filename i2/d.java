package i2.d;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.EditorInfo;
import androidx.emoji.text.EmojiCompat;
import android.text.Editable;

public final class d extends InputConnectionWrapper	// class@002168
{
    public final TextView a;

    public void d(TextView p0,InputConnection p1,EditorInfo p2){
       super(p1, false);
       this.a = p0;
       EmojiCompat.get().updateEditorInfoAttrs(p2);
    }
    public final Editable a(){
       return this.a.getEditableText();
    }
    public boolean deleteSurroundingText(int p0,int p1){
       boolean b = false;
       if (EmojiCompat.handleDeleteSurroundingText(this, this.a(), p0, p1, b) || super.deleteSurroundingText(p0, p1)) {
          b = true;
       }
       return b;
    }
    public boolean deleteSurroundingTextInCodePoints(int p0,int p1){
       boolean b = true;
       if (!EmojiCompat.handleDeleteSurroundingText(this, this.a(), p0, p1, b) && !super.deleteSurroundingTextInCodePoints(p0, p1)) {
          b = false;
       }
       return b;
    }
}
