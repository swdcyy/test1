package com.kwai.feature.api.live.floatingscreen.data.LiveFloatingScreenBaseData;
import java.io.Serializable;
import cr5.a;
import com.kwai.feature.api.live.floatingscreen.data.LiveFloatingScreenBaseData$a;
import nsd.u;
import java.lang.Object;
import com.kwai.feature.api.live.floatingscreen.data.LiveFloatingScreenTapActionData;
import com.kwai.framework.model.user.UserInfo;
import fr5.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public class LiveFloatingScreenBaseData implements Serializable, a	// class@000fb7
{
    public int bizId;
    public int bizType;
    public long displayDuration;
    public int priority;
    public int runwayType;
    public LiveFloatingScreenTapActionData tapActionData;
    public UserInfo userInfo;
    public static final LiveFloatingScreenBaseData$a Companion;
    public static final long serialVersionUID;

    static {
       LiveFloatingScreenBaseData.Companion = new LiveFloatingScreenBaseData$a(null);
    }
    public void LiveFloatingScreenBaseData(){
       super();
    }
    public static void getBizType$annotations(){
    }
    public static void getRunwayType$annotations(){
    }
    public final int getBizId(){
       return this.bizId;
    }
    public final int getBizType(){
       return this.bizType;
    }
    public final long getDisplayDuration(){
       return this.displayDuration;
    }
    public final int getPriority(){
       return this.priority;
    }
    public final int getRunwayType(){
       return this.runwayType;
    }
    public final LiveFloatingScreenTapActionData getTapActionData(){
       return this.tapActionData;
    }
    public final UserInfo getUserInfo(){
       return this.userInfo;
    }
    public void registerResourceToPreload(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFloatingScreenBaseData.class, "1")) {
          return;
       }
       a.p(p0, "preload");
       return;
    }
    public final void setBizId(int p0){
       this.bizId = p0;
    }
    public final void setBizType(int p0){
       this.bizType = p0;
    }
    public final void setDisplayDuration(long p0){
       this.displayDuration = p0;
    }
    public final void setPriority(int p0){
       this.priority = p0;
    }
    public final void setRunwayType(int p0){
       this.runwayType = p0;
    }
    public final void setTapActionData(LiveFloatingScreenTapActionData p0){
       this.tapActionData = p0;
    }
    public final void setUserInfo(UserInfo p0){
       this.userInfo = p0;
    }
}
