package com.kuaishou.live.lite.comment.view.item.gift.GiftSentMessageViewController$setupGestureDetector$disposable$1$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.comment.view.item.gift.GiftSentMessageViewController$setupGestureDetector$disposable$1;
import java.lang.Object;
import android.view.MotionEvent;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import android.widget.TextView;
import android.text.Spannable;
import android.text.style.ClickableSpan;
import java.util.Objects;
import android.text.Layout;
import kotlin.collections.ArraysKt___ArraysKt;
import android.view.View;

public final class GiftSentMessageViewController$setupGestureDetector$disposable$1$1 extends Lambda implements l	// class@00082e
{
    public final GiftSentMessageViewController$setupGestureDetector$disposable$1 this$0;

    public void GiftSentMessageViewController$setupGestureDetector$disposable$1$1(GiftSentMessageViewController$setupGestureDetector$disposable$1 p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(MotionEvent p0){
       ClickableSpan[] uClickableSp;
       GiftSentMessageViewController$setupGestureDetector$disposable$1 obj = PatchProxy.applyOneRefs(p0, this, GiftSentMessageViewController$setupGestureDetector$disposable$1$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "it");
       obj = this.this$0.$emojiTextView;
       int i = 0;
       if (!obj.getText() instanceof Spannable) {
          uClickableSp = new ClickableSpan[i];
       }else {
          CharSequence text = obj.getText();
          Objects.requireNonNull(text, "null cannot be cast to non-null type android.text.Spannable");
          float f = (p0.getX() - (float)obj.getTotalPaddingLeft()) + (float)obj.getScrollX();
          int lineForVerti = obj.getLayout().getLineForVertical((int)((p0.getY() - (float)obj.getTotalPaddingTop()) + (float)obj.getScrollY()));
          try{
             uClickableSp = text.getSpans(obj.getLayout().getOffsetForHorizontal(lineForVerti, f), obj.getLayout().getOffsetForHorizontal(lineForVerti, f), ClickableSpan.class);
          }catch(java.lang.ArrayIndexOutOfBoundsException e0){
             uClickableSp = new ClickableSpan[i];
          }
          if (uClickableSp == null) {
             uClickableSp = new ClickableSpan[i];
          }
       }
       if (!uClickableSp.length) {
          i = 1;
       }
       if (i ^ 0x01) {
          ArraysKt___ArraysKt.ob(uClickableSp).onClick(this.this$0.$emojiTextView);
       }
       return true;
    }
}