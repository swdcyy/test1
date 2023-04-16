package com.vimeo.stag.generated.Stag$Factory;
import zk.j;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Class;
import java.lang.String;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Integer;
import com.kuaishou.bizmonitor.framework.funnel.collector.kwai.PersistentStorage$b;
import com.kuaishou.bizmonitor.framework.funnel.collector.kwai.StagFactorykscomponentsfunnel;

public class Stag$Factory implements j	// class@001025
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
       }else if(this.b.size()){
          String str1 = Stag$Factory.b(PersistentStorage$b.class);
          this.b.put(str1, Integer.valueOf(0));
          oj = (str.equals(str1))? this.c(0): typeAdapter;
          if (oj != null) {
             _monitor_exit(this);
          }
       }
       _monitor_exit(this);
       oj = typeAdapter;
       if (oj != null) {
          typeAdapter = oj.a(p0, p1);
       }
       return typeAdapter;
    }
    public final j c(int p0){
       object oobject = this.c[p0];
       if (oobject == null) {
          oobject = (p0)? null: new StagFactorykscomponentsfunnel();
          this.c[p0] = oobject;
       }
       return oobject;
    }
}
