package com.kuaishou.live.core.show.quiz.notice.a;
import erd.g;
import com.kuaishou.live.core.show.quiz.notice.LiveQuizNoticeDialog;
import java.lang.Object;
import com.kuaishou.live.core.show.quiz.model.LiveQuizNoticeInfoResponse;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import java.lang.CharSequence;
import android.widget.TextView;
import t02.a0;
import p91.m;
import java.lang.Math;
import java.lang.Long;
import fg2.e;
import android.os.CountDownTimer;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import yf2.a;
import xb.t$b;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import fg2.b;
import android.view.View$OnClickListener;
import fg2.c;

public final class a implements g	// class@000e2d
{
    public final LiveQuizNoticeDialog b;

    public void a(LiveQuizNoticeDialog p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, LiveQuizNoticeDialog.class, "15")) {
       }else {
          tb.M.setVisibility(0);
          if (p0.mDisplayTitle != null) {
             tb.y.setText(p0.mTitle);
             tb.z.setText(p0.mSubtitle);
          }
          tb.A.setText(p0.mDisplayTotalAwardAmount);
          tb.B.setText(p0.mDisplayAwardUnit);
          long l = 0;
          long l1 = Math.max((p0.mStartTimeMs - tb.s.Z2.s()), l);
          if (!PatchProxy.isSupport(LiveQuizNoticeDialog.class) || !PatchProxy.applyVoidOneRefs(Long.valueOf(l1), tb, LiveQuizNoticeDialog.class, "16")) {
             if (l1 - l <= 0 || l1 - 0x36ee80 > 0) {
                tb.L.setVisibility(8);
             }else {
                tb.yh(l1);
                tb.wh();
                e uoe = new e(tb, l1, 1000);
                tb.x = v7;
                v7.start();
             }
          }
          tb.F.getHierarchy().u(a.l);
          tb.F.L(p0.mQuizNoticeImageUrl);
          tb.I.setOnClickListener(new b(tb, p0));
          tb.J.setOnClickListener(new c(tb, p0));
       }
       return;
    }
}
