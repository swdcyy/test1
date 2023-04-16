package com.yxcorp.gifshow.model.response.AggregateUserResponse;
import com.kwai.framework.model.response.CursorResponse;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import la6.a;

public class AggregateUserResponse implements CursorResponse, Serializable	// class@001f18
{
    public List mAllItems;
    public int mContactsFriendsCount;
    public String mCursor;
    public String mLlsid;
    public int mPortal;
    public String mPrsid;
    public List mUsers;
    public static final long serialVersionUID = 0xcfe190be6ca89d41;

    public void AggregateUserResponse(){
       super();
       this.mAllItems = new ArrayList();
    }
    public String getCursor(){
       return this.mCursor;
    }
    public List getItems(){
       return this.mAllItems;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, AggregateUserResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
}
