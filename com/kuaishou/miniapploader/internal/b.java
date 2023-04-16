package com.kuaishou.miniapploader.internal.b;
import com.kuaishou.miniapploader.internal.a;
import com.kuaishou.miniapploader.internal.b$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.miniapploader.internal.FileUtilsKt;
import dn4.a;
import android.system.StructStat;
import java.io.File;

public class b implements a	// class@0009ef
{
    public final String a;
    public static final b$a b;

    static {
       b.b = new b$a(null);
    }
    public void b(String p0){
       a.q(p0, "rootDir");
       super();
       this.a = p0;
    }
    public void a(){
       PatchProxy.applyVoid(null, this, b.class, "6");
    }
    public boolean b(String p0){
       String[] obj = PatchProxy.applyOneRefs(p0, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.q(p0, "fileName");
       obj = new String[]{this.a,p0};
       return FileUtilsKt.isFileExist(FileUtilsKt.pathJoin(obj));
    }
    public a c(String p0){
       String[] obj = PatchProxy.applyOneRefs(p0, this, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.q(p0, "fileName");
       obj = new String[]{this.a,p0};
       p0 = FileUtilsKt.pathJoin(obj);
       StructStat structStat = FileUtilsKt.genFileStructStat(p0);
       File uFile = new File(p0);
       a uoa = new a(structStat.st_mode, structStat.st_size, structStat.st_atime, structStat.st_mtime, uFile.isDirectory(), uFile.isFile());
       return p0;
    }
    public String d(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.q(p0, "suffix");
       return this.f("__miniApp.js");
    }
    public byte[] e(String p0){
       String[] obj = PatchProxy.applyOneRefs(p0, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.q(p0, "filename");
       obj = new String[]{this.a,p0};
       return FileUtilsKt.readFileData(FileUtilsKt.pathJoin(obj));
    }
    public String f(String p0){
       String[] obj = PatchProxy.applyOneRefs(p0, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.q(p0, "filename");
       obj = new String[]{this.a,p0};
       return FileUtilsKt.readFileString(FileUtilsKt.pathJoin(obj));
    }
}
