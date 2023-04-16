package b99.e;
import android.view.View$OnLayoutChangeListener;
import b99.f;
import java.lang.Object;
import android.view.View;
import com.yxcorp.gifshow.entity.QPhoto;
import f4a.g0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import b99.g;
import java.lang.Runnable;

public final class e implements View$OnLayoutChangeListener	// class@00039d
{
    public final f b;

    public void e(f p0){
       this.b = p0;
    }
    public final void onLayoutChange(View p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
       e tb = this.b;
       if (g0.a(tb.r)) {
          tb.m8().post(new g(tb));
       }else {
          tb.W8();
          tb.V8();
       }
       return;
    }
}
