package com.kwai.feature.api.router.social.profile.ProfileStartParam;
import java.lang.Object;
import android.os.Bundle;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import java.lang.Class;
import tl8.d;
import java.lang.String;
import com.kuaishou.android.live.model.LiveStreamModel;
import com.kwai.feature.api.router.social.profile.a;
import ok.h;
import tl8.e;
import k2b.u1;
import com.kwai.framework.model.user.QCurrentUser;
import android.view.View;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.entity.QPreInfo;
import com.kwai.feature.api.social.moment.model.MomentLocateParam;
import com.kwai.feature.api.router.social.profile.ProfileExtraKey;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import java.util.HashMap;
import erd.g;
import com.kwai.feature.api.router.social.profile.ProfileStartParam$CollectionSub;
import java.lang.Boolean;

public class ProfileStartParam	// class@00107c
{
    public final Bundle a;
    public User b;
    public View c;
    public QPreInfo d;
    public BaseFeed e;
    public String f;
    public int g;
    public boolean h;
    public boolean i;
    public String j;
    public g k;
    public int l;
    public String m;
    public int n;
    public HashMap o;

    public void ProfileStartParam(){
       super();
       this.a = new Bundle();
       this.f = "DEFAULT";
       this.g = 0;
       this.l = 0;
       this.m = "DEFAULT";
    }
    public void ProfileStartParam(BaseFeed p0){
       super();
       this.a = new Bundle();
       String str = "DEFAULT";
       this.f = str;
       int i = 0;
       this.g = i;
       this.l = i;
       this.m = str;
       this.e = p0;
       if (p0 == null) {
          return;
       }
       User user = p0.a(User.class);
       if (user == null) {
          Object[] objArray = new Object[]{"photoId",p0.getId(),"liveStreamId",e.h(this.e, LiveStreamModel.class, a.b)};
          u1.onEvent("ks://profile", "photo_no_user", objArray);
       }else {
          this.b = user;
       }
       return;
    }
    public static ProfileStartParam i(){
       ProfileStartParam profileStart = new ProfileStartParam();
       profileStart.j = QCurrentUser.ME.getId();
       return profileStart;
    }
    public static ProfileStartParam j(View p0){
       ProfileStartParam profileStart = ProfileStartParam.i();
       profileStart.r(p0);
       return profileStart;
    }
    public static ProfileStartParam k(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ProfileStartParam.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ProfileStartParam(p0);
    }
    public static ProfileStartParam l(User p0){
       ProfileStartParam obj = PatchProxy.applyOneRefs(p0, null, ProfileStartParam.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ProfileStartParam();
       obj.b = p0;
       return obj;
    }
    public static ProfileStartParam m(String p0){
       ProfileStartParam obj = PatchProxy.applyOneRefs(p0, null, ProfileStartParam.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ProfileStartParam();
       obj.j = p0;
       return obj;
    }
    public ProfileStartParam A(QPreInfo p0){
       this.d = p0;
       return this;
    }
    public ProfileStartParam B(MomentLocateParam p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ProfileStartParam profileStart = ProfileStartParam.class;
       ProfileExtraKey obj = PatchProxy.applyOneRefs(p0, this, profileStart, "6");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (p0 != null) {
          obj = ProfileExtraKey.LOCATE_MOMENT;
          if (PatchProxy.applyTwoRefs(obj, p0, this, profileStart, "18") != patchProxyRe) {
          }else {
             SerializableHook.putSerializable(this.a, obj.getValue(), p0);
          }
       }
       return this;
    }
    public ProfileStartParam C(String p0){
       this.m = p0;
       return this;
    }
    public ProfileStartParam D(HashMap p0){
       this.o = p0;
       return this;
    }
    public View a(){
       return this.c;
    }
    public Bundle b(){
       return this.a;
    }
    public int c(){
       return this.l;
    }
    public BaseFeed d(){
       return this.e;
    }
    public String e(){
       return this.m;
    }
    public User f(){
       return this.b;
    }
    public String g(){
       return this.j;
    }
    public boolean h(){
       return this.h;
    }
    public ProfileStartParam n(ProfileExtraKey p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, ProfileStartParam.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.a.putString(p0.getValue(), p1);
       return this;
    }
    public ProfileStartParam o(boolean p0){
       this.i = p0;
       return this;
    }
    public ProfileStartParam p(g p0){
       this.k = p0;
       return this;
    }
    public ProfileStartParam q(String p0){
       this.f = p0;
       return this;
    }
    public ProfileStartParam r(View p0){
       this.c = p0;
       return this;
    }
    public ProfileStartParam s(int p0){
       this.n = p0;
       return this;
    }
    public ProfileStartParam t(ProfileStartParam$CollectionSub p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ProfileStartParam.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          this.n(ProfileExtraKey.COLLECT_SUB_TAB_NAME, p0.name);
       }
       return this;
    }
    public ProfileStartParam u(boolean p0){
       ProfileStartParam profileStart = ProfileStartParam.class;
       if (PatchProxy.isSupport(profileStart)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, profileStart, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0) {
          this.w(6);
       }
       return this;
    }
    public ProfileStartParam v(boolean p0){
       ProfileStartParam profileStart = ProfileStartParam.class;
       if (PatchProxy.isSupport(profileStart)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, profileStart, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0) {
          this.w(4);
       }
       return this;
    }
    public ProfileStartParam w(int p0){
       this.l = p0;
       return this;
    }
    public ProfileStartParam x(BaseFeed p0){
       this.e = p0;
       return this;
    }
    public ProfileStartParam y(BaseFeed p0,int p1,QPreInfo p2){
       if (p0 == null && p2 == null) {
          return this;
       }
       this.e = p0;
       this.g = p1;
       if (p2 != null) {
          this.d = p2;
       }
       return this;
    }
    public ProfileStartParam z(int p0){
       this.g = p0;
       return this;
    }
}
