package og.t0;
import n3d.a;
import og.b1;
import w26.c;
import java.lang.Object;
import android.content.Intent;
import og.l;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.String;
import q87.c;
import com.yxcorp.gifshow.webview.bridge.JsErrorResult;
import java.lang.StringBuilder;
import og.a1;
import com.feature.post.bridge.util.d;

public final class t0 implements a	// class@0027c2
{
    public final b1 b;
    public final c c;

    public void t0(b1 p0,c p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       t0 tb = this.b;
       t0 tc = this.c;
       l ol = l.D();
       Object[] objArray = new Object[3];
       objArray[0] = Integer.valueOf(p0);
       int i = 1;
       objArray[1] = Integer.valueOf(p1);
       if (p2 == null) {
       }else {
          i = false;
       }
       objArray[2] = Boolean.valueOf(i);
       Object[] objArray1 = new Object[0];
       ol.w("ShopVideoHelper", String.format("onActivityResult request=%d, result=%d, data=%b", objArray), objArray1);
       if (p0 == 19) {
          if (!p1) {
             tb.d(new JsErrorResult(0, "onActivityResult user canceled "));
          }else {
             p0 = -1;
             if (p1 != p0 || p2 == null) {
                a1.a("onActivityResult not ok or null data, result="+p1, tb);
             }else {
                p0 = p2.getIntExtra("video_file_upload_id", p0);
                String stringExtra = p2.getStringExtra("video_cover_file_path");
                if (p0 < 0) {
                   a1.a("onActivityResult invalid upload id, id="+p0, tb);
                }else {
                   d.a(p0, stringExtra, tb, tc);
                }
             }
          }
       }
       return;
    }
}
