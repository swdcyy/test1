package com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeExpandItemView;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeBaseFlipperItemView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.RelativeLayout;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankSuffixCheckImageView;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeExpandTextItemView;
import com.kuaishou.livestream.message.nano.LiveDistrictRankFinalBattle$UnfoldMessage;
import ekd.j;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.Objects;
import com.kuaishou.livestream.message.nano.LiveDistrictRankFinalBattle$UnfoldSubMessage;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeExpandTextLineView;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;

public class LiveHourlyRankStrengthNoticeExpandItemView extends LiveHourlyRankStrengthNoticeBaseFlipperItemView	// class@000c2c
{
    public LiveHourlyRankSuffixCheckImageView b;
    public LiveHourlyRankStrengthNoticeExpandTextItemView c;
    public int d;
    public String e;

    public void LiveHourlyRankStrengthNoticeExpandItemView(Context p0){
       super(p0, null);
    }
    public void LiveHourlyRankStrengthNoticeExpandItemView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveHourlyRankStrengthNoticeExpandItemView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.d = 0;
       if (PatchProxy.applyVoid(null, this, LiveHourlyRankStrengthNoticeExpandItemView.class, "2")) {
       }else {
          a.c(this.getContext(), R.layout.arg_RES_7f0d0c2e, this);
          this.b = this.findViewById(0x7f0a3b74);
          this.c = this.findViewById(0x7f0a3b76);
       }
       return;
    }
    public void c(){
    }
    public void d(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveHourlyRankStrengthNoticeExpandItemView.class, "1")) {
       }else {
          int i = 8;
          int i1 = 0;
          if (j.h(p0.infoShowPicUrl)) {
             if (!j.h(p0.unfoldSubMessage)) {
                this.d = 2;
                this.b.setVisibility(i);
                this.c.setVisibility(i1);
                LiveHourlyRankStrengthNoticeExpandItemView tc = this.c;
                LiveDistrictRankFinalBattle$UnfoldMessage unfoldSubMes = p0.unfoldSubMessage;
                Objects.requireNonNull(tc);
                if (!PatchProxy.applyVoidOneRefs(unfoldSubMes, tc, LiveHourlyRankStrengthNoticeExpandTextItemView.class, "2")) {
                   if (unfoldSubMes.length > 0) {
                      tc.b.a(unfoldSubMes[i1]);
                   }
                   if (unfoldSubMes.length > 1) {
                      tc.c.a(unfoldSubMes[1]);
                   }
                }
             }
          }else {
             this.d = 1;
             this.b.setVisibility(i1);
             this.c.setVisibility(i);
             this.b.U(e0.i(p0.infoShowPicUrl));
          }
          this.e = p0.extraInfo;
       }
       return;
    }
    public String getExtraInfo(){
       return this.e;
    }
}
