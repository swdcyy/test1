package com.yxcorp.gifshow.relation.user.fragment.UserListRnFragment;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.kuaishou.krn.model.LaunchModel$b;
import com.yxcorp.gifshow.relation.user.fragment.UserListRnFragment$a;
import com.yxcorp.gifshow.relation.user.model.UserListParam;
import java.lang.Enum;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import fg6.a;
import android.net.Uri;
import ekd.x0;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import ekd.q;
import java.util.Collections;
import java.util.HashMap;
import com.google.common.collect.Maps;
import java.util.Iterator;
import com.google.gson.Gson;
import com.kuaishou.krn.model.LaunchModel;
import com.kwai.kds.krn.api.page.KwaiRnFragment;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;

public class UserListRnFragment extends LazyInitSupportedFragment	// class@001a0f
{
    public UserListParam s;

    public void UserListRnFragment(){
       super();
    }
    public View eh(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, UserListRnFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, 0x7f0d0028, p1, false);
    }
    public void fh(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, UserListRnFragment.class, "3")) {
          return;
       }
       e uoe = this.getChildFragmentManager().beginTransaction();
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       KwaiRnFragment kwaiRnFragme = PatchProxy.apply(objArray, this, UserListRnFragment.class, "4");
       if (kwaiRnFragme != patchProxyRe) {
       }else {
          LaunchModel$b uob = PatchProxy.apply(objArray, this, UserListRnFragment.class, "5");
          if (uob != patchProxyRe) {
          }else {
             uob = new LaunchModel$b();
             int i = UserListRnFragment$a.a[this.s.mMode.ordinal()];
             String str = "userId";
             String str1 = "containerSource";
             if (i != 1) {
                if (i != 2) {
                   if (i != 3) {
                      if (i == 4) {
                         uob.i("SocialSameFollow");
                         uob.j("SocialSameFollow");
                         uob.e(str1, "SocialSameFollow");
                         uob.e(str, this.s.mUserId);
                      }
                   }else {
                      uob.i("SocialCommonFriends");
                      uob.j("SocialCommonFriends");
                      uob.e(str1, "SocialCommonFriends");
                      if (!TextUtils.x(this.s.mUri)) {
                         Gson a = a.a;
                         Uri uri = x0.f(this.s.mUri);
                         Map map = PatchProxy.applyOneRefs(uri, objArray, UserListRnFragment.class, "6");
                         if (map != patchProxyRe) {
                         }else {
                            Set set = x0.c(uri);
                            if (q.f(set)) {
                               map = Collections.emptyMap();
                            }else {
                               map = Maps.t(set.size());
                               Iterator iterator = set.iterator();
                               while (iterator.hasNext()) {
                                  str = iterator.next();
                                  map.put(str, x0.a(uri, str));
                               }
                            }
                         }
                         uob.e("params", a.q(map));
                      }
                   }
                }else {
                   uob.i("SocialAggregateUserList");
                   uob.j("SocialAggregateUserList");
                   uob.e(str1, "SocialAggregateUserList").b("type", this.s.mNoticeType).e("queryUrl", this.s.mQueryUrl).m(this.s.mTitle);
                }
             }else {
                uob.i("SocialMutualFriends");
                uob.j("MutualFriends");
                uob.e(str1, "SocialMutualFriends").e(str, this.s.mUserId);
             }
          }
          kwaiRnFragme = KwaiRnFragment.Yg(uob.e("themeStyle", "1").f("enableBackBtnHandler", false).h());
       }
       uoe.v(R.id.fragment_container, kwaiRnFragme);
       uoe.m();
       return;
    }
    public boolean lh(){
       return true;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UserListRnFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.s = SerializableHook.getSerializable(this.getArguments(), "userListParam");
       return;
    }
}
