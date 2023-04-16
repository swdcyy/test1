package com.kuaishou.edit.draft.CustomTextStyle$b;
import z30.s;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.CustomTextStyle;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.CustomTextStyle$a;
import java.lang.String;
import com.google.protobuf.ByteString;

public final class CustomTextStyle$b extends GeneratedMessageLite$Builder implements s	// class@001765
{

    public void CustomTextStyle$b(){
       super(CustomTextStyle.DEFAULT_INSTANCE);
    }
    public void CustomTextStyle$b(CustomTextStyle$a p0){
       super(CustomTextStyle.DEFAULT_INSTANCE);
    }
    public CustomTextStyle$b a(String p0){
       this.copyOnWrite();
       this.instance.setBackgroundColorKey(p0);
       return this;
    }
    public CustomTextStyle$b b(String p0){
       this.copyOnWrite();
       this.instance.setFillColorKey(p0);
       return this;
    }
    public CustomTextStyle$b c(String p0){
       this.copyOnWrite();
       this.instance.setShadowColorKey(p0);
       return this;
    }
    public CustomTextStyle$b d(String p0){
       this.copyOnWrite();
       this.instance.setStrokeColorKey(p0);
       return this;
    }
    public CustomTextStyle$b e(int p0){
       this.copyOnWrite();
       this.instance.setTextAlign(p0);
       return this;
    }
    public CustomTextStyle$b f(int p0){
       this.copyOnWrite();
       this.instance.setTextMode(p0);
       return this;
    }
    public String getBackgroundColorKey(){
       return this.instance.getBackgroundColorKey();
    }
    public ByteString getBackgroundColorKeyBytes(){
       return this.instance.getBackgroundColorKeyBytes();
    }
    public String getFillColorKey(){
       return this.instance.getFillColorKey();
    }
    public ByteString getFillColorKeyBytes(){
       return this.instance.getFillColorKeyBytes();
    }
    public String getShadowColorKey(){
       return this.instance.getShadowColorKey();
    }
    public ByteString getShadowColorKeyBytes(){
       return this.instance.getShadowColorKeyBytes();
    }
    public String getStrokeColorKey(){
       return this.instance.getStrokeColorKey();
    }
    public ByteString getStrokeColorKeyBytes(){
       return this.instance.getStrokeColorKeyBytes();
    }
    public int getTextAlign(){
       return this.instance.getTextAlign();
    }
    public int getTextMode(){
       return this.instance.getTextMode();
    }
}
