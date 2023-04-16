package com.kuaishou.screencast.a;
import com.kuaishou.screencast.d;
import com.hpplay.sdk.source.api.IBindSdkListener;
import com.hpplay.sdk.source.browse.api.IBrowseListener;
import com.hpplay.sdk.source.api.IConnectListener;
import com.hpplay.sdk.source.api.ILelinkPlayerListener;
import java.lang.Object;
import com.kuaishou.screencast.ScreencastDeviceInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.hpplay.sdk.source.browse.api.LelinkServiceInfo;
import ew4.a;
import q87.c;
import com.hpplay.sdk.source.api.LelinkSourceSDK;
import com.kuaishou.screencast.d$a;
import android.app.Application;
import o56.a;
import android.content.Context;
import java.lang.Integer;
import java.lang.StringBuilder;
import java.util.Iterator;
import java.util.List;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.hpplay.sdk.source.api.LelinkPlayerInfo;
import com.kuaishou.screencast.c;
import com.yxcorp.utility.AbiUtil;
import com.yxcorp.gifshow.lelink.screencast.KwaiLelink;
import java.util.Collection;
import ekd.q;
import java.util.ArrayList;

public class a implements d, IBindSdkListener, IBrowseListener, IConnectListener, ILelinkPlayerListener	// class@000f03
{
    public LelinkSourceSDK a;
    public d$a b;
    public List c;
    public LelinkServiceInfo d;
    public String e;
    public int f;
    public final long[] g;
    public boolean h;

    public void a(){
       super();
       long[] olongArray = new long[2];
       this.g = olongArray;
    }
    public ScreencastDeviceInfo W2(){
       Object obj = PatchProxy.apply(null, this, a.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.i(this.d);
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().w("ScreencastLelink", "stopSearchDevices", objArray);
       this.a.stopBrowse();
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       if (this.h == null) {
          this.j();
       }
       this.a();
       Object[] objArray = new Object[0];
       a.C().w("ScreencastLelink", "startSearchDevices", objArray);
       this.a.startBrowse();
       return;
    }
    public String c(){
       a obj = PatchProxy.apply(null, this, a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d;
       String name = (obj != null)? obj.getName(): "";
       return name;
    }
    public void d(d$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().w("ScreencastLelink", "initScreencast", objArray);
       LelinkSourceSDK instance = LelinkSourceSDK.getInstance();
       this.a = instance;
       this.b = p0;
       this.c = null;
       this.d = null;
       this.e = "";
       instance.setSdkInitInfo(a.b(), "12853", "23e579a2e930ca90cb1195dcca01e8a3").setBindSdkListener(this).bindSdk();
       return;
    }
    public long[] e(){
       return this.g;
    }
    public void f(String p0,ScreencastDeviceInfo p1,int p2){
       boolean b;
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, a.class, "7")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().w("ScreencastLelink", "startPlay "+p0+" "+p1+" "+p2, objArray);
       this.e = p0;
       this.f = p2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray1 = PatchProxy.applyOneRefs(p1, this, a.class, "24");
       if (objArray1 != patchProxyRe) {
       }else {
          a tc = this.c;
          if (tc != null) {
             Iterator iterator = tc.iterator();
             while (true) {
                if (iterator.hasNext()) {
                   LelinkServiceInfo lelinkServic = iterator.next();
                   Object obj = PatchProxy.applyTwoRefs(p1, lelinkServic, this, a.class, "25");
                   if (obj != patchProxyRe) {
                      b = obj.booleanValue();
                   }else if(p1 == null || (lelinkServic != null && (p1.mDeviceUid != null && (lelinkServic.getUid() != null && (TextUtils.equals(p1.mDeviceUid, lelinkServic.getUid()) || (TextUtils.equals(p1.mDeviceIp, lelinkServic.getIp()) && TextUtils.equals(p1.mDeviceName, lelinkServic.getName()))))))){
                      b = true;
                   }else {
                      b = false;
                   }
                   if (b) {
                      objArray1 = lelinkServic;
                      break ;
                   }
                }
             }
          }
          objArray1 = null;
       }
       this.d = objArray1;
       if (!PatchProxy.applyVoid(null, this, a.class, "10")) {
          objArray1 = new Object[0];
          a.C().w("ScreencastLelink", "playCurrentUrl "+this.e, objArray1);
          LelinkPlayerInfo lelinkPlayer = new LelinkPlayerInfo();
          lelinkPlayer.setLelinkServiceInfo(this.d);
          a tf = this.f;
          if (tf > null) {
             lelinkPlayer.setStartPosition(tf);
          }
          lelinkPlayer.setUrl(this.e);
          lelinkPlayer.setType(102);
          this.a.startPlayMedia(lelinkPlayer);
       }
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, a.class, "12")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().w("ScreencastLelink", "destroyScreencast", objArray);
       this.b = null;
       if (this.a != null) {
          this.a();
          a td = this.d;
          if (td != null) {
             this.a.disConnect(td);
          }
          this.a.setBrowseResultListener(null);
          this.a.setConnectListener(null);
          this.a.setPlayListener(null);
          this.a.unBindSdk();
          this.a = null;
       }
       return;
    }
    public void h(String p0,ScreencastDeviceInfo p1){
       boolean b;
       a uoa = a.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uoa, "6")) {
          return;
       }
       int i = -1;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(i), this, a.class, "7")) {
          Object[] objArray = new Object[0];
          a.C().w("ScreencastLelink", "startPlay "+p0+" "+p1+" "+i, objArray);
          this.e = p0;
          this.f = i;
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          LelinkServiceInfo lelinkServic = PatchProxy.applyOneRefs(p1, this, uoa, "24");
          if (lelinkServic != patchProxyRe) {
          }else {
             a tc = this.c;
             if (tc != null) {
                Iterator iterator = tc.iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      LelinkServiceInfo lelinkServic1 = iterator.next();
                      Object obj = PatchProxy.applyTwoRefs(p1, lelinkServic1, this, uoa, "25");
                      if (obj != patchProxyRe) {
                         b = obj.booleanValue();
                      }else if(p1 == null || (lelinkServic1 != null && (p1.mDeviceUid != null && (lelinkServic1.getUid() != null && (TextUtils.equals(p1.mDeviceUid, lelinkServic1.getUid()) || (TextUtils.equals(p1.mDeviceIp, lelinkServic1.getIp()) && TextUtils.equals(p1.mDeviceName, lelinkServic1.getName()))))))){
                         b = true;
                      }else {
                         b = false;
                      }
                      if (b) {
                         lelinkServic = lelinkServic1;
                         break ;
                      }
                   }
                }
             }
             lelinkServic = null;
          }
          this.d = lelinkServic;
          if (!PatchProxy.applyVoid(null, this, uoa, "10")) {
             Object[] objArray1 = new Object[0];
             a.C().w("ScreencastLelink", "playCurrentUrl "+this.e, objArray1);
             LelinkPlayerInfo lelinkPlayer = new LelinkPlayerInfo();
             lelinkPlayer.setLelinkServiceInfo(this.d);
             a tf = this.f;
             if (tf > null) {
                lelinkPlayer.setStartPosition(tf);
             }
             lelinkPlayer.setUrl(this.e);
             lelinkPlayer.setType(102);
             this.a.startPlayMedia(lelinkPlayer);
          }
       }
       return;
    }
    public final ScreencastDeviceInfo i(LelinkServiceInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       return new ScreencastDeviceInfo(p0.getName(), p0.getIp(), p0.getUid());
    }
    public final void j(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       int i = this.a.loadLePatch(c.j, "", AbiUtil.b());
       int i1 = 0;
       Object[] objArray = new Object[i1];
       a.C().w("ScreencastLelink", "loadPatch\(\) called with: code = ["+i+"] isArm64: "+AbiUtil.b(), objArray);
       if (i == 1 || i == 2) {
          i1 = true;
       }
       this.h = i1;
       return;
    }
    public void onBindCallback(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "2")) {
          return;
       }
       String str = "onBindCallback isSuccess ";
       int i = 0;
       Object[] objArray = new Object[i];
       a.C().w("ScreencastLelink", str+p0, objArray);
       if (p0) {
          Object[] objArray1 = new Object[i];
          a.C().w("ScreencastLelink", str+p0, objArray1);
          this.j();
          KwaiLelink.a().e();
          KwaiLelink.a().f(this);
          KwaiLelink.a().g(this);
          KwaiLelink.a().h(this);
       }
       uoa = this.b;
       if (uoa != null) {
          if (!p0 || this.h == null) {
             i = 1;
          }
          uoa.d(i);
       }
       return;
    }
    public void onBrowse(int p0,List p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "13")) {
          return;
       }
       int i = 0;
       if (p0 == -1) {
          Object[] objArray = new Object[i];
          a.C().w("ScreencastLelink", "onBrowse author failed", objArray);
          a tb = this.b;
          if (tb != null) {
             tb.d(7);
          }
          return;
       }else if(!q.f(p1)){
          this.c = p1;
          if (this.b != null) {
             ArrayList uArrayList = new ArrayList();
             Iterator iterator = p1.iterator();
             while (iterator.hasNext()) {
                uArrayList.add(this.i(iterator.next()));
             }
             Object[] objArray1 = new Object[i];
             a.C().w("ScreencastLelink", "onBrowse deviceInfos "+uArrayList, objArray1);
             if (!q.f(uArrayList)) {
                this.b.a(uArrayList);
             }
          }
       }
       return;
    }
    public void onCompletion(){
       if (PatchProxy.applyVoid(null, this, a.class, "19")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().w("ScreencastLelink", "onCompletion", objArray);
       return;
    }
    public void onConnect(LelinkServiceInfo p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "14")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().w("ScreencastLelink", "onConnect "+p0.getName(), objArray);
       return;
    }
    public void onDisconnect(LelinkServiceInfo p0,int p1,int p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, a.class, "15")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().w("ScreencastLelink", "onDisconnect "+p0.getName(), objArray);
       this.d = null;
       this.e = "";
       a tb = this.b;
       if (tb != null) {
          tb.d(2);
       }
       return;
    }
    public void onError(int p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoa, "22")) {
          return;
       }
       uoa = this.b;
       if (uoa != null) {
          uoa.d(6);
       }
       Object[] objArray = new Object[0];
       a.C().w("ScreencastLelink", "onError what "+p0+" extra "+p1, objArray);
       return;
    }
    public void onInfo(int p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoa, "21")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().w("ScreencastLelink", "onInfo what "+p0+" extra "+p1, objArray);
       return;
    }
    public void onLoading(){
       if (PatchProxy.applyVoid(null, this, a.class, "16")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().w("ScreencastLelink", "onLoading", objArray);
       a tb = this.b;
       if (tb != null) {
          tb.d(3);
       }
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, a.class, "18")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().w("ScreencastLelink", "onPause", objArray);
       return;
    }
    public void onPositionUpdate(long p0,long p1){
       a tg = this.g;
       tg[0] = p0;
       tg[1] = p1;
    }
    public void onSeekComplete(int p0){
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, a.class, "17")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().w("ScreencastLelink", "onStart", objArray);
       a tb = this.b;
       if (tb != null) {
          tb.d(4);
       }
       return;
    }
    public void onStop(){
       if (PatchProxy.applyVoid(null, this, a.class, "20")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().w("ScreencastLelink", "onStop", objArray);
       a tb = this.b;
       if (tb != null) {
          tb.d(5);
       }
       return;
    }
    public void onVolumeChanged(float p0){
    }
    public void stopPlay(){
       if (PatchProxy.applyVoid(null, this, a.class, "11")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().w("ScreencastLelink", "stopPlay", objArray);
       this.e = "";
       this.d = null;
       this.a.stopPlay();
       return;
    }
}
