package com.kuaishou.live.lite.comment.view.item.reply.AuthorReplyMessageViewController$a;
import androidx.lifecycle.Observer;
import com.kuaishou.live.lite.comment.view.item.reply.AuthorReplyMessageViewController;
import java.lang.Object;
import da3.h$d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.widget.EmojiTextView;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.kuaishou.live.basic.textstyle.LiveSpannable;
import s93.u;
import com.kuaishou.protobuf.livestream.nano.LiveAudienceState;
import da3.a;
import com.kuaishou.protobuf.livestream.nano.UserStateRichTextSegment;
import android.text.style.ClickableSpan;
import com.kuaishou.live.basic.textstyle.LiveSpannable$b;
import java.lang.StringBuilder;
import da3.b;
import android.view.View$OnClickListener;
import ya1.b;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import s93.r;
import com.kuaishou.live.lite.comment.view.ItemViewControllerFactory$a;
import ba3.a;
import xp5.i;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import k2b.u1;

public final class AuthorReplyMessageViewController$a implements Observer	// class@000837
{
    public final AuthorReplyMessageViewController b;

    public void AuthorReplyMessageViewController$a(AuthorReplyMessageViewController p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AuthorReplyMessageViewController$a.class, "1")) {
       }else {
          EmojiTextView uEmojiTextVi = AuthorReplyMessageViewController.Y2(this.b);
          AuthorReplyMessageViewController$a tb = this.b;
          a.o(p0, "it");
          Objects.requireNonNull(tb);
          SpannableStringBuilder spannableStr = PatchProxy.applyOneRefs(p0, tb, AuthorReplyMessageViewController.class, "5");
          if (spannableStr != PatchProxyResult.class) {
          }else {
             LiveSpannable liveSpannabl = new LiveSpannable();
             u b = u.b;
             h$d d = p0.d;
             LiveAudienceState liteUserStat = (d != null)? d.liteUserStateSegment: null;
             b.b(liteUserStat, liveSpannabl, new a(tb));
             LiveSpannable$b uob = new LiveSpannable$b(p0.b+"@Äã: ");
             uob.d(R.color.arg_RES_7f060875);
             uob.e(tb.o);
             uob.b(new b(tb, p0));
             liveSpannabl.j(uob);
             uob = new LiveSpannable$b("Ð»Ð»ÄãËÍµÄ"+p0.c);
             uob.d(R.color.arg_RES_7f0607c6);
             uob.e(tb.p);
             liveSpannabl.j(uob);
             liveSpannabl.o(new b(tb.q), 0, liveSpannabl.m());
             spannableStr = liveSpannabl.k();
             a.o(spannableStr, "spannable.build\(\)");
          }
          uEmojiTextVi.setText(spannableStr);
          p0 = r.a;
          i oi = this.b.V2().e();
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoidOneRefs(oi, p0, r.class, "5")) {
             a.p(oi, "logPackageProvider");
             p0 = new ClientEvent$ElementPackage();
             p0.action2 = "LITE_AFTER_GIFT_FEEDBACK_ITEM";
             p0.params = new JsonObject().toString();
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.liveStreamPackage = oi.a();
             u1.B0(new ShowMetaData().setElementPackage(p0).setContentPackage(uContentPack));
          }
       }
       return;
    }
}
