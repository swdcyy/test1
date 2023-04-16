package com.kuaishou.live.core.voiceparty.video.helper.VoicePartySurfaceUtil;
import java.lang.Object;
import android.view.ViewGroup$MarginLayoutParams;
import android.graphics.Point;
import com.kuaishou.live.core.voiceparty.video.helper.VoicePartySurfaceUtil$ScaleType;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import pp.a;
import java.lang.StringBuilder;
import q87.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import va1.n0;
import com.kuaishou.live.core.voiceparty.d0;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kwai.feature.api.live.service.voiceparty.LiveVoicePartyPlayViewService$ScaleType;

public final class VoicePartySurfaceUtil	// class@001ae1
{

    public void VoicePartySurfaceUtil(){
       super();
    }
    public static void a(ViewGroup$MarginLayoutParams p0,Point p1,Point p2,VoicePartySurfaceUtil$ScaleType p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, VoicePartySurfaceUtil.class, "2")) {
          return;
       }
       VoicePartySurfaceUtil.c(p0, p2, p1, p3);
       return;
    }
    public static void b(Context p0,ViewGroup$MarginLayoutParams p1,Point p2,VoicePartySurfaceUtil$ScaleType p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, VoicePartySurfaceUtil.class, "1")) {
          return;
       }
       VoicePartySurfaceUtil.c(p1, VoicePartySurfaceUtil.f(p0), p2, p3);
       return;
    }
    public static void c(ViewGroup$MarginLayoutParams p0,Point p1,Point p2,VoicePartySurfaceUtil$ScaleType p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, VoicePartySurfaceUtil.class, "4")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().s("VoicePartySurfaceUtil", "adjustMvSurface\(\) called with: surfaceSize = ["+p1+"], videoSize = ["+p2+"], scaleType = ["+p3+"]", objArray);
       p3.adjust(p0, p1, p2);
       a uoa = a.C();
       StringBuilder str = "adjustMvSurface: result: ";
       String str1 = PatchProxy.applyOneRefs(p0, null, VoicePartySurfaceUtil.class, "9");
       if (str1 != PatchProxyResult.class) {
       }else {
          str1 = "Params {width: "+p0.width+", height: "+p0.height+", left margin: "+p0.leftMargin+", topMargin: "+p0.topMargin+"}";
       }
       Object[] objArray1 = new Object[0];
       uoa.s("VoicePartySurfaceUtil", str+str1, objArray1);
       return;
    }
    public static void d(ViewGroup$MarginLayoutParams p0,Point p1,Point p2,VoicePartySurfaceUtil$ScaleType p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, VoicePartySurfaceUtil.class, "3")) {
          return;
       }
       VoicePartySurfaceUtil.c(p0, p1, p2, p3);
       return;
    }
    public static int e(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, VoicePartySurfaceUtil.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (p0 == null) {
          return (int)((float)n0.e() * 0x3f100000);
       }
       return (int)((float)n0.j(p0) * 0x3f100000);
    }
    public static Point f(Context p0){
       int i;
       Object obj = PatchProxy.applyOneRefs(p0, null, VoicePartySurfaceUtil.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (d0.n(p0)) {
          b.Z(LiveVoicePartyLogTag.KTV, "getMvSurfaceSize wide");
          i = VoicePartySurfaceUtil.e(p0);
       }else {
          i = n0.k(p0);
       }
       return new Point(i, (int)(((float)i * 9.00f) / 16.00f));
    }
    public static Point g(Context p0){
       int i;
       Object obj = PatchProxy.applyOneRefs(p0, null, VoicePartySurfaceUtil.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          i = n0.f();
       }else if(d0.n(p0)){
          b.Z(LiveVoicePartyLogTag.THEATER, "getTheaterSurfaceSize wide");
          i = VoicePartySurfaceUtil.e(p0);
       }else {
          i = n0.k(p0);
       }
       return new Point(i, (int)(((float)i * 9.00f) / 16.00f));
    }
    public static boolean h(Point p0){
       boolean b = (p0.x > null && p0.y > null)? true: false;
       return b;
    }
    public static VoicePartySurfaceUtil$ScaleType i(LiveVoicePartyPlayViewService$ScaleType p0){
       if (p0 == LiveVoicePartyPlayViewService$ScaleType.CenterCrop) {
          return VoicePartySurfaceUtil$ScaleType.CenterCrop;
       }
       return VoicePartySurfaceUtil$ScaleType.FitCenter;
    }
}
