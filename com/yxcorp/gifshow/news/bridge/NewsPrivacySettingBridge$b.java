package com.yxcorp.gifshow.news.bridge.NewsPrivacySettingBridge$b;
import java.util.concurrent.Callable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.model.user.QCurrentUser;

public final class NewsPrivacySettingBridge$b implements Callable	// class@00215b
{
    public final int b;
    public final int c;

    public void NewsPrivacySettingBridge$b(int p0,int p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object call(){
       Boolean uBoolean = PatchProxy.apply(null, this, NewsPrivacySettingBridge$b.class, "1");
       if (uBoolean != PatchProxyResult.class) {
       }else if(this.b < null || this.c < null){
          uBoolean = Boolean.FALSE;
       }else {
          QCurrentUser.ME.startEdit().setPrivateNews(this.b).setPrivateNewsBlackCount(this.c).commitChanges();
          uBoolean = Boolean.TRUE;
       }
       return uBoolean;
    }
}
