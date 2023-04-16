package com.kwai.component.photo.operate.abtest.NotLoginLikeOptPolicy;
import java.io.Serializable;
import com.kwai.component.photo.operate.abtest.NotLoginLikeOptPolicy$a;
import nsd.u;
import java.lang.Object;

public final class NotLoginLikeOptPolicy implements Serializable	// class@000ad1
{
    public boolean enableLikeUnlogin;
    public int likeTimesTriggerLogin;
    public static final NotLoginLikeOptPolicy$a Companion;
    public static final NotLoginLikeOptPolicy DEFAULT;

    static {
       NotLoginLikeOptPolicy.Companion = new NotLoginLikeOptPolicy$a(null);
       NotLoginLikeOptPolicy notLoginLike = new NotLoginLikeOptPolicy();
       notLoginLike.enableLikeUnlogin = true;
       notLoginLike.likeTimesTriggerLogin = 3;
       NotLoginLikeOptPolicy.DEFAULT = notLoginLike;
    }
    public void NotLoginLikeOptPolicy(){
       super();
       this.enableLikeUnlogin = true;
       this.likeTimesTriggerLogin = 3;
    }
    public final boolean getEnableLikeUnlogin(){
       return this.enableLikeUnlogin;
    }
    public final int getLikeTimesTriggerLogin(){
       return this.likeTimesTriggerLogin;
    }
    public final void setEnableLikeUnlogin(boolean p0){
       this.enableLikeUnlogin = p0;
    }
    public final void setLikeTimesTriggerLogin(int p0){
       this.likeTimesTriggerLogin = p0;
    }
}
