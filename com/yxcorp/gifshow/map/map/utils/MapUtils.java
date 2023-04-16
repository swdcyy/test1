package com.yxcorp.gifshow.map.map.utils.MapUtils;
import java.lang.Object;
import yz6.i;
import java.io.File;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import u5b.a;
import java.lang.StringBuilder;
import q87.c;
import zf6.k;
import crd.b;
import yz6.u;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import lrb.a;
import com.kwai.framework.location.k;
import yz6.f;
import f07.b;
import com.yxcorp.utility.SystemUtil;
import xf6.i;
import java.util.ArrayList;
import tkd.b;
import tkd.d;
import g07.a;
import yz6.o;
import java.util.List;
import yz6.m;
import yz6.l;
import java.lang.Float;
import java.lang.Number;
import java.lang.Math;
import com.yxcorp.gifshow.map.map.utils.MapUtils$showTestToast$1;
import msd.a;
import tb7.b;

public final class MapUtils	// class@001cc9
{
    public static final MapUtils a;

    static {
       MapUtils.a = new MapUtils();
    }
    public void MapUtils(){
       super();
    }
    public final void a(i p0,File p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MapUtils.class, "4")) {
          return;
       }
       a.p(p0, "mapView");
       if (p1 != null && p1.exists()) {
          Object[] objArray = new Object[0];
          a.c.w("MapUtils", "¡¾changeMapCustomStyle¡¿file path = "+p1.getAbsolutePath(), objArray);
          p0.setMapCustomStylePath(p1.getAbsolutePath());
          p0.setMapCustomStyleEnable(true);
          return;
       }else if(k.d()){
          u.a(p0);
       }
       return;
    }
    public final boolean b(){
       Object obj = PatchProxy.apply(null, this, MapUtils.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return k.d("default");
    }
    public final void c(f p0,b p1,b p2,b p3,b p4){
       MapUtils mapUtils = MapUtils.class;
       if (PatchProxy.isSupport(mapUtils)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, mapUtils, "6")) {
             return;
          }
       }
       a.p(p1, "leftTopLatLng");
       a.p(p2, "rightTopLatLng");
       a.p(p3, "rightBottomLatLng");
       a.p(p4, "leftBottomLatLng");
       if (SystemUtil.K() && i.c("KEY_NEARBY_MAP_DEBUG_MODEL")) {
          ArrayList uArrayList = new ArrayList();
          uArrayList.add(p1);
          uArrayList.add(p2);
          uArrayList.add(p3);
          uArrayList.add(p4);
          o oo = d.a(-115370941).LJ().c(uArrayList).a(-1426063616).b(5, -1442775296);
          a.o(oo, "PluginManager.get\(KMapPl¡­  .stroke\(5, -0x55ff0100\)");
          if (p0 != null) {
             p0.q(oo);
          }
       }
       return;
    }
    public final b d(b p0,float p1){
       MapUtils mapUtils = MapUtils.class;
       if (PatchProxy.isSupport(mapUtils)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Float.valueOf(p1), this, mapUtils, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "centerLatLng");
       double d = (double)2;
       double d1 = p0.a + ((this.e(13.00f, p1) * 0x3fcff874f143a49a) / d);
       double d2 = p0.b - ((this.e(13.00f, p1) * 0x3fc540789613d31c) / d);
       if (d1 - (double)-90 < 0) {
          d1 = -90.00f;
       }
       if (d1 - (double)90 > 0) {
          d1 = 90.00f;
       }
       if (d2 - (double)-180 < 0) {
          d2 = d2 + (double)360;
       }
       if (d2 - (double)180 > 0) {
          d2 = d2 - (double)360;
       }
       return new b(d1, d2);
    }
    public final double e(float p0,float p1){
       MapUtils mapUtils = MapUtils.class;
       if (PatchProxy.isSupport(mapUtils)) {
          Object obj = PatchProxy.applyTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, mapUtils, "10");
          if (obj != PatchProxyResult.class) {
             return obj.doubleValue();
          }
       }
       if (p1 - (float)17 > 0) {
          p1 = 17.00f;
       }
       return Math.pow(2.00f, (double)(p0 - p1));
    }
    public final b f(b p0,float p1){
       MapUtils mapUtils = MapUtils.class;
       if (PatchProxy.isSupport(mapUtils)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Float.valueOf(p1), this, mapUtils, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "centerLatLng");
       double d = (double)2;
       double d1 = p0.a - ((this.e(13.00f, p1) * 0x3fcff874f143a49a) / d);
       double d2 = p0.b + ((this.e(13.00f, p1) * 0x3fc540789613d31c) / d);
       if (d1 - (double)-90 < 0) {
          d1 = -90.00f;
       }
       if (d1 - (double)90 > 0) {
          d1 = 90.00f;
       }
       if (d2 - (double)-180 < 0) {
          d2 = d2 + (double)360;
       }
       if (d2 - (double)180 > 0) {
          d2 = d2 - (double)360;
       }
       return new b(d1, d2);
    }
    public final void g(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MapUtils.class, "11")) {
          return;
       }
       a.p(p0, "text");
       if (SystemUtil.K() && i.c("KEY_NEARBY_MAP_DEBUG_MODEL")) {
          b.j(new MapUtils$showTestToast$1(p0));
       }
       return;
    }
}
