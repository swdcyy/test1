package com.kuaishou.gifshow.kuaishan.ui.edit.KuaiShanEditActivityV2$a;
import java.lang.Object;
import nsd.u;
import com.kuaishou.gifshow.kuaishan.model.KSLaunchParams;
import u80.d;
import android.app.Activity;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import com.kuaishou.gifshow.kuaishan.utils.e;
import java.lang.System;
import com.kuaishou.gifshow.kuaishan.ui.edit.KuaiShanEditActivityV2;
import u80.e;
import q87.c;
import com.kuaishou.gifshow.kuaishan.logic.o1;
import java.lang.Throwable;
import e17.i;
import com.kuaishou.gifshow.kuaishan.logic.m1;
import android.content.Intent;
import android.content.Context;
import n90.k;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.gifshow.post.api.feature.nearby.NearbyCommunityParams;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.kuaishou.android.post.PostArguments;

public final class KuaiShanEditActivityV2$a	// class@001ab6
{

    public void KuaiShanEditActivityV2$a(){
       super();
    }
    public void KuaiShanEditActivityV2$a(u p0){
       super();
    }
    public final boolean a(KSLaunchParams p0,d p1,Activity p2){
       String obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, KuaiShanEditActivityV2$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = "launchParams";
       a.p(p0, obj);
       a.p(p1, "ksProject");
       String str = "activity";
       a.p(p2, str);
       e.w("KuaiShanEditActivityV2.launch调用，templateId = "+p0.getTemplateId());
       int i = 0;
       if ((System.currentTimeMillis() - KuaiShanEditActivityV2.W) - 2000 < 0) {
          Object[] objArray = new Object[i];
          e.D().A("KuaiShanEditActivityV2", "Launch KuaiShanEditActivityV2 too frequently", objArray);
          return i;
       }else if(!p1 instanceof o1){
          e.v(null, "ksProject不是KuaiShanProject实例");
          i.a(R.style.arg_RES_7f11066a, 0x7f101be3);
          return i;
       }else {
          KuaiShanEditActivityV2.W = System.currentTimeMillis();
          m1 om1 = m1.w0();
          a.o(om1, "KuaiShanManager.getInstance\(\)");
          om1.y0(p1);
          Intent intent = new Intent(p2, KuaiShanEditActivityV2.class);
          if (!PatchProxy.applyVoidThreeRefs(intent, p0, p2, null, k.class, "1")) {
             a.p(intent, "intent");
             a.p(p0, obj);
             a.p(p2, str);
             VideoContext videoContext = p0.getVideoContext();
             if (videoContext != null) {
                a.o(videoContext, "it");
                intent.putExtra("current_video_context", videoContext.m());
             }
             if (!TextUtils.x(p0.getTemplateId())) {
                intent.putExtra("current_template_id", p0.getTemplateId());
             }
             NearbyCommunityParams nearbyCommun = p0.getNearbyCommunityParams();
             if (nearbyCommun != null) {
                SerializableHook.putExtra(intent, "key_nearby_community_params", nearbyCommun);
             }
             if (!TextUtils.x(p0.getConversationTaskList())) {
                intent.putExtra("conversionTaskList", p0.getConversationTaskList());
             }
             KSLaunchParams mPostArgumen = p0.mPostArguments;
             if (mPostArgumen != null) {
                mPostArgumen.write(intent);
             }
             intent.putExtra("INTENT_KEY_ALBUM_TASK_IMPL", p0.getAlbumTaskImplKey());
             intent.putExtra("photo_task_id", p0.getTaskId());
             intent.putExtra("INTENT_GO_HOME_ON_POST_COMPLETE", p0.isGoHomeOnComplete());
          }
          p2.startActivityForResult(intent, 1003);
          p2.overridePendingTransition(R.anim.arg_RES_7f0100f3, 0x7f01010d);
          return true;
       }
    }
}
