package com.yxcorp.gifshow.c0;
import g56.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import g56.a;
import tkd.b;
import tkd.d;
import wkd.b;
import hn5.n;
import hn5.m;
import com.yxcorp.gifshow.camerasdk.recorder.DeviceStatusCollector;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.Reader;
import java.lang.CharSequence;
import java.lang.Long;
import java.io.IOException;
import com.yxcorp.gifshow.camera.record.album.RecordAlbumActivity;
import com.yxcorp.gifshow.album.home.AlbumFragment;
import java.util.List;
import java.lang.Exception;
import java.lang.Runnable;
import com.yxcorp.gifshow.a0;
import uv8.a2;
import com.yxcorp.gifshow.b0;
import java.lang.Integer;
import x79.e;
import o56.c;
import o56.a;
import android.app.Application;
import java.util.Objects;
import brd.t;
import com.yxcorp.gifshow.album.AlbumLimitOption$Builder;
import uxb.o;
import com.yxcorp.gifshow.album.AlbumLimitOption;
import w69.h0;
import w69.j;
import t45.d;
import brd.z;
import uv8.z1;
import com.gifshow.tuna.player.poi.e;
import erd.g;
import crd.b;

public class c0 extends b	// class@001c7c
{
    public IMediaSelectableFilter a;
    public static boolean b;

    public void c0(){
       super();
    }
    public static void f(){
       long l;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, objArray, c0.class, "5")) {
          return;
       }
       boolean b = true;
       c0.b = b;
       a.c().a(d.a(-1492894991));
       a.c().a(b.a(0x4b316083));
       a.c().a(m.a());
       a.c().a(d.a(0x13cfc0fa));
       a uoa = a.c();
       Object obj = PatchProxy.apply(objArray, objArray, DeviceStatusCollector.class, "3");
       if (obj != PatchProxyResult.class) {
          l = obj.longValue();
       }else {
          long l1 = 0;
          if (DeviceStatusCollector.f - l1 > 0) {
             l = DeviceStatusCollector.f;
          }else {
             try{
                BufferedReader uBufferedRea = new BufferedReader(new FileReader("/proc/meminfo"), 8192);
                try{
                   while (true) {
                      String str = uBufferedRea.readLine();
                      if (str != null) {
                         if (str.contains("MemTotal")) {
                            DeviceStatusCollector.f = Long.valueOf(str.split("\\s+")[b]).longValue() << 10;
                            try{
                               l1 = DeviceStatusCollector.f;
                               uBufferedRea.close();
                            }catch(java.io.IOException e1){
                            }
                            e1.printStackTrace();
                         }
                      }else {
                         uBufferedRea.close();
                      }
                      l = l1;
                   }
                   return;
                }catch(java.lang.Exception e0){
                   objArray = uBufferedRea;
                }
                if (objArray != null) {
                   objArray.close();
                   goto label_00c2 ;
                }else {
                   goto label_00c2 ;
                }
             }catch(java.lang.Exception e0){
                goto label_00b8 ;
             }catch(java.io.IOException e1){
                goto label_00bf ;
             }
          }
       }
       uoa.e("tag_ram_limit", Long.valueOf(l));
       Class[] uClassArray = new Class[]{RecordAlbumActivity.class,AlbumFragment.class};
       int i = 0;
       for (; i < 2; i = i + 1) {
          a.c().d.add(uClassArray[i]);
       }
    }
    public Runnable a(){
       Object obj = PatchProxy.apply(null, this, c0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a0.b;
    }
    public Runnable d(){
       Object obj = PatchProxy.apply(null, this, c0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a2(this);
    }
    public Runnable e(){
       Object obj = PatchProxy.applyWithListener(null, this, c0.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(c0.class, "3");
       return b0.b;
    }
    public void g(int p0){
       t ot;
       c0 uoc0 = c0.class;
       if (PatchProxy.isSupport(uoc0) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc0, "4")) {
          return;
       }
       e uoe = e.f();
       Application uApplication = a.a().a();
       int i = 2;
       Objects.requireNonNull(uoe);
       if (PatchProxy.isSupport(e.class)) {
          ot = PatchProxy.applyThreeRefs(uApplication, Integer.valueOf(i), Integer.valueOf(30), uoe, e.class, "14");
          if (ot != PatchProxyResult.class) {
          label_0056 :
             ot.observeOn(d.c).subscribe(new z1(p0), e.b);
             return;
          }
       }
       ot = j.a(o.a().d()).d(i, 30);
       goto label_0056 ;
    }
}
