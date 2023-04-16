package com.google.protobuf.StructuralMessageInfo$Builder;
import java.lang.Object;
import java.util.ArrayList;
import com.google.protobuf.StructuralMessageInfo;
import java.util.List;
import java.util.Collections;
import com.google.protobuf.FieldInfo;
import com.google.protobuf.ProtoSyntax;
import java.lang.IllegalStateException;
import java.lang.String;
import com.google.protobuf.Internal;

public final class StructuralMessageInfo$Builder	// class@0004c2
{
    public int[] checkInitialized;
    public Object defaultInstance;
    public final List fields;
    public boolean messageSetWireFormat;
    public ProtoSyntax syntax;
    public boolean wasBuilt;

    public void StructuralMessageInfo$Builder(){
       super();
       this.checkInitialized = null;
       this.fields = new ArrayList();
    }
    public void StructuralMessageInfo$Builder(int p0){
       super();
       this.checkInitialized = null;
       this.fields = new ArrayList(p0);
    }
    public StructuralMessageInfo build(){
       if (this.wasBuilt != null) {
          throw new IllegalStateException("Builder can only build once");
       }
       if (this.syntax == null) {
          throw new IllegalStateException("Must specify a proto syntax");
       }
       this.wasBuilt = true;
       Collections.sort(this.fields);
       FieldInfo[] uFieldInfoAr = new FieldInfo[0];
       StructuralMessageInfo structuralMe = new StructuralMessageInfo(this.syntax, this.messageSetWireFormat, this.checkInitialized, this.fields.toArray(uFieldInfoAr), this.defaultInstance);
       return v0;
    }
    public void withCheckInitialized(int[] p0){
       this.checkInitialized = p0;
    }
    public void withDefaultInstance(Object p0){
       this.defaultInstance = p0;
    }
    public void withField(FieldInfo p0){
       if (this.wasBuilt != null) {
          throw new IllegalStateException("Builder can only build once");
       }
       this.fields.add(p0);
       return;
    }
    public void withMessageSetWireFormat(boolean p0){
       this.messageSetWireFormat = p0;
    }
    public void withSyntax(ProtoSyntax p0){
       this.syntax = Internal.checkNotNull(p0, "syntax");
    }
}
