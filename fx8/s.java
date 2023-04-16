package fx8.s;
import java.lang.Object;
import com.yxcorp.gifshow.widget.EmojiEditText;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.yxcorp.gifshow.widget.KSTextDisplayHandler;
import com.yxcorp.gifshow.activity.share.presenter.ShareEditorTextDisplayHandler;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.ArrayList;
import e17.i;
import android.text.Editable;
import com.kwai.library.widget.edittext.SafeEditText;
import lnc.a1;
import java.lang.CharSequence;
import java.lang.Number;
import com.kwai.sdk.switchconfig.a;
import com.kwai.feature.post.api.feature.publish.model.PublishPageSetting;
import java.lang.reflect.Type;
import com.yxcorp.gifshow.model.topic.TopicIcon;

public final class s	// class@002394
{

    public void s(){
       super();
    }
    public static void a(EmojiEditText p0,String p1,int p2){
       if (PatchProxy.isSupport(s.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), null, s.class, "12")) {
          return;
       }
       KSTextDisplayHandler kSTextDispla = p0.getKSTextDisplayHandler();
       if (kSTextDispla instanceof ShareEditorTextDisplayHandler && p2 == 3) {
          kSTextDispla.t(p1, p2);
       }
       return;
    }
    public static boolean b(EmojiEditText p0){
       Object[] objArray;
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       s os = s.class;
       Object obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, os, "4");
       if (obj1 != patchProxyRe) {
          return obj1.booleanValue();
       }
       if (p0.getKSTextDisplayHandler().e().size() >= s.d()) {
          objArray = new Object[]{Integer.valueOf(s.d())};
          i.b(R.style.arg_RES_7f110668, 0x7f103df7, objArray);
          return 0;
       }else {
          Object obj2 = PatchProxy.applyOneRefs(p0, obj, os, "5");
          if (obj2 != patchProxyRe) {
             b = obj2.booleanValue();
          }else if(p0.getText() != null && p0.getText().length() >= s.c()){
             b = true;
          }else {
             b = false;
          }
          if (b) {
             objArray = new Object[]{Integer.valueOf(s.c())};
             i.d(R.style.arg_RES_7f11066a, String.format(a1.p(R.string.arg_RES_7f1047c9), objArray));
             return 0;
          }else {
             return 1;
          }
       }
    }
    public static int c(){
       PublishPageSetting obj = PatchProxy.apply(null, null, s.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = a.t().getValue("publish_page_settings", PublishPageSetting.class, new PublishPageSetting()).mMaxTextWordNum;
       if (obj <= null) {
          int i = 2000;
       }
       return obj;
    }
    public static int d(){
       Object obj = PatchProxy.apply(null, null, s.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (int)a.t().b("publish_page_max_hashtag_number", 3);
    }
    public static boolean e(TopicIcon p0){
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       TopicIcon mUrls = p0.mUrls;
       if (mUrls != null && mUrls.length > 0) {
          p0 = p0.mDarkUrls;
          if (p0 != null && p0.length > 0) {
             b = true;
          }
       }
       return b;
    }
}
