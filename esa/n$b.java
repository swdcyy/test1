package esa.n$b;
import fr6.i;
import esa.n;
import java.lang.Object;
import wq6.h;
import fr6.h;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Float;
import java.lang.String;
import android.content.Context;
import com.kwai.kcube.decorator.IContainerDecorator;
import com.kwai.component.homepage_interface.uxmonitor.AnswerType;
import com.kwai.component.homepage_interface.uxmonitor.InvalidGestureChecker;
import com.kwai.kcube.TabIdentifier;
import on5.b;
import sua.r;
import gsa.f0;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import tra.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;

public class n$b implements i	// class@0027cf
{
    public final n a;

    public void n$b(n p0){
       this.a = p0;
       super();
    }
    public void a(h p0,int p1){
       h.a(this, p0, p1);
    }
    public void b(h p0,h p1,int p2,int p3,float p4){
       if (PatchProxy.isSupport(n$b.class)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),Float.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, n$b.class, "2")) {
             return;
          }
       }
       InvalidGestureChecker.a(this.a.d(), AnswerType.SWITCH_TAB);
       return;
    }
    public void c(h p0,int p1){
       int i;
       n$b uob = n$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "1")) {
          return;
       }
       TabIdentifier tabIdentifie = p0.M2();
       if (tabIdentifie.equals(b.D)) {
          tabIdentifie = b.f;
       }
       r or = r.class;
       Object obj = null;
       if (!PatchProxy.applyVoidOneRefs(tabIdentifie, obj, or, "2") && (f0.a(tabIdentifie) || b.B.equals(tabIdentifie))) {
          SharedPreferences$Editor obj1 = PatchProxy.applyOneRefs(tabIdentifie, obj, or, "3");
          if (obj1 != PatchProxyResult.class) {
             i = obj1.intValue();
          }else if(b.b.equals(tabIdentifie)){
             i = 7;
          }else if(b.c.equals(tabIdentifie)){
             i = 6;
          }else if(b.f.equals(tabIdentifie)){
             i = 11;
          }else if(b.d.equals(tabIdentifie)){
             i = 10;
          }else {
             i = -1;
          }
          obj1 = a.a.edit();
          obj1.putInt("bottom_home_tab", i);
          g.a(obj1);
       }
       return;
    }
}
