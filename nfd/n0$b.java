package nfd.n0$b;
import nfd.n0$i;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import nfd.m0;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lnc.a1;

public class n0$b extends n0$i	// class@001dd5
{

    public void n0$b(View p0,ImageView p1,TextView p2,m0 p3){
       super(p0, p1, p2, p3);
    }
    public int e(){
       return 0x7f081e5f;
    }
    public int f(int p0){
       return p0;
    }
    public String h(){
       Object obj = PatchProxy.apply(null, this, n0$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a1.p(0x7f102a87);
    }
}
