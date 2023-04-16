package com.yxcorp.gifshow.edit.draft.model.y;
import erd.a;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import java.lang.String;
import com.kuaishou.edit.draft.Workspace;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager$d;
import java.io.File;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.util.List;
import java.lang.Object;
import java.util.Objects;
import haa.f;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.Collection;
import com.google.common.collect.o$f;
import com.google.common.collect.o;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.ArrayList;
import qkd.b;
import iaa.a;
import com.yxcorp.gifshow.media.buffer.a;
import com.yxcorp.gifshow.util.PostUtils;
import java.io.IOException;
import laa.l0;
import android.graphics.Bitmap$CompressFormat;
import java.io.FileOutputStream;
import java.io.OutputStream;
import android.graphics.Bitmap;
import ekd.p;
import java.lang.RuntimeException;
import java.lang.Throwable;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Map;
import com.google.protobuf.AbstractMessageLite;
import java.lang.IllegalStateException;
import java.util.Collections;
import java.util.TreeSet;
import laa.s;
import ekd.q$b;
import ekd.q;
import com.yxcorp.gifshow.edit.draft.model.s;
import java.io.FilenameFilter;
import java.lang.System;
import ekd.k1;
import java.util.concurrent.atomic.AtomicLong;
import com.yxcorp.gifshow.edit.draft.model.DraftFileGuard;
import kotlin.jvm.internal.a;
import trd.t0;
import w46.b;
import laa.u;
import java.lang.Runnable;

public final class y implements a	// class@001b1a
{
    public final DraftFileManager b;
    public final String c;
    public final Workspace d;
    public final DraftFileManager$d e;
    public final File f;
    public final boolean g;
    public final File h;
    public final c i;
    public final List j;
    public final boolean k;

    public void y(DraftFileManager p0,String p1,Workspace p2,DraftFileManager$d p3,File p4,boolean p5,File p6,c p7,List p8,boolean p9){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
       this.i = p7;
       this.j = p8;
       this.k = p9;
    }
    public final void run(){
       y oy3;
       y oy4;
       y oy5;
       String str4;
       y oy6;
       Iterator iterator;
       Object[] objArray2;
       String str5;
       String str6;
       String str7;
       Object[] objArray3;
       y oy7;
       String str8;
       File uFile;
       File uFile1;
       f uof;
       int i1;
       int i2;
       Iterator iterator2;
       String str10;
       Object[] objArray4;
       Object[] objArray5;
       Object[] objArray6;
       File uFile2;
       c o;
       boolean i3;
       File[] uFileArray;
       int len;
       int i4;
       object oobject;
       Object[] objArray9;
       c obj;
       File uFile3;
       int i5;
       int i6;
       boolean i7;
       int i8;
       Object[] objArray10;
       y key;
       DraftFileManager$d a;
       OutputStream outputStream;
       y oy = this;
       y b = oy.b;
       y c = oy.c;
       y d = oy.d;
       y e = oy.e;
       y f = oy.f;
       y g = oy.g;
       y h = oy.h;
       y i = oy.i;
       Objects.requireNonNull(b);
       Object[] objArray = new Object[0];
       f.D().w("DraftFileManager", "doSave\(\) "+c+" start saving files", objArray);
       String str = "DraftFileManager";
       String str1 = "doSave\(\) ";
       y oy1 = oy.k;
       y oy2 = oy.j;
       String str2 = "workspace.pb";
       String str3 = " to ";
       if (PatchProxy.applyVoidThreeRefs(d, e, f, 0, DraftFileManager.class, "58")) {
          oy3 = b;
          oy4 = h;
          oy5 = i;
          str4 = str;
          oy6 = g;
       }else if(!f.exists()){
          f.mkdirs();
       }
       HashSet hashSet = new HashSet(o.f(e.c.keySet(), new HashSet(e.d)));
       Iterator iterator3 = e.c.entrySet().iterator();
       while (iterator3.hasNext()) {
          if (hashSet.contains(iterator3.next().getKey())) {
             iterator3.remove();
          }
       }
       iterator3 = e.d.iterator();
       while (iterator3.hasNext()) {
          str5 = iterator3.next();
          if (hashSet.contains(str5)) {
             e.d.remove(str5);
          }
       }
       ArrayList uArrayList = new ArrayList();
       Iterator iterator4 = e.c.entrySet().iterator();
       while (true) {
          if (iterator4.hasNext()) {
             obj = iterator4.next();
             uFile3 = new File(f, obj.getKey());
             Iterator iterator5 = iterator4;
             uFile = new File(f, obj.getKey()+".bak");
             if (uFile.exists()) {
                b.q(uFile);
             }
             OutputStream obj1 = obj.getValue();
             a g1 = obj1.g;
             oy3 = b;
             if (g1 == null && obj1.a != null) {
                File uFile4 = new File(obj1.a);
                if (uFile4.exists()) {
                   try{
                      if (uFile4.isDirectory()) {
                         try{
                            if (obj1.b != null) {
                               b.V(uFile4, uFile);
                               i6 = i;
                            }else {
                               i6 = i;
                               i7 = true;
                               b.e(uFile4, uFile, i7);
                            }
                         }catch(java.io.IOException e0){
                            i6 = i;
                         }
                         i5 = h;
                      }else {
                         i6 = i;
                         if ((obj1.a).endsWith(".bfr")) {
                            try{
                               if (!a.b(obj1.a, uFile.getAbsolutePath())) {
                                  uof = f.D();
                                  str6 = "Failed to copy bfr files.";
                                  Object[] objArray11 = new Object[0];
                                  try{
                                     str10 = str;
                                     uof.A(str10, str6, objArray11);
                                     i8 = str10;
                                     iterator4 = iterator5;
                                     b = oy3;
                                     i = i6;
                                     uFile3 = null;
                                  }catch(java.io.IOException e0){
                                     i7 = str10;
                                  }
                               }
                            }catch(java.io.IOException e0){
                               i7 = str;
                            }
                         }else {
                            i7 = str;
                            if (obj1.b != null) {
                               b.W(uFile4, uFile);
                            label_0191 :
                               i8 = g;
                               i5 = h;
                            }else {
                               DraftFileManager uDraftFileMa = DraftFileManager.E();
                               key = obj.getKey();
                               oy4 = h;
                               Object obj2 = key;
                               key = g;
                               try{
                                  if (uDraftFileMa.e0(obj2, obj1.a)) {
                                     e.a.h0(obj.getKey(), obj1.a);
                                     uArrayList.add(obj.getKey());
                                  }else {
                                     PostUtils.c(uFile4, uFile);
                                  }
                               }catch(java.io.IOException e0){
                               }
                            }
                         }
                      }
                      i7 = str;
                      goto label_0191 ;
                   }catch(java.io.IOException e0){
                      i5 = h;
                      i6 = i;
                   }catch(java.io.IOException e0){
                      goto label_01e3 ;
                   }catch(java.io.IOException e0){
                   }catch(java.io.IOException e0){
                   }
                   i8 = g;
                }else {
                   i5 = h;
                   i6 = i;
                   i7 = str;
                   key = g;
                   objArray10 = new Object[0];
                   f.D().A(i7, "save\(\) not exist file="+obj1.a, objArray10);
                }
             }else {
                i5 = h;
                i6 = i;
                i7 = str;
                key = g;
                if (g1 == 1 && obj1.c != null) {
                   uFile2 = uFile3.getParentFile();
                   if (uFile2 != null && (!uFile2.mkdirs() && !uFile2.isDirectory())) {
                   }else {
                      Bitmap$CompressFormat jPEG = Bitmap$CompressFormat.JPEG;
                      if (b.O(uFile3.getName())) {
                         jPEG = Bitmap$CompressFormat.PNG;
                      }
                      a c2 = obj1.c;
                      if (!PatchProxy.applyVoidThreeRefs(c2, uFile, jPEG, null, DraftFileManager.class, "83")) {
                         try{
                            try{
                               FileOutputStream uFileOutputS = new FileOutputStream(uFile);
                               if (c2.compress(jPEG, DraftFileManager.l, uFileOutputS)) {
                                  p.d(uFileOutputS);
                               }else {
                                  throw new IOException("bitmap compress failure:"+c2.getByteCount());
                               }
                            }catch(java.io.IOException e0){
                            }
                            l0.c("saveBitmapToFile file: "+uFile, uFile.getParent(), e0);
                            p.d(obj1);
                            if (uFile.exists() && !uFile.delete()) {
                               objArray5 = new Object[0];
                               f.D().A(i7, "delete invalid file failure", objArray5);
                            }
                         }catch(java.io.IOException e0){
                            obj1 = null;
                            goto label_02bc ;
                         }
                      }
                      objArray10 = new Object[0];
                      f.D().w(i7, "save\(\) bitmap dst:"+uFile3, objArray10);
                   }
                }else if(g1 == 2 && obj1.d != null){
                   try{
                      uFile2 = uFile3.getParentFile();
                      if (uFile2 != null && (!uFile2.mkdirs() && !uFile2.isDirectory())) {
                      }else {
                         b.t0(uFile, obj1.d);
                      }
                   }catch(java.io.IOException e0){
                      l0.c("writeByteArrayToFile tmpDst: "+uFile, uFile.getParent(), e0);
                   }
                }else if(g1 == 3){
                   PostUtils.D(i7, "save\(\)", new RuntimeException("DraftFileManagersave none resource:"+obj1));
                }
             }
             if (uFile.exists()) {
                try{
                   b.q(uFile3);
                   if (uFile.isDirectory()) {
                      b.V(uFile, uFile3);
                   }else {
                      b.W(uFile, uFile3);
                      objArray10 = new Object[0];
                      f.D().w(i7, "doSave move tmpDst:"+uFile+" to dst:"+uFile3, objArray10);
                   }
                   uArrayList.add(obj.getKey());
                }catch(java.io.IOException e0){
                   l0.c("save\(\) move tmpDst is not exist="+uFile+" to: "+uFile3, uFile3.getPath(), e0);
                }
             }
          }else {
             oy3 = b;
             oy4 = h;
             oy5 = i;
             str4 = str;
             key = g;
             ArrayList uArrayList1 = new ArrayList();
             Iterator iterator6 = e.d.iterator();
             while (iterator6.hasNext()) {
                str7 = iterator6.next();
                a = e.a;
                Objects.requireNonNull(a);
                obj = PatchProxy.applyOneRefs(str7, a, c.class, "3");
                if (obj != PatchProxyResult.class) {
                   i3 = obj.booleanValue();
                }else {
                   obj = a.o;
                   if (obj != null) {
                      str10 = obj.remove(str7);
                      if (str10 != null) {
                         a.i1();
                         objArray10 = new Object[0];
                         f.D().w("WorkspaceDraft", "removeFileMap\(\) "+a.D0()+" path="+str7+" external="+str10, objArray10);
                         i3 = true;
                      }
                   }
                   i3 = false;
                }
                if (i3 || new File(f, str7).delete()) {
                   uArrayList1.add(str7);
                }else {
                   continue ;
                }
             }
             e.d.removeAll(uArrayList1);
             str8 = "workspace.pb.bak";
             try{
                uFile3 = new File(f, str8);
                try{
                   FileOutputStream uFileOutputS1 = new FileOutputStream(uFile3);
                   d.writeTo(uFileOutputS1);
                   objArray3 = new Object[0];
                   f.D().w(str4, "save\(\) write over "+uFile3, objArray3);
                label_04c4 :
                   p.d(outputStream);
                   uFile2 = new File(f, str2);
                   b.k0(uFile3, uFile2);
                   if (!b.S(uFile2)) {
                      PostUtils.D(str4, "save\(\) ", new IllegalStateException("failed rename "+uFile3+str3+uFile2+" MB left="+l0.b()));
                   }
                   iterator = uArrayList.iterator();
                   while (iterator.hasNext()) {
                      e.c.remove(iterator.next());
                   }
                }catch(java.io.IOException e0){
                }
                l0.c("write pb: "+uFile3, uFile3.getParent(), e0);
                goto label_04c4 ;
             }catch(java.io.IOException e0){
                outputStream = null;
                goto label_04ac ;
             }
          }
       }
       if (!e.c.isEmpty()) {
          Object[] objArray1 = new Object[0];
          f.D().A(str4, "doSave\(\) Missing resource files when saving workspace "+c, objArray1);
          iterator = new ArrayList(e.c.entrySet()).iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             objArray2 = new Object[0];
             f.D().A(str4, str1+uEntry.getKey()+" type="+uEntry.getValue(), objArray2);
          }
       }
       str5 = str1;
       if (oy6 != null) {
          str6 = "doSave\(\) Copy ";
          str7 = "doSave\(\) Move ";
          if (oy4.exists()) {
             objArray3 = new Object[0];
             f.D().w(str4, str5+c+" src exist", objArray3);
             oy7 = oy4;
             List list = DraftFileManager.W(oy7, Collections.emptyList());
             List list1 = DraftFileManager.W(f, Collections.emptyList());
             list1.remove("flag.txt");
             TreeSet treeSet = new TreeSet(list1);
             treeSet.removeAll(list);
             treeSet.add(str2);
             str2 = ".pair";
             if (list1.contains(str2)) {
                treeSet.add(str2);
             }
             if (oy5.A0().exists()) {
                treeSet.add(oy5.A0().getName());
             }
             TreeSet treeSet1 = new TreeSet(list);
             treeSet1.removeAll(list1);
             q.c(treeSet1, new s(oy2));
             Iterator iterator1 = treeSet.iterator();
             while (iterator1.hasNext()) {
                try{
                   str8 = iterator1.next();
                   uFile = new File(f, str8);
                   uFile1 = new File(oy7, str8);
                   g = oy1;
                   if (g != null) {
                      try{
                         uof = f.D();
                         StringBuilder str9 = str6;
                         try{
                            iterator2 = iterator1;
                            str10 = str9+uFile.getAbsolutePath()+str3+uFile1.getAbsolutePath();
                            i1 = str5;
                            str9 = 0;
                            objArray4 = new Object[str9];
                            uof.w(str4, str10, objArray4);
                            b.j(uFile, uFile1.getParentFile(), true);
                         }catch(java.io.IOException e0){
                            i1 = str5;
                         }
                      }catch(java.io.IOException e0){
                         i1 = str5;
                         i2 = iterator1;
                      }
                   }else {
                      i1 = str5;
                      iterator2 = iterator1;
                      objArray5 = new Object[0];
                      f.D().w(str4, str7+uFile.getAbsolutePath()+str3+uFile1.getAbsolutePath(), objArray5);
                      b.q(uFile1);
                      b.W(uFile, uFile1);
                   }
                }catch(java.io.IOException e0){
                }
                l0.c("doSave\(\) srcFile: "+uFile+" dstFile: "+uFile1, uFile1.getParent(), e0);
                oy1 = g;
                iterator1 = i2;
                str5 = i1;
             }
             str1 = str5;
             g = oy1;
             treeSet1.addAll(e.d);
             iterator = treeSet1.iterator();
             while (iterator.hasNext()) {
                str6 = iterator.next();
                objArray4 = new Object[0];
                f.D().w(str4, "doSave\(\) Delete "+oy7.getAbsolutePath()+"/"+str6, objArray4);
                b.q(new File(oy7, str6));
             }
             if (g == null) {
                objArray6 = new Object[0];
                f.D().w(str4, "doSave\(\) Remove "+f.getAbsolutePath(), objArray6);
                b.q(f);
             }
          }else {
             str1 = str5;
             oy7 = oy4;
             if (oy1 != null) {
                try{
                   objArray6 = new Object[0];
                   f.D().w(str4, str6+f.getAbsolutePath()+str3+oy7.getAbsolutePath(), objArray6);
                   b.c(f, oy7);
                }catch(java.io.IOException e0){
                   l0.c("doSave finalKeepEditingFiles: "+oy1+" Copy "+f+str3+oy7, oy7.getParent(), e0);
                }
             }else {
                objArray6 = new Object[0];
                f.D().w(str4, str7+f.getAbsolutePath()+str3+oy7.getAbsolutePath(), objArray6);
                b.k0(f, oy7);
             }
          }
       }else {
          str1 = str5;
          oy7 = oy4;
       }
       e.b.set(k1.i());
       oy = oy3;
       oy.f.remove(c);
       DraftFileGuard b1 = DraftFileGuard.b;
       b = oy5;
       o = b.o;
       List list2 = b1.e(b);
       DraftFileGuard uDraftFileGu = DraftFileGuard.class;
       if (PatchProxy.isSupport(uDraftFileGu)) {
          objArray2 = new Object[]{oy7,f,c,o,list2};
          if (!PatchProxy.applyVoid(objArray2, b1, uDraftFileGu, "1")) {
          label_08be :
             a.p(oy7, "dir");
             a.p(f, "dirEdit");
             a.p(c, "id");
             a.p(list2, "guardDirList");
             if (DraftFileGuard.a || !b1.f(c).isFile()) {
                boolean b2 = false;
                DraftFileGuard.a = b2;
                if (b1.j(c)) {
                   objArray = new Object[b2];
                   f.D().w("DraftFileGuard", "recordFilesInfo\(\) already has video changed "+oy7, objArray);
                }else {
                   char c1 = ' ';
                   objArray5 = new Object[0];
                   f.D().w("DraftFileGuard", "recordFilesInfo\(\) "+c+c1+oy7+c1+f, objArray5);
                   Map map = b1.l(c);
                   Map map1 = t0.n0(t0.n0(b1.n(oy7, list2), b1.n(f, list2)), b1.m(o, f, list2));
                   if (map1.isEmpty()) {
                      b1.c(c);
                   }else if(!(a.g(map, map1) ^ 1) || (!PatchProxy.applyVoidTwoRefs(c, map1, b1, uDraftFileGu, "2") && !PostUtils.H(b1.f(c), map1))){
                      Object[] objArray8 = new Object[0];
                      f.D().t("DraftFileGuard", "writeDraftInfoMap\(\) failed id="+c+c1+map1, objArray8);
                   }
                   if (map != null) {
                      i3 = 1;
                      if ((map.isEmpty() ^ i3) == i3 && b1.i(map, map1)) {
                         PostUtils.D("DraftFileGuard", "recordFilesInfo\(\) found a origin file changed! ", new IllegalStateException("old="+map+" new="+map1));
                         b1.p(c);
                      }
                   }
                }
             }
          }
       }else {
          goto label_08be ;
       }
       k1.o(new u(oy, b));
       Object[] objArray7 = new Object[0];
       f.D().w(str4, str1+c+" onComplete lastModify="+oy7.lastModified()+" "+oy7, objArray7);
       return;
    }
}
