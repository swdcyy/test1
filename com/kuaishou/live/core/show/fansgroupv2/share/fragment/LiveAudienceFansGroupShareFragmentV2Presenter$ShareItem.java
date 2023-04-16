package com.kuaishou.live.core.show.fansgroupv2.share.fragment.LiveAudienceFansGroupShareFragmentV2Presenter$ShareItem;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import mhc.o2;

public final class LiveAudienceFansGroupShareFragmentV2Presenter$ShareItem extends Enum	// class@000b51
{
    public String mChannel;
    public boolean mHasShared;
    public static final LiveAudienceFansGroupShareFragmentV2Presenter$ShareItem[] $VALUES;
    public static final LiveAudienceFansGroupShareFragmentV2Presenter$ShareItem MOMENTS;
    public static final LiveAudienceFansGroupShareFragmentV2Presenter$ShareItem WECHAT;

    static {
       LiveAudienceFansGroupShareFragmentV2Presenter$ShareItem shareItem = new LiveAudienceFansGroupShareFragmentV2Presenter$ShareItem("WECHAT", 0, "wechat");
       LiveAudienceFansGroupShareFragmentV2Presenter$ShareItem.WECHAT = shareItem;
       LiveAudienceFansGroupShareFragmentV2Presenter$ShareItem shareItem1 = new LiveAudienceFansGroupShareFragmentV2Presenter$ShareItem("MOMENTS", 1, "wechatMoments");
       LiveAudienceFansGroupShareFragmentV2Presenter$ShareItem.MOMENTS = shareItem1;
       LiveAudienceFansGroupShareFragmentV2Presenter$ShareItem[] shareItemArr = new LiveAudienceFansGroupShareFragmentV2Presenter$ShareItem[]{shareItem,shareItem1};
       LiveAudienceFansGroupShareFragmentV2Presenter$ShareItem.$VALUES = shareItemArr;
    }
    public void LiveAudienceFansGroupShareFragmentV2Presenter$ShareItem(String p0,int p1,String p2){
       super(p0, p1);
       this.mHasShared = false;
       this.mChannel = p2;
    }
    public static LiveAudienceFansGroupShareFragmentV2Presenter$ShareItem get(String p0){
       object oobject;
       LiveAudienceFansGroupShareFragmentV2Presenter$ShareItem[] obj = PatchProxy.applyOneRefs(p0, null, LiveAudienceFansGroupShareFragmentV2Presenter$ShareItem.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = LiveAudienceFansGroupShareFragmentV2Presenter$ShareItem.values();
       int len = obj.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return null;
          }
          oobject = obj[i];
          if (p0.equals(oobject.getActionUrl())) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return oobject;
    }
    public static void reset(){
       if (PatchProxy.applyVoid(null, null, LiveAudienceFansGroupShareFragmentV2Presenter$ShareItem.class, "4")) {
          return;
       }
       LiveAudienceFansGroupShareFragmentV2Presenter$ShareItem[] shareItemArr = LiveAudienceFansGroupShareFragmentV2Presenter$ShareItem.values();
       int len = shareItemArr.length;
       for (int i = 0; i < len; i = i + 1) {
          shareItemArr[i].mHasShared = false;
       }
       return;
    }
    public static LiveAudienceFansGroupShareFragmentV2Presenter$ShareItem valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveAudienceFansGroupShareFragmentV2Presenter$ShareItem.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveAudienceFansGroupShareFragmentV2Presenter$ShareItem.class, p0);
    }
    public static LiveAudienceFansGroupShareFragmentV2Presenter$ShareItem[] values(){
       Object obj = PatchProxy.apply(null, null, LiveAudienceFansGroupShareFragmentV2Presenter$ShareItem.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveAudienceFansGroupShareFragmentV2Presenter$ShareItem.$VALUES.clone();
    }
    public String getActionUrl(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceFansGroupShareFragmentV2Presenter$ShareItem.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return o2.a(true, this.mChannel);
    }
}
