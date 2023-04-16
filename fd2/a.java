package fd2.a;
import android.content.DialogInterface$OnClickListener;
import brd.v;
import java.lang.Object;
import android.content.DialogInterface;
import com.kuaishou.live.core.show.photoalbum.LiveEntryCoverSelectSupplier$SelectType;
import brd.g;
import java.lang.String;
import lc2.l;

public final class a implements DialogInterface$OnClickListener	// class@002934
{
    public final v b;

    public void a(v p0){
       this.b = p0;
    }
    public final void onClick(DialogInterface p0,int p1){
       a tb = this.b;
       if (p1 == 0x7f1047dc) {
          tb.onNext(LiveEntryCoverSelectSupplier$SelectType.CAMERA);
          l.a("TAKE");
       }else if(p1 == 0x7f1010ff){
          tb.onNext(LiveEntryCoverSelectSupplier$SelectType.PHOTOALBUM);
          l.a("LOCAL");
       }else {
          l.a("CANCEL");
       }
       tb.onComplete();
       return;
    }
}
