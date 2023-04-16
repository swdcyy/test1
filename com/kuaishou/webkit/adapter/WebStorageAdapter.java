package com.kuaishou.webkit.adapter.WebStorageAdapter;
import com.kuaishou.webkit.WebStorage;
import android.webkit.WebStorage;
import java.lang.String;
import com.kuaishou.webkit.ValueCallback;
import com.kuaishou.webkit.adapter.ValueCallbackSystemAdapter;
import android.webkit.ValueCallback;

public class WebStorageAdapter extends WebStorage	// class@0012c6
{
    public WebStorage mStub;

    public void WebStorageAdapter(WebStorage p0){
       super();
       this.mStub = p0;
    }
    public static WebStorageAdapter getInstance(WebStorage p0){
       WebStorageAdapter webStorageAd = (p0 != null)? new WebStorageAdapter(p0): null;
       return webStorageAd;
    }
    public void deleteAllData(){
       this.mStub.deleteAllData();
    }
    public void deleteOrigin(String p0){
       this.mStub.deleteOrigin(p0);
    }
    public void getOrigins(ValueCallback p0){
       WebStorageAdapter tmStub = this.mStub;
       ValueCallbackSystemAdapter valueCallbac = (p0 != null)? new ValueCallbackSystemAdapter(p0): null;
       tmStub.getOrigins(valueCallbac);
       return;
    }
    public void getQuotaForOrigin(String p0,ValueCallback p1){
       WebStorageAdapter tmStub = this.mStub;
       ValueCallbackSystemAdapter valueCallbac = (p1 != null)? new ValueCallbackSystemAdapter(p1): null;
       tmStub.getQuotaForOrigin(p0, valueCallbac);
       return;
    }
    public void getUsageForOrigin(String p0,ValueCallback p1){
       WebStorageAdapter tmStub = this.mStub;
       ValueCallbackSystemAdapter valueCallbac = (p1 != null)? new ValueCallbackSystemAdapter(p1): null;
       tmStub.getUsageForOrigin(p0, valueCallbac);
       return;
    }
    public void setQuotaForOrigin(String p0,long p1){
       this.mStub.setQuotaForOrigin(p0, p1);
    }
}
