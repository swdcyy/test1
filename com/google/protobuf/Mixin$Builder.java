package com.google.protobuf.Mixin$Builder;
import com.google.protobuf.MixinOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.Mixin;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Mixin$1;
import java.lang.String;
import com.google.protobuf.ByteString;

public final class Mixin$Builder extends GeneratedMessageLite$Builder implements MixinOrBuilder	// class@000486
{

    public void Mixin$Builder(){
       super(Mixin.DEFAULT_INSTANCE);
    }
    public void Mixin$Builder(Mixin$1 p0){
       super();
    }
    public Mixin$Builder clearName(){
       this.copyOnWrite();
       this.instance.clearName();
       return this;
    }
    public Mixin$Builder clearRoot(){
       this.copyOnWrite();
       this.instance.clearRoot();
       return this;
    }
    public String getName(){
       return this.instance.getName();
    }
    public ByteString getNameBytes(){
       return this.instance.getNameBytes();
    }
    public String getRoot(){
       return this.instance.getRoot();
    }
    public ByteString getRootBytes(){
       return this.instance.getRootBytes();
    }
    public Mixin$Builder setName(String p0){
       this.copyOnWrite();
       this.instance.setName(p0);
       return this;
    }
    public Mixin$Builder setNameBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setNameBytes(p0);
       return this;
    }
    public Mixin$Builder setRoot(String p0){
       this.copyOnWrite();
       this.instance.setRoot(p0);
       return this;
    }
    public Mixin$Builder setRootBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setRootBytes(p0);
       return this;
    }
}
