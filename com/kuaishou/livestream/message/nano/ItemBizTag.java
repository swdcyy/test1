package com.kuaishou.livestream.message.nano.ItemBizTag;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.String;
import java.lang.Object;
import java.lang.System;

public final class ItemBizTag extends MessageNano	// class@0010ba
{
    public UserInfos$PicUrl[] iconUrl;
    public String positionCode;
    public int scene;
    public String[] text;
    public String textColor;
    public static ItemBizTag[] _emptyArray;

    public void ItemBizTag(){
       super();
       this.clear();
    }
    public static ItemBizTag[] emptyArray(){
       if (ItemBizTag._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ItemBizTag._emptyArray == null) {
             ItemBizTag[] itemBizTagAr = new ItemBizTag[0];
             ItemBizTag._emptyArray = itemBizTagAr;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ItemBizTag._emptyArray;
    }
    public static ItemBizTag parseFrom(CodedInputByteBufferNano p0){
       return new ItemBizTag().mergeFrom(p0);
    }
    public static ItemBizTag parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ItemBizTag(), p0);
    }
    public ItemBizTag clear(){
       this.scene = 0;
       this.text = WireFormatNano.EMPTY_STRING_ARRAY;
       this.textColor = "";
       this.iconUrl = UserInfos$PicUrl.emptyArray();
       this.positionCode = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ItemBizTag tscene = this.scene;
       int i1 = 1;
       if (tscene != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(i1, tscene);
       }
       tscene = this.text;
       int i2 = 0;
       if (tscene != null && tscene.length > 0) {
          int i3 = 0;
          int i4 = 0;
          int i5 = 0;
          ItemBizTag ttext = this.text;
          while (i3 < ttext.length) {
             object oobject = ttext[i3];
             if (oobject != null) {
                i5 = i5 + 1;
                i4 = i4 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject);
             }
             i3 = i3 + 1;
          }
          i = (i + i4) + (i5 * 1);
       }
       String str = "";
       if (!(this.textColor).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.textColor);
       }
       tscene = this.iconUrl;
       if (tscene != null && tscene.length > 0) {
          tscene = this.iconUrl;
          while (i2 < tscene.length) {
             object oobject1 = tscene[i2];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(4, oobject1);
             }
             i2 = i2 + 1;
          }
       }
       if (!(this.positionCode).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.positionCode);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ItemBizTag mergeFrom(CodedInputByteBufferNano p0){
       ItemBizTag ticonUrl;
       int i2;
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             int i1 = 18;
             if (i != i1) {
                if (i != 26) {
                   i1 = 34;
                   if (i != i1) {
                      if (i != 42) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.positionCode = p0.readString();
                      }
                   }else {
                      i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                      ticonUrl = this.iconUrl;
                      i2 = (ticonUrl == null)? 0: ticonUrl.length;
                      i = i + i2;
                      UserInfos$PicUrl[] picUrlArray = new UserInfos$PicUrl[i];
                      if (i2) {
                         System.arraycopy(ticonUrl, 0, picUrlArray, 0, i2);
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
                      this.iconUrl = picUrlArray;
                   }
                }else {
                   this.textColor = p0.readString();
                }
             }else {
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                ticonUrl = this.text;
                i2 = (ticonUrl == null)? 0: ticonUrl.length;
                i = i + i2;
                String[] stringArray = new String[i];
                if (i2) {
                   System.arraycopy(ticonUrl, 0, stringArray, 0, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   stringArray[i2] = p0.readString();
                   p0.readTag();
                   i2 = i2 + 1;
                }
                stringArray[i2] = p0.readString();
                this.text = stringArray;
             }
          }else {
             this.scene = p0.readInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ItemBizTag tscene = this.scene;
       if (tscene != null) {
          p0.writeInt32(1, tscene);
       }
       tscene = this.text;
       int i = 0;
       if (tscene != null && tscene.length > 0) {
          int i1 = 0;
          ItemBizTag ttext = this.text;
          while (i1 < ttext.length) {
             object oobject = ttext[i1];
             if (oobject != null) {
                p0.writeString(2, oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.textColor).equals("")) {
          p0.writeString(3, this.textColor);
       }
       tscene = this.iconUrl;
       if (tscene != null && tscene.length > 0) {
          tscene = this.iconUrl;
          while (i < tscene.length) {
             object oobject1 = tscene[i];
             if (oobject1 != null) {
                p0.writeMessage(4, oobject1);
             }
             i = i + 1;
          }
       }
       if (!(this.positionCode).equals("")) {
          p0.writeString(5, this.positionCode);
       }
       super.writeTo(p0);
       return;
    }
}
