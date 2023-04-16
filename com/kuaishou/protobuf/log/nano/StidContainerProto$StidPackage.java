package com.kuaishou.protobuf.log.nano.StidContainerProto$StidPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import java.lang.System;
import com.kuaishou.protobuf.log.nano.StidContainerProto$StidContainer;

public final class StidContainerProto$StidPackage extends MessageNano	// class@000deb
{
    public String stExParams;
    public String[] stMergeArray;
    public StidContainerProto$StidContainer stidContainer;
    public String stidContainerJson;
    public String stidMerge;
    public static StidContainerProto$StidPackage[] _emptyArray;

    public void StidContainerProto$StidPackage(){
       super();
       this.clear();
    }
    public static StidContainerProto$StidPackage[] emptyArray(){
       if (StidContainerProto$StidPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (StidContainerProto$StidPackage._emptyArray == null) {
             StidContainerProto$StidPackage[] stidPackageA = new StidContainerProto$StidPackage[0];
             StidContainerProto$StidPackage._emptyArray = stidPackageA;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return StidContainerProto$StidPackage._emptyArray;
    }
    public static StidContainerProto$StidPackage parseFrom(CodedInputByteBufferNano p0){
       return new StidContainerProto$StidPackage().mergeFrom(p0);
    }
    public static StidContainerProto$StidPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new StidContainerProto$StidPackage(), p0);
    }
    public StidContainerProto$StidPackage clear(){
       this.stidContainer = null;
       this.stidMerge = "";
       this.stidContainerJson = "";
       this.stExParams = "";
       this.stMergeArray = WireFormatNano.EMPTY_STRING_ARRAY;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       StidContainerProto$StidPackage tstidContain = this.stidContainer;
       if (tstidContain != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tstidContain);
       }
       String str = "";
       if (!(this.stidMerge).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.stidMerge);
       }
       if (!(this.stidContainerJson).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.stidContainerJson);
       }
       if (!(this.stExParams).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.stExParams);
       }
       tstidContain = this.stMergeArray;
       if (tstidContain != null && tstidContain.length > 0) {
          int i1 = 0;
          int i2 = 0;
          int i3 = 0;
          StidContainerProto$StidPackage tstMergeArra = this.stMergeArray;
          while (i1 < tstMergeArra.length) {
             object oobject = tstMergeArra[i1];
             if (oobject != null) {
                i3 = i3 + 1;
                i2 = i2 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject);
             }
             i1 = i1 + 1;
          }
          i = (i + i2) + (i3 * 1);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public StidContainerProto$StidPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 34) {
                      int i1 = 42;
                      if (i != i1) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                         StidContainerProto$StidPackage tstMergeArra = this.stMergeArray;
                         int i2 = (tstMergeArra == null)? 0: tstMergeArra.length;
                         i = i + i2;
                         String[] stringArray = new String[i];
                         if (i2) {
                            System.arraycopy(tstMergeArra, 0, stringArray, 0, i2);
                         }
                         i1 = i - 1;
                         while (i2 < i1) {
                            stringArray[i2] = p0.readString();
                            p0.readTag();
                            i2 = i2 + 1;
                         }
                         stringArray[i2] = p0.readString();
                         this.stMergeArray = stringArray;
                      }
                   }else {
                      this.stExParams = p0.readString();
                   }
                }else {
                   this.stidContainerJson = p0.readString();
                }
             }else {
                this.stidMerge = p0.readString();
             }
          }else if(this.stidContainer == null){
             this.stidContainer = new StidContainerProto$StidContainer();
          }
          p0.readMessage(this.stidContainer);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       StidContainerProto$StidPackage tstidContain = this.stidContainer;
       if (tstidContain != null) {
          p0.writeMessage(1, tstidContain);
       }
       String str = "";
       if (!(this.stidMerge).equals(str)) {
          p0.writeString(2, this.stidMerge);
       }
       if (!(this.stidContainerJson).equals(str)) {
          p0.writeString(3, this.stidContainerJson);
       }
       if (!(this.stExParams).equals(str)) {
          p0.writeString(4, this.stExParams);
       }
       tstidContain = this.stMergeArray;
       if (tstidContain != null && tstidContain.length > 0) {
          int i = 0;
          StidContainerProto$StidPackage tstMergeArra = this.stMergeArray;
          while (i < tstMergeArra.length) {
             object oobject = tstMergeArra[i];
             if (oobject != null) {
                p0.writeString(5, oobject);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
