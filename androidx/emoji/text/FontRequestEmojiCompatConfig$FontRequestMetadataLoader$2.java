package androidx.emoji.text.FontRequestEmojiCompatConfig$FontRequestMetadataLoader$2;
import android.database.ContentObserver;
import androidx.emoji.text.FontRequestEmojiCompatConfig$FontRequestMetadataLoader;
import android.os.Handler;
import android.net.Uri;

public class FontRequestEmojiCompatConfig$FontRequestMetadataLoader$2 extends ContentObserver	// class@00075a
{
    public final FontRequestEmojiCompatConfig$FontRequestMetadataLoader this$0;

    public void FontRequestEmojiCompatConfig$FontRequestMetadataLoader$2(FontRequestEmojiCompatConfig$FontRequestMetadataLoader p0,Handler p1){
       this.this$0 = p0;
       super(p1);
    }
    public void onChange(boolean p0,Uri p1){
       this.this$0.createMetadata();
    }
}
