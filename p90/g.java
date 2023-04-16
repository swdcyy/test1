package p90.g;
import java.lang.Runnable;
import com.kuaishou.gifshow.kuaishan.ui.edit.videoedit.KuaishanVideoClipFragment;
import java.lang.Object;
import u80.e;
import java.lang.String;
import q87.c;
import com.kuaishou.gifshow.kuaishan.ui.edit.videoedit.b;
import t36.f$a;
import t36.f;
import com.yxcorp.gifshow.models.QMedia;

public final class g implements Runnable	// class@0028f4
{
    public final KuaishanVideoClipFragment b;

    public void g(KuaishanVideoClipFragment p0){
       this.b = p0;
    }
    public final void run(){
       g tb = this.b;
       if (tb.v != null) {
          Object[] objArray = new Object[0];
          e.D().s("KuaishanVideoClipFragment", "startProcessing onComplete", objArray);
          tb.k.s0(b.a);
          tb.fh(tb.o, true);
          tb.eh();
       }
       return;
    }
}
