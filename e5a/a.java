package e5a.a;
import com.yxcorp.gifshow.detail.presenter.landscape.entity.LandscapeEntrance;
import com.yxcorp.gifshow.detail.presenter.landscape.entity.SerialOpLandscapeEntrance;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class a	// class@00206e
{
    public final LandscapeEntrance a;
    public final boolean b;
    public boolean c;
    public SerialOpLandscapeEntrance d;

    public void a(LandscapeEntrance p0){
       super(p0, false, false, null, 14, null);
    }
    public void a(LandscapeEntrance p0,boolean p1,boolean p2,SerialOpLandscapeEntrance p3){
       a.p(p0, "landscapeEntrance");
       a.p(p3, "serialOpLandscapeEntrance");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public void a(LandscapeEntrance p0,boolean p1,boolean p2,SerialOpLandscapeEntrance p3,int p4,u p5){
       if (p4 & 0x02) {
          p1 = false;
       }
       if (p4 & 0x04) {
          p2 = false;
       }
       p3 = (p4 & 0x08)? SerialOpLandscapeEntrance.UNKNOWN: null;
       super(p0, p1, p2, p3);
       return;
    }
    public final LandscapeEntrance a(){
       return this.a;
    }
}
