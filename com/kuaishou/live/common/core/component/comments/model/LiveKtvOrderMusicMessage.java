package com.kuaishou.live.common.core.component.comments.model.LiveKtvOrderMusicMessage;
import com.kuaishou.live.basic.model.QLiveMessage;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import o56.c;
import o56.a;
import android.app.Application;
import com.kwai.framework.model.user.UserInfo;
import b61.b;

public class LiveKtvOrderMusicMessage extends QLiveMessage	// class@0010c2
{
    public boolean mHasApply;
    public String mMusicName;
    public static final long serialVersionUID = 0x6c961cfa258799dd;

    public void LiveKtvOrderMusicMessage(){
       super();
       this.mHasApply = false;
    }
    public String getContentString(){
       Object obj = PatchProxy.apply(null, this, LiveKtvOrderMusicMessage.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[]{this.mMusicName};
       return a.a().a().getString(0x7f10253c, objArray);
    }
    public String getUserName(){
       Object obj = PatchProxy.apply(null, this, LiveKtvOrderMusicMessage.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.c(this.mUser);
    }
    public LiveKtvOrderMusicMessage setMusicName(String p0){
       this.mMusicName = p0;
       return this;
    }
}
