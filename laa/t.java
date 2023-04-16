package laa.t;
import java.lang.Runnable;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import android.content.Context;
import java.lang.Object;
import java.util.Objects;
import java.io.File;
import java.lang.String;
import haa.f;
import q87.c;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager$DraftFileException;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import java.lang.StringBuilder;
import qkd.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import mrd.a;

public final class t implements Runnable	// class@002d9c
{
    public final DraftFileManager b;
    public final Context c;

    public void t(DraftFileManager p0,Context p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       File dir;
       t tb = this.b;
       t tc = this.c;
       Objects.requireNonNull(tb);
       File uFile = new File(tc.getFilesDir(), "workspace");
       if (DraftFileManager.c0(tb.a)) {
          DraftFileManager.d0(uFile, tb.a);
       }else {
          Object[] objArray3 = new Object[0];
          String str = "Failed to create workspace dir in sdcard, fallback to private.";
          f.D().A("DraftFileManager", str, objArray3);
          ExceptionHandler.handleCaughtException(new DraftFileManager$DraftFileException(str));
          tb.a = uFile;
          DraftFileManager.c0(uFile);
       }
       uFile = new File(tc.getFilesDir(), ".post");
       if (DraftFileManager.c0(tb.b)) {
          Object[] objArray = new Object[0];
          f.D().A("DraftFileManager", "initWorkspaceDirectory delete "+uFile, objArray);
          b.q(uFile);
       }else {
          Object[] objArray2 = new Object[0];
          f.D().A("DraftFileManager", "Failed to create .post dir in sdcard, fallback to private.", objArray2);
          ExceptionHandler.handleCaughtException(new DraftFileManager$DraftFileException("Failed to create .post dir in sdcard, fallback to private."));
          tb.b = uFile;
          DraftFileManager.c0(uFile);
       }
       if (!PatchProxy.applyVoidOneRefs(tc, tb, DraftFileManager.class, "12")) {
          Object[] objArray1 = new Object[0];
          f.D().w("DraftFileManager", "migrateLegacyFiles", objArray1);
          DraftFileManager.d0(tc.getDir("workspace", 0), tb.a);
          dir = tc.getDir(".post", 0);
          try{
             b.b(dir);
          }catch(java.io.IOException e1){
             f.D().z("DraftFileManager", "error", e1);
          }
       }
    }
}
