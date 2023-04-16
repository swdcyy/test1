package com.kwai.sharelib.model.ShareInitResponse$ThemeElement;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.reflect.Field;
import java.lang.IllegalAccessException;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class ShareInitResponse$ThemeElement implements Serializable	// class@0016f7
{
    public String mBackgroundColour;
    public Integer mCornerRadius;
    public String mFontColour;
    public Integer mFontSize;
    public String mHighlightedBackgroundColour;
    public Integer mMinFontSize;
    public String mSeparatorColour;
    public static final long serialVersionUID = 0x32599366ddf5b847;

    public void ShareInitResponse$ThemeElement(){
       super();
    }
    public void merge(ShareInitResponse$ThemeElement p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShareInitResponse$ThemeElement.class, "1")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       Field[] fields = ShareInitResponse$ThemeElement.class.getFields();
       int len = fields.length;
       int i = 0;
       while (i < len) {
          object oobject = fields[i];
          try{
             Object obj = oobject.get(p0);
             if (oobject.get(this) == null) {
                oobject.set(this, obj);
             }
          }catch(java.lang.IllegalAccessException e3){
             e3.printStackTrace();
          }
          i = i + 1;
       }
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ShareInitResponse$ThemeElement.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ThemeElement{mFontSize="+this.mFontSize+", mFontColour=\'"+this.mFontColour+'''+", mMinFontSize="+this.mMinFontSize+", mBackgroundColour=\'"+this.mBackgroundColour+'''+", mHighlightedBackgroundColour=\'"+this.mHighlightedBackgroundColour+'''+", mSeparatorColour=\'"+this.mSeparatorColour+'''+", mCornerRadius="+this.mCornerRadius+'}';
    }
}
