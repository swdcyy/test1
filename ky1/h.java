package ky1.h;
import ky1.c;
import java.util.concurrent.atomic.AtomicInteger;
import lp3.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.toptemporarymessage.enhance.view.LiveTempEnhanceView;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.View;
import android.view.ViewGroup;
import hy1.e;
import my1.e;
import android.content.Context;
import ny1.a;
import java.lang.Number;
import java.lang.Integer;
import java.util.Map;
import d61.r;
import java.lang.Runnable;
import ky1.e;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import ky1.g;
import java.lang.CharSequence;
import ky1.f;
import java.lang.Long;
import java.lang.Math;
import android.widget.TextView;
import com.kuaishou.live.common.core.component.toptemporarymessage.enhance.view.a;
import android.widget.RelativeLayout;
import ky1.d;
import android.view.View$OnClickListener;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.yxcorp.utility.TextUtils;
import androidx.lifecycle.MutableLiveData;
import rp5.a;
import lp3.c;
import android.app.Activity;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.Fragment;
import s51.c;
import android.view.ViewParent;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import xp5.i;
import ly1.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.google.gson.JsonObject;
import iy1.l;
import com.google.gson.JsonElement;
import k2b.u1;
import java.lang.StringBuilder;
import java.lang.System;

public class h extends c	// class@002e28
{
    public final e b;
    public LiveTempEnhanceView c;
    public e d;
    public static final AtomicInteger e;

    static {
       h.e = new AtomicInteger();
    }
    public void h(e p0){
       super();
       this.b = p0;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, h.class, "12")) {
          return;
       }
       super.e();
       h tc = this.c;
       if (tc != null) {
          tc.a();
       }
       this.d = null;
       return;
    }
    public boolean g(){
       ViewGroup obj = PatchProxy.apply(null, this, h.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.c(this.k());
       boolean b = (obj != null && !obj.getVisibility())? true: false;
       return b;
    }
    public boolean h(e p0){
       e uoe;
       LiveTempEnhanceView liveTempEnha = this;
       f obj = p0;
       h oh = h.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "1";
       h obj1 = PatchProxy.applyOneRefs(obj, liveTempEnha, oh, str);
       if (obj1 != patchProxyRe) {
          return obj1.booleanValue();
       }
       obj1 = liveTempEnha.c;
       if (obj1 != null) {
          liveTempEnha.m(obj1, -1);
       }
       int andIncrement = h.e.getAndIncrement();
       e d = obj.d;
       LiveTempEnhanceView liveTempEnha1 = new LiveTempEnhanceView(this.j());
       liveTempEnha.c = liveTempEnha1;
       e a = d.a;
       Object obj2 = PatchProxy.applyOneRefs(a, null, a.class, str);
       int i = (obj2 != patchProxyRe)? obj2.intValue(): r.a(a.b, a, Integer.valueOf(a.a)).intValue();
       liveTempEnha1.setNoticeIcon(i);
       g og = PatchProxy.applyTwoRefs(d, liveTempEnha1, liveTempEnha, oh, "4");
       if (og != patchProxyRe) {
       }else {
          e uoe1 = new e(liveTempEnha1);
          d.b.observeForever(uoe1);
          og = new g(d, uoe1);
       }
       CharSequence value = d.b.getValue();
       e b = obj.b;
       obj = new f(liveTempEnha, liveTempEnha1, andIncrement, og);
       if (PatchProxy.isSupport(LiveTempEnhanceView.class)) {
          uoe = b;
          if (!PatchProxy.applyVoidThreeRefs(value, Long.valueOf(b), obj, liveTempEnha1, LiveTempEnhanceView.class, "3")) {
          label_00a5 :
             liveTempEnha1.a();
             liveTempEnha1.g = Math.max(uoe, 2000);
             liveTempEnha1.h = obj;
             liveTempEnha1.c.setText(value);
             if (!PatchProxy.applyVoid(null, liveTempEnha1, LiveTempEnhanceView.class, "7")) {
                liveTempEnha1.post(new a(liveTempEnha1));
             }
          }
       }else {
          uoe = b;
          goto label_00a5 ;
       }
       liveTempEnha1.setOnClickListener(new d(liveTempEnha, d));
       ViewGroup viewGroup = liveTempEnha.c(this.k());
       if (viewGroup == null) {
          return false;
       }else {
          viewGroup.addView(liveTempEnha1);
          b.d0(LiveLogTag.LIVE_ENHANCE_MESSAGE, "onShow normal message", "message", d, "seqId", Integer.valueOf(andIncrement));
          liveTempEnha.d = d;
          return true;
       }
    }
    public boolean i(e p0){
       h obj = PatchProxy.applyOneRefs(p0, this, h.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.d;
       boolean b = false;
       if (obj == null) {
          return b;
       }
       if (!obj.a.equals(p0.a)) {
          return b;
       }
       CharSequence value = p0.b.getValue();
       if (!TextUtils.x(value)) {
          obj.b.setValue(value);
       }
       return true;
    }
    public final Context j(){
       Object obj = PatchProxy.apply(null, this, h.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.a(a.class).c();
    }
    public final View k(){
       Object obj = PatchProxy.apply(null, this, h.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.a(a.class).t().getView();
    }
    public void l(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "2")) {
          return;
       }
       if (TextUtils.x(p0.c)) {
          return;
       }
       this.n(p0);
       this.b.a(c.class).r4(p0.c, this.j());
       return;
    }
    public final void m(LiveTempEnhanceView p0,int p1){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, oh, "3")) {
          return;
       }
       b.c0(LiveLogTag.LIVE_ENHANCE_MESSAGE, "hideEnhanceView normal", "seqId", Integer.valueOf(p1));
       ViewParent parent = p0.getParent();
       if (parent instanceof ViewGroup) {
          parent.removeView(p0);
       }
       p0.a();
       this.d = null;
       this.c = null;
       return;
    }
    public final void n(e p0){
       h oh = h.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oh, "8")) {
          return;
       }
       p0 = p0.a;
       Object[] objArray = null;
       ClientContent$LiveStreamPackage liveStreamPa = PatchProxy.apply(objArray, this, oh, "9");
       if (liveStreamPa != PatchProxyResult.class) {
       }else {
          liveStreamPa = this.b.a(i.class).a();
       }
       if (!PatchProxy.applyVoidTwoRefs(p0, liveStreamPa, objArray, a.class, "2")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "STRENGTHEN_NOTICE_BANNER";
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          JsonObject jsonObject = new JsonObject();
          jsonObject.c0("biz_type", p0.b());
          uElementPack.params = jsonObject.toString();
          uContentPack.liveStreamPackage = liveStreamPa;
          u1.u(1, uElementPack, uContentPack);
       }
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, h.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveTempEnhanceNormalHandler@"+Integer.toHexString(System.identityHashCode(this));
    }
}
