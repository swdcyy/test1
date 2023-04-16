package com.kwai.user.base.RichTextMetaExt$1;
import android.text.style.URLSpan;
import java.lang.String;
import ok.h;
import com.kwai.framework.model.user.RichTextMeta$Param;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.text.TextPaint;
import android.text.style.ClickableSpan;

public class RichTextMetaExt$1 extends URLSpan	// class@001971
{
    public final int b;
    public final h c;
    public final RichTextMeta$Param d;

    public void RichTextMetaExt$1(String p0,int p1,h p2,RichTextMeta$Param p3){
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super(p0);
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RichTextMetaExt$1.class, "2")) {
          return;
       }
       RichTextMetaExt$1 tc = this.c;
       if (tc != null) {
          tc.apply(this.d);
       }else {
          super.onClick(p0);
       }
       return;
    }
    public void updateDrawState(TextPaint p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RichTextMetaExt$1.class, "1")) {
          return;
       }
       super.updateDrawState(p0);
       p0.setUnderlineText(false);
       p0.setColor(this.b);
       return;
    }
}
