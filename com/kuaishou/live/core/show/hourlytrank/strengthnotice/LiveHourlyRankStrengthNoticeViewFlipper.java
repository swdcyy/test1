package com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeViewFlipper;
import com.kuaishou.live.core.basic.widget.LiveCustomViewFlipper;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.widget.ViewFlipper;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeBaseFlipperItemView;
import com.kuaishou.live.common.core.basic.widget.LiveViewFlipper;

public class LiveHourlyRankStrengthNoticeViewFlipper extends LiveCustomViewFlipper	// class@000c3b
{

    public void LiveHourlyRankStrengthNoticeViewFlipper(Context p0){
       super(p0);
    }
    public void LiveHourlyRankStrengthNoticeViewFlipper(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void showNext(){
       if (PatchProxy.applyVoid(null, this, LiveHourlyRankStrengthNoticeViewFlipper.class, "2")) {
          return;
       }
       if (this.getCurrentView() instanceof LiveHourlyRankStrengthNoticeBaseFlipperItemView) {
          this.getCurrentView().a();
       }
       super.showNext();
       if (this.getCurrentView() instanceof LiveHourlyRankStrengthNoticeBaseFlipperItemView) {
          this.getCurrentView().b();
       }
       return;
    }
}
