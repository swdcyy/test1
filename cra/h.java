package cra.h;
import erd.g;
import com.yxcorp.gifshow.growth.util.a;
import java.lang.Object;
import com.yxcorp.gifshow.growth.model.response.DeepLinkDialogResponse;
import java.util.Objects;
import java.lang.String;
import cra.o;
import vma.a;
import com.yxcorp.gifshow.growth.model.response.DeepLinkDialogResponse$DeepLinkDialog;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.net.Uri;
import cra.m;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.e0;
import com.kuaishou.protobuf.log.nano.StidContainerProto$StidContainer;
import f3b.u;
import k2b.u1;
import java.lang.Throwable;
import com.yxcorp.utility.Log;
import android.content.Context;
import xh7.b;
import qh7.b;
import qh7.a;
import wkd.b;
import com.yxcorp.gifshow.retrofit.service.KwaiApiService;
import brd.t;
import io.reactivex.internal.functions.Functions;
import crd.b;

public final class h implements g	// class@002380
{
    public final a b;
    public final boolean c;

    public void h(a p0,boolean p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       h tb = this.b;
       h tc = this.c;
       Objects.requireNonNull(tb);
       a uoa = a.class;
       if (p0 == null) {
          o.a("response is null", "1", null, tc);
       }else if(p0.mDisableRequestDeepLinkDialog != null){
          a.l(true);
       }
       p0 = p0.mDeepLinkDialog;
       p0 = (p0 == null)? "": p0.mDeepLink;
       Activity uActivity = ActivityContext.g().e();
       if (uActivity != null && !TextUtils.x(p0)) {
          if (!PatchProxy.applyVoidOneRefs(p0, tb, uoa, "13") && !TextUtils.x(p0)) {
             try{
                Uri uri = Uri.parse(p0);
                a.a(uri);
                String queryParamet = uri.getQueryParameter("growth_channel_id");
                if (!TextUtils.x(queryParamet)) {
                   ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                   uElementPack.name = "click_dplink";
                   uElementPack.action2 = "DPLINK_JUMP_BUTTON";
                   u1.B(new ClickMetaData().setType(true).setElementPackage(uElementPack).setLogPage(new m(tb)).setInterStidContainer(u.b("st_dplink_id", queryParamet)));
                }
             }catch(java.lang.Exception e7){
                Log.e("GrowthDeepLinkManager", "sendGrowthChannelIdClickLog error + ", e7);
             }
          }
       }
    label_00c2 :
       o.a(p0, "1", null, tc);
       return;
    }
}
