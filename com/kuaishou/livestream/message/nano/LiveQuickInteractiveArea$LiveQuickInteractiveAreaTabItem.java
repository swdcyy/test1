package com.kuaishou.livestream.message.nano.LiveQuickInteractiveArea$LiveQuickInteractiveAreaTabItem;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class LiveQuickInteractiveArea$LiveQuickInteractiveAreaTabItem extends MessageNano	// class@00125d
{
    public String actionRouter;
    public String backgroundColor;
    public String displayText;
    public UserInfos$PicUrl[] prefixImageUrl;
    public UserInfos$PicUrl[] suffixImageUrl;
    public String tabExtraInfo;
    public static LiveQuickInteractiveArea$LiveQuickInteractiveAreaTabItem[] _emptyArray;

    public void LiveQuickInteractiveArea$LiveQuickInteractiveAreaTabItem(){
       super();
       this.clear();
    }
    public static LiveQuickInteractiveArea$LiveQuickInteractiveAreaTabItem[] emptyArray(){
       if (LiveQuickInteractiveArea$LiveQuickInteractiveAreaTabItem._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveQuickInteractiveArea$LiveQuickInteractiveAreaTabItem._emptyArray == null) {
             LiveQuickInteractiveArea$LiveQuickInteractiveAreaTabItem[] liveQuickInt = new LiveQuickInteractiveArea$LiveQuickInteractiveAreaTabItem[0];
             LiveQuickInteractiveArea$LiveQuickInteractiveAreaTabItem._emptyArray = liveQuickInt;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveQuickInteractiveArea$LiveQuickInteractiveAreaTabItem._emptyArray;
    }
    public static LiveQuickInteractiveArea$LiveQuickInteractiveAreaTabItem parseFrom(CodedInputByteBufferNano p0){
       return new LiveQuickInteractiveArea$LiveQuickInteractiveAreaTabItem().mergeFrom(p0);
    }
    public static LiveQuickInteractiveArea$LiveQuickInteractiveAreaTabItem parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveQuickInteractiveArea$LiveQuickInteractiveAreaTabItem(), p0);
    }
    public LiveQuickInteractiveArea$LiveQuickInteractiveAreaTabItem clear(){
       this.displayText = "";
       this.actionRouter = "";
       this.backgroundColor = "";
       this.prefixImageUrl = UserInfos$PicUrl.emptyArray();
       this.suffixImageUrl = UserInfos$PicUrl.emptyArray();
       this.tabExtraInfo = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.displayText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.displayText);
       }
       if (!(this.actionRouter).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.actionRouter);
       }
       if (!(this.backgroundColor).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.backgroundColor);
       }
       LiveQuickInteractiveArea$LiveQuickInteractiveAreaTabItem tprefixImage = this.prefixImageUrl;
       int i1 = 0;
       if (tprefixImage != null && tprefixImage.length > 0) {
          int i2 = 0;
          LiveQuickInteractiveArea$LiveQuickInteractiveAreaTabItem tprefixImage1 = this.prefixImageUrl;
          while (i2 < tprefixImage1.length) {
             object oobject = tprefixImage1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(4, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tprefixImage = this.suffixImageUrl;
       if (tprefixImage != null && tprefixImage.length > 0) {
          tprefixImage = this.suffixImageUrl;
          while (i1 < tprefixImage.length) {
             object oobject1 = tprefixImage[i1];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(5, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.tabExtraInfo).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.tabExtraInfo);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveQuickInteractiveArea$LiveQuickInteractiveAreaTabItem mergeFrom(CodedInputByteBufferNano p0){
       LiveQuickInteractiveArea$LiveQuickInteractiveAreaTabItem tsuffixImage;
       int i2;
       UserInfos$PicUrl[] picUrlArray;
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   int i1 = 34;
                   if (i != i1) {
                      i1 = 42;
                      if (i != i1) {
                         if (i != 50) {
                            if (!WireFormatNano.parseUnknownField(p0, i)) {
                               break ;
                            }
                         }else {
                            this.tabExtraInfo = p0.readString();
                         }
                      }else {
                         i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                         tsuffixImage = this.suffixImageUrl;
                         i2 = (tsuffixImage == null)? 0: tsuffixImage.length;
                         i = i + i2;
                         picUrlArray = new UserInfos$PicUrl[i];
                         if (i2) {
                            System.arraycopy(tsuffixImage, 0, picUrlArray, 0, i2);
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
                         this.suffixImageUrl = picUrlArray;
                      }
                   }else {
                      i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                      tsuffixImage = this.prefixImageUrl;
                      i2 = (tsuffixImage == null)? 0: tsuffixImage.length;
                      i = i + i2;
                      picUrlArray = new UserInfos$PicUrl[i];
                      if (i2) {
                         System.arraycopy(tsuffixImage, 0, picUrlArray, 0, i2);
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
                      this.prefixImageUrl = picUrlArray;
                   }
                }else {
                   this.backgroundColor = p0.readString();
                }
             }else {
                this.actionRouter = p0.readString();
             }
          }else {
             this.displayText = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.displayText).equals(str)) {
          p0.writeString(1, this.displayText);
       }
       if (!(this.actionRouter).equals(str)) {
          p0.writeString(2, this.actionRouter);
       }
       if (!(this.backgroundColor).equals(str)) {
          p0.writeString(3, this.backgroundColor);
       }
       LiveQuickInteractiveArea$LiveQuickInteractiveAreaTabItem tprefixImage = this.prefixImageUrl;
       int i = 0;
       if (tprefixImage != null && tprefixImage.length > 0) {
          int i1 = 0;
          LiveQuickInteractiveArea$LiveQuickInteractiveAreaTabItem tprefixImage1 = this.prefixImageUrl;
          while (i1 < tprefixImage1.length) {
             object oobject = tprefixImage1[i1];
             if (oobject != null) {
                p0.writeMessage(4, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tprefixImage = this.suffixImageUrl;
       if (tprefixImage != null && tprefixImage.length > 0) {
          tprefixImage = this.suffixImageUrl;
          while (i < tprefixImage.length) {
             object oobject1 = tprefixImage[i];
             if (oobject1 != null) {
                p0.writeMessage(5, oobject1);
             }
             i = i + 1;
          }
       }
       if (!(this.tabExtraInfo).equals(str)) {
          p0.writeString(6, this.tabExtraInfo);
       }
       super.writeTo(p0);
       return;
    }
}
