package g3b.g;
import g3b.d;
import java.lang.Object;
import java.lang.String;
import java.util.concurrent.ExecutorService;
import t45.c;
import java.util.HashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import q2b.l;
import com.yxcorp.gifshow.log.model.WhitelistFilterInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Map;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import g3b.b;
import g3b.h;
import g3b.a;
import java.util.Set;
import java.util.Map$Entry;
import java.lang.Double;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import com.google.gson.Gson;
import f3b.j;
import java.lang.StringBuilder;
import java.lang.Exception;
import com.yxcorp.utility.Log;
import java.lang.Boolean;
import q2b.n;
import g3b.c;
import com.google.protobuf.nano.MessageNano;
import g3b.f;
import java.lang.Runnable;
import com.yxcorp.gifshow.log.utils.c;
import java.lang.RuntimeException;

public class g implements d	// class@0016ba
{
    public ExecutorService a;
    public c b;
    public Map c;
    public ConcurrentLinkedQueue d;
    public Map e;
    public Map f;
    public Map g;
    public Map h;
    public Map i;

    public void g(){
       super();
       this.a = c.f("mapping_manager");
       this.c = new HashMap();
       this.d = new ConcurrentLinkedQueue();
       this.e = new HashMap();
       this.f = new HashMap();
       this.g = new HashMap();
       this.h = new HashMap();
       this.i = new HashMap();
    }
    public void C0(String p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, g.class, "2")) {
          return;
       }
       HashMap hashMap = new HashMap();
       if (p1 != null && !p1.isEmpty()) {
          Iterator iterator = p1.iterator();
          while (iterator.hasNext()) {
             l ol = iterator.next();
             l mFilterInfo = ol.mFilterInfo;
             if (mFilterInfo != null && !TextUtils.x(mFilterInfo.mEventType)) {
                hashMap.put(ol.mFilterInfo.mEventType, ol);
             }
          }
       }
       this.f.put(p0, hashMap);
       return;
    }
    public List S0(int p0){
       ArrayList obj;
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, og, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ArrayList();
       if (this.d != null && (obj.size() < p0 && this.d.peek() != null)) {
          obj.add(this.d.poll());
       }
    label_0039 :
       return obj;
    }
    public void a1(String p0,List p1,b p2){
       g og = this;
       Object obj = p0;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, g.class, "7")) {
          return;
       }
       h oh = new h();
       oh.c = new HashMap();
       Iterator iterator = p1.iterator();
       while (iterator.hasNext()) {
          a uoa = iterator.next();
          String[] stringArray = (uoa.type).split("\\.");
          if (stringArray != null && stringArray.length > 0) {
             int i = stringArray.length - 1;
             object oobject = stringArray[i];
             h i1 = new h();
             i1.a = uoa.type;
             i1.c = new HashMap();
             a filterList = uoa.filterList;
             if (filterList == null || !filterList.size()) {
                og.b(i1, new HashMap());
             }
             Iterator iterator1 = uoa.filterList.iterator();
             while (iterator1.hasNext()) {
                Map map = iterator1.next();
                if (map == null || !map.size()) {
                }else {
                   Iterator iterator2 = map.entrySet().iterator();
                   String str = null;
                   String str1 = "";
                   String str2 = str1;
                   while (iterator2.hasNext()) {
                      Map$Entry uEntry = iterator2.next();
                      if ((uEntry.getKey()).contains("type") && (uEntry.getValue() instanceof Double && (int)Double.parseDouble(uEntry.getValue().toString()) == 1)) {
                         str = 1;
                      }
                   label_00c0 :
                      if ((uEntry.getKey()).contains("page2")) {
                         str1 = uEntry.getValue();
                         iterator2.remove();
                      }
                      if ((uEntry.getKey()).contains("action2")) {
                         str2 = uEntry.getValue();
                         iterator2.remove();
                      }else {
                         continue ;
                      }
                   }
                   if (TextUtils.x(str1) && TextUtils.x(str2)) {
                      if (("clickEvent").equals(oobject) || (!("showEvent").equals(oobject) || (str && (map.size() > 1 || ("taskEvent").equals(oobject))))) {
                         int i2 = 0x4b316083;
                         try{
                            b.a(i2).f1("V2_EVE_FILTER_ERROR", j.a().q(map), 1);
                         }catch(java.lang.Exception e0){
                            Log.d("MappingManager", "mapping to json exception: "+e0.getMessage());
                            goto label_006d ;
                         }
                      }else {
                         og.b(i1, map);
                         continue ;
                      }
                   }else if(!TextUtils.x(str1)){
                      h oh1 = og.c(i1, str1);
                      if (!TextUtils.x(str2)) {
                         og.b(og.c(oh1, str2), map);
                         continue ;
                      }else {
                         og.b(oh1, map);
                         continue ;
                      }
                   }else {
                      og.b(og.c(i1, str2), map);
                      continue ;
                   }
                }
             }
             oh.c.put(oobject, i1);
          }
       }
       og.h.put(obj, oh);
       og.i.put(obj, p2);
       return;
    }
    public final void b(h p0,Map p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, g.class, "9")) {
          return;
       }
       if (p0.b == null) {
          p0.b = new ArrayList();
       }
       p0.b.add(p1);
       return;
    }
    public final h c(h p0,String p1){
       h obj = PatchProxy.applyTwoRefs(p0, p1, this, g.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.c.get(p1);
       if (obj == null) {
          obj = new h();
          obj.c = new HashMap();
          p0.c.put(p1, obj);
       }
       return obj;
    }
    public void h0(String p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, g.class, "10")) {
          return;
       }
       this.i.remove(p0);
       return;
    }
    public List l(String p0,int p1){
       ArrayList obj;
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, og, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       ConcurrentLinkedQueue uConcurrentL = this.g.get(p0);
       obj = new ArrayList();
       if (uConcurrentL != null && (obj.size() < p1 && uConcurrentL.peek() != null)) {
          obj.add(uConcurrentL.poll());
       }
    label_003b :
       return obj;
    }
    public final boolean m(String p0,l p1,String p2,String p3,String p4){
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          Object obj = PatchProxy.apply(objArray, this, og, "13");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (!("PAGE_SHOW_EVENT").equals(p0)) {
          WhitelistFilterInfo mActionsOfPa = p1.mFilterInfo.mActionsOfPage;
          if (mActionsOfPa == null || (mActionsOfPa.containsKey(p2) && p1.mFilterInfo.mActionsOfPage.get(p2) != null)) {
             n on = p1.mFilterInfo.mActionsOfPage.get(p2);
             if (on != null) {
                n mActions = on.mActions;
                if (mActions != null && mActions.contains(p3)) {
                   on = on.mTopPages;
                   if (on == null || on.contains(p4)) {
                   label_006c :
                      return 0;
                   }
                }
             }
          }
          return 1;
       }else {
          goto label_006c ;
       }
    }
    public void n(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
          return;
       }
       if (p0 != null && !p0.isEmpty()) {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             l ol = iterator.next();
             l mFilterInfo = ol.mFilterInfo;
             if (mFilterInfo != null && !TextUtils.x(mFilterInfo.mEventType)) {
                this.c.put(ol.mFilterInfo.mEventType, ol);
             }
          }
       }
       return;
    }
    public void o(c p0){
       this.b = p0;
    }
    public void p(MessageNano p0,String p1,String p2,String p3,String p4){
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, og, "12")) {
             return;
          }
       }
       f uof = new f(this, p2, p1, p3, p4, p0);
       this.a.execute(v8);
       return;
    }
    public final void q(MessageNano p0,l p1,String p2,String p3,c p4,ConcurrentLinkedQueue p5){
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5};
          if (PatchProxy.applyVoid(objArray, this, og, "14")) {
             return;
          }
       }
       Object obj = null;
       try{
          obj = c.e(p1, p0, p4, p2, p3);
       }catch(java.lang.Exception e4){
          p4.a(e4.getMessage());
       }
       if (obj != null) {
          try{
             if (p5.size() >= 500) {
                p5.remove();
             }
             p5.offer(obj);
             if (p4 != null) {
                p4.b(p5.size());
             }
          }catch(java.lang.RuntimeException e4){
             p4.a(e4.getMessage());
          }
       }
    }
    public void r(c p0){
       this.b = null;
    }
    public final void s(MessageNano p0,l p1,String p2,String p3,c p4,ConcurrentLinkedQueue p5,String p6){
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5,p6};
          if (PatchProxy.applyVoid(objArray, this, og, "15")) {
             return;
          }
       }
       Map map = null;
       try{
          map = c.f(p1, p0, p4, p2, p3);
       }catch(java.lang.Exception e4){
          p4.a(e4.getMessage());
       }
       if (map != null) {
          try{
             if (p5.size() >= 500) {
                p5.remove();
             }
             map.put("event_type", p6);
             p5.offer(map);
             p4.b(p5.size());
          }catch(java.lang.RuntimeException e4){
             p4.a(e4.getMessage());
          }
       }
    }
    public void t(String p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, g.class, "6")) {
          return;
       }
       this.e.remove(p0);
       return;
    }
    public void w(String p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, g.class, "5")) {
          return;
       }
       this.e.put(p0, p1);
       return;
    }
}
