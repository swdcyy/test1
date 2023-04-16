package com.kuaishou.live.common.Stag$Factory;
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
import com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$MagicFaceConfig;
import com.kuaishou.live.common.core.component.authority.LiveAnchorCommonAuthority;
import com.kuaishou.live.common.core.component.authority.StagFactoryksfeaturesftlivelivefeatureslivecommon;
import com.kuaishou.live.common.core.basic.config.StagFactoryksfeaturesftlivelivefeatureslivecommon;

public class Stag$Factory implements j	// class@000e53
{
    public final HashMap b;
    public final j[] c;

    public void Stag$Factory(){
       super();
       this.b = new HashMap(2);
       j[] ojArray = new j[2];
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
          }else {
             int i = this.b.size();
             TypeAdapter typeAdapter1 = 1;
             if (i) {
                if (i != typeAdapter1) {
                label_005e :
                   _monitor_exit(this);
                   typeAdapter1 = typeAdapter;
                }
             }else {
                j oj1 = this.d(LiveCommonConfigResponse$MagicFaceConfig.class, obj, 0);
                if (oj1 != null) {
                   _monitor_exit(this);
                   oj = oj1;
                }
             }
             oj = this.d(LiveAnchorCommonAuthority.class, obj, typeAdapter1);
             if (oj != null) {
                _monitor_exit(this);
             }else {
                goto label_005e ;
             }
          }
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
          StagFactoryksfeaturesftlivelivefeatureslivecommon stagFactoryk = null;
          if (PatchProxy.isSupport(uFactory)) {
             Object obj1 = PatchProxy.applyOneRefs(Integer.valueOf(p0), stagFactoryk, uFactory, "2");
             if (obj1 != patchProxyRe) {
                obj = obj1;
             label_0048 :
                this.c[p0] = obj;
             }
          }
          if (p0) {
             if (p0 == 1) {
                stagFactoryk = new StagFactoryksfeaturesftlivelivefeatureslivecommon();
             }
          }else {
             stagFactoryk = new StagFactoryksfeaturesftlivelivefeatureslivecommon();
          }
          obj = stagFactoryk;
          goto label_0048 ;
       }
       return obj;
    }
    public final j d(Class p0,String p1,int p2){
       if (PatchProxy.isSupport(Stag$Factory.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, Stag$Factory.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       String str = Stag$Factory.b(p0);
       this.b.put(str, Integer.valueOf(p2));
       if (p1.equals(str)) {
          return this.c(p2);
       }else {
          return null;
       }
    }
}
