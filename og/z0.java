package og.z0;
import pm6.e$b;
import com.feature.post.bridge.jsmodel.JsUploadVideoParams;
import r16.f;
import og.b1;
import w26.c;
import java.lang.Object;
import pm6.g;
import java.util.List;
import java.lang.String;
import java.lang.Integer;
import com.feature.post.bridge.util.d;
import com.yxcorp.gifshow.webview.bridge.JsErrorResult;
import java.lang.Exception;
import lnc.a1;
import com.kwai.plugin.dva.work.c$c;
import sj7.d;

public class z0 implements e$b	// class@0027ce
{
    public final JsUploadVideoParams a;
    public final f b;
    public final b1 c;
    public final c d;

    public void z0(JsUploadVideoParams p0,f p1,b1 p2,c p3){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public boolean c(){
       return g.a(this);
    }
    public void j(List p0){
       int i = Integer.valueOf(this.a.mUploadId).intValue();
       if (this.b.o1(i, false, true)) {
          d.a(i, "", this.c, this.d);
       }else {
          this.c.d(new JsErrorResult(412, "reUploadShopVideoReal error: retry failed"));
       }
       return;
    }
    public void onFailed(Exception p0){
       this.c.d(new JsErrorResult(412, a1.p(R.string.arg_RES_7f1042c6)));
    }
    public void onProgress(float p0){
       g.c(this, p0);
    }
    public void onStart(){
       d.a(this);
    }
    public void onSucceed(Object p0){
       this.j(p0);
    }
}
