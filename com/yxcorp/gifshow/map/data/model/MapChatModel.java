package com.yxcorp.gifshow.map.data.model.MapChatModel;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import la6.a;

public class MapChatModel implements Serializable	// class@001c74
{
    public List mChatList;
    public String mCursor;
    public int mUnReadNum;

    public void MapChatModel(){
       super();
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, MapChatModel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
}
