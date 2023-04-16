package com.kuaishou.webkit.extension.KwSdk$CoreInitCallback;
import java.lang.String;
import com.kuaishou.webkit.extension.KsCoreInitSettings;

public interface abstract KwSdk$CoreInitCallback	// class@0012ef
{

    void onCoreLoadFailed(String p0,String p1);
    void onCoreLoadFinished(boolean p0);
    void onPreLoadCore(KsCoreInitSettings p0);
}
