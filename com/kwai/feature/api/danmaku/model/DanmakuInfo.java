package com.kwai.feature.api.danmaku.model.DanmakuInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fa6.c;
import com.kuaishou.android.model.mix.CommonMeta;
import fa6.e;
import fa6.b;
import com.kwai.feature.api.danmaku.model.DanmakuShowType;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.api.danmaku.model.DanmakuShowDirection;
import com.kwai.feature.api.danmaku.DanmakuExperimentUtils;

public class DanmakuInfo implements Serializable	// class@000e79
{
    public String mActivityInfoKey;
    public String mCNY2023Preset;
    public int mDanmakuCount;
    public DanmakuInputHint mDanmakuInputHint;
    public DanmakuShowDirection mDanmakuShowDirection;
    public DanmakuShowType mDanmakuShowType;
    public List mDanmakuWishIconList;
    public String mDefaultDanmaku;
    public boolean mDisablePost;
    public String mDisableReasonTip;
    public String mDisableReasoneyKey;
    public boolean mHasDanmaku;
    public boolean mHasDanmakuMaskNew;
    public boolean mHasMask;
    public boolean mPaster;
    public boolean mPhotoDanmakuCloseGuide;
    public boolean mPhotoDanmakuGuide;
    public PhotoDanmakuGuideConfig mPhotoDanmakuGuideConfig;
    public static final long serialVersionUID = 0x9f55a6cc5cc5a619;

    public void DanmakuInfo(){
       super();
    }
    public static void register(){
       if (PatchProxy.applyVoid(null, null, DanmakuInfo.class, "1")) {
          return;
       }
       e uoe = new e(DanmakuInfo.class, "danmakuInfo", "danmakuInfo");
       uoe.a(null);
       c.a.e(CommonMeta.class, uoe);
       return;
    }
    public DanmakuShowType getDanmakuShowType(){
       Object obj = PatchProxy.apply(null, this, DanmakuInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mDanmakuShowDirection == DanmakuShowDirection.ROTATION_MINUS_90 && !DanmakuExperimentUtils.J()) {
          return null;
       }
       return this.mDanmakuShowType;
    }
    public DanmakuShowType getRealShowType(){
       return this.mDanmakuShowType;
    }
}
