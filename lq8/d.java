package lq8.d;
import w4.j;
import com.tachikoma.plugin.TKLottieImageView;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Boolean;
import com.tkruntime.v8.JsValueRef;

public final class d implements j	// class@002d96
{
    public final TKLottieImageView a;

    public void d(TKLottieImageView p0){
       this.a = p0;
    }
    public final void onResult(Object p0){
       d ta = this.a;
       ta.executeCallback(ta.w, Boolean.FALSE);
    }
}
