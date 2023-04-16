package com.kuaishou.gifshow.files.FileManagerPriorPrivate$_cacheRootDir$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.gifshow.files.FileManagerPriorPrivate;
import java.io.File;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import k80.a;
import com.kuaishou.gifshow.files.a;
import qrd.l1;

public final class FileManagerPriorPrivate$_cacheRootDir$1 extends Lambda implements a	// class@00083b
{
    public final FileManagerPriorPrivate this$0;

    public void FileManagerPriorPrivate$_cacheRootDir$1(FileManagerPriorPrivate p0){
       this.this$0 = p0;
       super(0);
    }
    public final File invoke(){
       FileManagerPriorPrivate$_cacheRootDir$1 obj = PatchProxy.apply(null, this, FileManagerPriorPrivate$_cacheRootDir$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.this$0;
       File uFile = obj.s().c();
       a.a(uFile);
       return obj.t(uFile, "cacheRoot");
    }
    public Object invoke(){
       return this.invoke();
    }
}
