package v32.a;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.live.core.basic.model.LiveUserStatusResponse$ShareConfig;
import com.kuaishou.live.bottombar.service.model.config.LiveBottomBarConfigResponse;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import v32.m;
import java.util.List;
import u32.a;
import u32.a$a;
import java.util.Map;
import com.kuaishou.live.bottombar.component.widget.view.LiveBottomBarPanelLandscapeBackgroundDrawable;
import com.kuaishou.live.bottombar.service.model.config.LiveBottomServerConfig$BottomBarConfig;
import java.util.Collection;
import ekd.q;
import java.util.ArrayList;
import java.util.Iterator;
import com.kuaishou.live.bottombar.service.model.config.LiveBottomBarConfigResponse$a;
import com.kuaishou.live.bottombar.service.model.config.LiveBottomBarConfigResponse$LiveBottomBarLayoutChildren;
import java.lang.Integer;
import com.kuaishou.live.bottombar.service.model.config.LiveBottomBarConfigResponse$LiveBottomBarLayoutChildrenItem;
import java.util.HashMap;
import ekd.j;
import java.util.HashSet;
import ox2.e;

public abstract class a	// class@0046d0
{

    public void a(){
       super();
    }
    public final LiveBottomBarConfigResponse a(String p0,LiveUserStatusResponse$ShareConfig p1){
       LiveBottomBarConfigResponse liveBottomBa1;
       ArrayList uArrayList;
       a$a uoa2;
       Object obj = this;
       List obj1 = p0;
       Map obj2 = p1;
       a uoa = a.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "1";
       m obj3 = PatchProxy.applyTwoRefs(obj1, obj2, obj, uoa, str);
       if (obj3 != patchProxyRe) {
          return obj3;
       }
       obj3 = new m();
       List list = this.h();
       String str1 = "3";
       List list1 = PatchProxy.applyTwoRefs(obj1, obj2, obj, uoa, str1);
       LiveBottomBarConfigResponse$a obj4 = null;
       int i = 1;
       int i1 = 0;
       if (list1 != patchProxyRe) {
       }else if(obj2 != null && obj2.mExternalShow != null){
          uoa2 = 1;
       }else {
          uoa2 = null;
       }
       if (!uoa2) {
          String str2 = PatchProxy.applyOneRefs(obj1, obj4, a.class, str);
          if (str2 != patchProxyRe) {
          }else {
             str2 = a.a.a(obj1);
          }
          if (!str2.equals(str)) {
             list1 = this.k();
          }
       }
       list1 = this.l();
       obj1 = this.e();
       obj2 = this.d();
       List list2 = this.i();
       LiveBottomBarPanelLandscapeBackgroundDrawable liveBottomBa = this.b();
       int i2 = 2;
       if (PatchProxy.isSupport(m.class)) {
          Object[] objArray = new Object[]{list,list1,obj1,obj2,list2,liveBottomBa};
          liveBottomBa1 = PatchProxy.apply(objArray, obj3, m.class, str);
          if (liveBottomBa1 != patchProxyRe) {
          label_016f :
             return liveBottomBa1;
          }
       }
       liveBottomBa1 = new LiveBottomBarConfigResponse();
       liveBottomBa1.mBottomBarEntry = new LiveBottomServerConfig$BottomBarConfig();
       if (!q.f(list)) {
          uArrayList = new ArrayList();
          liveBottomBa1.mBottomBarEntry.mLeftBottomBarListItems = uArrayList;
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             List list3 = iterator.next();
             if (!q.f(list3)) {
                uArrayList.add(m.a(list3));
             }
          }
       }
       if (!q.f(list1)) {
          uArrayList = new ArrayList();
          liveBottomBa1.mBottomBarEntry.mRightBottomBarListItems = uArrayList;
          Iterator iterator1 = list1.iterator();
          while (iterator1.hasNext()) {
             list = iterator1.next();
             if (!q.f(list)) {
                uArrayList.add(m.a(list));
             }
          }
       }
       Object obj5 = null;
       HashMap obj6 = PatchProxy.applyTwoRefs(list2, liveBottomBa, obj5, m.class, "2");
       if (obj6 != patchProxyRe) {
          obj4 = obj6;
       }else {
          ArrayList obj7 = PatchProxy.applyOneRefs(list2, obj5, m.class, str1);
          if (obj7 != patchProxyRe) {
          }else if(q.f(list2)){
             obj7 = obj5;
          }else {
             obj7 = new ArrayList();
             Iterator iterator2 = list2.iterator();
             while (iterator2.hasNext()) {
                LiveBottomBarConfigResponse$LiveBottomBarLayoutChildrenItem liveBottomBa2 = new LiveBottomBarConfigResponse$LiveBottomBarLayoutChildrenItem();
                liveBottomBa2.mBottomBarItemId = iterator2.next().intValue();
                obj7.add(liveBottomBa2);
             }
             LiveBottomBarConfigResponse$LiveBottomBarLayoutChildren liveBottomBa3 = new LiveBottomBarConfigResponse$LiveBottomBarLayoutChildren();
             liveBottomBa3.mButtons = obj7;
             obj7 = liveBottomBa3;
          }
          if (obj7 == null) {
             obj4 = obj5;
          }else {
             LiveBottomBarConfigResponse$a uoa1 = new LiveBottomBarConfigResponse$a();
             uoa1.mLayoutType = i2;
             uArrayList = new ArrayList();
             uArrayList.add(obj7);
             uoa1.mChildren = uArrayList;
             if (liveBottomBa != null) {
                uoa1.mLandscapeBackgroundDrawable = liveBottomBa;
             }
             obj4 = uoa1;
          }
       }
       if (obj4 != null) {
          obj6 = new HashMap();
          obj6.put(Integer.valueOf(1001), obj4);
          liveBottomBa1.mButtonLayout = obj6;
       }
       liveBottomBa1.mFunctionFoldPriorityEntry = obj1;
       liveBottomBa1.mOrderedExcludedMap = obj2;
       goto label_016f ;
    }
    public LiveBottomBarPanelLandscapeBackgroundDrawable b(){
       return null;
    }
    public final List c(){
       Integer[] obj = PatchProxy.apply(null, this, a.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Integer[12];
       obj[0] = Integer.valueOf(1036);
       obj[1] = Integer.valueOf(1020);
       obj[2] = Integer.valueOf(4001);
       obj[3] = Integer.valueOf(4002);
       obj[4] = Integer.valueOf(1008);
       obj[5] = Integer.valueOf(1011);
       obj[6] = Integer.valueOf(1009);
       obj[7] = Integer.valueOf(1016);
       obj[8] = Integer.valueOf(1017);
       obj[9] = Integer.valueOf(1043);
       obj[10] = Integer.valueOf(1044);
       obj[11] = Integer.valueOf(1045);
       return j.a(obj);
    }
    public Map d(){
       HashMap obj = PatchProxy.apply(null, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap(4);
       HashSet hashSet = new HashSet();
       hashSet.add(Integer.valueOf(1019));
       obj.put(Integer.valueOf(1010), hashSet);
       hashSet = new HashSet();
       hashSet.add(Integer.valueOf(1019));
       obj.put(Integer.valueOf(2002), hashSet);
       hashSet = new HashSet();
       hashSet.add(Integer.valueOf(1037));
       obj.put(Integer.valueOf(1009), hashSet);
       hashSet = new HashSet();
       hashSet.add(Integer.valueOf(1019));
       obj.put(Integer.valueOf(1038), hashSet);
       return obj;
    }
    public List e(){
       ArrayList obj = PatchProxy.apply(null, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList(8);
       obj.add(Integer.valueOf(1025));
       obj.add(Integer.valueOf(1029));
       obj.add(Integer.valueOf(1035));
       obj.add(Integer.valueOf(1015));
       return obj;
    }
    public List f(){
       ArrayList obj = PatchProxy.apply(null, this, a.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       obj.add(Integer.valueOf(4007));
       obj.add(Integer.valueOf(4005));
       obj.add(Integer.valueOf(1014));
       obj.add(Integer.valueOf(1010));
       obj.add(Integer.valueOf(1021));
       obj.add(Integer.valueOf(1012));
       obj.add(Integer.valueOf(1022));
       obj.add(Integer.valueOf(1018));
       obj.add(Integer.valueOf(1006));
       obj.add(Integer.valueOf(4008));
       obj.add(Integer.valueOf(4004));
       obj.add(Integer.valueOf(1024));
       obj.add(Integer.valueOf(1004));
       obj.add(Integer.valueOf(1030));
       obj.add(Integer.valueOf(1007));
       obj.add(Integer.valueOf(1027));
       obj.add(Integer.valueOf(1023));
       obj.add(Integer.valueOf(1028));
       obj.add(Integer.valueOf(1033));
       obj.add(Integer.valueOf(1034));
       obj.add(Integer.valueOf(1040));
       return obj;
    }
    public final List g(){
       Integer[] obj = PatchProxy.apply(null, this, a.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Integer[]{Integer.valueOf(1025),Integer.valueOf(1029),Integer.valueOf(1035)};
       return j.a(obj);
    }
    public List h(){
       ArrayList obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       Integer[] integerArray = new Integer[]{Integer.valueOf(1001)};
       obj.add(j.a(integerArray));
       Integer[] integerArray1 = new Integer[]{Integer.valueOf(1002)};
       obj.add(j.a(integerArray1));
       return obj;
    }
    public List i(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       Object obj = PatchProxy.apply(null, this, uoa, "5");
       if (obj != patchProxyRe) {
          return obj;
       }
       ArrayList uArrayList = PatchProxy.apply(null, this, uoa, "8");
       if (uArrayList != patchProxyRe) {
       }else {
          uArrayList = new ArrayList();
          uArrayList.add(Integer.valueOf(4007));
          uArrayList.add(Integer.valueOf(4005));
          uArrayList.add(Integer.valueOf(1031));
          uArrayList.add(Integer.valueOf(1013));
          uArrayList.add(Integer.valueOf(1014));
          uArrayList.add(Integer.valueOf(1010));
          uArrayList.add(Integer.valueOf(1021));
          uArrayList.add(Integer.valueOf(1012));
          uArrayList.add(Integer.valueOf(1022));
          uArrayList.add(Integer.valueOf(1018));
          uArrayList.add(Integer.valueOf(1006));
          uArrayList.add(Integer.valueOf(4008));
          uArrayList.add(Integer.valueOf(4004));
          uArrayList.add(Integer.valueOf(1024));
          uArrayList.add(Integer.valueOf(1004));
          uArrayList.add(Integer.valueOf(1042));
          uArrayList.add(Integer.valueOf(1030));
          uArrayList.add(Integer.valueOf(1007));
          uArrayList.add(Integer.valueOf(1027));
          uArrayList.add(Integer.valueOf(1023));
          uArrayList.add(Integer.valueOf(1028));
          uArrayList.add(Integer.valueOf(1033));
          uArrayList.add(Integer.valueOf(1034));
          uArrayList.add(Integer.valueOf(1040));
          uArrayList.add(Integer.valueOf(4006));
       }
       return uArrayList;
    }
    public final List j(){
       Integer[] obj = PatchProxy.apply(null, this, a.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Integer[]{Integer.valueOf(1037),Integer.valueOf(1046),Integer.valueOf(1019)};
       return j.a(obj);
    }
    public abstract List k();
    public List l(){
       Object obj = PatchProxy.apply(null, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.k();
    }
    public List m(){
       ArrayList obj = PatchProxy.apply(null, this, a.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       obj.add(Integer.valueOf(4007));
       obj.add(Integer.valueOf(1031));
       obj.add(Integer.valueOf(1013));
       obj.add(Integer.valueOf(1014));
       obj.add(Integer.valueOf(1010));
       obj.add(Integer.valueOf(1021));
       obj.add(Integer.valueOf(1012));
       obj.add(Integer.valueOf(1022));
       obj.add(Integer.valueOf(1006));
       obj.add(Integer.valueOf(1018));
       obj.add(Integer.valueOf(1024));
       obj.add(Integer.valueOf(2003));
       obj.add(Integer.valueOf(1030));
       obj.add(Integer.valueOf(1023));
       obj.add(Integer.valueOf(1027));
       obj.add(Integer.valueOf(1028));
       obj.add(Integer.valueOf(1033));
       obj.add(Integer.valueOf(1034));
       obj.add(Integer.valueOf(1040));
       if (e.a()) {
          obj.add(Integer.valueOf(2005));
       }
       return obj;
    }
    public final List n(){
       ArrayList obj = PatchProxy.apply(null, this, a.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       Integer[] integerArray = new Integer[]{Integer.valueOf(1015)};
       obj.add(j.a(integerArray));
       integerArray = new Integer[]{Integer.valueOf(1003)};
       obj.add(j.a(integerArray));
       integerArray = new Integer[]{Integer.valueOf(1019)};
       obj.add(j.a(integerArray));
       obj.add(this.c());
       integerArray = new Integer[]{Integer.valueOf(2004)};
       obj.add(j.a(integerArray));
       integerArray = new Integer[]{Integer.valueOf(2002)};
       obj.add(j.a(integerArray));
       Integer[] integerArray1 = new Integer[]{Integer.valueOf(2001)};
       obj.add(j.a(integerArray1));
       return obj;
    }
}
