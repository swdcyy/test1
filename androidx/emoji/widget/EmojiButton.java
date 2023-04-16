package androidx.emoji.widget.EmojiButton;
import android.widget.Button;
import android.content.Context;
import android.util.AttributeSet;
import i2.g;
import android.widget.TextView;
import android.view.ActionMode$Callback;
import androidx.core.widget.b;
import android.text.InputFilter;

public class EmojiButton extends Button	// class@000767
{
    public g b;
    public boolean c;

    public void EmojiButton(Context p0){
       super(p0);
       this.a();
    }
    public void EmojiButton(Context p0,AttributeSet p1){
       super(p0, p1);
       this.a();
    }
    public void EmojiButton(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.a();
    }
    public final void a(){
       if (this.c == null) {
          this.c = true;
          this.getEmojiTextViewHelper().c();
       }
       return;
    }
    public final g getEmojiTextViewHelper(){
       if (this.b == null) {
          this.b = new g(this);
       }
       return this.b;
    }
    public void setAllCaps(boolean p0){
       super.setAllCaps(p0);
       this.getEmojiTextViewHelper().b(p0);
    }
    public void setCustomSelectionActionModeCallback(ActionMode$Callback p0){
       super.setCustomSelectionActionModeCallback(b.t(this, p0));
    }
    public void setFilters(InputFilter[] p0){
       super.setFilters(this.getEmojiTextViewHelper().a(p0));
    }
}
