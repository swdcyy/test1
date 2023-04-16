package com.yxcorp.gifshow.social.profile.Banner;
import java.io.Serializable;
import com.yxcorp.gifshow.social.profile.Banner$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class Banner implements Serializable	// class@001d65
{
    public final String backgroundImage;
    public final String buttonLinkUrl;
    public final String buttonTitle;
    public final String icon;
    public final String subTitle;
    public final String title;
    public static final Banner$a Companion;
    public static final long serialVersionUID;

    static {
       Banner.Companion = new Banner$a(null);
    }
    public void Banner(String p0,String p1,String p2,String p3,String p4,String p5){
       a.p(p0, "icon");
       a.p(p1, "title");
       a.p(p2, "subTitle");
       a.p(p3, "backgroundImage");
       a.p(p4, "buttonTitle");
       a.p(p5, "buttonLinkUrl");
       super();
       this.icon = p0;
       this.title = p1;
       this.subTitle = p2;
       this.backgroundImage = p3;
       this.buttonTitle = p4;
       this.buttonLinkUrl = p5;
    }
    public static Banner copy$default(Banner p0,String p1,String p2,String p3,String p4,String p5,String p6,int p7,Object p8){
       Banner icon;
       Banner title;
       Banner subTitle;
       Banner backgroundIm;
       Banner buttonTitle;
       Banner buttonLinkUr;
       if (p7 & 0x01) {
          icon = p0.icon;
       }
       if (p7 & 0x02) {
          title = p0.title;
       }
       p8 = title;
       if (p7 & 0x04) {
          subTitle = p0.subTitle;
       }
       Banner uBanner = subTitle;
       if (p7 & 0x08) {
          backgroundIm = p0.backgroundImage;
       }
       Banner uBanner1 = backgroundIm;
       if (p7 & 0x10) {
          buttonTitle = p0.buttonTitle;
       }
       Banner uBanner2 = buttonTitle;
       if (p7 & 0x20) {
          buttonLinkUr = p0.buttonLinkUrl;
       }
       return p0.copy(icon, p8, uBanner, uBanner1, uBanner2, buttonLinkUr);
    }
    public final String component1(){
       return this.icon;
    }
    public final String component2(){
       return this.title;
    }
    public final String component3(){
       return this.subTitle;
    }
    public final String component4(){
       return this.backgroundImage;
    }
    public final String component5(){
       return this.buttonTitle;
    }
    public final String component6(){
       return this.buttonLinkUrl;
    }
    public final Banner copy(String p0,String p1,String p2,String p3,String p4,String p5){
       Object obj;
       if (PatchProxy.isSupport(Banner.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5};
          obj = PatchProxy.apply(objArray, this, Banner.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "icon");
       a.p(p1, "title");
       a.p(p2, "subTitle");
       a.p(p3, "backgroundImage");
       a.p(p4, "buttonTitle");
       a.p(p5, "buttonLinkUrl");
       Banner uBanner = new Banner(p0, p1, p2, p3, p4, p5);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, Banner.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof Banner && (a.g(this.icon, p0.icon) && (a.g(this.title, p0.title) && (a.g(this.subTitle, p0.subTitle) && (a.g(this.backgroundImage, p0.backgroundImage) && (a.g(this.buttonTitle, p0.buttonTitle) && a.g(this.buttonLinkUrl, p0.buttonLinkUrl)))))))) {
          return true;
       }
       return false;
    }
    public final String getBackgroundImage(){
       return this.backgroundImage;
    }
    public final String getButtonLinkUrl(){
       return this.buttonLinkUrl;
    }
    public final String getButtonTitle(){
       return this.buttonTitle;
    }
    public final String getIcon(){
       return this.icon;
    }
    public final String getSubTitle(){
       return this.subTitle;
    }
    public final String getTitle(){
       return this.title;
    }
    public int hashCode(){
       Banner obj = PatchProxy.apply(null, this, Banner.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.icon;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       Banner ttitle = this.title;
       int i2 = (ttitle != null)? ttitle.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttitle = this.subTitle;
       i2 = (ttitle != null)? ttitle.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttitle = this.backgroundImage;
       i2 = (ttitle != null)? ttitle.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttitle = this.buttonTitle;
       i2 = (ttitle != null)? ttitle.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttitle = this.buttonLinkUrl;
       if (ttitle != null) {
          i = ttitle.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, Banner.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Banner\(icon="+this.icon+", title="+this.title+", subTitle="+this.subTitle+", backgroundImage="+this.backgroundImage+", buttonTitle="+this.buttonTitle+", buttonLinkUrl="+this.buttonLinkUrl+"\)";
    }
}
