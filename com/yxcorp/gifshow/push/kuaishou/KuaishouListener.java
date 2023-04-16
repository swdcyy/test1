package com.yxcorp.gifshow.push.kuaishou.KuaishouListener;
import o75.e0;
import java.lang.Object;
import java.util.List;
import com.yxcorp.gifshow.push.kuaishou.KuaishouListener$onReceive$1;
import msd.a;
import com.kwai.android.common.utils.PushSDKInitUtilKt;

public final class KuaishouListener implements e0	// class@0012fc
{

    public void KuaishouListener(){
       super();
    }
    public void a(List p0){
       PushSDKInitUtilKt.requirePushInit(new KuaishouListener$onReceive$1(this, p0));
    }
}
