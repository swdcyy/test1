package i2.h;
import android.text.TextWatcher;
import android.widget.EditText;
import java.lang.Object;
import androidx.emoji.text.EmojiCompat$InitCallback;
import i2.h$a;
import android.text.Editable;
import java.lang.CharSequence;
import android.text.Spannable;
import androidx.emoji.text.EmojiCompat;

public final class h implements TextWatcher	// class@002170
{
    public final EditText b;
    public EmojiCompat$InitCallback c;
    public int d;
    public int e;

    public void h(EditText p0){
       super();
       this.d = Integer.MAX_VALUE;
       this.e = 0;
       this.b = p0;
    }
    public final EmojiCompat$InitCallback a(){
       if (this.c == null) {
          this.c = new h$a(this.b);
       }
       return this.c;
    }
    public void afterTextChanged(Editable p0){
    }
    public void b(int p0){
       this.e = p0;
    }
    public void beforeTextChanged(CharSequence p0,int p1,int p2,int p3){
    }
    public void c(int p0){
       this.d = p0;
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
       if (this.b.isInEditMode()) {
          return;
       }
       if (p2 <= p3 && p0 instanceof Spannable) {
          p2 = EmojiCompat.get().getLoadState();
          if (p2) {
             if (p2 != 1) {
                if (p2 == 3) {
                }
             }else {
                EmojiCompat.get().process(p0, p1, (p1 + p3), this.d, this.e);
             }
          }else {
          }
       }
    label_003d :
       return;
    }
}
