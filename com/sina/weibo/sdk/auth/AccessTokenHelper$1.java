package com.sina.weibo.sdk.auth.AccessTokenHelper$1;
import com.sina.weibo.sdk.net.c;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.sina.weibo.sdk.auth.AccessTokenHelper;
import java.lang.Throwable;

public final class AccessTokenHelper$1 implements c	// class@000baa
{
    public final Context c;

    public void AccessTokenHelper$1(Context p0){
       this.c = p0;
       super();
    }
    public final void a(Object p0){
       AccessTokenHelper.writeAccessToken(this.c, Oauth2AccessToken.parseAccessToken(p0));
    }
    public final void onError(Throwable p0){
    }
}
