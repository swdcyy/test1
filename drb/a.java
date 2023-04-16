package drb.a;
import java.lang.Object;
import android.content.Intent;
import com.yxcorp.gifshow.nasa.scheme.action.NasaSlideSchemeAction;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.google.gson.JsonObject;
import android.net.Uri;
import java.lang.CharSequence;
import android.text.TextUtils;
import fg6.a;
import com.google.gson.Gson;
import java.lang.Throwable;
import com.yxcorp.utility.Log;
import ekd.k0;
import com.yxcorp.gifshow.nasa.scheme.action.NasaSlideSchemeActionShowCollectorListPanel;
import com.yxcorp.gifshow.nasa.scheme.action.NasaSlideSchemeActionShowLikePanel;

public class a	// class@00250c
{

    public void a(){
       super();
    }
    public static NasaSlideSchemeAction a(Intent p0){
       Uri data;
       Uri data1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       JsonObject obj = PatchProxy.applyOneRefs(p0, null, a.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.applyOneRefs(p0, null, a.class, "4");
       if (obj != patchProxyRe) {
       }else if(p0 != null){
          data1 = p0.getData();
       }else {
          data1 = null;
       }
       if (data1 == null || !data1.isHierarchical()) {
          data1 = null;
       }
       String queryParamet = (data1 != null)? data1.getQueryParameter("action"): null;
       if (!TextUtils.isEmpty(queryParamet)) {
          obj = a.a.h(queryParamet, JsonObject.class);
       }else {
          obj = null;
       }
       int i = (obj != null)? k0.f(obj, "type", 0): 0;
       String str = PatchProxy.applyOneRefs(p0, null, a.class, "5");
       if (str != patchProxyRe) {
       }else if(p0 != null){
          data = p0.getData();
       }else {
          data = null;
       }
       if (data == null || !data.isHierarchical()) {
          data = null;
       }
       if (data != null) {
          str = data.getQueryParameter("pinnedUserIds");
       }else {
          str = null;
       }
       if (i != 2) {
          if (i != 3) {
             return new NasaSlideSchemeAction(0);
          }else {
             NasaSlideSchemeActionShowCollectorListPanel nasaSlideSch = PatchProxy.applyTwoRefs(obj, str, null, a.class, "3");
             if (nasaSlideSch != patchProxyRe) {
             }else {
                nasaSlideSch = new NasaSlideSchemeActionShowCollectorListPanel();
                nasaSlideSch.mAggregateUids = (str != null && !TextUtils.isEmpty(str))? str: k0.h(obj, "userId", null);
             }
             return nasaSlideSch;
          }
       }else {
          NasaSlideSchemeActionShowLikePanel nasaSlideSch1 = PatchProxy.applyTwoRefs(obj, str, null, a.class, "2");
          if (nasaSlideSch1 != patchProxyRe) {
          }else if(str != null && !TextUtils.isEmpty(str)){
             nasaSlideSch1 = new NasaSlideSchemeActionShowLikePanel("");
             nasaSlideSch1.mAggregateUids = str;
          }else {
             nasaSlideSch1 = new NasaSlideSchemeActionShowLikePanel(k0.h(obj, "userId", null));
          }
          return nasaSlideSch1;
       }
    }
}
