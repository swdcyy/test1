package androidx.emoji.text.EmojiCompat$CompatInternal;
import androidx.emoji.text.EmojiCompat;
import java.lang.Object;
import java.lang.String;
import java.lang.CharSequence;
import androidx.emoji.text.EmojiProcessor$GlyphChecker;
import android.view.inputmethod.EditorInfo;

public class EmojiCompat$CompatInternal	// class@000745
{
    public final EmojiCompat mEmojiCompat;

    public void EmojiCompat$CompatInternal(EmojiCompat p0){
       super();
       this.mEmojiCompat = p0;
    }
    public String getAssetSignature(){
       return "";
    }
    public boolean hasEmojiGlyph(CharSequence p0){
       return false;
    }
    public boolean hasEmojiGlyph(CharSequence p0,int p1){
       return false;
    }
    public void loadMetadata(){
       this.mEmojiCompat.onMetadataLoadSuccess();
    }
    public CharSequence process(CharSequence p0,int p1,int p2,int p3,boolean p4){
       return p0;
    }
    public void setGlyphChecker(EmojiProcessor$GlyphChecker p0){
    }
    public void updateEditorInfoAttrs(EditorInfo p0){
    }
}
