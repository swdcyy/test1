package laa.d0;
import java.util.concurrent.Callable;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import java.io.File;
import java.lang.Object;
import com.yxcorp.gifshow.edit.draft.model.workspace.Phase;

public final class d0 implements Callable	// class@002d7e
{
    public final DraftFileManager b;
    public final File c;

    public void d0(DraftFileManager p0,File p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object call(){
       return this.b.D(this.c);
    }
}
