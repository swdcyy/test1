package com.kuaishou.edit.draft.EditConfig$b;
import z30.y;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.EditConfig;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.EditConfig$a;
import java.lang.String;
import com.google.protobuf.ByteString;

public final class EditConfig$b extends GeneratedMessageLite$Builder implements y	// class@001777
{

    public void EditConfig$b(){
       super(EditConfig.DEFAULT_INSTANCE);
    }
    public void EditConfig$b(EditConfig$a p0){
       super(EditConfig.DEFAULT_INSTANCE);
    }
    public EditConfig$b a(boolean p0){
       this.copyOnWrite();
       this.instance.setDisableRecover(p0);
       return this;
    }
    public boolean getDisableAddImage(){
       return this.instance.getDisableAddImage();
    }
    public boolean getDisableMoment(){
       return this.instance.getDisableMoment();
    }
    public boolean getDisableNextStep(){
       return this.instance.getDisableNextStep();
    }
    public boolean getDisableRecover(){
       return this.instance.getDisableRecover();
    }
    public String getMomentButtonText(){
       return this.instance.getMomentButtonText();
    }
    public ByteString getMomentButtonTextBytes(){
       return this.instance.getMomentButtonTextBytes();
    }
    public String getSegmentIconTitle(){
       return this.instance.getSegmentIconTitle();
    }
    public ByteString getSegmentIconTitleBytes(){
       return this.instance.getSegmentIconTitleBytes();
    }
}
