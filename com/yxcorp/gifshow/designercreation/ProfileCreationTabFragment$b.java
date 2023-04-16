package com.yxcorp.gifshow.designercreation.ProfileCreationTabFragment$b;
import erd.g;
import com.yxcorp.gifshow.designercreation.ProfileCreationTabFragment;
import java.lang.Object;
import com.yxcorp.gifshow.designercreation.model.CreationTabResponse;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.designercreation.model.CreationTab;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.lang.Integer;
import hw9.a;
import hw9.a$a;
import q87.c;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import kotlin.jvm.internal.a;
import hka.l;
import android.view.View;
import androidx.core.view.ViewKt;
import com.yxcorp.gifshow.designercreation.feed.fragment.ProfileCreationContainerFragment;
import java.util.Objects;
import java.util.ArrayList;
import com.yxcorp.gifshow.designercreation.feed.fragment.ProfileCreationContainerFragment$a;
import android.os.Bundle;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.yxcorp.gifshow.designercreation.feed.fragment.ProfileCreationTemplateFragment;
import com.yxcorp.gifshow.designercreation.feed.fragment.ProfileCreationTemplateFragment$a;
import java.lang.Boolean;
import com.yxcorp.gifshow.designercreation.feed.fragment.ProfileCreationMagicFragment;
import com.yxcorp.gifshow.designercreation.feed.fragment.ProfileCreationMagicFragment$a;
import s1c.r0;
import k3c.w1;

public final class ProfileCreationTabFragment$b implements g	// class@0012c6
{
    public final ProfileCreationTabFragment b;

    public void ProfileCreationTabFragment$b(ProfileCreationTabFragment p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       int i1;
       ProfileCreationMagicFragment profileCreat;
       ProfileCreationTemplateFragment profileCreat1;
       Bundle uBundle;
       Bundle obj2;
       Object obj = this;
       ProfileCreationMagicFragment$a obj1 = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(obj1, obj, ProfileCreationTabFragment$b.class, str)) {
       }else {
          CreationTab tab = obj1.getTab();
          List subTab = obj1.getSubTab();
          Object[] objArray = null;
          int i = 0;
          CreationTab uCreationTab = (subTab != null)? CollectionsKt___CollectionsKt.F2(subTab, i): objArray;
          Integer result = obj1.getResult();
          if (result != null) {
             boolean b = true;
             if (result.intValue() != b || (tab == null || (tab.isValid() == b && (!tab.isCreation() || (uCreationTab != null && uCreationTab.isValid() == b))))) {
                Object[] objArray1 = new Object[i];
                a.c.a().s("ProfileCreationTabFragment", "start build fragment", objArray1);
                c childFragmen = obj.b.getChildFragmentManager();
                e uoe = (childFragmen != null)? childFragmen.beginTransaction(): objArray;
                a.o(uoe, "childFragmentManager?.beginTransaction\(\)");
                if (uoe == null) {
                   obj.b.x4();
                }else {
                   c childFragmen1 = obj.b.getChildFragmentManager();
                   Fragment uFragment = (childFragmen1 != null)? childFragmen1.findFragmentByTag("SUB_FRAGMENT_TAG"): objArray;
                   if (a.g(obj1, obj.b.z) && uFragment != null) {
                      if (uFragment instanceof l) {
                         uFragment.a();
                      }
                   }else {
                      ProfileCreationTabFragment$b b1 = obj.b;
                      b1.z = obj1;
                      if (!PatchProxy.applyVoid(objArray, b1, ProfileCreationTabFragment.class, "5")) {
                         ProfileCreationTabFragment w = b1.w;
                         if (w != null) {
                            ViewKt.g(w, b);
                         }
                         w = b1.t;
                         if (w != null) {
                            ViewKt.g(w, i);
                         }
                         w = b1.v;
                         if (w != null) {
                            ViewKt.g(w, i);
                         }
                      }
                      Integer type = tab.getType();
                      String str1 = 3;
                      if (type != null && type.intValue() == str1) {
                         ProfileCreationContainerFragment$a e = ProfileCreationContainerFragment.E;
                         int i3 = obj.b.hashCode();
                         List subTab1 = obj1.getSubTab();
                         a.m(subTab1);
                         Objects.requireNonNull(subTab1, "null cannot be cast to non-null type kotlin.collections.ArrayList<com.yxcorp.gifshow.designercreation.model.CreationTab> /* = java.util.ArrayList<com.yxcorp.gifshow.designercreation.model.CreationTab> */");
                         Objects.requireNonNull(e);
                         if (PatchProxy.isSupport(ProfileCreationContainerFragment$a.class)) {
                            profileCreat1 = PatchProxy.applyTwoRefs(Integer.valueOf(i3), subTab1, e, ProfileCreationContainerFragment$a.class, str);
                            if (profileCreat1 != patchProxyRe) {
                            }
                         }
                         a.p(subTab1, "subTab");
                         profileCreat1 = new ProfileCreationContainerFragment();
                         uBundle = new Bundle();
                         SerializableHook.putSerializable(uBundle, "SUB_TAB", subTab1);
                         SerializableHook.putSerializable(uBundle, "ROOT_FRAGMENT_HASH_CODE", Integer.valueOf(i3));
                         profileCreat1.setArguments(uBundle);
                      }else {
                         obj1 = 2;
                         if (type != null && type.intValue() == obj1) {
                            ProfileCreationTemplateFragment$a p = ProfileCreationTemplateFragment.P;
                            int i2 = obj.b.hashCode();
                            i1 = tab.getType().intValue();
                            Objects.requireNonNull(p);
                            if (PatchProxy.isSupport(ProfileCreationTemplateFragment$a.class)) {
                               obj2 = PatchProxy.applyThreeRefs(Boolean.FALSE, Integer.valueOf(i2), Integer.valueOf(i1), p, ProfileCreationTemplateFragment$a.class, "1");
                               if (obj2 != patchProxyRe) {
                                  profileCreat1 = obj2;
                               }
                            }
                            ProfileCreationTemplateFragment profileCreat2 = new ProfileCreationTemplateFragment();
                            obj2 = new Bundle();
                            obj2.putBoolean("IS_SUB_FRAGMENT", i);
                            obj2.putInt("TAB_TYPE", i1);
                            obj2.putInt("ROOT_FRAGMENT_HASH_CODE", i2);
                            profileCreat2.setArguments(obj2);
                            profileCreat1 = profileCreat2;
                         }else {
                            obj1 = ProfileCreationMagicFragment.L;
                            i1 = obj.b.hashCode();
                            Objects.requireNonNull(obj1);
                            if (PatchProxy.isSupport(ProfileCreationMagicFragment$a.class)) {
                               profileCreat = PatchProxy.applyTwoRefs(Boolean.FALSE, Integer.valueOf(i1), obj1, ProfileCreationMagicFragment$a.class, str);
                               if (profileCreat != patchProxyRe) {
                               label_01b2 :
                                  profileCreat1 = profileCreat;
                               }
                            }
                            profileCreat = new ProfileCreationMagicFragment();
                            uBundle = new Bundle();
                            uBundle.putBoolean("IS_SUB_FRAGMENT", i);
                            uBundle.putInt("ROOT_FRAGMENT_HASH_CODE", i1);
                            profileCreat.setArguments(uBundle);
                            goto label_01b2 ;
                         }
                      }
                      profileCreat1.Fc(obj.b.y);
                      if (uFragment == null) {
                         uoe.g(R.id.single_fragment_container, profileCreat1, "SUB_FRAGMENT_TAG");
                      }else {
                         uoe.w(R.id.single_fragment_container, profileCreat1, "SUB_FRAGMENT_TAG");
                      }
                      uoe.m();
                   }
                }
             }
          }
       label_01ca :
          obj.b.x4();
       }
       return;
    }
}
