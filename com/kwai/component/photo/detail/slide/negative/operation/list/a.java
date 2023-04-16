package com.kwai.component.photo.detail.slide.negative.operation.list.a;
import com.yxcorp.gifshow.widget.m;
import mf5.z0;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import com.smile.gifmaker.mvps.utils.observable.ObservableList;
import java.util.Collection;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import android.text.Editable;
import com.kwai.library.widget.edittext.SafeEditText;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.entity.QPhoto;
import mf5.z0$a;
import lnc.ja;
import mf5.y0;
import java.util.List;
import zic.q;
import zic.l;
import mhc.n1;
import erd.g;
import io.reactivex.internal.functions.Functions;
import com.yxcorp.gifshow.events.realaction.RealAction$ExtParams;
import com.kwai.sharelib.model.ShareInitResponse$SharePanelElement;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.action.c;
import java.util.Iterator;
import com.kwai.feature.api.social.message.imshare.model.IMShareTarget;
import kf5.l$b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import ric.d;
import mf5.w0;
import kf5.g;

public final class a extends m	// class@000a86
{
    public final z0 c;

    public void a(z0 p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       String str2;
       z0 a;
       z0 q;
       Object obj = this;
       a obj1 = p0;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(obj1, obj, a.class, str)) {
          return;
       }
       a.p(obj1, "v");
       ArrayList uArrayList = new ArrayList(z0.S8(obj.c));
       obj1 = obj.c;
       Objects.requireNonNull(obj1);
       JsonObject jsonObject = PatchProxy.apply(null, obj1, z0.class, "6");
       if (jsonObject != PatchProxyResult.class) {
       }else {
          jsonObject = new JsonObject();
          JsonObject jsonObject1 = new JsonObject();
          jsonObject1.c0("shareScene", "feed_press_negative_feedback");
          jsonObject.c0("logExt", jsonObject1.toString());
       }
       z0 u = obj.c.u;
       if (u == null) {
          a.S("mEditor");
       }
       String str1 = String.valueOf(u.getText());
       z0$a d = z0.D;
       Activity activity = obj.c.getActivity();
       Objects.requireNonNull(activity, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
       Activity uActivity = activity;
       QPhoto qPhoto = z0.R8(obj.c);
       Objects.requireNonNull(d);
       z0$a uoa = z0$a.class;
       int i = 4;
       int i1 = 3;
       int i2 = 2;
       int i3 = 1;
       int i4 = 0;
       int i5 = 5;
       if (PatchProxy.isSupport2(uoa, str)) {
          Object[] objArray = new Object[i5];
          objArray[i4] = uActivity;
          objArray[i3] = qPhoto;
          objArray[i2] = str1;
          objArray[i1] = jsonObject;
          objArray[i] = uArrayList;
          if (PatchProxy.applyVoid(objArray, d, uoa, str)) {
             str2 = str1;
          label_0103 :
             ArrayList uArrayList1 = new ArrayList(z0.S8(obj.c).size());
             Iterator iterator = z0.S8(obj.c).iterator();
             while (iterator.hasNext()) {
                IMShareTarget shareIMInfo = iterator.next().shareIMInfo;
                a.o(shareIMInfo, "target.shareIMInfo");
                uArrayList1.add(shareIMInfo);
             }
             a = obj.c.A;
             a.m(a);
             BaseFeed entity = z0.R8(obj.c).getEntity();
             obj1 = obj.c;
             z0 b = obj1.B;
             u = obj1.s;
             z0 r = obj1.r;
             if (r == null) {
                a.S("mShareCallerContext");
             }
             a.e(uArrayList1, entity, str2, false, 0, b, u, r.c);
             w0 ow0 = z0.P8(obj.c);
             w0 ow01 = z0.P8(obj.c);
             q = obj.c.q;
             if (q == null) {
                a.S("mIMoreOperationPanel");
             }
             ow0.d(ow01, q);
             return;
          }
       }
       ja.a();
       y0 oy0 = new y0(uArrayList, qPhoto, "", qPhoto);
       q oq = q.class;
       String str3 = "3";
       if (PatchProxy.isSupport2(oq, str3)) {
          Object[] objArray1 = new Object[]{uActivity,"feed_press_negative_feedback",qPhoto,uArrayList,str1,oy0,jsonObject};
          if (PatchProxy.applyVoid(objArray1, null, oq, str3)) {
             str2 = str1;
          label_00ea :
             RealAction$ExtParams uExtParams = RealAction$ExtParams.newInstance();
             ShareInitResponse$SharePanelElement sharePanelEl = new ShareInitResponse$SharePanelElement();
             sharePanelEl.mId = "IM";
             uExtParams.mSharePanelElement = sharePanelEl;
             c.b(10, qPhoto.mEntity, uExtParams);
             PatchProxy.onMethodExit(uoa, str);
             goto label_0103 ;
          }
       }
       str2 = str1;
       l ol = new l("feed_press_negative_feedback", uActivity, qPhoto, uArrayList, str1, oy0);
       q.c(i3, Functions.d(), jsonObject);
       PatchProxy.onMethodExit(oq, str3);
       goto label_00ea ;
    }
}
