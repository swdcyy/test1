package com.kuaishou.webkit.WebBackForwardList;
import java.lang.Cloneable;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.webkit.WebHistoryItem;

public abstract class WebBackForwardList implements Cloneable, Serializable	// class@001265
{

    public void WebBackForwardList(){
       super();
    }
    public abstract WebBackForwardList clone();
    public Object clone(){
       return this.clone();
    }
    public abstract int getCurrentIndex();
    public abstract WebHistoryItem getCurrentItem();
    public abstract WebHistoryItem getItemAtIndex(int p0);
    public abstract int getSize();
}
