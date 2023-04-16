package com.smile.gifshow.live.Stag$Factory;
import zk.j;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Class;
import java.lang.String;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Integer;
import com.kuaishou.live.core.basic.model.QLivePushEndInfo;
import com.kuaishou.live.merchant.chain.model.LiveMerchantChainPhotoFeedResponse;
import com.kuaishou.live.merchant.chain.model.StagFactoryksfeaturesftlivelive;
import com.kuaishou.live.core.basic.model.StagFactoryksfeaturesftlivelive;

public class Stag$Factory implements j	// class@000c51
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
       String name = p0.getName();
       int i = name.lastIndexOf(46);
       name = (i == -1)? null: name.substring(0, i);
       return name;
    }
    public TypeAdapter a(Gson p0,a p1){
       j oj;
       String str = Stag$Factory.b(p1.getRawType());
       TypeAdapter typeAdapter = null;
       if (str == null) {
          return typeAdapter;
       }
       _monitor_enter(this);
       Integer integer = this.b.get(str);
       if (integer != null) {
          oj = this.c(integer.intValue());
          _monitor_exit(this);
       }else {
          int i = this.b.size();
          if (i) {
             if (i != 1) {
             label_0043 :
                _monitor_exit(this);
                oj = typeAdapter;
             }
          }else {
             j oj1 = this.d(QLivePushEndInfo.class, str, 0);
             if (oj1 != null) {
                _monitor_exit(this);
                oj = oj1;
             }
          }
          oj = this.d(LiveMerchantChainPhotoFeedResponse.class, str, 1);
          if (oj != null) {
             _monitor_exit(this);
          }else {
             goto label_0043 ;
          }
       }
       if (oj != null) {
          typeAdapter = oj.a(p0, p1);
       }
       return typeAdapter;
    }
    public final j c(int p0){
       object oobject = this.c[p0];
       if (oobject == null) {
          if (p0) {
             oobject = (p0 != 1)? null: new StagFactoryksfeaturesftlivelive();
          }else {
             oobject = new StagFactoryksfeaturesftlivelive();
          }
          this.c[p0] = oobject;
       }
       return oobject;
    }
    public final j d(Class p0,String p1,int p2){
       String str = Stag$Factory.b(p0);
       this.b.put(str, Integer.valueOf(p2));
       if (p1.equals(str)) {
          return this.c(p2);
       }
       return null;
    }
}
