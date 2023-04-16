package com.kuaishou.webkit.WebViewFactoryProvider$Statics;
import java.lang.Runnable;
import java.lang.String;
import android.content.Context;
import java.lang.Object;
import android.os.Bundle;
import android.net.Uri;
import com.kuaishou.webkit.ValueCallback;
import android.content.Intent;
import android.os.Message;
import java.util.List;

public interface abstract WebViewFactoryProvider$Statics	// class@00129a
{

    void clearClientCertPreferences(Runnable p0);
    void enableSlowWholeDocumentDraw();
    String findAddress(String p0);
    void freeMemoryForTests();
    String getDefaultUserAgent(Context p0);
    Object getMiscObject(int p0);
    Object getMiscObjectWithArgs(int p0,Bundle p1,Object p2);
    Uri getSafeBrowsingPrivacyPolicyUrl();
    void initSafeBrowsing(Context p0,ValueCallback p1);
    Uri[] parseFileChooserResult(int p0,Intent p1);
    boolean setMiscBoolean(int p0,boolean p1);
    boolean setMiscBundle(int p0,Bundle p1);
    boolean setMiscInt(int p0,int p1);
    boolean setMiscMessage(Message p0);
    boolean setMiscObject(int p0,Object p1);
    boolean setMiscString(int p0,String p1);
    void setSafeBrowsingWhitelist(List p0,ValueCallback p1);
    void setWebContentsDebuggingEnabled(boolean p0);
}
