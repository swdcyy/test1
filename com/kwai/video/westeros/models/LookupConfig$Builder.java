package com.kwai.video.westeros.models.LookupConfig$Builder;
import com.kwai.video.westeros.models.LookupConfigOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.LookupConfig;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.LookupConfig$1;
import java.lang.String;
import com.google.protobuf.ByteString;

public final class LookupConfig$Builder extends GeneratedMessageLite$Builder implements LookupConfigOrBuilder	// class@000f9a
{

    public void LookupConfig$Builder(){
       super(LookupConfig.DEFAULT_INSTANCE);
    }
    public void LookupConfig$Builder(LookupConfig$1 p0){
       super();
    }
    public LookupConfig$Builder clearDimension(){
       this.copyOnWrite();
       this.instance.clearDimension();
       return this;
    }
    public LookupConfig$Builder clearFilterId(){
       this.copyOnWrite();
       this.instance.clearFilterId();
       return this;
    }
    public LookupConfig$Builder clearIntensity(){
       this.copyOnWrite();
       this.instance.clearIntensity();
       return this;
    }
    public LookupConfig$Builder clearName(){
       this.copyOnWrite();
       this.instance.clearName();
       return this;
    }
    public LookupConfig$Builder clearType(){
       this.copyOnWrite();
       this.instance.clearType();
       return this;
    }
    public float getDimension(){
       return this.instance.getDimension();
    }
    public int getFilterId(){
       return this.instance.getFilterId();
    }
    public float getIntensity(){
       return this.instance.getIntensity();
    }
    public String getName(){
       return this.instance.getName();
    }
    public ByteString getNameBytes(){
       return this.instance.getNameBytes();
    }
    public int getType(){
       return this.instance.getType();
    }
    public LookupConfig$Builder setDimension(float p0){
       this.copyOnWrite();
       this.instance.setDimension(p0);
       return this;
    }
    public LookupConfig$Builder setFilterId(int p0){
       this.copyOnWrite();
       this.instance.setFilterId(p0);
       return this;
    }
    public LookupConfig$Builder setIntensity(float p0){
       this.copyOnWrite();
       this.instance.setIntensity(p0);
       return this;
    }
    public LookupConfig$Builder setName(String p0){
       this.copyOnWrite();
       this.instance.setName(p0);
       return this;
    }
    public LookupConfig$Builder setNameBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setNameBytes(p0);
       return this;
    }
    public LookupConfig$Builder setType(int p0){
       this.copyOnWrite();
       this.instance.setType(p0);
       return this;
    }
}
