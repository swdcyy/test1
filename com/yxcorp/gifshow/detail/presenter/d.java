package com.yxcorp.gifshow.detail.presenter.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.presenter.d$a;
import y4a.k;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import android.util.SparseArray;
import java.lang.StringBuilder;
import vy6.a;
import java.util.List;
import t45.d;
import brd.z;
import brd.t;
import y4a.l;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import android.app.Activity;
import android.view.View;
import android.view.ViewStub;
import com.yxcorp.gifshow.debugview.XfDebugInfoView;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import td5.a;
import yv9.b;
import java.util.HashMap;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import java.lang.Math;
import java.util.Map;
import android.app.ActivityManager;
import android.app.ActivityManager$MemoryInfo;
import android.content.Context;
import android.text.format.Formatter;
import p5a.e;
import de5.a;
import com.kwai.video.player.IKwaiMediaPlayer;
import com.kwai.framework.player.core.b;
import com.kwai.player.debuginfo.model.KwaiPlayerDebugInfo;
import com.kwai.player.debuginfo.KwaiPlayerDebugInfoProvider;
import com.kwai.player.debuginfo.model.AppVodQosDebugInfoNew;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Long;
import java.lang.Float;
import android.net.Uri;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class d extends PresenterV2	// class@0016d3
{
    public final a A;
    public final XfDebugInfoView$a B;
    public XfDebugInfoView p;
    public a q;
    public List r;
    public t s;
    public PhotoDetailLogger t;
    public SlidePlayViewModel u;
    public BaseFragment v;
    public long w;
    public int x;
    public SparseArray y;
    public StringBuilder z;

    public void d(){
       super();
       this.A = new d$a(this);
       this.B = new k(this);
    }
    public void E8(){
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "3")) {
          return;
       }
       this.u = SlidePlayViewModel.S0(this.v.getParentFragment());
       if (this.p != null) {
          if (!PatchProxy.applyVoid(objArray, this, uod, "6")) {
             this.y = new SparseArray();
             this.z = "";
          }
          uod = this.u;
          if (uod != null) {
             uod.P(this.v, this.A);
          }else {
             uod = this.r;
             if (uod != null) {
                uod.add(this.A);
             }
          }
          this.X7(this.s.observeOn(d.a).subscribe(new l(this), Functions.e));
       }
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       ViewStub viewStub = this.getActivity().findViewById(R.id.xf_debug_info_stub);
       this.p = (viewStub != null)? viewStub.inflate(): this.getActivity().findViewById(0x7f0a45d7);
       return;
    }
    public void P8(){
       d uod1;
       b b;
       StringBuilder str2;
       KwaiPlayerDebugInfo obj1;
       a uoa1;
       b uob1;
       HashMap hashMap1;
       a d;
       Object obj = this;
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, uod, "8")) {
          return;
       }
       d p = obj.p;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ArrayList uArrayList = PatchProxy.apply(objArray, obj, uod, "13");
       if (uArrayList != patchProxyRe) {
       label_0082 :
          uod1 = p;
       }else {
          uArrayList = new ArrayList();
          String currentPage = obj.p.getCurrentPage();
          a uoa = obj.y.get(obj.x);
          if (uoa == null) {
             uoa = new a();
             obj.y.append(obj.x, uoa);
          }
          if (currentPage == null) {
             goto label_0082 ;
          }else {
             b uob = -1;
             int i = currentPage.hashCode();
             String str = "调";
             String str1 = 2;
             int i1 = 0;
             if (i != 0x57fa) {
                if (i != 0x7f51) {
                   if (i == 0x8c03 && currentPage.equals(str)) {
                      uob = 2;
                   }
                }else if(!currentPage.equals("网")){
                   uob = 1;
                }
             }else if(!currentPage.equals("基")){
                uob = null;
             }
             currentPage = "";
             if (uob) {
                if (uob != 1) {
                   if (uob != str1) {
                      goto label_0082 ;
                   }else {
                      uob = new b();
                      uob.a = str;
                      HashMap hashMap = new HashMap();
                      uob.b = hashMap;
                      str = PatchProxy.apply(objArray, obj, uod, "12");
                      if (str != patchProxyRe) {
                         uod1 = p;
                      }else {
                         uoa1 = obj.y.get(i1);
                         if (uoa1 != null) {
                            d uod2 = null;
                            if (uoa1.o - uod2) {
                               long enterTime = obj.t.getEnterTime();
                               if (enterTime - uod2) {
                                  uod1 = p;
                                  str = String.valueOf(Math.max((obj.w - enterTime), (uoa1.o - enterTime)));
                               }
                            }
                         }
                         uod1 = p;
                         str = currentPage;
                      }
                      hashMap.put("首屏耗时", str);
                      uob.b.put("DNS解析耗时", String.valueOf(uoa.g));
                      uob.b.put("HTTP建连耗时", String.valueOf(uoa.i));
                      uob.b.put("首个数据包耗时", String.valueOf(uoa.l));
                      uob.b.put("下载耗时", String.valueOf(uoa.h));
                      uob.b.put("DiskCache查询耗时", String.valueOf(uoa.j));
                      uob.b.put("图片解码耗时", String.valueOf(uoa.k));
                      b = uob.b;
                      str2 = PatchProxy.apply(null, obj, uod, "10");
                      if (str2 != patchProxyRe) {
                      }else if(this.getActivity() == null){
                         str2 = currentPage;
                      }else {
                         ActivityManager$MemoryInfo memoryInfo = new ActivityManager$MemoryInfo();
                         this.getActivity().getSystemService("activity").getMemoryInfo(memoryInfo);
                         str2 = "可用 "+Formatter.formatFileSize(this.getContext(), memoryInfo.availMem)+" / 总 "+Formatter.formatFileSize(this.getContext(), memoryInfo.totalMem);
                      }
                      b.put("内存", str2);
                      b = uob.b;
                      obj1 = PatchProxy.apply(null, obj, uod, "11");
                      if (obj1 != patchProxyRe) {
                         currentPage = obj1;
                      }else if(obj.q.getPlayer().getIKwaiMediaPlayer() != null){
                         obj1 = obj.q.getPlayer().getIKwaiMediaPlayer().getDebugInfo();
                         if (obj1 != null) {
                            KwaiPlayerDebugInfo mAppVodQosDe = obj1.mAppVodQosDebugInfo;
                            if (mAppVodQosDe != null && !TextUtils.x(mAppVodQosDe.cpuInfo)) {
                               AppVodQosDebugInfoNew cpuInfo = obj1.mAppVodQosDebugInfo.cpuInfo;
                            }
                         }
                      }
                      b.put("CPU", currentPage);
                      uArrayList.add(uob);
                   }
                }else {
                   uod1 = p;
                   uob1 = new b();
                   uob1.a = "网络";
                   hashMap1 = new HashMap();
                   uob1.b = hashMap1;
                   hashMap1.put("开始加载顺序", obj.z);
                   uob1.b.put("retryInfo", String.valueOf(uoa.m));
                   uob1.b.put("ResolveIp", TextUtils.I(uoa.n));
                   uArrayList.add(uob1);
                }
             }else {
                uod1 = p;
                b = new b();
                b.a = "基本信息";
                HashMap hashMap2 = new HashMap();
                b.b = hashMap2;
                hashMap2.put("图片格式", TextUtils.I(uoa.c));
                b b1 = b.b;
                obj1 = PatchProxy.apply(null, obj, uod, "9");
                if (obj1 != patchProxyRe) {
                }else if(obj.q.getPlayer().getIKwaiMediaPlayer() != null){
                   obj1 = obj.q.getPlayer().getIKwaiMediaPlayer().getDebugInfo();
                   if (obj1 != null && !TextUtils.x(obj1.mSdkVersion)) {
                      obj1 = obj1.mSdkVersion;
                   }
                }
                String str3 = currentPage;
                b1.put("SDK Ver", obj1);
                uArrayList.add(b);
                uob1 = new b();
                uob1.a = "MetaData";
                hashMap1 = new HashMap();
                uob1.b = hashMap1;
                hashMap1.put("分辨率", TextUtils.I(uoa.f));
                b = uob1.b;
                str2 = "";
                d = uoa.d;
                uoa1 = a.class;
                if (PatchProxy.isSupport(uoa1)) {
                   str = PatchProxy.applyOneRefs(Long.valueOf(d), null, uoa1, "1");
                   if (str != patchProxyRe) {
                   label_02a7 :
                      b.put("图片大小", str2+str+"kb");
                      uob1.b.put("ImageSource", TextUtils.I(uoa.p));
                      b = uob1.b;
                      a b2 = uoa.b;
                      if (b2 != null) {
                         currentPage = b2.toString();
                      }
                      b.put("地址信息", currentPage);
                      uArrayList.add(uob1);
                   }
                }
                Object[] objArray1 = new Object[]{Float.valueOf(((float)d / 1024.00f))};
                str = String.format("%.2f", objArray1);
                goto label_02a7 ;
             }
          }
       }
       uod1.setList(uArrayList);
       return;
    }
    public void R8(int p0){
       this.x = p0;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.q = this.q8(a.class);
       this.r = this.t8("DETAIL_ATTACH_LISTENERS");
       this.s = this.r8("DETAIL_IMAGE_LOAD_OBSERVABLE");
       this.t = this.r8("DETAIL_LOGGER");
       this.v = this.r8("DETAIL_FRAGMENT");
       return;
    }
}
