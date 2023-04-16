package com.kwai.feature.api.live.service.show.comments.sendcomment.CustomerServiceCommentInfo;
import com.smile.gifmaker.mvps.utils.DefaultObservable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import xl8.d;
import java.lang.Integer;

public class CustomerServiceCommentInfo extends DefaultObservable	// class@001014
{
    public boolean mIsSelected;
    public int mStyle;
    public static final long serialVersionUID = 0x5e7c69a012d273e3;

    public void CustomerServiceCommentInfo(){
       super();
    }
    public void reset(){
       this.mIsSelected = false;
       this.mStyle = 1;
    }
    public void setSelected(boolean p0){
       if (PatchProxy.isSupport(CustomerServiceCommentInfo.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, CustomerServiceCommentInfo.class, "1")) {
          return;
       }
       if (this.mIsSelected == p0) {
          return;
       }
       this.mIsSelected = p0;
       this.notifyChanged();
       return;
    }
    public void setStyle(int p0){
       if (PatchProxy.isSupport(CustomerServiceCommentInfo.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, CustomerServiceCommentInfo.class, "2")) {
          return;
       }
       if (this.mStyle == p0) {
          return;
       }
       this.mStyle = p0;
       this.notifyChanged();
       return;
    }
}
