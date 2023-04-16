package com.yxcorp.gifshow.novelcoreapi.sdk.NovelPageResponse;
import com.kwai.framework.model.response.CursorResponse;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;

public class NovelPageResponse implements CursorResponse	// class@0021c6
{
    public List mBookBlocks;
    public List mBooks;
    public String mCursor;
    public List mItems;

    public void NovelPageResponse(){
       super();
    }
    public String getCursor(){
       return this.mCursor;
    }
    public List getItems(){
       return this.mItems;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, NovelPageResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!TextUtils.isEmpty(this.mCursor) && !(this.mCursor).equals("no_more"))? true: false;
       return b;
    }
}
