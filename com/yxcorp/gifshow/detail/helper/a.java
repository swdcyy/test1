package com.yxcorp.gifshow.detail.helper.a;
import java.lang.Object;
import com.yxcorp.gifshow.model.survey.ActionSurveyType;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.preference.startup.ActionSurveyConfig;
import java.lang.reflect.Type;
import oe6.b;
import java.util.ArrayList;
import com.yxcorp.gifshow.detail.helper.a$a;
import java.lang.Enum;
import com.kwai.framework.preference.startup.ActionSurveySubtypeActions;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.PhotoMeta;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import wh5.c;
import com.kwai.framework.model.user.QCurrentUser;
import oe6.e;
import android.content.SharedPreferences;
import java.lang.System;
import brd.t;
import dp5.a;
import e1a.a;
import com.gifshow.tuna.player.poi.e;
import erd.g;
import crd.b;

public class a	// class@00156a
{
    public static b a;

    public void a(){
       super();
    }
    public static List a(ActionSurveyType p0){
       ArrayList uArrayList = null;
       ActionSurveyConfig obj = PatchProxy.applyOneRefs(p0, uArrayList, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.a(ActionSurveyConfig.class);
       if (obj != null) {
          obj = obj.mActions;
          if (obj != null) {
             uArrayList = new ArrayList();
             switch (a$a.a[p0.ordinal()]){
                 case 1:
                   if (!q.f(obj.mReportActions)) {
                      uArrayList.addAll(obj.mReportActions);
                   }
                   break;
                 case 2:
                   if (!q.f(obj.mFollowActions)) {
                      uArrayList.addAll(obj.mFollowActions);
                   }
                   break;
                 case 3:
                   if (!q.f(obj.mShareActions)) {
                      uArrayList.addAll(obj.mShareActions);
                   }
                   break;
                 case 4:
                   if (!q.f(obj.mPlayActions)) {
                      uArrayList.addAll(obj.mPlayActions);
                   }
                   break;
                 case 5:
                   if (!q.f(obj.mLikeActions)) {
                      uArrayList.addAll(obj.mLikeActions);
                   }
                   break;
                 case 6:
                   if (!q.f(obj.mCommentActions)) {
                      uArrayList.addAll(obj.mCommentActions);
                   }
                   break;
                 case 7:
                   if (!q.f(obj.mPushActions)) {
                      uArrayList.addAll(obj.mPushActions);
                   }
                   break;
                 default:
             }
          }
       }
       return uArrayList;
    }
    public static void b(QPhoto p0,ActionSurveyType p1,String p2){
       PhotoMeta photoMeta;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, a.class, "2")) {
          return;
       }
       if (p0 == null || (p0.getPhotoMeta() != null && (p0.getPhotoMeta().mNeedActionSurvey == null && (TextUtils.x(p0.getPhotoMeta().mSurveyId) || (TextUtils.x(p2) || (!p0.isVideoType() || (!c.b() && QCurrentUser.ME.isLogined()))))))) {
          ActionSurveyConfig uActionSurve = b.a(ActionSurveyConfig.class);
          if (uActionSurve == null) {
             return;
          }else {
             uActionSurve = uActionSurve.mInterval;
             long l = 0;
             if (uActionSurve - l <= 0) {
                photoMeta = 0x5265c00;
             }
             if ((System.currentTimeMillis() - e.a.getLong("action_survey_showed_last_time", l)) - photoMeta <= 0) {
                return;
             }else if(!TextUtils.x(p0.getPhotoMeta().mSurveyId)){
                p1 = ActionSurveyType.PUSH;
                p2 = "PUSH";
             }
             a.b(p1.getType(), p2, p0.getPhotoMeta().mSurveyId, p0.getPhotoMeta().mSelectionSurveyId, p0).subscribe(new a(p0, p1, p2), e.b);
          }
       }
    label_009a :
       return;
    }
}
