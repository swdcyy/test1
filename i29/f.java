package i29.f;
import erd.g;
import com.yxcorp.gifshow.ad.detail.vm.rightactionbar.like.AdLikeElement;
import java.lang.Object;
import android.view.View;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.slide.play.detail.rightactionbar.like.LikeAnimationEnum;
import com.yxcorp.gifshow.util.cdnresource.CdnResource$ResourceKey;
import java.lang.String;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.util.cdnresource.e;

public final class f implements g	// class@002627
{
    public final AdLikeElement b;

    public void f(AdLikeElement p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       f tb = this.b;
       if (!TextUtils.x(tb.x)) {
          p0 = tb.y;
          if (p0 == LikeAnimationEnum.LIKE_TO_DISLIKE) {
             e.k(tb.x, null, CdnResource$ResourceKey.bt_sidebar_dislike_ab);
          }else if(p0 == LikeAnimationEnum.DISLIKE_TO_LIKE){
             e.k(tb.x, null, CdnResource$ResourceKey.bt_sidebar_like_ab);
          }
       }
       tb.x = null;
       tb.y = null;
       return;
    }
}
