package com.kuaishou.miniapploader.internal.PackageFileLoader;
import com.kuaishou.miniapploader.internal.a;
import vsd.n;
import kotlin.jvm.internal.PropertyReference1Impl;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import vsd.h;
import java.lang.String;
import kotlin.jvm.internal.PropertyReference1;
import vsd.p;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kuaishou.miniapploader.internal.PackageParser;
import com.kuaishou.miniapploader.internal.PackageFileLoader$fileNames$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.miniapploader.PackageException;
import java.util.List;
import dn4.a;
import android.system.StructStat;
import com.kuaishou.miniapploader.internal.FileUtilsKt;
import java.lang.Number;
import java.io.IOException;
import java.lang.StringBuilder;
import zsd.d;
import java.nio.charset.Charset;
import zsd.u;
import java.util.Iterator;

public final class PackageFileLoader implements a	// class@0009eb
{
    public final PackageParser a;
    public final p b;
    public final String c;
    public static final n[] d;

    static {
       n[] onArray = new n[]{m0.r(new PropertyReference1Impl(m0.d(PackageFileLoader.class), "fileNames", "getFileNames\(\)Ljava/util/List;"))};
       PackageFileLoader.d = onArray;
    }
    public void PackageFileLoader(String p0,int p1,int p2){
       a.q(p0, "packagePath");
       super();
       this.c = p0;
       this.a = new PackageParser(p0, p1, p2);
       this.b = s.c(new PackageFileLoader$fileNames$2(this));
    }
    public void a(){
       Object[] objArray = null;
       String str = "8";
       if (PatchProxy.applyVoid(objArray, this, PackageFileLoader.class, str)) {
          return;
       }
       PackageFileLoader ta = this.a;
       Objects.requireNonNull(ta);
       Object obj = PatchProxy.apply(objArray, ta, PackageParser.class, str);
       boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): ta.nativeParse(ta.a);
       if (b) {
          return;
       }else {
          PackageException packageExcep = this.a.a();
          a.h(packageExcep, "packageParser.exception");
          throw packageExcep;
       }
    }
    public boolean b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PackageFileLoader.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.q(p0, "fileName");
       p0 = this.g(p0);
       if (this.h().contains(p0)) {
          return true;
       }
       return this.i(p0);
    }
    public a c(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj = PatchProxy.applyOneRefs(p0, this, PackageFileLoader.class, "7");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.q(p0, "fileName");
       obj = this.g(p0);
       if (!this.b(obj)) {
          throw new IOException(p0+" not found");
       }
       StructStat structStat = FileUtilsKt.genFileStructStat(this.c);
       PackageFileLoader ta = this.a;
       Objects.requireNonNull(ta);
       Object obj1 = PatchProxy.applyOneRefs(obj, ta, PackageParser.class, "2");
       long l = (obj1 != patchProxyRe)? obj1.longValue(): (long)ta.nativeGetFileSize(ta.a, obj);
       boolean b = this.i(obj);
       if (b) {
          l = structStat.st_blksize;
       }
       a uoa = new a(structStat.st_mode, l, structStat.st_atime, structStat.st_mtime, b, (b ^ 0x01));
       return patchProxyRe;
    }
    public String d(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "4";
       PackageFileLoader obj = PatchProxy.applyOneRefs(p0, this, PackageFileLoader.class, str);
       if (obj != patchProxyRe) {
          return obj;
       }
       a.q(p0, "suffix");
       obj = this.a;
       Objects.requireNonNull(obj);
       byte[] uobyteArray = PatchProxy.applyOneRefs(p0, obj, PackageParser.class, str);
       if (uobyteArray != patchProxyRe) {
       }else {
          uobyteArray = obj.nativeGetCombinedFileData(obj.a, p0);
       }
       if (uobyteArray != null) {
          return new String(uobyteArray, d.a);
       }else {
          PackageException packageExcep = this.a.a();
          a.h(packageExcep, "packageParser.exception");
          throw packageExcep;
       }
    }
    public byte[] e(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "3";
       String obj = PatchProxy.applyOneRefs(p0, this, PackageFileLoader.class, str);
       if (obj != patchProxyRe) {
          return obj;
       }
       a.q(p0, "filename");
       obj = this.g(p0);
       if (!this.b(obj)) {
          throw new IOException(p0+" not found");
       }
       PackageFileLoader ta = this.a;
       Objects.requireNonNull(ta);
       byte[] uobyteArray = PatchProxy.applyOneRefs(obj, ta, PackageParser.class, str);
       if (uobyteArray != patchProxyRe) {
       }else {
          uobyteArray = ta.nativeGetFileData(ta.a, obj);
       }
       return uobyteArray;
    }
    public String f(String p0){
       String obj = PatchProxy.applyOneRefs(p0, this, PackageFileLoader.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.q(p0, "filename");
       byte[] uobyteArray = this.e(p0);
       obj = (uobyteArray != null)? new String(uobyteArray, d.a): null;
       return obj;
    }
    public final String g(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PackageFileLoader.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!u.q2(p0, "/", false, 2, null)) {
          p0 = '/'+p0;
       }
       return p0;
    }
    public final List h(){
       Object obj = PatchProxy.apply(null, this, PackageFileLoader.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getValue();
    }
    public final boolean i(String p0){
       Iterator obj = PatchProxy.applyOneRefs(p0, this, PackageFileLoader.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       p0 = this.g(p0);
       if (!u.H1(p0, "/", false, 2, null)) {
          p0 = p0+'/';
       }
       obj = this.h().iterator();
       while (true) {
          if (!obj.hasNext()) {
             return false;
          }
          String str = obj.next();
          a.h(str, "item");
          if (u.q2(str, p0, false, 2, null)) {
             break ;
          }
       }
       return true;
    }
}
