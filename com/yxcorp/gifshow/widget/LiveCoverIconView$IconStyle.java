package com.yxcorp.gifshow.widget.LiveCoverIconView$IconStyle;
import java.lang.Enum;
import lnc.a1;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;

public final class LiveCoverIconView$IconStyle extends Enum	// class@001873
{
    public final int mBackgroundColor;
    public final int mLeftIconColor;
    public final int mLeftIconHeightPx;
    public final int mLeftIconLeftMarginPx;
    public final int mRightIconHeightPx;
    public final int mTextHorizontalGoneMarginPx;
    public final float mTextSizeDp;
    public static final LiveCoverIconView$IconStyle[] $VALUES;
    public static final LiveCoverIconView$IconStyle DOUBLE_COL;
    public static final LiveCoverIconView$IconStyle SINGLE_COL;

    static {
       LiveCoverIconView$IconStyle iconStyle = new LiveCoverIconView$IconStyle("DOUBLE_COL", 0, a1.a(0x7f0602ef), a1.a(0x7f0601c3), 11.00f, 14.00f, 12.00f, 4.00f, 2.00f);
       LiveCoverIconView$IconStyle.DOUBLE_COL = v10;
       LiveCoverIconView$IconStyle iconStyle1 = new LiveCoverIconView$IconStyle("SINGLE_COL", 1, a1.a(0x7f06060a), a1.a(0x7f060753), 12.00f, 16.00f, 14.00f, 6.00f, 6.00f);
       LiveCoverIconView$IconStyle.SINGLE_COL = iconStyle;
       LiveCoverIconView$IconStyle[] iconStyleArr = new LiveCoverIconView$IconStyle[]{v10,iconStyle};
       LiveCoverIconView$IconStyle.$VALUES = iconStyleArr;
    }
    public void LiveCoverIconView$IconStyle(String p0,int p1,int p2,int p3,float p4,float p5,float p6,float p7,float p8){
       super(p0, p1);
       this.mLeftIconColor = p2;
       this.mBackgroundColor = p3;
       this.mTextSizeDp = p4;
       this.mLeftIconHeightPx = a1.e(p5);
       this.mRightIconHeightPx = a1.e(p6);
       this.mTextHorizontalGoneMarginPx = a1.e(p7);
       this.mLeftIconLeftMarginPx = a1.e(p8);
    }
    public static LiveCoverIconView$IconStyle valueOf(int p0){
       LiveCoverIconView$IconStyle iconStyle = LiveCoverIconView$IconStyle.class;
       if (PatchProxy.isSupport(iconStyle)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, iconStyle, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 < 0 || p0 >= LiveCoverIconView$IconStyle.values().length) {
          return LiveCoverIconView$IconStyle.DOUBLE_COL;
       }else {
          return LiveCoverIconView$IconStyle.values()[p0];
       }
    }
    public static LiveCoverIconView$IconStyle valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveCoverIconView$IconStyle.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveCoverIconView$IconStyle.class, p0);
    }
    public static LiveCoverIconView$IconStyle[] values(){
       Object obj = PatchProxy.apply(null, null, LiveCoverIconView$IconStyle.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveCoverIconView$IconStyle.$VALUES.clone();
    }
}
