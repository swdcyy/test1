package com.kuaishou.live.common.core.component.hotspot.detail.hotspotnavigator.LiveHotSpotDetailBottomNavigatorTextSwitcher$a;
import android.widget.ViewSwitcher$ViewFactory;
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
import android.text.TextPaint;
import kotlin.jvm.internal.a;
import android.text.TextUtils$TruncateAt;
import androidx.core.content.ContextCompat;

public final class LiveHotSpotDetailBottomNavigatorTextSwitcher$a implements ViewSwitcher$ViewFactory	// class@0013ae
{
    public final Context a;

    public void LiveHotSpotDetailBottomNavigatorTextSwitcher$a(Context p0){
       this.a = p0;
       super();
    }
    public final View makeView(){
       LinearLayout obj = PatchProxy.apply(null, this, LiveHotSpotDetailBottomNavigatorTextSwitcher$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LinearLayout(this.a);
       obj.setGravity(16);
       obj.setLayoutParams(new FrameLayout$LayoutParams(-1, -1));
       TextView textView = new TextView(this.a);
       textView.setMaxEms(12);
       TextPaint paint = textView.getPaint();
       a.o(paint, "innerText.paint");
       paint.setFakeBoldText(true);
       textView.setSingleLine();
       textView.setEllipsize(TextUtils$TruncateAt.END);
       textView.setTag("innerText");
       textView.setTextColor(ContextCompat.getColor(this.a, R.color.arg_RES_7f0607de));
       obj.addView(textView);
       return obj;
    }
}
