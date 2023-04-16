package com.kuaishou.live.lite.comment.view.item.reply.AuthorReplyMessageViewController;
import ba3.a;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.lite.comment.view.ItemViewControllerFactory$a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import lnc.a1;
import com.kuaishou.live.lite.comment.view.item.reply.AuthorReplyMessageViewController$viewModel$2;
import com.kuaishou.live.lite.comment.view.item.reply.AuthorReplyMessageViewController$$special$$inlined$viewModels$1;
import com.kuaishou.live.viewcontroller.ViewController;
import androidx.lifecycle.ViewModelLazy;
import da3.h;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.lite.comment.view.item.reply.AuthorReplyMessageViewController$$special$$inlined$viewModels$2;
import msd.a;
import com.yxcorp.gifshow.widget.EmojiTextView;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import android.view.View;
import ha1.a;
import da3.d;
import java.lang.Runnable;
import a2.c0;
import com.kwai.library.widget.textview.KwaiSizeAdjustableTextView;
import android.text.method.MovementMethod;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import tyc.a1;
import com.yxcorp.gifshow.widget.KSTextDisplayHandler;
import ak5.j;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import da3.c;
import ck5.r;
import com.kuaishou.live.lite.comment.view.item.reply.AuthorReplyMessageViewController$a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.kuaishou.live.lite.comment.view.item.reply.AuthorReplyMessageViewController$b;
import com.kuaishou.live.mvvm.viewmodel.state.LiveEvent;
import com.kuaishou.live.lite.comment.view.item.reply.AuthorReplyMessageViewController$c;
import com.kuaishou.live.lite.gesture.LiveLiteGestureService;
import com.kuaishou.live.lite.comment.view.item.reply.AuthorReplyMessageViewController$setupGestureDetector$disposable$1;
import msd.l;
import crd.b;
import com.kuaishou.live.lite.comment.view.item.reply.AuthorReplyMessageViewController$setupGestureDetector$1;
import u63.a;
import android.app.Dialog;
import d61.j0;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnPreDrawListener;
import com.kwai.robust.PatchProxyResult;
import qrd.p;

public final class AuthorReplyMessageViewController extends a	// class@000841
{
    public final String m;
    public EmojiTextView n;
    public final int o;
    public final int p;
    public final int q;
    public final p r;
    public Dialog s;
    public ViewTreeObserver$OnPreDrawListener t;

    public void AuthorReplyMessageViewController(LiveData p0,LiveData p1,ItemViewControllerFactory$a p2){
       a.p(p0, "position");
       a.p(p1, "commentMessageLiveData");
       a.p(p2, "dependence");
       super(p0, p2);
       this.m = "AuthorReplyMessageViewController";
       this.o = 0x7f061d67;
       this.p = 0x7f061d67;
       this.q = a1.d(0x7f07080e);
       this.r = new ViewModelLazy(m0.d(h.class), new AuthorReplyMessageViewController$$special$$inlined$viewModels$2(new AuthorReplyMessageViewController$$special$$inlined$viewModels$1(this)), new AuthorReplyMessageViewController$viewModel$2(this, p1, p2));
    }
    public static final EmojiTextView Y2(AuthorReplyMessageViewController p0){
       p0 = p0.n;
       if (p0 == null) {
          a.S("commentText");
       }
       return p0;
    }
    public void F2(){
       AuthorReplyMessageViewController uAuthorReply = AuthorReplyMessageViewController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uAuthorReply, "2")) {
          return;
       }
       this.R2(a.a(this, this.D2(), R.layout.live_lite_comment_item_simple_message_layout));
       if (!PatchProxy.applyVoid(objArray, this, uAuthorReply, "10")) {
          View view = this.P2();
          c0 uoc0 = c0.a(view, new d(view, this));
          a.o(uoc0, "OneShotPreDrawListener.add\(this\) { action\(this\) }");
          this.t = uoc0;
       }
       EmojiTextView uEmojiTextVi = this.A2(R.id.live_lite_comment_item_simple_message_text);
       this.n = uEmojiTextVi;
       String str = "commentText";
       if (uEmojiTextVi == null) {
          a.S(str);
       }
       uEmojiTextVi.setTextSizeAdjustable(false);
       AuthorReplyMessageViewController tn = this.n;
       if (tn == null) {
          a.S(str);
       }
       tn.setMovementMethod(LinkMovementMethod.getInstance());
       if (!PatchProxy.applyVoid(objArray, this, uAuthorReply, "9")) {
          tn = this.n;
          if (tn == null) {
             a.S(str);
          }
          AuthorReplyMessageViewController tn2 = this.n;
          if (tn2 == null) {
             a.S(str);
          }
          tn.setKSTextDisplayHandler(new a1(tn2));
          j oj = j.o();
          a.o(oj, "KwaiEmotionManager.getInstance\(\)");
          if (!oj.t()) {
             b.Z(LiveLogTag.LIVE_LITE_COMMENT, this.m+" setupEmojiSupport registerEmotionInitListener");
             j.o().A(new c(this));
          }
       }
       this.Z2().u0().observe(this, new AuthorReplyMessageViewController$a(this));
       this.Z2().d.observe(this, new AuthorReplyMessageViewController$b(this));
       this.Z2().c.observe(this, new AuthorReplyMessageViewController$c(this));
       if (!PatchProxy.applyVoid(objArray, this, uAuthorReply, "4")) {
          LiveLiteGestureService liveLiteGest = this.V2().c();
          AuthorReplyMessageViewController tn1 = this.n;
          if (tn1 == null) {
             a.S(str);
          }
          a.a(this, new AuthorReplyMessageViewController$setupGestureDetector$1(liveLiteGest.b(tn1, true, new AuthorReplyMessageViewController$setupGestureDetector$disposable$1(this))));
       }
       return;
    }
    public void J2(){
       AuthorReplyMessageViewController uAuthorReply = AuthorReplyMessageViewController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uAuthorReply, "3")) {
          return;
       }
       j0.f(this.s);
       if (!PatchProxy.applyVoid(objArray, this, uAuthorReply, "11")) {
          ViewTreeObserver viewTreeObse = this.P2().getViewTreeObserver();
          if (viewTreeObse != null && viewTreeObse.isAlive()) {
             AuthorReplyMessageViewController tt = this.t;
             if (tt == null) {
                a.S("preDrawListener");
             }
             viewTreeObse.removeOnPreDrawListener(tt);
          }
       }
       return;
    }
    public final h Z2(){
       Object obj = PatchProxy.apply(null, this, AuthorReplyMessageViewController.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.r.getValue();
    }
}
