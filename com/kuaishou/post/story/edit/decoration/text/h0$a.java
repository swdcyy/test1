package com.kuaishou.post.story.edit.decoration.text.h0$a;
import android.text.TextWatcher;
import com.kuaishou.post.story.edit.decoration.text.h0;
import java.lang.Object;
import android.text.Editable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.post.story.edit.model.StoryTextDrawer;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.widget.TextView;
import com.kuaishou.post.story.widget.StoryHollowTextView;
import lnc.a1;
import java.lang.Integer;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.bubble.PostBubbleManager;
import com.yxcorp.gifshow.bubble.a;
import java.util.Objects;
import android.widget.EditText;
import android.view.ViewParent;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;

public class h0$a implements TextWatcher	// class@000afc
{
    public final h0 b;

    public void h0$a(h0 p0){
       this.b = p0;
       super();
    }
    public void afterTextChanged(Editable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h0$a.class, "3")) {
          return;
       }
       h0$a tb = this.b;
       if (tb.u == null) {
          tb.q.setEnabled((TextUtils.isEmpty(tb.r.mText) ^ 0x01));
          tb = this.b;
          h0 q = tb.q;
          if (q instanceof StoryHollowTextView) {
             if (TextUtils.isEmpty(tb.r.mText)) {
                this.b.q.setHollowBackgroundColor(a1.a(R.color.arg_RES_7f061c3b));
             }else {
                this.b.q.setHollowBackgroundColor(a1.a(R.color.arg_RES_7f061c32));
             }
          }else if(q.isEnabled()){
             this.b.q.setAlpha(0x3f800000);
          }else {
             this.b.q.setAlpha(0x3f000000);
          }
       }
       return;
    }
    public void beforeTextChanged(CharSequence p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(h0$a.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, h0$a.class, "1")) {
          return;
       }
       PostBubbleManager postBubbleMa = PostBubbleManager.d(this.b.s);
       if (postBubbleMa.h() == null) {
          return;
       }
       postBubbleMa.c();
       return;
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(h0$a.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, h0$a.class, "2")) {
          return;
       }
       h0$a tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, h0.class, "5")) {
          if (tb.r.getCustomMaxLine() >= 0) {
             p1 = tb.r.getCustomMaxLine();
             tb.v = p1;
             if (p1 > 0) {
                tb.p.setMaxLines(p1);
             }
          }else if(tb.v > null || tb.p.getLineHeight() <= 0){
             p1 = tb.p.getParent().getHeight();
             if (p1) {
                ViewGroup$MarginLayoutParams layoutParams = tb.p.getLayoutParams();
                p1 = (((p1 - layoutParams.topMargin) - layoutParams.bottomMargin) - tb.p.getPaddingTop()) - tb.p.getPaddingBottom();
                if (p1 > 0) {
                   p1 = p1 / tb.p.getLineHeight();
                   tb.v = p1;
                   if (p1 > 0) {
                      tb.p.setMaxLines(p1);
                   }
                }
             }
          }
       }
       return;
    }
}
