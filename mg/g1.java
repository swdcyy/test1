package mg.g1;
import com.yxcorp.utility.i$d;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.post.api.feature.bridge.JsSelectAndUploadMediaParams;
import f55.g;
import java.lang.Object;
import java.lang.String;
import android.app.Activity;
import com.feature.post.bridge.m;
import java.lang.Throwable;
import o56.a;
import android.app.Application;
import android.os.Bundle;

public class g1 implements i$d	// class@0025ff
{
    public final GifshowActivity a;
    public final JsSelectAndUploadMediaParams b;
    public final g c;

    public void g1(GifshowActivity p0,JsSelectAndUploadMediaParams p1,g p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void a(){
    }
    public void b(String p0,int p1){
       m.b(this.a, this.b, p0, this.c);
    }
    public void c(String p0,int p1){
    }
    public void onError(Throwable p0){
       this.c.a(412, a.B.getString(R.string.arg_RES_7f103b10), new Bundle());
    }
}
