package com.kuaishou.webkit.adapter.WebViewDatabaseAdapter;
import com.kuaishou.webkit.WebViewDatabase;
import android.webkit.WebViewDatabase;
import java.lang.String;
import com.kuaishou.webkit.adapter.SystemApiVersionChecker;

public class WebViewDatabaseAdapter extends WebViewDatabase	// class@0012c8
{
    public WebViewDatabase mStub;

    public void WebViewDatabaseAdapter(WebViewDatabase p0){
       super();
       this.mStub = p0;
    }
    public void clearFormData(){
       this.mStub.clearFormData();
    }
    public void clearHttpAuthUsernamePassword(){
       this.mStub.clearHttpAuthUsernamePassword();
    }
    public void clearUsernamePassword(){
       this.mStub.clearUsernamePassword();
    }
    public String[] getHttpAuthUsernamePassword(String p0,String p1){
       if (SystemApiVersionChecker.check(26, "WebViewDatabase", "getHttpAuthUsernamePassword\(host, realm\)")) {
          return this.mStub.getHttpAuthUsernamePassword(p0, p1);
       }
       return null;
    }
    public boolean hasFormData(){
       return this.mStub.hasFormData();
    }
    public boolean hasHttpAuthUsernamePassword(){
       return this.mStub.hasHttpAuthUsernamePassword();
    }
    public boolean hasUsernamePassword(){
       return this.mStub.hasUsernamePassword();
    }
    public void setHttpAuthUsernamePassword(String p0,String p1,String p2,String p3){
       if (SystemApiVersionChecker.check(26, "WebViewDatabase", "setHttpAuthUsernamePassword\(host, realm, username, password\)")) {
          this.mStub.setHttpAuthUsernamePassword(p0, p1, p2, p3);
       }
       return;
    }
}
