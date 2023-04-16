package com.kwai.feature.api.social.login.model.LoginParams$a;
import java.lang.Object;
import java.util.HashMap;
import com.kwai.feature.api.social.login.model.LoginParams;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.feed.BaseFeed;

public class LoginParams$a	// class@001115
{
    public boolean a;
    public BaseFeed b;
    public QPreInfo c;
    public int d;
    public String e;
    public String f;
    public String g;
    public boolean h;
    public boolean i;
    public boolean j;
    public String k;
    public boolean l;
    public Map m;

    public void LoginParams$a(){
       super();
       this.m = new HashMap();
    }
    public LoginParams a(){
       LoginParams obj = PatchProxy.apply(null, this, LoginParams$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LoginParams();
       obj.mCurrentPhoneInput = this.a;
       obj.mSourcePhoto = this.b;
       obj.mSourcePrePhoto = this.c;
       obj.mLoginSource = this.d;
       obj.mSourcePage = this.e;
       obj.mSourcePageSessionId = this.f;
       obj.mLoginTitle = this.g;
       obj.mIsPasswordLogin = this.h;
       obj.mNeedPrefetchCode = this.i;
       obj.mHideUserBindPhone = this.j;
       obj.mExtraInfoParams = this.k;
       obj.mPublishVideo = this.l;
       obj.mPreFillData = this.m;
       return obj;
    }
    public LoginParams$a b(String p0){
       this.k = p0;
       return this;
    }
    public LoginParams$a c(int p0){
       this.d = p0;
       return this;
    }
    public LoginParams$a d(String p0){
       this.g = p0;
       return this;
    }
    public LoginParams$a e(boolean p0){
       this.h = p0;
       return this;
    }
    public LoginParams$a f(String p0){
       this.e = p0;
       return this;
    }
    public LoginParams$a g(String p0){
       this.f = p0;
       return this;
    }
    public LoginParams$a h(BaseFeed p0){
       this.b = p0;
       return this;
    }
}
