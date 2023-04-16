package com.kwai.feature.post.api.componet.prettify.beauty.RecoBeautifyConfig;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifyConfig;
import java.util.ArrayList;
import com.kwai.feature.post.api.componet.prettify.beauty.ItemNameStyle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.lang.Number;
import java.util.Collection;

public class RecoBeautifyConfig extends BeautifyConfig	// class@0012e5
{
    public boolean mIsLastConfig;
    public final List mRecoConfigList;
    public int mSelectIndex;

    public void RecoBeautifyConfig(){
       super();
       this.mRecoConfigList = new ArrayList();
       this.mSelectIndex = -1;
       this.mIsLastConfig = false;
       this.mId = -12;
       ItemNameStyle itemNameStyl = new ItemNameStyle();
       this.mItemNameStyle = itemNameStyl;
       itemNameStyl.mTextColor = "#FFFFFF";
       itemNameStyl.mBackgroundColor = "#1A000000";
       itemNameStyl.a = false;
    }
    public static ItemNameStyle getRecoItemNameStyle(){
       ItemNameStyle obj = PatchProxy.apply(null, null, RecoBeautifyConfig.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ItemNameStyle();
       obj.mTextColor = "#FFFFFF";
       obj.mBackgroundColor = "#F73B68";
       obj.a = false;
       return obj;
    }
    public BeautifyConfig clone(){
       return this;
    }
    public Object clone(){
       return this.clone();
    }
    public BeautifyConfig getCurrentConfig(){
       Object[] objArray = null;
       RecoBeautifyConfig obj = PatchProxy.apply(objArray, this, RecoBeautifyConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mSelectIndex;
       if (obj < null || obj > (this.mRecoConfigList.size() - 1)) {
          return objArray;
       }
       return this.mRecoConfigList.get(this.mSelectIndex);
    }
    public BeautifyConfig getNextConfig(){
       Object obj = PatchProxy.apply(null, this, RecoBeautifyConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = this.mSelectIndex + 1;
       this.mSelectIndex = i;
       if (i >= this.mRecoConfigList.size()) {
          this.mSelectIndex = 0;
       }
       return this.getCurrentConfig();
    }
    public int getRecoSize(){
       Object obj = PatchProxy.apply(null, this, RecoBeautifyConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.mRecoConfigList.size();
    }
    public int getSelectIndex(){
       return this.mSelectIndex;
    }
    public boolean isLastConfig(){
       return this.mIsLastConfig;
    }
    public void setLastConfig(BeautifyConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecoBeautifyConfig.class, "5")) {
          return;
       }
       if (this.mRecoConfigList.size() <= 0 && p0 != null) {
          this.mRecoConfigList.add(p0);
          this.mSelectIndex = 0;
          this.mIsLastConfig = true;
       }
       return;
    }
    public void setRecoConfigList(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecoBeautifyConfig.class, "1")) {
          return;
       }
       if (this.mIsLastConfig != null) {
          this.mRecoConfigList.addAll(p0);
          this.mIsLastConfig = false;
       }else {
          this.mRecoConfigList.clear();
          this.mRecoConfigList.addAll(p0);
          this.mSelectIndex = -1;
       }
       return;
    }
    public void setSelectIndex(int p0){
       this.mSelectIndex = p0;
    }
}
