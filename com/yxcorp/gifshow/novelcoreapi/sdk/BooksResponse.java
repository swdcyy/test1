package com.yxcorp.gifshow.novelcoreapi.sdk.BooksResponse;
import com.kwai.framework.model.response.CursorResponse;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.novelcoreapi.sdk.BooksResponseInfo;
import java.util.List;
import java.lang.Boolean;

public class BooksResponse implements CursorResponse, Serializable	// class@0021ba
{
    public BooksResponseInfo mBooksResponseInfo;

    public void BooksResponse(){
       super();
    }
    public final Integer getBookCount(){
       Object[] objArray = null;
       BooksResponse obj = PatchProxy.apply(objArray, this, BooksResponse.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mBooksResponseInfo;
       if (obj != null) {
          objArray = obj.getBookCount();
       }
       return objArray;
    }
    public String getCursor(){
       String cursor;
       BooksResponse obj = PatchProxy.apply(null, this, BooksResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mBooksResponseInfo;
       if (obj != null) {
          cursor = obj.getCursor();
          if (cursor != null) {
          label_001d :
             return cursor;
          }
       }
       cursor = "-1";
       goto label_001d ;
    }
    public List getItems(){
       Object[] objArray = null;
       BooksResponse obj = PatchProxy.apply(objArray, this, BooksResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mBooksResponseInfo;
       if (obj != null) {
          objArray = obj.getItems();
       }
       return objArray;
    }
    public final BooksResponseInfo getMBooksResponseInfo(){
       return this.mBooksResponseInfo;
    }
    public boolean hasMore(){
       BooksResponse obj = PatchProxy.apply(null, this, BooksResponse.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mBooksResponseInfo;
       boolean b = (obj != null)? obj.hasMore(): false;
       return b;
    }
    public final void setMBooksResponseInfo(BooksResponseInfo p0){
       this.mBooksResponseInfo = p0;
    }
}
