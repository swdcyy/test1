package com.yxcorp.gifshow.profile.model.response.PhotoViewUserResponse;
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

public class PhotoViewUserResponse implements CursorResponse, Serializable	// class@0013e5
{
    public String mCursor;
    public List mItems;
    public int mViewCount;
    public static final long serialVersionUID = 0xadd0ff107b6430e;

    public void PhotoViewUserResponse(){
       super();
    }
    public String getCursor(){
       return this.mCursor;
    }
    public List getItems(){
       return this.mItems;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, PhotoViewUserResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
}
