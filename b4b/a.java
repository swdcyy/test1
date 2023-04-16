package b4b.a;
import ok.o;
import com.yxcorp.gifshow.model.response.MagicEmojiResponse;
import java.lang.Object;
import com.yxcorp.gifshow.model.MagicEmoji;
import java.lang.String;

public final class a implements o	// class@00035b
{
    public final MagicEmojiResponse b;

    public void a(MagicEmojiResponse p0){
       this.b = p0;
    }
    public final boolean apply(Object p0){
       a tb = this.b;
       MagicEmojiResponse mDefaultTabI = tb.mDefaultTabId;
       boolean b = (mDefaultTabI == null || (mDefaultTabI.equals(p0.mId) || (tb.mDefaultTabId == null && p0.mTabType == null)))? true: false;
       return b;
    }
}
