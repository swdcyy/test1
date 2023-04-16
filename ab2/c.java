package ab2.c;
import erd.g;
import ab2.d;
import java.lang.Object;
import com.kuaishou.live.core.show.liveslidesquare.sidebar.response.LiveSquareSideBarTabsResponse;
import java.util.Objects;
import com.kuaishou.live.core.show.liveslidesquare.sidebar.response.LiveSquareSideBarTabsResponse$LiveSquareStartPushEntryConfig;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;
import lnc.a1;
import java.lang.String;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.widget.ImageView;

public final class c implements g	// class@000099
{
    public final d b;

    public void c(d p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       LiveSquareSideBarTabsResponse mLiveSquareS = p0.mLiveSquareStartPushEntryConfig;
       if (mLiveSquareS == null) {
       }else if(!TextUtils.x(mLiveSquareS.mEntryText)){
          tb.s.setText(p0.mLiveSquareStartPushEntryConfig.mEntryText);
       }
       if (!TextUtils.x(p0.mLiveSquareStartPushEntryConfig.mEntryTextColor)) {
          tb.s.setTextColor(TextUtils.J(p0.mLiveSquareStartPushEntryConfig.mEntryTextColor, a1.a(R.color.arg_RES_7f061fbd)));
       }
       if (!TextUtils.x(p0.mLiveSquareStartPushEntryConfig.mEntryBackgroundUrl)) {
          tb.q.L(p0.mLiveSquareStartPushEntryConfig.mEntryBackgroundUrl);
       }
       if (!TextUtils.x(p0.mLiveSquareStartPushEntryConfig.mEntryIconUrl)) {
          tb.r.setVisibility(0);
          tb.r.L(p0.mLiveSquareStartPushEntryConfig.mEntryIconUrl);
       }
       return;
    }
}
