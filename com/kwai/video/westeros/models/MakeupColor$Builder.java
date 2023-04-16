package com.kwai.video.westeros.models.MakeupColor$Builder;
import com.kwai.video.westeros.models.MakeupColorOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.MakeupColor;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.MakeupColor$1;

public final class MakeupColor$Builder extends GeneratedMessageLite$Builder implements MakeupColorOrBuilder	// class@000f9e
{

    public void MakeupColor$Builder(){
       super(MakeupColor.DEFAULT_INSTANCE);
    }
    public void MakeupColor$Builder(MakeupColor$1 p0){
       super();
    }
    public MakeupColor$Builder clearColorA(){
       this.copyOnWrite();
       this.instance.clearColorA();
       return this;
    }
    public MakeupColor$Builder clearColorB(){
       this.copyOnWrite();
       this.instance.clearColorB();
       return this;
    }
    public MakeupColor$Builder clearColorG(){
       this.copyOnWrite();
       this.instance.clearColorG();
       return this;
    }
    public MakeupColor$Builder clearColorR(){
       this.copyOnWrite();
       this.instance.clearColorR();
       return this;
    }
    public float getColorA(){
       return this.instance.getColorA();
    }
    public float getColorB(){
       return this.instance.getColorB();
    }
    public float getColorG(){
       return this.instance.getColorG();
    }
    public float getColorR(){
       return this.instance.getColorR();
    }
    public MakeupColor$Builder setColorA(float p0){
       this.copyOnWrite();
       this.instance.setColorA(p0);
       return this;
    }
    public MakeupColor$Builder setColorB(float p0){
       this.copyOnWrite();
       this.instance.setColorB(p0);
       return this;
    }
    public MakeupColor$Builder setColorG(float p0){
       this.copyOnWrite();
       this.instance.setColorG(p0);
       return this;
    }
    public MakeupColor$Builder setColorR(float p0){
       this.copyOnWrite();
       this.instance.setColorR(p0);
       return this;
    }
}
