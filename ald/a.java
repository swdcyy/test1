package ald.a;
import ald.b;
import com.kuaishou.ax2c.IAttrHost;
import ald.d;
import java.lang.Object;
import java.util.Objects;
import android.view.View;
import ald.e;
import java.lang.Exception;

public final class a	// class@000067
{

    public static void a(b p0,IAttrHost[] p1){
       if (p1.length < 6) {
          return;
       }
       if (p0.getSelectShapeDelegate() != null) {
          d selectShapeD = p0.getSelectShapeDelegate();
          object oobject = p1[0];
          object oobject1 = p1[1];
          object oobject2 = p1[2];
          object oobject3 = p1[3];
          object oobject4 = p1[4];
          object oobject5 = p1[5];
          try{
             Objects.requireNonNull(selectShapeD);
             e.a(selectShapeD.a, oobject, oobject1, oobject2, oobject3, oobject4, oobject5);
          }catch(java.lang.Exception e10){
             e10.printStackTrace();
          }
       }
    }
}
