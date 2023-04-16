package com.yxcorp.gifshow.profile.profileinstaller.a;
import android.content.res.AssetManager;
import java.util.concurrent.Executor;
import com.yxcorp.gifshow.profile.profileinstaller.c$c;
import java.lang.String;
import java.io.File;
import java.lang.Object;
import android.os.Build$VERSION;
import h5c.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.IllegalStateException;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Integer;
import android.content.res.AssetFileDescriptor;
import com.kwai.plugin.dva.split.SplitAssetHelper;
import java.io.FileInputStream;
import com.yxcorp.gifshow.profile.profileinstaller.d;
import java.io.InputStream;
import h5c.b;
import java.lang.Throwable;
import h5c.a;
import java.lang.Runnable;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import com.yxcorp.gifshow.profile.profileinstaller.b;

public class a	// class@00159f
{
    public final AssetManager a;
    public final Executor b;
    public final c$c c;
    public final byte[] d;
    public final File e;
    public final String f;
    public final String g;
    public final String h;
    public boolean i;
    public b[] j;
    public byte[] k;

    public void a(AssetManager p0,Executor p1,c$c p2,String p3,String p4,String p5,File p6){
       super();
       this.i = false;
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.f = p3;
       this.g = p4;
       this.h = p5;
       this.e = p6;
       this.d = a.b();
    }
    public static byte[] b(){
       int sDK_INT = Build$VERSION.SDK_INT;
       if (sDK_INT < 24) {
          return null;
       }
       switch (sDK_INT){
           case 24:
           case 25:
             return c.e;
           case 26:
             return c.d;
           case 27:
             return c.c;
           case 28:
           case 30:
           case 29:
             return c.b;
           case 31:
             return c.a;
           default:
             return null;
       }
    }
    public static boolean e(){
       int sDK_INT = Build$VERSION.SDK_INT;
       int i = 24;
       if (sDK_INT < i) {
          return false;
       }
       if (sDK_INT != i && (sDK_INT != 25 && sDK_INT != 31)) {
          return false;
       }
       return true;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       if (this.i != null) {
          return;
       }
       throw new IllegalStateException("This device doesn\'t support aot. Did you call deviceSupportsAotProfile\(\)?");
    }
    public boolean c(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.d == null) {
          this.f(3, Integer.valueOf(Build$VERSION.SDK_INT));
          return false;
       }else if(!this.e.canWrite()){
          this.f(4, objArray);
          return false;
       }else {
          this.i = true;
          return true;
       }
    }
    public a d(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.a();
       if (this.d == null) {
          return this;
       }
       int i = 7;
       try{
          AssetFileDescriptor uAssetFileDe = SplitAssetHelper.openFd(this.a, this.g);
          FileInputStream uFileInputSt = uAssetFileDe.createInputStream();
          this.j = d.l(uFileInputSt, d.h(uFileInputSt, d.a), this.f);
          if (uFileInputSt != null) {
             uFileInputSt.close();
          label_003a :
             uAssetFileDe.close();
          }else {
             goto label_003a ;
          }
       }catch(java.io.FileNotFoundException e3){
          this.c.b(6, e3);
       }catch(java.io.IOException e3){
          this.c.b(i, e3);
       }catch(java.lang.IllegalStateException e3){
          this.c.b(8, e3);
       }
       a tj = this.j;
       if (tj != null && a.e()) {
          try{
             AssetFileDescriptor uAssetFileDe1 = SplitAssetHelper.openFd(this.a, this.h);
             FileInputStream uFileInputSt1 = uAssetFileDe1.createInputStream();
             this.j = d.i(uFileInputSt1, d.h(uFileInputSt1, d.b), this.d, tj);
             if (uFileInputSt1 != null) {
                uFileInputSt1.close();
             }
             uAssetFileDe1.close();
             return this;
          }catch(java.io.FileNotFoundException e0){
             this.c.b(9, e0);
          }catch(java.io.IOException e0){
             this.c.b(i, e0);
          }catch(java.lang.IllegalStateException e2){
             this.j = objArray;
             this.c.b(8, e2);
          }
       label_00c8 :
          return this;
       }else {
          goto label_00c8 ;
       }
    }
    public final void f(int p0,Object p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "1")) {
          return;
       }
       this.b.execute(new a(this, p0, p1));
       return;
    }
    public a g(){
       a obj = PatchProxy.apply(null, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.j;
       a td = this.d;
       if (obj != null && td != null) {
          try{
             this.a();
             ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
             if (PatchProxy.applyVoidTwoRefs(uByteArrayOu, td, null, d.class, "2")) {
             label_0034 :
                if (!d.o(uByteArrayOu, td, obj)) {
                   this.c.b(5, null);
                   this.j = null;
                   uByteArrayOu.close();
                   return this;
                }else {
                   byte[] uobyteArray = uByteArrayOu.toByteArray();
                   try{
                      this.k = uobyteArray;
                      uByteArrayOu.close();
                   }catch(java.lang.IllegalStateException e0){
                      this.c.b(8, e0);
                   }
                }
             }else {
                uByteArrayOu.write(d.a);
                uByteArrayOu.write(td);
                goto label_0034 ;
             }
          }catch(java.io.IOException e0){
             this.c.b(7, e0);
          }catch(java.lang.IllegalStateException e0){
          }
          this.j = null;
       }
       return this;
    }
    public boolean h(){
       a obj = PatchProxy.apply(null, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.k;
       if (obj == null) {
          return false;
       }
       try{
          this.a();
          ByteArrayInputStream uByteArrayIn = new ByteArrayInputStream(obj);
          FileOutputStream uFileOutputS = new FileOutputStream(this.e);
          if (!PatchProxy.applyVoidTwoRefs(uByteArrayIn, uFileOutputS, null, b.class, "16")) {
             byte[] uobyteArray = new byte[512];
             int i = uByteArrayIn.read(uobyteArray);
             while (i > 0) {
                uFileOutputS.write(uobyteArray, false, i);
             }
          }
          this.f(1, null);
          uFileOutputS.close();
          uByteArrayIn.close();
          this.k = null;
          this.j = null;
          return 1;
       }catch(java.io.FileNotFoundException e0){
          this.f(6, e0);
       }catch(java.io.IOException e0){
          this.f(7, e0);
       }
       this.k = null;
       this.j = null;
       return false;
    }
}
