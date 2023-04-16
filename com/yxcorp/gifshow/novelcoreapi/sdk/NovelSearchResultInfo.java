package com.yxcorp.gifshow.novelcoreapi.sdk.NovelSearchResultInfo;
import com.kwai.framework.model.response.CursorResponse;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;

public class NovelSearchResultInfo implements CursorResponse, Serializable	// class@0021c9
{
    public List mBooks;
    public String mCursor;
    public static final long serialVersionUID = 0x124aca4e78aa198d;

    public void NovelSearchResultInfo(){
       super();
    }
    public String getCursor(){
       Object obj = PatchProxy.apply(null, this, NovelSearchResultInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mCursor;
    }
    public List getItems(){
       return this.mBooks;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, NovelSearchResultInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!TextUtils.isEmpty(this.mCursor) && !(this.mCursor).equals("no_more"))? true: false;
       return b;
    }
}
