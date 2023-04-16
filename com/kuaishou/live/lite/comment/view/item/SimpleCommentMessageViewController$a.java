package com.kuaishou.live.lite.comment.view.item.SimpleCommentMessageViewController$a;
import androidx.lifecycle.Observer;
import com.kuaishou.live.lite.comment.view.item.SimpleCommentMessageViewController;
import java.lang.Object;
import ba3.i$d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.widget.EmojiTextView;
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
import ba3.b;
import com.kuaishou.protobuf.livestream.nano.UserStateRichTextSegment;
import android.text.style.ClickableSpan;
import com.kuaishou.live.basic.textstyle.LiveSpannable$b;
import java.lang.StringBuilder;
import ba3.c;
import android.view.View$OnClickListener;
import ya1.b;
import android.text.SpannableStringBuilder;
import android.widget.TextView;

public final class SimpleCommentMessageViewController$a implements Observer	// class@00081e
{
    public final SimpleCommentMessageViewController b;

    public void SimpleCommentMessageViewController$a(SimpleCommentMessageViewController p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SimpleCommentMessageViewController$a.class, "1")) {
       }else {
          EmojiTextView uEmojiTextVi = SimpleCommentMessageViewController.Y2(this.b);
          SimpleCommentMessageViewController$a tb = this.b;
          a.o(p0, "it");
          Objects.requireNonNull(tb);
          SpannableStringBuilder spannableStr = PatchProxy.applyOneRefs(p0, tb, SimpleCommentMessageViewController.class, "5");
          if (spannableStr != PatchProxyResult.class) {
          }else {
             LiveSpannable liveSpannabl = new LiveSpannable();
             LiveStreamFeed liveStreamFe = tb.V2().a().j0();
             if (liveStreamFe != null) {
                liveStreamFe = liveStreamFe.mLiveLiteElementsSwitch;
                if (liveStreamFe != null && liveStreamFe.mEnableCommentMedal == 1) {
                   u b = u.b;
                   i$d d = p0.d;
                   LiveAudienceState liteUserStat = (d != null)? d.liteUserStateSegment: null;
                   b.b(liteUserStat, liveSpannabl, new b(tb));
                }
             }
             LiveSpannable$b uob = new LiveSpannable$b(p0.b+": ");
             uob.d(tb.X2());
             uob.e(tb.o);
             uob.b(new c(tb, p0));
             liveSpannabl.j(uob);
             uob = new LiveSpannable$b(p0.c);
             uob.d(R.color.arg_RES_7f0607c6);
             uob.e(tb.p);
             liveSpannabl.j(uob);
             liveSpannabl.o(new b(tb.q), 0, liveSpannabl.m());
             spannableStr = liveSpannabl.k();
             a.o(spannableStr, "spannable.build\(\)");
          }
          uEmojiTextVi.setText(spannableStr);
       }
       return;
    }
}
