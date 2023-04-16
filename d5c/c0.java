package d5c.c0;
import ok.x;
import java.lang.Object;
import d5c.g0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ProfilePackage$Tab;
import java.lang.reflect.Field;
import java.lang.Class;
import java.lang.Math;
import java.lang.Integer;

public final class c0 implements x	// class@0020e9
{
    public static final c0 b;

    static {
       c0.b = new c0();
    }
    public void c0(){
       super();
    }
    public final Object get(){
       Field[] fields = ClientContent$ProfilePackage$Tab.class.getFields();
       int len = fields.length;
       int i = 19;
       int i1 = 0;
       while (i1 < len) {
          try{
             object oobject = fields[i1];
             if (oobject != null) {
                Object obj = null;
                i = Math.max(i, oobject.getInt(obj));
             }
             i1 = i1 + 1;
          }catch(java.lang.IllegalAccessException e0){
          }
       }
       return Integer.valueOf(i);
    }
}
