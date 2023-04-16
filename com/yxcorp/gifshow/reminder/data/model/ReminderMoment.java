package com.yxcorp.gifshow.reminder.data.model.ReminderMoment;
import mkd.a;
import im8.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.social.moment.model.MomentModel;
import com.yxcorp.utility.TextUtils;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Collections;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ok.k;
import rcc.m;
import java.util.Map;
import java.util.HashMap;
import java.lang.Number;
import java.lang.StringBuilder;

public class ReminderMoment implements a, g	// class@001313
{
    public MomentModel mModel;
    public User mUser;

    public void ReminderMoment(){
       super();
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, ReminderMoment.class, "1")) {
          return;
       }
       if (this.mModel == null) {
          this.mModel = new MomentModel();
       }
       ReminderMoment tmModel = this.mModel;
       tmModel.mMomentUser = this.mUser;
       tmModel.mMomentId = TextUtils.I(tmModel.mMomentId);
       tmModel = this.mModel;
       if (tmModel.mLikers == null) {
          tmModel.mLikers = Lists.b();
       }
       tmModel = this.mModel;
       if (tmModel.mComments == null) {
          tmModel.mComments = Lists.b();
       }
       tmModel = this.mModel;
       if (tmModel.mLikePhotos == null) {
          tmModel.mLikePhotos = Collections.emptyList();
       }
       tmModel = this.mModel;
       if (tmModel.mTags == null) {
          tmModel.mTags = Collections.emptyList();
       }
       tmModel = this.mModel;
       if (tmModel.mPictures == null) {
          tmModel.mPictures = Collections.emptyList();
       }
       return;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ReminderMoment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null || this.getClass() != p0.getClass()) {
          return false;
       }
       if (!k.a(this.mUser, p0.mUser) || !k.a(this.mModel, p0.mModel)) {
          b = false;
       }
       return b;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ReminderMoment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new m();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, ReminderMoment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(ReminderMoment.class, new m());
       }else {
          obj.put(ReminderMoment.class, null);
       }
       return obj;
    }
    public int hashCode(){
       Object[] obj = PatchProxy.apply(null, this, ReminderMoment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new Object[]{this.mModel.mMomentId};
       return k.b(obj);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ReminderMoment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ReminderMoment{mUser="+this.mUser+", mModel="+this.mModel+'}';
    }
}
