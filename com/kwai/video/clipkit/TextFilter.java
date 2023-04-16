package com.kwai.video.clipkit.TextFilter;
import com.kwai.video.clipkit.ClipFilterBase;
import android.content.Context;
import java.lang.Object;
import java.util.LinkedList;
import org.wysaid.nativePort.CGENativeLibrary;
import com.kwai.video.clipkit.TextFilter$TextEffectConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.video.clipkit.TextFilter$TextEffectFilterContext;
import com.kwai.video.clipkit.TextFilter$1;
import java.util.List;
import com.kwai.video.editorsdk2.ExternalFilterRequest;
import java.lang.Boolean;
import com.kwai.video.clipkit.FboManager;
import com.kwai.video.editorsdk2.ExternalFilterFrameData;
import org.wysaid.nativePort.CGETextEffect$EffectConfig;
import java.util.ArrayList;
import java.util.Iterator;
import com.kwai.video.clipkit.TextFilter$TextLine;
import org.wysaid.nativePort.CGETextEffect$TextLine;
import java.lang.CharSequence;
import android.text.TextUtils;
import org.wysaid.nativePort.CGETextEffect;
import java.lang.StringBuilder;
import com.kwai.video.clipkit.TextFilter$TextColor;
import com.kwai.video.clipkit.TextFilter$Transformation;
import java.lang.Integer;
import org.wysaid.nativePort.CGETextEffect$TextEffectCornerPoints;
import com.kwai.video.editorsdk2.ExternalFilterReleaseParams;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;

public class TextFilter extends ClipFilterBase	// class@001a52
{
    public int mCanvasHeight;
    public int mCanvasWidth;
    public Object mEffectContextLock;
    public int mIndex;
    public boolean mIsLoop;
    public List mNeedReleaseEffects;
    public EditorSdk2V2$VideoEditorProject mProject;
    public String mResourceDir;
    public List mTextEffectContexts;
    public int mUpdateType;

    public void TextFilter(Context p0){
       super();
       this.mEffectContextLock = new Object();
       this.mIsLoop = true;
       this.mUpdateType = 3;
       this.mTextEffectContexts = new LinkedList();
       this.mNeedReleaseEffects = new LinkedList();
       if (p0 != null) {
          CGENativeLibrary.setApplicationContext(p0.getApplicationContext());
       }
       return;
    }
    public int addText(TextFilter$TextEffectConfig p0){
       TextFilter obj = PatchProxy.applyOneRefs(p0, this, TextFilter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mEffectContextLock;
       _monitor_enter(obj);
       TextFilter$TextEffectFilterContext textEffectFi = new TextFilter$TextEffectFilterContext(this, null);
       textEffectFi.config = p0;
       textEffectFi.needUpdateConfig = false;
       TextFilter tmIndex = this.mIndex;
       this.mIndex = tmIndex + 1;
       textEffectFi.index = tmIndex;
       this.mTextEffectContexts.add(textEffectFi);
       _monitor_exit(obj);
       return textEffectFi.index;
    }
    public int canvesHeight(){
       return this.mCanvasHeight;
    }
    public int canvesWidth(){
       return this.mCanvasWidth;
    }
    public boolean filterProcessedFrame(ExternalFilterRequest p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TextFilter.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.filterProcessedFrame(p0, null);
    }
    public boolean filterProcessedFrame(ExternalFilterRequest p0,FboManager p1){
       int textureWidth;
       int textureHeigh;
       double d2;
       TextFilter$TextEffectFilterContext textColor;
       TextFilter textFilter = this;
       TextFilter$TextEffectFilterContext obj = p1;
       TextFilter obj1 = PatchProxy.applyTwoRefs(p0, obj, textFilter, TextFilter.class, "10");
       if (obj1 != PatchProxyResult.class) {
          return obj1.booleanValue();
       }
       obj1 = textFilter.mEffectContextLock;
       _monitor_enter(obj1);
       int i = 0;
       if (textFilter.mTextEffectContexts.size() <= 0 || p0.getFrameData().size() <= 0) {
          _monitor_exit(obj1);
          return false;
       }else if(obj == null){
          textureWidth = p0.getFrameData().get(i).getTextureWidth();
          textureHeigh = p0.getFrameData().get(i).getTextureHeight();
       }else {
          textureWidth = p1.getFboWidth();
          textureHeigh = p1.getFboHeight();
       }
       int i1 = 0;
       while (i1 < textFilter.mTextEffectContexts.size()) {
          TextFilter$TextEffectFilterContext textEffectFi = textFilter.mTextEffectContexts.get(i1);
          double d = 0x408f400000000000;
          double d1 = p0.getRenderPos() * d;
          TextFilter mUpdateType = textFilter.mUpdateType;
          if (mUpdateType == 1 || (mUpdateType != 2 && mUpdateType == 3)) {
             d1 = p0.getRenderPos() * d;
          }
       label_0087 :
          TextFilter$TextEffectFilterContext config = textEffectFi.config;
          TextFilter$TextEffectConfig startTime = config.startTime;
          if (startTime - d1 <= 0) {
             if (textFilter.mIsLoop != null) {
                d1 = d1 - startTime;
                d1 = d1 % config.totalDurationTime;
             }
             if (d1 - config.totalDurationTime <= 0) {
                if (textEffectFi.textEffect != null && (textEffectFi.needUpdateConfig == null && (textFilter.mCanvasWidth != textureWidth || textFilter.mCanvasHeight != textureHeigh))) {
                   CGETextEffect$EffectConfig uEffectConfi = new CGETextEffect$EffectConfig();
                   ArrayList uArrayList = new ArrayList(textEffectFi.config.textLines.size());
                   TextFilter$TextEffectConfig textLines = textEffectFi.config.textLines;
                   if (textLines != null) {
                      Iterator iterator = textLines.iterator();
                      while (iterator.hasNext()) {
                         TextFilter$TextLine textLine1 = iterator.next();
                         CGETextEffect$TextLine textLine2 = v15;
                         CGETextEffect$TextLine textLine3 = new CGETextEffect$TextLine(textLine1.text, (float)textLine1.timestamp, (float)textLine1.duration, textLine1.color, textLine1.font);
                         uArrayList.add(textLine2);
                         d1 = d1;
                         TextFilter$TextEffectConfig textEffectCo = null;
                      }
                   }
                   d2 = d1;
                   uEffectConfi.textLines = uArrayList;
                   obj = textEffectFi.config;
                   uEffectConfi.effectType = obj.effectType;
                   uEffectConfi.width = textureWidth;
                   uEffectConfi.height = textureHeigh;
                   uEffectConfi.totalTime = (float)obj.totalDurationTime;
                   if (!TextUtils.isEmpty(obj.assetsDir)) {
                      uEffectConfi.assetsDir = textEffectFi.config.assetsDir;
                      textFilter = this;
                   }else {
                      textFilter = this;
                      uEffectConfi.assetsDir = textFilter.mResourceDir;
                   }
                   obj = textEffectFi.config;
                   uEffectConfi.indexFile = obj.indexFile;
                   uEffectConfi.preludeAssetCount = obj.preludeAssetCount;
                   uEffectConfi.preludeAssetDir = obj.preludeAssetDir;
                   uEffectConfi.needPrelude = obj.needPrelude;
                   uEffectConfi.preludeStartTime = obj.preludeStartTime;
                   uEffectConfi.preludeEndTime = obj.preludeEndTime;
                   uEffectConfi.preludeAssetPrefix = obj.preludeAssetPrefix;
                   obj = textEffectFi.textEffect;
                   if (obj != null) {
                      obj.release();
                   }
                   CGETextEffect uCGETextEffe = CGETextEffect.createWithConfig(uEffectConfi);
                   textEffectFi.textEffect = uCGETextEffe;
                   if (uCGETextEffe == null) {
                      StringBuilder str = "CGETextEffect.createWithConfig failed:"+uEffectConfi;
                   }else {
                      textEffectFi.needUpdateConfig = false;
                      textColor = textEffectFi.textColor;
                      if (textColor != null) {
                         uCGETextEffe.setTextColor(textColor.r, textColor.g, textColor.b, textColor.a);
                         textEffectFi.needUpdateTextColor = false;
                      }
                   }
                }else {
                   d2 = d1;
                }
                obj = textEffectFi.textColor;
                if (obj != null && textEffectFi.needUpdateTextColor != null) {
                   textEffectFi.textEffect.setTextColor(obj.r, obj.g, obj.b, obj.a);
                   textEffectFi.needUpdateTextColor = false;
                }
                textEffectFi.textEffect.updateTo((float)d2);
                obj = textEffectFi.transformation;
                if (obj != null) {
                   textEffectFi.textEffect.scaleTo(obj.scale);
                   textColor = textEffectFi.transformation;
                   textEffectFi.textEffect.moveTo(textColor.x, textColor.y);
                   float f = textEffectFi.transformation.rotate / 180.00f;
                   f = f * 0x40490fdb;
                   textEffectFi.textEffect.rotateTo(f);
                }
                if (p1 == null) {
                   textEffectFi.textEffect.render(p0.getTargetFbo());
                }else {
                   textEffectFi.textEffect.render(p1.getInputFbo());
                }
             }
          }
          i1 = i1 + 1;
          TextFilter$TextLine textLine = null;
       }
       textFilter.mCanvasWidth = textureWidth;
       textFilter.mCanvasHeight = textureHeigh;
       Iterator iterator1 = textFilter.mNeedReleaseEffects.iterator();
       while (iterator1.hasNext()) {
          iterator1.next().release();
       }
       textFilter.mNeedReleaseEffects.clear();
       _monitor_exit(obj1);
       return false;
    }
    public TextFilter$TextEffectConfig getConfig(int p0){
       TextFilter$TextEffectFilterContext textEffectFi;
       TextFilter textFilter = TextFilter.class;
       if (PatchProxy.isSupport(textFilter)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, textFilter, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       textFilter = this.mEffectContextLock;
       _monitor_enter(textFilter);
       int i = 0;
       while (true) {
          if (i < this.mTextEffectContexts.size()) {
             textEffectFi = this.mTextEffectContexts.get(i);
             if (textEffectFi.index == p0) {
                break ;
             }else {
                i = i + 1;
             }
          }else {
             _monitor_exit(textFilter);
             return null;
          }
       }
       _monitor_exit(textFilter);
       return textEffectFi.config;
    }
    public CGETextEffect$TextEffectCornerPoints getCornerPoints(int p0){
       TextFilter$TextEffectFilterContext textEffectFi;
       TextFilter textFilter = TextFilter.class;
       if (PatchProxy.isSupport(textFilter)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, textFilter, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       textFilter = this.mEffectContextLock;
       _monitor_enter(textFilter);
       int i = 0;
       while (true) {
          if (i < this.mTextEffectContexts.size()) {
             textEffectFi = this.mTextEffectContexts.get(i);
             if (textEffectFi.index == p0) {
                textEffectFi = textEffectFi.textEffect;
                if (textEffectFi != null) {
                   break ;
                }
             }
             i = i + 1;
          }else {
             _monitor_exit(textFilter);
             return null;
          }
       }
       _monitor_exit(textFilter);
       return textEffectFi.getCornerPoints();
    }
    public boolean isAvailable(){
       TextFilter obj = PatchProxy.apply(null, this, TextFilter.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mTextEffectContexts;
       boolean b = (obj != null && obj.size() > 0)? true: false;
       return b;
    }
    public void releaseFilter(ExternalFilterReleaseParams p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextFilter.class, "11")) {
          return;
       }
       TextFilter tmEffectCont = this.mEffectContextLock;
       _monitor_enter(tmEffectCont);
       int i = 0;
       while (i < this.mTextEffectContexts.size()) {
          TextFilter$TextEffectFilterContext textEffectFi = this.mTextEffectContexts.get(i);
          TextFilter$TextEffectFilterContext textEffect = textEffectFi.textEffect;
          if (textEffect != null) {
             textEffect.release();
             textEffectFi.textEffect = null;
          }
          i = i + 1;
       }
       Iterator iterator = this.mNeedReleaseEffects.iterator();
       while (iterator.hasNext()) {
          iterator.next().release();
       }
       this.mNeedReleaseEffects.clear();
       _monitor_exit(tmEffectCont);
       return;
    }
    public boolean removeText(int p0){
       TextFilter$TextEffectFilterContext textEffectFi;
       TextFilter textFilter = TextFilter.class;
       if (PatchProxy.isSupport(textFilter)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, textFilter, "8");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       textFilter = this.mEffectContextLock;
       _monitor_enter(textFilter);
       TextFilter textFilter1 = null;
       int i = 0;
       while (true) {
          if (i < this.mTextEffectContexts.size()) {
             textEffectFi = this.mTextEffectContexts.get(i);
             if (textEffectFi.index == p0) {
                TextFilter$TextEffectFilterContext textEffect = textEffectFi.textEffect;
                if (textEffect != null) {
                   this.mNeedReleaseEffects.add(textEffect);
                   break ;
                }
                break ;
             }else {
                i = i + 1;
             }
          }else {
             _monitor_exit(textFilter);
             return textFilter1;
          }
       }
       this.mTextEffectContexts.remove(textEffectFi);
       _monitor_exit(textFilter);
       return true;
    }
    public void setLoop(Boolean p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextFilter.class, "1")) {
          return;
       }
       TextFilter tmEffectCont = this.mEffectContextLock;
       _monitor_enter(tmEffectCont);
       this.mIsLoop = p0.booleanValue();
       _monitor_exit(tmEffectCont);
       return;
    }
    public void setProject(EditorSdk2V2$VideoEditorProject p0){
       TextFilter tmEffectCont = this.mEffectContextLock;
       _monitor_enter(tmEffectCont);
       this.mProject = p0;
       _monitor_exit(tmEffectCont);
    }
    public void setResourceDir(String p0){
       this.mResourceDir = p0;
    }
    public boolean setTextColor(TextFilter$TextColor p0,int p1){
       TextFilter$TextEffectFilterContext textEffectFi;
       TextFilter textFilter = TextFilter.class;
       if (PatchProxy.isSupport(textFilter)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, textFilter, "4");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       textFilter = this.mEffectContextLock;
       _monitor_enter(textFilter);
       int i = 0;
       while (true) {
          if (i < this.mTextEffectContexts.size()) {
             textEffectFi = this.mTextEffectContexts.get(i);
             if (textEffectFi.index == p1) {
                break ;
             }else {
                i = i + 1;
             }
          }else {
             _monitor_exit(textFilter);
             return false;
          }
       }
       textEffectFi.textColor = p0;
       textEffectFi.needUpdateTextColor = true;
       _monitor_exit(textFilter);
       return true;
    }
    public void setUpdateType(int p0){
       this.mUpdateType = p0;
    }
    public boolean updateTextConfig(TextFilter$TextEffectConfig p0,int p1){
       TextFilter$TextEffectFilterContext textEffectFi;
       TextFilter textFilter = TextFilter.class;
       if (PatchProxy.isSupport(textFilter)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, textFilter, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       textFilter = this.mEffectContextLock;
       _monitor_enter(textFilter);
       int i = 0;
       while (true) {
          if (i < this.mTextEffectContexts.size()) {
             textEffectFi = this.mTextEffectContexts.get(i);
             if (textEffectFi.index == p1) {
                break ;
             }else {
                i = i + 1;
             }
          }else {
             _monitor_exit(textFilter);
             return false;
          }
       }
       textEffectFi.config = p0;
       textEffectFi.needUpdateConfig = true;
       _monitor_exit(textFilter);
       return true;
    }
    public boolean updateTextTransform(TextFilter$Transformation p0,int p1){
       TextFilter$TextEffectFilterContext textEffectFi;
       TextFilter textFilter = TextFilter.class;
       if (PatchProxy.isSupport(textFilter)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, textFilter, "5");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       textFilter = this.mEffectContextLock;
       _monitor_enter(textFilter);
       int i = 0;
       while (true) {
          if (i < this.mTextEffectContexts.size()) {
             textEffectFi = this.mTextEffectContexts.get(i);
             if (textEffectFi.index == p1) {
                break ;
             }else {
                i = i + 1;
             }
          }else {
             _monitor_exit(textFilter);
             return false;
          }
       }
       textEffectFi.transformation = p0;
       textEffectFi.needUpdateTransform = true;
       _monitor_exit(textFilter);
       return true;
    }
}
