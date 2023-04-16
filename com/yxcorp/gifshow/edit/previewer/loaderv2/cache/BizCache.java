package com.yxcorp.gifshow.edit.previewer.loaderv2.cache.BizCache;
import java.lang.Enum;
import sba.c;
import java.lang.String;
import java.lang.Class;
import sba.i;
import sba.q;
import sba.b;
import sba.d;
import sba.e;
import sba.h;
import sba.g;
import sba.a;
import sba.p;
import sba.n;
import sba.o;
import sba.j;
import sba.f;
import sba.k;
import sba.r;
import sba.l;
import sba.m;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class BizCache extends Enum	// class@001b38
{
    public final Class clazz;
    public static final BizCache[] $VALUES;
    public static final BizCache AICutMvCreationResult;
    public static final BizCache AnimateSubAsset;
    public static final BizCache AudioAsset;
    public static final BizCache AudioDuration;
    public static final BizCache ColorFilterParam;
    public static final BizCache CropOption;
    public static final BizCache EditorSdk2MvCreationResult;
    public static final BizCache EffectiveFile;
    public static final BizCache KuaishanAudioAsset;
    public static final BizCache KuaishanResourceCheckResult;
    public static final BizCache OldCropOption;
    public static final BizCache RecreationPicture;
    public static final BizCache StickerAnimateSubAsset;
    public static final BizCache StickerEffectiveFile;
    public static final BizCache TextAnimateSubAsset;
    public static final BizCache TrackAsset;
    public static final BizCache VisualEffectParam;
    public static final BizCache WidthAndHeight;

    static {
       BizCache[] uBizCacheArr = new BizCache[18];
       BizCache uBizCache = new BizCache("AudioAsset", 0, c.class);
       BizCache.AudioAsset = uBizCache;
       uBizCacheArr[0] = uBizCache;
       uBizCache = new BizCache("KuaishanAudioAsset", 1, i.class);
       BizCache.KuaishanAudioAsset = uBizCache;
       uBizCacheArr[1] = uBizCache;
       uBizCache = new BizCache("TrackAsset", 2, q.class);
       BizCache.TrackAsset = uBizCache;
       uBizCacheArr[2] = uBizCache;
       uBizCache = new BizCache("AnimateSubAsset", 3, b.class);
       BizCache.AnimateSubAsset = uBizCache;
       uBizCacheArr[3] = uBizCache;
       uBizCache = new BizCache("AudioDuration", 4, d.class);
       BizCache.AudioDuration = uBizCache;
       uBizCacheArr[4] = uBizCache;
       uBizCache = new BizCache("ColorFilterParam", 5, e.class);
       BizCache.ColorFilterParam = uBizCache;
       uBizCacheArr[5] = uBizCache;
       uBizCache = new BizCache("EffectiveFile", 6, h.class);
       BizCache.EffectiveFile = uBizCache;
       uBizCacheArr[6] = uBizCache;
       uBizCache = new BizCache("EditorSdk2MvCreationResult", 7, g.class);
       BizCache.EditorSdk2MvCreationResult = uBizCache;
       uBizCacheArr[7] = uBizCache;
       uBizCache = new BizCache("AICutMvCreationResult", 8, a.class);
       BizCache.AICutMvCreationResult = uBizCache;
       uBizCacheArr[8] = uBizCache;
       uBizCache = new BizCache("TextAnimateSubAsset", 9, p.class);
       BizCache.TextAnimateSubAsset = uBizCache;
       uBizCacheArr[9] = uBizCache;
       uBizCache = new BizCache("StickerAnimateSubAsset", 10, n.class);
       BizCache.StickerAnimateSubAsset = uBizCache;
       uBizCacheArr[10] = uBizCache;
       uBizCache = new BizCache("StickerEffectiveFile", 11, o.class);
       BizCache.StickerEffectiveFile = uBizCache;
       uBizCacheArr[11] = uBizCache;
       uBizCache = new BizCache("KuaishanResourceCheckResult", 12, j.class);
       BizCache.KuaishanResourceCheckResult = uBizCache;
       uBizCacheArr[12] = uBizCache;
       uBizCache = new BizCache("CropOption", 13, f.class);
       BizCache.CropOption = uBizCache;
       uBizCacheArr[13] = uBizCache;
       uBizCache = new BizCache("OldCropOption", 14, k.class);
       BizCache.OldCropOption = uBizCache;
       uBizCacheArr[14] = uBizCache;
       uBizCache = new BizCache("VisualEffectParam", 15, r.class);
       BizCache.VisualEffectParam = uBizCache;
       uBizCacheArr[15] = uBizCache;
       uBizCache = new BizCache("WidthAndHeight", 16, l.class);
       BizCache.WidthAndHeight = uBizCache;
       uBizCacheArr[16] = uBizCache;
       uBizCache = new BizCache("RecreationPicture", 17, m.class);
       BizCache.RecreationPicture = uBizCache;
       uBizCacheArr[17] = uBizCache;
       BizCache.$VALUES = uBizCacheArr;
    }
    public void BizCache(String p0,int p1,Class p2){
       super(p0, p1);
       this.clazz = p2;
    }
    public static BizCache valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, BizCache.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(BizCache.class, p0);
    }
    public static BizCache[] values(){
       Object obj = PatchProxy.apply(null, null, BizCache.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return BizCache.$VALUES.clone();
    }
    public final Class getCacheClazz(){
       return this.clazz;
    }
}
