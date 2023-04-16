package com.kuaishou.live.lite.comment.view.item.gift.GiftSentMessageViewController$a;
import androidx.lifecycle.Observer;
import com.kuaishou.live.lite.comment.view.item.gift.GiftSentMessageViewController;
import java.lang.Object;
import ca3.c$c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.kuaishou.live.basic.textstyle.LiveSpannable;
import com.kuaishou.live.lite.comment.view.ItemViewControllerFactory$a;
import ba3.a;
import e93.a;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import or5.b;
import com.kuaishou.android.model.feed.LiveStreamFeed$LiveLiteElementsSwitch;
import s93.u;
import com.kuaishou.protobuf.livestream.nano.LiveAudienceState;
import ca3.a;
import com.kuaishou.protobuf.livestream.nano.UserStateRichTextSegment;
import android.text.style.ClickableSpan;
import com.kuaishou.live.basic.textstyle.LiveSpannable$b;
import ca3.b;
import android.view.View$OnClickListener;
import com.kuaishou.live.basic.textstyle.LiveSpannable$a;
import android.graphics.drawable.BitmapDrawable;
import android.content.Context;
import com.kuaishou.live.viewcontroller.ViewController;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import lnc.a1;
import ya1.b;
import android.text.SpannableStringBuilder;
import android.widget.TextView;

public final class GiftSentMessageViewController$a implements Observer	// class@00082b
{
    public final GiftSentMessageViewController b;

    public void GiftSentMessageViewController$a(GiftSentMessageViewController p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GiftSentMessageViewController$a.class, "1")) {
       }else {
          GiftSentMessageViewController p = this.b.p;
          if (p == null) {
             a.S("messageTextView");
          }
          GiftSentMessageViewController$a tb = this.b;
          a.o(p0, "it");
          Objects.requireNonNull(tb);
          SpannableStringBuilder spannableStr = PatchProxy.applyOneRefs(p0, tb, GiftSentMessageViewController.class, "4");
          if (spannableStr != PatchProxyResult.class) {
          }else {
             LiveSpannable liveSpannabl = new LiveSpannable();
             a uoa = tb.V2().a();
             if (uoa != null) {
                LiveStreamFeed liveStreamFe = uoa.j0();
                if (liveStreamFe != null) {
                   liveStreamFe = liveStreamFe.mLiveLiteElementsSwitch;
                   if (liveStreamFe != null && liveStreamFe.mEnableCommentMedal == 1) {
                      u b = u.b;
                      c$c d = p0.d;
                      LiveAudienceState liteUserStat = (d != null)? d.liteUserStateSegment: null;
                      b.b(liteUserStat, liveSpannabl, new a(tb));
                   }
                }
             }
             LiveSpannable$b uob = new LiveSpannable$b(p0.a);
             uob.d(tb.X2());
             uob.e(tb.n);
             uob.b(new b(tb));
             liveSpannabl.j(uob);
             liveSpannabl.e();
             uob = new LiveSpannable$b(p0.b);
             uob.d(R.color.arg_RES_7f06086b);
             uob.e(tb.n);
             liveSpannabl.j(uob);
             liveSpannabl.e();
             p0 = p0.c;
             if (p0 != null) {
                liveSpannabl.h(new LiveSpannable$a(new BitmapDrawable(tb.D2().getResources(), p0)).c(a1.d(R.dimen.arg_RES_7f07080d)));
             }
             liveSpannabl.o(new b(tb.o), 0, liveSpannabl.m());
             spannableStr = liveSpannabl.k();
             a.o(spannableStr, "spannable.build\(\)");
          }
          p.setText(spannableStr);
       }
       return;
    }
}
