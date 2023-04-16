package com.kuaishou.webkit.WebViewDelegate;
import android.content.Context;
import android.graphics.Canvas;
import java.lang.Runnable;
import android.view.View;
import android.app.Application;
import java.lang.String;
import android.content.res.Resources;
import com.kuaishou.webkit.WebViewDelegate$OnTraceEnabledChangeListener;

public interface abstract WebViewDelegate	// class@001293
{

    void addWebViewAssetPath(Context p0);
    void callDrawGlFunction(Canvas p0,long p1);
    void callDrawGlFunction(Canvas p0,long p1,Runnable p2);
    boolean canInvokeDrawGlFunctor(View p0);
    void detachDrawGlFunctor(View p0,long p1);
    void drawWebViewFunctor(Canvas p0,int p1);
    Application getApplication();
    String getDataDirectorySuffix();
    String getErrorString(Context p0,int p1);
    int getPackageId(Resources p0,String p1);
    void invokeDrawGlFunctor(View p0,long p1,boolean p2);
    boolean isMultiProcessEnabled();
    boolean isTraceTagEnabled();
    void setOnTraceEnabledChangeListener(WebViewDelegate$OnTraceEnabledChangeListener p0);
}
