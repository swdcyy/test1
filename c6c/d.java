package c6c.d;
import android.content.DialogInterface$OnClickListener;
import com.yxcorp.gifshow.protector.ProtectorDialogActivity;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;

public class d implements DialogInterface$OnClickListener	// class@000539
{
    public final ProtectorDialogActivity b;

    public void d(ProtectorDialogActivity p0){
       this.b = p0;
       super();
    }
    public void onClick(DialogInterface p0,int p1){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, d.class, "1")) {
          return;
       }
       this.b.u3(true);
       return;
    }
}
