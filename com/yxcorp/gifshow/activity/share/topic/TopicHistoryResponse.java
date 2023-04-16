package com.yxcorp.gifshow.activity.share.topic.TopicHistoryResponse;
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

public class TopicHistoryResponse implements CursorResponse, Serializable	// class@001476
{
    public String mCursor;
    public String mSearchedKey;
    public List mTagList;
    public static final long serialVersionUID = 0xa7abd69c3326e980;

    public void TopicHistoryResponse(){
       super();
    }
    public String getCursor(){
       return this.mCursor;
    }
    public List getItems(){
       return this.mTagList;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, TopicHistoryResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
}
