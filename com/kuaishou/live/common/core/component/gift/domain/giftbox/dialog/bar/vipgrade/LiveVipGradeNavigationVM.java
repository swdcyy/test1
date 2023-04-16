package com.kuaishou.live.common.core.component.gift.domain.giftbox.dialog.bar.vipgrade.LiveVipGradeNavigationVM;
import yh3.a;
import androidx.lifecycle.LifecycleOwner;
import wi1.a;
import ti1.i;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.dialog.bar.vipgrade.LiveVipGradeNavigationVM$vipGradeConfig$2;
import msd.a;
import qrd.p;
import qrd.s;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.dialog.bar.vipgrade.LiveVipGradeNavigationVM$refreshObserver$1;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import com.kuaishou.live.common.core.component.gift.base.model.Model;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.dialog.bar.vipgrade.LiveVipGradeNavigationVM$a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.dialog.bar.vipgrade.LiveVipGradeNavigationVM$a$b;
import java.lang.Integer;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.dialog.bar.vipgrade.LiveVipGradeNavigationVM$a$c;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.dialog.bar.vipgrade.LiveVipGradeNavigationVM$a$d;
import java.lang.CharSequence;
import android.text.SpannableStringBuilder;
import android.content.res.Resources;
import lnc.a1;
import java.lang.StringBuilder;
import android.text.style.ForegroundColorSpan;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.dialog.bar.vipgrade.LiveVipGradeNavigationVM$a$a;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.dialog.bar.vipgrade.LiveVipGradeNavigationVM$a$g;
import com.kwai.framework.model.user.UserInfo;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.dialog.bar.vipgrade.LiveVipGradeNavigationVM$a$e;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveVipGradeConfig;
import com.yxcorp.utility.TextUtils;
import android.net.Uri;
import ekd.x0;
import android.net.Uri$Builder;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.dialog.bar.vipgrade.LiveVipGradeNavigationVM$a$f;

public final class LiveVipGradeNavigationVM extends a	// class@0011f6
{
    public final p a;
    public final LiveData b;
    public final LiveData c;
    public final LiveData d;
    public final LiveData e;
    public final LiveData f;
    public final LiveData g;
    public final LiveData h;
    public final LiveVipGradeNavigationVM$refreshObserver$1 i;
    public final i j;

    public void LiveVipGradeNavigationVM(LifecycleOwner p0,a p1,i p2){
       a.p(p0, "owner");
       a.p(p1, "vipGradeModel");
       super();
       this.j = p2;
       this.a = s.c(LiveVipGradeNavigationVM$vipGradeConfig$2.INSTANCE);
       MutableLiveData mutableLiveD = new MutableLiveData();
       this.o0(mutableLiveD);
       this.b = mutableLiveD;
       mutableLiveD = new MutableLiveData();
       this.o0(mutableLiveD);
       this.c = mutableLiveD;
       mutableLiveD = new MutableLiveData();
       this.o0(mutableLiveD);
       this.d = mutableLiveD;
       mutableLiveD = new MutableLiveData();
       this.o0(mutableLiveD);
       this.e = mutableLiveD;
       mutableLiveD = new MutableLiveData();
       this.o0(mutableLiveD);
       this.f = mutableLiveD;
       mutableLiveD = new MutableLiveData();
       this.o0(mutableLiveD);
       this.g = mutableLiveD;
       mutableLiveD = new MutableLiveData();
       this.o0(mutableLiveD);
       this.h = mutableLiveD;
       LiveVipGradeNavigationVM$refreshObserver$1 orefreshObse = new LiveVipGradeNavigationVM$refreshObserver$1(this);
       this.i = orefreshObse;
       p1.b(p0, orefreshObse);
    }
    public final LiveData u0(){
       return this.f;
    }
    public final LiveData v0(){
       return this.e;
    }
    public final LiveData w0(){
       return this.b;
    }
    public void x0(LiveVipGradeNavigationVM$a p0){
       LiveVipGradeNavigationVM$a$d a;
       String str;
       LiveVipGradeNavigationVM tj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveVipGradeNavigationVM liveVipGrade = LiveVipGradeNavigationVM.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, liveVipGrade, "2")) {
          return;
       }
       a.p(p0, "intent");
       if (p0 instanceof LiveVipGradeNavigationVM$a$b) {
          this.r0(this.f).setValue(Integer.valueOf(p0.a));
       }else if(p0 instanceof LiveVipGradeNavigationVM$a$c){
          this.r0(this.g).setValue(Integer.valueOf(p0.a));
       }else if(p0 instanceof LiveVipGradeNavigationVM$a$d){
          LiveVipGradeNavigationVM$a$d uoa$d = this.r0(this.h);
          a = p0.a;
          if (PatchProxy.isSupport(liveVipGrade)) {
             str = PatchProxy.applyOneRefs(Integer.valueOf(a), this, liveVipGrade, "4");
             if (str != patchProxyRe) {
             }else if(a <= null){
                str = "";
             }else {
                str = new SpannableStringBuilder();
                String str1 = a1.m().getString(R.string.arg_RES_7f102d70);
                a.o(str1, "CommonUtil.res\(\).getStri¡­ade_predicted_tip_prefix\)");
                str.append(str1);
                str.setSpan(new ForegroundColorSpan(a1.a(R.color.arg_RES_7f060634)), 0, str.length(), 33);
                str.append(" +"+a+a1.m().getString(R.string.arg_RES_7f102d71));
                str.setSpan(new ForegroundColorSpan(a1.a(R.color.arg_RES_7f0604ba)), str.length(), str.length(), 33);
             }
          }else {
             goto label_0063 ;
          }
          uoa$d.setValue(str);
       }else if(p0 instanceof LiveVipGradeNavigationVM$a$a){
          this.r0(this.c).setValue(p0.a);
       }else if(p0 instanceof LiveVipGradeNavigationVM$a$g){
          if (p0.a != null) {
             UserInfo userInfo = new UserInfo();
             QCurrentUser qCurrentUser = QCurrentUser.me();
             a.o(qCurrentUser, "QCurrentUser.me\(\)");
             userInfo.mId = qCurrentUser.getId();
             qCurrentUser = QCurrentUser.me();
             a.o(qCurrentUser, "QCurrentUser.me\(\)");
             userInfo.mHeadUrls = qCurrentUser.getAvatars();
             qCurrentUser = QCurrentUser.me();
             a.o(qCurrentUser, "QCurrentUser.me\(\)");
             userInfo.mHeadUrl = qCurrentUser.getAvatar();
             this.r0(this.d).setValue(userInfo);
          }else {
             this.r0(this.e).setValue(Integer.valueOf(1));
          }
       }else if(p0 instanceof LiveVipGradeNavigationVM$a$e){
          tj = this.j;
          if (tj != null) {
             Object[] objArray = null;
             Object obj = PatchProxy.apply(objArray, this, liveVipGrade, "3");
             if (obj != patchProxyRe) {
                objArray = obj;
             }else {
                Object obj1 = PatchProxy.apply(objArray, this, liveVipGrade, "1");
                if (obj1 != patchProxyRe) {
                }else {
                   obj1 = this.a.getValue();
                }
                LiveConfigStartupResponse$LiveVipGradeConfig mAudienceVip = (obj1 != null)? obj1.mAudienceVipGradeInfoPageLink: objArray;
                if (!TextUtils.x(mAudienceVip)) {
                   objArray = x0.f(mAudienceVip).buildUpon().appendQueryParameter("source", "GIFT_PANEL").appendQueryParameter("livemodel", String.valueOf(2)).build().toString();
                }
             }
             tj.J0(objArray);
          }
       }else if(p0 instanceof LiveVipGradeNavigationVM$a$f){
          tj = this.j;
          if (tj != null) {
             tj.P();
          }
       }
       return;
    }
}
