package com.kuaishou.live.lite.comment.view.item.gift.GiftSentMessageViewController;
import ba3.a;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.lite.comment.view.ItemViewControllerFactory$a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.graphics.Color;
import lnc.a1;
import com.kuaishou.live.lite.comment.view.item.gift.GiftSentMessageViewController$viewModel$2;
import com.kuaishou.live.lite.comment.view.item.gift.GiftSentMessageViewController$$special$$inlined$viewModels$1;
import com.kuaishou.live.viewcontroller.ViewController;
import androidx.lifecycle.ViewModelLazy;
import ca3.c;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.lite.comment.view.item.gift.GiftSentMessageViewController$$special$$inlined$viewModels$2;
import msd.a;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import android.view.View;
import ha1.a;
import com.yxcorp.gifshow.widget.EmojiTextView;
import com.kwai.library.widget.textview.KwaiSizeAdjustableTextView;
import ea3.a;
import com.kuaishou.live.lite.gesture.LiveLiteGestureService;
import com.kuaishou.live.lite.comment.view.item.gift.GiftSentMessageViewController$setupGestureDetector$disposable$1;
import msd.l;
import crd.b;
import com.kuaishou.live.lite.comment.view.item.gift.GiftSentMessageViewController$setupGestureDetector$1;
import androidx.lifecycle.LifecycleOwner;
import u63.a;
import com.kuaishou.live.lite.comment.view.item.gift.GiftSentMessageViewController$a;
import androidx.lifecycle.Observer;
import com.kuaishou.live.lite.comment.view.item.gift.GiftSentMessageViewController$b;
import com.kuaishou.live.mvvm.viewmodel.state.LiveEvent;
import com.kwai.robust.PatchProxyResult;
import qrd.p;

public final class GiftSentMessageViewController extends a	// class@000834
{
    public final String m;
    public final int n;
    public final int o;
    public EmojiTextView p;
    public final p q;

    public void GiftSentMessageViewController(LiveData p0,LiveData p1,ItemViewControllerFactory$a p2){
       a.p(p0, "position");
       a.p(p1, "giftSentMessageLiveData");
       a.p(p2, "dependence");
       super(p0, p2);
       this.m = "GiftSentMessageViewController";
       this.n = Color.parseColor("#26000000");
       this.o = a1.d(0x7f07080e);
       this.q = new ViewModelLazy(m0.d(c.class), new GiftSentMessageViewController$$special$$inlined$viewModels$2(new GiftSentMessageViewController$$special$$inlined$viewModels$1(this)), new GiftSentMessageViewController$viewModel$2(p1));
    }
    public void F2(){
       GiftSentMessageViewController giftSentMess = GiftSentMessageViewController.class;
       if (PatchProxy.applyVoid(null, this, giftSentMess, "2")) {
          return;
       }
       this.R2(a.a(this, this.D2(), R.layout.live_lite_comment_item_gift_sent_message_layout));
       EmojiTextView uEmojiTextVi = this.A2(R.id.live_lite_comment_item_common_text_view);
       this.p = uEmojiTextVi;
       String str = "messageTextView";
       if (uEmojiTextVi == null) {
          a.S(str);
       }
       uEmojiTextVi.setTextSizeAdjustable(false);
       GiftSentMessageViewController tp = this.p;
       if (tp == null) {
          a.S(str);
       }
       a.a(tp);
       tp = this.p;
       if (tp == null) {
          a.S(str);
       }
       if (!PatchProxy.applyVoidOneRefs(tp, this, giftSentMess, "3")) {
          a.a(this, new GiftSentMessageViewController$setupGestureDetector$1(this.V2().c().b(tp, true, new GiftSentMessageViewController$setupGestureDetector$disposable$1(tp))));
       }
       this.Y2().b.observe(this, new GiftSentMessageViewController$a(this));
       this.Y2().c.observe(this, new GiftSentMessageViewController$b(this));
       return;
    }
    public final c Y2(){
       Object obj = PatchProxy.apply(null, this, GiftSentMessageViewController.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.q.getValue();
    }
}
