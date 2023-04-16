package com.kwai.feature.post.api.core.model.GSConfig;
import com.yxcorp.gifshow.media.model.EncodeConfig$ImportEncodeConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.media.model.ImageConfig;
import com.yxcorp.gifshow.media.model.EncodeConfig;
import tkd.b;
import tkd.d;
import exc.a;
import exc.b;
import q46.l;
import java.lang.Boolean;
import com.kwai.feature.post.api.core.model.GSConfig$SizeType;
import com.kwai.feature.post.api.core.model.GSConfig$a;
import java.lang.Enum;
import java.lang.Math;
import com.yxcorp.gifshow.media.model.PhotoMovieEncodeConfig;

public class GSConfig	// class@001307
{
    public static final EncodeConfig$ImportEncodeConfig a;

    static {
       GSConfig.a = new EncodeConfig$ImportEncodeConfig();
    }
    public void GSConfig(){
       super();
    }
    public static int a(){
       Object obj = PatchProxy.apply(null, null, GSConfig.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return GSConfig.d().getAtlasLongSide();
    }
    public static int b(){
       Object obj = PatchProxy.apply(null, null, GSConfig.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return GSConfig.d().getAtlasQuality();
    }
    public static EncodeConfig c(){
       EncodeConfig obj = PatchProxy.apply(null, null, GSConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = d.a(0x432ab9d0).c5();
       if (obj == null) {
          obj = new EncodeConfig();
       }
       return obj;
    }
    public static ImageConfig d(){
       Object obj = PatchProxy.apply(null, null, GSConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return l.a();
    }
    public static String e(boolean p0){
       GSConfig gSConfig = GSConfig.class;
       if (PatchProxy.isSupport(gSConfig)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), null, gSConfig, "14");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (GSConfig.c().getImportEncodeConfig() != null) {
          return GSConfig.c().getImportEncodeConfig().getX264Params(p0);
       }else {
          return GSConfig.a.getX264Params(p0);
       }
    }
    public static int f(GSConfig$SizeType p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, GSConfig.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = GSConfig$a.a[p0.ordinal()];
       int i1 = 1;
       if (i == i1) {
          return Math.max(GSConfig.h(), GSConfig.g());
       }
       if (i == 2) {
          return GSConfig.i();
       }
       if (i == 3) {
          return GSConfig.a();
       }
       if (i != 4) {
          return Math.max(GSConfig.l(false), GSConfig.k(false));
       }
       return Math.max(GSConfig.l(i1), GSConfig.k(i1));
    }
    public static int g(){
       Object obj = PatchProxy.apply(null, null, GSConfig.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return l.e().getHeight();
    }
    public static int h(){
       Object obj = PatchProxy.apply(null, null, GSConfig.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return l.e().getWidth();
    }
    public static int i(){
       Object obj = PatchProxy.apply(null, null, GSConfig.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return GSConfig.d().getSingleImageLongSide();
    }
    public static int j(){
       Object obj = PatchProxy.apply(null, null, GSConfig.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return GSConfig.d().getSingleImageQuality();
    }
    public static int k(boolean p0){
       GSConfig gSConfig = GSConfig.class;
       if (PatchProxy.isSupport(gSConfig)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), null, gSConfig, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (p0 && GSConfig.c().getImportEncodeConfig() != null) {
          return GSConfig.c().getImportEncodeConfig().getImportEncodeHeight();
       }else {
          return GSConfig.c().getHeight();
       }
    }
    public static int l(boolean p0){
       GSConfig gSConfig = GSConfig.class;
       if (PatchProxy.isSupport(gSConfig)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), null, gSConfig, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (p0 && GSConfig.c().getImportEncodeConfig() != null) {
          return GSConfig.c().getImportEncodeConfig().getImportEncodeWidth();
       }else {
          return GSConfig.c().getWidth();
       }
    }
}
