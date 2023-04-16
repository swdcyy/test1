package com.kwai.sdk.eve.proto.HetuTag$Builder;
import com.kwai.sdk.eve.proto.HetuTagOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.sdk.eve.proto.HetuTag;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.sdk.eve.proto.HetuTag$1;
import java.lang.Iterable;
import java.util.List;
import java.util.Collections;

public final class HetuTag$Builder extends GeneratedMessageLite$Builder implements HetuTagOrBuilder	// class@0015eb
{

    public void HetuTag$Builder(){
       super(HetuTag.DEFAULT_INSTANCE);
    }
    public void HetuTag$Builder(HetuTag$1 p0){
       super();
    }
    public HetuTag$Builder addAllHetuOne(Iterable p0){
       this.copyOnWrite();
       this.instance.addAllHetuOne(p0);
       return this;
    }
    public HetuTag$Builder addAllHetuThree(Iterable p0){
       this.copyOnWrite();
       this.instance.addAllHetuThree(p0);
       return this;
    }
    public HetuTag$Builder addAllHetuTwo(Iterable p0){
       this.copyOnWrite();
       this.instance.addAllHetuTwo(p0);
       return this;
    }
    public HetuTag$Builder addHetuOne(int p0){
       this.copyOnWrite();
       this.instance.addHetuOne(p0);
       return this;
    }
    public HetuTag$Builder addHetuThree(int p0){
       this.copyOnWrite();
       this.instance.addHetuThree(p0);
       return this;
    }
    public HetuTag$Builder addHetuTwo(int p0){
       this.copyOnWrite();
       this.instance.addHetuTwo(p0);
       return this;
    }
    public HetuTag$Builder clearHetuOne(){
       this.copyOnWrite();
       this.instance.clearHetuOne();
       return this;
    }
    public HetuTag$Builder clearHetuThree(){
       this.copyOnWrite();
       this.instance.clearHetuThree();
       return this;
    }
    public HetuTag$Builder clearHetuTwo(){
       this.copyOnWrite();
       this.instance.clearHetuTwo();
       return this;
    }
    public int getHetuOne(int p0){
       return this.instance.getHetuOne(p0);
    }
    public int getHetuOneCount(){
       return this.instance.getHetuOneCount();
    }
    public List getHetuOneList(){
       return Collections.unmodifiableList(this.instance.getHetuOneList());
    }
    public int getHetuThree(int p0){
       return this.instance.getHetuThree(p0);
    }
    public int getHetuThreeCount(){
       return this.instance.getHetuThreeCount();
    }
    public List getHetuThreeList(){
       return Collections.unmodifiableList(this.instance.getHetuThreeList());
    }
    public int getHetuTwo(int p0){
       return this.instance.getHetuTwo(p0);
    }
    public int getHetuTwoCount(){
       return this.instance.getHetuTwoCount();
    }
    public List getHetuTwoList(){
       return Collections.unmodifiableList(this.instance.getHetuTwoList());
    }
    public HetuTag$Builder setHetuOne(int p0,int p1){
       this.copyOnWrite();
       this.instance.setHetuOne(p0, p1);
       return this;
    }
    public HetuTag$Builder setHetuThree(int p0,int p1){
       this.copyOnWrite();
       this.instance.setHetuThree(p0, p1);
       return this;
    }
    public HetuTag$Builder setHetuTwo(int p0,int p1){
       this.copyOnWrite();
       this.instance.setHetuTwo(p0, p1);
       return this;
    }
}
