package androidx.emoji.text.FontRequestEmojiCompatConfig;
import androidx.emoji.text.EmojiCompat$Config;
import androidx.emoji.text.FontRequestEmojiCompatConfig$FontProviderHelper;
import android.content.Context;
import x1.d;
import androidx.emoji.text.FontRequestEmojiCompatConfig$FontRequestMetadataLoader;
import androidx.emoji.text.EmojiCompat$MetadataRepoLoader;
import android.os.Handler;
import androidx.emoji.text.FontRequestEmojiCompatConfig$RetryPolicy;

public class FontRequestEmojiCompatConfig extends EmojiCompat$Config	// class@00075e
{
    public static final FontRequestEmojiCompatConfig$FontProviderHelper DEFAULT_FONTS_CONTRACT;

    static {
       FontRequestEmojiCompatConfig.DEFAULT_FONTS_CONTRACT = new FontRequestEmojiCompatConfig$FontProviderHelper();
    }
    public void FontRequestEmojiCompatConfig(Context p0,d p1){
       super(new FontRequestEmojiCompatConfig$FontRequestMetadataLoader(p0, p1, FontRequestEmojiCompatConfig.DEFAULT_FONTS_CONTRACT));
    }
    public void FontRequestEmojiCompatConfig(Context p0,d p1,FontRequestEmojiCompatConfig$FontProviderHelper p2){
       super(new FontRequestEmojiCompatConfig$FontRequestMetadataLoader(p0, p1, p2));
    }
    public FontRequestEmojiCompatConfig setHandler(Handler p0){
       this.getMetadataRepoLoader().setHandler(p0);
       return this;
    }
    public FontRequestEmojiCompatConfig setRetryPolicy(FontRequestEmojiCompatConfig$RetryPolicy p0){
       this.getMetadataRepoLoader().setRetryPolicy(p0);
       return this;
    }
}
