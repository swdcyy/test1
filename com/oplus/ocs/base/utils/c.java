package com.oplus.ocs.base.utils.c;
import java.util.HashMap;
import java.lang.Object;
import android.os.Parcel;
import java.lang.ClassLoader;
import java.lang.String;
import android.os.Parcelable;
import android.os.Parcelable$Creator;
import android.os.Parcelable$ClassLoaderCreator;
import java.lang.Class;
import java.lang.reflect.Field;
import android.os.BadParcelableException;

public class c	// class@000b22
{
    public static final String a = "c";
    public static final HashMap b;

    static {
       c.b = new HashMap();
    }
    public void c(){
       super();
    }
    public static final Parcelable a(Parcel p0,ClassLoader p1,String p2){
       Parcelable$Creator uCreator = c.b(p0, p1, p2);
       if (uCreator == null) {
          return null;
       }
       if (uCreator instanceof Parcelable$ClassLoaderCreator) {
          return uCreator.createFromParcel(p0, p1);
       }
       return uCreator.createFromParcel(p0);
    }
    public static void a(Parcel p0,Parcelable p1,String p2){
       if (p1 == null) {
          p0.writeString(null);
          return;
       }else {
          p0.writeString(p2);
          p1.writeToParcel(p0, 0);
          return;
       }
    }
    public static Parcelable$Creator b(Parcel p0,ClassLoader p1,String p2){
       Parcelable$Creator uCreator = null;
       if (p0.readString() == null) {
          return uCreator;
       }
       HashMap b = c.b;
       _monitor_enter(b);
       HashMap hashMap = b.get(p1);
       if (hashMap == null) {
          hashMap = new HashMap();
          b.put(p1, hashMap);
       }
       Parcelable$Creator uCreator1 = hashMap.get(p2);
       _monitor_exit(b);
       if (uCreator1 != null) {
          return uCreator1;
       }else {
          boolean b1 = false;
          try{
             Class uClass = Class.forName(p2, b1, p1);
             if (Parcelable.class.isAssignableFrom(uClass)) {
                Field field = uClass.getField("CREATOR");
                if (field.getModifiers() & 0x08) {
                   if (Parcelable$Creator.class.isAssignableFrom(field.getType())) {
                      Parcelable$Creator uCreator2 = field.get(uCreator);
                      if (uCreator2 != null) {
                         _monitor_enter(b);
                         hashMap.put(p2, uCreator2);
                         _monitor_exit(b);
                         return uCreator2;
                      }else {
                         throw new BadParcelableException(("Parcelable protocol requires a non-null Parcelable.Creator object called CREATOR on class ").concat(String.valueOf(p2)));
                      }
                   }else {
                      throw new BadParcelableException(("Parcelable protocol requires a Parcelable.Creator object called CREATOR on class ").concat(String.valueOf(p2)));
                   }
                }else {
                   throw new BadParcelableException(("Parcelable protocol requires the CREATOR object to be static on class ").concat(String.valueOf(p2)));
                }
             }else {
                throw new BadParcelableException(("Parcelable protocol requires subclassing from Parcelable on class ").concat(String.valueOf(p2)));
             }
          }catch(java.lang.IllegalAccessException e0){
             ("Illegal access when unmarshalling: ").concat(String.valueOf(p2));
             throw new BadParcelableException(("IllegalAccessException when unmarshalling: ").concat(String.valueOf(p2)));
          }catch(java.lang.ClassNotFoundException e0){
             ("Class not found when unmarshalling: ").concat(String.valueOf(p2));
             throw new BadParcelableException(("ClassNotFoundException when unmarshalling: ").concat(String.valueOf(p2)));
          }catch(java.lang.NoSuchFieldException e0){
             throw new BadParcelableException(("Parcelable protocol requires a Parcelable.Creator object called CREATOR on class ").concat(String.valueOf(p2)));
          }
       }
    }
}
