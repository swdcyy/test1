package com.kuaishou.live.common.core.component.bottombubble.notices.increasefans.LiveIncreaseFansNoticeWidget;
import bq5.b;
import com.kuaishou.live.common.core.component.bottombubble.notices.increasefans.LiveIncreaseFansNoticeInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.increasefans.LiveIncreaseFansNoticeWidget$b;
import java.lang.Object;
import com.kuaishou.live.common.core.component.bottombubble.notices.increasefans.LiveIncreaseFansNoticeWidget$NoticeStatus;
import cd1.f;
import androidx.lifecycle.MutableLiveData;
import java.lang.Boolean;
import cd1.d;
import cd1.e;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.LiveGenericCommentNoticeInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.increasefans.LiveIncreaseFansNoticeInfo$ExtraInfo;
import dp3.g;
import dp3.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import java.lang.Integer;
import android.animation.Animator;
import bq5.a;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import ag6.a;
import com.kuaishou.live.common.core.component.bottombubble.notices.increasefans.LiveIncreaseFansNoticeView;
import cd1.g;
import com.kuaishou.live.common.core.component.bottombubble.notices.increasefans.LiveIncreaseFansNoticeView$b;
import com.kuaishou.live.common.core.component.bottombubble.notices.increasefans.LiveIncreaseFansNoticeWidget$a;
import android.view.View$OnClickListener;
import android.widget.LinearLayout;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseInfo;

public class LiveIncreaseFansNoticeWidget implements b	// class@000fde
{
    public LiveIncreaseFansNoticeView b;
    public final LiveIncreaseFansNoticeWidget$b c;
    public int d;
    public long e;
    public LiveIncreaseFansNoticeWidget$NoticeStatus f;
    public final String g;
    public final MutableLiveData h;
    public final Observer i;
    public final MutableLiveData j;
    public final MutableLiveData k;
    public final Observer l;
    public final MutableLiveData m;
    public final Observer n;

    public void LiveIncreaseFansNoticeWidget(LiveIncreaseFansNoticeInfo p0,LiveIncreaseFansNoticeWidget$b p1){
       super();
       this.e = -1;
       this.f = LiveIncreaseFansNoticeWidget$NoticeStatus.STATUS_UNKNOWN;
       this.i = new f(this);
       Boolean fALSE = Boolean.FALSE;
       this.j = new MutableLiveData(fALSE);
       this.k = new MutableLiveData(fALSE);
       this.l = new d(this);
       this.m = new MutableLiveData(fALSE);
       this.n = new e(this);
       this.h = new MutableLiveData(p0);
       this.c = p1;
       this.d = p0.mDisplayCount;
       this.g = p0.mExtraInfo.mUserId;
    }
    public void A(int p0){
       f.b(this, p0);
    }
    public void B(boolean p0){
       LiveIncreaseFansNoticeWidget liveIncrease = LiveIncreaseFansNoticeWidget.class;
       if (PatchProxy.isSupport(liveIncrease) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, liveIncrease, "5")) {
          return;
       }
       this.m.setValue(Boolean.valueOf(p0));
       return;
    }
    public void C(boolean p0){
       LiveIncreaseFansNoticeWidget liveIncrease = LiveIncreaseFansNoticeWidget.class;
       if (PatchProxy.isSupport(liveIncrease) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, liveIncrease, "4")) {
          return;
       }
       this.k.setValue(Boolean.valueOf(p0));
       return;
    }
    public void D(LiveIncreaseFansNoticeWidget$NoticeStatus p0){
       this.f = p0;
    }
    public final void E(){
       if (PatchProxy.applyVoid(null, this, LiveIncreaseFansNoticeWidget.class, "10")) {
          return;
       }
       this.h.removeObserver(this.i);
       this.m.removeObserver(this.n);
       this.k.removeObserver(this.l);
       this.j.removeObserver(this.l);
       return;
    }
    public void F(String p0,String p1,int p2){
       if (PatchProxy.isSupport(LiveIncreaseFansNoticeWidget.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, LiveIncreaseFansNoticeWidget.class, "2")) {
          return;
       }
       LiveIncreaseFansNoticeInfo value = this.h.getValue();
       value.mSubTitle = p0;
       value.mDescription = p1;
       value.mDisplayCount = p2;
       this.h.postValue(value);
       this.d = p2;
       return;
    }
    public Animator a(){
       return a.b(this);
    }
    public int b(){
       return a.f(this);
    }
    public void c(){
       f.c(this);
    }
    public Animator d(){
       return a.a(this);
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, LiveIncreaseFansNoticeWidget.class, "7")) {
          return;
       }
       this.D(LiveIncreaseFansNoticeWidget$NoticeStatus.STATUS_UNSHOW);
       this.E();
       return;
    }
    public View getView(){
       return this.b;
    }
    public int h(){
       return 2;
    }
    public void i(LayoutInflater p0,ViewGroup p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveIncreaseFansNoticeWidget.class, "1")) {
          return;
       }
       LiveIncreaseFansNoticeView liveIncrease = a.c(p0, R.layout.arg_RES_7f0d0a95, p1, false);
       this.b = liveIncrease;
       liveIncrease.setButtonClickListener(new g(this));
       this.b.setOnClickListener(new LiveIncreaseFansNoticeWidget$a(this));
       if (!PatchProxy.applyVoid(null, this, LiveIncreaseFansNoticeWidget.class, "9")) {
          this.E();
          this.h.observeForever(this.i);
          this.m.observeForever(this.n);
          this.k.observeForever(this.l);
          this.j.observeForever(this.l);
       }
       return;
    }
    public int r(){
       return a.d(this);
    }
    public int t(){
       Object obj = PatchProxy.apply(null, this, LiveIncreaseFansNoticeWidget.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.h.getValue().mBizType;
    }
    public int z(){
       return a.e(this);
    }
}
