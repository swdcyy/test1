package com.kuaishou.live.lite.comment.view.item.SimpleCommentMessageViewController;
import ba3.a;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.lite.comment.view.ItemViewControllerFactory$a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.graphics.Color;
import lnc.a1;
import com.kuaishou.live.lite.comment.view.item.SimpleCommentMessageViewController$viewModel$2;
import com.kuaishou.live.lite.comment.view.item.SimpleCommentMessageViewController$$special$$inlined$viewModels$1;
import com.kuaishou.live.viewcontroller.ViewController;
import androidx.lifecycle.ViewModelLazy;
import ba3.i;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.lite.comment.view.item.SimpleCommentMessageViewController$$special$$inlined$viewModels$2;
import msd.a;
import com.yxcorp.gifshow.widget.EmojiTextView;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import android.view.View;
import ha1.a;
import ba3.e;
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
import ba3.d;
import ck5.r;
import com.kuaishou.live.lite.comment.view.item.SimpleCommentMessageViewController$a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.kuaishou.live.lite.comment.view.item.SimpleCommentMessageViewController$b;
import com.kuaishou.live.mvvm.viewmodel.state.LiveEvent;
import com.kuaishou.live.lite.comment.view.item.SimpleCommentMessageViewController$c;
import com.kuaishou.live.lite.gesture.LiveLiteGestureService;
import com.kuaishou.live.lite.comment.view.item.SimpleCommentMessageViewController$setupGestureDetector$disposable$1;
import msd.l;
import crd.b;
import com.kuaishou.live.lite.comment.view.item.SimpleCommentMessageViewController$setupGestureDetector$1;
import u63.a;
import android.app.Dialog;
import d61.j0;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnPreDrawListener;
import com.kwai.robust.PatchProxyResult;
import qrd.p;

public final class SimpleCommentMessageViewController extends a	// class@000828
{
    public final String m;
    public EmojiTextView n;
    public final int o;
    public final int p;
    public final int q;
    public final p r;
    public Dialog s;
    public ViewTreeObserver$OnPreDrawListener t;

    public void SimpleCommentMessageViewController(LiveData p0,LiveData p1,ItemViewControllerFactory$a p2){
       a.p(p0, "position");
       a.p(p1, "commentMessageLiveData");
       a.p(p2, "dependence");
       super(p0, p2);
       this.m = "SimpleCommentMessageViewController";
       this.o = Color.parseColor("#26000000");
       this.p = Color.parseColor("#29000000");
       this.q = a1.d(0x7f07080e);
       this.r = new ViewModelLazy(m0.d(i.class), new SimpleCommentMessageViewController$$special$$inlined$viewModels$2(new SimpleCommentMessageViewController$$special$$inlined$viewModels$1(this)), new SimpleCommentMessageViewController$viewModel$2(this, p1, p2));
    }
    public static final EmojiTextView Y2(SimpleCommentMessageViewController p0){
       p0 = p0.n;
       if (p0 == null) {
          a.S("commentText");
       }
       return p0;
    }
    public void F2(){
       SimpleCommentMessageViewController simpleCommen = SimpleCommentMessageViewController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, simpleCommen, "2")) {
          return;
       }
       this.R2(a.a(this, this.D2(), R.layout.live_lite_comment_item_simple_message_layout));
       if (!PatchProxy.applyVoid(objArray, this, simpleCommen, "10")) {
          View view = this.P2();
          c0 uoc0 = c0.a(view, new e(view, this));
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
       SimpleCommentMessageViewController tn = this.n;
       if (tn == null) {
          a.S(str);
       }
       tn.setMovementMethod(LinkMovementMethod.getInstance());
       if (!PatchProxy.applyVoid(objArray, this, simpleCommen, "9")) {
          tn = this.n;
          if (tn == null) {
             a.S(str);
          }
          SimpleCommentMessageViewController tn2 = this.n;
          if (tn2 == null) {
             a.S(str);
          }
          tn.setKSTextDisplayHandler(new a1(tn2));
          j oj = j.o();
          a.o(oj, "KwaiEmotionManager.getInstance\(\)");
          if (!oj.t()) {
             b.Z(LiveLogTag.LIVE_LITE_COMMENT, this.m+" setupEmojiSupport registerEmotionInitListener");
             j.o().A(new d(this));
          }
       }
       this.Z2().u0().observe(this, new SimpleCommentMessageViewController$a(this));
       this.Z2().d.observe(this, new SimpleCommentMessageViewController$b(this));
       this.Z2().c.observe(this, new SimpleCommentMessageViewController$c(this));
       if (!PatchProxy.applyVoid(objArray, this, simpleCommen, "4")) {
          LiveLiteGestureService liveLiteGest = this.V2().c();
          SimpleCommentMessageViewController tn1 = this.n;
          if (tn1 == null) {
             a.S(str);
          }
          a.a(this, new SimpleCommentMessageViewController$setupGestureDetector$1(liveLiteGest.b(tn1, true, new SimpleCommentMessageViewController$setupGestureDetector$disposable$1(this))));
       }
       return;
    }
    public void J2(){
       SimpleCommentMessageViewController simpleCommen = SimpleCommentMessageViewController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, simpleCommen, "3")) {
          return;
       }
       j0.f(this.s);
       if (!PatchProxy.applyVoid(objArray, this, simpleCommen, "11")) {
          ViewTreeObserver viewTreeObse = this.P2().getViewTreeObserver();
          if (viewTreeObse != null && viewTreeObse.isAlive()) {
             SimpleCommentMessageViewController tt = this.t;
             if (tt == null) {
                a.S("preDrawListener");
             }
             viewTreeObse.removeOnPreDrawListener(tt);
          }
       }
       return;
    }
    public final i Z2(){
       Object obj = PatchProxy.apply(null, this, SimpleCommentMessageViewController.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.r.getValue();
    }
}
