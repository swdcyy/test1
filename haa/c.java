package haa.c;
import java.util.concurrent.Callable;
import java.util.List;
import maa.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Object;
import com.kuaishou.edit.draft.Asset;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import java.lang.String;
import com.yxcorp.gifshow.edit.draft.model.c;
import java.io.File;
import haa.f;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.media.a;
import java.lang.Double;
import java.lang.Throwable;

public final class c implements Callable	// class@0025f0
{
    public final List b;
    public final a c;
    public final c d;
    public final List e;

    public void c(List p0,a p1,c p2,List p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final Object call(){
       float f;
       c tb = this.b;
       c tc = this.c;
       c td = this.d;
       c te = this.e;
       int i = 0;
       while (i < tb.size()) {
          Asset uAsset = tb.get(i);
          File uFile = DraftFileManager.E().B(uAsset.getFile(), tc);
          if (uFile == null) {
             Object[] objArray = new Object[0];
             f.D().s("DraftUtils", "Asset file not found: "+uAsset.getFile()+", workspace "+td.D0(), objArray);
          }else {
             try{
                f = (float)new a(uFile, 0, 0).a() / 1000.00f;
                te.add(Double.valueOf((double)f));
             }catch(java.io.IOException e6){
                f.D().z("DraftUtils", "error", e6);
             }
          }
          i = i + 1;
       }
       return te;
    }
}
