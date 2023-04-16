package com.yxcorp.gifshow.profile.fragment.ProfileOperationFragment;
import lnc.g2$a;
import im8.g;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import k4c.a1;
import k3c.j1;
import java.util.Map;
import java.util.HashMap;
import android.os.Bundle;
import lnc.g2;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.yxcorp.gifshow.profile.model.UserOperationEntranceGroup;
import com.kwai.framework.model.user.User;
import qa9.q;
import qa9.s;
import s1c.j1;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import com.yxcorp.gifshow.profile.common.event.RxPageBus;
import im8.c;
import java.util.ArrayList;
import ekd.j;
import com.kwai.framework.model.user.UserProfile;
import u3c.h;
import t3c.b;
import java.lang.Integer;
import lnc.i3;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.gifshow.profile.model.UserOperationEntrance;
import com.yxcorp.gifshow.profile.model.UserOperationEntranceType;
import k2b.f3;
import fg6.a;
import com.google.gson.Gson;
import k2b.e0;

public class ProfileOperationFragment extends BaseFragment implements g2$a, g	// class@001310
{
    public g2 j;
    public UserOperationEntranceGroup[] k;
    public j1 l;
    public User m;
    public ProfileParam n;
    public BaseFragment o;
    public RxPageBus p;
    public static final int q;

    public void ProfileOperationFragment(){
       super();
    }
    public PresenterV2 B2(){
       Object obj = PatchProxy.applyWithListener(null, this, ProfileOperationFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(ProfileOperationFragment.class, "5");
       return new a1();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ProfileOperationFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new j1();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, ProfileOperationFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(ProfileOperationFragment.class, new j1());
       }else {
          obj.put(ProfileOperationFragment.class, null);
       }
       return obj;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileOperationFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.j = new g2(this, this);
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, ProfileOperationFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, 0x7f0d127a, p1, false);
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ProfileOperationFragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       Bundle arguments = this.getArguments();
       if (arguments != null) {
          this.k = SerializableHook.getSerializable(arguments, "operationData");
          this.m = SerializableHook.getSerializable(arguments, "paramUser");
          q oq = s.a(this);
          if (oq != null) {
             this.l = oq.a("paramCallerContext", j1.class);
             this.n = oq.a("paramProfile", ProfileParam.class);
             this.o = oq.a("paramFragment", BaseFragment.class);
             this.p = oq.a("paramPageBus", RxPageBus.class);
          }
          ProfileOperationFragment tn = this.n;
          if (tn != null) {
             ProfileOperationFragment to = this.o;
             if (to != null) {
                Object[] objArray = new Object[]{new c("FRAGMENT", this),this,new c("ENTRANCE_GROUP_DATA", this.k),new c("ENTRANCE_PROFILE_FRAGMENT", to),new c("ENTRANCE_PROFILE_PARAM", tn),new c("ENTRANCE_PROFILE_PAGEBUS", this.p)};
                int i = 0;
                this.j.b(j.a(objArray));
                tn = this.o;
                to = this.k;
                int i1 = h.g(this.n.mUserProfile);
                if (!PatchProxy.isSupport(b.class) || (!PatchProxy.applyVoidThreeRefs(tn, to, Integer.valueOf(i1), null, b.class, "1") && !j.h(to))) {
                   ArrayList uArrayList = new ArrayList();
                   i3 oi3 = i3.f();
                   int len = to.length;
                   while (i < len) {
                      object oobject = to[i];
                      if (oobject != null && !q.f(oobject.mOperationEntrances)) {
                         Iterator iterator = oobject.mOperationEntrances.iterator();
                         while (iterator.hasNext()) {
                            UserOperationEntrance userOperatio = iterator.next();
                            if (userOperatio != null) {
                               UserOperationEntrance mEntranceTyp = userOperatio.mEntranceType;
                               if (mEntranceTyp != null) {
                                  uArrayList.add(mEntranceTyp.value());
                                  if (userOperatio.mEntranceType == UserOperationEntranceType.INTIMATE_RELATION) {
                                     b.a(oi3, userOperatio, i1);
                                  }
                               }
                            }
                         }
                      }
                      i = i + 1;
                   }
                   f3 uof3 = f3.j("FUNC_EXPAND_POPUP");
                   oi3.d("func_array", a.a.q(uArrayList));
                   uof3.m(oi3.e());
                   uof3.h(tn);
                }
                return;
             }
          }
          s.b(this);
          return;
       }else {
          s.b(this);
          return;
       }
    }
}
