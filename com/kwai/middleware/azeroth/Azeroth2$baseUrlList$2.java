package com.kwai.middleware.azeroth.Azeroth2$baseUrlList$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.concurrent.CopyOnWriteArrayList;
import com.kwai.middleware.azeroth.Azeroth2;
import java.lang.String;
import qrd.p;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

public final class Azeroth2$baseUrlList$2 extends Lambda implements a	// class@000d3f
{
    public static final Azeroth2$baseUrlList$2 INSTANCE;

    static {
       Azeroth2$baseUrlList$2.INSTANCE = new Azeroth2$baseUrlList$2();
    }
    public void Azeroth2$baseUrlList$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final CopyOnWriteArrayList invoke(){
       ArrayList uArrayList;
       String str = Azeroth2.B.j();
       int i = str.hashCode();
       if (i != -1897523141) {
          if (i != -1012222381) {
             if (i == 0x364492 && str.equals("test")) {
                uArrayList = Azeroth2.A.getValue();
             }else {
             label_004f :
                uArrayList = new ArrayList();
             }
          }else if(str.equals("online")){
             uArrayList = Azeroth2.y.getValue();
          }else {
             goto label_004f ;
          }
       }else if(str.equals("staging")){
          uArrayList = Azeroth2.z.getValue();
       }else {
          goto label_004f ;
       }
       return new CopyOnWriteArrayList(uArrayList);
    }
}
