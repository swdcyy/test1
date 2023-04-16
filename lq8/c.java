package lq8.c;
import w4.j;
import com.tachikoma.plugin.TKLottieImageView;
import java.lang.Object;
import w4.e;
import java.lang.Boolean;
import com.tkruntime.v8.JsValueRef;

public final class c implements j	// class@002d95
{
    public final TKLottieImageView a;

    public void c(TKLottieImageView p0){
       this.a = p0;
    }
    public final void onResult(Object p0){
       c ta = this.a;
       ta.executeCallback(ta.w, Boolean.TRUE);
    }
}
