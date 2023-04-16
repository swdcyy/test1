package com.kuaishou.live.common.core.component.hotspot.detail.topnavigator.TopNavigatorTitleLogic$a;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.hotspot.detail.topnavigator.TopNavigatorTitleLogic;
import java.lang.Object;
import ln1.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import android.view.View;
import java.lang.Integer;
import androidx.lifecycle.MutableLiveData;
import java.lang.Runnable;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.common.core.component.hotspot.detail.model.LiveHotSpotDetailTopNavigatorModel;
import android.text.TextPaint;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import java.lang.Math;

public final class TopNavigatorTitleLogic$a implements Observer	// class@001414
{
    public final TopNavigatorTitleLogic b;

    public void TopNavigatorTitleLogic$a(TopNavigatorTitleLogic p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TopNavigatorTitleLogic$a.class, "1")) {
       }else {
          TopNavigatorTitleLogic$a tb = this.b;
          a.o(p0, "it");
          Objects.requireNonNull(tb);
          TopNavigatorTitleLogic topNavigator = TopNavigatorTitleLogic.class;
          if (!PatchProxy.applyVoidOneRefs(p0, tb, topNavigator, "2")) {
             Object[] objArray = null;
             int i = 0;
             if (p0.a() - (float)-1 <= 0) {
                p0 = tb.g;
                if (p0 != null) {
                   p0.setValue(Integer.valueOf(tb.c.getHeight()));
                }
                tb.c.setVisibility(i);
                float f = 0x3f800000;
                if (tb.c.getAlpha() - f < 0) {
                   tb.c.setAlpha(f);
                   if (!PatchProxy.applyVoid(objArray, tb, topNavigator, "3")) {
                      tb.d.removeCallbacks(tb.a());
                      p0 = tb.e.getValue();
                      if (p0 != null) {
                         p0 = p0.title;
                         if (p0 != null) {
                            ViewGroup$LayoutParams layoutParams = tb.d.getLayoutParams();
                            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                            if ((float)((tb.c.getWidth() - layoutParams.leftMargin) - layoutParams.rightMargin) - tb.d.getPaint().measureText(p0) < 0) {
                               topNavigator = 20;
                               LiveHotSpotDetailTopNavigatorModel liveHotSpotD = p0;
                               for (; i <= topNavigator; i = i + 1) {
                                  liveHotSpotD = liveHotSpotD+"          "+p0;
                               }
                               tb.d.setText(liveHotSpotD);
                               tb.d.postDelayed(tb.a(), 2000);
                            }else {
                               tb.d.setText(p0);
                            }
                         }
                      }
                   }
                }
             }else if(p0.a() - (float)i >= 0){
                p0 = tb.g;
                if (p0 != null) {
                   p0.setValue(Integer.valueOf(i));
                }
                tb.c.setVisibility(8);
                tb.c.setAlpha(0);
                tb.b();
                p0 = tb.d;
                LiveHotSpotDetailTopNavigatorModel value = tb.e.getValue();
                if (value != null) {
                   objArray = value.title;
                }
                p0.setText(objArray);
             }else {
                tb.c.setVisibility(i);
                tb.c.setAlpha(Math.abs(p0.a()));
             }
          }
       }
       return;
    }
}
