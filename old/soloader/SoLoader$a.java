package old.soloader.SoLoader$a;
import eud.b;
import java.lang.String;
import java.lang.Runtime;
import java.lang.reflect.Method;
import java.lang.Object;
import old.soloader.SoLoader;
import java.lang.ClassLoader;
import java.lang.Class;
import java.lang.UnsatisfiedLinkError;
import java.lang.StringBuilder;
import java.lang.RuntimeException;
import java.lang.Throwable;
import java.lang.System;
import java.io.File;
import java.security.MessageDigest;
import java.io.FileInputStream;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.lang.SecurityException;
import java.io.IOException;

public final class SoLoader$a implements b	// class@002005
{
    public final boolean a;
    public final String b;
    public final String c;
    public final Runtime d;
    public final Method e;

    public void SoLoader$a(boolean p0,String p1,String p2,Runtime p3,Method p4){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       super();
    }
    public void a(String p0,int p1){
       String str;
       if (this.a != null) {
          int i = 4;
          int i1 = 1;
          int i2 = 0;
          SoLoader$a uoa = ((p1 & i) == i)? 1: null;
          uoa = (uoa)? this.b: this.c;
          UnsatisfiedLinkError unsatisfiedL = null;
          try{
             SoLoader$a td = this.d;
             _monitor_enter(td);
             Object[] objArray = new Object[]{p0,SoLoader.class.getClassLoader(),uoa};
             str = this.e.invoke(this.d, objArray);
             if (str == null) {
                _monitor_exit(td);
                if (str != null) {
                   this.b(p0);
                }
             }else {
                throw new UnsatisfiedLinkError(str);
             }
          }catch(java.lang.IllegalAccessException e10){
          }catch(java.lang.IllegalArgumentException e10){
          }catch(java.lang.reflect.InvocationTargetException e10){
          }
          Throwable throwable = e10;
          str = unsatisfiedL;
       label_005c :
          throw new RuntimeException("Error: Cannot load "+p0, throwable);
       }else {
          System.load(p0);
       }
       return;
    }
    public final String b(String p0){
       MessageDigest instance;
       try{
          instance = MessageDigest.getInstance("MD5");
          FileInputStream uFileInputSt = new FileInputStream(new File(p0));
          byte[] uobyteArray = new byte[4096];
          int i = uFileInputSt.read(uobyteArray);
          while (i > 0) {
             instance.update(uobyteArray, 0, i);
          }
          Object[] objArray = new Object[]{new BigInteger(1, instance.digest())};
          instance = String.format("%32x", objArray);
          uFileInputSt.close();
       }catch(java.io.IOException e7){
          instance = e7.toString();
       }catch(java.lang.SecurityException e7){
          instance = e7.toString();
       }catch(java.security.NoSuchAlgorithmException e7){
          instance = e7.toString();
       }
       return instance;
    }
}
