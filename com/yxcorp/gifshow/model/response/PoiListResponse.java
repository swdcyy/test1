package com.yxcorp.gifshow.model.response.PoiListResponse;
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

public class PoiListResponse implements CursorResponse, Serializable	// class@001f53
{
    public String mCursor;
    public List mPois;
    public static final long serialVersionUID = 0xefafc873cf7b61a;

    public void PoiListResponse(){
       super();
    }
    public String getCursor(){
       return this.mCursor;
    }
    public List getItems(){
       return this.mPois;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, PoiListResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
}
