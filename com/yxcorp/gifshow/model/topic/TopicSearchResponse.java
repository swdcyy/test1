package com.yxcorp.gifshow.model.topic.TopicSearchResponse;
import la6.b;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import la6.a;

public class TopicSearchResponse implements b, Serializable	// class@001fa9
{
    public String mPcursor;
    public String mSsid;
    public List mTags;
    public static final long serialVersionUID = 0x400867c9bd144511;

    public void TopicSearchResponse(){
       super();
    }
    public String getCursor(){
       return this.mPcursor;
    }
    public List getItems(){
       return this.mTags;
    }
    public String getSsid(){
       return this.mSsid;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, TopicSearchResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mPcursor);
    }
    public void setItems(List p0){
       this.mTags = p0;
    }
}
