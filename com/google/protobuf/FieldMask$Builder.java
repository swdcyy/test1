package com.google.protobuf.FieldMask$Builder;
import com.google.protobuf.FieldMaskOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.FieldMask;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.FieldMask$1;
import java.lang.Iterable;
import java.lang.String;
import com.google.protobuf.ByteString;
import java.util.List;
import java.util.Collections;

public final class FieldMask$Builder extends GeneratedMessageLite$Builder implements FieldMaskOrBuilder	// class@00041f
{

    public void FieldMask$Builder(){
       super(FieldMask.DEFAULT_INSTANCE);
    }
    public void FieldMask$Builder(FieldMask$1 p0){
       super();
    }
    public FieldMask$Builder addAllPaths(Iterable p0){
       this.copyOnWrite();
       this.instance.addAllPaths(p0);
       return this;
    }
    public FieldMask$Builder addPaths(String p0){
       this.copyOnWrite();
       this.instance.addPaths(p0);
       return this;
    }
    public FieldMask$Builder addPathsBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.addPathsBytes(p0);
       return this;
    }
    public FieldMask$Builder clearPaths(){
       this.copyOnWrite();
       this.instance.clearPaths();
       return this;
    }
    public String getPaths(int p0){
       return this.instance.getPaths(p0);
    }
    public ByteString getPathsBytes(int p0){
       return this.instance.getPathsBytes(p0);
    }
    public int getPathsCount(){
       return this.instance.getPathsCount();
    }
    public List getPathsList(){
       return Collections.unmodifiableList(this.instance.getPathsList());
    }
    public FieldMask$Builder setPaths(int p0,String p1){
       this.copyOnWrite();
       this.instance.setPaths(p0, p1);
       return this;
    }
}
