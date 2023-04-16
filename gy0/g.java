package gy0.g;
import vq5.b;
import com.kuaishou.live.audience.component.comments.send.e;
import java.lang.Object;
import vq5.a;
import android.net.Uri;
import java.util.Objects;
import java.lang.String;
import java.lang.Integer;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import fg6.a;
import com.kuaishou.live.audience.component.comments.send.LiveAudienceSendCommentsPresenter$7;
import java.lang.reflect.Type;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import androidx.lifecycle.MutableLiveData;
import ft5.b;

public final class g implements b	// class@0025aa
{
    public final e a;

    public void g(e p0){
       this.a = p0;
    }
    public boolean a(){
       return a.a(this);
    }
    public final void b(Uri p0){
       int i;
       boolean b;
       g ta = this.a;
       Objects.requireNonNull(ta);
       try{
          i = 0;
          b = (Integer.parseInt(p0.getQueryParameter("tab")) == 2)? true: false;
          ta.M = b;
       }catch(java.lang.NumberFormatException e0){
          b.Z(LiveLogTag.LIVE_BULLET_COMMENT, "parse selectTab error");
       }
       String queryParamet = p0.getQueryParameter("source");
       List list = PatchProxy.applyOneRefs(p0, e0, e.class, "7");
       if (list != PatchProxyResult.class) {
       }else {
          String queryParamet1 = p0.getQueryParameter("hotwords");
          String str = null;
          if (!TextUtils.x(queryParamet1)) {
             try{
                list = a.a.i(queryParamet1, new LiveAudienceSendCommentsPresenter$7(e0).getType());
             }catch(com.google.gson.JsonSyntaxException e0){
                b.Z(LiveLogTag.LIVE_BULLET_COMMENT, "parse hotWords error");
             }
             queryParamet1 = str;
          }else {
             goto label_005c ;
          }
       }
       e0.J = p0.getBooleanQueryParameter("sendhotwordwithinitialcomment", i);
       e0.I.setValue(list);
       e0.P.Zn(p0.getQueryParameter("initialComment"), TextUtils.i(queryParamet, "UNKNOWN"));
       e0.X8(1, p0.getBooleanQueryParameter("saveunsendeditedcomment", i));
       e0.J = i;
       return;
    }
}
