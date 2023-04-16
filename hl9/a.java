package hl9.a;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import lnc.a1;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.yxcorp.gifshow.comment.model.CommentGuide;
import zk9.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import o56.a;
import com.kwai.sdk.switchconfig.a;
import java.util.Map;
import java.util.HashMap;
import java.lang.reflect.Type;
import ra6.a;

public class a	// class@0026c2
{

    public void a(){
       super();
    }
    public static String a(QPhoto p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       Object obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, uoa, "3");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       if (p0 != null && !p0.isAllowComment()) {
          return a1.p(0x7f10078c);
       }
       if (p0 != null && (p0.getPhotoMeta() != null && (a.a(p0.getPhotoMeta()) != null && !TextUtils.isEmpty(a.a(p0.getPhotoMeta()).mDefaultText)))) {
          return a.a(p0.getPhotoMeta()).mDefaultText;
       }
       p0 = PatchProxy.apply(obj, obj, uoa, "2");
       if (p0 != patchProxyRe) {
       }else {
          String str = PatchProxy.applyOneRefs(a.B, obj, uoa, "1");
          if (str != patchProxyRe) {
          }else {
             Map value = a.t().getValue("nonslide_detail_comment_inputbox_placeholder", Map.class, new HashMap());
             if (a.d() == 1) {
                str = value.get("zh-hans");
             }else if(a.d() == 2){
                str = value.get("zh-hant");
             }else {
                str = value.get("en");
             }
             if (TextUtils.isEmpty(str)) {
                str = a1.p(R.string.arg_RES_7f103cec);
             }
          }
          if (TextUtils.isEmpty(str)) {
             str = a1.p(R.string.arg_RES_7f103836);
          }
       }
       return p0;
    }
}
