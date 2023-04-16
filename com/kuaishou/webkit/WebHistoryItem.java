package com.kuaishou.webkit.WebHistoryItem;
import java.lang.Cloneable;
import java.lang.Object;
import android.graphics.Bitmap;
import java.lang.String;

public abstract class WebHistoryItem implements Cloneable	// class@001269
{

    public void WebHistoryItem(){
       super();
    }
    public abstract WebHistoryItem clone();
    public Object clone(){
       return this.clone();
    }
    public abstract Bitmap getFavicon();
    public abstract int getId();
    public abstract String getOriginalUrl();
    public abstract String getTitle();
    public abstract String getUrl();
}
