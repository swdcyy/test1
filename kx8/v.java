package kx8.v;
import java.lang.Object;
import android.app.Activity;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import wkd.b;
import com.kwai.framework.perf.phonelevel.d;
import com.kwai.robust.PatchProxyResult;
import android.net.Uri;
import tra.b;
import java.lang.StringBuilder;
import q87.c;
import android.content.SharedPreferences;
import oe6.n;
import android.content.SharedPreferences$Editor;
import oe6.g;
import com.kwai.sdk.switchconfig.a;
import kx8.v$a;
import java.lang.reflect.Type;
import el.a;
import java.util.List;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import com.yxcorp.gifshow.model.WebVideoParam;
import ekd.j;
import com.yxcorp.gifshow.model.CDNUrl;
import te6.b;
import com.yxcorp.gifshow.activity.web.WebFullScreenVideoActivity;
import android.content.Intent;
import android.content.Context;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;

public final class v	// class@002c4d
{

    public void v(){
       super();
    }
    public static void a(Activity p0,String p1){
       Object[] objArray1;
       v ov = v.class;
       Object obj = null;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, obj, ov, "1")) {
          return;
       }
       if (TextUtils.x(p1)) {
          return;
       }
       if (b.a(-404437045).g()) {
          return;
       }
       String str = PatchProxy.applyOneRefs(p1, obj, ov, "3");
       if (str != PatchProxyResult.class) {
       }else {
          str = Uri.parse(p1).getQueryParameter("splashVideo");
       }
       if (TextUtils.x(str)) {
          return;
       }else {
          Object[] objArray = new Object[0];
          b.C().w("WebFullScreenVideoUtil", "splashVideo="+str, objArray);
          String str1 = "web_full_screen_video_";
          if (n.b().getBoolean(str1+str, 0)) {
             objArray1 = new Object[0];
             b.C().w("WebFullScreenVideoUtil", "splashVideo hasShown", objArray1);
             return;
          }else {
             g.a(n.b().edit().putBoolean(str1+str, true));
             List value = a.t().getValue("yodaSplashVideo", new v$a().getType(), obj);
             if (q.f(value)) {
                objArray1 = new Object[0];
                b.C().w("WebFullScreenVideoUtil", "switch has no config", objArray1);
                return;
             }else {
                Iterator iterator = value.iterator();
                while (iterator.hasNext()) {
                   WebVideoParam webVideoPara = iterator.next();
                   if (TextUtils.n(webVideoPara.mVideoId, str)) {
                      if (PatchProxy.applyVoidTwoRefs(p0, webVideoPara, obj, ov, "2")) {
                         break ;
                      }else if(!TextUtils.x(webVideoPara.mVideoId) && (j.h(webVideoPara.mVideoUrl) || TextUtils.x(webVideoPara.mVideoUrl[0].mUrl))){
                         objArray1 = new Object[0];
                         b.C().w("WebFullScreenVideoUtil", "config error", objArray1);
                         break ;
                      }else if(webVideoPara.mPlayIfWarmUpFailed != null || b.a(-1427269270).t(webVideoPara.mVideoUrl[0].mUrl)){
                         Object[] objArray2 = new Object[0];
                         b.C().w("WebFullScreenVideoUtil", "warm up success", objArray2);
                         WebFullScreenVideoActivity webFullScree = WebFullScreenVideoActivity.class;
                         if (PatchProxy.applyVoidTwoRefs(p0, webVideoPara, obj, webFullScree, "1")) {
                            break ;
                         }else {
                            Intent intent = new Intent(p0, webFullScree);
                            SerializableHook.putExtra(intent, "key_video_param", webVideoPara);
                            intent.putExtra("start_enter_page_animation", R.anim.arg_RES_7f01004a);
                            intent.putExtra("start_exit_page_animation", R.anim.arg_RES_7f01004c);
                            p0.startActivity(intent);
                            break ;
                         }
                      }else {
                         objArray1 = new Object[0];
                         b.C().w("WebFullScreenVideoUtil", "warm up failed", objArray1);
                         break ;
                      }
                   }
                }
                return;
             }
          }
       }
    }
}
