package androidx.emoji.text.EmojiSpan;
import android.text.style.ReplacementSpan;
import androidx.emoji.text.EmojiMetadata;
import android.graphics.Paint$FontMetricsInt;
import java.lang.Object;
import z1.h;
import android.graphics.Paint;
import java.lang.CharSequence;
import java.lang.Math;

public abstract class EmojiSpan extends ReplacementSpan	// class@000756
{
    public short mHeight;
    public final EmojiMetadata mMetadata;
    public float mRatio;
    public final Paint$FontMetricsInt mTmpFontMetrics;
    public short mWidth;

    public void EmojiSpan(EmojiMetadata p0){
       super();
       this.mTmpFontMetrics = new Paint$FontMetricsInt();
       this.mWidth = -1;
       this.mHeight = -1;
       this.mRatio = 0x3f800000;
       h.h(p0, "metadata cannot be null");
       this.mMetadata = p0;
    }
    public final int getHeight(){
       return this.mHeight;
    }
    public final int getId(){
       return this.getMetadata().getId();
    }
    public final EmojiMetadata getMetadata(){
       return this.mMetadata;
    }
    public final float getRatio(){
       return this.mRatio;
    }
    public int getSize(Paint p0,CharSequence p1,int p2,int p3,Paint$FontMetricsInt p4){
       p0.getFontMetricsInt(this.mTmpFontMetrics);
       EmojiSpan tmTmpFontMet = this.mTmpFontMetrics;
       this.mRatio = ((float)Math.abs((tmTmpFontMet.descent - tmTmpFontMet.ascent)) * 0x3f800000) / (float)this.mMetadata.getHeight();
       this.mHeight = (short)(int)((float)this.mMetadata.getHeight() * this.mRatio);
       short s = (short)(int)((float)this.mMetadata.getWidth() * this.mRatio);
       this.mWidth = s;
       if (p4 != null) {
          EmojiSpan tmTmpFontMet1 = this.mTmpFontMetrics;
          p4.ascent = tmTmpFontMet1.ascent;
          p4.descent = tmTmpFontMet1.descent;
          p4.top = tmTmpFontMet1.top;
          p4.bottom = tmTmpFontMet1.bottom;
       }
       return s;
    }
    public final int getWidth(){
       return this.mWidth;
    }
}
