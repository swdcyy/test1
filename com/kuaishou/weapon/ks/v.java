package com.kuaishou.weapon.ks.v;
import android.content.pm.ActivityInfo;
import java.lang.Object;
import java.util.ArrayList;
import com.kuaishou.weapon.ks.w;
import java.lang.String;
import java.lang.CharSequence;
import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.io.InputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class v	// class@00122c
{
    public ArrayList a;

    public void v(ActivityInfo[] p0){
       super();
       this.a = null;
       if (p0 != null) {
          int len = p0.length;
          if (len > 0) {
             this.a = new ArrayList(len);
             int i = 0;
             while (i < len) {
                if (p0[i] != null) {
                   w ow = new w();
                   ow.h = p0[i].configChanges;
                   ow.f = p0[i].flags;
                   ow.m = p0[i].labelRes;
                   ow.b = p0[i].launchMode;
                   if (p0[i].nonLocalizedLabel != null) {
                      ow.n = p0[i].nonLocalizedLabel.toString();
                   }
                   ow.k = p0[i].name;
                   ow.l = p0[i].packageName;
                   ow.c = p0[i].permission;
                   ow.g = p0[i].screenOrientation;
                   ow.i = p0[i].softInputMode;
                   ow.e = p0[i].targetActivity;
                   ow.d = p0[i].taskAffinity;
                   ow.a = p0[i].theme;
                   this.a.add(ow);
                }
                i = i + 1;
             }
          }
       }
       return;
    }
    public static ArrayList a(byte[] p0){
       ByteArrayInputStream uByteArrayIn = new ByteArrayInputStream(p0);
       ObjectInputStream objectInputS = new ObjectInputStream(uByteArrayIn);
       ArrayList uArrayList = objectInputS.readObject();
       try{
          objectInputS.close();
          uByteArrayIn.close();
          return uArrayList;
       }catch(java.io.IOException e0){
       }
    }
    public byte[] a(){
       ByteArrayOutputStream uByteArrayOu;
       byte[] uobyteArray1;
       byte[] uobyteArray = null;
       try{
          try{
             uByteArrayOu = new ByteArrayOutputStream();
             try{
                ObjectOutputStream objectOutput = new ObjectOutputStream(uByteArrayOu);
                objectOutput.writeObject(this.a);
                objectOutput.close();
                uByteArrayOu.close();
                uobyteArray = uByteArrayOu.toByteArray();
                try{
                   objectOutput.close();
                   uByteArrayOu.close();
                   return e0;
                }catch(java.io.IOException e0){
                }
             }catch(java.io.IOException e0){
             }
          }catch(java.io.IOException e0){
             uobyteArray1 = e0;
          }
          try{
             if (uobyteArray1 != null) {
                uobyteArray1.close();
             }
             if (uByteArrayOu) {
                uByteArrayOu.close();
             }
             return e0;
          }catch(java.io.IOException e0){
          }
       }catch(java.io.IOException e0){
          uByteArrayOu = e0;
          uobyteArray1 = uByteArrayOu;
          goto label_003b ;
       }
    }
}
