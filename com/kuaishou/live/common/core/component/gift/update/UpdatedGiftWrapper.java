package com.kuaishou.live.common.core.component.gift.update.UpdatedGiftWrapper;
import java.io.Serializable;
import java.util.List;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public final class UpdatedGiftWrapper implements Serializable	// class@001328
{
    public List giftIconUrls;
    public int giftId;
    public CDNUrl[] rightIconUrls;
    public CDNUrl[] sideIconUrls;
    public int tabType;

    public void UpdatedGiftWrapper(int p0,int p1,List p2,CDNUrl[] p3,CDNUrl[] p4){
       a.p(p2, "giftIconUrls");
       super();
       this.giftId = p0;
       this.tabType = p1;
       this.giftIconUrls = p2;
       this.sideIconUrls = p3;
       this.rightIconUrls = p4;
    }
    public final List getGiftIconUrls(){
       return this.giftIconUrls;
    }
    public final int getGiftId(){
       return this.giftId;
    }
    public final CDNUrl[] getRightIconUrls(){
       return this.rightIconUrls;
    }
    public final CDNUrl[] getSideIconUrls(){
       return this.sideIconUrls;
    }
    public final int getTabType(){
       return this.tabType;
    }
    public final void setGiftIconUrls(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UpdatedGiftWrapper.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.giftIconUrls = p0;
       return;
    }
    public final void setGiftId(int p0){
       this.giftId = p0;
    }
    public final void setRightIconUrls(CDNUrl[] p0){
       this.rightIconUrls = p0;
    }
    public final void setSideIconUrls(CDNUrl[] p0){
       this.sideIconUrls = p0;
    }
    public final void setTabType(int p0){
       this.tabType = p0;
    }
}
