package ky1.f;
import java.lang.Runnable;
import ky1.h;
import com.kuaishou.live.common.core.component.toptemporarymessage.enhance.view.LiveTempEnhanceView;
import java.lang.Object;

public final class f implements Runnable	// class@002e26
{
    public final h b;
    public final LiveTempEnhanceView c;
    public final int d;
    public final Runnable e;

    public void f(h p0,LiveTempEnhanceView p1,int p2,Runnable p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void run(){
       this.b.m(this.c, this.d);
       this.e.run();
    }
}
