package b4b.b;
import ok.o;
import com.yxcorp.gifshow.model.response.MagicEmojiResponse;
import com.yxcorp.gifshow.plugin.magicemoji.MagicEmojiPageConfig;
import java.lang.Object;
import com.yxcorp.gifshow.model.MagicEmoji;
import java.lang.String;

public final class b implements o	// class@00035c
{
    public final MagicEmojiResponse b;
    public final MagicEmojiPageConfig c;

    public void b(MagicEmojiResponse p0,MagicEmojiPageConfig p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final boolean apply(Object p0){
       b tb = this.b;
       b tc = this.c;
       MagicEmojiResponse mDefaultTabI = tb.mDefaultTabId;
       boolean b = (mDefaultTabI == null || (mDefaultTabI.equals(p0.mId) || (tb.mDefaultTabId == null && p0.mTabType == tc.mDefaultTab)))? true: false;
       return b;
    }
}
