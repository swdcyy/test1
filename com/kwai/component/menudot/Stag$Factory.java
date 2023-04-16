package com.kwai.component.menudot.Stag$Factory;
import zk.j;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Integer;
import com.kwai.component.menudot.startup.MenuRedDotStartupPojo;
import com.kwai.component.menudot.startup.StagFactorykscomponentsmenureddot;

public class Stag$Factory implements j	// class@0009b3
{
    public final HashMap b;
    public final j[] c;

    public void Stag$Factory(){
       super();
       this.b = new HashMap(1);
       j[] ojArray = new j[1];
       this.c = ojArray;
    }
    public static String b(Class p0){
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
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Stag$Factory uFactory = Stag$Factory.class;
       String obj = PatchProxy.applyTwoRefs(p0, p1, this, uFactory, "6");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = Stag$Factory.b(p1.getRawType());
       TypeAdapter typeAdapter = null;
       if (obj == null) {
          return typeAdapter;
       }
       _monitor_enter(this);
       j oj = PatchProxy.applyOneRefs(obj, this, uFactory, "5");
       if (oj != patchProxyRe) {
          _monitor_exit(this);
       }else {
          Integer integer = this.b.get(obj);
          if (integer != null) {
             oj = this.c(integer.intValue());
             _monitor_exit(this);
          }else if(this.b.size()){
             if (PatchProxy.isSupport(uFactory)) {
                Object obj1 = PatchProxy.applyThreeRefs(MenuRedDotStartupPojo.class, obj, Integer.valueOf(0), this, Stag$Factory.class, "4");
                if (obj1 != patchProxyRe) {
                   oj = obj1;
                }else {
                label_0063 :
                   String str = Stag$Factory.b(MenuRedDotStartupPojo.class);
                   this.b.put(str, Integer.valueOf(0));
                   oj = (obj.equals(str))? this.c(0): typeAdapter;
                }
             }else {
                goto label_0063 ;
             }
             if (oj != null) {
                _monitor_exit(this);
             }
          }
          _monitor_exit(this);
          oj = typeAdapter;
       }
       if (oj != null) {
          typeAdapter = oj.a(p0, p1);
       }
       return typeAdapter;
    }
    public final j c(int p0){
       object obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Stag$Factory uFactory = Stag$Factory.class;
       if (PatchProxy.isSupport(uFactory)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uFactory, "3");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = this.c[p0];
       if (obj == null) {
          StagFactorykscomponentsmenureddot stagFactoryk = null;
          if (PatchProxy.isSupport(uFactory)) {
             Object obj1 = PatchProxy.applyOneRefs(Integer.valueOf(p0), stagFactoryk, uFactory, "2");
             if (obj1 != patchProxyRe) {
                obj = obj1;
             label_003f :
                this.c[p0] = obj;
             }
          }
          if (!p0) {
             stagFactoryk = new StagFactorykscomponentsmenureddot();
          }
          obj = stagFactoryk;
          goto label_003f ;
       }
       return obj;
    }
}
