package com.kuaishou.livestream.message.nano.HighFrequencyActionGuide$TextDescription;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class HighFrequencyActionGuide$TextDescription extends MessageNano	// class@0010b5
{
    public int animDurationMs;
    public int animType;
    public int displayStyle;
    public int endCount;
    public int startCount;
    public int steps;
    public String text;
    public static HighFrequencyActionGuide$TextDescription[] _emptyArray;

    public void HighFrequencyActionGuide$TextDescription(){
       super();
       this.clear();
    }
    public static HighFrequencyActionGuide$TextDescription[] emptyArray(){
       if (HighFrequencyActionGuide$TextDescription._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (HighFrequencyActionGuide$TextDescription._emptyArray == null) {
             HighFrequencyActionGuide$TextDescription[] textDescript = new HighFrequencyActionGuide$TextDescription[0];
             HighFrequencyActionGuide$TextDescription._emptyArray = textDescript;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return HighFrequencyActionGuide$TextDescription._emptyArray;
    }
    public static HighFrequencyActionGuide$TextDescription parseFrom(CodedInputByteBufferNano p0){
       return new HighFrequencyActionGuide$TextDescription().mergeFrom(p0);
    }
    public static HighFrequencyActionGuide$TextDescription parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new HighFrequencyActionGuide$TextDescription(), p0);
    }
    public HighFrequencyActionGuide$TextDescription clear(){
       this.text = "";
       this.startCount = 0;
       this.endCount = 0;
       this.steps = 0;
       this.animType = 0;
       this.displayStyle = 0;
       this.animDurationMs = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.text).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.text);
       }
       HighFrequencyActionGuide$TextDescription tstartCount = this.startCount;
       if (tstartCount != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, tstartCount);
       }
       tstartCount = this.endCount;
       if (tstartCount != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, tstartCount);
       }
       tstartCount = this.steps;
       if (tstartCount != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(4, tstartCount);
       }
       tstartCount = this.animType;
       if (tstartCount != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(5, tstartCount);
       }
       tstartCount = this.displayStyle;
       if (tstartCount != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(6, tstartCount);
       }
       tstartCount = this.animDurationMs;
       if (tstartCount != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(7, tstartCount);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public HighFrequencyActionGuide$TextDescription mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 32) {
                      if (i != 40) {
                         if (i != 48) {
                            if (i != 56) {
                               if (!WireFormatNano.parseUnknownField(p0, i)) {
                                  break ;
                               }
                            }else {
                               this.animDurationMs = p0.readUInt32();
                            }
                         }else {
                            this.displayStyle = p0.readUInt32();
                         }
                      }else {
                         this.animType = p0.readUInt32();
                      }
                   }else {
                      this.steps = p0.readUInt32();
                   }
                }else {
                   this.endCount = p0.readUInt32();
                }
             }else {
                this.startCount = p0.readUInt32();
             }
          }else {
             this.text = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.text).equals("")) {
          p0.writeString(1, this.text);
       }
       HighFrequencyActionGuide$TextDescription tstartCount = this.startCount;
       if (tstartCount != null) {
          p0.writeUInt32(2, tstartCount);
       }
       tstartCount = this.endCount;
       if (tstartCount != null) {
          p0.writeUInt32(3, tstartCount);
       }
       tstartCount = this.steps;
       if (tstartCount != null) {
          p0.writeUInt32(4, tstartCount);
       }
       tstartCount = this.animType;
       if (tstartCount != null) {
          p0.writeUInt32(5, tstartCount);
       }
       tstartCount = this.displayStyle;
       if (tstartCount != null) {
          p0.writeUInt32(6, tstartCount);
       }
       tstartCount = this.animDurationMs;
       if (tstartCount != null) {
          p0.writeUInt32(7, tstartCount);
       }
       super.writeTo(p0);
       return;
    }
}
