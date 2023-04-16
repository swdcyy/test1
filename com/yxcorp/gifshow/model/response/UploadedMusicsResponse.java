package com.yxcorp.gifshow.model.response.UploadedMusicsResponse;
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

public class UploadedMusicsResponse implements CursorResponse, Serializable	// class@001f68
{
    public String mCursor;
    public int mErrorCode;
    public String mErrorMessage;
    public String mErrorUrl;
    public List mMusics;
    public static final long serialVersionUID = 0xa7abd69c33271478;

    public void UploadedMusicsResponse(){
       super();
    }
    public String getCursor(){
       return this.mCursor;
    }
    public List getItems(){
       return this.mMusics;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, UploadedMusicsResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
}
