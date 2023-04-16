package com.sina.weibo.sdk.openapi.SdkListener;
import java.lang.Exception;

public interface abstract SdkListener	// class@000bca
{

    void onInitFailure(Exception p0);
    void onInitSuccess();
}
