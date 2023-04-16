package com.kuaishou.gifshow.files.FileManagerPriorPrivate$_tmpDir$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.gifshow.files.FileManagerPriorPrivate;
import java.io.File;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import qrd.l1;

public final class FileManagerPriorPrivate$_tmpDir$1 extends Lambda implements a	// class@000840
{
    public final FileManagerPriorPrivate this$0;

    public void FileManagerPriorPrivate$_tmpDir$1(FileManagerPriorPrivate p0){
       this.this$0 = p0;
       super(0);
    }
    public final File invoke(){
       Object obj = PatchProxy.apply(null, this, FileManagerPriorPrivate$_tmpDir$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       File uFile = new File(this.this$0.b(), ".files");
       uFile.mkdirs();
       return this.this$0.t(uFile, "tmp");
    }
    public Object invoke(){
       return this.invoke();
    }
}
