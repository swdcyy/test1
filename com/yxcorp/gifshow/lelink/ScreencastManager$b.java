package com.yxcorp.gifshow.lelink.ScreencastManager$b;
import com.hpplay.sdk.source.api.IConnectListener;
import com.yxcorp.gifshow.lelink.ScreencastManager;
import java.lang.Object;
import com.hpplay.sdk.source.browse.api.LelinkServiceInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.lelink.util.KLogLelink;
import com.yxcorp.gifshow.lelink.util.KLogLelink$a;
import java.lang.StringBuilder;
import q87.c;
import xza.a;
import com.yxcorp.gifshow.lelink.LelinkDeviceState;
import com.yxcorp.gifshow.lelink.ScreencastManager$d;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.lelink.ScreencastManager$b$a;
import java.lang.Runnable;
import ekd.k1;

public final class ScreencastManager$b implements IConnectListener	// class@001a2c
{
    public final ScreencastManager a;

    public void ScreencastManager$b(ScreencastManager p0){
       this.a = p0;
       super();
    }
    public void onConnect(LelinkServiceInfo p0,int p1){
       ScreencastManager$b uob = ScreencastManager$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "1")) {
          return;
       }
       KLogLelink kLogLelink = KLogLelink.e.a();
       ScreencastManager a = this.a.a;
       StringBuilder str = "√: protocol = "+p1+" , device = ";
       a uoa = null;
       String name = (p0 != null)? p0.getName(): uoa;
       Object[] objArray = new Object[0];
       kLogLelink.w(a, str+name+' ', objArray);
       uob = this.a;
       if (p0 != null) {
          uoa = new a(p0, LelinkDeviceState.Connected);
       }
       uob.g = uoa;
       ScreencastManager$b ta = this.a;
       ScreencastManager g = ta.g;
       if (g != null) {
          ScreencastManager c = ta.c;
          if (c != null) {
             c.d(g);
          }
       }
       return;
    }
    public void onDisconnect(LelinkServiceInfo p0,int p1,int p2){
       StringBuilder str1;
       String str2;
       if (PatchProxy.isSupport(ScreencastManager$b.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, ScreencastManager$b.class, "2")) {
          return;
       }
       String str = null;
       if (p1 == 0x33c2c) {
          if (p0 != null) {
             str = p0.getName();
          }
          str = a.C(str, "等待用户确认");
       }else if(p1 == 0x33c20){
          switch (p2){
              case 0x33c2d:
                str1 = "";
                if (p0 != null) {
                   str = p0.getName();
                }
                str2 = str1+String.valueOf(str)+"连接被拒绝";
                break;
              case 0x33c2e:
                str1 = "";
                if (p0 != null) {
                   str = p0.getName();
                }
                str2 = str1+String.valueOf(str)+"防骚扰响应超时";
                break;
              case 0x33c2f:
                str1 = "";
                if (p0 != null) {
                   str = p0.getName();
                }
                str2 = str1+String.valueOf(str)+"已被加入投屏黑名单";
                break;
              default:
                str1 = "";
                if (p0 != null) {
                   str = p0.getName();
                }
                str2 = str1+String.valueOf(str)+"连接断开";
          }
          str = str2;
       }
       Object[] objArray = new Object[0];
       KLogLelink.e.a().w(this.a.a, "onDisconnect: what = "+p1+"  extra = "+p2+" text = "+str, objArray);
       k1.o(new ScreencastManager$b$a(this));
       return;
    }
}
