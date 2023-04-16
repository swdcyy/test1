package com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.audience.widget.userinfo.LiveAudienceMultiLineUserInfoViewModel;
import yh3.a;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.audience.widget.userinfo.LiveAudienceMultiLineUserInfoViewModel$b;
import nsd.u;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import com.kuaishou.live.common.core.component.multiline.model.a;
import j83.b;
import zq1.a;
import java.lang.Object;
import kotlin.jvm.internal.a;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.audience.widget.userinfo.LiveAudienceMultiLineUserInfoViewModel$g;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.audience.widget.userinfo.LiveAudienceMultiLineUserInfoViewModel$d;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.audience.widget.userinfo.LiveAudienceMultiLineUserInfoViewModel$f;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.audience.widget.userinfo.LiveAudienceMultiLineUserInfoViewModel$e;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.audience.widget.userinfo.LiveAudienceMultiLineUserInfoViewModel$a;
import z0.a;
import androidx.lifecycle.MutableLiveData;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.audience.widget.userinfo.AudienceUserInfoStyle;
import pq1.c;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.audience.widget.userinfo.LiveAudienceMultiLineUserInfoViewModel$userNameText$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Boolean;
import androidx.lifecycle.Observer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.ViewModel;
import java.lang.Integer;
import java.lang.StringBuilder;
import com.kuaishou.android.live.log.b;

public class LiveAudienceMultiLineUserInfoViewModel extends a	// class@001521
{
    public final LiveData a;
    public final Observer b;
    public final Observer c;
    public final Observer d;
    public final Observer e;
    public final LiveData f;
    public final LiveData g;
    public final LiveData h;
    public final LiveData i;
    public final LiveData j;
    public final p k;
    public final String l;
    public final boolean m;
    public final a n;
    public final b o;
    public final a p;
    public static final List q;
    public static final LiveAudienceMultiLineUserInfoViewModel$b r;

    static {
       LiveAudienceMultiLineUserInfoViewModel.r = new LiveAudienceMultiLineUserInfoViewModel$b(null);
       LiveAudienceMultiLineUserInfoViewModel.q = LiveCommonLogTag.MULTI_LINE.appendTag("UserInfoVm");
    }
    public void LiveAudienceMultiLineUserInfoViewModel(String p0,boolean p1,boolean p2,a p3,b p4,a p5){
       LiveData liveData1;
       a.p(p0, "userId");
       a.p(p3, "participantInfo");
       a.p(p4, "widgetBasicModel");
       a.p(p5, "userLayoutModel");
       super();
       this.l = p0;
       this.m = p1;
       this.n = p3;
       this.o = p4;
       this.p = p5;
       LiveData liveData = Transformations.distinctUntilChanged(p5.a());
       String str = "Transformations.distinctUntilChanged\(this\)";
       a.h(liveData, str);
       this.a = liveData;
       LiveAudienceMultiLineUserInfoViewModel$g og = new LiveAudienceMultiLineUserInfoViewModel$g(this);
       this.b = og;
       LiveAudienceMultiLineUserInfoViewModel$d uod = new LiveAudienceMultiLineUserInfoViewModel$d(this);
       this.c = uod;
       LiveAudienceMultiLineUserInfoViewModel$f uof = new LiveAudienceMultiLineUserInfoViewModel$f(this);
       this.d = uof;
       LiveAudienceMultiLineUserInfoViewModel$e uoe = new LiveAudienceMultiLineUserInfoViewModel$e(this);
       this.e = uoe;
       if (p2) {
          liveData1 = Transformations.distinctUntilChanged(p4.b());
          a.h(liveData1, str);
          liveData1 = Transformations.map(liveData1, new LiveAudienceMultiLineUserInfoViewModel$a());
          a.h(liveData1, "Transformations.map\(this\) { transform\(it\) }");
       }else {
          MutableLiveData mutableLiveD3 = new MutableLiveData(AudienceUserInfoStyle.c.a());
       }
       this.f = liveData1;
       MutableLiveData mutableLiveD = new MutableLiveData();
       this.o0(mutableLiveD);
       this.g = mutableLiveD;
       mutableLiveD = new MutableLiveData();
       this.o0(mutableLiveD);
       this.h = mutableLiveD;
       MutableLiveData mutableLiveD1 = new MutableLiveData();
       this.o0(mutableLiveD1);
       this.i = mutableLiveD1;
       MutableLiveData mutableLiveD2 = new MutableLiveData();
       this.o0(mutableLiveD2);
       this.j = mutableLiveD2;
       this.k = s.c(new LiveAudienceMultiLineUserInfoViewModel$userNameText$2(this));
       if (p1) {
          Boolean fALSE = Boolean.FALSE;
          this.r0(mutableLiveD).setValue(fALSE);
          this.r0(mutableLiveD1).setValue(fALSE);
       }else {
          liveData.observeForever(og);
          p4.h().observeForever(uod);
          liveData1.observeForever(uof);
          p4.a().observeForever(uoe);
       }
       return;
    }
    public void onCleared(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceMultiLineUserInfoViewModel.class, "2")) {
          return;
       }
       super.onCleared();
       if (this.m == null) {
          this.a.removeObserver(this.b);
          this.o.h().removeObserver(this.c);
          this.f.removeObserver(this.d);
          this.o.a().removeObserver(this.e);
       }
       return;
    }
    public final void u0(int p0,String p1){
       boolean b;
       LiveAudienceMultiLineUserInfoViewModel liveAudience = LiveAudienceMultiLineUserInfoViewModel.class;
       if (PatchProxy.isSupport(liveAudience) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, liveAudience, "7")) {
          return;
       }
       Boolean value = this.o.a().getValue();
       Boolean value1 = this.o.h().getValue();
       String str = "]resizeUserInfo, reason: ";
       char c = '[';
       if (value != null && (value1 != null && p0 > 0)) {
          b = value.booleanValue();
          int b1 = value1.booleanValue();
          if (!PatchProxy.isSupport(liveAudience) || !PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, Boolean.valueOf(b), Boolean.valueOf(b1), this, LiveAudienceMultiLineUserInfoViewModel.class, "8")) {
             int i = this.p.b();
             int i1 = (p0 - i) - this.p.d();
             if (i1 <= 0) {
                b.T(LiveAudienceMultiLineUserInfoViewModel.q, c+this.l+str+p1+", only min user name", "userInfoWidth", Integer.valueOf(p0), "userNameMinWidth", Integer.valueOf(i));
                Boolean fALSE = Boolean.FALSE;
                this.r0(this.i).setValue(fALSE);
                this.r0(this.h).setValue(fALSE);
                this.r0(this.g).setValue(Integer.valueOf(i));
             }else {
                int i2 = 1;
                if (!b1 || this.p.e()) {
                   b1 = this.p.f();
                   if (i1 >= b1) {
                      i1 = i1 - b1;
                      this.r0(this.i).setValue(Boolean.TRUE);
                   }else {
                      i2 = 0;
                      this.r0(this.i).setValue(Boolean.FALSE);
                   }
                }else {
                   this.r0(this.i).setValue(Boolean.FALSE);
                }
                b1 = this.p.c();
                if (i2 && (b && i1 >= b1)) {
                   i1 = i1 - b1;
                   this.r0(this.h).setValue(Boolean.TRUE);
                }else {
                   this.r0(this.h).setValue(Boolean.FALSE);
                }
                i = i + i1;
                b.P(LiveAudienceMultiLineUserInfoViewModel.q, c+this.l+str+p1+", "+"userInfoWidth: "+p0+", userName: "+i+", "+"followVisibility: "+this.i.getValue()+", "+"muteVisibility: "+this.h.getValue());
                this.r0(this.g).setValue(Integer.valueOf(i));
             }
          }
       }else {
          b.P(LiveAudienceMultiLineUserInfoViewModel.q, c+this.l+str+p1+", layout not ready!");
       }
       return;
    }
}
