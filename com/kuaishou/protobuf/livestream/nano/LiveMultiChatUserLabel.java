package com.kuaishou.protobuf.livestream.nano.LiveMultiChatUserLabel;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveMultiChatUserLabel extends MessageNano	// class@000cac
{
    public String backgroundColor;
    public String editText;
    public String label;
    public int labelType;
    public String text;
    public String textColor;
    public long userId;
    public static LiveMultiChatUserLabel[] _emptyArray;

    public void LiveMultiChatUserLabel(){
       super();
       this.clear();
    }
    public static LiveMultiChatUserLabel[] emptyArray(){
       if (LiveMultiChatUserLabel._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveMultiChatUserLabel._emptyArray == null) {
             LiveMultiChatUserLabel[] liveMultiCha = new LiveMultiChatUserLabel[0];
             LiveMultiChatUserLabel._emptyArray = liveMultiCha;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveMultiChatUserLabel._emptyArray;
    }
    public static LiveMultiChatUserLabel parseFrom(CodedInputByteBufferNano p0){
       return new LiveMultiChatUserLabel().mergeFrom(p0);
    }
    public static LiveMultiChatUserLabel parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveMultiChatUserLabel(), p0);
    }
    public LiveMultiChatUserLabel clear(){
       this.userId = 0;
       this.labelType = 0;
       this.text = "";
       this.backgroundColor = "";
       this.textColor = "";
       this.editText = "";
       this.label = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveMultiChatUserLabel tuserId = this.userId;
       if (tuserId - null) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tuserId);
       }
       tuserId = this.labelType;
       if (tuserId != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tuserId);
       }
       String str = "";
       if (!(this.text).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.text);
       }
       if (!(this.backgroundColor).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.backgroundColor);
       }
       if (!(this.textColor).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.textColor);
       }
       if (!(this.editText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.editText);
       }
       if (!(this.label).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.label);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveMultiChatUserLabel mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 26) {
                   if (i != 34) {
                      if (i != 42) {
                         if (i != 50) {
                            if (i != 58) {
                               if (!WireFormatNano.parseUnknownField(p0, i)) {
                                  break ;
                               }
                            }else {
                               this.label = p0.readString();
                            }
                         }else {
                            this.editText = p0.readString();
                         }
                      }else {
                         this.textColor = p0.readString();
                      }
                   }else {
                      this.backgroundColor = p0.readString();
                   }
                }else {
                   this.text = p0.readString();
                }
             }else {
                i = p0.readInt32();
                if (i && i != 1) {
                   continue ;
                }else {
                   this.labelType = i;
                }
             }
          }else {
             this.userId = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveMultiChatUserLabel tuserId = this.userId;
       if (tuserId - null) {
          p0.writeUInt64(1, tuserId);
       }
       tuserId = this.labelType;
       if (tuserId != null) {
          p0.writeInt32(2, tuserId);
       }
       String str = "";
       if (!(this.text).equals(str)) {
          p0.writeString(3, this.text);
       }
       if (!(this.backgroundColor).equals(str)) {
          p0.writeString(4, this.backgroundColor);
       }
       if (!(this.textColor).equals(str)) {
          p0.writeString(5, this.textColor);
       }
       if (!(this.editText).equals(str)) {
          p0.writeString(6, this.editText);
       }
       if (!(this.label).equals(str)) {
          p0.writeString(7, this.label);
       }
       super.writeTo(p0);
       return;
    }
}
