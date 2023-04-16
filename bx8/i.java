package bx8.i;
import java.util.concurrent.Callable;
import java.util.List;
import maa.a;
import java.lang.Object;
import java.util.ArrayList;
import java.util.Iterator;
import com.kuaishou.edit.draft.Asset;
import com.kuaishou.edit.draft.AuditFrame;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import java.lang.String;
import com.yxcorp.gifshow.edit.draft.model.c;
import java.io.File;

public final class i implements Callable	// class@000477
{
    public final List b;
    public final a c;

    public void i(List p0,a p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object call(){
       i tc = this.c;
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          Iterator iterator1 = iterator.next().getAssetAuditFrameList().iterator();
          while (iterator1.hasNext()) {
             File uFile = DraftFileManager.E().B(iterator1.next().getFile(), tc);
             if (uFile != null && uFile.exists()) {
                uArrayList.add(uFile.getAbsolutePath());
             }
          }
       }
       return uArrayList;
    }
}
