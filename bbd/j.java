package bbd.j;
import x9d.l;
import nfd.a0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.plugin.search.entity.SearchItem;
import com.yxcorp.plugin.search.entity.kbox.KBoxItem;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplateUserFeed;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.UserExtraInfo;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.utility.TextUtils;
import java.lang.CharSequence;
import android.view.View;
import nfd.o3;

public class j extends l	// class@0003db
{

    public void j(a0 p0){
       super();
       this.q = p0;
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, j.class, "1")) {
          return;
       }
       SearchItem mKBoxItem = this.G.mKBoxItem;
       if (mKBoxItem != null && mKBoxItem.mType == 4) {
          this.p = mKBoxItem.mBaseFeed.mUser;
       }
       l tp = this.p;
       if (tp == null) {
          return;
       }else {
          User mExtraInfo = tp.mExtraInfo;
          boolean b = (mExtraInfo != null && mExtraInfo.mUserInfoExposed != null)? true: false;
          if (b) {
             objArray = mExtraInfo;
          }
          this.Y8(this.R8(b, objArray));
          this.a9(this.V8(b, objArray));
          this.Z8(this.S8(b, objArray));
          return;
       }
    }
    public String V8(boolean p0,UserExtraInfo p1){
       User obj;
       if (PatchProxy.isSupport(j.class)) {
          obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), p1, this, j.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.p.mExtraInfo;
       String str = (obj != null)? TextUtils.k(obj.mCityName): "";
       return str;
    }
    public void a9(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "2")) {
          return;
       }
       if (TextUtils.x(p0)) {
          o3.H(this.s, 8);
          return;
       }else {
          super.a9(p0);
          return;
       }
    }
}
