package com.kuaishou.live.common.core.component.gift.domain.giftdiy.viewswitcher.LiveViewSwitcher$a;
import android.widget.ViewSwitcher$ViewFactory;
import com.kuaishou.live.common.core.component.gift.domain.giftdiy.viewswitcher.LiveViewSwitcher;
import android.content.Context;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.widget.LinearLayout;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.widget.TextView;
import java.lang.CharSequence;
import lnc.a1;
import kotlin.jvm.internal.a;
import androidx.core.content.ContextCompat;
import android.view.ViewGroup$MarginLayoutParams;

public final class LiveViewSwitcher$a implements ViewSwitcher$ViewFactory	// class@001249
{
    public final LiveViewSwitcher a;
    public final Context b;

    public void LiveViewSwitcher$a(LiveViewSwitcher p0,Context p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final View makeView(){
       LinearLayout obj = PatchProxy.apply(null, this, LiveViewSwitcher$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LinearLayout(this.b);
       obj.setGravity(16);
       obj.setLayoutParams(new FrameLayout$LayoutParams(-1, -1));
       TextView textView = new TextView(this.b);
       textView.setSingleLine();
       textView.setText("test1");
       textView.setTextSize(this.a.f);
       textView.setTag(this.a.e);
       textView.setCompoundDrawablePadding(a1.d(R.dimen.arg_RES_7f070334));
       LiveViewSwitcher$a tb = this.b;
       a.m(tb);
       textView.setTextColor(ContextCompat.getColor(tb, R.color.arg_RES_7f061a88));
       ViewGroup$MarginLayoutParams marginLayout = new ViewGroup$MarginLayoutParams(-1, -2);
       marginLayout.leftMargin = a1.d(0x7f07031b);
       obj.addView(textView, marginLayout);
       return obj;
    }
}
