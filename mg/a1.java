package mg.a1;
import n3d.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.post.api.feature.bridge.JsSelectAndUploadMediaParams;
import f55.g;
import java.lang.Object;
import android.content.Intent;
import java.lang.String;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.app.Activity;
import com.feature.post.bridge.m;
import com.yxcorp.utility.i;
import java.io.File;
import com.yxcorp.gifshow.util.PostUtils;
import mg.g1;
import com.yxcorp.utility.i$d;
import o56.a;
import android.app.Application;
import android.os.Bundle;

public final class a1 implements a	// class@0025ca
{
    public final GifshowActivity b;
    public final JsSelectAndUploadMediaParams c;
    public final g d;

    public void a1(GifshowActivity p0,JsSelectAndUploadMediaParams p1,g p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       a1 tb = this.b;
       a1 tc = this.c;
       a1 td = this.d;
       if (p1 == -1 && (p0 == 6 && (p2 != null && !TextUtils.x(p2.getDataString())))) {
          String dataString = p2.getDataString();
          String str = TextUtils.s(dataString);
          if (("jpeg").equals(str) || ("png").equals(str)) {
             i.a().b(tb, PostUtils.g("[>|33|>]"), p2.getDataString(), Integer.MAX_VALUE, Integer.MAX_VALUE, tc.mMaxFileSize, new g1(tb, tc, td));
          }else {
             m.b(tb, tc, dataString, td);
          }
       }else {
          td.a(0, a.B.getString(R.string.arg_RES_7f104fc9), new Bundle());
       }
       return;
    }
}
