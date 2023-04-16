package l90.g;
import rk7.b;
import java.lang.Object;
import com.kwai.video.clipkit.mv.EditorSdk2MvAsset;
import com.kuaishou.edit.draft.KuaishanAsset$b;
import com.kwai.video.minecraft.model.nano.Minecraft$CropOptions;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import t90.h;
import kotlin.jvm.internal.a;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.KuaishanAsset;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import com.yxcorp.gifshow.encode.RxExportApi;
import java.util.Objects;
import java.lang.Integer;
import java.lang.Double;
import java.lang.Float;
import u80.e;
import java.lang.StringBuilder;
import q87.c;
import com.kwai.video.clipkit.mv.ClipMvUtils;
import com.kwai.video.minecraft.model.nano.Minecraft$AssetTransform;
import com.kwai.video.editorsdk2.EditorSdk2Utils;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import java.util.List;
import com.kwai.video.clipkit.mv.EditorSdk2MvCreationResult;
import com.kwai.sdk.switchconfig.a;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import kotlin.collections.CollectionsKt__CollectionsKt;
import rk7.a;
import com.kwai.video.clipkit.mv.ClipMvUtils$ClipMvAlbumPhoto;
import com.kuaishou.gifshow.kuaishan.logic.h1;
import com.kuaishou.gifshow.kuaishan.utils.e;

public class g implements b	// class@002533
{

    public void g(){
       super();
    }
    public Minecraft$CropOptions TB(EditorSdk2MvAsset p0,KuaishanAsset$b p1,boolean p2){
       Minecraft$CropOptions obj1;
       int i5;
       String obj = p1;
       boolean b = p2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(g.class)) {
          obj1 = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, g.class, "1");
          if (obj1 != patchProxyRe) {
             return obj1;
          }
       }
       if (PatchProxy.isSupport(h.class)) {
          obj1 = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), null, h.class, "6");
          if (obj1 != patchProxyRe) {
          }else {
          label_0046 :
             a.p(p0, "mvAsset");
             a.p(obj, "ksAsset");
             int width = p0.getWidth();
             int height = p0.getHeight();
             Size size = RxExportApi.a((int)obj.instance.getOriginWidth(), (int)obj.instance.getOriginHeight());
             h int b1 = h.b;
             Size b2 = size.b;
             Size c = size.c;
             double centerX = obj.instance.getCenterX();
             double centerY = obj.instance.getCenterY();
             Objects.requireNonNull(b1);
             int i = 3;
             int i1 = 4;
             int i2 = 2;
             int i3 = 1;
             int i4 = 0;
             if (PatchProxy.isSupport(h.class)) {
                Object[] objArray = new Object[]{Integer.valueOf(b2),Integer.valueOf(c),Integer.valueOf(width),Integer.valueOf(height),Double.valueOf(centerX),Double.valueOf(centerY),Float.valueOf(0x3f800000),Boolean.valueOf(p2)};
                Object obj2 = PatchProxy.apply(objArray, b1, h.class, "7");
                if (obj2 != patchProxyRe) {
                   obj1 = obj2;
                }
             }
             float f = (float)b2;
             float f1 = (float)c;
             float f2 = f / f1;
             float f3 = (float)width;
             float f4 = (float)height;
             float f5 = f3 / f4;
             PatchProxyResult patchProxyRe1 = patchProxyRe;
             h oh = b1;
             double d = centerY;
             Object[] objArray1 = new Object[0];
             String str = "KSFlexibleTemplateHelper";
             e.D().w(str, "ÊÇ·ñ·ÖÆÁ = "+b, objArray1);
             if (b) {
                if (f2 - f5 < 0) {
                label_013f :
                   b1 = (int)((f * f4) / f3);
                   size = b2;
                label_0150 :
                   height = 0;
                   Object[] objArray2 = new Object[height];
                   e.D().w(str, "calculateCropOptions , cropWidth: "+size+", cropHeight: "+b1+", mediaWidth: "+b2+", mediaHeight: "+c+", mediaExportWidth: "+width+", mediaExportHeight: "+height, objArray2);
                   if (PatchProxy.isSupport(h.class)) {
                      Object[] objArray3 = new Object[]{Integer.valueOf(size),Integer.valueOf(b1),Double.valueOf(centerX),Double.valueOf(d),Float.valueOf(0x3f800000)};
                      obj1 = PatchProxy.apply(objArray3, oh, h.class, "8");
                      if (obj1 != patchProxyRe1) {
                      }
                   }
                   try{
                      obj1 = new Minecraft$CropOptions();
                      obj1.setTransform(EditorSdk2Utils.createIdentityTransform());
                   }catch(java.lang.Exception e0){
                      obj = "Went wrong when set identity transform to cropOptions";
                      PostUtils.D(str, obj, new IllegalArgumentException(obj));
                   }
                   e0.setWidth(size);
                   e0.setHeight(b1);
                   Minecraft$AssetTransform uAssetTransf = null;
                   double d1 = 0x3ff0000000000000;
                   if (centerX - uAssetTransf > 0 && centerX - d1 < 0) {
                      e0.transform().setPositionX(((d1 - centerX) * 100.00f));
                   }
                   if (d - uAssetTransf > 0 && d - d1 < 0) {
                      e0.transform().setPositionY(((d1 - d) * 100.00f));
                   }
                   double d2 = (double)0x3f800000 * 100.00f;
                   e0.transform().setScaleX(d2);
                   e0.transform().setScaleY(d2);
                }else {
                   f1 = (f1 * f3) / f4;
                }
             }else {
                Size Object[] b11 = 0x3fe38e39;
                if (f5 - b11 > 0) {
                   b11 = new Object[0];
                   e.D().A(str, "calculateCropOptions: exportRatio > 1.7777778", b11);
                   obj1 = ClipMvUtils.getCropOptionsByAssetRectangle(b2, c, 0, 0, width, height, width, height);
                   a.o(obj1, "ClipMvUtils.getCropOptio¡­xportWidth, exportHeight\)");
                }else if(f2 - f5 < 0){
                   goto label_013f ;
                }else if(f2 - b11 < 0){
                   i5 = b2;
                label_014f :
                   b1 = c;
                   goto label_0150 ;
                }else {
                   f1 = f1 * b11;
                }
             }
             i5 = (int)f1;
             goto label_014f ;
          }
       }else {
          goto label_0046 ;
       }
       return obj1;
    }
    public EditorSdk2MvCreationResult f40(String p0,String p1,boolean p2,List p3,List p4,List p5,boolean p6,String p7,int p8){
       Object[] objArray;
       EditorSdk2MvCreationResult obj;
       object oobject = p0;
       object oobject1 = p4;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g og = g.class;
       String str = "2";
       int i = 0;
       if (PatchProxy.isSupport(og)) {
          objArray = new Object[9];
          objArray[i] = oobject;
          objArray[1] = p1;
          objArray[2] = Boolean.valueOf(p2);
          objArray[3] = p3;
          objArray[4] = oobject1;
          objArray[5] = p5;
          objArray[6] = Boolean.valueOf(p6);
          objArray[7] = p7;
          objArray[8] = Integer.valueOf(p8);
          obj = PatchProxy.apply(objArray, this, og, str);
          if (obj != patchProxyRe) {
             return obj;
          }
       }else {
          int i3 = this;
       }
       if (oobject1 != null && !p4.isEmpty()) {
          obj = PatchProxy.applyTwoRefs(oobject1, p0, null, h.class, str);
          if (obj != patchProxyRe) {
          }else {
             a.p(oobject1, "clipAlbumPhotoList");
             a.p(p0, "templateFolderPath");
             objArray = new Object[i];
             e.D().w("KSFlexibleTemplateHelper", "loadFlexibleKuaiShanProject invoked with templateFolderPath = "+p0, objArray);
             Double value = a.t().getValue("minClipDurationForCustomText", Double.TYPE, Double.valueOf(0x3ffb333333333333));
             ArrayList uArrayList = new ArrayList(u.Y(oobject1, 10));
             Iterator iterator = p4.iterator();
             int i1 = 0;
             while (iterator.hasNext()) {
                Object obj1 = iterator.next();
                int i2 = i1 + 1;
                if (i1 < 0) {
                   CollectionsKt__CollectionsKt.W();
                }
                a.o(value, "minClipDurationForCustomText");
                uArrayList.add(obj1.a(value.doubleValue()));
                i1 = i2;
             }
             obj = ClipMvUtils.createProjectWithTemplate(p0, i, uArrayList);
             a.o(obj, "ClipMvUtils.createProjec¡­tionForCustomText\)\n    }\)");
          }
          return obj;
       }else {
          return h1.m(p0, p2, p3, false, p5, p6, p7, p8);
       }
    }
    public boolean isAvailable(){
       return true;
    }
    public String lz(){
       Object obj = PatchProxy.apply(null, this, g.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.m();
    }
}
