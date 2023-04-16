package com.kwai.dva.dex2oat.util.Dex2OatFilesUtil;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.io.File;
import java.io.FileInputStream;
import com.kwai.dva.dex2oat.util.Dex2OatFilesUtil$isElfFile$1$compareByteAndChar$1;
import java.lang.Byte;
import java.lang.Character;
import msd.p;
import java.lang.StringBuilder;
import qj7.d;
import qrd.l1;
import java.io.Closeable;
import java.lang.Throwable;
import isd.b;
import com.kwai.dva.dex2oat.util.b;
import android.os.Build$VERSION;
import java.lang.RuntimeException;
import com.kwai.dva.dex2oat.util.a;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import zsd.u;

public final class Dex2OatFilesUtil	// class@000d1d
{
    public static final Dex2OatFilesUtil a;

    static {
       Dex2OatFilesUtil.a = new Dex2OatFilesUtil();
    }
    public void Dex2OatFilesUtil(){
       super();
    }
    public final boolean a(String p0){
       File obj = PatchProxy.applyOneRefs(p0, this, Dex2OatFilesUtil.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "filePath");
       obj = new File(p0);
       int i = 0;
       if (obj.exists() && (obj.isFile() && (obj.canRead() && obj.length() - null > 0))) {
          FileInputStream uFileInputSt = new FileInputStream(obj);
          byte[] uobyteArray = new byte[4];
          uFileInputSt.read(uobyteArray);
          Dex2OatFilesUtil$isElfFile$1$compareByteAndChar$1 iNSTANCE = Dex2OatFilesUtil$isElfFile$1$compareByteAndChar$1.INSTANCE;
          int i1 = 1;
          if (uobyteArray[i] != 127 || (!iNSTANCE.invoke(Byte.valueOf(uobyteArray[i1]), Character.valueOf('E')).booleanValue() || (!iNSTANCE.invoke(Byte.valueOf(uobyteArray[2]), Character.valueOf('L')).booleanValue() || !iNSTANCE.invoke(Byte.valueOf(uobyteArray[3]), Character.valueOf('F')).booleanValue()))) {
             d.c(a.C("isn\'t elf format, ", "0:"+uobyteArray[i]+",1:"+uobyteArray[i1]+",2:"+uobyteArray[2]+",3:"+uobyteArray[3]));
             i1 = 0;
          }
          b.a(uFileInputSt, null);
          if (i1) {
             try{
                new b(obj).close();
                d.c(a.C("is elf file: ", p0));
             }catch(java.lang.Exception e12){
                d.b("new SplitElfFile failed.", e12);
             }
          }
          i = i1;
       }else {
          d.c(a.C("file invalid, ", p0));
       }
    }
    public final boolean b(){
       boolean b = (Build$VERSION.SDK_INT > 25)? true: false;
       return b;
    }
    public final String c(File p0,File p1){
       String str;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, Dex2OatFilesUtil.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "dexFile");
       if (Build$VERSION.SDK_INT > 25) {
          p0 = p0.getParentFile();
          a.m(p0);
          str = a.C(p0.getAbsolutePath(), "/oat");
       }else if(p1 != null){
          str = p1.getAbsolutePath();
          a.o(str, "{\n            if \(optDir¡­ir.absolutePath\n        }");
       }else {
          throw new RuntimeException("optDir must not be null when the sdk version number is less than 26.");
       }
       return str;
    }
    public final String d(File p0,File p1){
       String name;
       File obj = PatchProxy.applyTwoRefs(p0, p1, this, Dex2OatFilesUtil.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "dexFile");
       int i = 0;
       String str = "fileName";
       if (this.b()) {
          try{
             String str1 = a.a.a();
             obj = p0.getParentFile();
             a.m(obj);
             name = p0.getName();
             a.o(name, str);
             int i1 = StringsKt__StringsKt.v3(name, '.', 0, false, 6, null);
             if (i1 > 0) {
                a.o(name, str);
                name = name.substring(i, i1);
                a.o(name, "\(this as java.lang.Strin¡­ing\(startIndex, endIndex\)");
             }
             return obj.getAbsolutePath()+"/oat/"+str1+'/'+name+".odex";
          }catch(java.lang.Exception e10){
             throw new RuntimeException("getCurrentInstructionSet fail:", e10);
          }
       }else if(p1 != null){
          name = p0.getName();
          a.o(name, str);
          if (!u.H1(name, ".dex", i, 2, null)) {
             a.o(name, str);
             int i2 = StringsKt__StringsKt.w3(name, ".", 0, false, 6, null);
             name = (i2 < 0)? a.C(name, ".dex"): new StringBuilder((i2 + 4))+name+".dex";
          }
       label_00b2 :
          name = new File(p1, name).getPath();
          a.o(name, "result.path");
          return name;
       }else {
          throw new RuntimeException("optDir must not be null when the sdk version number is less than 26.");
       }
    }
}
