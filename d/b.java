package d.b;
import java.lang.Object;
import d.b$a;
import java.lang.String;
import f.k;
import a.a.a.a.b.f.a$a;
import a.a.a.a.b.f.a;
import java.util.Map;
import f.l;
import java.io.File;
import java.lang.System;
import a.a.a.a.b.a.a;
import android.util.Pair;
import java.lang.Boolean;
import a.a.a.a.b.e.b$b;
import java.lang.StringBuilder;
import java.lang.Throwable;
import a.a.a.a.b.e.b;
import a.a.a.a.b.a.b;
import com.kuaishou.security.kste.logic.base.InitCommonKSTEParams;
import com.kuaishou.security.kste.export.IKSTECallback;
import com.kuaishou.security.kste.logic.event.KSTEException;

public class b	// class@001de5
{

    public void b(){
       super();
    }
    public static b a(){
       return b$a.a;
    }
    public boolean b(String p0,k p1){
       Pair pair;
       m$c.b("interpreter so not loaded");
       l ol = p1.a.get(a.a());
       boolean b = false;
       if (ol != null && (!(ol.d).isEmpty() && new File(ol.d).exists())) {
          m$c.b("interpreter so load from cache path");
          System.load(ol.d);
       label_0034 :
          b = true;
       }else if(!(ol.c).isEmpty()){
          m$c.b("interpreter so download and retry load library");
          pair = a.a().b(p0, ol.c, ol.b, ol.a);
          if (pair.first.booleanValue()) {
             if (new File(pair.second).exists()) {
                System.load(pair.second);
                b = true;
             }
             pair = "load new library success."+pair.second;
          }else {
             pair = "request interp through http failure";
             m$c.d(pair);
          }
       }else if(a.a().e(p0)){
          System.load(ol.d);
          m$c.b("load new library through fetch startconfig success.");
          goto label_0034 ;
       }else {
          p0 = "load new library through fetch startconfig failure";
       }
       m$c.b(pair);
       return b;
    }
}
