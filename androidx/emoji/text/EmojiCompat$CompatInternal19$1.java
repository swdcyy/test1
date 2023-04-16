package androidx.emoji.text.EmojiCompat$CompatInternal19$1;
import androidx.emoji.text.EmojiCompat$MetadataRepoLoaderCallback;
import androidx.emoji.text.EmojiCompat$CompatInternal19;
import java.lang.Throwable;
import androidx.emoji.text.EmojiCompat$CompatInternal;
import androidx.emoji.text.EmojiCompat;
import androidx.emoji.text.MetadataRepo;

public class EmojiCompat$CompatInternal19$1 extends EmojiCompat$MetadataRepoLoaderCallback	// class@000743
{
    public final EmojiCompat$CompatInternal19 this$0;

    public void EmojiCompat$CompatInternal19$1(EmojiCompat$CompatInternal19 p0){
       this.this$0 = p0;
       super();
    }
    public void onFailed(Throwable p0){
       this.this$0.mEmojiCompat.onMetadataLoadFailed(p0);
    }
    public void onLoaded(MetadataRepo p0){
       this.this$0.onMetadataLoadSuccess(p0);
    }
}
