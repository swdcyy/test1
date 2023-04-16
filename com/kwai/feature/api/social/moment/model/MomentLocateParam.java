package com.kwai.feature.api.social.moment.model.MomentLocateParam;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import android.os.Bundle;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import android.content.Intent;
import com.kwai.robust.PatchProxyResult;
import ekd.j0;
import android.net.Uri;
import ekd.w0;
import java.lang.Boolean;

public class MomentLocateParam implements Serializable	// class@001187
{
    public String mCommentId;
    public boolean mIsLocated;
    public boolean mIsRefreshed;
    public String mMomentId;
    public boolean mNotifyIfInvalid;
    public boolean mShowCommentArea;
    public boolean mShowEditor;
    public boolean mShowSelectAnimator;
    public boolean mWaitPageListRefresh;
    public static final long serialVersionUID = 0x65bfbe27ed1cd06b;

    public void MomentLocateParam(String p0,String p1){
       super();
       this.mShowSelectAnimator = true;
       this.mWaitPageListRefresh = true;
       this.mMomentId = p0;
       this.mCommentId = p1;
    }
    public static void addToBundle(Bundle p0,MomentLocateParam p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, MomentLocateParam.class, "4")) {
          return;
       }
       SerializableHook.putSerializable(p0, "jump_to_moment_tab_and_locate", p1);
       return;
    }
    public static void addToIntent(Intent p0,MomentLocateParam p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, MomentLocateParam.class, "2")) {
          return;
       }
       if (p0 != null) {
          SerializableHook.putExtra(p0, "jump_to_moment_tab_and_locate", p1);
       }
       return;
    }
    public static MomentLocateParam fromBundle(Bundle p0,MomentLocateParam p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, MomentLocateParam.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return p1;
       }
       Serializable serializable = SerializableHook.getSerializable(p0, "jump_to_moment_tab_and_locate");
       if (serializable instanceof MomentLocateParam) {
          return serializable;
       }
       return p1;
    }
    public static MomentLocateParam fromIntent(Intent p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MomentLocateParam.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return j0.e(p0, "jump_to_moment_tab_and_locate");
    }
    public static MomentLocateParam fromUri(Uri p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MomentLocateParam.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       MomentLocateParam momentLocate = new MomentLocateParam(w0.a(p0, "momentId"), w0.a(p0, "commentId"));
       momentLocate.mShowEditor = Boolean.valueOf(w0.a(p0, "showEditor")).booleanValue();
       return momentLocate;
    }
    public String getCommentId(){
       return this.mCommentId;
    }
    public String getMomentId(){
       return this.mMomentId;
    }
    public boolean isLocated(){
       return this.mIsLocated;
    }
    public boolean isNotifyIfInvalid(){
       return this.mNotifyIfInvalid;
    }
    public boolean isRefreshed(){
       return this.mIsRefreshed;
    }
    public void setLocated(boolean p0){
       this.mIsLocated = p0;
    }
    public void setMomentId(String p0){
       this.mMomentId = p0;
    }
    public MomentLocateParam setNotifyIfInvalid(boolean p0){
       this.mNotifyIfInvalid = p0;
       return this;
    }
    public void setRefreshed(boolean p0){
       this.mIsRefreshed = p0;
    }
}
