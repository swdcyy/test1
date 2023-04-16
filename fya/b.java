package fya.b;
import java.lang.String;
import java.util.regex.Pattern;
import java.lang.Object;
import java.util.HashMap;
import java.util.ArrayList;
import iya.e;
import java.util.regex.Matcher;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.model.mix.CashTag$Icon;
import iya.f;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kuaishou.android.model.mix.CashTag;
import iya.a;
import lnc.a1;
import java.util.List;
import java.util.Iterator;
import fya.b$a;
import java.util.Collection;
import java.lang.Number;
import android.graphics.Color;

public class b	// class@002a57
{
    public Map a;
    public e b;
    public List c;
    public int d;
    public int e;
    public int f;
    public int g;
    public b$b h;
    public List i;
    public e j;
    public static Pattern k;

    static {
       b.k = Pattern.compile("\\$\([^\\$]+\)\\$");
    }
    public void b(){
       super();
       this.a = new HashMap();
       this.c = new ArrayList();
       this.d = -1;
       this.e = -1;
       this.f = -1;
       this.g = -1;
       this.i = new ArrayList();
       this.j = new e();
       this.d = 0x7f010109;
       this.e = 0x7f0100e5;
       this.f = 0x7f0100e5;
       this.g = 0x7f010112;
    }
    public static String c(Matcher p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.group(1);
    }
    public final f a(CashTag$Icon p0){
       CashTag$Icon obj = PatchProxy.applyOneRefs(p0, this, b.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       obj = p0.mCdnUrls;
       if (obj == null || !obj.length) {
          return new f(p0.mAspectRatio, p0.mTxtHeightRatio, p0.mUrl.getUrl());
       }
       return new f(p0.mAspectRatio, p0.mTxtHeightRatio, obj);
    }
    public final a b(CashTag p0){
       a obj = PatchProxy.applyOneRefs(p0, this, b.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new a(p0.mShowText, this.e(p0.mTextColor), this.a(p0.mPrefix), this.a(p0.mSuffix));
       obj.g = this.e(p0.mBackground);
       obj.j = a1.e(p0.mPaddingLeft);
       obj.k = a1.e(p0.mPaddingRight);
       return obj;
    }
    public final List d(){
       ArrayList obj = PatchProxy.apply(null, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       Iterator iterator = this.c.iterator();
       while (iterator.hasNext()) {
          obj.addAll(iterator.next().b);
       }
       return obj;
    }
    public final int e(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Color.parseColor(p0);
    }
}
