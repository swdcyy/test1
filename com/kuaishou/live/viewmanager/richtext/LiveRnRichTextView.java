package com.kuaishou.live.viewmanager.richtext.LiveRnRichTextView;
import com.facebook.react.views.text.ReactTextView;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.viewmanager.richtext.LiveRnRichTextView$a;
import android.text.Spannable$Factory;
import android.widget.TextView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import androidx.appcompat.widget.AppCompatTextView;
import bc.b;
import android.view.View;

public final class LiveRnRichTextView extends ReactTextView	// class@000ff8
{

    public void LiveRnRichTextView(Context p0){
       a.p(p0, "context");
       super(p0);
       this.setSpannableFactory(new LiveRnRichTextView$a());
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, LiveRnRichTextView.class, "1")) {
          return;
       }
       super.onAttachedToWindow();
       this.r();
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, LiveRnRichTextView.class, "4")) {
          return;
       }
       super.onDetachedFromWindow();
       this.s();
       return;
    }
    public void onFinishTemporaryDetach(){
       if (PatchProxy.applyVoid(null, this, LiveRnRichTextView.class, "2")) {
          return;
       }
       super.onFinishTemporaryDetach();
       this.r();
       return;
    }
    public void onStartTemporaryDetach(){
       if (PatchProxy.applyVoid(null, this, LiveRnRichTextView.class, "5")) {
          return;
       }
       super.onStartTemporaryDetach();
       this.s();
       return;
    }
    public final void r(){
       if (PatchProxy.applyVoid(null, this, LiveRnRichTextView.class, "3")) {
          return;
       }
       CharSequence text = this.getText();
       if (text instanceof b) {
          text.b(this);
       }
       return;
    }
    public final void s(){
       if (PatchProxy.applyVoid(null, this, LiveRnRichTextView.class, "6")) {
          return;
       }
       CharSequence text = this.getText();
       if (text instanceof b) {
          text.a(this);
       }
       return;
    }
}
