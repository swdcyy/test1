package com.kwai.middleware.azeroth.Azeroth2$d$a;
import erd.g;
import java.lang.Object;
import java.lang.String;
import com.kwai.middleware.azeroth.Azeroth2;
import java.util.Objects;
import com.google.gson.Gson;
import com.kwai.middleware.azeroth.model.AzerothSDKConfigs;
import java.lang.Class;
import java.util.ArrayList;
import com.kwai.middleware.azeroth.model.AzerothHosts;
import java.util.Iterator;
import java.lang.Iterable;
import zsd.u;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import java.util.List;
import java.util.Collection;

public final class Azeroth2$d$a implements g	// class@000d41
{
    public static final Azeroth2$d$a b;

    static {
       Azeroth2$d$a.b = new Azeroth2$d$a();
    }
    public void Azeroth2$d$a(){
       super();
    }
    public void accept(Object p0){
       Azeroth2 b = Azeroth2.B;
       Objects.requireNonNull(b);
       Gson gson = (p0 == null || !p0.length())? 1: null;
       if (!gson) {
          ArrayList uArrayList = new ArrayList();
          p0 = b.k().h(p0, AzerothSDKConfigs.class).config;
          if (p0 != null) {
             p0 = p0.hosts;
             if (p0 != null) {
                p0 = p0.iterator();
                while (p0.hasNext()) {
                   String str = p0.next();
                   if (u.q2(str, "http", false, 2, null)) {
                      uArrayList.add(str);
                   }else if(a.g(Azeroth2.B.j(), "online")){
                      uArrayList.add("https://"+str);
                   }else {
                      uArrayList.add("http://"+str);
                   }
                }
             }
          }
          if (uArrayList.isEmpty() ^ 1) {
             _monitor_enter(b);
             b.f().clear();
             b.f().addAll(uArrayList);
             _monitor_exit(b);
          }
       }
       return;
    }
}
