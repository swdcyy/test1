package com.kuaishou.webkit.adapter.WebIconDatabaseAdapter;
import com.kuaishou.webkit.WebIconDatabase;
import android.webkit.WebIconDatabase;
import android.content.ContentResolver;
import java.lang.String;
import com.kuaishou.webkit.WebIconDatabase$IconListener;
import java.lang.Class;
import android.webkit.WebIconDatabase$IconListener;
import java.lang.reflect.Method;
import java.lang.Object;
import com.kuaishou.webkit.adapter.WebIconDatabaseAdapter$IconListenerAdapter;
import java.lang.StringBuilder;
import com.kuaishou.webkit.internal.Logger;

public class WebIconDatabaseAdapter extends WebIconDatabase	// class@0012be
{
    public WebIconDatabase mStub;

    public void WebIconDatabaseAdapter(WebIconDatabase p0){
       super();
       this.mStub = p0;
    }
    public static WebIconDatabaseAdapter getInstance(WebIconDatabase p0){
       WebIconDatabaseAdapter webIconDatab = (p0 != null)? new WebIconDatabaseAdapter(p0): null;
       return webIconDatab;
    }
    public void bulkRequestIconForPageUrl(ContentResolver p0,String p1,WebIconDatabase$IconListener p2){
       try{
          Class[] uClassArray = new Class[]{ContentResolver.class,String.class,WebIconDatabase$IconListener.class};
          Method method = Class.forName("android.webkit.WebIconDatabase").getMethod("bulkRequestIconForPageUrl", uClassArray);
          WebIconDatabaseAdapter tmStub = this.mStub;
          Object[] objArray = new Object[3];
          objArray[0] = p0;
          objArray[1] = p1;
          WebIconDatabaseAdapter$IconListenerAdapter iconListener = (p2 != null)? new WebIconDatabaseAdapter$IconListenerAdapter(this, p2): null;
          objArray[2] = iconListener;
          method.invoke(tmStub, objArray);
       }catch(java.lang.Exception e9){
          Logger.w("WebIconDatabase", "bulkRequestIconForPageUrl\(cr, where, listener\) catches exception : "+e9);
       }
       return;
    }
    public void close(){
       this.mStub.close();
    }
    public void open(String p0){
       this.mStub.open(p0);
    }
    public void releaseIconForPageUrl(String p0){
       this.mStub.releaseIconForPageUrl(p0);
    }
    public void removeAllIcons(){
       this.mStub.removeAllIcons();
    }
    public void requestIconForPageUrl(String p0,WebIconDatabase$IconListener p1){
       WebIconDatabaseAdapter tmStub = this.mStub;
       WebIconDatabaseAdapter$IconListenerAdapter iconListener = (p1 != null)? new WebIconDatabaseAdapter$IconListenerAdapter(this, p1): null;
       tmStub.requestIconForPageUrl(p0, iconListener);
       return;
    }
    public void retainIconForPageUrl(String p0){
       this.mStub.retainIconForPageUrl(p0);
    }
}
