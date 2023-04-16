package com.meizu.cloud.pushsdk.d.f.a;
import java.lang.Object;
import java.lang.String;
import android.content.Context;
import java.util.Map;
import com.meizu.cloud.pushsdk.d.f.c;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.lang.Exception;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.IOException;

public class a	// class@001526
{
    public static final String a = "a";

    public void a(){
       super();
    }
    public static Map a(String p0,Context p1){
       String a;
       int i = 1;
       try{
          a = a.a;
          Object[] objArray = new Object[i];
          objArray[0] = p0;
          c.b(a, "Attempting to retrieve map from: %s", objArray);
          ObjectInputStream objectInputS = new ObjectInputStream(p1.openFileInput(p0));
          HashMap hashMap = objectInputS.readObject();
          objectInputS.close();
          Object[] objArray1 = new Object[i];
          objArray1[0] = hashMap;
          c.b(a, " + Retrieved map from file: %s", objArray1);
          return hashMap;
       }catch(java.io.IOException e5){
       }catch(java.lang.ClassNotFoundException e5){
       }
       Object[] objArray2 = new Object[i];
       objArray2[v0] = e5.getMessage();
       c.a(a.a, " + Exception getting vars map: %s", objArray2);
       return null;
    }
    public static boolean a(String p0,Map p1,Context p2){
       String a;
       Object[] objArray1;
       int i = 0;
       try{
          a = a.a;
          Object[] objArray = new Object[]{p1};
          c.b(a, "Attempting to save: %s", objArray);
          ObjectOutputStream objectOutput = new ObjectOutputStream(p2.openFileOutput(p0, i));
          objectOutput.writeObject(p1);
          objectOutput.close();
          objArray1 = new Object[]{p0};
          c.b(a, " + Successfully saved KV Pairs to: %s", objArray1);
          return 1;
       }catch(java.io.IOException e5){
          objArray1 = new Object[v0];
          objArray1[i] = e5.getMessage();
          c.a(a.a, " + Exception saving vars map: %s", objArray1);
          return i;
       }
    }
}
