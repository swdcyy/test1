package e51.b;
import e51.a;
import xq5.c;
import java.lang.Object;
import com.kwai.feature.api.live.base.service.slideplay.LiveWillShowType;
import e51.b$a;
import e51.b$b;
import v12.l;
import androidx.viewpager.widget.ViewPager$i;
import vy6.a;

public class b	// class@0020a4
{
    public final a a;
    public final c b;
    public boolean c;
    public float d;
    public LiveWillShowType e;
    public final a f;
    public final ViewPager$i g;

    public void b(boolean p0,a p1,c p2){
       super();
       this.e = LiveWillShowType.NONE;
       b$a uoa = new b$a(this);
       this.f = uoa;
       b$b uob = new b$b(this);
       this.g = uob;
       this.c = p0;
       this.a = p1;
       this.b = p2;
       p1.c(uob);
       p1.a(uoa);
    }
    public void a(){
       this.e = LiveWillShowType.NONE;
    }
}
