package com.yxcorp.gifshow.growth.abtest.GrowthLocalABTestEnum;
import java.lang.Enum;
import com.yxcorp.gifshow.growth.abtest.PreEmbeddedVideoFeedAB;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import java.lang.String;
import wma.b;
import com.yxcorp.gifshow.growth.abtest.LocalEmbedFeedAB;
import com.yxcorp.gifshow.growth.abtest.FeedBigCardAB;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class GrowthLocalABTestEnum extends Enum	// class@0012dd
{
    public final d clazz;
    public final b instance;
    public static final GrowthLocalABTestEnum[] $VALUES;
    public static final GrowthLocalABTestEnum FeedBigCardImpl;
    public static final GrowthLocalABTestEnum LocalEmbedFeedABImpl;
    public static final GrowthLocalABTestEnum PreEmbeddedVideoFeed;

    static {
       GrowthLocalABTestEnum growthLocalA1;
       GrowthLocalABTestEnum[] growthLocalA = new GrowthLocalABTestEnum[]{growthLocalA1,growthLocalA1,growthLocalA1};
       growthLocalA1 = new GrowthLocalABTestEnum("PreEmbeddedVideoFeed", 0, m0.d(PreEmbeddedVideoFeedAB.class), PreEmbeddedVideoFeedAB.p);
       GrowthLocalABTestEnum.PreEmbeddedVideoFeed = growthLocalA1;
       growthLocalA1 = new GrowthLocalABTestEnum("LocalEmbedFeedABImpl", 1, m0.d(LocalEmbedFeedAB.class), LocalEmbedFeedAB.r);
       GrowthLocalABTestEnum.LocalEmbedFeedABImpl = growthLocalA1;
       growthLocalA1 = new GrowthLocalABTestEnum("FeedBigCardImpl", 2, m0.d(FeedBigCardAB.class), FeedBigCardAB.o);
       GrowthLocalABTestEnum.FeedBigCardImpl = growthLocalA1;
       GrowthLocalABTestEnum.$VALUES = growthLocalA;
    }
    public void GrowthLocalABTestEnum(String p0,int p1,d p2,b p3){
       super(p0, p1);
       this.clazz = p2;
       this.instance = p3;
    }
    public static GrowthLocalABTestEnum valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, GrowthLocalABTestEnum.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(GrowthLocalABTestEnum.class, p0);
    }
    public static GrowthLocalABTestEnum[] values(){
       Object obj = PatchProxy.apply(null, null, GrowthLocalABTestEnum.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GrowthLocalABTestEnum.$VALUES.clone();
    }
    public final d getClazz(){
       return this.clazz;
    }
    public final b getInstance(){
       return this.instance;
    }
}
