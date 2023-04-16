package com.kuaishou.livestream.message.nano.LivePlusRecruitMessages$LiveRecruitPanelButton;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class LivePlusRecruitMessages$LiveRecruitPanelButton extends MessageNano	// class@001241
{
    public String borderColor;
    public String jumpUrl;
    public String text;
    public String textColor;
    public int type;
    public static LivePlusRecruitMessages$LiveRecruitPanelButton[] _emptyArray;

    public void LivePlusRecruitMessages$LiveRecruitPanelButton(){
       super();
       this.clear();
    }
    public static LivePlusRecruitMessages$LiveRecruitPanelButton[] emptyArray(){
       if (LivePlusRecruitMessages$LiveRecruitPanelButton._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LivePlusRecruitMessages$LiveRecruitPanelButton._emptyArray == null) {
             LivePlusRecruitMessages$LiveRecruitPanelButton[] liveRecruitP = new LivePlusRecruitMessages$LiveRecruitPanelButton[0];
             LivePlusRecruitMessages$LiveRecruitPanelButton._emptyArray = liveRecruitP;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LivePlusRecruitMessages$LiveRecruitPanelButton._emptyArray;
    }
    public static LivePlusRecruitMessages$LiveRecruitPanelButton parseFrom(CodedInputByteBufferNano p0){
       return new LivePlusRecruitMessages$LiveRecruitPanelButton().mergeFrom(p0);
    }
    public static LivePlusRecruitMessages$LiveRecruitPanelButton parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LivePlusRecruitMessages$LiveRecruitPanelButton(), p0);
    }
    public LivePlusRecruitMessages$LiveRecruitPanelButton clear(){
       this.type = 0;
       this.text = "";
       this.jumpUrl = "";
       this.textColor = "";
       this.borderColor = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LivePlusRecruitMessages$LiveRecruitPanelButton ttype = this.type;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, ttype);
       }
       String str = "";
       if (!(this.text).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.text);
       }
       if (!(this.jumpUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.jumpUrl);
       }
       if (!(this.textColor).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.textColor);
       }
       if (!(this.borderColor).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.borderColor);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LivePlusRecruitMessages$LiveRecruitPanelButton mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 34) {
                      if (i != 42) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.borderColor = p0.readString();
                      }
                   }else {
                      this.textColor = p0.readString();
                   }
                }else {
                   this.jumpUrl = p0.readString();
                }
             }else {
                this.text = p0.readString();
             }
          }else {
             i = p0.readInt32();
             switch (i){
                 case 0:
                 case 2:
                 case 3:
                 case 4:
                 case 5:
                 case 6:
                 case 1:
                   break;
                 default:
             }
             this.type = i;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LivePlusRecruitMessages$LiveRecruitPanelButton ttype = this.type;
       if (ttype != null) {
          p0.writeInt32(1, ttype);
       }
       String str = "";
       if (!(this.text).equals(str)) {
          p0.writeString(2, this.text);
       }
       if (!(this.jumpUrl).equals(str)) {
          p0.writeString(3, this.jumpUrl);
       }
       if (!(this.textColor).equals(str)) {
          p0.writeString(4, this.textColor);
       }
       if (!(this.borderColor).equals(str)) {
          p0.writeString(5, this.borderColor);
       }
       super.writeTo(p0);
       return;
    }
}
