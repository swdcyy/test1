package g7a.w;
import hka.a;
import com.yxcorp.gifshow.detail.slideplay.presenter.comment.d;
import java.lang.Object;
import com.kwai.component.tabs.panel.a;

public final class w implements a	// class@002403
{
    public final d b;

    public void w(d p0){
       this.b = p0;
    }
    public final boolean onBackPressed(){
       boolean b;
       w tb = this.b;
       d x = tb.X;
       if (x != null && x.d()) {
          tb.R8();
          b = true;
       }else {
          b = false;
       }
       return b;
    }
}
