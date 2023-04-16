package com.yxcorp.gifshow.novelcoreapi.sdk.NovelCategoryBookResponse;
import com.kwai.framework.model.response.CursorResponse;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.novelcoreapi.sdk.NovelCategoryBookResponse$Data;
import java.util.List;
import kotlin.jvm.internal.a;
import java.lang.Boolean;

public class NovelCategoryBookResponse implements CursorResponse, Serializable	// class@0021c3
{
    public NovelCategoryBookResponse$Data mData;

    public void NovelCategoryBookResponse(){
       super();
    }
    public String getCursor(){
       Object[] objArray = null;
       NovelCategoryBookResponse obj = PatchProxy.apply(objArray, this, NovelCategoryBookResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mData;
       if (obj != null) {
          objArray = obj.getNextCursor();
       }
       return String.valueOf(objArray);
    }
    public List getItems(){
       Object[] objArray = null;
       NovelCategoryBookResponse obj = PatchProxy.apply(objArray, this, NovelCategoryBookResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mData;
       if (obj != null) {
          objArray = obj.getBooks();
       }
       a.m(objArray);
       return objArray;
    }
    public final NovelCategoryBookResponse$Data getMData(){
       return this.mData;
    }
    public boolean hasMore(){
       Object[] objArray = null;
       NovelCategoryBookResponse obj = PatchProxy.apply(objArray, this, NovelCategoryBookResponse.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mData;
       if (obj != null) {
          objArray = obj.getNextCursor();
       }
       return (a.g(objArray, "no_more") ^ 0x01);
    }
    public final void setMData(NovelCategoryBookResponse$Data p0){
       this.mData = p0;
    }
}
