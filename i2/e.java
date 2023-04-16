package i2.e;
import android.text.InputFilter;
import android.widget.TextView;
import java.lang.Object;
import android.text.Spannable;
import android.text.Selection;
import androidx.emoji.text.EmojiCompat$InitCallback;
import i2.e$a;
import java.lang.CharSequence;
import android.text.Spanned;
import androidx.emoji.text.EmojiCompat;

public final class e implements InputFilter	// class@00216a
{
    public final TextView a;
    public EmojiCompat$InitCallback b;

    public void e(TextView p0){
       super();
       this.a = p0;
    }
    public static void b(Spannable p0,int p1,int p2){
       if (p1 >= 0 && p2 >= 0) {
          Selection.setSelection(p0, p1, p2);
       }else if(p1 >= 0){
          Selection.setSelection(p0, p1);
       }else if(p2 >= 0){
          Selection.setSelection(p0, p2);
       }
       return;
    }
    public final EmojiCompat$InitCallback a(){
       if (this.b == null) {
          this.b = new e$a(this.a);
       }
       return this.b;
    }
    public CharSequence filter(CharSequence p0,int p1,int p2,Spanned p3,int p4,int p5){
       if (this.a.isInEditMode()) {
          return p0;
       }
       int loadState = EmojiCompat.get().getLoadState();
       if (loadState) {
          int i = 1;
          if (loadState != i) {
             if (loadState != 3) {
                return p0;
             }
          }else if(!p5 && (!p4 && (!p3.length() && p0 == this.a.getText()))){
             i = 0;
          }
       label_002e :
          if (i && p0 != null) {
             if (p1 || p2 != p0.length()) {
                p0 = p0.subSequence(p1, p2);
             }
             p0 = EmojiCompat.get().process(p0, 0, p0.length());
          }
          return p0;
       }
       EmojiCompat.get().registerInitCallback(this.a());
       return p0;
    }
}
