package com.kuaishou.android.shared.Stag$Factory;
import zk.j;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.nebula.model.StagFactoryksfeatureapiskuaishouapicontainer;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import com.yxcorp.gifshow.nebula.model.SideBarButton;

public class Stag$Factory implements j	// class@000703
{
    public final HashMap b;
    public final j[] c;

    public void Stag$Factory(){
       super();
       this.b = new HashMap(1);
       j[] ojArray = new j[1];
       this.c = ojArray;
    }
    public static j b(int p0){
       Stag$Factory uFactory = Stag$Factory.class;
       StagFactoryksfeatureapiskuaishouapicontainer stagFactoryk = null;
       if (PatchProxy.isSupport(uFactory)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), stagFactoryk, uFactory, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (!p0) {
          stagFactoryk = new StagFactoryksfeatureapiskuaishouapicontainer();
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
       Integer obj = PatchProxy.applyOneRefs(p0, this, Stag$Factory.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b.get(p0);
       if (obj != null) {
          return this.e(obj.intValue());
       }
       if (!this.b.size()) {
          j oj = this.f(SideBarButton.class, p0, 0);
          if (oj != null) {
             return oj;
          }
       }
       return null;
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
