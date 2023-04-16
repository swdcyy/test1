package com.kuaishou.webkit.adapter.WebBackForwardListAdapter;
import com.kuaishou.webkit.WebBackForwardList;
import android.webkit.WebBackForwardList;
import java.lang.Object;
import com.kuaishou.webkit.WebHistoryItem;
import android.webkit.WebHistoryItem;
import com.kuaishou.webkit.adapter.WebHistoryItemAdapter;

public class WebBackForwardListAdapter extends WebBackForwardList	// class@0012b6
{
    public WebBackForwardList mStub;

    public void WebBackForwardListAdapter(WebBackForwardList p0){
       super();
       this.mStub = p0;
    }
    public WebBackForwardList clone(){
       return new WebBackForwardListAdapter(this.mStub);
    }
    public Object clone(){
       return this.clone();
    }
    public int getCurrentIndex(){
       return this.mStub.getCurrentIndex();
    }
    public WebHistoryItem getCurrentItem(){
       WebHistoryItem currentItem = this.mStub.getCurrentItem();
       WebHistoryItemAdapter webHistoryIt = (currentItem != null)? new WebHistoryItemAdapter(currentItem): null;
       return webHistoryIt;
    }
    public WebHistoryItem getItemAtIndex(int p0){
       WebHistoryItem itemAtIndex = this.mStub.getItemAtIndex(p0);
       WebHistoryItemAdapter webHistoryIt = (itemAtIndex != null)? new WebHistoryItemAdapter(itemAtIndex): null;
       return webHistoryIt;
    }
    public int getSize(){
       return this.mStub.getSize();
    }
}
