package com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomePostOperationBubblePresenter$b$a;
import erd.o;
import com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomePostOperationBubblePresenter$b;
import java.lang.Object;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.w;
import kotlin.jvm.internal.a;
import qzb.a;
import com.kwai.gifshow.post.api.feature.postentrance.bubble.BaseHomePostBubbleV2;
import java.util.Objects;
import java.lang.Integer;
import brd.t;
import a0c.j;
import java.util.List;
import com.google.gson.JsonArray;
import ezb.k;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import km8.b;
import com.google.gson.JsonElement;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import ekd.q;
import com.google.gson.c;
import a0c.g;
import q87.c;
import java.lang.Exception;
import com.yxcorp.gifshow.postentrance.bubblev2.model.bubbleinfo.PublishGuideInfo;
import com.google.gson.JsonObject;
import com.kwai.gifshow.post.api.feature.camera.model.CommonShootDialog;
import rq.a;

public final class HomePostOperationBubblePresenter$b$a implements o	// class@001027
{
    public final HomePostOperationBubblePresenter$b b;

    public void HomePostOperationBubblePresenter$b$a(HomePostOperationBubblePresenter$b p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       Object[] objArray4;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "1";
       Object obj = PatchProxy.applyOneRefs(p0, this, HomePostOperationBubblePresenter$b$a.class, str);
       if (obj != patchProxyRe) {
       }else {
          a.p(p0, "it");
          p0 = a.a;
          int i = this.b.G();
          Objects.requireNonNull(p0);
          a uoa = a.class;
          if (PatchProxy.isSupport(uoa)) {
             p0 = PatchProxy.applyOneRefs(Integer.valueOf(i), p0, uoa, str);
             if (p0 != patchProxyRe) {
             }else {
             label_0039 :
                p0 = j.class;
                Object[] objArray = null;
                ArrayList uArrayList = PatchProxy.apply(objArray, objArray, p0, "2");
                if (uArrayList != patchProxyRe) {
                }else {
                   JsonArray jsonArray = JsonArray.class;
                   String str1 = "";
                   String str2 = k.a.getString("publishGuides", str1);
                   Object[] objArray3 = (str2 == null || str2 == str1)? objArray: b.a(str2, jsonArray);
                   String str3 = (objArray3 != null)? objArray3.toString(): objArray;
                   if (TextUtils.x(str3)) {
                      uArrayList = new ArrayList();
                   }else {
                      List list = b.a(str3, j.b);
                      if (!q.f(list)) {
                         JsonArray jsonArray1 = PatchProxy.applyOneRefs(str3, objArray, p0, "4");
                         if (jsonArray1 != patchProxyRe) {
                         }else if(!TextUtils.x(str3)){
                            jsonArray1 = c.d(str3).q();
                         }
                         if (!PatchProxy.applyVoidTwoRefs(list, jsonArray1, objArray, p0, "3") && jsonArray1 != null) {
                            for (int i3 = 0; i3 < list.size(); i3++) {
                               list.get(i3).setOriginBubbleInfo(jsonArray1.e0(i3).r().toString());
                            }
                         }
                         uArrayList = list;
                      }else {
                         uArrayList = new ArrayList();
                      }
                   }
                }
                p0 = 1;
                Object[] objArray1 = (uArrayList == null || uArrayList.isEmpty())? 1: null;
                if (objArray1) {
                   objArray1 = new Object[0];
                   g.C().w("home_entrance_bubble", "OPERATE_REPO, failed_show_bubble: fetchOperationBubble, has no data", objArray1);
                   p0 = t.empty();
                   a.o(p0, "Observable.empty\(\)");
                }else {
                   int i1 = uArrayList.size();
                   int i2 = 0;
                   while (i2 < i1) {
                      PublishGuideInfo publishGuide = uArrayList.get(i2);
                      publishGuide.mCameraButtonLocation = i;
                      publishGuide.isFromServer = p0;
                      a.o(publishGuide, "bubbleInfo");
                      Object[] objArray2 = new Object[0];
                      g.C().w("home_entrance_bubble", publishGuide.getOriginBubbleInfo(), objArray2);
                      if (publishGuide.mBubbleUiType != null && publishGuide.mCameraButtonLocation != 2) {
                         publishGuide.mBubbleUiType = 0;
                      }
                      if (publishGuide.mType == 26) {
                         CommonShootDialog uCommonShoot = a.d(CommonShootDialog.class);
                         if (uCommonShoot != null && uCommonShoot.mType == p0) {
                            publishGuide.mCommonShootDialog = uCommonShoot;
                         }
                      }
                      i2 = i2 + 1;
                   }
                   p0 = t.just(uArrayList);
                   a.o(p0, "Observable.just\(guideInfoList\)");
                }
             }
          }else {
             goto label_0039 ;
          }
          obj = p0;
       }
       return obj;
    }
}
