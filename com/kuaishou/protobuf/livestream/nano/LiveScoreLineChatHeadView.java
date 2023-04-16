package com.kuaishou.protobuf.livestream.nano.LiveScoreLineChatHeadView;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class LiveScoreLineChatHeadView extends MessageNano	// class@000d0a
{
    public long displayDurationMs;
    public String displayTarget;
    public String displayTargetUnit;
    public String headViewText;
    public int headViewType;
    public UserInfos$PicUrl[] headerViewPicUrl;
    public int imageHeight;
    public int imageWidth;
    public static LiveScoreLineChatHeadView[] _emptyArray;

    public void LiveScoreLineChatHeadView(){
       super();
       this.clear();
    }
    public static LiveScoreLineChatHeadView[] emptyArray(){
       if (LiveScoreLineChatHeadView._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveScoreLineChatHeadView._emptyArray == null) {
             LiveScoreLineChatHeadView[] liveScoreLin = new LiveScoreLineChatHeadView[0];
             LiveScoreLineChatHeadView._emptyArray = liveScoreLin;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveScoreLineChatHeadView._emptyArray;
    }
    public static LiveScoreLineChatHeadView parseFrom(CodedInputByteBufferNano p0){
       return new LiveScoreLineChatHeadView().mergeFrom(p0);
    }
    public static LiveScoreLineChatHeadView parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveScoreLineChatHeadView(), p0);
    }
    public LiveScoreLineChatHeadView clear(){
       this.headViewType = 0;
       this.headerViewPicUrl = UserInfos$PicUrl.emptyArray();
       this.displayDurationMs = 0;
       this.headViewText = "";
       this.displayTarget = "";
       this.displayTargetUnit = "";
       this.imageWidth = 0;
       this.imageHeight = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveScoreLineChatHeadView theadViewTyp = this.headViewType;
       if (theadViewTyp != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, theadViewTyp);
       }
       theadViewTyp = this.headerViewPicUrl;
       if (theadViewTyp != null && theadViewTyp.length > 0) {
          int i1 = 0;
          LiveScoreLineChatHeadView theaderViewP = this.headerViewPicUrl;
          while (i1 < theaderViewP.length) {
             object oobject = theaderViewP[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(2, oobject);
             }
             i1 = i1 + 1;
          }
       }
       theadViewTyp = this.displayDurationMs;
       if (theadViewTyp - null) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, theadViewTyp);
       }
       String str = "";
       if (!(this.headViewText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.headViewText);
       }
       if (!(this.displayTarget).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.displayTarget);
       }
       if (!(this.displayTargetUnit).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.displayTargetUnit);
       }
       theadViewTyp = this.imageWidth;
       if (theadViewTyp != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(7, theadViewTyp);
       }
       theadViewTyp = this.imageHeight;
       if (theadViewTyp != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(8, theadViewTyp);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveScoreLineChatHeadView mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             int i1 = 18;
             if (i != i1) {
                if (i != 24) {
                   if (i != 34) {
                      if (i != 42) {
                         if (i != 50) {
                            if (i != 56) {
                               if (i != 64) {
                                  if (!WireFormatNano.parseUnknownField(p0, i)) {
                                     break ;
                                  }
                               }else {
                                  this.imageHeight = p0.readUInt32();
                               }
                            }else {
                               this.imageWidth = p0.readUInt32();
                            }
                         }else {
                            this.displayTargetUnit = p0.readString();
                         }
                      }else {
                         this.displayTarget = p0.readString();
                      }
                   }else {
                      this.headViewText = p0.readString();
                   }
                }else {
                   this.displayDurationMs = p0.readUInt64();
                }
             }else {
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                LiveScoreLineChatHeadView theaderViewP = this.headerViewPicUrl;
                int i2 = (theaderViewP == null)? 0: theaderViewP.length;
                i = i + i2;
                UserInfos$PicUrl[] picUrlArray = new UserInfos$PicUrl[i];
                if (i2) {
                   System.arraycopy(theaderViewP, 0, picUrlArray, 0, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   picUrlArray[i2] = new UserInfos$PicUrl();
                   p0.readMessage(picUrlArray[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                picUrlArray[i2] = new UserInfos$PicUrl();
                p0.readMessage(picUrlArray[i2]);
                this.headerViewPicUrl = picUrlArray;
             }
          }else {
             i = p0.readInt32();
             if (i && (i != 1 && (i != 2 && i != 3))) {
                continue ;
             }else {
                this.headViewType = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveScoreLineChatHeadView theadViewTyp = this.headViewType;
       if (theadViewTyp != null) {
          p0.writeInt32(1, theadViewTyp);
       }
       theadViewTyp = this.headerViewPicUrl;
       if (theadViewTyp != null && theadViewTyp.length > 0) {
          int i = 0;
          LiveScoreLineChatHeadView theaderViewP = this.headerViewPicUrl;
          while (i < theaderViewP.length) {
             object oobject = theaderViewP[i];
             if (oobject != null) {
                p0.writeMessage(2, oobject);
             }
             i = i + 1;
          }
       }
       theadViewTyp = this.displayDurationMs;
       if (theadViewTyp - null) {
          p0.writeUInt64(3, theadViewTyp);
       }
       String str = "";
       if (!(this.headViewText).equals(str)) {
          p0.writeString(4, this.headViewText);
       }
       if (!(this.displayTarget).equals(str)) {
          p0.writeString(5, this.displayTarget);
       }
       if (!(this.displayTargetUnit).equals(str)) {
          p0.writeString(6, this.displayTargetUnit);
       }
       theadViewTyp = this.imageWidth;
       if (theadViewTyp != null) {
          p0.writeUInt32(7, theadViewTyp);
       }
       theadViewTyp = this.imageHeight;
       if (theadViewTyp != null) {
          p0.writeUInt32(8, theadViewTyp);
       }
       super.writeTo(p0);
       return;
    }
}
