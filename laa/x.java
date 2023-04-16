package laa.x;
import java.lang.Runnable;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.util.List;
import java.lang.Object;
import java.io.File;
import laa.m0;
import haa.f;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;
import java.util.Collection;
import qkd.b;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;

public final class x implements Runnable	// class@002da0
{
    public final c b;
    public final List c;

    public void x(c p0,List p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       Object[] objArray;
       x tc = this.c;
       File uFile = this.b.f0();
       int i = 0;
       if (!uFile.exists()) {
          objArray = new Object[i];
          f.D().w("DraftFileManager", "setPairIdentifiers create dirFile: "+uFile.mkdirs(), objArray);
       }
       File uFile1 = new File(uFile, ".pair");
       if (!uFile1.exists()) {
          objArray = new Object[i];
          f.D().w("DraftFileManager", "setPairIdentifiers createNewFile: "+uFile1.createNewFile(), objArray);
       }
       Object[] objArray1 = new Object[i];
       f.D().w("DraftFileManager", "setPairIdentifiers write: "+uFile1+": "+tc, objArray1);
       b.u0(uFile1, tc);
       return;
    }
}
