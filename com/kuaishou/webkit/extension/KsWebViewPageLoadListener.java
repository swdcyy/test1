package com.kuaishou.webkit.extension.KsWebViewPageLoadListener;
import java.lang.String;

public interface abstract KsWebViewPageLoadListener	// class@0012e8
{

    void onPageLoad(String p0,int p1,boolean p2);
    void onPageLoad(String p0,int p1,boolean p2,String p3);
    void onUploadKsWebViewAssistantInfo(String p0,String p1,String p2);
}
