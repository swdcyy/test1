package com.kuaishou.android.prettify.core.Stag$Factory;
import zk.j;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.model.StagFactorykscomponentsprettifymodel;
import com.kwai.feature.post.api.componet.prettify.makeup.model.StagFactorykscomponentsprettifymodel;
import com.kwai.feature.post.api.componet.prettify.filter.model.StagFactorykscomponentsprettifymodel;
import com.kwai.feature.post.api.componet.prettify.beauty.StagFactorykscomponentsprettifymodel;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import com.kwai.feature.post.api.componet.prettify.beauty.PostBeautifyResponse;
import com.kwai.feature.post.api.componet.prettify.filter.model.RecoFiltersResponse;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupSuite;
import com.yxcorp.gifshow.model.OperationMaskTag;

public class Stag$Factory implements j	// class@000ecf
{
    public final HashMap b;
    public final j[] c;

    public void Stag$Factory(){
       super();
       this.b = new HashMap(4);
       j[] ojArray = new j[4];
       this.c = ojArray;
    }
    public static j b(int p0){
       Stag$Factory uFactory = Stag$Factory.class;
       StagFactorykscomponentsprettifymodel stagFactoryk = null;
       if (PatchProxy.isSupport(uFactory)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), stagFactoryk, uFactory, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0) {
          if (p0 != 1) {
             if (p0 != 2) {
                if (p0 == 3) {
                   stagFactoryk = new StagFactorykscomponentsprettifymodel();
                }
             }else {
                stagFactoryk = new StagFactorykscomponentsprettifymodel();
             }
          }else {
             stagFactoryk = new StagFactorykscomponentsprettifymodel();
          }
       }else {
          stagFactoryk = new StagFactorykscomponentsprettifymodel();
       }
       return stagFactoryk;
    }
    public static String c(Class p0){
       String str = null;
       Object obj = PatchProxy.applyOneRefs(p0, str, Stag$Factory.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String name = p0.getName();
       int i = name.lastIndexOf(46);
       if (i != -1) {
          str = name.substring(0, i);
       }
       return str;
    }
    public TypeAdapter a(Gson p0,a p1){
       String obj = PatchProxy.applyTwoRefs(p0, p1, this, Stag$Factory.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = Stag$Factory.c(p1.getRawType());
       TypeAdapter typeAdapter = null;
       if (obj == null) {
          return typeAdapter;
       }
       j oj = this.d(obj);
       if (oj != null) {
          typeAdapter = oj.a(p0, p1);
       }
       return typeAdapter;
    }
    public synchronized final j d(String p0){
       j oj1;
       Integer obj = PatchProxy.applyOneRefs(p0, this, Stag$Factory.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b.get(p0);
       if (obj != null) {
          return this.e(obj.intValue());
       }
       int i = this.b.size();
       if (i) {
          if (i != 1) {
             if (i != 2) {
                if (i != 3) {
                label_0060 :
                   return null;
                }else {
                label_0056 :
                   j oj = this.f(OperationMaskTag.class, p0, 3);
                   if (oj != null) {
                      return oj;
                   }else {
                      goto label_0060 ;
                   }
                }
             }else {
             label_004c :
                oj1 = this.f(MakeupSuite.class, p0, 2);
                if (oj1 != null) {
                   return oj1;
                }else {
                   goto label_0056 ;
                }
             }
          }
       }else {
          oj1 = this.f(PostBeautifyResponse.class, p0, 0);
          if (oj1 != null) {
             return oj1;
          }
       }
       oj1 = this.f(RecoFiltersResponse.class, p0, 1);
       if (oj1 != null) {
          return oj1;
       }else {
          goto label_004c ;
       }
    }
    public final j e(int p0){
       object obj;
       j oj;
       Stag$Factory uFactory = Stag$Factory.class;
       if (PatchProxy.isSupport(uFactory)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uFactory, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.c[p0];
       if (obj == null) {
          oj = Stag$Factory.b(p0);
          this.c[p0] = oj;
       }
       return oj;
    }
    public final j f(Class p0,String p1,int p2){
       if (PatchProxy.isSupport(Stag$Factory.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, Stag$Factory.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       String str = Stag$Factory.c(p0);
       this.b.put(str, Integer.valueOf(p2));
       if (p1.equals(str)) {
          return this.e(p2);
       }else {
          return null;
       }
    }
}
