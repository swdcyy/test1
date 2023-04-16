package com.kuaishou.live.lite.interactivemessage.LiveLiteInteractiveMessageViewController$b;
import androidx.lifecycle.Observer;
import com.kuaishou.live.lite.interactivemessage.LiveLiteInteractiveMessageViewController;
import java.lang.Object;
import sb3.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import tb3.i;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import kotlin.jvm.internal.a;
import sb3.b;
import tb3.k;
import ip3.a;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$LikeFeed;
import tb3.j;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$ShareFeed;
import tb3.m;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$EnterRoomFeed;
import tb3.b;
import com.kuaishou.livestream.message.nano.FansGroupJoinFeed;
import tb3.c;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$FollowAuthorFeed;
import tb3.d;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$PurchaseInfoFeed;
import tb3.l;
import com.kuaishou.livestream.message.nano.LiveWatchingListChangeNoticeFeed;
import tb3.a;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$GrabRedPackFeed;
import tb3.f;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$DisplayGiftFeed;
import tb3.e;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import msd.a;
import com.yxcorp.gifshow.widget.EmojiTextView;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.Iterator;
import java.lang.Iterable;
import android.widget.TextView;
import android.view.ViewGroup;
import android.view.View;
import com.kuaishou.live.lite.interactivemessage.LiveLiteInteractiveMessageViewController$appearWithAnimation$1;
import android.view.ViewPropertyAnimator;
import rb3.e;
import android.animation.Animator$AnimatorListener;

public final class LiveLiteInteractiveMessageViewController$b implements Observer	// class@0009c0
{
    public final LiveLiteInteractiveMessageViewController b;

    public void LiveLiteInteractiveMessageViewController$b(LiveLiteInteractiveMessageViewController p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       int i;
       LiveLiteInteractiveMessageViewController m2;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteInteractiveMessageViewController$b.class, "1")) {
       }else {
          LiveLiteInteractiveMessageViewController$b tb = this.b;
          Objects.requireNonNull(tb);
          LiveLiteInteractiveMessageViewController liveLiteInte = LiveLiteInteractiveMessageViewController.class;
          if (!PatchProxy.applyVoidOneRefs(p0, tb, liveLiteInte, "7")) {
             i a = i.a;
             Object[] objArray = null;
             p0 = (p0 != null)? p0.b: objArray;
             LiveLiteInteractiveMessageViewController q = tb.q;
             LiveLiteInteractiveMessageViewController s = tb.s;
             LiveLiteInteractiveMessageViewController t = tb.t;
             Objects.requireNonNull(a);
             CharSequence uCharSequenc = PatchProxy.applyFourRefs(p0, q, s, t, a, i.class, "1");
             if (uCharSequenc != PatchProxyResult.class) {
             }else {
                a.p(s, "profileCardService");
                a.p(t, "liveGiftInfoService");
                if (p0 != null) {
                   if (p0 instanceof b) {
                      p0 = new k(s).h(p0);
                   }else if(p0 instanceof LiveStreamMessages$LikeFeed){
                      p0 = new j(s).h(p0);
                   }else if(p0 instanceof LiveStreamMessages$ShareFeed){
                      p0 = new m(s).h(p0);
                   }else if(p0 instanceof LiveStreamMessages$EnterRoomFeed){
                      p0 = new b(s).h(p0);
                   }else if(p0 instanceof FansGroupJoinFeed){
                      p0 = new c(s).h(p0);
                   }else if(p0 instanceof LiveStreamMessages$FollowAuthorFeed){
                      p0 = new d(q, s).h(p0);
                   }else if(p0 instanceof LiveStreamMessages$PurchaseInfoFeed){
                      p0 = new l(s).h(p0);
                   }else if(p0 instanceof LiveWatchingListChangeNoticeFeed){
                      p0 = new a(s).h(p0);
                   }else if(p0 instanceof LiveStreamMessages$GrabRedPackFeed){
                      p0 = new f(s).i(p0);
                   }else if(p0 instanceof LiveStreamMessages$DisplayGiftFeed){
                      p0 = new e(s, t).h(p0);
                   }
                   uCharSequenc = p0;
                }
                uCharSequenc = objArray;
             }
             i = 0;
             if (uCharSequenc == null) {
                if (!PatchProxy.applyVoid(objArray, tb, liveLiteInte, "12")) {
                   b.Z(LiveLiteLogTag.INTERACTIVE_MESSAGE, "InteractiveMessageViewController disappearWithAnimation");
                   tb.Y2(i, objArray);
                }
             }else {
                String str = "lastMessageView";
                if (!PatchProxy.applyVoid(objArray, tb, liveLiteInte, "8") && tb.n == null) {
                   EmojiTextView[] uEmojiTextVi = new EmojiTextView[2];
                   m2 = tb.m;
                   if (m2 == null) {
                      a.S("currentMessageView");
                   }
                   uEmojiTextVi[i] = m2;
                   m2 = tb.l;
                   if (m2 == null) {
                      a.S(str);
                   }
                   uEmojiTextVi[1] = m2;
                   Iterator iterator = CollectionsKt__CollectionsKt.L(uEmojiTextVi).iterator();
                   while (iterator.hasNext()) {
                      iterator.next().setSingleLine();
                   }
                   tb.n = true;
                }
                LiveLiteInteractiveMessageViewController k = tb.k;
                if (k == null) {
                   a.S("container");
                }
                if (!k.getHeight()) {
                   k = tb.m;
                   if (k == null) {
                      a.S("currentMessageView");
                   }
                   k.setText(uCharSequenc);
                   if (!PatchProxy.applyVoid(objArray, tb, liveLiteInte, "11")) {
                      b.Z(LiveLiteLogTag.INTERACTIVE_MESSAGE, "InteractiveMessageViewController appearWithAnimation");
                      liveLiteInte = tb.m;
                      if (liveLiteInte == null) {
                         a.S("currentMessageView");
                      }
                      liveLiteInte.setVisibility(i);
                      i = tb.m;
                      if (i == null) {
                         a.S("currentMessageView");
                      }
                      tb.Y2(tb.X2(i), new LiveLiteInteractiveMessageViewController$appearWithAnimation$1(tb));
                   }
                }else if(PatchProxy.applyVoid(objArray, tb, liveLiteInte, "10")){
                   k = tb.l;
                   if (k == null) {
                      a.S(str);
                   }
                   m2 = tb.m;
                   if (m2 == null) {
                      a.S("currentMessageView");
                   }
                   tb.l = m2;
                   tb.m = k;
                }
                k = tb.m;
                if (k == null) {
                   a.S("currentMessageView");
                }
                k.setText(uCharSequenc);
                if (!PatchProxy.applyVoid(objArray, tb, liveLiteInte, "9")) {
                   liveLiteInte = tb.l;
                   if (liveLiteInte == null) {
                      a.S(str);
                   }
                   ViewPropertyAnimator viewProperty = liveLiteInte.animate();
                   viewProperty.cancel();
                   viewProperty.alpha(0).setDuration(300).setListener(new e(tb)).start();
                   liveLiteInte = tb.m;
                   if (liveLiteInte == null) {
                      a.S("currentMessageView");
                   }
                   liveLiteInte.setVisibility(i);
                   i = tb.m;
                   if (i == null) {
                      a.S("currentMessageView");
                   }
                   i = tb.X2(i);
                   liveLiteInte = tb.m;
                   if (liveLiteInte == null) {
                      a.S("currentMessageView");
                   }
                   viewProperty = liveLiteInte.animate();
                   a.o(viewProperty, "currentMessageView.animate\(\)");
                   viewProperty.cancel();
                   LiveLiteInteractiveMessageViewController m = tb.m;
                   if (m == null) {
                      a.S("currentMessageView");
                   }
                   m.setAlpha(0);
                   LiveLiteInteractiveMessageViewController m1 = tb.m;
                   if (m1 == null) {
                      a.S("currentMessageView");
                   }
                   m1.setTranslationY((float)i);
                   viewProperty.alpha(0x3f800000).translationY(0).setDuration(300).start();
                }
             }
          }
       }
       return;
    }
}
