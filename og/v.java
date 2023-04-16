package og.v;
import n3d.a;
import og.b1;
import com.feature.post.bridge.util.PostVideoHelper$c;
import java.lang.Object;
import android.content.Intent;
import og.l;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.String;
import q87.c;
import java.util.HashMap;
import com.feature.post.bridge.jsmodel.JsUploadVideoResult;
import java.util.Map;
import ekd.j0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import r26.a;
import r16.f;
import com.yxcorp.gifshow.postwork.PostStatus;
import com.feature.post.bridge.util.PostVideoHelper;
import java.lang.StringBuilder;

public final class v implements a	// class@0027c7
{
    public final b1 b;
    public final PostVideoHelper$c c;

    public void v(b1 p0,PostVideoHelper$c p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       v tb = this.b;
       v tc = this.c;
       l ol = l.D();
       Object[] objArray = new Object[3];
       int i = 0;
       objArray[0] = Integer.valueOf(p0);
       objArray[1] = Integer.valueOf(p1);
       int b = (p2 == null)? true: false;
       objArray[2] = Boolean.valueOf(b);
       Object[] objArray1 = new Object[i];
       ol.w("PostVideoHelper", String.format("onActivityResult request=%d, result=%d, data=%b", objArray), objArray1);
       if (p0 == 19 || (p0 == 291 || p0 == 1006)) {
          String str = "0";
          if (!p1) {
             HashMap hashMap = new HashMap();
             hashMap.put("progress", str);
             tb.a(new JsUploadVideoResult(hashMap, i));
          }else if(p1 != -1 || p2 == null){
             PostVideoHelper.h("onActivityResult not ok or null data, result="+p1, tb);
          }else {
             b = j0.b(p2, "video_file_upload_id", -1);
             HashMap hashMap1 = new HashMap();
             hashMap1.put("filePath", j0.f(p2, "video_file_path"));
             hashMap1.put("progress", str);
             if (b != -1) {
                hashMap1.put("uploadId", String.valueOf(b));
             }
             str = "conversionTaskList";
             String str1 = j0.f(p2, str);
             if (!TextUtils.x(str1)) {
                hashMap1.put(str, str1);
             }
             tb.a(new JsUploadVideoResult(hashMap1, 1));
             a uoa = tc.c.L0(b);
             if (uoa == null || uoa.getStatus() == PostStatus.UPLOAD_COMPLETE) {
                PostVideoHelper.m(uoa, tb);
             }else {
                PostVideoHelper.a(tb, b, tc);
             }
          }
       }
       return;
    }
}
