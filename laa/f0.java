package laa.f0;
import java.util.concurrent.Callable;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import java.io.File;
import java.lang.Object;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager$DraftFileException;
import java.lang.StringBuilder;
import java.lang.String;
import com.yxcorp.gifshow.edit.draft.model.DraftEditException;

public final class f0 implements Callable	// class@002d82
{
    public final DraftFileManager b;
    public final File c;
    public final int d;

    public void f0(DraftFileManager p0,File p1,int p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object call(){
       f0 tc = this.c;
       f0 td = this.d;
       c uoc = this.b.a0(tc);
       if (uoc == null) {
          throw new DraftEditException("Invalid workspace at "+tc.getAbsolutePath());
       }
       if (td != null) {
          boolean b = true;
          if (td != b) {
             b = false;
          }
          if (!DraftFileManager.o0(uoc, b)) {
             throw new DraftFileManager$DraftFileException("Invalid asset file at "+tc.getAbsolutePath());
          }
       }
       return uoc;
    }
}
