package com.yxcorp.gifshow.profile.presenter.profile.page.dialog.o;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.utility.Log;
import org.json.JSONObject;
import java.lang.StringBuilder;
import java.lang.Throwable;
import s1c.j1;
import com.yxcorp.gifshow.profile.presenter.profile.page.dialog.l;
import erd.g;
import crd.b;
import brd.t;
import com.kwai.framework.model.user.User;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import j5c.c;

public class o extends PresenterV2	// class@001587
{
    public final String p;
    public final int q;
    public ProfileParam r;
    public c s;
    public User t;
    public j1 u;

    public void o(String p0){
       int i;
       super();
       this.p = "UnionFollowDialogPresenter";
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "3");
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else if(TextUtils.isEmpty(p0)){
          Log.g("UnionFollowDialogPresenter", "is old follow style");
          i = 0;
       }else {
          i = new JSONObject(p0).optInt("followStyle");
          Log.g("UnionFollowDialogPresenter", "currentFollowStyle"+i);
       }
       this.q = i;
       return;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, o.class, "2")) {
          return;
       }
       this.X7(this.u.h.subscribe(new l(this)));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, o.class, "1")) {
          return;
       }
       this.u = this.q8(j1.class);
       this.t = this.q8(User.class);
       this.r = this.q8(ProfileParam.class);
       this.s = this.r8("PROFILE_LOAD_STATE");
       return;
    }
}
