package h90.e;
import com.kwai.video.clipkit.mv.EditorSdk2MvCreationResult;
import java.lang.String;
import com.kwai.video.clipkit.mv.EditorSdk2MvAsset;
import com.kwai.video.minecraft.model.nano.Minecraft$WesterosFaceMagicParam;
import java.lang.Object;
import android.graphics.RectF;
import java.util.LinkedList;
import java.util.List;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$TimeRange;
import com.kuaishou.gifshow.kuaishan.utils.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Boolean;
import android.text.TextUtils;
import com.kwai.kscnnrenderlib.YCNNModelInfo$KSFaceDetectOut;
import android.util.Pair;
import h90.d;
import java.lang.Math;
import java.util.Collections;
import java.lang.Float;
import com.kwai.video.minecraft.model.nano.Minecraft$CropOptions;
import com.kwai.video.minecraft.model.nano.Minecraft$AssetTransform;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kwai.video.clipkit.mv.ClipMvUtils;
import java.util.Iterator;
import com.yxcorp.gifshow.models.QMedia;
import java.lang.Double;
import u80.e;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Integer;
import com.kwai.video.clipkit.mv.EditorSdk2MvCreationResult$TemplateType;
import com.kwai.video.minecraft.model.MutableTimeline;
import java.util.ArrayList;
import w46.b;
import com.kwai.video.minecraft.model.nano.Minecraft$KSAVClip;
import com.kwai.video.minecraft.model.nano.Minecraft$Color;
import wba.d;
import java.util.regex.Pattern;
import lnc.v5;
import java.util.regex.Matcher;
import com.kwai.video.minecraft.model.RationalTime;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import com.kwai.video.minecraft.model.TimeRange;
import com.kwai.video.minecraft.model.MutableItem;
import h90.b;

public class e	// class@002112
{
    public List A;
    public final Minecraft$WesterosFaceMagicParam B;
    public final EditorSdk2MvCreationResult C;
    public YCNNModelInfo$KSFaceDetectOut D;
    public String E;
    public long F;
    public boolean G;
    public List H;
    public boolean I;
    public YCNNModelInfo$KSFaceDetectOut J;
    public final RectF a;
    public final String b;
    public final String c;
    public final String d;
    public Minecraft$CropOptions e;
    public final boolean f;
    public String g;
    public String h;
    public String i;
    public String j;
    public int k;
    public final List l;
    public double m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final String q;
    public final String r;
    public final String s;
    public final EditorSdk2MvAsset t;
    public final int u;
    public final int v;
    public double w;
    public double x;
    public final List y;
    public EditorSdk2$TimeRange z;

    public void e(EditorSdk2MvCreationResult p0,String p1,EditorSdk2MvAsset p2,String p3,Minecraft$WesterosFaceMagicParam p4){
       super();
       this.a = new RectF();
       int i = 0;
       this.k = i;
       this.l = new LinkedList();
       this.w = 0x3fe0000000000000;
       this.x = 0x3fe0000000000000;
       this.F = -1;
       this.t = p2;
       this.C = p0;
       this.d = p1;
       this.q = p3;
       this.B = p4;
       this.b = p2.getRefId();
       this.c = p2.getAssetPath();
       this.i = p2.getAssetTag();
       this.j = p2.getTextStyleId();
       this.f = p2.requireClipBody();
       this.n = p2.requireFacialReco();
       this.o = p2.requireFaceBlend();
       this.p = p2.requireOriginAudio();
       this.r = p2.getServiceType();
       this.s = p2.getReturnMediaType();
       this.u = p2.getWidth();
       this.v = p2.getHeight();
       this.y = p2.getVisibleTimeRanges();
       this.z = p2.getVisibleTimeRange();
       p0 = PatchProxy.applyOneRefs(p2, null, e.class, "3");
       if (p0 != PatchProxyResult.class) {
          i = p0.intValue();
       }else if(TextUtils.n(p2.getAssetType(), "text")){
          i = 1;
       }
       this.k = i;
       this.H = p2.getSourceList();
       this.I = p2.disableReplace();
       return;
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, e.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (TextUtils.isEmpty(this.g) ^ 0x01);
    }
    public String b(){
       return this.i;
    }
    public String c(){
       return this.E;
    }
    public YCNNModelInfo$KSFaceDetectOut d(){
       return this.D;
    }
    public Pair e(){
       Object obj = PatchProxy.apply(null, this, e.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       boolean b = true;
       e tg = this.g;
       if (TextUtils.isEmpty(tg)) {
          tg = this.h;
          if (TextUtils.isEmpty(tg)) {
             tg = this.c;
             b = false;
          }
       }
       return new Pair(tg, Boolean.valueOf(b));
    }
    public double f(){
       EditorSdk2$TimeRange obj = PatchProxy.apply(null, this, e.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       obj = d.b(this.y);
       if (obj == null) {
          return 0;
       }
       return obj.duration();
    }
    public String g(){
       return this.h;
    }
    public long h(){
       Object obj = PatchProxy.apply(null, this, e.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return Math.round((this.t.getMinClipDuration() * 0x408f400000000000));
    }
    public String i(){
       return this.g;
    }
    public double j(){
       return ((double)this.F / 0x408f400000000000);
    }
    public List k(){
       e obj = PatchProxy.apply(null, this, e.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.A;
       if (obj == null) {
          List list = Collections.emptyList();
       }
       return obj;
    }
    public String l(){
       return this.j;
    }
    public boolean m(){
       return this.G;
    }
    public void n(float p0,float p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, uoe, "15")) {
          return;
       }
       double d = (double)(p0 * 100.00f);
       double d1 = (double)(100.00f * p1);
       if (e.a(this.e)) {
          return;
       }
       this.e.transform().setPositionX((this.e.transform().positionX() + d));
       this.e.transform().setPositionY((this.e.transform().positionY() + d1));
       ClipMvUtils.setCropOptionsForAllMatchedAVClipsInEditorSdk2V2(this.C.getProject(), this.b, this.e);
       if (!this.k().isEmpty()) {
          Iterator iterator = this.k().iterator();
          while (iterator.hasNext()) {
             iterator.next().n(p0, p1);
          }
       }
       return;
    }
    public boolean o(){
       boolean b = (this.o != null || this.n != null)? true: false;
       return b;
    }
    public boolean p(String p0,QMedia p1,double p2,boolean p3){
       Object[] obj;
       int this;
       e uoe3;
       e b;
       double d;
       Object[] obj1;
       int b1;
       String str5;
       Object[] objArray2;
       Minecraft$CropOptions uCropOptions;
       int i;
       Object[] objArray5;
       e uoe = this;
       String str = p0;
       QMedia qMedia = p1;
       e uoe1 = e.class;
       e uoe2 = e.class;
       if (PatchProxy.isSupport(uoe2)) {
          obj = PatchProxy.applyFourRefs(p0, p1, Double.valueOf(p2), Boolean.valueOf(p3), this, e.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = null;
       String str1 = (!qMedia)? obj: qMedia.path;
       uoe.h = str1;
       String str2 = "]";
       this = 0;
       Object[] objArray = new Object[this];
       String str3 = "ReplaceableArea";
       e.D().s(str3, "setAsset\(\) called with: assetPath = ["+str+"], mediaPath = ["+uoe.h+str2, objArray);
       String str4 = "KSUtil";
       if (!PatchProxy.applyVoidOneRefs(str, uoe, uoe2, "5")) {
          objArray = "setReplaceAssetPath: assetPath="+str;
          obj1 = new Object[this];
          e.D().s(str3, objArray, obj1);
          uoe.g = str;
          if (!TextUtils.equals(uoe.c, str) && uoe.g == null) {
             uoe3 = uoe.C;
             b = uoe.b;
             b1 = 0x9a000000;
             if (!PatchProxy.isSupport(uoe1) || !PatchProxy.applyVoidThreeRefs(uoe3, b, Integer.valueOf(b1), null, e.class, "6")) {
                Object[] objArray6 = new Object[this];
                e.D().s(str4, "setAssetOverlayColor\(\) called with: refId = ["+b+"], color = ["+b1+str2, objArray6);
                EditorSdk2V2$VideoEditorProject project2 = uoe3.getProject();
                if (uoe3.getTemplateType() == EditorSdk2MvCreationResult$TemplateType.TEMPLATE_TYPE_NEW_SPARK || uoe3.getTemplateType() == EditorSdk2MvCreationResult$TemplateType.TEMPLATE_TYPE_MV) {
                   ArrayList arrayForAllM1 = ClipMvUtils.getArrayForAllMatchedAVClips(project2.getTemplateTimeline(), b);
                   if (arrayForAllM1.isEmpty()) {
                      objArray = new Object[this];
                      e.D().t(str4, "setAssetAlpha: cannot find assets ", objArray);
                   }else {
                      Iterator iterator1 = arrayForAllM1.iterator();
                      while (iterator1.hasNext()) {
                         Minecraft$KSAVClip kSAVClip = iterator1.next();
                         if (e.a(kSAVClip.cropOptions())) {
                            objArray6 = new Object[this];
                            e.D().t(str4, "setAssetAlpha: asset cropOptions cant transform", objArray6);
                         }else {
                            kSAVClip.cropOptions().setOverlayColor(d.h(b1));
                            ClipMvUtils.setCropOptionsForAllMatchedAVClipsInEditorSdk2V2(project2, b, kSAVClip.cropOptions());
                         }
                         this = 0;
                      }
                   }
                }
             }
          }
       }
       this = 1;
       uoe3 = (!TextUtils.isEmpty(uoe.g) && objArray.c().matcher(uoe.g).matches())? 1: null;
       if (uoe.g != null && uoe3) {
          EditorSdk2V2$VideoEditorProject project = uoe.C.getProject();
          b = uoe.b;
          e g = uoe.g;
          d = p2 / 0x408f400000000000;
          double d1 = this.f();
          obj1 = PatchProxy.apply(obj, uoe, uoe2, "3");
          if (obj1 != PatchProxyResult.class) {
             b1 = obj1.booleanValue();
          }else if(uoe.C.getTemplateType() == EditorSdk2MvCreationResult$TemplateType.TEMPLATE_TYPE_MV || uoe.C.getTemplateType() == EditorSdk2MvCreationResult$TemplateType.TEMPLATE_TYPE_NEW_SPARK){
             b1 = true;
          }else {
             b1 = false;
          }
          if (PatchProxy.isSupport(uoe1)) {
             Object[] objArray1 = new Object[]{project,b,g,Double.valueOf(d),Double.valueOf(d1),Boolean.valueOf(b1)};
             if (PatchProxy.applyVoid(objArray1, obj, uoe1, "9")) {
             label_0279 :
                str5 = str3;
             }
          }
          str5 = str3;
          objArray2 = new Object[0];
          e.D().s(str4, "setVideoClipRange\(\) called with: refId = ["+b+"], videoPath = ["+g+"], timeRange = ["+d1+"], isUsingAnimatedSubAsset = ["+b1+str2, objArray2);
          if (TextUtils.isEmpty(g) || !b.c().matcher(g).matches()) {
             objArray5 = new Object[0];
             e.D().s(str4, "setVideoClipRange not video, skip", objArray5);
          }else if(b1){
             ArrayList arrayForAllM = ClipMvUtils.getArrayForAllMatchedAVClips(project.getTemplateTimeline(), b);
             if (arrayForAllM.isEmpty()) {
                objArray5 = new Object[0];
                e.D().t(str4, "setVideoClipRange: cannot find assets ", objArray5);
             }else {
                Iterator iterator = arrayForAllM.iterator();
                while (iterator.hasNext()) {
                   iterator.next().setSourceRange(EditorSdk2UtilsV2.createMCTimeRange(EditorSdk2UtilsV2.createRationalTime(0), EditorSdk2UtilsV2.createRationalTime(d1)));
                }
             }
          }
       }else {
          goto label_0279 ;
       }
       EditorSdk2V2$VideoEditorProject project1 = uoe.C.getProject();
       uoe3 = uoe.C;
       e b2 = uoe.b;
       b = uoe.f;
       if (PatchProxy.isSupport(uoe1)) {
          objArray2 = new Object[]{project1,uoe3,b2,str,Boolean.valueOf(b)};
          uCropOptions = PatchProxy.apply(objArray2, null, uoe1, "8");
          if (uCropOptions != PatchProxyResult.class) {
             i = 0;
          label_02e4 :
             uoe.e = uCropOptions;
             if (uCropOptions == null) {
                Object[] objArray3 = new Object[i];
                e.D().t(str5, "setAsset: updateAnimateSubAssetPath failed", objArray3);
                return (p3 ^ 0x01);
             }else {
                uoe.m = uCropOptions.transform().scaleX();
                Object[] objArray4 = new Object[0];
                e.D().s(str5, "setAsset: set area mOriginalScale "+uoe.m, objArray4);
                return true;
             }
          }
       }
       i = 0;
       obj1 = new Object[i];
       e.D().s(str4, "replaceFileForAsset\(\) called with: refId = ["+b2+"], assetPath = ["+str+"], needClipBody = ["+b+str2, obj1);
       uCropOptions = ClipMvUtils.replaceFileForAllMatchedAssets(project1, uoe3, b2, str);
       goto label_02e4 ;
    }
    public void q(YCNNModelInfo$KSFaceDetectOut p0){
       this.D = p0;
    }
    public void r(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "13")) {
          return;
       }
       this.l.add(p0);
       e tA = this.A;
       if (tA == null) {
          return;
       }
       Iterator iterator = tA.iterator();
       while (iterator.hasNext()) {
          iterator.next().r(p0);
       }
       return;
    }
    public String toString(){
       StringBuilder obj = PatchProxy.apply(null, this, e.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "ReplaceableArea mRefID="+this.b+" mGroupId="+this.d+" mServiceType="+this.r+" mRequireFacialReco="+this.n+" mRequireFaceBlend="+this.o+" mRequireClipBody="+this.f+" mRequireOriginAudio="+this.p+" mMagic=";
       boolean b = (this.B != null)? true: false;
       return obj+b+" mAssetType="+this.k+" mAssetTag="+this.i+" mRect="+this.a+"\n";
    }
}
