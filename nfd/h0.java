package nfd.h0;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import mcd.j;
import com.kuaishou.android.live.model.QLivePlayConfig;
import com.kuaishou.live.basic.model.StreamType;
import e7d.h;
import com.yxcorp.plugin.search.entity.SearchItem;
import com.yxcorp.plugin.search.entity.SearchItem$SearchItemType;
import com.yxcorp.plugin.search.response.SearchCommodityItem;
import com.yxcorp.plugin.search.entity.CommodityLiveStatus;
import nfd.g3;
import add.f;
import add.e;
import java.lang.Number;
import android.view.View;
import com.yxcorp.plugin.search.play.SearchPlayCardChecker;
import uy5.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Integer;
import com.yxcorp.plugin.search.SearchPage;
import nfd.s1;
import nfd.y0;

public class h0	// class@001db2
{
    public SearchPage a;
    public SearchSceneSource b;

    public void h0(){
       super();
    }
    public static boolean b(QPhoto p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, h0.class, "5");
       if (obj1 != patchProxyRe) {
          return obj1.booleanValue();
       }
       boolean b = false;
       if (p0 != null && p0.isLiveStream()) {
          p0 = p0.mEntity;
          obj = PatchProxy.applyOneRefs(p0, obj, j.class, "7");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else if(!p0 instanceof LiveStreamFeed){
             LiveStreamFeed mConfig = p0.mConfig;
             if (mConfig == null || (mConfig.mStreamType != StreamType.AUDIO.toInt() && p0.mConfig.mStreamType != StreamType.VOICEPARTY.toInt())) {
                b = true;
             }
          }
       }
       return b;
    }
    public static boolean c(h p0,SearchItem p1){
       SearchItem obj = PatchProxy.applyTwoRefs(p0, p1, null, h0.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p1.mItemType == SearchItem$SearchItemType.LIVE_STREAM) {
          obj = p1.mGoods;
          if (obj != null) {
             if (obj.mStatus == CommodityLiveStatus.ON_LIVE.mStatus && h0.b(p1.mPhoto)) {
                b = true;
             }
             return b;
          }
       }
       if (g3.u(p0, p1)) {
          return h0.b(p1.mGoods.mLivePhoto);
       }else if(p1.mPhoto == null || f.a(p1) != e.l){
          return b;
       }else {
          return h0.b(p1.mPhoto);
       }
    }
    public static int e(SearchItem p0){
       SearchItem obj = PatchProxy.applyOneRefs(p0, null, h0.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (p0 != null) {
          obj = p0.mPhoto;
          if (obj != null && obj.getLivePlayConfig() != null) {
             return p0.mPhoto.getLivePlayConfig().mStreamType;
          }
       }
       return -1;
    }
    public static SearchPlayCardChecker f(SearchItem p0,View p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, h0.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null && (p1 != null && (p1.getVisibility() || !p1.getMeasuredWidth()))) {
          return SearchPlayCardChecker.NESTED_HORIZONTAL_SLIDE_ITEM;
       }
       if (p0.mKBoxItem != null) {
          return SearchPlayCardChecker.NESTED_HORIZONTAL_SLIDE_ITEM;
       }
       float f = (float)(p1.getMeasuredHeight() / p1.getMeasuredWidth());
       Object[] objArray = new Object[0];
       a.C().t("SearchPlayCardChecker", "view:"+p1.hashCode()+"   ratio:"+f, objArray);
       if (f - 0x3f800000 >= 0) {
          return SearchPlayCardChecker.VERTICAL_CARD_HALF_CHECKER;
       }
       return SearchPlayCardChecker.HORIZONTAL_CARD_CHECKER;
    }
    public boolean a(int p0,SearchItem p1){
       h0 obj;
       h0 oh0 = h0.class;
       if (PatchProxy.isSupport(oh0)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, oh0, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.a;
       boolean b = false;
       if (obj == SearchPage.LIVE) {
          if (this.d(p1) && !s1.m()) {
             b = true;
          }
          return b;
       }else if(obj == SearchPage.AGGREGATE){
          int i = y0.t();
          if (y0.w() != 1 && (i == 1 || i == 2)) {
             b = true;
          }
          return b;
       }else if(obj == SearchPage.COMMODITY){
          return this.d(p1);
       }else {
          return b;
       }
    }
    public final boolean d(SearchItem p0){
       int b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       h0 oh0 = h0.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, oh0, "2");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       Object obj1 = PatchProxy.applyOneRefs(p0, null, oh0, "3");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          b = h0.e(p0);
          b = (b == StreamType.VOICEPARTY.toInt() || b == StreamType.AUDIO.toInt())? 1: 0;
       }
       return (b ^ 1);
    }
    public void g(SearchPage p0){
       this.a = p0;
    }
}
