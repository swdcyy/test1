package com.kuaishou.android.post.topic.TagSourceUtils;
import com.kuaishou.android.post.topic.TagSourceUtils$extractor$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import lq.i;
import lq.e;
import oq.b;
import pq.a;
import kotlin.jvm.internal.a;
import com.kuaishou.android.post.topic.TagSourceUtils$a;
import java.lang.Runnable;
import ekd.k1;
import java.util.Collection;
import java.util.ArrayList;
import com.kuaishou.android.post.topic.TagSourceUtils$b;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import ok.s;
import pq.a$a;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.lang.Iterable;
import com.gifshow.twitter.widget.Extractor;
import com.gifshow.twitter.widget.Extractor$Entity;
import fg6.a;
import com.google.gson.JsonObject;
import com.google.gson.Gson;
import com.kuaishou.android.post.topic.TagSourceUtils$getTagSourceCollectionFromJson$1;
import msd.p;
import tb7.d;
import lnc.p3;
import java.lang.StringBuilder;
import q87.c;
import com.google.gson.JsonArray;
import pq.b;
import com.google.gson.JsonElement;
import java.lang.Integer;
import java.lang.Number;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import q2b.h$b;
import k2b.e0;
import k2b.u1;

public final class TagSourceUtils	// class@000ec3
{
    public static final p a;
    public static final TagSourceUtils b;

    static {
       TagSourceUtils.b = new TagSourceUtils();
       TagSourceUtils.a = s.c(TagSourceUtils$extractor$2.INSTANCE);
    }
    public void TagSourceUtils(){
       super();
    }
    public static void c(TagSourceUtils p0,String p1,String p2,String p3,boolean p4,int p5,Object p6){
       if (p5 & 0x08) {
          p4 = false;
       }
       p0.b(p1, p2, null, p4);
       return;
    }
    public static void e(TagSourceUtils p0,List p1,String p2,String p3,boolean p4,int p5,Object p6){
       if (p5 & 0x04) {
          p3 = null;
       }
       if (p5 & 0x08) {
          p4 = false;
       }
       p0.d(p1, p2, p3, p4);
       return;
    }
    public final void a(String p0,String p1,String p2,boolean p3){
       if (PatchProxy.isSupport(TagSourceUtils.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, TagSourceUtils.class, "10")) {
          return;
       }
       if (i.h() && p0 != null) {
          i.m().k().m().d().c(p0, p1, p2, p3);
       }
       return;
    }
    public final void b(String p0,String p1,String p2,boolean p3){
       if (PatchProxy.isSupport(TagSourceUtils.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, TagSourceUtils.class, "8")) {
          return;
       }
       a.p(p1, "source");
       if (p0 == null) {
          return;
       }
       k1.o(new TagSourceUtils$a(p0, p1, p2, p3));
       return;
    }
    public final void d(List p0,String p1,String p2,boolean p3){
       if (PatchProxy.isSupport(TagSourceUtils.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, TagSourceUtils.class, "11")) {
          return;
       }
       if (!i.h()) {
          return;
       }
       i.m().k().m().d().f(p0, p1, p2, p3);
       return;
    }
    public final void f(List p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, null, this, TagSourceUtils.class, "9")) {
          return;
       }
       a.p(p1, "source");
       boolean b = (p0.isEmpty())? true: false;
       if (b) {
          return;
       }else if(k1.g()){
          TagSourceUtils.e(this, p0, p1, null, false, 8, null);
       }else {
          k1.o(new TagSourceUtils$b(new ArrayList(p0), p1, null));
       }
       return;
    }
    public final List g(String p0){
       String obj = PatchProxy.applyOneRefs(p0, this, TagSourceUtils.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (p0 == null || !p0.length())? 1: null;
       if (obj) {
          return new ArrayList();
       }else {
          List list = s.c(" #").g().e(p0);
          a.o(list, "Splitter.on\(ShareTagUtil¡­sults\(\).splitToList\(tags\)");
          return list;
       }
    }
    public final a h(){
       Object obj = PatchProxy.apply(null, this, TagSourceUtils.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!i.h()) {
          return a.b.a();
       }
       return i.m().k().m().d().h();
    }
    public final Set i(String p0,String p1){
       HashSet obj = PatchProxy.applyTwoRefs(p0, p1, this, TagSourceUtils.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashSet();
       Set set = this.k(p0);
       Iterator iterator = this.k(p1).iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          if (!set.contains(str)) {
             obj.add(str);
          }
       }
       return obj;
    }
    public final Extractor j(){
       Object obj = PatchProxy.apply(null, this, TagSourceUtils.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TagSourceUtils.a.getValue();
    }
    public final Set k(String p0){
       HashSet obj = PatchProxy.applyOneRefs(p0, this, TagSourceUtils.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashSet();
       Extractor uExtractor = (p0 == null || !p0.length())? 1: null;
       if (uExtractor) {
          return obj;
       }else {
          List list = this.j().a(p0);
          if (list != null) {
             Iterator iterator = list.iterator();
             while (iterator.hasNext()) {
                Extractor$Entity uEntity = iterator.next();
                a.o(uEntity, "entity");
                String str = uEntity.d();
                str = (str == null || !str.length())? 1: null;
                if (!str) {
                   obj.add(uEntity.d());
                }
             }
          }
          return obj;
       }
    }
    public final a l(String p0){
       a obj = PatchProxy.applyOneRefs(p0, this, TagSourceUtils.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new a();
       Gson gson = (p0 == null || !p0.length())? 1: null;
       if (gson) {
          return obj;
       }else {
          try{
             JsonObject jsonObject = a.a.h(p0, JsonObject.class);
             if (jsonObject != null) {
                d.a(jsonObject, new TagSourceUtils$getTagSourceCollectionFromJson$1(obj));
             }
          }catch(java.lang.Exception e0){
             e0.g();
          }
          return e0;
       }
    }
    public final void m(String p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, TagSourceUtils.class, "2")) {
          return;
       }
       this.n(p0, this.l(p1), p2);
       return;
    }
    public final void n(String p0,a p1,String p2){
       String str3;
       int i1;
       String str4;
       a uoa = p1;
       String str = p2;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, TagSourceUtils.class, "12")) {
          return;
       }
       Set set = this.k(p0);
       Object[] objArray = new Object[0];
       p3.D().w("TagSource", "logTagSource, Tags: "+set+'}', objArray);
       JsonArray jsonArray = new JsonArray();
       Iterator iterator = set.iterator();
       JsonObject jsonObject = null;
       while (iterator.hasNext()) {
          String str1 = iterator.next();
          int i = (!str1.length())? 1: 0;
          if (i) {
          }else {
             String str2 = "source";
             if (uoa) {
                Set set1 = uoa.j(str1);
                if (set1 != null) {
                   Iterator iterator1 = set1.iterator();
                   str3 = null;
                   i1 = 0;
                   while (iterator1.hasNext()) {
                      b uob = iterator1.next();
                      int JsonObject i2 = a.g("USER_INPUT", uob.b()) ^ 1;
                      if (i2) {
                         i2 = new JsonObject();
                         i2.c0(str2, uob.b());
                         str4 = uob.a();
                         str4 = (str4 == null || !str4.length())? 1: null;
                         if (!str4) {
                            i2.c0("id", uob.a());
                         }
                         i2.c0("name", str1);
                         jsonArray.G(i2);
                         str3 = 1;
                      }else {
                         i2 = new JsonObject();
                         i2.c0("name", str1);
                         jsonArray.G(i2);
                         i1 = 1;
                      }
                      str4 = null;
                   }
                   if (str3 == null) {
                      if (!i1) {
                         jsonObject = new JsonObject();
                         jsonObject.c0(str2, "UNKNOWN");
                         jsonObject.c0("name", str1);
                         jsonArray.G(jsonObject);
                      }
                   }
                   jsonObject = 1;
                label_00e3 :
                   str4 = null;
                }
             }
             str3 = null;
             i1 = 0;
             goto label_00cc ;
          }
       }
       if (!jsonArray.size()) {
          return;
       }
       JsonObject jsonObject1 = new JsonObject();
       jsonObject1.G("tag_list_info", jsonArray);
       jsonObject1.a0("is_contained_tag", Integer.valueOf(jsonObject));
       if (str) {
          jsonObject1.c0("task_id", str);
       }
       String str5 = jsonObject1.toString();
       a.o(str5, "params.toString\(\)");
       Object[] objArray1 = new Object[0];
       p3.D().w("TagSource", "logTagSource, params: "+str5+'}', objArray1);
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.params = str5;
       uElementPack.action2 = "VIDEO_POST_HASHTAG_RESOURCE";
       h$b uob1 = h$b.e(7, "VIDEO_POST_HASHTAG_RESOURCE");
       uob1.k(uElementPack);
       u1.p0("4091735", null, uob1);
       return;
    }
}
