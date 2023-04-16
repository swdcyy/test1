package com.kuaishou.webkit.adapter.WebHistoryItemAdapter;
import com.kuaishou.webkit.WebHistoryItem;
import android.webkit.WebHistoryItem;
import java.lang.Object;
import android.graphics.Bitmap;
import java.lang.String;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.Integer;
import java.lang.StringBuilder;
import com.kuaishou.webkit.internal.Logger;

public class WebHistoryItemAdapter extends WebHistoryItem	// class@0012bc
{
    public WebHistoryItem mStub;

    public void WebHistoryItemAdapter(WebHistoryItem p0){
       super();
       this.mStub = p0;
    }
    public WebHistoryItem clone(){
       return new WebHistoryItemAdapter(this.mStub);
    }
    public Object clone(){
       return this.clone();
    }
    public Bitmap getFavicon(){
       return this.mStub.getFavicon();
    }
    public int getId(){
       try{
          Class[] uClassArray = new Class[0];
          Object[] objArray = new Object[0];
          return Class.forName("android.webkit.WebHistoryItem").getMethod("getId", uClassArray).invoke(this.mStub, objArray).intValue();
       }catch(java.lang.Exception e0){
          Logger.w("WebHistoryItem", "getId\(\) catches exception : "+e0);
          return -1;
       }
    }
    public String getOriginalUrl(){
       return this.mStub.getOriginalUrl();
    }
    public String getTitle(){
       return this.mStub.getTitle();
    }
    public String getUrl(){
       return this.mStub.getUrl();
    }
}
