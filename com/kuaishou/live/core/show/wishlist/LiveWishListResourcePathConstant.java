package com.kuaishou.live.core.show.wishlist.LiveWishListResourcePathConstant;
import l12.d;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveWishListResourcePathConstant extends Enum implements d	// class@0012cf
{
    public final String resourceName;
    public final String resourcePath;
    public static final LiveWishListResourcePathConstant[] $VALUES;
    public static final LiveWishListResourcePathConstant LIVE_ICON_WISH_M_NORMAL;
    public static final LiveWishListResourcePathConstant LIVE_MORE_BUTTON_WISH_NORMAL;
    public static final LiveWishListResourcePathConstant LIVE_MORE_BUTTON_WISH_SELECTED;
    public static final LiveWishListResourcePathConstant LIVE_WISH_LIST_DEFAULT_ICON;
    public static final LiveWishListResourcePathConstant LIVE_WISH_LIST_DETAIL_WISH_GIFT_MORE_GIFT_COMPLETE_ICON;
    public static final LiveWishListResourcePathConstant LIVE_WISH_LIST_DETAIL_WISH_GIFT_ONE_GIFT_COMPLETE_ICON;
    public static final LiveWishListResourcePathConstant LIVE_WISH_LIST_SPONSOR_EMPTY;

    static {
       LiveWishListResourcePathConstant liveWishList1;
       LiveWishListResourcePathConstant[] liveWishList = new LiveWishListResourcePathConstant[]{liveWishList1,liveWishList1,liveWishList1,liveWishList1,liveWishList1,liveWishList1,liveWishList1};
       liveWishList1 = new LiveWishListResourcePathConstant("LIVE_WISH_LIST_SPONSOR_EMPTY", 0, "LIVE_WISH_LIST_SPONSOR_EMPTY", "udata/pkg/kwai-client-image/live_revenue_gift/live_wish_list_sponsor_empty.webp");
       LiveWishListResourcePathConstant.LIVE_WISH_LIST_SPONSOR_EMPTY = liveWishList1;
       liveWishList1 = new LiveWishListResourcePathConstant("LIVE_WISH_LIST_DETAIL_WISH_GIFT_ONE_GIFT_COMPLETE_ICON", 1, "LIVE_WISH_LIST_DETAIL_WISH_GIFT_ONE_GIFT_COMPLETE_ICON", "udata/pkg/kwai-client-image/live_revenue_gift/live_wish_list_deatil_wish_gift_one_gift_complete_icon.webp");
       LiveWishListResourcePathConstant.LIVE_WISH_LIST_DETAIL_WISH_GIFT_ONE_GIFT_COMPLETE_ICON = liveWishList1;
       liveWishList1 = new LiveWishListResourcePathConstant("LIVE_WISH_LIST_DETAIL_WISH_GIFT_MORE_GIFT_COMPLETE_ICON", 2, "LIVE_WISH_LIST_DETAIL_WISH_GIFT_MORE_GIFT_COMPLETE_ICON", "udata/pkg/kwai-client-image/live_revenue_gift/live_wish_list_deatil_wish_gift_more_gift_complete_icon.webp");
       LiveWishListResourcePathConstant.LIVE_WISH_LIST_DETAIL_WISH_GIFT_MORE_GIFT_COMPLETE_ICON = liveWishList1;
       liveWishList1 = new LiveWishListResourcePathConstant("LIVE_MORE_BUTTON_WISH_NORMAL", 3, "LIVE_MORE_BUTTON_WISH_NORMAL", "udata/pkg/kwai-client-image/live_revenue_gift/live_more_button_wish_normal.webp");
       LiveWishListResourcePathConstant.LIVE_MORE_BUTTON_WISH_NORMAL = liveWishList1;
       liveWishList1 = new LiveWishListResourcePathConstant("LIVE_MORE_BUTTON_WISH_SELECTED", 4, "LIVE_MORE_BUTTON_WISH_SELECTED", "udata/pkg/kwai-client-image/live_revenue_gift/live_more_button_wish_selected.webp");
       LiveWishListResourcePathConstant.LIVE_MORE_BUTTON_WISH_SELECTED = liveWishList1;
       liveWishList1 = new LiveWishListResourcePathConstant("LIVE_WISH_LIST_DEFAULT_ICON", 5, "LIVE_WISH_LIST_DEFAULT_ICON", "udata/pkg/kwai-client-image/live_revenue_gift/live_wish_list_default_icon.webp");
       LiveWishListResourcePathConstant.LIVE_WISH_LIST_DEFAULT_ICON = liveWishList1;
       liveWishList1 = new LiveWishListResourcePathConstant("LIVE_ICON_WISH_M_NORMAL", 6, "LIVE_ICON_WISH_M_NORMAL", "udata/pkg/kwai-client-image/live_revenue_gift/live_icon_wish_m_normal.webp");
       LiveWishListResourcePathConstant.LIVE_ICON_WISH_M_NORMAL = liveWishList1;
       LiveWishListResourcePathConstant.$VALUES = liveWishList;
    }
    public void LiveWishListResourcePathConstant(String p0,int p1,String p2,String p3){
       super(p0, p1);
       this.resourceName = p2;
       this.resourcePath = p3;
    }
    public static LiveWishListResourcePathConstant valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveWishListResourcePathConstant.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveWishListResourcePathConstant.class, p0);
    }
    public static LiveWishListResourcePathConstant[] values(){
       Object obj = PatchProxy.apply(null, null, LiveWishListResourcePathConstant.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveWishListResourcePathConstant.$VALUES.clone();
    }
    public String getResourceName(){
       return this.resourceName;
    }
    public String getResourcePath(){
       return this.resourcePath;
    }
}
