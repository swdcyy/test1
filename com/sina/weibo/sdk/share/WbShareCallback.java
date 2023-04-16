package com.sina.weibo.sdk.share.WbShareCallback;
import com.sina.weibo.sdk.common.UiError;

public interface abstract WbShareCallback	// class@000bd2
{

    void onCancel();
    void onComplete();
    void onError(UiError p0);
}
