package laa.w;
import java.lang.Runnable;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import java.io.File;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.edit.draft.model.b0;

public final class w implements Runnable	// class@002d9f
{
    public final DraftFileManager b;
    public final File c;

    public void w(DraftFileManager p0,File p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       this.b.h.c(this.c.getName());
    }
}
