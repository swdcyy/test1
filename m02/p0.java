package m02.p0;
import msd.a;
import com.kuaishou.live.core.basic.activity.LivePlayFragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import java.lang.Object;
import qrd.l1;

public final class p0 implements a	// class@0030d5
{
    public final LivePlayFragment b;
    public final LayoutInflater c;
    public final ViewGroup d;
    public final Bundle e;

    public void p0(LivePlayFragment p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final Object invoke(){
       return LivePlayFragment.oh(this.b, this.c, this.d, this.e);
    }
}
