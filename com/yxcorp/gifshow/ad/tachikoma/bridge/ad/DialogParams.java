package com.yxcorp.gifshow.ad.tachikoma.bridge.ad.DialogParams;
import java.io.Serializable;
import com.yxcorp.gifshow.ad.tachikoma.bridge.ad.DialogParams$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;

public final class DialogParams implements Serializable	// class@001812
{
    public final int dialogType;
    public final String templateId;
    public static final DialogParams$a Companion;
    public static final long serialVersionUID;

    static {
       DialogParams.Companion = new DialogParams$a(null);
    }
    public void DialogParams(int p0,String p1){
       super();
       this.dialogType = p0;
       this.templateId = p1;
    }
    public void DialogParams(int p0,String p1,int p2,u p3){
       if (p2 & 0x01) {
          p0 = 0;
       }
       super(p0, p1);
       return;
    }
    public final int getDialogType(){
       return this.dialogType;
    }
    public final String getTemplateId(){
       return this.templateId;
    }
}
