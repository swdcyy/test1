package com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeExpandTextItemView;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeExpandTextLineView;

public class LiveHourlyRankStrengthNoticeExpandTextItemView extends LinearLayout	// class@000c2d
{
    public LiveHourlyRankStrengthNoticeExpandTextLineView b;
    public LiveHourlyRankStrengthNoticeExpandTextLineView c;

    public void LiveHourlyRankStrengthNoticeExpandTextItemView(Context p0){
       super(p0, null);
    }
    public void LiveHourlyRankStrengthNoticeExpandTextItemView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveHourlyRankStrengthNoticeExpandTextItemView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoid(null, this, LiveHourlyRankStrengthNoticeExpandTextItemView.class, "1")) {
       }else {
          a.c(this.getContext(), R.layout.arg_RES_7f0d0c30, this);
          this.b = this.findViewById(0x7f0a3b78);
          this.c = this.findViewById(0x7f0a3b77);
          this.setOrientation(1);
       }
       return;
    }
}
