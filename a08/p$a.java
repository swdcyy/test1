package a08.p$a;
import java.lang.Runnable;
import android.view.View;
import a08.p;
import l08.c;
import java.lang.Object;
import n08.a;
import com.kwaishou.merchant.daccore.data.model.PendantMountInfo;
import java.util.Objects;
import g08.a;
import java.lang.Boolean;
import java.lang.StringBuilder;
import java.lang.String;
import com.kwaishou.merchant.daccore.log.DyTroubleShooting;
import java.util.Map;

public final class p$a implements Runnable	// class@000015
{
    public final View b;
    public final p c;
    public final c d;

    public void p$a(View p0,p p1,c p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       a uoa = this.d.f();
       p$a uoa1 = null;
       PendantMountInfo pendantMount = (uoa != null)? uoa.e(): uoa1;
       p$a td = this.d;
       Objects.requireNonNull(this.c);
       int i = 0;
       if (pendantMount != null) {
          if (pendantMount.getDelayUnloadRNViewMills() > 0) {
             i = pendantMount.getDelayUnloadRNViewMills();
          }else if(pendantMount.getAnimationSwitch() && pendantMount.isAnchorYellowCar()){
             i = 500;
          }
       }
       td.k(i);
       p a = this.c.a;
       if (a != null) {
          uoa1 = Boolean.valueOf(a.b(this.b, pendantMount));
       }
       p.b(this.c, this.d, "pendant has unmount: isSuccess:"+uoa1+' ', false, DyTroubleShooting.c.m(), false, 16, null);
       return;
    }
}
