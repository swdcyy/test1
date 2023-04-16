package androidx.emoji.text.EmojiProcessor$GlyphChecker;
import java.lang.ThreadLocal;
import java.lang.Object;
import android.text.TextPaint;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import java.lang.String;
import android.graphics.Paint;
import p1.c;

public class EmojiProcessor$GlyphChecker	// class@000753
{
    public final TextPaint mTextPaint;
    public static final ThreadLocal sStringBuilder;

    static {
       EmojiProcessor$GlyphChecker.sStringBuilder = new ThreadLocal();
    }
    public void EmojiProcessor$GlyphChecker(){
       super();
       TextPaint textPaint = new TextPaint();
       this.mTextPaint = textPaint;
       textPaint.setTextSize(10.00f);
    }
    public static StringBuilder getStringBuilder(){
       ThreadLocal sStringBuild = EmojiProcessor$GlyphChecker.sStringBuilder;
       if (sStringBuild.get() == null) {
          sStringBuild.set("");
       }
       return sStringBuild.get();
    }
    public boolean hasGlyph(CharSequence p0,int p1,int p2){
       StringBuilder str = EmojiProcessor$GlyphChecker.getStringBuilder();
       str.setLength(0);
       for (; p1 < p2; p1++) {
          str = str+p0.charAt(p1);
       }
       return c.a(this.mTextPaint, str);
    }
}
