package c1d.a;
import n3d.a;
import com.yxcorp.login.bind.BindPhoneControllerActivity;
import java.lang.Object;
import android.content.Intent;
import com.yxcorp.gifshow.activity.GifshowActivity;

public final class a implements a	// class@0004c4
{
    public final BindPhoneControllerActivity b;

    public void a(BindPhoneControllerActivity p0){
       this.b = p0;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       this.b.finish();
    }
}
