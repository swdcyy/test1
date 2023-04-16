package com.kuaishou.live.common.core.component.multiline.model.a;
import pq1.b;
import java.lang.String;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import com.kuaishou.live.common.core.component.multiline.model.LiveLineUserExtraInfo;
import com.kuaishou.live.common.core.component.multiline.model.LiveLineExtraInfo$ExtraInfoUserInfo;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class a extends b	// class@0014f1
{
    public final String e;
    public String f;
    public String g;
    public UserInfos$UserInfo h;
    public LiveLineUserExtraInfo i;
    public LiveLineExtraInfo$ExtraInfoUserInfo j;

    public void a(String p0,String p1,UserInfos$UserInfo p2,String p3,LiveLineUserExtraInfo p4,LiveLineExtraInfo$ExtraInfoUserInfo p5){
       super();
       this.g = p0;
       this.f = p1;
       this.h = p2;
       this.e = p3;
       this.i = p4;
       this.j = null;
    }
    public String a(){
       Object obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return String.valueOf(this.h.userId);
    }
    public String toString(){
       Object[] objArray = null;
       StringBuilder obj = PatchProxy.apply(objArray, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "LiveLineParticipantInfo{mUserInfo="+this.h.userName+", mExtraInfo=";
       a tj = this.j;
       if (tj != null) {
          objArray = tj.mUserName;
       }
       return obj+objArray+", mPositionLeft=\'"+this.a+", mPositionTop="+this.b+", mPositionWidth="+this.c+", mPositionHeight=\'"+this.d+'}';
    }
}
