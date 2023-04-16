package com.yxcorp.gifshow.prettify.v4.magic.filter.k;
import e1c.p;
import com.yxcorp.gifshow.video.api.prettify.filter.FilterVideoPlugin$FilterEntranceType;
import java.util.List;
import java.lang.Object;
import xyb.a;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;
import java.util.ArrayList;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterConfig;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.prettify.v4.magic.filter.Filters;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterGroup$a;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import skd.a;
import java.lang.Integer;
import o1c.q;
import java.lang.Iterable;
import ok.o;
import com.google.common.base.Optional;
import qk.y;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import fg6.a;
import o1c.s;
import java.lang.reflect.Type;
import el.a;
import com.google.gson.Gson;
import o1c.t;
import com.yxcorp.gifshow.prettify.v4.magic.filter.FilterConfigs;
import java.lang.Throwable;
import w46.b;
import o1c.r;
import java.lang.Runnable;
import t45.c;

public class k	// class@0011c6
{
    public List a;
    public p b;
    public FilterVideoPlugin$FilterEntranceType c;
    public a d;
    public List e;
    public List f;
    public FilterConfig g;

    public void k(p p0,FilterVideoPlugin$FilterEntranceType p1,List p2){
       super();
       this.b = p0;
       this.c = p1;
       a uoa = a.D();
       StringBuilder str = "init, type: "+this.b.a+"---";
       String str1 = (p2 == null)? "null": String.valueOf(p2.size());
       Object[] objArray = new Object[0];
       uoa.w("FilterConfigModels", str+str1, objArray);
       this.a = p2;
       this.f = FilterConfig.arrayClone(p2);
       k ta = this.a;
       ArrayList uArrayList = PatchProxy.applyOneRefs(ta, this, k.class, "9");
       if (uArrayList != PatchProxyResult.class) {
       }else {
          List groupsInfo = Filters.getGroupsInfo(this.c);
          ArrayList uArrayList1 = new ArrayList();
          if (!q.f(groupsInfo)) {
             Iterator iterator = groupsInfo.iterator();
             while (iterator.hasNext()) {
                FilterGroup$a uoa1 = iterator.next();
                Iterator iterator1 = ta.iterator();
                while (true) {
                   if (iterator1.hasNext()) {
                      FilterConfig uFilterConfi = iterator1.next();
                      int groupId = uFilterConfi.getGroupId();
                      if (uoa1.a(groupId, uFilterConfi.getGroupName())) {
                         iterator1 = 1;
                      }
                   }else {
                      iterator1 = null;
                   }
                   if (iterator1) {
                      uArrayList1.add(uoa1);
                   }else {
                      continue ;
                   }
                }
             }
          }
          uArrayList = uArrayList1;
       }
       this.e = uArrayList;
       this.d = a.b(a.a().a(), "filter_configs");
       this.c();
       return;
    }
    public FilterConfig a(int p0){
       k ok = k.class;
       if (PatchProxy.isSupport(ok)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ok, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return y.y(this.f, new q(p0)).or(FilterConfig.getEmpty());
    }
    public List b(){
       return this.f;
    }
    public void c(){
       k ok = k.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ok, "1")) {
          return;
       }
       Object[] objArray1 = new Object[0];
       a.D().w("FilterConfigModels", "readConfigs", objArray1);
       String str = this.d.getString(this.b.b, objArray);
       if (!(this.b.a).equals("EMPTY_KEY")) {
          String str1 = "getFiltersFromJson error... filtersJson: ";
          Object[] objArray2 = PatchProxy.applyOneRefs(str, objArray, ok, "2");
          if (objArray2 != PatchProxyResult.class) {
          }else if(TextUtils.x(str)){
             objArray1 = new Object[0];
             a.D().A("FilterConfigModels", "getFiltersFromJson error... filtersJson is empty.", objArray1);
          }else {
             try{
                objArray2 = a.a.i(str, new s().getType());
             }catch(com.google.gson.JsonSyntaxException e6){
                try{
                   FilterConfigs uFilterConfi3 = a.a.i(str, new t().getType());
                   if (uFilterConfi3 != null) {
                      objArray2 = uFilterConfi3.mFilterConfigs;
                   }
                }catch(com.google.gson.JsonSyntaxException e0){
                   a.D().e("FilterConfigModels", str1+str, e6);
                }
                objArray2 = objArray;
             }
             if (objArray2 == null) {
                objArray1 = new Object[0];
                a.D().t("FilterConfigModels", str1+str, objArray1);
             }else {
                for (int i1 = 0; i1 < objArray2.size(); i1 = i1 + 1) {
                   objArray2.get(i1).setPosition(i1);
                }
             }
          }
          objArray2 = objArray;
          k tf = this.f;
          if (PatchProxy.applyVoidTwoRefs(objArray2, tf, this, ok, "7") || (!q.f(tf) && !q.f(objArray2))) {
             Iterator iterator1 = objArray2.iterator();
             while (iterator1.hasNext()) {
                FilterConfig uFilterConfi1 = iterator1.next();
                int i = tf.indexOf(uFilterConfi1);
                if (i != -1) {
                   FilterConfig uFilterConfi2 = tf.get(i);
                   uFilterConfi2.mIntensity = uFilterConfi1.mIntensity;
                   Object[] objArray3 = new Object[0];
                   a.D().s("FilterConfigModels", "restore config "+uFilterConfi2, objArray3);
                }
             }
          }
          this.g = this.a(this.d.getInt(this.b.c, -1));
       }
       if (!PatchProxy.applyVoid(objArray, this, ok, "8")) {
          Iterator iterator = this.f.iterator();
          while (iterator.hasNext()) {
             FilterConfig uFilterConfi = iterator.next();
             if (uFilterConfi.mChangeIntensityByMagic != null) {
                uFilterConfi.mIntensityBeforeMagic = uFilterConfi.mIntensity;
                uFilterConfi.mIntensity = uFilterConfi.mIntensityFromMagic;
                objArray1 = new Object[0];
                a.D().s("FilterConfigModels", "update intensity for magic "+uFilterConfi, objArray1);
             }
          }
       }
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, k.class, "4")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("FilterConfigModels", "saveConfig, type: "+this.b.a, objArray);
       if (this.d == null) {
          Object[] objArray1 = new Object[i];
          a.D().A("FilterConfigModels", "mFilterPreference has not been created", objArray1);
          return;
       }else {
          c.a(new r(this));
          return;
       }
    }
}
