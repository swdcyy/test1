package ec2.d;
import erd.g;
import com.kuaishou.live.core.show.luckystar.openresult.b;
import java.lang.Object;
import com.kuaishou.live.core.show.luckystar.model.LiveLuckyStarOpenResultResponse;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yb2.i;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import java.lang.Integer;
import com.kuaishou.live.core.show.luckystar.util.LiveLuckyStarLogger;
import mkc.b;
import android.view.View;
import mkc.c;
import java.lang.Boolean;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.view.ViewGroup$MarginLayoutParams;
import lnc.a1;
import com.kuaishou.live.core.show.luckystar.util.b;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import zb2.p;
import com.facebook.imagepipeline.request.ImageRequest;
import boc.d0;
import pb.d;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.controller.AbstractDraweeController;
import ac.a;
import com.facebook.drawee.view.DraweeView;
import java.util.Collection;
import ekd.q;
import java.util.List;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import com.kuaishou.live.core.show.luckystar.openresult.c;
import g9c.a;
import android.view.View$OnTouchListener;

public final class d implements g	// class@0026e1
{
    public final b b;

    public void d(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d tb = this.b;
       Objects.requireNonNull(tb);
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, tb, uob, "8")) {
       }else if(tb.y == null){
          LiveLuckyStarLogger.o(tb.p.a.a(), tb.z, tb.A, Integer.valueOf(p0.mWinType));
          tb.y = true;
       }
       b[] uobArray = new b[]{b.d,b.g};
       c.d(tb.q, uobArray);
       if (!PatchProxy.applyVoidOneRefs(p0, tb, uob, "10")) {
          LiveLuckyStarOpenResultResponse mIsLuckyUser = p0.mIsLuckyUser;
          if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(mIsLuckyUser), tb, uob, "3")) {
             ViewGroup$MarginLayoutParams layoutParams = tb.w.getLayoutParams();
             float f = (mIsLuckyUser != null)? 115.00f: 94.00f;
             layoutParams.topMargin = a1.e(f);
             tb.w.setLayoutParams(layoutParams);
          }
          b.l(p0);
          if (p0.mIsLuckyUser != null) {
             if (!PatchProxy.applyVoidOneRefs(p0, tb, uob, "12")) {
                tb.r.setVisibility(0);
                tb.w.setVisibility(0);
                tb.s.setVisibility(0);
                tb.t.setVisibility(0);
                tb.v.setVisibility(4);
                tb.u.setVisibility(0);
                if (!TextUtils.x(p0.mTitle)) {
                   tb.s.setText(p0.mTitle);
                }else {
                   tb.s.setText(R.string.arg_RES_7f102621);
                }
                if (!TextUtils.x(p0.mSubTitle)) {
                   tb.t.setText(p0.mSubTitle);
                }else {
                   tb.t.setText(R.string.arg_RES_7f102651);
                }
                d uod = Fresco.newDraweeControllerBuilder();
                uod.q(true);
                uod.u(d0.e(p.b));
                AbstractDraweeController uAbstractDra = uod.e();
                tb.r.setVisibility(0);
                tb.r.setController(uAbstractDra);
             }
          }else if(PatchProxy.applyVoid(null, tb, uob, "13")){
             tb.w.setVisibility(0);
             tb.s.setVisibility(0);
             tb.t.setVisibility(0);
             tb.v.setVisibility(4);
             tb.u.setVisibility(8);
             tb.s.setText(R.string.arg_RES_7f102641);
             tb.t.setText(R.string.arg_RES_7f10264c);
          }
          LiveLuckyStarOpenResultResponse mBackgroundU = p0.mBackgroundUrls;
          if (!q.f(mBackgroundU)) {
             tb.x.P(mBackgroundU);
          }
          tb.w.setAdapter(null);
          if (!q.f(p0.mLuckyUsers)) {
             c uoc = new c(tb.p);
             tb.w.setAdapter(uoc);
             uoc.s1(p0.mTips);
             uoc.r1(p0.mActualLuckyUserCount);
             uoc.W0(p0.mLuckyUsers);
             uoc.k0();
             tb.w.setOnTouchListener(null);
          }else {
             tb.v.setText(R.string.arg_RES_7f10263f);
             tb.v.setVisibility(0);
          }
       }
       return;
    }
}
