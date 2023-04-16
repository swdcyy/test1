package com.kwai.feature.api.feed.home.menu.SidebarMenuItem;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ok.k;
import java.lang.Number;
import java.lang.StringBuilder;

public class SidebarMenuItem implements Serializable	// class@000f12
{
    public int mColor;
    public boolean mFixedOvert;
    public String mIconUrl;
    public String mId;
    public boolean mIsScan;
    public String mKsOrderId;
    public String mLinkUrl;
    public boolean mOnlyTeenageModeEnable;
    public boolean mOvert;
    public String mRedDotKsOrderId;
    public int mRedDotType;
    public String mSfIconUrl;
    public boolean mShown;
    public boolean mTeenagerEnable;
    public String mTeenagerModeLinkUrl;
    public String mTitle;
    public static final long serialVersionUID = 0xa597d13d8f87fc0c;

    public void SidebarMenuItem(String p0,String p1,String p2,String p3,String p4,boolean p5){
       super();
       this.mIsScan = false;
       this.mId = p0;
       this.mTitle = p1;
       this.mIconUrl = p2;
       this.mSfIconUrl = p3;
       this.mLinkUrl = p4;
       this.mTeenagerEnable = p5;
    }
    public SidebarMenuItem deepClone(){
       Object obj = PatchProxy.apply(null, this, SidebarMenuItem.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       SidebarMenuItem sidebarMenuI = new SidebarMenuItem(this.mId, this.mTitle, this.mIconUrl, this.mSfIconUrl, this.mLinkUrl, this.mTeenagerEnable);
       obj.mRedDotType = this.mRedDotType;
       obj.mOvert = this.mOvert;
       obj.mColor = this.mColor;
       obj.mTeenagerModeLinkUrl = this.mTeenagerModeLinkUrl;
       obj.mKsOrderId = this.mKsOrderId;
       obj.mRedDotKsOrderId = this.mRedDotKsOrderId;
       obj.mOnlyTeenageModeEnable = this.mOnlyTeenageModeEnable;
       obj.mFixedOvert = this.mFixedOvert;
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SidebarMenuItem.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 instanceof SidebarMenuItem) {
          return k.a(p0.mId, this.mId);
       }
       return super.equals(p0);
    }
    public int hashCode(){
       Object[] obj = PatchProxy.apply(null, this, SidebarMenuItem.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new Object[]{this.mId};
       return k.b(obj);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, SidebarMenuItem.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "SidebarMenuItem{mId=\'"+this.mId+'''+", mTitle=\'"+this.mTitle+'''+", mTeenagerEnable="+this.mTeenagerEnable+", mOnlyTeenageModeEnable="+this.mOnlyTeenageModeEnable+", mIconUrl=\'"+this.mIconUrl+'''+", mSfIconUrl=\'"+this.mSfIconUrl+'''+", mLinkUrl=\'"+this.mLinkUrl+'''+", mTeenagerModeLinkUrl=\'"+this.mTeenagerModeLinkUrl+'''+", mKsOrderId=\'"+this.mKsOrderId+'''+", mRedDotKsOrderId=\'"+this.mRedDotKsOrderId+'''+", mRedDotType="+this.mRedDotType+", mColor="+this.mColor+", mOvert="+this.mOvert+", mShown="+this.mShown+", mFixedOvert="+this.mFixedOvert+'}';
    }
}
