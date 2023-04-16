package com.kuaishou.live.lite.interactivemessage.LiveLiteInteractiveMessageViewController$onRootViewRecycled$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.yxcorp.gifshow.widget.EmojiTextView;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import android.widget.TextView;
import android.view.ViewPropertyAnimator;
import android.animation.Animator$AnimatorListener;

public final class LiveLiteInteractiveMessageViewController$onRootViewRecycled$2 extends Lambda implements l	// class@0009c5
{
    public static final LiveLiteInteractiveMessageViewController$onRootViewRecycled$2 INSTANCE;

    static {
       LiveLiteInteractiveMessageViewController$onRootViewRecycled$2.INSTANCE = new LiveLiteInteractiveMessageViewController$onRootViewRecycled$2();
    }
    public void LiveLiteInteractiveMessageViewController$onRootViewRecycled$2(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(EmojiTextView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteInteractiveMessageViewController$onRootViewRecycled$2.class, "1")) {
          return;
       }
       a.p(p0, "messageView");
       p0.setText("");
       p0.setVisibility(8);
       p0.setAlpha(0x3f800000);
       p0.setTranslationY(0);
       p0.animate().setListener(null);
       return;
    }
}
