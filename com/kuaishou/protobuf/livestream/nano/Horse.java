package com.kuaishou.protobuf.livestream.nano.Horse;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class Horse extends MessageNano	// class@000c0e
{
    public boolean chosen;
    public long cost;
    public String errorDescription;
    public String hostAndPort;
    public long startTime;
    public boolean success;
    public String tag;
    public static Horse[] _emptyArray;

    public void Horse(){
       super();
       this.clear();
    }
    public static Horse[] emptyArray(){
       if (Horse._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (Horse._emptyArray == null) {
             Horse[] horseArray = new Horse[0];
             Horse._emptyArray = horseArray;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return Horse._emptyArray;
    }
    public static Horse parseFrom(CodedInputByteBufferNano p0){
       return new Horse().mergeFrom(p0);
    }
    public static Horse parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new Horse(), p0);
    }
    public Horse clear(){
       this.hostAndPort = "";
       this.tag = "";
       this.success = false;
       this.chosen = false;
       this.startTime = 0;
       this.cost = 0;
       this.errorDescription = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.hostAndPort).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.hostAndPort);
       }
       if (!(this.tag).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.tag);
       }
       Horse tsuccess = this.success;
       if (tsuccess != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(6, tsuccess);
       }
       tsuccess = this.chosen;
       if (tsuccess != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(7, tsuccess);
       }
       Horse tstartTime = this.startTime;
       if (tstartTime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(8, tstartTime);
       }
       tstartTime = this.cost;
       if (tstartTime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(9, tstartTime);
       }
       if (!(this.errorDescription).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.errorDescription);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public Horse mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 48) {
                   if (i != 56) {
                      if (i != 64) {
                         if (i != 72) {
                            if (i != 82) {
                               if (!WireFormatNano.parseUnknownField(p0, i)) {
                                  break ;
                               }
                            }else {
                               this.errorDescription = p0.readString();
                            }
                         }else {
                            this.cost = p0.readUInt64();
                         }
                      }else {
                         this.startTime = p0.readUInt64();
                      }
                   }else {
                      this.chosen = p0.readBool();
                   }
                }else {
                   this.success = p0.readBool();
                }
             }else {
                this.tag = p0.readString();
             }
          }else {
             this.hostAndPort = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.hostAndPort).equals(str)) {
          p0.writeString(1, this.hostAndPort);
       }
       if (!(this.tag).equals(str)) {
          p0.writeString(2, this.tag);
       }
       Horse tsuccess = this.success;
       if (tsuccess != null) {
          p0.writeBool(6, tsuccess);
       }
       tsuccess = this.chosen;
       if (tsuccess != null) {
          p0.writeBool(7, tsuccess);
       }
       Horse tstartTime = this.startTime;
       if (tstartTime) {
          p0.writeUInt64(8, tstartTime);
       }
       tstartTime = this.cost;
       if (tstartTime) {
          p0.writeUInt64(9, tstartTime);
       }
       if (!(this.errorDescription).equals(str)) {
          p0.writeString(10, this.errorDescription);
       }
       super.writeTo(p0);
       return;
    }
}
