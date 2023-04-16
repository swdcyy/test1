package ata.e;
import erd.g;
import ata.d;
import java.lang.Object;
import com.trello.rxlifecycle3.android.FragmentEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wq6.h;

public final class e implements g	// class@0002fd
{
    public final d b;

    public void e(d p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
       }else {
          e tb = this.b;
          boolean b = tb.k.isSelected();
          boolean b1 = (p0 == FragmentEvent.RESUME)? true: false;
          tb.e(b, b1);
       }
       return;
    }
}
