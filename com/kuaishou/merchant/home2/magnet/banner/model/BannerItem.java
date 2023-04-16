package com.kuaishou.merchant.home2.magnet.banner.model.BannerItem;
import java.io.Serializable;
import com.kuaishou.merchant.home2.magnet.banner.model.BannerItem$a;
import nsd.u;
import java.lang.String;
import java.util.List;
import java.lang.Object;

public final class BannerItem implements Serializable	// class@0017f0
{
    public String appTraceId;
    public String bannerId;
    public String imageUrl;
    public List imageUrls;
    public String jumpUrl;
    public static final BannerItem$a Companion;
    public static final long serialVersionUID;

    static {
       BannerItem.Companion = new BannerItem$a(null);
    }
    public void BannerItem(){
       super(null, null, null, null, null, 31, null);
    }
    public void BannerItem(String p0,String p1,String p2,List p3,String p4){
       super();
       this.bannerId = p0;
       this.appTraceId = p1;
       this.imageUrl = p2;
       this.imageUrls = p3;
       this.jumpUrl = p4;
    }
    public void BannerItem(String p0,String p1,String p2,List p3,String p4,int p5,u p6){
       int i = (p5 & 0x01)? 0: p0;
       int i1 = (p5 & 0x02)? 0: p1;
       int i2 = (p5 & 0x04)? 0: p2;
       int i3 = (p5 & 0x08)? 0: p3;
       String str = (p5 & 0x10)? null: p4;
       super(i, i1, i2, i3, str);
       return;
    }
    public final String getAppTraceId(){
       return this.appTraceId;
    }
    public final String getBannerId(){
       return this.bannerId;
    }
    public final String getImageUrl(){
       return this.imageUrl;
    }
    public final List getImageUrls(){
       return this.imageUrls;
    }
    public final String getJumpUrl(){
       return this.jumpUrl;
    }
    public final void setAppTraceId(String p0){
       this.appTraceId = p0;
    }
    public final void setBannerId(String p0){
       this.bannerId = p0;
    }
    public final void setImageUrl(String p0){
       this.imageUrl = p0;
    }
    public final void setImageUrls(List p0){
       this.imageUrls = p0;
    }
    public final void setJumpUrl(String p0){
       this.jumpUrl = p0;
    }
}
