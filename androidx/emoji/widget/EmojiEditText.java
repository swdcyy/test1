package androidx.emoji.widget.EmojiEditText;
import android.widget.EditText;
import android.content.Context;
import android.util.AttributeSet;
import i2.a;
import android.view.View;
import android.text.method.KeyListener;
import android.widget.TextView;
import i2.b;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.ActionMode$Callback;
import androidx.core.widget.b;

public class EmojiEditText extends EditText	// class@000768
{
    public b b;
    public boolean c;

    public void EmojiEditText(Context p0){
       super(p0);
       this.a(null, 0, 0);
    }
    public void EmojiEditText(Context p0,AttributeSet p1){
       super(p0, p1);
       this.a(p1, 0x101006e, 0);
    }
    public void EmojiEditText(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.a(p1, p2, 0);
    }
    public final void a(AttributeSet p0,int p1,int p2){
       if (this.c == null) {
          this.c = true;
          this.setMaxEmojiCount(new a(this, p0, p1, p2).a());
          this.setKeyListener(super.getKeyListener());
       }
       return;
    }
    public final b getEmojiEditTextHelper(){
       if (this.b == null) {
          this.b = new b(this);
       }
       return this.b;
    }
    public int getMaxEmojiCount(){
       return this.getEmojiEditTextHelper().c();
    }
    public InputConnection onCreateInputConnection(EditorInfo p0){
       return this.getEmojiEditTextHelper().d(super.onCreateInputConnection(p0), p0);
    }
    public void setCustomSelectionActionModeCallback(ActionMode$Callback p0){
       super.setCustomSelectionActionModeCallback(b.t(this, p0));
    }
    public void setKeyListener(KeyListener p0){
       if (p0 != null) {
          p0 = this.getEmojiEditTextHelper().b(p0);
       }
       super.setKeyListener(p0);
       return;
    }
    public void setMaxEmojiCount(int p0){
       this.getEmojiEditTextHelper().f(p0);
    }
}
