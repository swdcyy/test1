package com.kuaishou.live.common.core.component.Interactiveprotocol.LiveInteractivePromptDialogInfo;
import java.io.Serializable;
import java.lang.Cloneable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.AssertionError;

public class LiveInteractivePromptDialogInfo implements Serializable, Cloneable	// class@000f3f
{
    public String mContent;
    public boolean mNeedShow;
    public boolean mShowed;
    public String mTitle;
    public static final long serialVersionUID = 0x751da22b93248a0e;

    public void LiveInteractivePromptDialogInfo(){
       super();
    }
    public LiveInteractivePromptDialogInfo clone(){
       Object obj = PatchProxy.apply(null, this, LiveInteractivePromptDialogInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          return super.clone();
       }catch(java.lang.CloneNotSupportedException e0){
          throw new AssertionError();
       }
    }
    public Object clone(){
       return this.clone();
    }
}
