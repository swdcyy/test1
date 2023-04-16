package androidx.emoji.widget.EmojiExtractTextLayout;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import ag6.a;
import androidx.emoji.widget.ExtractButtonCompat;
import androidx.emoji.widget.EmojiExtractEditText;
import ll8.c$b;
import android.content.res.TypedArray;

public class EmojiExtractTextLayout extends LinearLayout	// class@00076a
{
    public ExtractButtonCompat b;
    public EmojiExtractEditText c;
    public ViewGroup d;
    public View$OnClickListener e;
    public boolean f;

    public void EmojiExtractTextLayout(Context p0){
       super(p0);
       this.a(p0, null, 0, 0);
    }
    public void EmojiExtractTextLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.a(p0, p1, 0, 0);
    }
    public void EmojiExtractTextLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.a(p0, p1, p2, 0);
    }
    public final void a(Context p0,AttributeSet p1,int p2,int p3){
       if (this.f == null) {
          this.f = true;
          this.setOrientation(0);
          View view = a.c(LayoutInflater.from(p0), R.layout.arg_RES_7f0d0631, this, true);
          this.d = view.findViewById(0x7f0a13fb);
          this.b = view.findViewById(0x7f0a13fc);
          this.c = view.findViewById(0x1020025);
          if (p1 != null) {
             TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.w0, p2, p3);
             this.c.setEmojiReplaceStrategy(typedArray.getInteger(0, 0));
             typedArray.recycle();
          }
       }
       return;
    }
    public int getEmojiReplaceStrategy(){
       return this.c.getEmojiReplaceStrategy();
    }
    public void setEmojiReplaceStrategy(int p0){
       this.c.setEmojiReplaceStrategy(p0);
    }
}
