package d19.n;
import erd.g;
import com.yxcorp.gifshow.ad.detail.presenter.player.l;
import h46.q;
import java.lang.Object;
import hn6.c;
import java.util.Objects;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Exception;
import yx.j0;

public final class n implements g	// class@002034
{
    public final l b;
    public final q c;

    public void n(l p0,q p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       n tb = this.b;
       n tc = this.c;
       try{
          Objects.requireNonNull(tb);
          tb.R8(tc);
       }catch(java.lang.Exception e3){
          Object[] objArray = new Object[0];
          j0.f("SourcePhotoDownload", "生产插件调用失败： "+e3.getMessage(), objArray);
       }
       return;
    }
}
