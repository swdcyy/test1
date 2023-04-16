package com.kwai.android.dispatcher.PushConfig;
import java.lang.Object;
import com.kwai.android.register.core.register.BaseChannelInterceptor;
import z35.a;
import kotlinx.coroutines.CoroutineDispatcher;
import ftd.z0;
import com.kwai.android.common.bean.PushData;
import com.kwai.android.common.bean.CommandData;
import com.kwai.android.dispatcher.PushConfig$notificationSmallIcon$1;
import gv6.c;
import java.lang.Class;
import com.kwai.android.common.bean.NotificationSmallIcon;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class PushConfig	// class@0009b6
{
    public c apiBuilder;
    public Class commandDataSubClass;
    public CoroutineDispatcher coroutineDispatcher;
    public BaseChannelInterceptor[] initRegisterInterceptors;
    public boolean launchPushV3ProcessManually;
    public NotificationSmallIcon notificationSmallIcon;
    public Class pushDataSubClass;
    public boolean startSuicideProcessToProcess;

    public void PushConfig(){
       super();
       BaseChannelInterceptor[] uBaseChannel = new BaseChannelInterceptor[0];
       this.initRegisterInterceptors = uBaseChannel;
       this.apiBuilder = new a();
       this.coroutineDispatcher = z0.f();
       this.pushDataSubClass = PushData.class;
       this.commandDataSubClass = CommandData.class;
       this.notificationSmallIcon = PushConfig$notificationSmallIcon$1.INSTANCE;
    }
    public final c getApiBuilder(){
       return this.apiBuilder;
    }
    public final Class getCommandDataSubClass(){
       return this.commandDataSubClass;
    }
    public final CoroutineDispatcher getCoroutineDispatcher(){
       return this.coroutineDispatcher;
    }
    public final BaseChannelInterceptor[] getInitRegisterInterceptors(){
       return this.initRegisterInterceptors;
    }
    public final boolean getLaunchPushV3ProcessManually(){
       return this.launchPushV3ProcessManually;
    }
    public final NotificationSmallIcon getNotificationSmallIcon(){
       return this.notificationSmallIcon;
    }
    public final Class getPushDataSubClass(){
       return this.pushDataSubClass;
    }
    public final boolean getStartSuicideProcessToProcess(){
       return this.startSuicideProcessToProcess;
    }
    public final void setApiBuilder(c p0){
       a.p(p0, "<set-?>");
       this.apiBuilder = p0;
    }
    public final void setCommandDataSubClass(Class p0){
       a.p(p0, "<set-?>");
       this.commandDataSubClass = p0;
    }
    public final void setCoroutineDispatcher(CoroutineDispatcher p0){
       a.p(p0, "<set-?>");
       this.coroutineDispatcher = p0;
    }
    public final void setInitRegisterInterceptors(BaseChannelInterceptor[] p0){
       a.p(p0, "<set-?>");
       this.initRegisterInterceptors = p0;
    }
    public final void setLaunchPushV3ProcessManually(boolean p0){
       this.launchPushV3ProcessManually = p0;
    }
    public final void setNotificationSmallIcon(NotificationSmallIcon p0){
       a.p(p0, "<set-?>");
       this.notificationSmallIcon = p0;
    }
    public final void setPushDataSubClass(Class p0){
       a.p(p0, "<set-?>");
       this.pushDataSubClass = p0;
    }
    public final void setStartSuicideProcessToProcess(boolean p0){
       this.startSuicideProcessToProcess = p0;
    }
}
