package com.kuaishou.webkit.extension.KsWebSettings;
import java.lang.Object;
import com.kuaishou.webkit.WebSettings;
import com.kuaishou.webkit.extension.KsWebSettings$1;
import java.lang.Boolean;

public abstract class KsWebSettings	// class@0012df
{

    public void KsWebSettings(){
       super();
    }
    public static KsWebSettings get(WebSettings p0){
       return new KsWebSettings$1(p0);
    }
    public boolean getAllowUploadLoadingInfo(){
       try{
          return this.getSetting().getMiscObject(103).booleanValue();
       }catch(java.lang.Exception e0){
          return false;
       }
    }
    public abstract WebSettings getSetting();
    public boolean setAllowUploadLoadingInfo(boolean p0){
       try{
          return this.getSetting().setMiscBoolean(102, p0);
       }catch(java.lang.Exception e0){
          return false;
       }
    }
    public boolean setCustomViewVideoTagKey(int p0){
       return this.getSetting().setMiscInt(105, p0);
    }
    public boolean setVideoFullscreenRequiresUserGesture(boolean p0){
       return this.getSetting().setMiscBoolean(101, p0);
    }
}
