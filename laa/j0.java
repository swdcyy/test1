package laa.j0;
import erd.a;
import java.io.File;
import java.util.List;
import java.lang.Object;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import com.yxcorp.gifshow.edit.draft.model.workspace.Phase;
import java.util.Collection;
import java.util.Iterator;
import java.lang.String;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.util.PostUtils;
import qkd.b;
import haa.f;
import q87.c;
import java.io.IOException;
import laa.l0;

public final class j0 implements a	// class@002d8a
{
    public final File b;
    public final List c;
    public final File d;

    public void j0(File p0,List p1,File p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       j0 tb = this.b;
       j0 tc = this.c;
       j0 td = this.d;
       if (tb.exists()) {
          List list = DraftFileManager.W(tb, tc);
          list.removeAll(Phase.getAllNames());
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             String str = iterator.next();
             File uFile = new File(tb, str);
             File uFile1 = new File(td, str);
             StringBuilder str1 = str;
             str = str1+".bak";
             try{
                File uFile2 = new File(td, str);
                PostUtils.c(uFile, uFile2);
                b.q(uFile1);
                b.W(uFile2, uFile1);
                Object[] objArray = new Object[0];
                f.D().w("DraftFileManager", "editing move "+uFile+" "+uFile1, objArray);
             }catch(java.io.IOException e3){
                l0.c("startEdit srcFile: "+uFile+" dstFile: "+uFile1, uFile1.getParent(), e3);
                goto label_001e ;
             }
          }
       }
       Object[] objArray1 = new Object[0];
       f.D().w("DraftFileManager", "startEdit onComplete", objArray1);
       return;
    }
}
