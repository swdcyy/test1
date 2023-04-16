package c82.b;
import java.lang.Object;
import java.util.List;
import java.util.Collections;
import java.lang.String;
import java.util.Arrays;
import java.util.Map;
import android.net.Uri;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.net.Uri$Builder;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.Collection;
import ekd.q;
import ekd.x0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Boolean;
import java.lang.Iterable;
import qk.m;
import c82.a;
import ok.o;
import com.google.common.collect.ImmutableList;
import android.app.Activity;
import com.kwai.gifshow.post.api.core.plugin.RecordPostPlugin;
import lnc.x6;
import lnc.y6;
import d61.g;
import qm6.b$a;
import android.content.Context;
import java.util.ArrayList;
import java.lang.Integer;
import qm6.b;

public class b	// class@0004eb
{
    public static final List a;
    public static final List b;

    static {
       b.a = Collections.singletonList("kwailive");
       String[] stringArray = new String[]{"startpush"};
       b.b = Arrays.asList(stringArray);
    }
    public void b(){
       super();
    }
    public static Uri a(Map p0,List p1){
       Iterator iterator;
       Uri$Builder obj = PatchProxy.applyTwoRefs(p0, p1, null, b.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = Uri.parse("kwai://post?tab=live&live_on=true").buildUpon();
       if (p0 != null) {
          iterator = p0.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             String key = uEntry.getKey();
             obj.appendQueryParameter(key, uEntry.getValue());
          }
       }
       if (!q.f(p1)) {
          iterator = p1.iterator();
          while (iterator.hasNext()) {
             obj.appendQueryParameter("innerjumpurls[]", iterator.next());
          }
       }
       return obj.build();
    }
    public static String b(Uri p0){
       String obj = PatchProxy.applyOneRefs(p0, null, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = x0.a(p0, "livesource");
       if (TextUtils.x(obj)) {
          obj = x0.a(p0, "entry_source");
       }
       return obj;
    }
    public static String c(Uri p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return x0.a(p0, "sourcelivetype");
    }
    public static boolean d(String p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = (!TextUtils.x(p0) && b.b.contains(Uri.parse(p0).getHost()))? true: false;
       return b;
    }
    public static List e(Uri p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       List list = x0.d(p0, "innerjumpurls[]");
       if (q.f(list)) {
          return null;
       }
       return m.s(list).p(a.b).B();
    }
    public static void f(Activity p0,Map p1,List p2){
       if (PatchProxy.applyVoidThreeRefs(p0, null, null, null, b.class, "8")) {
          return;
       }
       RecordPostPlugin recordPostPl = y6.r(RecordPostPlugin.class);
       if (recordPostPl == null) {
          return;
       }
       if (g.h(p0)) {
          return;
       }
       Uri uri = b.a(null, null);
       if (uri == null) {
          return;
       }
       b$a uoa = new b$a(p0, 0).B(uri);
       uoa.v(new ArrayList(Collections.singletonList(Integer.valueOf(2))));
       recordPostPl.Um(p0, uoa.f());
       return;
    }
}
