package com.kuaishou.android.post.vote.model.VoteDetailItem;
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

public class VoteDetailItem implements CursorResponse, Serializable	// class@000ecb
{
    public int mCount;
    public String mCursor;
    public List mUserList;
    public static final long serialVersionUID = 0x804054acb645f70e;

    public void VoteDetailItem(){
       super();
    }
    public String getCursor(){
       return this.mCursor;
    }
    public List getItems(){
       return this.mUserList;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, VoteDetailItem.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
}
