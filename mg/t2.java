package mg.t2;
import erd.g;
import android.app.Activity;
import com.kwai.feature.post.api.feature.bridge.JsGoToPostParam;
import java.lang.Object;
import com.kwai.gifshow.post.api.core.plugin.RecordPostPlugin;
import com.kwai.framework.activitycontext.ActivityContext;
import og.l;
import java.lang.String;
import q87.c;
import java.util.Iterator;
import java.util.List;
import com.kwai.feature.post.api.feature.bridge.GoToPostValue;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.content.Context;
import android.content.Intent;
import w46.b;
import com.kuaishou.android.post.PostArguments;
import com.kuaishou.android.post.SerialArg;
import com.kuaishou.android.post.PostPageArg;
import java.util.Objects;

public final class t2 implements g	// class@002663
{
    public final Activity b;
    public final JsGoToPostParam c;

    public void t2(Activity p0,JsGoToPostParam p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       int i;
       t2 tb = this.b;
       t2 tc = this.c;
       RecordPostPlugin recordPostPl = p0;
       p0 = (tb == null)? ActivityContext.g().e(): tb;
       Object[] objArray = new Object[0];
       l.D().w("PostBridgeModuleImpl", "goToPost real call", objArray);
       JsGoToPostParam mExtraParamL = tc.mExtraParamList;
       if (mExtraParamL != null) {
          Iterator iterator = mExtraParamL.iterator();
          while (true) {
             if (iterator.hasNext()) {
                GoToPostValue goToPostValu = iterator.next();
                if (TextUtils.n(goToPostValu.mKey, "TITLE_IMAGE")) {
                   i = JsGoToPostParam.getResourceIdByKey(tb, goToPostValu.mValue);
                label_0048 :
                   Intent intent = recordPostPl.e10(p0, tc.subBiz, "", i, tc.taskId);
                   if (intent == null) {
                      Object[] objArray1 = new Object[0];
                      l.D().t("PostBridgeModuleImpl", "goToPost intent is null", objArray1);
                      break ;
                   }else {
                      PostArguments postArgument = new PostArguments();
                      postArgument.getJsGoToPostParam().set(tc);
                      postArgument.write(intent);
                      if (Objects.equals(tc.subBiz, "SOCIAL_TIETIE_PICTURE")) {
                         intent.setFlags(0x24000000);
                         Object[] objArray2 = new Object[0];
                         l.D().w("PostBridgeModuleImpl", "goToPost clear top", objArray2);
                      }
                      p0.startActivity(intent);
                      if (tc.shouldAnimated != null) {
                         p0.overridePendingTransition(R.anim.arg_RES_7f010105, 0x7f0100f1);
                         break ;
                      }else {
                         p0.overridePendingTransition(R.anim.arg_RES_7f010049, 0x7f0100f1);
                         break ;
                      }
                   }
                }
             }
          }
          return;
       }
       i = 0;
       goto label_0048 ;
    }
}
