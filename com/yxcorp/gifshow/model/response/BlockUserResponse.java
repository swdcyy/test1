package com.yxcorp.gifshow.model.response.BlockUserResponse;
import com.kwai.framework.model.response.CursorResponse;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Iterator;
import com.yxcorp.gifshow.model.BlockUser;
import com.kwai.framework.model.user.User;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class BlockUserResponse implements CursorResponse, Serializable	// class@001f1b
{
    public List mBlockUsers;
    public String mCursor;

    public void BlockUserResponse(){
       super();
    }
    public String getCursor(){
       return this.mCursor;
    }
    public List getItems(){
       ArrayList obj = PatchProxy.apply(null, this, BlockUserResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       Iterator iterator = this.mBlockUsers.iterator();
       while (iterator.hasNext()) {
          BlockUser uBlockUser = iterator.next();
          uBlockUser.mBlockedUser.mBlacked = true;
          obj.add(uBlockUser);
       }
       return obj;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, BlockUserResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!TextUtils.x(this.mCursor) && !("no_more").equals(this.mCursor))? true: false;
       return b;
    }
}
