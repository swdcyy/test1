package com.kwai.feature.api.feed.home.tabmanager.tabstore.a;
import ko5.a$a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import xb5.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.component.kcube.model.model.TabModel;
import com.kwai.component.kcube.model.model.HomeTabStruct;
import java.lang.reflect.Type;
import xb5.d;
import xb5.a;
import java.lang.Runnable;
import t45.c;
import o56.a;
import xf6.d;
import xf6.l;
import fg6.a;
import com.kwai.component.kcube.model.model.TabConfig;
import com.google.gson.Gson;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.feature.api.feed.home.a;
import java.lang.StringBuilder;
import xb5.c;
import java.lang.Boolean;
import java.util.List;
import java.util.ArrayList;
import on5.h;
import mo5.a;
import com.kwai.feature.api.feed.home.tabmanager.tabstore.HomeTabLocalConfig$createLocal$1;
import java.util.Objects;
import msd.l;
import java.util.Iterator;
import com.kwai.kcube.TabIdentifier;

public class a implements a$a	// class@000f20
{
    public final TabModel a;
    public final TabModel b;

    public void a(){
       boolean b;
       String str2;
       super();
       Object[] objArray = null;
       String str = "1";
       Object[] objArray1 = PatchProxy.apply(objArray, objArray, b.class, str);
       if (objArray1 != PatchProxyResult.class) {
       }else {
          HomeTabStruct homeTabStruc = d.a(HomeTabStruct.class);
          if (homeTabStruc == null) {
             objArray1 = objArray;
          }else {
             c.a(new a(homeTabStruc));
             homeTabStruc = homeTabStruc.mBottomNavMode;
          }
       }
       this.a = objArray1;
       a uoa = a.class;
       TabModel obj = PatchProxy.apply(objArray, this, uoa, str);
       if (obj != PatchProxyResult.class) {
       }else {
          obj = PatchProxy.apply(objArray, this, uoa, "2");
          if (obj != PatchProxyResult.class) {
          }else if(a.d()){
             str2 = l.g("key_test_home_tab_config_V2", "");
             TabConfig tabConfig = a.a.h(str2, TabConfig.class);
             if (!TextUtils.x(str2) && tabConfig != null) {
                obj = new TabModel();
                obj.mTabConfig = tabConfig;
             }
          }
          Object[] objArray2 = objArray;
          b = true;
          if (obj == null) {
             a uoa1 = a.D();
             StringBuilder str1 = "readFromNet, hasNetData ";
             boolean b1 = (objArray1 != null)? true: false;
             uoa1.B(str1+b1);
          }else {
             a.D().B("readFromTest");
             objArray1 = obj;
          }
          str2 = "3";
          if (!PatchProxy.applyVoidOneRefs(objArray1, this, uoa, str2) && objArray1 != null) {
             TabModel mTabConfig = objArray1.mTabConfig;
             if (mTabConfig != null) {
                if (PatchProxy.isSupport(c.class)) {
                   Object obj2 = PatchProxy.applyThreeRefs(mTabConfig, "topHot", Boolean.TRUE, null, c.class, "1");
                   if (obj2 != PatchProxyResult.class) {
                      mTabConfig = obj2;
                   }else if("topHot".equals(mTabConfig.mId)){
                      TabConfig mSubTabList = mTabConfig.mSubTabList;
                      mTabConfig = (mSubTabList == null)? objArray: c.a(mSubTabList, "topHot", b);
                   }
                }else {
                   goto label_00c3 ;
                }
                if (mTabConfig != null) {
                   mTabConfig.mSubTabList = objArray;
                   mTabConfig.mBizParams = objArray;
                   mTabConfig.mId = "hot";
                   mTabConfig.mType = "ato_hot";
                   mTabConfig.mTabName = "∑¢œ÷";
                   mTabConfig.mTabNameEn = "Trend";
                   mTabConfig.mTabNameTc = "ü·ÈT";
                }
             }
          }
          ArrayList uArrayList = new ArrayList();
          if (objArray1 == null || !h.b(objArray1, uArrayList)) {
             if (objArray1 != null) {
                h.d(uArrayList, "KCUBE_CONFIG_INIT_ERROR");
                a.D().C("getNewestData is not legal, errorInfo = ", uArrayList);
             }
             a uoa2 = a.class;
             a obj1 = PatchProxy.apply(objArray, objArray, uoa2, str);
             if (obj1 != PatchProxyResult.class) {
                obj = obj1;
             }else {
                obj1 = a.a;
                HomeTabLocalConfig$createLocal$1 iNSTANCE = HomeTabLocalConfig$createLocal$1.INSTANCE;
                Objects.requireNonNull(obj1);
                objArray1 = PatchProxy.applyOneRefs(iNSTANCE, obj1, uoa2, str2);
                if (objArray1 != PatchProxyResult.class) {
                }else {
                   objArray1 = new TabModel();
                   iNSTANCE.invoke(objArray1);
                }
             }
          }
          obj = objArray1;
       }
       this.b = obj;
       return;
    }
    public static TabConfig c(TabConfig p0,String p1,boolean p2){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), null, a.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p1.equals(p0.mId)) {
          return p0;
       }else {
          p0 = p0.mSubTabList;
          if (p0 == null) {
             return null;
          }else {
             return a.d(p0, p1, p2);
          }
       }
    }
    public static TabConfig d(List p0,String p1,boolean p2){
       TabConfig obj;
       if (PatchProxy.isSupport(a.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), null, a.class, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Iterator iterator = p0.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return null;
          }
          obj = iterator.next();
          if (p1.equals(obj.mId)) {
             break ;
          }else if(p2){
             obj = obj.mSubTabList;
             if (obj != null) {
                obj = a.d(obj, p1, true);
                if (obj != null) {
                   return obj;
                }
             }
          }
       }
       return obj;
    }
    public boolean a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (a.c(this.b.mTabConfig, p0, b) == null) {
          b = false;
       }
       return b;
    }
    public boolean b(TabIdentifier p0,TabIdentifier p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       String id = p0.getId();
       Objects.requireNonNull(id);
       String id1 = p1.getId();
       Objects.requireNonNull(id1);
       boolean b = true;
       TabConfig tabConfig = a.c(this.b.mTabConfig, id1, b);
       if (tabConfig == null) {
          return false;
       }
       if (a.c(tabConfig, id, false) == null) {
          b = false;
       }
       return b;
    }
}
