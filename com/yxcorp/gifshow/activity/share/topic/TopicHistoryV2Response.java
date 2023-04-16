package com.yxcorp.gifshow.activity.share.topic.TopicHistoryV2Response;
import com.kwai.framework.model.response.CursorResponse;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import la6.a;

public class TopicHistoryV2Response implements CursorResponse, Serializable	// class@001477
{
    public String mCursor;
    public List mHistoryItemList;
    public String mSearchedKey;
    public String mSessionId;
    public static final long serialVersionUID = 0xa7abd69c3326e980;

    public void TopicHistoryV2Response(){
       super();
       this.mCursor = "0";
       this.mSessionId = "";
    }
    public String getCursor(){
       return this.mCursor;
    }
    public List getItems(){
       return this.mHistoryItemList;
    }
    public String getSearchedKey(){
       return this.mSearchedKey;
    }
    public String getSessionId(){
       return this.mSessionId;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, TopicHistoryV2Response.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
    public void setCursor(String p0){
       this.mCursor = p0;
    }
    public void setHistoryItemList(List p0){
       this.mHistoryItemList = p0;
    }
    public void setSearchedKey(String p0){
       this.mSearchedKey = p0;
    }
    public void setSessionId(String p0){
       this.mSessionId = p0;
    }
}
