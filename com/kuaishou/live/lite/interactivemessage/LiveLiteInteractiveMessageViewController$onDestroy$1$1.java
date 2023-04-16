package com.kuaishou.live.lite.interactivemessage.LiveLiteInteractiveMessageViewController$onDestroy$1$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.kuaishou.live.lite.interactivemessage.LiveLiteInteractiveMessageViewController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import android.view.View;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import android.view.ViewGroup;
import com.yxcorp.gifshow.widget.EmojiTextView;
import com.kuaishou.live.lite.gesture.LiveLiteGestureService;
import crd.b;
import com.kuaishou.live.lite.gesture.LiveLiteGestureService$DefaultImpls;
import android.view.ViewGroup$LayoutParams;
import com.kuaishou.live.lite.interactivemessage.LiveLiteInteractiveMessageViewController$onRootViewRecycled$2;

public final class LiveLiteInteractiveMessageViewController$onDestroy$1$1 extends FunctionReferenceImpl implements l	// class@0009c4
{

    public void LiveLiteInteractiveMessageViewController$onDestroy$1$1(LiveLiteInteractiveMessageViewController p0){
       super(1, p0, LiveLiteInteractiveMessageViewController.class, "onRootViewRecycled", "onRootViewRecycled\(Landroid/view/View;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteInteractiveMessageViewController$onDestroy$1$1.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, LiveLiteInteractiveMessageViewController.class, "5")) {
          View view = p0.findViewById(R.id.live_lite_interactive_message_container);
          EmojiTextView uEmojiTextVi = null;
          if (!view instanceof ViewGroup) {
             view = uEmojiTextVi;
          }
          View view1 = p0.findViewById(R.id.live_lite_interactive_message_first_text_view);
          if (!view1 instanceof EmojiTextView) {
             view1 = uEmojiTextVi;
          }
          p0 = p0.findViewById(R.id.live_lite_interactive_message_second_text_view);
          if (p0 instanceof EmojiTextView) {
             uEmojiTextVi = p0;
          }
          if (view != null) {
             LiveLiteGestureService$DefaultImpls.a(treceiver.r, view, false, null, 4, null);
             p0.height = 0;
          }
          LiveLiteInteractiveMessageViewController$onRootViewRecycled$2 iNSTANCE = LiveLiteInteractiveMessageViewController$onRootViewRecycled$2.INSTANCE;
          if (view1 != null) {
             iNSTANCE.invoke(view1);
          }
          if (uEmojiTextVi != null) {
             iNSTANCE.invoke(uEmojiTextVi);
          }
       }
       return;
    }
}
