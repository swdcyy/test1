package com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupItem;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.model.OperationMaskTag;

public abstract class MakeupItem extends MagicBaseConfig	// class@0012f8
{
    public int b;
    public OperationMaskTag mOperationMaskTag;

    public void MakeupItem(){
       super();
       this.b = 0;
    }
    public void MakeupItem(String p0){
       super(p0);
       this.b = 0;
    }
    public static boolean isValid(MakeupItem p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MakeupItem.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && p0.isValid())? true: false;
       return b;
    }
    public void copyFrom(MagicBaseConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MakeupItem.class, "1")) {
          return;
       }
       super.copyFrom(p0);
       if (p0.isMakeup()) {
          return;
       }
       this.mOperationMaskTag = p0.mOperationMaskTag;
       return;
    }
    public String getBottomMaskColor(){
       MakeupItem tmOperationM = this.mOperationMaskTag;
       String str = (tmOperationM == null)? "": tmOperationM.color;
       return str;
    }
    public String getBottomMaskText(){
       MakeupItem tmOperationM = this.mOperationMaskTag;
       String str = (tmOperationM == null)? "": tmOperationM.text;
       return str;
    }
    public String getBottomMastSecondColor(){
       MakeupItem tmOperationM = this.mOperationMaskTag;
       String str = (tmOperationM == null)? "": tmOperationM.secondColor;
       return str;
    }
    public int getPosition(){
       return this.b;
    }
    public boolean isMakeup(){
       return true;
    }
    public boolean isValid(){
       boolean b = (this.mPassThroughParams != null)? true: false;
       return b;
    }
    public void setPosition(int p0){
       this.b = p0;
    }
}
