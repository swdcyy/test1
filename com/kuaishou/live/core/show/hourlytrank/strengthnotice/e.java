package com.kuaishou.live.core.show.hourlytrank.strengthnotice.e;
import java.lang.Runnable;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeView;
import java.lang.Object;
import ekd.k1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import fa2.s;
import android.widget.RelativeLayout;

public final class e implements Runnable	// class@000c47
{
    public final LiveHourlyRankStrengthNoticeView b;

    public void e(LiveHourlyRankStrengthNoticeView p0){
       this.b = p0;
    }
    public final void run(){
       e tb = this.b;
       k1.n(tb.m);
       if (PatchProxy.applyVoid(null, tb, LiveHourlyRankStrengthNoticeView.class, "19")) {
       }else if(PatchProxy.applyVoid(null, tb, LiveHourlyRankStrengthNoticeView.class, "24")){
          tb.f();
          tb.n();
          tb.e.setOnClickListener(null);
          tb.post(new s(tb));
       }
       return;
    }
}
