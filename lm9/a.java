package lm9.a;
import tkd.b;
import java.lang.String;
import androidx.fragment.app.Fragment;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import jsa.c;
import lm9.a$b;
import java.lang.Boolean;
import com.kwai.framework.model.feed.BaseFeed;
import pw6.d;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import lm9.a$c;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import pw6.a;
import java.util.List;
import com.yxcorp.gifshow.activity.GifshowActivity;

public interface abstract a implements b	// class@002e13
{

    void AH(String p0);
    boolean Hm(Fragment p0);
    void J60(LiveStreamFeed p0);
    void Jl(c p0);
    void RI(LiveStreamFeed p0,a$b p1,boolean p2);
    boolean SW(LiveStreamFeed p0,Boolean p1);
    void Tq(BaseFeed p0);
    d YM(int p0);
    void YR(LiveStreamFeed p0);
    boolean Zg(LiveStreamFeed p0);
    d es(LiveAudienceParam p0,LiveStreamFeed p1,a$c p2);
    a fz(LiveBizParam p0);
    void init();
    boolean jm(LiveStreamFeed p0);
    void nS(LiveAudienceParam p0);
    void processFeedsListAsync(List p0);
    void sk(BaseFeed p0);
    void tH(String p0,BaseFeed p1);
    void uS(LiveAudienceParam p0,LiveStreamFeed p1,int p2,a$c p3,GifshowActivity p4);
}
