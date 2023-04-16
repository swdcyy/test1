package androidx.room.c0;
import android.content.Context;
import java.lang.Class;
import java.lang.String;
import androidx.room.RoomDatabase$a;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Package;
import java.lang.StringBuilder;
import java.lang.ClassLoader;
import java.lang.RuntimeException;

public class c0	// class@00026a
{

    public static RoomDatabase$a a(Context p0,Class p1,String p2){
       if (p2 != null && (p2.trim()).length()) {
          return new RoomDatabase$a(p0, p1, p2);
       }
       throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
    }
    public static Object b(Class p0,String p1){
       String name = p0.getPackage().getName();
       String canonicalNam = p0.getCanonicalName();
       if (name.isEmpty()) {
       }else {
          canonicalNam = canonicalNam.substring((name.length() + true));
       }
       p1 = canonicalNam.replace('.', '_')+p1;
       try{
          name = (name.isEmpty())? p1: name+"."+p1;
          return Class.forName(name, true, p0.getClassLoader()).newInstance();
       }catch(java.lang.ClassNotFoundException e0){
          throw new RuntimeException("cannot find implementation for "+p0.getCanonicalName()+". "+p1+" does not exist");
       }catch(java.lang.IllegalAccessException e0){
          throw new RuntimeException("Cannot access the constructor"+p0.getCanonicalName());
       }catch(java.lang.InstantiationException e0){
          throw new RuntimeException("Failed to create an instance of "+p0.getCanonicalName());
       }
    }
    public static RoomDatabase$a c(Context p0,Class p1){
       return new RoomDatabase$a(p0, p1, null);
    }
}
