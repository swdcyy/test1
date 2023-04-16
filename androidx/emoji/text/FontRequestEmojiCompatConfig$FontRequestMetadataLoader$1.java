package androidx.emoji.text.FontRequestEmojiCompatConfig$FontRequestMetadataLoader$1;
import java.lang.Runnable;
import androidx.emoji.text.FontRequestEmojiCompatConfig$FontRequestMetadataLoader;
import androidx.emoji.text.EmojiCompat$MetadataRepoLoaderCallback;
import java.lang.Object;

public class FontRequestEmojiCompatConfig$FontRequestMetadataLoader$1 implements Runnable	// class@000759
{
    public final FontRequestEmojiCompatConfig$FontRequestMetadataLoader this$0;
    public final EmojiCompat$MetadataRepoLoaderCallback val$loaderCallback;

    public void FontRequestEmojiCompatConfig$FontRequestMetadataLoader$1(FontRequestEmojiCompatConfig$FontRequestMetadataLoader p0,EmojiCompat$MetadataRepoLoaderCallback p1){
       this.this$0 = p0;
       this.val$loaderCallback = p1;
       super();
    }
    public void run(){
       FontRequestEmojiCompatConfig$FontRequestMetadataLoader$1 tthis$0 = this.this$0;
       tthis$0.mCallback = this.val$loaderCallback;
       tthis$0.createMetadata();
    }
}
