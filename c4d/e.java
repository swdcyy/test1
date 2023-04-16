package c4d.e;
import com.yxcorp.plugin.emotion.searchgif.SearchEmotionGifFragment$c;
import com.yxcorp.plugin.emotion.searchgif.SearchEmotionGifFragment;
import java.lang.Object;
import android.view.View;
import com.kwai.emotionsdk.bean.EmotionInfo;

public final class e implements SearchEmotionGifFragment$c	// class@0004e3
{
    public final SearchEmotionGifFragment a;
    public final SearchEmotionGifFragment$c b;

    public void e(SearchEmotionGifFragment p0,SearchEmotionGifFragment$c p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void a(View p0,EmotionInfo p1){
       this.a.F = false;
       this.b.a(p0, p1);
    }
}
