package bl8.b$a;
import oy5.c;
import bl8.b;
import java.lang.Object;
import qy5.d;
import java.lang.String;
import wkd.b;
import zk8.b;
import com.search.common.entity.PresetPageSource;
import brd.t;
import t45.d;
import brd.z;
import cjd.e;
import erd.o;
import bl8.a;
import com.gifshow.tuna.player.poi.e;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class b$a implements c	// class@00042b
{
    public final b a;

    public void b$a(b p0){
       this.a = p0;
       super();
    }
    public void F2(){
       b$a ta = this.a;
       ta.p = ta.q.getPresetRequestExtParams();
       ta.X7(b.a(-362955604).a(8, PresetPageSource.DEFAULT.mPageSource, ta.p).observeOn(d.c).map(new e()).observeOn(d.a).subscribe(new a(ta), e.b));
    }
}
