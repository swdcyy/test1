package androidx.work.a;
import java.lang.String;
import k3.h;
import androidx.work.a$a;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.lang.Boolean;
import java.lang.Byte;
import java.lang.Double;
import java.lang.Float;
import java.lang.Integer;
import java.lang.Long;
import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.io.InputStream;
import java.lang.IllegalStateException;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.Class;
import java.util.Arrays;
import java.util.Collections;
import java.lang.StringBuilder;

public final class a	// class@000a59
{
    public Map a;
    public static final String b;
    public static final a c;

    static {
       a.b = h.f("Data");
       a.c = new a$a().a();
    }
    public void a(){
       super();
    }
    public void a(a p0){
       super();
       this.a = new HashMap(p0.a);
    }
    public void a(Map p0){
       super();
       this.a = new HashMap(p0);
    }
    public static Boolean[] a(boolean[] p0){
       Boolean[] uBooleanArra = new Boolean[p0.length];
       for (int i = 0; i < p0.length; i = i + 1) {
          uBooleanArra[i] = Boolean.valueOf(p0[i]);
       }
       return uBooleanArra;
    }
    public static Byte[] b(byte[] p0){
       Byte[] uByteArray = new Byte[p0.length];
       for (int i = 0; i < p0.length; i = i + 1) {
          uByteArray[i] = Byte.valueOf(p0[i]);
       }
       return uByteArray;
    }
    public static Double[] c(double[] p0){
       Double[] uDoubleArray = new Double[p0.length];
       for (int i = 0; i < p0.length; i = i + 1) {
          uDoubleArray[i] = Double.valueOf(p0[i]);
       }
       return uDoubleArray;
    }
    public static Float[] d(float[] p0){
       Float[] uFloatArray = new Float[p0.length];
       for (int i = 0; i < p0.length; i = i + 1) {
          uFloatArray[i] = Float.valueOf(p0[i]);
       }
       return uFloatArray;
    }
    public static Integer[] e(int[] p0){
       Integer[] integerArray = new Integer[p0.length];
       for (int i = 0; i < p0.length; i = i + 1) {
          integerArray[i] = Integer.valueOf(p0[i]);
       }
       return integerArray;
    }
    public static Long[] f(long[] p0){
       Long[] longArray = new Long[p0.length];
       for (int i = 0; i < p0.length; i = i + 1) {
          longArray[i] = Long.valueOf(p0[i]);
       }
       return longArray;
    }
    public static a g(byte[] p0){
       ObjectInputStream objectInputS;
       if (p0.length > 0x2800) {
          throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
       }
       HashMap hashMap = new HashMap();
       ByteArrayInputStream uByteArrayIn = new ByteArrayInputStream(p0);
       try{
          int i = 0;
          try{
             objectInputS = new ObjectInputStream(uByteArrayIn);
             i = objectInputS.readInt();
             while (i > 0) {
                hashMap.put(objectInputS.readUTF(), objectInputS.readObject());
                i--;
             }
             objectInputS.close();
          }catch(java.io.IOException e0){
             ObjectInputStream objectInputS1 = objectInputS;
          label_0040 :
             if (i) {
                i.close();
             }
          }catch(java.lang.ClassNotFoundException e0){
          }catch(java.io.IOException e0){
          }
       }catch(java.io.IOException e0){
       }catch(java.lang.ClassNotFoundException e0){
       }
       try{
          uByteArrayIn.close();
          return new a(e0);
       }catch(java.io.IOException e0){
       }
    }
    public static byte[] k(a p0){
       ObjectOutputStream objectOutput;
       ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
       try{
          int i = 0;
          try{
             objectOutput = new ObjectOutputStream(uByteArrayOu);
             objectOutput.writeInt(p0.j());
             Iterator iterator = p0.a.entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                objectOutput.writeUTF(uEntry.getKey());
                objectOutput.writeObject(uEntry.getValue());
             }
             try{
                objectOutput.close();
                try{
                   e0.close();
                }catch(java.io.IOException e0){
                }
                if (e0.size() <= 0x2800) {
                   return e0.toByteArray();
                }else {
                   throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                }
             }catch(java.io.IOException e0){
             }
          }catch(java.io.IOException e0){
             ObjectOutputStream objectOutput1 = objectOutput;
             byte[] uobyteArray = e0.toByteArray();
             if (i) {
                try{
                   i.close();
                }catch(java.io.IOException e0){
                }
             }
             try{
                e0.close();
                return uobyteArray;
             }catch(java.io.IOException e0){
             }
          }
       }catch(java.io.IOException e0){
       }
    }
    public boolean equals(Object p0){
       boolean b;
       if (this == p0) {
          return true;
       }
       if (p0 == null || a.class != p0.getClass()) {
          return false;
       }
       Set set = this.a.keySet();
       if (!set.equals(p0.a.keySet())) {
          return false;
       }
       Iterator iterator = set.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return true;
          }
          String str = iterator.next();
          Object obj = this.a.get(str);
          Object obj1 = p0.a.get(str);
          if (obj == null || obj1 == null) {
             b = (obj == obj1)? true: false;
          }else if(obj instanceof Object[] && obj1 instanceof Object[]){
             b = Arrays.deepEquals(obj, obj1);
          }else {
             b = obj.equals(obj1);
          }
          if (!b) {
             break ;
          }
       }
       return false;
    }
    public Map h(){
       return Collections.unmodifiableMap(this.a);
    }
    public int hashCode(){
       return (this.a.hashCode() * 31);
    }
    public String i(String p0){
       p0 = this.a.get(p0);
       if (p0 instanceof String) {
          return p0;
       }
       return null;
    }
    public int j(){
       return this.a.size();
    }
    public String toString(){
       StringBuilder str = "Data {";
       if (!this.a.isEmpty()) {
          Iterator iterator = this.a.keySet().iterator();
          while (iterator.hasNext()) {
             String str1 = iterator.next();
             str = str+str1+" : ";
             Object obj = this.a.get(str1);
             str = (obj instanceof Object[])? str+Arrays.toString(obj): str+obj;
             str = str+", ";
          }
       }
       return str+"}";
    }
}
