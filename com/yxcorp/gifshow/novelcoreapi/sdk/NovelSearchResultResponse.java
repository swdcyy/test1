package com.yxcorp.gifshow.novelcoreapi.sdk.NovelSearchResultResponse;
import com.kwai.framework.model.response.CursorResponse;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.novelcoreapi.sdk.NovelSearchResultInfo;
import java.util.List;
import java.lang.Boolean;

public class NovelSearchResultResponse implements CursorResponse, Serializable	// class@0021ca
{
    public NovelSearchResultInfo mNovelSearchResultInfo;
    public static final long serialVersionUID = 0x3978e3b5f9021243;

    public void NovelSearchResultResponse(){
       super();
    }
    public String getCursor(){
       Object obj = PatchProxy.apply(null, this, NovelSearchResultResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mNovelSearchResultInfo.getCursor();
    }
    public List getItems(){
       Object obj = PatchProxy.apply(null, this, NovelSearchResultResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mNovelSearchResultInfo.getItems();
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, NovelSearchResultResponse.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.mNovelSearchResultInfo.hasMore();
    }
}
