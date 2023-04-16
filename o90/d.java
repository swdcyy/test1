package o90.d;
import java.lang.Runnable;
import com.kuaishou.gifshow.kuaishan.ui.edit.KuaiShanEditActivityV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class d implements Runnable	// class@00276e
{
    public final KuaiShanEditActivityV2 b;

    public void d(KuaiShanEditActivityV2 p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.b.G3();
       return;
    }
}
