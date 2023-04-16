package g93.j$a;
import android.text.style.MetricAffectingSpan;
import g93.j$a$a;
import nsd.u;
import lnc.a1;
import com.kuaishou.live.core.show.benefitcard.model.LiveSimpleRichTextStyle;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.graphics.Typeface;
import cp3.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kotlin.Result;
import android.graphics.Color;
import java.lang.Throwable;
import qrd.j0;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.text.TextPaint;

public final class j$a extends MetricAffectingSpan	// class@002ae2
{
    public final Typeface b;
    public final int c;
    public final int d;
    public final int e;
    public final boolean f;
    public static final int g;
    public static final int h;
    public static final j$a$a i;

    static {
       j$a.i = new j$a$a(null);
       j$a.g = a1.e(0x3f800000);
       j$a.h = a1.e(0x3f800000);
    }
    public void j$a(LiveSimpleRichTextStyle p0){
       a.p(p0, "style");
       super();
       Typeface typeface = c.b(p0.mFontFamily);
       a.o(typeface, "getTypeface\(style.mFontFamily\)");
       this.b = typeface;
       LiveSimpleRichTextStyle mColor = p0.mColor;
       a.o(mColor, "style.mColor");
       this.c = this.a(mColor, 0);
       mColor = p0.mShadowColor;
       a.o(mColor, "style.mShadowColor");
       this.d = this.a(mColor, 0);
       this.e = a1.e((float)p0.mFontSize);
       this.f = p0.mNeedStrikeThrough;
    }
    public final int a(String p0,int p1){
       Number obj;
       if (PatchProxy.isSupport(j$a.class)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, j$a.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       obj = Result.constructor-impl(Integer.valueOf(Color.parseColor(p0)));
       if (Result.exceptionOrNull-impl(obj) != null) {
          b.B(LiveLiteLogTag.BENEFIT_CARD, "color parse error: color is "+p0);
          obj = Integer.valueOf(p1);
       }
       return obj.intValue();
    }
    public void updateDrawState(TextPaint p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j$a.class, "1")) {
          return;
       }
       a.p(p0, "tp");
       p0.setTextSize((float)this.e);
       p0.setColor(this.c);
       if (this.f != null) {
          p0.setFlags(16);
       }
       j$a td = this.d;
       if (td != null) {
          p0.setShadowLayer((float)j$a.g, (float)0, (float)j$a.h, td);
       }
       p0.setTypeface(this.b);
       return;
    }
    public void updateMeasureState(TextPaint p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j$a.class, "2")) {
          return;
       }
       a.p(p0, "tp");
       p0.setTextSize((float)this.e);
       return;
    }
}
