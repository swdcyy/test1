package com.yxcorp.gifshow.ad.award.flow.model.NeoTaskStatusResponse$CardLiveBanner;
import java.io.Serializable;
import com.yxcorp.gifshow.ad.award.flow.model.NeoTaskStatusResponse$CardLiveBanner$a;
import nsd.u;
import java.lang.String;
import java.lang.Boolean;
import java.lang.Object;

public final class NeoTaskStatusResponse$CardLiveBanner implements Serializable	// class@001501
{
    public final String actionBar;
    public final String content;
    public final Boolean display;
    public final String icon;
    public final String jumpUrl;
    public final int linkType;
    public final int style;
    public static final NeoTaskStatusResponse$CardLiveBanner$a Companion;
    public static final long serialVersionUID;

    static {
       NeoTaskStatusResponse$CardLiveBanner.Companion = new NeoTaskStatusResponse$CardLiveBanner$a(null);
    }
    public void NeoTaskStatusResponse$CardLiveBanner(String p0,int p1,String p2,String p3,String p4,Boolean p5,int p6){
       super();
       this.content = p0;
       this.style = p1;
       this.actionBar = p2;
       this.jumpUrl = p3;
       this.icon = p4;
       this.display = p5;
       this.linkType = p6;
    }
    public void NeoTaskStatusResponse$CardLiveBanner(String p0,int p1,String p2,String p3,String p4,Boolean p5,int p6,int p7,u p8){
       int i = (p7 & 0x02)? 1: p1;
       int i1 = (p7 & 0x40)? 1: p6;
       super(p0, i, p2, p3, p4, p5, i1);
       return;
    }
    public final String getActionBar(){
       return this.actionBar;
    }
    public final String getContent(){
       return this.content;
    }
    public final Boolean getDisplay(){
       return this.display;
    }
    public final String getIcon(){
       return this.icon;
    }
    public final String getJumpUrl(){
       return this.jumpUrl;
    }
    public final int getLinkType(){
       return this.linkType;
    }
    public final int getStyle(){
       return this.style;
    }
}
