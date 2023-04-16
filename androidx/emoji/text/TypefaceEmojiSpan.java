package androidx.emoji.text.TypefaceEmojiSpan;
import androidx.emoji.text.EmojiSpan;
import androidx.emoji.text.EmojiMetadata;
import android.graphics.Paint;
import android.text.TextPaint;
import androidx.emoji.text.EmojiCompat;
import android.graphics.Paint$Style;
import android.graphics.Canvas;
import java.lang.CharSequence;

public final class TypefaceEmojiSpan extends EmojiSpan	// class@000766
{
    public static Paint sDebugPaint;

    public void TypefaceEmojiSpan(EmojiMetadata p0){
       super(p0);
    }
    public static Paint getDebugPaint(){
       if (TypefaceEmojiSpan.sDebugPaint == null) {
          TextPaint textPaint = new TextPaint();
          TypefaceEmojiSpan.sDebugPaint = textPaint;
          textPaint.setColor(EmojiCompat.get().getEmojiSpanIndicatorColor());
          TypefaceEmojiSpan.sDebugPaint.setStyle(Paint$Style.FILL);
       }
       return TypefaceEmojiSpan.sDebugPaint;
    }
    public void draw(Canvas p0,CharSequence p1,int p2,int p3,float p4,int p5,int p6,int p7,Paint p8){
       if (EmojiCompat.get().isEmojiSpanIndicatorEnabled()) {
          p0.drawRect(p4, (float)p5, (p4 + (float)this.getWidth()), (float)p7, TypefaceEmojiSpan.getDebugPaint());
       }
       this.getMetadata().draw(p0, p4, (float)p6, p8);
       return;
    }
}
