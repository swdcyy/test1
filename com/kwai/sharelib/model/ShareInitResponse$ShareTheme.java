package com.kwai.sharelib.model.ShareInitResponse$ShareTheme;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.sharelib.model.ShareInitResponse$ThemeElement;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class ShareInitResponse$ShareTheme implements Serializable	// class@0016f4
{
    public ShareInitResponse$ThemeAreaElement mArea;
    public ShareInitResponse$ThemeCancelElement mCancelButton;
    public ShareInitResponse$ThemeItemElement mElement;
    public ShareInitResponse$ThemePanelElement mPanel;
    public static final long serialVersionUID = 0x20d79318edfc0ee9;

    public void ShareInitResponse$ShareTheme(){
       super();
    }
    public void merge(ShareInitResponse$ShareTheme p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShareInitResponse$ShareTheme.class, "1")) {
          return;
       }
       ShareInitResponse$ShareTheme tmArea = this.mArea;
       if (tmArea != null) {
          tmArea.merge(p0.mArea);
       }else {
          this.mArea = p0.mArea;
       }
       tmArea = this.mElement;
       if (tmArea != null) {
          tmArea.merge(p0.mElement);
       }else {
          this.mElement = p0.mElement;
       }
       tmArea = this.mCancelButton;
       if (tmArea != null) {
          tmArea.merge(p0.mCancelButton);
       }else {
          this.mCancelButton = p0.mCancelButton;
       }
       tmArea = this.mPanel;
       if (tmArea != null) {
          tmArea.merge(p0.mPanel);
       }else {
          this.mPanel = p0.mPanel;
       }
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ShareInitResponse$ShareTheme.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ShareTheme{mArea="+this.mArea+", mElement="+this.mElement+", mCancelButton="+this.mCancelButton+", mPanel="+this.mPanel+'}';
    }
}
