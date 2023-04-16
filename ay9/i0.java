package ay9.i0;
import java.lang.Runnable;
import ay9.j0;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.entity.QPhoto;
import i8a.a;
import i8a.a$a;
import i8a.g;

public final class i0 implements Runnable	// class@0002fb
{
    public final j0 b;

    public void i0(j0 p0){
       this.b = p0;
    }
    public final void run(){
       i0 tb = this.b;
       if (tb.d == null) {
          a.c("CaptionShownChecker", tb.b, "页卡已经展示1000ms,Caption还是没有加载出来！！！");
          a$a uoa = new a$a(tb.b.getPhotoId(), tb.b.getCaption(), false, tb.a.r(), 0, tb.a.q());
          a.d(v1);
       }
       return;
    }
}
