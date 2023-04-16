package com.yxcorp.gifshow.profile.fragment.AvatarFragment$b$c;
import gx5.h;
import com.yxcorp.gifshow.profile.fragment.AvatarFragment$b;
import java.lang.Object;
import gx5.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.profile.kslog.KsLogProfileAvatarTag;
import java.util.List;
import v2c.e;
import v2c.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.framework.model.user.User;
import com.yxcorp.utility.TextUtils;
import t3c.g;
import java.lang.Throwable;
import com.yxcorp.retrofit.model.KwaiException;
import java.lang.CharSequence;
import e17.i;
import com.yxcorp.gifshow.util.MemoryStorageUtil$Key;
import java.lang.Integer;
import com.yxcorp.gifshow.util.MemoryStorageUtil;

public class AvatarFragment$b$c implements h	// class@0012fc
{
    public final AvatarFragment$b a;

    public void AvatarFragment$b$c(AvatarFragment$b p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       return g.a(this);
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, AvatarFragment$b$c.class, "3")) {
          return;
       }
       g.e(KsLogProfileAvatarTag.AVATAR.appendTag("ProgressDialogAsyncTask"), "updateAvatar onPostExecute success");
       AvatarFragment$b$c ta = this.a;
       ta.s.g(ta.n8(R.string.arg_RES_7f103e9b), TextUtils.k(this.a.q.getId()));
       return;
    }
    public void c(){
       g.c(this);
    }
    public void d(){
       g.d(this);
    }
    public void e(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AvatarFragment$b$c.class, "2")) {
          return;
       }
       g.d(KsLogProfileAvatarTag.AVATAR.appendTag("ProgressDialogAsyncTask"), "updateAvatar doInBackground", p0);
       if (p0.getCause() instanceof KwaiException && p0.getCause().mErrorCode == 0x4e2c) {
          i.d(R.style.arg_RES_7f11066a, p0.getCause().mErrorMessage);
          this.a.s.g(TextUtils.k(p0.getCause().mErrorMessage), TextUtils.k(this.a.q.getId()));
       }
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, AvatarFragment$b$c.class, "1")) {
          return;
       }
       MemoryStorageUtil.c(MemoryStorageUtil$Key.EUserInfoChanged, Integer.valueOf(1));
       return;
    }
    public void g(){
       g.f(this);
    }
}
