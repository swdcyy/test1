package androidx.emoji.text.FontRequestEmojiCompatConfig$FontProviderHelper;
import java.lang.Object;
import android.content.Context;
import x1.f$b;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import x1.f;
import x1.d;
import x1.f$a;
import android.net.Uri;
import android.database.ContentObserver;
import android.content.ContentResolver;

public class FontRequestEmojiCompatConfig$FontProviderHelper	// class@000758
{

    public void FontRequestEmojiCompatConfig$FontProviderHelper(){
       super();
    }
    public Typeface buildTypeface(Context p0,f$b p1){
       f$b[] uobArray = new f$b[]{p1};
       return f.a(p0, null, uobArray);
    }
    public f$a fetchFonts(Context p0,d p1){
       return f.b(p0, null, p1);
    }
    public void registerObserver(Context p0,Uri p1,ContentObserver p2){
       p0.getContentResolver().registerContentObserver(p1, false, p2);
    }
    public void unregisterObserver(Context p0,ContentObserver p1){
       p0.getContentResolver().unregisterContentObserver(p1);
    }
}
