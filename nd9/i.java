package nd9.i;
import java.lang.Runnable;
import nd9.l;
import com.yxcorp.gifshow.magic.data.repo.response.MagicEmojiEntrance;
import java.lang.Object;
import java.util.Objects;
import com.yxcorp.gifshow.magic.data.repo.response.MagicDownloadIndicatorConfig;
import ee9.m;
import com.yxcorp.gifshow.camera.record.base.d;
import ee9.c;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.camera.record.base.b;

public final class i implements Runnable	// class@003142
{
    public final l b;
    public final MagicEmojiEntrance c;

    public void i(l p0,MagicEmojiEntrance p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       i tb = this.b;
       i tc = this.c;
       Objects.requireNonNull(tb);
       if (tc.mIndicatorConfig == null) {
          tc.mIndicatorConfig = MagicDownloadIndicatorConfig.sDefaultIndicator;
       }
       if (!m.D(tc.mIndicatorConfig.mIndicatorStyle)) {
          tc.mIndicatorConfig.mIndicatorStyle = 0;
       }
       tb.d.m(new c(tc.mMagicFaceInfo, tc.mIndicatorConfig.mIndicatorStyle, 0, tc));
       return;
    }
}
