package com.yxcorp.gifshow.magic.ui.magicemoji.MagicEmojiFragment$a;
import android.view.ViewTreeObserver$OnPreDrawListener;
import com.yxcorp.gifshow.magic.ui.magicemoji.MagicEmojiFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import s5b.b;
import q87.c;
import android.widget.LinearLayout;
import com.kwai.feature.post.api.widget.SmoothSlidingTabStrip;
import android.view.View;
import java.lang.StringBuilder;
import android.view.ViewTreeObserver;
import android.widget.HorizontalScrollView;

public class MagicEmojiFragment$a implements ViewTreeObserver$OnPreDrawListener	// class@001ba3
{
    public final MagicEmojiFragment b;

    public void MagicEmojiFragment$a(MagicEmojiFragment p0){
       this.b = p0;
       super();
    }
    public boolean onPreDraw(){
       MagicEmojiFragment$a obj = PatchProxy.apply(null, this, MagicEmojiFragment$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       Object[] objArray = new Object[i];
       b.D().s("MagicEmojiFragment", "onPreDraw", objArray);
       obj = this.b;
       MagicEmojiFragment e1 = obj.e1;
       if (obj.b1.getTabsContainer().getChildAt(e1) != null && this.b.b1.getTabsContainer().getChildAt(e1).getWidth() > 0) {
          Object[] objArray1 = new Object[i];
          b.D().s("MagicEmojiFragment", "onPreDraw scrollToChild :"+e1, objArray1);
          this.b.b1.o(e1, 0);
          this.b.b1.getViewTreeObserver().removeOnPreDrawListener(this.b.k1);
       }
       return true;
    }
}
