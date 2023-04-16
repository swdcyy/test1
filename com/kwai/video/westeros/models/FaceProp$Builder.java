package com.kwai.video.westeros.models.FaceProp$Builder;
import com.kwai.video.westeros.models.FacePropOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.FaceProp;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.FaceProp$1;

public final class FaceProp$Builder extends GeneratedMessageLite$Builder implements FacePropOrBuilder	// class@000f65
{

    public void FaceProp$Builder(){
       super(FaceProp.DEFAULT_INSTANCE);
    }
    public void FaceProp$Builder(FaceProp$1 p0){
       super();
    }
    public FaceProp$Builder clearDataFlag(){
       this.copyOnWrite();
       this.instance.clearDataFlag();
       return this;
    }
    public FaceProp$Builder clearHasGlass(){
       this.copyOnWrite();
       this.instance.clearHasGlass();
       return this;
    }
    public FaceProp$Builder clearIsMale(){
       this.copyOnWrite();
       this.instance.clearIsMale();
       return this;
    }
    public int getDataFlag(){
       return this.instance.getDataFlag();
    }
    public boolean getHasGlass(){
       return this.instance.getHasGlass();
    }
    public boolean getIsMale(){
       return this.instance.getIsMale();
    }
    public FaceProp$Builder setDataFlag(int p0){
       this.copyOnWrite();
       this.instance.setDataFlag(p0);
       return this;
    }
    public FaceProp$Builder setHasGlass(boolean p0){
       this.copyOnWrite();
       this.instance.setHasGlass(p0);
       return this;
    }
    public FaceProp$Builder setIsMale(boolean p0){
       this.copyOnWrite();
       this.instance.setIsMale(p0);
       return this;
    }
}
