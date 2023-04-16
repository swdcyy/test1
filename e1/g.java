package e1.g;
import java.lang.Object;
import java.util.HashMap;
import java.lang.String;
import java.util.Arrays;

public class g	// class@001e84
{
    public HashMap a;

    public void g(){
       super();
       this.a = new HashMap();
    }
    public float a(Object p0,String p1,int p2){
       if (!this.a.containsKey(p0)) {
          return Float.NaN;
       }
       p0 = this.a.get(p0);
       if (!p0.containsKey(p1)) {
          return Float.NaN;
       }
       p0 = p0.get(p1);
       if (p0.length > p2) {
          return p0[p2];
       }
       return Float.NaN;
    }
    public void b(Object p0,String p1,int p2,float p3){
       HashMap hashMap;
       float[] uofloatArray;
       if (!this.a.containsKey(p0)) {
          hashMap = new HashMap();
          uofloatArray = new float[(p2 + 1)];
          uofloatArray[p2] = p3;
          hashMap.put(p1, uofloatArray);
          this.a.put(p0, hashMap);
       }else {
          hashMap = this.a.get(p0);
          if (!hashMap.containsKey(p1)) {
             uofloatArray = new float[(p2 + 1)];
             uofloatArray[p2] = p3;
             hashMap.put(p1, uofloatArray);
             this.a.put(p0, hashMap);
          }else {
             p0 = hashMap.get(p1);
             if (p0.length <= p2) {
                p0 = Arrays.copyOf(p0, (p2 + 1));
             }
             p0[p2] = p3;
             hashMap.put(p1, p0);
          }
       }
       return;
    }
}
