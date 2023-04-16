package com.kwai.component.bifrost.BifrostActivityManager;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Collections;
import java.util.Iterator;
import com.kwai.component.bifrost.BifrostActivityEntry;
import com.kwai.component.bifrost.BifrostFeatureActivityEntry;
import com.kwai.component.bifrost.utils.BifrostActivityExt;
import java.lang.Boolean;
import com.kwai.component.bifrost.utils.BifrostActivityExt$BifrostActivityItem;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.kwai.framework.model.decompose.api.ObservableAndSyncableContainer;
import com.kwai.component.bifrost.utils.BifrostActivityExt$BifrostActivityExtWrapper;
import com.kwai.component.bifrost.b;
import java.util.Comparator;
import r85.b;
import java.util.concurrent.ConcurrentHashMap;
import r85.d;
import q87.c;
import com.kwai.component.bifrost.a;
import java.lang.IllegalArgumentException;
import com.kwai.component.bifrost.BifrostActivityManager$1;
import java.lang.reflect.Type;
import com.google.common.reflect.TypeToken;
import r85.c;
import android.content.SharedPreferences;
import km8.b;

public class BifrostActivityManager	// class@0020c4
{
    public List a;

    public void BifrostActivityManager(){
       super();
       this.a = new ArrayList();
       this.e();
    }
    public final List a(String p0,QPhoto p1){
       boolean b;
       BifrostActivityExt$BifrostActivityExtWrapper uBifrostActi2;
       ArrayList obj = PatchProxy.applyTwoRefs(p0, p1, this, BifrostActivityManager.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       BifrostActivityManager ta = this.a;
       if (ta == null) {
          return Collections.emptyList();
       }
       Iterator iterator = ta.iterator();
       while (iterator.hasNext()) {
          BifrostActivityEntry uBifrostActi = iterator.next();
          BifrostActivityEntry mActivityTyp = uBifrostActi.mActivityType;
          if (mActivityTyp != null && (mActivityTyp.equals(p0) && uBifrostActi.mFeatureActivityEntry.isEffective())) {
             mActivityTyp = uBifrostActi.mActivityId;
             BifrostActivityExt uBifrostActi1 = BifrostActivityExt.class;
             BifrostActivityExt$BifrostActivityItem obj1 = PatchProxy.applyTwoRefs(p1, mActivityTyp, null, uBifrostActi1, "2");
             if (obj1 != PatchProxyResult.class) {
                b = obj1.booleanValue();
             }else {
                obj1 = new BifrostActivityExt$BifrostActivityItem();
                obj1.mId = mActivityTyp;
                if (mActivityTyp != null) {
                   try{
                      uBifrostActi2 = PatchProxy.applyOneRefs(p1, null, uBifrostActi1, "3");
                      if (uBifrostActi2 != PatchProxyResult.class) {
                      }else if(p1 != null && p1.getPhotoMeta() != null){
                         uBifrostActi2 = p1.getPhotoMeta().getPartData("matchBifrostActivity");
                         if (uBifrostActi2 != null) {
                            uBifrostActi2 = uBifrostActi2.mMatchBifrostActivity;
                            if (uBifrostActi2 == null) {
                            }
                         }else {
                         }
                      }else {
                      }
                   }catch(java.lang.Exception e0){
                      uBifrostActi2 = Collections.emptyList();
                   }
                   if (uBifrostActi2.contains(obj1)) {
                      b = true;
                   }
                }
                b = false;
             }
             if (b) {
                obj.add(uBifrostActi);
             }
          }
       }
       Collections.sort(obj, b.b);
       return obj;
    }
    public List b(String p0,Class p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       BifrostActivityManager uBifrostActi = BifrostActivityManager.class;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, uBifrostActi, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (p1 != b.a.get(p0)) {
          throw new IllegalArgumentException("class type error !!");
       }
       ArrayList uArrayList = PatchProxy.applyOneRefs(p0, this, uBifrostActi, "3");
       int i = 0;
       if (uArrayList != patchProxyRe) {
       }else {
          uArrayList = new ArrayList();
          BifrostActivityManager ta = this.a;
          if (ta == null) {
             Object[] objArray = new Object[i];
             d.C().w("BifrostActivityManager", "getActivityEntries: mActivityEntries: null!", objArray);
             uArrayList = Collections.emptyList();
          }else {
             Iterator iterator = ta.iterator();
             while (iterator.hasNext()) {
                BifrostActivityEntry uBifrostActi2 = iterator.next();
                BifrostActivityEntry mActivityTyp = uBifrostActi2.mActivityType;
                if (mActivityTyp != null && (mActivityTyp.equals(p0) && uBifrostActi2.mFeatureActivityEntry.isEffective())) {
                   uArrayList.add(uBifrostActi2);
                }
             }
             if (uArrayList.isEmpty()) {
                Object[] objArray1 = new Object[i];
                d.C().w("BifrostActivityManager", "getActivityEntries: list isEmpty! ", objArray1);
             }
             Collections.sort(uArrayList, a.b);
          }
       }
       if (!uArrayList.size()) {
          return null;
       }else {
          ArrayList uArrayList1 = new ArrayList();
          while (i < uArrayList.size()) {
             BifrostActivityEntry uBifrostActi1 = uArrayList.get(i);
             if (uBifrostActi1 != null) {
                uArrayList1.add(uBifrostActi1.mFeatureActivityEntry);
             }
             i = i + 1;
          }
          return uArrayList1;
       }
    }
    public String c(String p0,QPhoto p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, BifrostActivityManager.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1 == null) {
          return "";
       }
       List list = this.a(p0, p1);
       if (!list.size()) {
          return "";
       }
       return list.get(0).mActivityId;
    }
    public BifrostFeatureActivityEntry d(String p0,QPhoto p1,Class p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, BifrostActivityManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p2 != b.a.get(p0)) {
          throw new IllegalArgumentException("class type error !!");
       }
       List list = this.a(p0, p1);
       if (!list.size()) {
          return null;
       }
       BifrostActivityEntry uBifrostActi = list.get(0);
       if (uBifrostActi != null) {
          return uBifrostActi.mFeatureActivityEntry;
       }
       return null;
    }
    public void e(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, BifrostActivityManager.class, "6")) {
          return;
       }
       Type type = new BifrostActivityManager$1(this).getType();
       String str = c.a.getString("ActivityEntries", "");
       if (str != null && str != "") {
          objArray = b.a(str, type);
       }
       this.a = objArray;
       return;
    }
}
