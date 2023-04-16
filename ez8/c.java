package ez8.c;
import java.lang.Runnable;
import ez8.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import kotlin.jvm.internal.a;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout;
import android.view.View;
import android.widget.TextView;
import android.text.TextPaint;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HeaderData;
import com.yxcorp.gifshow.entity.QPhoto;
import tw.j;
import android.app.Application;
import o56.a;
import usd.q;

public final class c implements Runnable	// class@00226e
{
    public final a b;

    public void c(a p0){
       this.b = p0;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c.class, "1")) {
          return;
       }
       c tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, a.class, "8")) {
          a t = tb.t;
          if (t == null) {
             a.S("mActionbarView");
          }
          ViewGroup$LayoutParams layoutParams = t.getLayoutParams();
          if (layoutParams != null) {
             a t1 = tb.t;
             if (t1 == null) {
                a.S("mActionbarView");
             }
             TextView textView = t1.findViewById(R.id.ad_download_text);
             if (textView != null) {
                TextPaint paint = textView.getPaint();
                a.o(paint, "titleTextView.paint");
                paint.setFakeBoldText(true);
                paint = textView.getPaint();
                a q = tb.q;
                if (q == null) {
                   a.S("mHeaderData");
                }
                int i = (int)paint.measureText(q.mButtonText);
                q = tb.p;
                if (q == null) {
                   a.S("mPhoto");
                }
                if (j.D(q)) {
                   i = q.n(i, (int)textView.getPaint().measureText(a.b().getString(R.string.arg_RES_7f10081a)));
                }
                layoutParams.width = (i + textView.getPaddingLeft()) + textView.getPaddingRight();
                a t2 = tb.t;
                if (t2 == null) {
                   a.S("mActionbarView");
                }
                t2.setLayoutParams(layoutParams);
             }
          }
       }
    label_009c :
       return;
    }
}
