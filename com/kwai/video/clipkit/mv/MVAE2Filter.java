package com.kwai.video.clipkit.mv.MVAE2Filter;
import com.kwai.video.clipkit.ClipFilterBase;
import com.kwai.video.clipkit.mv.KwaiMvParam;
import com.kwai.video.clipkit.mv.AllMvReplaceableAreaDetail;
import java.lang.Object;
import com.kwai.video.editorsdk2.ExternalFilterRequest;
import com.kwai.video.clipkit.FboManager;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.FaceMagic.AE2.AE2Project;
import java.util.List;
import com.kwai.video.editorsdk2.ExternalFilterFrameData;
import java.lang.StringBuilder;
import com.kwai.video.editorsdk2.logger.EditorSdkLogger;
import com.kwai.video.clipkit.mv.ClipAssetManager;
import com.kwai.video.clipkit.mv.FaceSmoothV2;
import com.kwai.FaceMagic.AE2.AE2AssetRenderer;
import com.kwai.video.editorsdk2.ExternalAnimatedSubAssetData;
import java.lang.Integer;
import android.opengl.GLES20;
import sxd.a;
import java.lang.Math;
import android.util.Pair;
import com.kwai.video.clipkit.ClipKitUtils;
import com.kwai.FaceMagic.AE2.AE2TwoD;
import com.kwai.FaceMagic.AE2.AE2ResizeableFBO;
import com.kwai.FaceMagic.AE2.AE2RenderState;
import com.kwai.FaceMagic.AE2.AE2TextureInfo;
import com.kwai.FaceMagic.AE2.AE2KSEditorUtils;
import com.kwai.video.clipkit.model.nano.ClipkitSdk$ClipKitBackgroundVideo;
import sxd.g;
import com.kwai.video.clipkit.mv.EditorSdk2MvReplaceableDetail;
import com.kwai.video.clipkit.mv.ClipMvUtils;
import com.kwai.video.clipkit.mv.MvPhotoInfo;
import com.kwai.video.clipkit.mv.MvReplaceableAreaDetail;
import java.util.ArrayList;
import com.kwai.video.clipkit.mv.ReplaceableAreaInfo;
import com.kwai.video.editorsdk2.ExternalFilterInitParams;
import java.io.File;
import com.kwai.FaceMagic.AE2.AE2AssetPtrVec;
import com.kwai.FaceMagic.AE2.AE2Asset;
import com.kwai.video.clipkit.mv.NormalFaceSmoothV2;
import sxd.g$a;
import com.kwai.FaceMagic.nativePort.FMAEBlendMode;
import org.wysaid.nativePort.CGENativeLibrary$TextureBlendMode;
import com.kwai.video.editorsdk2.ExternalFilterReleaseParams;

public class MVAE2Filter extends ClipFilterBase	// class@001aca
{
    public AE2Project ae2Project;
    public boolean annualAlbum;
    public AE2AssetRenderer assetsRenderer;
    public AllMvReplaceableAreaDetail mAllDetail;
    public ClipAssetManager mAssetManager;
    public FaceSmoothV2 mFaceSmooth;
    public boolean mHasBg;
    public boolean mHasSubBg;
    public boolean mIsInited;
    public Object mLock;
    public KwaiMvParam mMVParam;
    public int mRenderOrder;
    public g mTextureDrawer;
    public AE2RenderState renderState;

    public void MVAE2Filter(KwaiMvParam p0){
       super();
       this.mAllDetail = new AllMvReplaceableAreaDetail();
       this.mHasBg = false;
       this.mHasSubBg = false;
       this.mLock = new Object();
       this.mIsInited = false;
       this.annualAlbum = false;
       this.mMVParam = p0;
    }
    public boolean filterOriginalFrame(ExternalFilterRequest p0,FboManager p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, MVAE2Filter.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 != null || (p1 == null && (this.mIsInited != null && this.assetsRenderer != null))) {
          MVAE2Filter tae2Project = this.ae2Project;
          if (tae2Project != null && tae2Project.isValid()) {
             ExternalFilterFrameData uExternalFil = p0.getFrameData().get(b);
             MVAE2Filter tae2Project1 = this.ae2Project;
             if (tae2Project1 == null) {
                EditorSdkLogger.e("MVAE2Filter", "ae2Project == null "+this);
             }else if(this.annualAlbum != null){
                tae2Project1.lock();
             }
             if (this.mFaceSmooth != null) {
                this.mFaceSmooth.process(this.mAssetManager, p0.getAnimatedSubAssetData());
             }
             double renderPos = p0.getRenderPos();
             tae2Project1 = this.mMVParam;
             List list = null;
             if (tae2Project1 != null && (tae2Project1.type == true && p0.getRenderPosBefReverse() - list >= 0)) {
                renderPos = p0.getRenderPosBefReverse();
             }
          label_0085 :
             if (renderPos - list >= 0 && this.renderState != null) {
                this.assetsRenderer.invalidateDisplayModeCache();
                this.assetsRenderer.invalidateFrameCache();
                Integer integer = null;
                list = p0.getAnimatedSubAssetData();
                int i = 0;
                while (i < list.size()) {
                   ExternalAnimatedSubAssetData uExternalAni = list.get(i);
                   if ((uExternalAni.getExternalAssetId()).equals("subBackgroundVideoV2")) {
                      integer = new Integer(uExternalAni.getTexture());
                   }else if(this.annualAlbum != null){
                      this.assetsRenderer.replaceTextureWithId(uExternalAni.getExternalAssetId(), uExternalAni.getTexture(), uExternalAni.getTextureWidth(), uExternalAni.getTextureHeight());
                   }else {
                      this.assetsRenderer.replaceTextureWithId(uExternalAni.getExternalAssetId(), uExternalAni.getTexture());
                   }
                   i = i + 1;
                }
                if (this.mHasSubBg != null && integer == null) {
                   if (this.annualAlbum != null) {
                      this.ae2Project.unlock();
                   }
                   return b;
                }else {
                   GLES20.glActiveTexture(0x84c0);
                   i = 3553;
                   GLES20.glBindTexture(i, uExternalFil.getTexture());
                   a.g(i, 9729, 0x812f);
                   renderPos = Math.min((renderPos * this.ae2Project.frameRate()), this.ae2Project.outFrame());
                   MVAE2Filter tmMVParam = this.mMVParam;
                   if (tmMVParam != null && (tmMVParam.type == true && (int)Math.round(renderPos) >= (int)this.ae2Project.outFrame())) {
                      renderPos = renderPos - 0x3ff0000000000000;
                   }
                label_013b :
                   this.ae2Project.setCurrentFrame((double)Math.round(renderPos));
                   Pair exportSize = ClipKitUtils.getExportSize(this.ae2Project.width(), this.ae2Project.height(), Math.min(uExternalFil.getTextureWidth(), uExternalFil.getTextureHeight()), Math.max(uExternalFil.getTextureWidth(), uExternalFil.getTextureHeight()));
                   AE2ResizeableFBO uAE2Resizeab = this.renderState.renderWithSize(this.ae2Project, new AE2TwoD((float)exportSize.first.intValue(), (float)exportSize.second.intValue()));
                   int i1 = uAE2Resizeab.texId();
                   GLES20.glBindFramebuffer(0x8d40, p0.getTargetFbo());
                   GLES20.glViewport(b, b, uExternalFil.getTextureWidth(), uExternalFil.getTextureHeight());
                   int texture = uExternalFil.getTexture();
                   float f = 0xbf800000;
                   AE2TextureInfo uAE2TextureI = new AE2TextureInfo();
                   uAE2TextureI.setFlipX(b);
                   uAE2TextureI.setFlipY(b);
                   if (this.ae2Project.isActive()) {
                      if (AE2KSEditorUtils.isDirectFaceMagic(this.ae2Project)) {
                         uAE2TextureI = AE2KSEditorUtils.directlyRenderFaceMagicIfNeed(this.ae2Project, this.renderState);
                         uAE2TextureI.setFlipX(b);
                         uAE2TextureI.setFlipY(true);
                      }
                      if (!uAE2TextureI.getTexId()) {
                         uAE2TextureI.setFlipX(b);
                         uAE2TextureI.setFlipY(b);
                      }
                   }
                   if (this.annualAlbum != null) {
                      this.ae2Project.unlock();
                   }
                   i = (uAE2TextureI.getFlipX())? -1: 1;
                   float f1 = (float)i * 0x3f800000;
                   int i2 = (uAE2TextureI.getFlipY())? -1: 1;
                   float f2 = (float)i2 * f;
                   if (this.mHasBg != null) {
                      if (this.mHasSubBg != null) {
                         this.mTextureDrawer.d((this.mMVParam.subBgVideo.renderOrder + true), integer.intValue(), 0x3f800000, 0x3f800000);
                         tae2Project = this.mMVParam;
                         int i3 = 2;
                         if (tae2Project.bgVideo.renderOrder >= null) {
                            tae2Project1 = this.mTextureDrawer;
                            if (tae2Project.subBgVideo.renderOrder == -1) {
                               b = 1;
                            }
                            tae2Project1.d(b, i1, f1, f2);
                            tae2Project = this.mTextureDrawer;
                            if (this.mMVParam.subBgVideo.renderOrder == true) {
                               i3 = 1;
                            }
                            tae2Project.d(i3, texture, 0x3f800000, 0x3f800000);
                         }else {
                            tae2Project1 = this.mTextureDrawer;
                            if (tae2Project.subBgVideo.renderOrder == -1) {
                               b = 1;
                            }
                            tae2Project1.d(b, texture, 0x3f800000, 0x3f800000);
                            MVAE2Filter tmTextureDra = this.mTextureDrawer;
                            if (this.mMVParam.subBgVideo.renderOrder == true) {
                               i3 = 1;
                            }
                            tmTextureDra.d(i3, i1, f1, f2);
                         }
                      }else if(this.mMVParam.bgVideo.renderOrder >= null){
                         this.mTextureDrawer.d(b, i1, f1, f2);
                         this.mTextureDrawer.d(true, texture, 0x3f800000, 0x3f800000);
                      }else {
                         this.mTextureDrawer.d(b, texture, 0x3f800000, 0x3f800000);
                         this.mTextureDrawer.d(true, i1, f1, f2);
                      }
                   }else {
                      this.mTextureDrawer.d(b, i1, f1, f2);
                   }
                   this.mTextureDrawer.a();
                   uAE2Resizeab.delete();
                }
             }
             return true;
          }
       }
    label_0287 :
       return b;
    }
    public EditorSdk2MvReplaceableDetail getMvReplaceableAreaDetail(int p0){
       MVAE2Filter mVAE2Filter = MVAE2Filter.class;
       if (PatchProxy.isSupport(mVAE2Filter)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, mVAE2Filter, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       mVAE2Filter = this.mLock;
       _monitor_enter(mVAE2Filter);
       _monitor_exit(mVAE2Filter);
       return ClipMvUtils.getReplaceableAreaDetail(this.mAllDetail, p0);
    }
    public final MvReplaceableAreaDetail getReplaceableAreaAtInit(MvPhotoInfo p0){
       MVAE2Filter obj = PatchProxy.applyOneRefs(p0, this, MVAE2Filter.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mLock;
       _monitor_enter(obj);
       MvReplaceableAreaDetail mvReplaceabl = new MvReplaceableAreaDetail();
       mvReplaceabl.info = p0;
       mvReplaceabl.replaceableAreaDetail = new ArrayList();
       for (int i = 0; i < p0.areas.size(); i = i + 1) {
          ReplaceableAreaInfo replaceableA = p0.areas.get(i);
          ReplaceableAreaInfo replaceableA1 = new ReplaceableAreaInfo();
          mvReplaceabl.replaceableAreaDetail.add(replaceableA1);
          replaceableA1.refId = replaceableA.refId;
          replaceableA1.layerId = replaceableA.layerId;
          replaceableA1.rect = replaceableA.rect;
       }
       _monitor_exit(obj);
       return mvReplaceabl;
    }
    public void init(ExternalFilterInitParams p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MVAE2Filter.class, "1")) {
          return;
       }
       super.init(p0);
       MVAE2Filter tmLock = this.mLock;
       _monitor_enter(tmLock);
       this.initRender();
       this.initTextureDrawer();
       this.mIsInited = true;
       _monitor_exit(tmLock);
       return;
    }
    public final void initRender(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MVAE2Filter.class, "2")) {
          return;
       }
       AE2RenderState uAE2RenderSt = AE2RenderState.create();
       this.renderState = uAE2RenderSt;
       if (uAE2RenderSt == null) {
          EditorSdkLogger.e("MVAE2Filter", "Fail to create renderState.");
          return;
       }else {
          AE2AssetRenderer uAE2AssetRen = uAE2RenderSt.assetRenderer();
          this.assetsRenderer = uAE2AssetRen;
          if (uAE2AssetRen == null) {
             EditorSdkLogger.e("MVAE2Filter", "Fail to create assetsRenderer. Check your config file");
             return;
          }else {
             boolean b = true;
             if (this.ae2Project == null) {
                File uFile = new File(this.mMVParam.templateDirectory);
                File uFile1 = new File(this.mMVParam.configJsonPath);
                if (uFile.exists()) {
                   AE2Project uAE2Project = ClipMvUtils.parseToAE2Project(uFile, uFile1, this.mMVParam.encyptedMethod, objArray);
                   if (uAE2Project == null) {
                      EditorSdkLogger.e("MVAE2Filter", "Fail to create AE2Project is invalid. Check your config file");
                      return;
                   }else {
                      this.ae2Project = uAE2Project;
                   }
                }
             }else {
                this.annualAlbum = b;
             }
             MVAE2Filter tmMVParam = this.mMVParam;
             int i = 0;
             boolean b1 = (tmMVParam.bgVideo != null)? true: false;
             this.mHasBg = b1;
             if (b1) {
                KwaiMvParam subBgVideo = tmMVParam.subBgVideo;
                if (subBgVideo != null) {
                   ClipkitSdk$ClipKitBackgroundVideo fullPath = subBgVideo.fullPath;
                   if (fullPath != null && fullPath.length() > 0) {
                   label_007a :
                      this.mHasSubBg = b;
                      this.assetsRenderer.setShouldLoadReplaceableAssets(this.annualAlbum);
                      if (this.ae2Project == null) {
                         EditorSdkLogger.e("MVAE2Filter", "initRender\(\) ae2Project is null");
                         return;
                      }else {
                         ArrayList uArrayList = new ArrayList(this.ae2Project.assets().size());
                         for (; i < this.ae2Project.assets().size(); i = i + 1) {
                            uArrayList.add(this.ae2Project.assets().get(i));
                         }
                         this.mAssetManager = new ClipAssetManager(this.ae2Project, this.assetsRenderer, uArrayList);
                         NormalFaceSmoothV2 normalFaceSm = new NormalFaceSmoothV2();
                         this.mFaceSmooth = normalFaceSm;
                         if (!normalFaceSm.init(this.mAssetManager)) {
                            EditorSdkLogger.w("MVAE2Filter", "FaceSmooth init AeAssetManager Failed");
                         }
                         return;
                      }
                   }
                }
             }
             b = false;
             goto label_007a ;
          }
       }
    }
    public final void initTextureDrawer(){
       if (PatchProxy.applyVoid(null, this, MVAE2Filter.class, "3")) {
          return;
       }
       g$a uoa = new g$a();
       if (this.mMVParam.bgVideo != null) {
          CGENativeLibrary$TextureBlendMode textureBlend = FMAEBlendMode.values()[this.mMVParam.bgVideo.blendMode].toCGEBlendMode();
          if (this.mMVParam.subBgVideo != null) {
             CGENativeLibrary$TextureBlendMode textureBlend1 = FMAEBlendMode.values()[this.mMVParam.subBgVideo.blendMode].toCGEBlendMode();
             MVAE2Filter tmMVParam = this.mMVParam;
             ClipkitSdk$ClipKitBackgroundVideo renderOrder = tmMVParam.subBgVideo.renderOrder;
             if (renderOrder == 1) {
                uoa.a(textureBlend);
                uoa.a(textureBlend1);
             }else if(renderOrder == -1){
                uoa.a(textureBlend1);
                uoa.a(textureBlend);
             }else if(renderOrder == null){
                if (tmMVParam.bgVideo.renderOrder >= null) {
                   uoa.a(textureBlend1);
                   uoa.a(textureBlend);
                }else {
                   uoa.a(textureBlend);
                   uoa.a(textureBlend1);
                }
             }
          }else {
             uoa.a(textureBlend);
          }
       }
       this.mTextureDrawer = uoa.b();
       this.mRenderOrder = this.mMVParam.renderOrder;
       this.mAllDetail.details = new ArrayList();
       for (int i = 0; i < this.mMVParam.mvPhotoInfos.size(); i = i + 1) {
          this.mAllDetail.details.add(this.getReplaceableAreaAtInit(this.mMVParam.mvPhotoInfos.get(i)));
       }
       return;
    }
    public boolean isAvailable(){
       return true;
    }
    public void releaseFilter(ExternalFilterReleaseParams p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MVAE2Filter.class, "5")) {
          return;
       }
       MVAE2Filter tmLock = this.mLock;
       _monitor_enter(tmLock);
       MVAE2Filter tmTextureDra = this.mTextureDrawer;
       if (tmTextureDra != null) {
          tmTextureDra.b();
          this.mTextureDrawer = null;
       }
       tmTextureDra = this.mFaceSmooth;
       if (tmTextureDra != null) {
          tmTextureDra.release();
          this.mFaceSmooth = null;
       }
       tmTextureDra = this.assetsRenderer;
       if (tmTextureDra != null) {
          tmTextureDra.delete();
          this.assetsRenderer = null;
       }
       tmTextureDra = this.renderState;
       if (tmTextureDra != null) {
          tmTextureDra.delete();
          this.renderState = null;
       }
       if (this.ae2Project != null) {
          this.ae2Project = null;
       }
       this.mIsInited = false;
       _monitor_exit(tmLock);
       return;
    }
    public void setAe2Project(AE2Project p0){
       MVAE2Filter tmLock = this.mLock;
       _monitor_enter(tmLock);
       this.ae2Project = p0;
       _monitor_exit(tmLock);
    }
}
