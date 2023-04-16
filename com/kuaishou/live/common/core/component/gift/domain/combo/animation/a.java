package com.kuaishou.live.common.core.component.gift.domain.combo.animation.a;
import java.lang.Runnable;
import com.kuaishou.live.common.core.component.gift.domain.combo.animation.LiveGiftBoxComboTextAnimationView;
import java.lang.Object;
import android.widget.LinearLayout;
import android.widget.ImageView;
import ph1.d;
import ph1.c;
import com.kuaishou.live.common.core.component.gift.domain.combo.util.LiveGiftComboButtonAnimationUtils;
import java.util.Map;
import com.kuaishou.live.common.core.component.gift.domain.combo.util.LiveGiftComboButtonAnimationUtils$a;
import java.lang.Integer;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.String;
import com.yxcorp.gifshow.image.KwaiImageView;
import msd.l;
import com.kuaishou.live.common.core.basic.tools.l;

public final class a implements Runnable	// class@001179
{
    public final LiveGiftBoxComboTextAnimationView b;
    public final int c;

    public void a(LiveGiftBoxComboTextAnimationView p0,int p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       a tb = this.b;
       a tc = this.c;
       tb.setComboTextVisibility(8);
       tb.f.setTranslationX((- tb.getTranslationX()));
       d uod = new d(tb);
       c uoc = new c(tb, tc);
       LiveGiftComboButtonAnimationUtils$a h = LiveGiftComboButtonAnimationUtils.h;
       if (!TextUtils.x(h.c().get(Integer.valueOf(tc)))) {
          l.b(tb.f, h.a(h.c().get(Integer.valueOf(tc))), true, uoc, uod);
       }
       return;
    }
}
