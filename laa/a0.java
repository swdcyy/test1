package laa.a0;
import java.lang.Runnable;
import java.io.File;
import com.yxcorp.gifshow.edit.draft.model.workspace.Phase;
import java.lang.Object;
import haa.f;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;
import java.lang.CharSequence;
import qkd.b;
import java.lang.Throwable;

public final class a0 implements Runnable	// class@002d78
{
    public final File b;
    public final Phase c;

    public void a0(File p0,Phase p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       a0 tb = this.b;
       a0 tc = this.c;
       String str = "DraftFileManager";
       try{
          int i = 0;
          if (!tb.exists()) {
             Object[] objArray = new Object[i];
             f.D().w(str, "setPhase create dirFile:"+tb.mkdirs(), objArray);
          }
          File uFile = new File(tb, "flag.txt");
          if (!uFile.exists()) {
             Object[] objArray1 = new Object[i];
             f.D().w(str, "setPhase createNewFile:"+uFile.createNewFile(), objArray1);
          }
          b.q0(uFile, tc.getName());
       }catch(java.io.IOException e0){
          f.D().z(str, "draft error", e0);
       }
       return;
    }
}
