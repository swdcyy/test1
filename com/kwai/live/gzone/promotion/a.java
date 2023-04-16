package com.kwai.live.gzone.promotion.a;
import android.view.View$OnClickListener;
import com.kwai.live.gzone.promotion.d;
import java.lang.Object;
import android.view.View;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import t67.a;
import s67.e;
import java.lang.String;
import fq5.b;
import y8c.d;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kwai.live.gzone.promotion.c;
import com.kwai.live.gzone.promotion.bean.LiveGzonePromotionGame;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.live.gzone.promotion.u$a;
import com.kwai.live.gzone.promotion.u;

public final class a implements View$OnClickListener	// class@000daf
{
    public final d b;

    public void a(d p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       a tb = this.b;
       Activity activity = tb.getActivity();
       d r = tb.r;
       c uoc = new c(tb);
       u.c(activity, tb.q.c, r.f, r.e.d(), tb.r.e.getLiveStreamId(), tb.s.get(), 0, tb.r.e.a(), uoc);
    }
}
