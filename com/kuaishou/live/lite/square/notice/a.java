package com.kuaishou.live.lite.square.notice.a;
import androidx.lifecycle.Observer;
import com.kuaishou.live.lite.square.notice.b;
import java.lang.Object;
import ld3.a;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import ld3.d;
import java.lang.Runnable;
import android.widget.LinearLayout;
import java.lang.StringBuilder;
import android.view.View;
import android.widget.TextView;
import kd3.k;
import android.graphics.Typeface;
import java.lang.CharSequence;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import lnc.a1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import ld3.e;
import ld3.f;
import android.view.View$OnClickListener;

public final class a implements Observer	// class@000b6d
{
    public final b b;

    public void a(b p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       a b;
       a tb = this.b;
       Objects.requireNonNull(tb);
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, tb, uob, "5")) {
       }else {
          LiveLiteLogTag sQUARE = LiveLiteLogTag.SQUARE;
          b.Z(sQUARE, "binding show feed notice");
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, tb, uob, "7")) {
             uob = tb.b;
             if (uob != null) {
                uob.post(new d(tb));
             }
          }
          if (tb.b != null) {
             b.Z(sQUARE, "view width:"+tb.b.getWidth());
             TextView textView = tb.b.findViewById(R.id.live_play_sidebar_square_notice_content);
             textView.setTypeface(k.a);
             b = p0.b;
             if (b != null) {
                textView.setText(b);
             }
             uob = tb.b;
             if (!PatchProxy.applyVoidOneRefs(uob, objArray, k.class, "1") && uob != null) {
                ViewGroup$MarginLayoutParams layoutParams = uob.getLayoutParams();
                layoutParams.height = a1.e(20.00f);
                uob.setLayoutParams(layoutParams);
             }
             KwaiImageView kwaiImageVie = tb.b.findViewById(R.id.live_play_sidebar_square_avatar_view);
             tb.c = kwaiImageVie;
             if (p0.a != null) {
                kwaiImageVie.setVisibility(0);
                tb.c.U(p0.a);
             }
             tb.c(tb.c);
             tb.b.setVisibility(4);
             tb.b.post(new e(tb, p0));
             tb.b.setOnClickListener(new f(tb));
          }
       }
       return;
    }
}
