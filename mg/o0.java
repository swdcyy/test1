package mg.o0;
import erd.g;
import com.yxcorp.gifshow.entity.QPhoto;
import android.app.Activity;
import f55.g;
import java.lang.Object;
import w26.c;
import yic.q0;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.String;
import com.yxcorp.gifshow.webview.bridge.JsSuccessResult;

public final class o0 implements g	// class@002642
{
    public final QPhoto b;
    public final Activity c;
    public final g d;

    public void o0(QPhoto p0,Activity p1,g p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       o0 tb = this.b;
       o0 tc = this.c;
       o0 td = this.d;
       if (q0.a(tb)) {
          p0.yW(tc, tb.getPhotoId());
       }else {
          tb.updateLocalFileIfAny();
          p0.p00(tc, tb);
       }
       td.onSuccess(new JsSuccessResult());
       return;
    }
}
