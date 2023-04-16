package com.kuaishou.merchant.marketing.shop.ginsengfruit.model.BaseDialogConfig;
import java.io.Serializable;
import com.kuaishou.merchant.marketing.shop.ginsengfruit.model.BaseDialogConfig$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import java.util.List;

public class BaseDialogConfig implements Serializable	// class@001bdf
{
    public boolean autoReceive;
    public long autoReceiveDelayTime;
    public String failButtonText;
    public List failImageUrl;
    public String jumpUrl;
    public String receiveButtonText;
    public long receiveCouponFailDisplayTime;
    public List receiveCouponFailImageUrl;
    public String receiveCouponFailSubTitle;
    public String receiveCouponFailTitle;
    public String title;
    public static final BaseDialogConfig$a Companion;
    public static final long serialVersionUID;

    static {
       BaseDialogConfig.Companion = new BaseDialogConfig$a(null);
    }
    public void BaseDialogConfig(){
       super();
       this.receiveCouponFailDisplayTime = 3000;
       this.autoReceiveDelayTime = 5000;
    }
    public final boolean getAutoReceive(){
       return this.autoReceive;
    }
    public final long getAutoReceiveDelayTime(){
       return this.autoReceiveDelayTime;
    }
    public final String getFailButtonText(){
       return this.failButtonText;
    }
    public final List getFailImageUrl(){
       return this.failImageUrl;
    }
    public final String getJumpUrl(){
       return this.jumpUrl;
    }
    public final String getReceiveButtonText(){
       return this.receiveButtonText;
    }
    public final long getReceiveCouponFailDisplayTime(){
       return this.receiveCouponFailDisplayTime;
    }
    public final List getReceiveCouponFailImageUrl(){
       return this.receiveCouponFailImageUrl;
    }
    public final String getReceiveCouponFailSubTitle(){
       return this.receiveCouponFailSubTitle;
    }
    public final String getReceiveCouponFailTitle(){
       return this.receiveCouponFailTitle;
    }
    public final String getTitle(){
       return this.title;
    }
    public final void setAutoReceive(boolean p0){
       this.autoReceive = p0;
    }
    public final void setAutoReceiveDelayTime(long p0){
       this.autoReceiveDelayTime = p0;
    }
    public final void setFailButtonText(String p0){
       this.failButtonText = p0;
    }
    public final void setFailImageUrl(List p0){
       this.failImageUrl = p0;
    }
    public final void setJumpUrl(String p0){
       this.jumpUrl = p0;
    }
    public final void setReceiveButtonText(String p0){
       this.receiveButtonText = p0;
    }
    public final void setReceiveCouponFailDisplayTime(long p0){
       this.receiveCouponFailDisplayTime = p0;
    }
    public final void setReceiveCouponFailImageUrl(List p0){
       this.receiveCouponFailImageUrl = p0;
    }
    public final void setReceiveCouponFailSubTitle(String p0){
       this.receiveCouponFailSubTitle = p0;
    }
    public final void setReceiveCouponFailTitle(String p0){
       this.receiveCouponFailTitle = p0;
    }
    public final void setTitle(String p0){
       this.title = p0;
    }
}
