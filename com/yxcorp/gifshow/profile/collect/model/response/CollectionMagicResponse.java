package com.yxcorp.gifshow.profile.collect.model.response.CollectionMagicResponse;
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

public class CollectionMagicResponse implements CursorResponse, Serializable	// class@0012c5
{
    public List mCollects;
    public String mCursor;
    public static final long serialVersionUID = 0x82b21b614dfebfd3;

    public void CollectionMagicResponse(){
       super();
    }
    public String getCursor(){
       return this.mCursor;
    }
    public List getItems(){
       return this.mCollects;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, CollectionMagicResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
}