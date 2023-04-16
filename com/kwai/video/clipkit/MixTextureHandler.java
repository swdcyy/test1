package com.kwai.video.clipkit.MixTextureHandler;
import com.kwai.video.editorsdk2.ExternalFilterRequestListenerV2;
import java.lang.Object;
import java.util.LinkedHashMap;
import java.util.HashMap;
import com.kwai.video.clipkit.ClipFilterBase;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import com.kwai.video.editorsdk2.ExternalFilterRequest;
import com.kwai.video.editorsdk2.ExternalFilterResult;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.editorsdk2.logger.EditorSdkLogger;
import com.kwai.video.editorsdk2.ExternalFilterFrameData;
import java.util.Set;
import java.util.Map$Entry;
import java.lang.Long;
import org.wysaid.nativePort.CGENativeLibrary$TextureBlendMode;
import com.kwai.video.editorsdk2.ExternalAnimatedSubAssetData;
import com.kwai.video.clipkit.FboManager;
import sxd.f;
import sxd.g;
import sxd.g$a;
import android.opengl.GLES20;
import com.kwai.video.editorsdk2.ExternalFilterInitParams;
import java.lang.Boolean;
import com.kwai.video.editorsdk2.ExternalFilterReleaseParams;
import com.kwai.video.editorsdk2.ExportTask;
import com.kwai.video.editorsdk2.PreviewPlayer;
import com.kwai.video.editorsdk2.ThumbnailGenerator;

public class MixTextureHandler extends ExternalFilterRequestListenerV2	// class@001a46
{
    public LinkedHashMap mBlendModes;
    public List mClipFilters;
    public f mDrawer;
    public FboManager mFboManger;
    public List mLastBlendModes;
    public int mMainTrackIndex;
    public Object mMixTextureLock;
    public List mNeedRemoveFilters;
    public boolean mReleased;
    public g mTextureDrawer;
    public static int MAIN_TRACK_BLEND_INDEX = 0;
    public static int MAX_ANIMATED_COUNT = 7;
    public static String TAG = "MixTextureHandler";

    public void MixTextureHandler(){
       super();
       this.mMainTrackIndex = 0;
       this.mMixTextureLock = new Object();
       this.mReleased = false;
    }
    public void MixTextureHandler(LinkedHashMap p0){
       super();
       this.mMainTrackIndex = 0;
       this.mMixTextureLock = new Object();
       this.mReleased = false;
       this.mBlendModes = p0;
       HashMap hashMap = new HashMap();
    }
    public void addTextFilter(ClipFilterBase p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MixTextureHandler.class, "4")) {
          return;
       }
       MixTextureHandler tmMixTexture = this.mMixTextureLock;
       _monitor_enter(tmMixTexture);
       if (this.mClipFilters == null) {
          this.mClipFilters = new ArrayList();
       }
       this.mClipFilters.add(p0);
       _monitor_exit(tmMixTexture);
       return;
    }
    public void clearFilter(){
       if (PatchProxy.applyVoid(null, this, MixTextureHandler.class, "6")) {
          return;
       }
       MixTextureHandler tmMixTexture = this.mMixTextureLock;
       _monitor_enter(tmMixTexture);
       Iterator iterator = this.mClipFilters.iterator();
       while (iterator.hasNext()) {
          this.mNeedRemoveFilters.add(iterator.next());
       }
       this.mClipFilters.clear();
       _monitor_exit(tmMixTexture);
       return;
    }
    public ExternalFilterResult filterOriginalFrame(ExternalFilterRequest p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MixTextureHandler.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.filterOriginalFrame(p0);
    }
    public ExternalFilterResult filterProcessedFrame(ExternalFilterRequest p0){
       int i1;
       int i4;
       int i5;
       int i6;
       int i7;
       MixTextureHandler obj = PatchProxy.applyOneRefs(p0, this, MixTextureHandler.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mMixTextureLock;
       _monitor_enter(obj);
       if (this.mReleased != null) {
          EditorSdkLogger.w(MixTextureHandler.TAG, "filterProcessedFrame been called£¬but PreviewPlayer has been released");
          _monitor_exit(obj);
          return super.filterProcessedFrame(p0);
       }else {
          int i = 0;
          ExternalFilterFrameData uExternalFil = p0.getFrameData().get(i);
          List animatedSubA = p0.getAnimatedSubAssetData();
          if (animatedSubA == null || animatedSubA.size() <= 0) {
             _monitor_exit(obj);
             return super.filterProcessedFrame(p0);
          }else {
             ArrayList uArrayList = new ArrayList();
             Iterator iterator = this.mBlendModes.entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                long l = uEntry.getKey().longValue();
                CGENativeLibrary$TextureBlendMode value = uEntry.getValue();
                if (!l - (long)this.mMainTrackIndex) {
                   uArrayList.add(value);
                }else {
                   i1 = 0;
                   while (i1 < animatedSubA.size()) {
                      if (!l - animatedSubA.get(i1).getAssetId()) {
                         uArrayList.add(value);
                      }
                      i1 = i1 + 1;
                   }
                }
             }
             uArrayList.remove(i);
             if (uArrayList.size() != animatedSubA.size()) {
                _monitor_exit(obj);
                return super.filterProcessedFrame(p0);
             }else {
                int i2 = 0x8d40;
                if (animatedSubA.size() > MixTextureHandler.MAX_ANIMATED_COUNT) {
                   if (this.mFboManger == null) {
                      this.mFboManger = new FboManager(uExternalFil.getTextureWidth(), uExternalFil.getTextureHeight());
                   }else if(uExternalFil.getTextureWidth() != this.mFboManger.getFboWidth() || uExternalFil.getTextureHeight() != this.mFboManger.getFboHeight()){
                      this.mFboManger.resize(uExternalFil.getTextureWidth(), uExternalFil.getTextureHeight());
                   }
                   this.mFboManger.activeOutputFbo();
                   if (this.mDrawer == null) {
                      this.mDrawer = f.a();
                   }
                   if (this.mMainTrackIndex == null) {
                      this.mDrawer.b(uExternalFil.getTexture());
                   }else {
                      this.mDrawer.b(animatedSubA.get(i).getTexture());
                   }
                   int i3 = MixTextureHandler.MAX_ANIMATED_COUNT + 1;
                   for (i4 = 0; i4 < animatedSubA.size(); i4 = i4 + MixTextureHandler.MAX_ANIMATED_COUNT) {
                      this.mFboManger.swapFbo();
                      if (this.mTextureDrawer != null && !this.isSameBlendModes(uArrayList)) {
                         this.mTextureDrawer.b();
                         this.mTextureDrawer = null;
                      }
                      if (this.mLastBlendModes == null) {
                         this.mLastBlendModes = new ArrayList();
                      }
                      if (this.mTextureDrawer == null) {
                         g$a uoa = new g$a();
                         for (i5 = i4; i5 < i3; i5 = i5 + 1) {
                            i6 = i4 % i3;
                            CGENativeLibrary$TextureBlendMode textureBlend = uArrayList.get(i6);
                            this.mLastBlendModes.add(textureBlend);
                            uoa.a(textureBlend);
                         }
                         this.mTextureDrawer = uoa.b();
                      }
                      i1 = i4;
                      i5 = 0;
                      i6 = i4 + i3;
                      while (i1 < i6) {
                         MixTextureHandler tmMainTrackI = this.mMainTrackIndex;
                         if (i4 == tmMainTrackI) {
                            this.mTextureDrawer.c(tmMainTrackI, uExternalFil.getTexture());
                            i7 = i5 + 1;
                            this.mTextureDrawer.c(i7, animatedSubA.get(i1).getTexture());
                         }else if(i4 > tmMainTrackI){
                            i7 = i5 + 1;
                            this.mTextureDrawer.c(i7, animatedSubA.get(i1).getTexture());
                         }else {
                            this.mTextureDrawer.c(i5, animatedSubA.get(i1).getTexture());
                         }
                         i5 = i5 + 1;
                         i1 = i1 + 1;
                      }
                      this.mTextureDrawer.a();
                   }
                   GLES20.glBindFramebuffer(i2, uExternalFil.getTargetFbo());
                   this.mDrawer.b(this.mFboManger.getOutputTexture());
                   this.mFboManger.swapFbo();
                }else if(this.mTextureDrawer != null && !this.isSameBlendModes(uArrayList)){
                   this.mTextureDrawer.b();
                   this.mTextureDrawer = null;
                }
                if (this.mTextureDrawer == null) {
                   g$a uoa1 = new g$a();
                   for (i4 = 0; i4 < uArrayList.size(); i4 = i4 + 1) {
                      uoa1.a(uArrayList.get(i4));
                   }
                   this.mTextureDrawer = uoa1.b();
                }
                this.mLastBlendModes = uArrayList;
                GLES20.glBindFramebuffer(i2, p0.getTargetFbo());
                GLES20.glViewport(i, i, uExternalFil.getTextureWidth(), uExternalFil.getTextureHeight());
                int i8 = 0;
                while (i8 < animatedSubA.size()) {
                   MixTextureHandler tmMainTrackI1 = this.mMainTrackIndex;
                   if (i8 == tmMainTrackI1) {
                      this.mTextureDrawer.c(i8, uExternalFil.getTexture());
                      i4 = i8 + 1;
                      this.mTextureDrawer.c(i4, animatedSubA.get(i8).getTexture());
                   }else if(i8 > tmMainTrackI1){
                      i4 = i8 + 1;
                      this.mTextureDrawer.c(i4, animatedSubA.get(i8).getTexture());
                   }else {
                      this.mTextureDrawer.c(i8, animatedSubA.get(i8).getTexture());
                   }
                   i8 = i8 + 1;
                }
                this.mTextureDrawer.a();
                if (this.mClipFilters != null) {
                   for (; i < this.mClipFilters.size(); i = i + 1) {
                      this.mClipFilters.get(i).filterProcessedFrame(p0, null);
                   }
                }
                _monitor_exit(obj);
                return super.filterProcessedFrame(p0);
             }
          }
       }
    }
    public void init(ExternalFilterInitParams p0){
       MixTextureHandler tmMixTexture = this.mMixTextureLock;
       _monitor_enter(tmMixTexture);
       this.mReleased = false;
       _monitor_exit(tmMixTexture);
    }
    public final boolean isSameBlendModes(List p0){
       MixTextureHandler obj = PatchProxy.applyOneRefs(p0, this, MixTextureHandler.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mLastBlendModes;
       if (obj != null && obj.size() != p0.size()) {
          return false;
       }
       int i = 0;
       while (true) {
          if (i >= p0.size()) {
             return true;
          }
          if (p0.get(i) != this.mLastBlendModes.get(i)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return false;
    }
    public void releaseFilter(ExternalFilterReleaseParams p0){
       Iterator iterator;
       if (PatchProxy.applyVoidOneRefs(p0, this, MixTextureHandler.class, "10")) {
          return;
       }
       MixTextureHandler tmMixTexture = this.mMixTextureLock;
       _monitor_enter(tmMixTexture);
       this.mReleased = true;
       MixTextureHandler tmTextureDra = this.mTextureDrawer;
       g og = null;
       if (tmTextureDra != null) {
          tmTextureDra.b();
          this.mTextureDrawer = og;
       }
       tmTextureDra = this.mDrawer;
       if (tmTextureDra != null) {
          tmTextureDra.f();
          this.mDrawer = og;
       }
       tmTextureDra = this.mClipFilters;
       if (tmTextureDra != null && tmTextureDra.size() > 0) {
          iterator = this.mClipFilters.iterator();
          while (iterator.hasNext()) {
             iterator.next().releaseFilter(p0);
          }
          this.mClipFilters.clear();
       }
       tmTextureDra = this.mNeedRemoveFilters;
       if (tmTextureDra != null && tmTextureDra.size() > 0) {
          iterator = this.mNeedRemoveFilters.iterator();
          while (iterator.hasNext()) {
             iterator.next().releaseFilter(p0);
          }
          this.mNeedRemoveFilters.clear();
       }
       _monitor_exit(tmMixTexture);
       return;
    }
    public void removeFilter(ClipFilterBase p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MixTextureHandler.class, "5")) {
          return;
       }
       MixTextureHandler tmMixTexture = this.mMixTextureLock;
       _monitor_enter(tmMixTexture);
       this.mNeedRemoveFilters.add(p0);
       this.mClipFilters.remove(p0);
       _monitor_exit(tmMixTexture);
       return;
    }
    public void setBlendMode(LinkedHashMap p0){
       MixTextureHandler tmMixTexture = this.mMixTextureLock;
       _monitor_enter(tmMixTexture);
       this.mBlendModes = p0;
       _monitor_exit(tmMixTexture);
    }
    public void setExportTask(ExportTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MixTextureHandler.class, "2")) {
          return;
       }
       if (p0 != null) {
          p0.setExternalFilterRequestListenerV2(null);
          p0.setExternalFilterRequestListenerV2(this);
       }
       return;
    }
    public void setMainTrackZIndex(int p0){
       MixTextureHandler tmMixTexture = this.mMixTextureLock;
       _monitor_enter(tmMixTexture);
       this.mMainTrackIndex = p0;
       _monitor_exit(tmMixTexture);
    }
    public void setPreviewPlayer(PreviewPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MixTextureHandler.class, "1")) {
          return;
       }
       if (p0 != null) {
          p0.setExternalFilterRequestListenerV2(null);
          p0.setExternalFilterRequestListenerV2(this);
       }
       return;
    }
    public void setThumbnailGenerator(ThumbnailGenerator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MixTextureHandler.class, "3")) {
          return;
       }
       if (p0 != null) {
          p0.setExternalFilterRequestListerV2(null);
          p0.setExternalFilterRequestListerV2(this);
       }
       return;
    }
}
