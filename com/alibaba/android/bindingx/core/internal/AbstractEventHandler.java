package com.alibaba.android.bindingx.core.internal.AbstractEventHandler;
import x5.f;
import android.content.Context;
import x5.i;
import java.lang.Object;
import java.util.HashMap;
import com.alibaba.android.bindingx.core.internal.AbstractEventHandler$Cache;
import java.lang.String;
import java.util.Map;
import y5.h;
import java.util.List;
import x5.a$d;
import com.alibaba.android.bindingx.core.internal.a;
import java.lang.Boolean;
import com.alibaba.android.bindingx.core.internal.c;
import com.alibaba.android.bindingx.core.internal.d;
import x5.c;
import x5.h;
import java.util.Locale;
import java.lang.Integer;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Iterator;
import y5.g;
import java.util.Collections;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.LinkedHashMap;
import java.lang.Double;
import java.lang.Float;
import x5.i$d;
import android.view.View;
import x5.d;
import x5.i$c;
import x5.i$e;
import com.alibaba.android.bindingx.core.internal.e;
import org.json.JSONObject;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Set;
import java.util.Map$Entry;

public abstract class AbstractEventHandler implements f	// class@000dde
{
    public Map b;
    public Map c;
    public a$d d;
    public final Map e;
    public String f;
    public String g;
    public String h;
    public Context i;
    public i j;
    public h k;
    public Object[] l;
    public AbstractEventHandler$Cache m;

    public void AbstractEventHandler(Context p0,i p1,Object[] p2){
       object oobject;
       super();
       this.e = new HashMap();
       this.m = new AbstractEventHandler$Cache(16);
       this.i = p0;
       this.j = p1;
       if (p2 != null && p2.length > 0) {
          int i = 0;
          if (p2[i] instanceof String) {
             oobject = p2[i];
          label_0029 :
             this.f = oobject;
             return;
          }
       }
       oobject = null;
       goto label_0029 ;
    }
    public void b(String p0,Map p1,h p2,List p3,a$d p4){
       this.n();
       this.s(p0, p3);
       this.d = p4;
       this.k = p2;
       if (!this.e.isEmpty()) {
          this.e.clear();
       }
       this.m();
       return;
    }
    public void d(Map p0){
    }
    public void e(Map p0){
       this.c = p0;
    }
    public void f(String p0){
       this.g = p0;
    }
    public void g(String p0){
       this.h = p0;
    }
    public void i(Object[] p0){
       this.l = p0;
    }
    public void j(String p0,h p1,Map p2){
       if (!h.b(p1)) {
          return;
       }
       a uoa = new a(p1.b);
       try{
          boolean i = 0;
          i = uoa.b(p2).booleanValue();
       }catch(java.lang.Exception e0){
       }
       if (i) {
          this.r(p0, p2);
       }
       return;
    }
    public final void m(){
       c.d(this.e);
       d.a(this.e);
       Map map = c.a().b();
       if (map != null && !map.isEmpty()) {
          this.e.putAll(map);
       }
       return;
    }
    public void n(){
       if (this.b != null) {
          this.b.clear();
          this.b = null;
       }
       this.k = null;
       return;
    }
    public void o(Map p0,Map p1,String p2){
       Object[] objArray1;
       g b;
       AbstractEventHandler uAbstractEve = this;
       Map map = p1;
       object oobject = p2;
       uAbstractEve.t(map);
       if (p0 == null) {
          return;
       }
       if (p0.isEmpty()) {
          return;
       }
       int i = 2;
       int i1 = 1;
       if (h.a) {
          Object[] objArray = new Object[i];
          objArray[0] = Integer.valueOf(p0.size());
          objArray[i1] = oobject;
          String.format(Locale.getDefault(), "consume expression with %d tasks. event type is %s", objArray);
       }
       LinkedList linkedList = new LinkedList();
       Iterator iterator = p0.values().iterator();
       while (iterator.hasNext()) {
          Iterator iterator1 = iterator.next().iterator();
          while (iterator1.hasNext()) {
             g og = iterator1.next();
             if (!oobject.equals(og.e)) {
                continue ;
             }else {
                linkedList.clear();
                AbstractEventHandler l = uAbstractEve.l;
                if (l != null && l.length > 0) {
                   Collections.addAll(linkedList, l);
                }
                l = (TextUtils.isEmpty(og.b))? uAbstractEve.f: og.b;
                if (!TextUtils.isEmpty(l)) {
                   linkedList.add(l);
                }
                g c = og.c;
                if (!h.b(c)) {
                   continue ;
                }else {
                   a uoa = uAbstractEve.m.get(c.b);
                   if (uoa == null) {
                      uoa = new a(c.b);
                      uAbstractEve.m.put(c.b, uoa);
                   }
                   Object obj = uoa.b(map);
                   if (obj != null && (!obj instanceof Double || (Double.isNaN(obj.doubleValue()) || (obj instanceof Float && Float.isNaN(obj.floatValue()))))) {
                      continue ;
                   }else {
                      View view = uAbstractEve.j.b().a(og.a, linkedList.toArray());
                      objArray1 = new Object[i];
                      objArray1[0] = og.a;
                      objArray1[1] = l;
                      d.b().c(view, og.d, obj, uAbstractEve.j.a(), og.f, objArray1);
                      if (view != null) {
                         Object[] objArray2 = new Object[]{og.a,l};
                         uAbstractEve.j.c().a(view, og.d, obj, uAbstractEve.j.a(), og.f, objArray2);
                      }
                      i = 2;
                      objArray1 = 1;
                   }
                }
             }
          }
          objArray1 = 1;
       }
       return;
    }
    public void onDestroy(){
       this.m.clear();
       d.b().a();
    }
    public boolean p(h p0,Map p1){
       boolean b;
       if (h.b(p0)) {
          p0 = p0.b;
          try{
             a uoa = new a(p0);
             b = uoa.b(p1).booleanValue();
          }catch(java.lang.Exception e0){
             b = false;
          }
       }else {
          goto label_0018 ;
       }
    }
    public abstract void q(Map p0);
    public abstract void r(String p0,Map p1);
    public final void s(String p0,List p1){
       g og;
       List list;
       ArrayList uArrayList;
       if (this.b == null) {
          this.b = new HashMap();
       }
       Iterator iterator = p1.iterator();
       while (iterator.hasNext()) {
          Map map = iterator.next();
          String str = e.e(map, "element");
          String str1 = e.e(map, "instanceId");
          String str2 = e.e(map, "property");
          h oh = e.c(map, "expression");
          Object obj = map.get("config");
          int i = 0;
          Map map1 = (obj != null && obj instanceof Map)? e.l(new JSONObject(obj)): i;
          Objects.toString(oh);
       }
       return;
    }
    public final void t(Map p0){
       if (this.c != null && !this.c.isEmpty()) {
          Iterator iterator = this.c.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             String key = uEntry.getKey();
             h value = uEntry.getValue();
             if (!TextUtils.isEmpty(key) && value != null) {
                this.j(key, value, p0);
             }
          }
       }
       return;
    }
}
