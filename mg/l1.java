package mg.l1;
import n3d.a;
import com.kwai.feature.post.api.feature.bridge.JSSelectFileAndUploadOptions;
import z55.b;
import f55.g;
import java.lang.Object;
import android.content.Intent;
import java.lang.String;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.feature.post.api.feature.bridge.JSSelectFileAndUploadOptions$FileInfo;
import java.io.Serializable;
import ekd.j0;
import java.util.List;
import com.yxcorp.gifshow.models.QMedia;
import og.l;
import java.lang.StringBuilder;
import q87.c;
import java.util.Objects;
import com.feature.post.bridge.q;
import com.kwai.feature.post.api.feature.bridge.JSSelectFileAndUploadOptions$ErrorInfo;
import com.kwai.feature.post.api.feature.bridge.JSSelectFileAndUploadOptions$b;
import com.kwai.feature.post.api.feature.bridge.JSSelectFileAndUploadOptions$b$a;
import android.os.Bundle;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;

public final class l1 implements a	// class@002631
{
    public final JSSelectFileAndUploadOptions b;
    public final b c;
    public final g d;

    public void l1(JSSelectFileAndUploadOptions p0,b p1,g p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       String dataString;
       l1 tb = this.b;
       l1 tc = this.c;
       l1 td = this.d;
       int i = 0;
       if (p1 == -1 && (p0 == 3 && (p2 != null && !TextUtils.x(p2.getDataString())))) {
          dataString = p2.getDataString();
          JSSelectFileAndUploadOptions$FileInfo fileInfo = tb.getFileInfo(dataString);
          List list = j0.e(p2, "album_data_list");
          if (list != null && list.size() > 0) {
             QMedia qMedia = list.get(i);
             if (qMedia != null) {
                fileInfo.setDuration((long)(int)(qMedia.getDuration() / 1000));
             }
          }
          Object[] objArray = new Object[i];
          l.D().w("JsSelectVideoUpdateFunction", "file select path result :"+fileInfo.toString(), objArray);
          String selectFileEv = tb.getSelectFileEventName();
          Objects.requireNonNull(selectFileEv);
          q.b(tc, selectFileEv, fileInfo.toString());
          q.c(tb, dataString, tc);
       }else {
          Object[] objArray1 = new Object[i];
          l.D().w("JsSelectVideoUpdateFunction", "file select  cancel", objArray1);
          Bundle uBundle = new Bundle();
          SerializableHook.putSerializable(uBundle, "bundle_result", new JSSelectFileAndUploadOptions$ErrorInfo("", JSSelectFileAndUploadOptions$b.p.a()).toString());
          dataString = tb.getFailEventName();
          Objects.requireNonNull(dataString);
          td.a(i, dataString, uBundle);
       }
       return;
    }
}
