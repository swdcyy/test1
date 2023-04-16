package com.kuaishou.live.common.core.basic.widget.ExpandEmojiTextView;
import com.yxcorp.gifshow.widget.EmojiTextView;
import android.content.Context;
import android.util.AttributeSet;
import android.content.res.Resources;
import android.widget.TextView;
import java.lang.String;
import ync.a;
import com.kuaishou.live.common.core.basic.widget.ExpandEmojiTextView$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.kuaishou.live.common.core.basic.widget.ExpandEmojiTextView$a;
import java.lang.Runnable;

public class ExpandEmojiTextView extends EmojiTextView	// class@000f08
{
    public String A;
    public int v;
    public String w;
    public boolean x;
    public ExpandEmojiTextView$b y;
    public String z;

    public void ExpandEmojiTextView(Context p0){
       super(p0, null);
    }
    public void ExpandEmojiTextView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void ExpandEmojiTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.w = "";
       this.x = true;
       this.z = this.getResources().getString(0x7f102d29);
       this.A = this.getResources().getString(0x7f102d28);
       this.v = a.c(p0);
    }
    public void setCollapseTip(String p0){
       this.A = p0;
    }
    public void setExpandTip(String p0){
       this.z = p0;
    }
    public void setLabelTextColor(int p0){
       this.v = p0;
    }
    public void setSpanClickListener(ExpandEmojiTextView$b p0){
       this.y = p0;
    }
    public void setSpanPrefix(String p0){
       this.w = p0;
    }
    public void setSpanTextBold(boolean p0){
       this.x = p0;
    }
    public void v(String p0,int p1){
       if (PatchProxy.isSupport(ExpandEmojiTextView.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, ExpandEmojiTextView.class, "1")) {
          return;
       }
       this.postDelayed(new ExpandEmojiTextView$a(this, p0, p1), 50);
       return;
    }
}
