package com.kuaishou.live.core.show.luckystar.openresult.d;
import erd.g;
import com.kuaishou.live.core.show.luckystar.openresult.f;
import java.lang.Object;
import com.kuaishou.live.core.show.luckystar.model.LiveLuckyStarRollUserResponse;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import ekd.q;
import java.util.List;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.drawing.e;
import android.view.View$OnTouchListener;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import ec2.h;
import g9c.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import android.animation.ValueAnimator;
import java.util.concurrent.TimeUnit;
import ec2.i;
import android.animation.ValueAnimator$AnimatorUpdateListener;

public final class d implements g	// class@000ce8
{
    public final f b;

    public void d(f p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d tb = this.b;
       Objects.requireNonNull(tb);
       f uof = f.class;
       if (PatchProxy.applyVoidOneRefs(p0, tb, uof, "7")) {
       }else {
          tb.R8();
          if (!PatchProxy.applyVoidOneRefs(p0, tb, uof, "8")) {
             LiveLuckyStarRollUserResponse mBackgroundU = p0.mBackgroundUrls;
             if (!q.f(mBackgroundU)) {
                tb.u.P(mBackgroundU);
             }
          }
          if (!PatchProxy.applyVoidOneRefs(p0, tb, uof, "10")) {
             if (!q.f(p0.mRollUsers)) {
                tb.t.setOnTouchListener(e.b);
                tb.t.setNestedScrollingEnabled(false);
                h oh = new h();
                oh.W0(p0.mRollUsers);
                tb.t.setAdapter(oh);
                if (!PatchProxy.applyVoid(null, tb, uof, "11")) {
                   p0 = new int[]{0x2710};
                   p0 = ValueAnimator.ofInt(p0);
                   tb.v = p0;
                   p0.setDuration(TimeUnit.HOURS.toMillis(1));
                   tb.v.addUpdateListener(new i(tb));
                   tb.v.start();
                }
             }else {
                tb.P8();
             }
          }
       }
       return;
    }
}
