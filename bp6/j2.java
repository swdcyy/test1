package bp6.j2;
import bp6.j2$a;
import java.lang.String;
import java.lang.Object;
import com.google.gson.Gson;
import java.util.HashMap;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.regex.Pattern;
import com.kwai.imsdk.internal.v;
import com.kwai.chat.sdk.signal.BizDispatcher;
import java.io.File;
import android.net.Uri;
import java.util.Map;
import java.lang.Boolean;
import com.kwai.imsdk.internal.config.ResourceRule;
import java.util.Collection;
import com.kwai.imsdk.internal.util.b;
import java.util.Iterator;
import java.util.List;
import ep6.a;
import wp6.a;
import android.graphics.Point;
import java.util.ArrayList;
import uo6.a;
import ep6.b;
import java.util.Locale;
import com.kwai.imsdk.internal.client.t;
import ih0.a$a;
import com.kwai.imsdk.internal.util.j;
import java.lang.StringBuilder;
import java.util.LinkedHashSet;
import java.util.Set;
import java.lang.Integer;
import java.util.Collections;
import com.kwai.imsdk.internal.config.ResourceConfig;
import java.lang.Class;
import java.lang.RuntimeException;
import java.lang.Throwable;
import l85.b;
import com.kwai.imsdk.internal.config.RulesData;

public class j2	// class@00052e
{
    public Context a;
    public int b;
    public ResourceRule c;
    public List d;
    public Map e;
    public Gson f;
    public boolean g;
    public SharedPreferences h;
    public Map i;
    public boolean j;
    public ResourceRule k;
    public final String l;
    public static String m;
    public static String n;
    public static String o;
    public static String p;
    public static final BizDispatcher q;

    static {
       j2.q = new j2$a();
    }
    public void j2(String p0){
       super();
       this.b = 0;
       this.f = new Gson();
       this.g = true;
       this.i = new HashMap();
       this.j = true;
       this.l = p0;
    }
    public static String f(){
       return j2.p;
    }
    public static String h(){
       String m = j2.m;
       m = (!TextUtils.isEmpty(m) && Pattern.matches("^\(\([a-zA-Z0-9]|[a-zA-Z0-9][a-zA-Z0-9\\-]*[a-zA-Z0-9]\)\\.\)*\([A-Za-z0-9]|[A-Za-z0-9][A-Za-z0-9\\-]*[A-Za-z0-9]\)$", m))? 1: null;
       if (m) {
          return j2.m;
       }else if(v.l().C()){
          m = "imcloud.test.gifshow.com";
       }else {
          m = "sixinpic.kuaishou.com";
       }
       return m;
    }
    public static String i(){
       if (!TextUtils.isEmpty(j2.o)) {
          return j2.o;
       }
       String str = (v.l().C())? "http": "https";
       return str;
    }
    public static j2 j(String p0){
       return j2.q.get(p0);
    }
    public static boolean t(String p0){
       boolean b = false;
       if (TextUtils.isEmpty(p0)) {
          return b;
       }
       if (!p0.startsWith("/") && (p0.startsWith(File.separator) || ("file").equalsIgnoreCase(Uri.parse(p0).getScheme()))) {
          b = true;
       }
       return b;
    }
    public final void a(String p0,boolean p1,Map p2){
       p0 = Uri.parse(p0).getHost();
       if (!TextUtils.isEmpty(p0)) {
          p2.put(p0, Boolean.valueOf(p1));
       }
       return;
    }
    public final void b(ResourceRule p0,Map p1){
       if (p0 == null) {
          return;
       }
       ResourceRule mNeedVerify = p0.mNeedVerify;
       this.a(p0.mUrl, mNeedVerify, p1);
       this.a(p0.mWebpUrl, mNeedVerify, p1);
       this.a(p0.mWebpScaleUrl, mNeedVerify, p1);
       if (!b.c(p0.mCdnUrlConfig)) {
          Iterator iterator = p0.mCdnUrlConfig.iterator();
          while (iterator.hasNext()) {
             a uoa = iterator.next();
             int i = uoa.mCdnNotNeedVerify ^ 0x01;
             this.a(uoa.mCdnUrl, i, p1);
             this.a(uoa.mCdnWebpUrl, i, p1);
             this.a(uoa.mCdnWebpScaleUrl, i, p1);
          }
       }
       return;
    }
    public final Map c(){
       Iterator iterator;
       HashMap hashMap = new HashMap();
       this.b(this.k, hashMap);
       this.b(this.c, hashMap);
       j2 td = this.d;
       if (td != null) {
          iterator = td.iterator();
          while (iterator.hasNext()) {
             this.b(iterator.next(), hashMap);
          }
       }
       td = this.e;
       if (td != null) {
          iterator = td.values().iterator();
          while (iterator.hasNext()) {
             List list = iterator.next();
             if (list == null) {
             }else {
                Iterator iterator1 = list.iterator();
                while (iterator1.hasNext()) {
                   this.b(iterator1.next(), hashMap);
                }
             }
          }
       }
       return hashMap;
    }
    public final List d(ResourceRule p0,a p1,Point p2,boolean p3,String p4){
       return p0.getCdnUrlInternal(p1, p2, p3, p4);
    }
    public final List e(a p0,Point p1,boolean p2){
       j2 tc = this.c;
       if (tc != null) {
          return this.d(tc, p0, p1, p2, this.l);
       }
       return new ArrayList();
    }
    public final String g(a p0,Point p1,boolean p2){
       j2 tc = this.c;
       if (tc == null) {
          tc = this.k;
       }
       return b.a(tc, p0, p1, p2, this.l);
    }
    public List k(a p0){
       return this.q(p0, null, this.g);
    }
    public List l(a p0,Point p1,boolean p2){
       return this.q(p0, p1, p2);
    }
    public final String m(){
       Object[] objArray = new Object[]{this.l};
       return String.format(Locale.US, "%s_key_im_resource_config", objArray);
    }
    public String n(){
       return j.c(t.o(this.l).l().f).e(j2.i()+"://"+j2.h());
    }
    public String o(a p0,Point p1){
       return this.p(p0, p1, this.g);
    }
    public final String p(a p0,Point p1,boolean p2){
       j2 td = this.d;
       if (td != null) {
          Iterator iterator = td.iterator();
          while (iterator.hasNext()) {
             ResourceRule resourceRule = iterator.next();
             if (resourceRule.mType == p0.b()) {
                return b.a(resourceRule, p0, p1, p2, this.l);
             }
          }
       }
       return this.g(p0, p1, p2);
    }
    public final List q(a p0,Point p1,boolean p2){
       ResourceRule resourceRule;
       List list;
       List list1;
       ArrayList uArrayList1;
       Iterator iterator1;
       LinkedHashSet linkedHashSe = new LinkedHashSet();
       ArrayList uArrayList = new ArrayList();
       j2 td = this.d;
       if (td != null) {
          Iterator iterator = td.iterator();
          while (iterator.hasNext()) {
             resourceRule = iterator.next();
             if (resourceRule != null && resourceRule.mType == p0.b()) {
                uArrayList.addAll(resourceRule.getCdnUrlInternal(p0, p1, p2, this.l));
             }
          }
       }
       if (b.c(uArrayList)) {
          uArrayList = this.e(p0, p1, p2);
       }
       linkedHashSe.addAll(uArrayList);
       j2 te = this.e;
       if (te != null && te.containsKey(Integer.valueOf(p0.b()))) {
          list = this.e.get(Integer.valueOf(p0.b()));
          if (list == null || list.isEmpty()) {
             list1 = Collections.emptyList();
          }else {
             uArrayList1 = new ArrayList();
             iterator1 = list.iterator();
             while (iterator1.hasNext()) {
                Object obj = iterator1.next();
                if (obj != null && obj.mType == p0.b()) {
                   uArrayList1.addAll(this.d(obj, p0, p1, p2, this.l));
                }
             }
          }
       }else {
          list1 = Collections.emptyList();
       }
       linkedHashSe.addAll(list1);
       linkedHashSe.addAll(this.e(p0, p1, p2));
       linkedHashSe.add(this.p(p0, p1, p2));
       te = this.e;
       if (te != null && te.containsKey(Integer.valueOf(p0.b()))) {
          list = this.e.get(Integer.valueOf(p0.b()));
          if (list == null || list.isEmpty()) {
             list1 = Collections.emptyList();
          }else {
             uArrayList1 = new ArrayList();
             iterator1 = list.iterator();
             while (iterator1.hasNext()) {
                resourceRule = iterator1.next();
                if (resourceRule.mType != p0.b()) {
                   continue ;
                }
                uArrayList1.add(b.a(resourceRule, p0, p1, p2, this.l));
             }
          }
       }else {
          uArrayList1 = Collections.emptyList();
       }
       linkedHashSe.addAll(list1);
       linkedHashSe.add(this.g(p0, p1, p2));
       return new ArrayList(linkedHashSe);
    }
    public List r(a p0,Point p1){
       return this.q(p0, p1, this.g);
    }
    public final void s(){
       if (!TextUtils.isEmpty(j2.p)) {
          try{
             this.v(this.f.h(j2.p, ResourceConfig.class));
          }catch(com.google.gson.JsonSyntaxException e0){
             e0.printStackTrace();
          }
       }
    }
    public synchronized boolean u(String p0){
       boolean b = false;
       if (!TextUtils.isEmpty(p0)) {
          j2 ti = this.i;
          if (ti != null) {
             try{
                Boolean uBoolean = ti.get(p0);
                if (uBoolean != null) {
                   b = uBoolean.booleanValue();
                }
                return b;
             }catch(java.lang.Exception e3){
                b.g(e3);
                return b;
             }
          }
       }
       return b;
    }
    public final void v(ResourceConfig p0){
       if (p0 != null) {
          RulesData rulesData = this.f.h(p0.mData, RulesData.class);
          this.b = p0.version;
          this.c = rulesData.mDefaultRule;
          this.d = rulesData.mRules;
          this.e = rulesData.mBackupRules;
       }
       return;
    }
}
