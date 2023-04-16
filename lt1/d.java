package lt1.d;
import android.content.Context;
import android.widget.TextView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import lnc.a1;
import java.lang.CharSequence;
import com.yxcorp.plugin.live.widget.LiveNoShrinkTextView;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.widget.cdn.KwaiCDNImageView;
import android.util.AttributeSet;
import nsd.u;
import ub.a;
import android.widget.ImageView;
import android.graphics.Typeface;

public final class d	// class@003025
{

    public static final TextView a(Context p0,int p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, uod, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "context");
       String str = a1.p(p1);
       a.o(str, "CommonUtil.string\(stringRes\)");
       return d.e(p0, str, 0x7f0614b9);
    }
    public static final LiveNoShrinkTextView b(Context p0){
       LiveNoShrinkTextView obj = PatchProxy.applyOneRefs(p0, null, d.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "context");
       obj = new LiveNoShrinkTextView(p0);
       obj.setId(R.id.live_multi_pk_count_down_time);
       obj.setIncludeFontPadding(false);
       obj.setTextSize(1, 12.00f);
       obj.setTextColor(a1.a(R.color.arg_RES_7f0620c7));
       obj.setLayoutParams(new ViewGroup$LayoutParams(-2, -2));
       obj.setGravity(false);
       return obj;
    }
    public static final KwaiCDNImageView c(Context p0,int p1,int p2,int p3){
       KwaiCDNImageView obj;
       if (PatchProxy.isSupport(d.class)) {
          obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), null, d.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "context");
       obj = new KwaiCDNImageView(p0, null, 2, null);
       KwaiCDNImageView.q0(obj, p1, 0, null, 6, null);
       obj.setLayoutParams(new ViewGroup$LayoutParams(p2, p3));
       return obj;
    }
    public static final TextView d(Context p0,CharSequence p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "context");
       a.p(p1, "content");
       return d.e(p0, p1, 0x7f0620c7);
    }
    public static final TextView e(Context p0,CharSequence p1,int p2){
       TextView obj;
       if (PatchProxy.isSupport(d.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), null, d.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new TextView(p0);
       obj.setText(p1);
       obj.setTextSize(1, 11.00f);
       obj.setGravity(16);
       obj.setLayoutParams(new ViewGroup$LayoutParams(-2, -1));
       obj.setPadding(0, 0, 0, a1.e(0x3f800000));
       obj.setTypeface(Typeface.create("PingFangSC", 0));
       obj.setTextColor(a1.a(p2));
       return obj;
    }
}
