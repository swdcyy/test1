package mg.q4;
import n3d.a;
import com.kwai.feature.post.api.feature.bridge.JsSelectImageParams;
import android.app.Activity;
import f55.g;
import java.lang.Object;
import android.content.Intent;
import java.util.List;
import java.lang.String;
import java.io.Serializable;
import ekd.j0;
import com.yxcorp.gifshow.models.QMedia;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ekd.j;
import com.kwai.feature.post.api.feature.bridge.JsSelectImageResult;
import java.util.TreeMap;
import com.feature.post.bridge.c1;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicInteger;
import com.yxcorp.utility.i;
import java.io.File;
import com.yxcorp.gifshow.util.PostUtils;
import mg.t4;
import java.util.SortedMap;
import com.yxcorp.utility.i$d;
import com.yxcorp.utility.Log;
import android.os.Bundle;

public final class q4 implements a	// class@002652
{
    public final JsSelectImageParams b;
    public final Activity c;
    public final g d;

    public void q4(JsSelectImageParams p0,Activity p1,g p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       String[] stringArray;
       int i2;
       String[] stringArray1;
       q4 oq4 = this;
       Intent intent = p2;
       q4 b = oq4.b;
       q4 c = oq4.c;
       q4 d = oq4.d;
       String str = "selectImage: canceled the authorization";
       String str1 = "SelectImageFun";
       Bundle uBundle = null;
       int i = 0;
       if (p1 == -1 && (p0 == 6 && intent)) {
          int i1 = 1;
          if (b.mSourceTypes.contains("album")) {
             List list = j0.e(intent, "album_data_list");
             if (list != null) {
                stringArray = new String[list.size()];
                for (i2 = 0; i2 < list.size(); i2 = i2 + 1) {
                   stringArray[i2] = list.get(i2).path;
                }
             }else {
                stringArray = uBundle;
             }
          }else {
             String dataString = p2.getDataString();
             if (!TextUtils.x(dataString)) {
                stringArray = new String[i1];
                stringArray[i] = dataString;
             }else {
                stringArray1 = uBundle;
             label_005e :
                if (!j.h(stringArray1)) {
                   JsSelectImageResult jsSelectImag = new JsSelectImageResult(i1);
                   TreeMap treeMap = new TreeMap(c1.b);
                   AtomicInteger uAtomicInteg = new AtomicInteger(i);
                   int len = stringArray1.length;
                   i2 = 0;
                   while (i2 < len) {
                      object oobject = stringArray1[i2];
                      if (!TextUtils.x(oobject)) {
                         t4 ot4 = new t4(oobject, treeMap, uAtomicInteg, jsSelectImag, d);
                         i.a().c(c, PostUtils.m(), oobject, b.mMaxWidth, b.mMaxHeight, b.mMaxFileSize, uAtomicInteg.incrementAndGet(), v20);
                         i2 = i2 + 1;
                         len = len;
                         uAtomicInteg = uAtomicInteg;
                      }
                   }
                }else {
                   Log.g(str1, str);
                   d.a(i, b.mCallback, uBundle);
                }
             }
          }
          stringArray1 = stringArray;
          goto label_005e ;
       }else {
          Log.g(str1, str);
          d.a(i, b.mCallback, uBundle);
       }
       return;
    }
}
