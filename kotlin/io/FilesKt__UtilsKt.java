package kotlin.io.FilesKt__UtilsKt;
import isd.l;
import java.io.File;
import msd.p;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import kotlin.io.NoSuchFileException;
import nsd.u;
import kotlin.io.OnErrorAction;
import isd.h;
import kotlin.io.FilesKt__UtilsKt$copyRecursively$2;
import java.util.Iterator;
import kotlin.io.FileAlreadyExistsException;
import java.io.IOException;
import kotlin.io.FilesKt__UtilsKt$copyRecursively$1;
import kotlin.io.FileSystemException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import isd.a;
import java.io.Closeable;
import java.lang.Throwable;
import isd.b;
import java.lang.StringBuilder;
import wsd.m;
import isd.g;
import isd.k;
import java.util.List;
import kotlin.text.StringsKt__StringsKt;
import zsd.u;
import java.lang.Iterable;
import java.lang.CharSequence;
import msd.l;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.ArrayList;
import java.lang.IllegalArgumentException;
import java.lang.Math;
import java.lang.Appendable;

public class FilesKt__UtilsKt extends l	// class@001c92
{

    public void FilesKt__UtilsKt(){
       super();
    }
    public static final boolean N(File p0,File p1,boolean p2,p p3){
       a.p(p0, "$this$copyRecursively");
       a.p(p1, "target");
       a.p(p3, "onError");
       boolean b = true;
       if (!p0.exists()) {
          NoSuchFileException noSuchFileEx = new NoSuchFileException(p0, null, "The source file doesn\'t exist.", 2, null);
          OnErrorAction onErrorActio = p3.invoke(p0, p1);
          if (onErrorActio == OnErrorAction.TERMINATE) {
             b = false;
          }
          return b;
       }else {
          try{
             Iterator iterator = l.M(p0).e(new FilesKt__UtilsKt$copyRecursively$2(p3)).iterator();
             while (true) {
                if (!iterator.hasNext()) {
                   return b;
                }
                File uFile = iterator.next();
                if (!uFile.exists()) {
                   NoSuchFileException noSuchFileEx1 = new NoSuchFileException(uFile, null, "The source file doesn\'t exist.", 2, null);
                   if (p3.invoke(uFile, v10) == OnErrorAction.TERMINATE) {
                      break ;
                   }
                }else {
                   File uFile1 = new File(p1, FilesKt__UtilsKt.n0(uFile, p0));
                   if (uFile1.exists() && (!uFile.isDirectory() || !uFile1.isDirectory())) {
                      if (p2) {
                         if (uFile1.isDirectory()) {
                            if (FilesKt__UtilsKt.V(uFile1)) {
                            }
                         }else if(!uFile1.delete()){
                         }
                      }
                   label_0087 :
                      FileAlreadyExistsException uFileAlready = 1;
                   label_009e :
                      if (uFileAlready) {
                         if (p3.invoke(uFile1, new FileAlreadyExistsException(uFile, uFile1, "The destination file already exists.")) == OnErrorAction.TERMINATE) {
                            return false;
                         }
                      }
                   }
                label_00b2 :
                   if (uFile.isDirectory()) {
                      uFile1.mkdirs();
                   }else if(FilesKt__UtilsKt.Q(uFile, uFile1, p2, 0, 4, null).length() - uFile.length() && p3.invoke(uFile, new IOException("Source file wasn\'t copied completely, length of destination file differs.")) == OnErrorAction.TERMINATE){
                      return false;
                   }
                }
             }
             return false;
          }catch(kotlin.io.TerminateException e0){
             return false;
          }
       }
    }
    public static boolean O(File p0,File p1,boolean p2,p p3,int p4,Object p5){
       FilesKt__UtilsKt$copyRecursively$1 iNSTANCE;
       if (p4 & 0x02) {
          p2 = false;
       }
       if (p4 & 0x04) {
          iNSTANCE = FilesKt__UtilsKt$copyRecursively$1.INSTANCE;
       }
       return FilesKt__UtilsKt.N(p0, p1, p2, iNSTANCE);
    }
    public static final File P(File p0,File p1,boolean p2,int p3){
       a.p(p0, "$this$copyTo");
       a.p(p1, "target");
       if (p0.exists()) {
          if (p1.exists()) {
             if (p2) {
                if (!p1.delete()) {
                   throw new FileAlreadyExistsException(p0, p1, "Tried to overwrite the destination, but failed to delete it.");
                }
             }else {
                throw new FileAlreadyExistsException(p0, p1, "The destination file already exists.");
             }
          }
          if (p0.isDirectory()) {
             if (!p1.mkdirs()) {
                throw new FileSystemException(p0, p1, "Failed to create target directory.");
             }
          }else {
             File parentFile = p1.getParentFile();
             if (parentFile != null) {
                parentFile.mkdirs();
             }
             FileInputStream uFileInputSt = new FileInputStream(p0);
             FileOutputStream uFileOutputS = new FileOutputStream(p1);
             a.k(uFileInputSt, uFileOutputS, p3);
             b.a(uFileOutputS, null);
             b.a(uFileInputSt, null);
          }
          return p1;
       }else {
          NoSuchFileException noSuchFileEx = new NoSuchFileException(p0, null, "The source file doesn\'t exist.", 2, null);
          throw p1;
       }
    }
    public static File Q(File p0,File p1,boolean p2,int p3,int p4,Object p5){
       if (p4 & 0x02) {
          p2 = false;
       }
       if (p4 & 0x04) {
          p3 = 8192;
       }
       return FilesKt__UtilsKt.P(p0, p1, p2, p3);
    }
    public static final File R(String p0,String p1,File p2){
       a.p(p0, "prefix");
       File uFile = File.createTempFile(p0, p1, p2);
       uFile.delete();
       if (!uFile.mkdir()) {
          throw new IOException("Unable to create temporary directory "+uFile+'.');
       }
       a.o(uFile, "dir");
       return uFile;
    }
    public static File S(String p0,String p1,File p2,int p3,Object p4){
       if (p3 & 0x01) {
          p0 = "tmp";
       }
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = null;
       }
       return FilesKt__UtilsKt.R(p0, p1, p2);
    }
    public static final File T(String p0,String p1,File p2){
       a.p(p0, "prefix");
       File uFile = File.createTempFile(p0, p1, p2);
       a.o(uFile, "File.createTempFile\(prefix, suffix, directory\)");
       return uFile;
    }
    public static File U(String p0,String p1,File p2,int p3,Object p4){
       if (p3 & 0x01) {
          p0 = "tmp";
       }
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = null;
       }
       return FilesKt__UtilsKt.T(p0, p1, p2);
    }
    public static final boolean V(File p0){
       a.p(p0, "$this$deleteRecursively");
       Iterator iterator = l.L(p0).iterator();
       int i = 1;
       while (true) {
          boolean b = true;
          while (iterator.hasNext()) {
             File uFile = iterator.next();
             if (uFile.delete() || (!uFile.exists() && b)) {
                continue ;
             }else {
                b = false;
             }
          }
          return b;
       }
    }
    public static final boolean W(File p0,File p1){
       a.p(p0, "$this$endsWith");
       a.p(p1, "other");
       g og = k.f(p0);
       g og1 = k.f(p1);
       if (og1.i()) {
          return a.g(p0, p1);
       }
       boolean i = og.h() - og1.h();
       i = (i < 0)? false: og.g().subList(i, og.h()).equals(og1.g());
       return i;
    }
    public static final boolean X(File p0,String p1){
       a.p(p0, "$this$endsWith");
       a.p(p1, "other");
       return FilesKt__UtilsKt.W(p0, new File(p1));
    }
    public static final String Y(File p0){
       a.p(p0, "$this$extension");
       String name = p0.getName();
       a.o(name, "name");
       return StringsKt__StringsKt.c5(name, '.', "");
    }
    public static final String Z(File p0){
       String path;
       String str;
       a.p(p0, "$this$invariantSeparatorsPath");
       if (File.separatorChar != '/') {
          path = p0.getPath();
          a.o(path, "path");
          str = u.f2(path, File.separatorChar, '/', false, 4, null);
       }else {
          str = p0.getPath();
          a.o(str, "path");
       }
       return str;
    }
    public static final String a0(File p0){
       a.p(p0, "$this$nameWithoutExtension");
       String name = p0.getName();
       a.o(name, "name");
       return StringsKt__StringsKt.n5(name, ".", null, 2, null);
    }
    public static final File b0(File p0){
       a.p(p0, "$this$normalize");
       g og = k.f(p0);
       File uFile = og.e();
       String separator = File.separator;
       a.o(separator, "File.separator");
       return FilesKt__UtilsKt.i0(uFile, CollectionsKt___CollectionsKt.V2(FilesKt__UtilsKt.d0(og.g()), separator, null, null, 0, null, null, 62, null));
    }
    public static final g c0(g p0){
       return new g(p0.e(), FilesKt__UtilsKt.d0(p0.g()));
    }
    public static final List d0(List p0){
       ArrayList uArrayList = new ArrayList(p0.size());
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          File uFile = iterator.next();
          String name = uFile.getName();
          if (name != null) {
             int i = name.hashCode();
             if (i != 46) {
                if (i == 1472) {
                   String str = "..";
                   if (name.equals(str)) {
                      if (!uArrayList.isEmpty()) {
                         int i1 = a.g(CollectionsKt___CollectionsKt.Y2(uArrayList).getName(), str) ^ 0x01;
                         if (i1) {
                            int i2 = uArrayList.size() - 1;
                            uArrayList.remove(i2);
                         }
                      }
                      uArrayList.add(uFile);
                   }
                }
             }else if(name.equals(".")){
                continue ;
             }
          }
          uArrayList.add(uFile);
       }
       return uArrayList;
    }
    public static final File e0(File p0,File p1){
       a.p(p0, "$this$relativeTo");
       a.p(p1, "base");
       return new File(FilesKt__UtilsKt.n0(p0, p1));
    }
    public static final File f0(File p0,File p1){
       a.p(p0, "$this$relativeToOrNull");
       a.p(p1, "base");
       String str = FilesKt__UtilsKt.o0(p0, p1);
       p1 = (str != null)? new File(str): null;
       return p1;
    }
    public static final File g0(File p0,File p1){
       a.p(p0, "$this$relativeToOrSelf");
       a.p(p1, "base");
       String str = FilesKt__UtilsKt.o0(p0, p1);
       if (str != null) {
          p0 = new File(str);
       }
       return p0;
    }
    public static final File h0(File p0,File p1){
       a.p(p0, "$this$resolve");
       a.p(p1, "relative");
       if (k.d(p1)) {
          return p1;
       }
       String str = p0.toString();
       a.o(str, "this.toString\(\)");
       boolean b = false;
       char c = (!str.length())? 1: 0;
       File uFile = (c || StringsKt__StringsKt.R2(str, File.separatorChar, b, 2, null))? new File(str+p1): new File(str+File.separatorChar+p1);
       return uFile;
    }
    public static final File i0(File p0,String p1){
       a.p(p0, "$this$resolve");
       a.p(p1, "relative");
       return FilesKt__UtilsKt.h0(p0, new File(p1));
    }
    public static final File j0(File p0,File p1){
       a.p(p0, "$this$resolveSibling");
       a.p(p1, "relative");
       g og = k.f(p0);
       File uFile = (!og.h())? new File(".."): og.j(0, (og.h() - 1));
       return FilesKt__UtilsKt.h0(FilesKt__UtilsKt.h0(og.e(), uFile), p1);
    }
    public static final File k0(File p0,String p1){
       a.p(p0, "$this$resolveSibling");
       a.p(p1, "relative");
       return FilesKt__UtilsKt.j0(p0, new File(p1));
    }
    public static final boolean l0(File p0,File p1){
       a.p(p0, "$this$startsWith");
       a.p(p1, "other");
       g og = k.f(p0);
       g og1 = k.f(p1);
       boolean b = false;
       if (a.g(og.e(), og1.e()) ^ 0x01) {
          return b;
       }
       if (og.h() >= og1.h()) {
          b = og.g().subList(b, og1.h()).equals(og1.g());
       }
       return b;
    }
    public static final boolean m0(File p0,String p1){
       a.p(p0, "$this$startsWith");
       a.p(p1, "other");
       return FilesKt__UtilsKt.l0(p0, new File(p1));
    }
    public static final String n0(File p0,File p1){
       a.p(p0, "$this$toRelativeString");
       a.p(p1, "base");
       String str = FilesKt__UtilsKt.o0(p0, p1);
       if (str != null) {
          return str;
       }
       throw new IllegalArgumentException("this and base files have different roots: "+p0+" and "+p1+'.');
    }
    public static final String o0(File p0,File p1){
       String str1;
       g og = FilesKt__UtilsKt.c0(k.f(p0));
       g og1 = FilesKt__UtilsKt.c0(k.f(p1));
       if (a.g(og.e(), og1.e()) ^ 0x01) {
          return null;
       }
       int i = og1.h();
       int i1 = og.h();
       int i2 = 0;
       int i3 = Math.min(i1, i);
       while (i2 < i3 && a.g(og.g().get(i2), og1.g().get(i2))) {
          i2 = i2 + 1;
       }
       StringBuilder str = "";
       int i4 = i - 1;
       if (i4 >= i2) {
          while (true) {
             str1 = "..";
             if (a.g(og1.g().get(i4).getName(), str1)) {
                return null;
             }
             str = str+str1;
             if (i4 != i2) {
                str = str+File.separatorChar;
             }
             if (i4 != i2) {
                i4 = i4 - 1;
             }
          }
       }
       if (i2 < i1) {
          if (i2 < i) {
             str = str+File.separatorChar;
          }
          str1 = File.separator;
          a.o(str1, "File.separator");
          CollectionsKt___CollectionsKt.T2(CollectionsKt___CollectionsKt.N1(og.g(), i2), str, str1, null, null, 0, null, null, 124, null);
       }
       return str;
    }
}
