package androidx.emoji.text.EmojiCompat$CompatInternal19;
import androidx.emoji.text.EmojiCompat$CompatInternal;
import androidx.emoji.text.EmojiCompat;
import java.lang.String;
import d3.c;
import androidx.emoji.text.MetadataRepo;
import java.lang.CharSequence;
import androidx.emoji.text.EmojiMetadata;
import androidx.emoji.text.EmojiProcessor;
import androidx.emoji.text.EmojiCompat$CompatInternal19$1;
import androidx.emoji.text.EmojiCompat$MetadataRepoLoaderCallback;
import androidx.emoji.text.EmojiCompat$MetadataRepoLoader;
import java.lang.Throwable;
import java.lang.IllegalArgumentException;
import androidx.emoji.text.EmojiCompat$SpanFactory;
import androidx.emoji.text.EmojiProcessor$GlyphChecker;
import android.view.inputmethod.EditorInfo;
import android.os.Bundle;

public final class EmojiCompat$CompatInternal19 extends EmojiCompat$CompatInternal	// class@000744
{
    public MetadataRepo mMetadataRepo;
    public EmojiProcessor mProcessor;

    public void EmojiCompat$CompatInternal19(EmojiCompat p0){
       super(p0);
    }
    public String getAssetSignature(){
       String str = this.mMetadataRepo.getMetadataList().l();
       if (str == null) {
          str = "";
       }
       return str;
    }
    public boolean hasEmojiGlyph(CharSequence p0){
       boolean b = (this.mProcessor.getEmojiMetadata(p0) != null)? true: false;
       return b;
    }
    public boolean hasEmojiGlyph(CharSequence p0,int p1){
       EmojiMetadata emojiMetadat = this.mProcessor.getEmojiMetadata(p0);
       boolean b = (emojiMetadat != null && emojiMetadat.getCompatAdded() <= p1)? true: false;
       return b;
    }
    public void loadMetadata(){
       this.mEmojiCompat.mMetadataLoader.load(new EmojiCompat$CompatInternal19$1(this));
       return;
    }
    public void onMetadataLoadSuccess(MetadataRepo p0){
       if (p0 == null) {
          this.mEmojiCompat.onMetadataLoadFailed(new IllegalArgumentException("metadataRepo cannot be null"));
          return;
       }else {
          this.mMetadataRepo = p0;
          EmojiCompat$CompatInternal tmEmojiCompa = this.mEmojiCompat;
          this.mProcessor = new EmojiProcessor(this.mMetadataRepo, new EmojiCompat$SpanFactory(), tmEmojiCompa.mUseEmojiAsDefaultStyle, tmEmojiCompa.mEmojiAsDefaultStyleExceptions);
          this.mEmojiCompat.onMetadataLoadSuccess();
          return;
       }
    }
    public CharSequence process(CharSequence p0,int p1,int p2,int p3,boolean p4){
       return this.mProcessor.process(p0, p1, p2, p3, p4);
    }
    public void setGlyphChecker(EmojiProcessor$GlyphChecker p0){
       this.mProcessor.setGlyphChecker(p0);
    }
    public void updateEditorInfoAttrs(EditorInfo p0){
       p0.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.mMetadataRepo.getMetadataVersion());
       p0.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.mEmojiCompat.mReplaceAll);
    }
}
