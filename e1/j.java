package e1.j;
import java.util.HashMap;
import e1.f;
import java.lang.Class;
import java.lang.reflect.Constructor;
import java.lang.Object;
import e1.k;
import e1.h;
import e1.m;
import e1.n;
import android.content.Context;
import org.xmlpull.v1.XmlPullParser;
import java.lang.String;
import e1.e;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import e1.p;
import java.lang.Integer;
import java.util.ArrayList;
import java.util.Iterator;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;

public class j	// class@001e98
{
    public HashMap a;
    public static HashMap b;

    static {
       HashMap hashMap = new HashMap();
       try{
          j.b = hashMap;
          Class[] uClassArray = new Class[0];
          hashMap.put("KeyAttribute", f.class.getConstructor(uClassArray));
          uClassArray = new Class[0];
          j.b.put("KeyPosition", k.class.getConstructor(uClassArray));
          uClassArray = new Class[0];
          j.b.put("KeyCycle", h.class.getConstructor(uClassArray));
          uClassArray = new Class[0];
          j.b.put("KeyTimeCycle", m.class.getConstructor(uClassArray));
          Class[] uClassArray1 = new Class[0];
          j.b.put("KeyTrigger", n.class.getConstructor(uClassArray1));
       }catch(java.lang.NoSuchMethodException e0){
       }
    }
    public void j(Context p0,XmlPullParser p1){
       e uoe;
       super();
       HashMap hashMap = new HashMap();
       try{
          this.a = hashMap;
          AttributeSet uAttributeSe = null;
          for (int eventType = p1.getEventType(); eventType != 1; eventType = p1.next()) {
             try{
                if (eventType != 2) {
                   if (eventType == 3 && ("KeyFrameSet").equals(p1.getName())) {
                      return;
                   }
                }else {
                   try{
                      String name = p1.getName();
                      if (j.b.containsKey(name)) {
                         try{
                            Object[] objArray = new Object[0];
                            uoe = j.b.get(name).newInstance(objArray);
                            uoe.c(p0, Xml.asAttributeSet(p1));
                            this.b(uoe);
                            uAttributeSe = e0;
                         }catch(java.lang.Exception e0){
                         }
                      }else if(name.equalsIgnoreCase("CustomAttribute") && uAttributeSe != null){
                         uoe = uAttributeSe.e;
                         if (uoe != null) {
                            ConstraintAttribute.g(p0, p1, uoe);
                         }
                      }
                   }catch(java.lang.Exception e0){
                   }
                }
             }catch( e0){
             }
          }
       }catch(org.xmlpull.v1.XmlPullParserException e4){
          e4.printStackTrace();
       }catch(java.io.IOException e4){
          e4.printStackTrace();
       }
       return;
    }
    public void a(p p0){
       ArrayList uArrayList = this.a.get(Integer.valueOf(p0.b));
       if (uArrayList != null) {
          p0.b(uArrayList);
       }
       uArrayList = this.a.get(Integer.valueOf(-1));
       if (uArrayList != null) {
          Iterator iterator = uArrayList.iterator();
          while (iterator.hasNext()) {
             e uoe = iterator.next();
             if (uoe.d(p0.a.getLayoutParams().V)) {
                p0.a(uoe);
             }
          }
       }
       return;
    }
    public final void b(e p0){
       if (!this.a.containsKey(Integer.valueOf(p0.b))) {
          this.a.put(Integer.valueOf(p0.b), new ArrayList());
       }
       this.a.get(Integer.valueOf(p0.b)).add(p0);
       return;
    }
    public ArrayList c(int p0){
       return this.a.get(Integer.valueOf(p0));
    }
}
