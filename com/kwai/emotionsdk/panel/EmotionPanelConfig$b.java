package com.kwai.emotionsdk.panel.EmotionPanelConfig$b;
import java.lang.Object;
import com.kwai.emotionsdk.panel.EmotionPanelConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.emotionsdk.panel.EmotionPanelConfig$a;

public class EmotionPanelConfig$b	// class@000db1
{
    public int a;
    public boolean b;
    public int c;
    public boolean d;
    public int e;
    public boolean f;
    public boolean g;
    public int h;
    public boolean i;
    public boolean j;
    public int k;
    public int l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public String q;
    public String r;

    public void EmotionPanelConfig$b(){
       super();
       this.a = 1;
       this.b = true;
       this.c = 0;
       this.d = true;
       this.e = 1;
       this.f = true;
       this.g = true;
       this.h = Integer.MAX_VALUE;
       this.i = false;
       this.j = false;
       this.k = 8;
       this.l = 0;
       this.m = false;
       this.n = false;
       this.o = true;
    }
    public EmotionPanelConfig a(){
       Object[] objArray = null;
       EmotionPanelConfig obj = PatchProxy.apply(objArray, this, EmotionPanelConfig$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new EmotionPanelConfig(objArray);
       obj.mEmotionsShowMask = this.a;
       obj.mShowRecordIndex = this.b;
       obj.mInitTabIndex = this.c;
       obj.mShowRecentlyUsedEmoji = this.d;
       obj.mShowRecentlyUsedEmojiLine = this.e;
       obj.mShowDice = this.f;
       obj.mShowAdd = this.g;
       obj.mMaxEditorSize = this.h;
       obj.mEnableGIFSearch = this.i;
       obj.mEnableGIFSearchTAB = this.j;
       obj.mGIFSearchKeywordLimit = this.k;
       obj.mGIFSearchBizType = this.l;
       obj.mEnableForceDarkStyle = this.m;
       obj.mEnableForceLightStyle = this.n;
       obj.mShowEmojiPageDel = this.o;
       obj.mShowPackageBarClose = this.p;
       obj.mForceTopEmotionPackageId = this.q;
       obj.mInitEmotionPackageId = this.r;
       return obj;
    }
    public EmotionPanelConfig$b b(boolean p0){
       this.o = p0;
       return this;
    }
    public EmotionPanelConfig$b c(int p0){
       this.a = p0;
       return this;
    }
    public EmotionPanelConfig$b d(boolean p0){
       this.j = p0;
       return this;
    }
    public EmotionPanelConfig$b e(int p0){
       this.l = p0;
       return this;
    }
    public EmotionPanelConfig$b f(int p0){
       this.k = p0;
       return this;
    }
    public EmotionPanelConfig$b g(int p0){
       this.h = p0;
       return this;
    }
    public EmotionPanelConfig$b h(boolean p0){
       this.p = p0;
       return this;
    }
    public EmotionPanelConfig$b i(boolean p0){
       this.g = p0;
       return this;
    }
    public EmotionPanelConfig$b j(boolean p0){
       this.f = p0;
       return this;
    }
    public EmotionPanelConfig$b k(boolean p0){
       this.d = p0;
       return this;
    }
    public EmotionPanelConfig$b l(int p0){
       this.e = p0;
       return this;
    }
    public EmotionPanelConfig$b m(boolean p0){
       this.b = p0;
       return this;
    }
}
