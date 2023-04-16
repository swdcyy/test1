package com.kwai.feature.post.api.thirdparty.d;
import java.util.HashSet;
import java.lang.String;
import java.lang.Object;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;
import com.kwai.feature.post.api.thirdparty.ThirdPartyShareUtils$ShareMediaType;
import java.util.HashMap;
import android.content.Intent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import java.util.ArrayList;
import com.kwai.feature.post.api.thirdparty.b;
import com.kwai.feature.post.api.thirdparty.c;
import p46.c;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import com.kwai.feature.post.api.thirdparty.d$a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.net.Uri;
import com.kwai.feature.post.api.thirdparty.ThirdPartyShareUtils;
import ekd.w0;
import ekd.q;
import java.lang.CharSequence;
import android.text.TextUtils;

public class d	// class@001457
{
    public ThirdPartyShareUtils$ShareMediaType a;
    public boolean b;
    public String c;
    public String d;
    public boolean e;
    public String f;
    public final Map g;
    public int h;
    public boolean i;
    public List j;
    public String k;
    public String l;
    public String m;
    public int n;
    public static final Set o;

    static {
       String[] stringArray = new String[]{"mediaPath","from","signTime","sign"};
       d.o = new HashSet(Arrays.asList(stringArray));
    }
    public void d(){
       super();
       this.a = ThirdPartyShareUtils$ShareMediaType.Unknown;
       this.g = new HashMap();
       this.h = -1;
    }
    public void a(Intent p0,List p1){
       d uod = d.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uod, "2")) {
          return;
       }
       if (!this.g.isEmpty()) {
          ArrayList uArrayList = new ArrayList();
          if (!PatchProxy.applyVoidTwoRefs(uArrayList, p1, null, uod, "1") && uArrayList.isEmpty()) {
             uArrayList.add(b.a);
             uArrayList.add(c.a);
             uArrayList.add(new c(p1));
          }
          Iterator iterator = this.g.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             Iterator iterator1 = uArrayList.iterator();
          }
          uArrayList.clear();
       }
       return;
    }
    public final boolean b(Intent p0,d p1){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, d.class, "7");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       if (!("android.intent.action.VIEW").equals(p0.getAction())) {
          p1.d();
          return false;
       }else {
          Uri data = p0.getData();
          obj = PatchProxy.applyOneRefs(data, null, ThirdPartyShareUtils.class, "2");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else if(data == null || (q.f(w0.b(data)) || TextUtils.isEmpty(w0.a(data, "from")))){
             b = false;
          }else {
             b = ThirdPartyShareUtils.a(data);
          }
          if (!b) {
             p1.d();
             return false;
          }else {
             return true;
          }
       }
    }
    public void c(Uri p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "4")) {
          return;
       }
       Iterator iterator = w0.b(p0).iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          if (d.o.contains(str)) {
             continue ;
          }else {
             String str1 = w0.a(p0, str);
             if (TextUtils.isEmpty(str1)) {
                continue ;
             }else {
                this.g.put(str, str1);
             }
          }
       }
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, d.class, "3")) {
          return;
       }
       this.a = ThirdPartyShareUtils$ShareMediaType.Unknown;
       this.c = null;
       this.e = false;
       this.g.clear();
       return;
    }
}
