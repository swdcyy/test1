package com.yxcorp.gifshow.reminder.data.ReminderMixResponse;
import com.kwai.framework.model.response.CursorResponse;
import java.io.Serializable;
import java.lang.Object;
import java.util.List;
import java.util.Collections;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import la6.a;

public final class ReminderMixResponse implements CursorResponse, Serializable	// class@001a68
{
    public String mCursor;
    public String mExtraInfo;
    public List mItems;
    public String mListLoadSequenceId;
    public String mSessionId;
    public String mUnreadNewsFallBackText;
    public static final long serialVersionUID = 0xe08ba820182f0717;

    public void ReminderMixResponse(){
       super();
       this.mItems = Collections.emptyList();
    }
    public String getCursor(){
       return this.mCursor;
    }
    public List getItems(){
       return this.mItems;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, ReminderMixResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
}
