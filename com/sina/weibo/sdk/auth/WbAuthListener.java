package com.sina.weibo.sdk.auth.WbAuthListener;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.sina.weibo.sdk.common.UiError;

public interface abstract WbAuthListener	// class@000baf
{

    void onCancel();
    void onComplete(Oauth2AccessToken p0);
    void onError(UiError p0);
}
