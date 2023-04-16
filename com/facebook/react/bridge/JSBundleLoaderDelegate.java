package com.facebook.react.bridge.JSBundleLoaderDelegate;
import android.content.res.AssetManager;
import java.lang.String;

public interface abstract JSBundleLoaderDelegate	// class@0011d5
{

    void loadScriptFromAssets(AssetManager p0,String p1,String p2,boolean p3);
    void loadScriptFromAssets(AssetManager p0,String p1,boolean p2,String p3);
    void loadScriptFromFile(String p0,String p1,boolean p2);
    void loadScriptFromFile(String p0,String p1,boolean p2,String p3);
    void setSourceURLs(String p0,String p1);
}
