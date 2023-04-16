package bb1.e;
import bb1.a;
import java.lang.Object;
import java.util.ArrayList;
import androidx.collection.ArrayMap;
import eb1.h;
import androidx.collection.SparseArrayCompat;
import bb1.a$a;
import java.lang.String;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.collection.SimpleArrayMap;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import java.lang.Integer;
import com.kuaishou.live.core.show.admin.model.LiveAdminAbilityModel;
import java.lang.Boolean;
import lp3.e;
import lp3.c;
import lp3.b;
import java.util.Map;
import java.util.Arrays;
import com.kuaishou.live.core.show.admin.model.LiveAdminAbilityExtInfo;
import java.lang.StringBuilder;
import java.util.Set;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import bb1.b;
import java.util.Objects;
import eb1.e;
import eb1.f;
import eb1.g;
import db1.a;

public class e implements a	// class@000332
{
    public final List b;
    public final ArrayMap c;
    public final h d;
    public final SparseArrayCompat e;

    public void e(){
       super();
       this.b = new ArrayList();
       this.c = new ArrayMap();
       this.d = new h();
       this.e = new SparseArrayCompat();
    }
    public void Bk(a$a p0){
    }
    public List Ch(String p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, e.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       List list = this.c.get(p0);
       if (q.f(list)) {
          return null;
       }
       obj = new ArrayList();
       Iterator iterator = list.iterator();
       while (iterator.hasNext()) {
          Integer integer = iterator.next();
          if (this.e.containsKey(integer.intValue())) {
             obj.add(this.e.get(integer.intValue()));
          }
       }
       return obj;
    }
    public void D8(a$a p0){
    }
    public List Sm(){
       return this.b;
    }
    public boolean W7(int p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoe, "7");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = (this.rg(p0) != null)? true: false;
       return b;
    }
    public void create(e p0){
       b.a(this, p0);
    }
    public void destroy(){
       b.b(this);
    }
    public void r(List p0,Map p1){
       int i;
       e uoe = e.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uoe, "1")) {
          return;
       }
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, uoe, "2")) {
          this.b.clear();
          this.c.clear();
          this.e.clear();
       }
       if (!q.f(p0)) {
          this.b.addAll(p0);
       }
       if (p1 != null && p1.size() > 0) {
          this.c.putAll(p1);
       }
       if (!PatchProxy.applyVoid(objArray, this, uoe, "5") && !this.c.containsKey("scene_admin_bottom_more")) {
          Integer[] integerArray = new Integer[]{Integer.valueOf(i),Integer.valueOf(203)};
          i = 300;
          this.c.put("local_bottom_admin_more", Arrays.asList(integerArray));
          this.b.add(new LiveAdminAbilityModel(i, objArray));
       }
       if (!PatchProxy.applyVoid(objArray, this, uoe, "3")) {
          Iterator iterator1 = this.b.iterator();
          while (iterator1.hasNext()) {
             LiveAdminAbilityModel liveAdminAbi = iterator1.next();
             this.e.put(liveAdminAbi.mType, liveAdminAbi);
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, uoe, "4")) {
          String str = "\r\n";
          StringBuilder str1 = "dump abilities, scenes:"+str;
          Iterator iterator = this.c.keySet().iterator();
          while (iterator.hasNext()) {
             String str2 = iterator.next();
             str1 = str1+str2+":"+this.c.get(str2)+str;
          }
          str1 = str1+"ability:"+str;
          iterator = this.b.iterator();
          while (iterator.hasNext()) {
             str1 = str1+"model:"+iterator.next().toString()+str;
          }
          b.Z(LiveLogTag.LIVE_ADMIN, str1);
       }
       return;
    }
    public LiveAdminAbilityModel rg(int p0){
       Iterator obj;
       LiveAdminAbilityModel liveAdminAbi;
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoe, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.b.iterator();
       while (true) {
          if (!obj.hasNext()) {
             return null;
          }
          liveAdminAbi = obj.next();
          if (liveAdminAbi != null && p0 == liveAdminAbi.mType) {
             break ;
          }
       }
       return liveAdminAbi;
    }
    public List x8(String p0,b p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e obj = PatchProxy.applyTwoRefs(p0, p1, this, e.class, "9");
       if (obj != patchProxyRe) {
          return obj;
       }
       List list = this.Ch(p0);
       if (q.f(list)) {
          b.Z(LiveLogTag.LIVE_ADMIN, "adminAbilityType List is empty");
          return null;
       }else {
          obj = this.d;
          Objects.requireNonNull(obj);
          ArrayList uArrayList = PatchProxy.applyTwoRefs(p1, list, obj, h.class, "1");
          if (uArrayList != patchProxyRe) {
          }else {
             uArrayList = new ArrayList();
             Iterator iterator = list.iterator();
             while (iterator.hasNext()) {
                e uoe = obj.b.a(p1, iterator.next());
                if (uoe != null) {
                   g og = new g(obj, uArrayList, uoe);
                   if (PatchProxy.applyVoidOneRefs(og, uoe, e.class, "4")) {
                      continue ;
                   }else {
                      a uoa = uoe.b();
                      if (uoa != null) {
                         og.accept(uoa);
                      }
                   }
                }
             }
          }
          return uArrayList;
       }
    }
    public a zl(int p0,b p1){
       a obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uoe, "10");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       LiveAdminAbilityModel liveAdminAbi = p1.a().rg(p0);
       obj = null;
       if (liveAdminAbi != null) {
          e td = this.d;
          Objects.requireNonNull(td);
          Object obj1 = PatchProxy.applyTwoRefs(p1, liveAdminAbi, td, h.class, "2");
          if (obj1 != patchProxyRe) {
             obj = obj1;
          }else {
             e uoe1 = td.b.a(p1, liveAdminAbi);
             if (uoe1 != null) {
                obj = uoe1.b();
             }
          }
       }
       return obj;
    }
}
