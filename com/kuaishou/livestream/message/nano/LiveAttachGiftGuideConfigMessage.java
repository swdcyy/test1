package com.kuaishou.livestream.message.nano.LiveAttachGiftGuideConfigMessage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveAttachGiftGuideConfigMessage$LiveAttachFastGiftConfigMessage;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Map;
import com.google.protobuf.nano.MapFactories$MapFactory;
import com.google.protobuf.nano.MapFactories;
import java.lang.System;

public final class LiveAttachGiftGuideConfigMessage extends MessageNano	// class@0010fd
{
    public Map attachGiftActivityInfo;
    public int[] attachGiftIdList;
    public LiveAttachGiftGuideConfigMessage$LiveAttachFastGiftConfigMessage[] attachGiftIds;
    public String giftToken;
    public String recoGiftLlsid;
    public static LiveAttachGiftGuideConfigMessage[] _emptyArray;

    public void LiveAttachGiftGuideConfigMessage(){
       super();
       this.clear();
    }
    public static LiveAttachGiftGuideConfigMessage[] emptyArray(){
       if (LiveAttachGiftGuideConfigMessage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveAttachGiftGuideConfigMessage._emptyArray == null) {
             LiveAttachGiftGuideConfigMessage[] liveAttachGi = new LiveAttachGiftGuideConfigMessage[0];
             LiveAttachGiftGuideConfigMessage._emptyArray = liveAttachGi;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveAttachGiftGuideConfigMessage._emptyArray;
    }
    public static LiveAttachGiftGuideConfigMessage parseFrom(CodedInputByteBufferNano p0){
       return new LiveAttachGiftGuideConfigMessage().mergeFrom(p0);
    }
    public static LiveAttachGiftGuideConfigMessage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveAttachGiftGuideConfigMessage(), p0);
    }
    public LiveAttachGiftGuideConfigMessage clear(){
       this.recoGiftLlsid = "";
       this.attachGiftIdList = WireFormatNano.EMPTY_INT_ARRAY;
       this.attachGiftActivityInfo = null;
       this.giftToken = "";
       this.attachGiftIds = LiveAttachGiftGuideConfigMessage$LiveAttachFastGiftConfigMessage.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       int i1 = 1;
       if (!(this.recoGiftLlsid).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(i1, this.recoGiftLlsid);
       }
       LiveAttachGiftGuideConfigMessage tattachGiftI = this.attachGiftIdList;
       int i2 = 0;
       if (tattachGiftI != null && tattachGiftI.length > 0) {
          int i3 = 0;
          int i4 = 0;
          LiveAttachGiftGuideConfigMessage tattachGiftI1 = this.attachGiftIdList;
          while (i3 < tattachGiftI1.length) {
             i4 = i4 + CodedOutputByteBufferNano.computeInt32SizeNoTag(tattachGiftI1[i3]);
             i3 = i3 + 1;
          }
          i = (i + i4) + (tattachGiftI1.length * 1);
       }
       tattachGiftI = this.attachGiftActivityInfo;
       if (tattachGiftI != null) {
          i = i + InternalNano.computeMapFieldSize(tattachGiftI, 3, 13, 9);
       }
       if (!(this.giftToken).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.giftToken);
       }
       tattachGiftI = this.attachGiftIds;
       if (tattachGiftI != null && tattachGiftI.length > 0) {
          tattachGiftI = this.attachGiftIds;
          while (i2 < tattachGiftI.length) {
             object oobject = tattachGiftI[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(5, oobject);
             }
             i2 = i2 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveAttachGiftGuideConfigMessage mergeFrom(CodedInputByteBufferNano p0){
       LiveAttachGiftGuideConfigMessage tattachGiftI;
       int i3;
       MapFactories$MapFactory mapFactory = MapFactories.getMapFactory();
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             int i1 = 16;
             int i2 = 0;
             if (i != i1) {
                if (i != 18) {
                   if (i != 26) {
                      if (i != 34) {
                         i1 = 42;
                         if (i != i1) {
                            if (!WireFormatNano.parseUnknownField(p0, i)) {
                               break ;
                            }
                         }else {
                            i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                            tattachGiftI = this.attachGiftIds;
                            i3 = (tattachGiftI == null)? 0: tattachGiftI.length;
                            i = i + i3;
                            LiveAttachGiftGuideConfigMessage$LiveAttachFastGiftConfigMessage[] liveAttachFa = new LiveAttachGiftGuideConfigMessage$LiveAttachFastGiftConfigMessage[i];
                            if (i3) {
                               System.arraycopy(tattachGiftI, i2, liveAttachFa, i2, i3);
                            }
                            i1 = i - 1;
                            while (i3 < i1) {
                               liveAttachFa[i3] = new LiveAttachGiftGuideConfigMessage$LiveAttachFastGiftConfigMessage();
                               p0.readMessage(liveAttachFa[i3]);
                               p0.readTag();
                               i3 = i3 + 1;
                            }
                            liveAttachFa[i3] = new LiveAttachGiftGuideConfigMessage$LiveAttachFastGiftConfigMessage();
                            p0.readMessage(liveAttachFa[i3]);
                            this.attachGiftIds = liveAttachFa;
                         }
                      }else {
                         this.giftToken = p0.readString();
                      }
                   }else {
                      this.attachGiftActivityInfo = InternalNano.mergeMapEntry(p0, this.attachGiftActivityInfo, mapFactory, 13, 9, null, 8, 18);
                   }
                }else {
                   i = p0.pushLimit(p0.readRawVarint32());
                   i1 = p0.getPosition();
                   i3 = 0;
                   while (p0.getBytesUntilLimit() > 0) {
                      p0.readInt32();
                      i3 = i3 + 1;
                   }
                   p0.rewindToPosition(i1);
                   tattachGiftI = this.attachGiftIdList;
                   int i4 = (tattachGiftI == null)? 0: tattachGiftI.length;
                   i3 = i3 + i4;
                   int[] ointArray = new int[i3];
                   if (i4) {
                      System.arraycopy(tattachGiftI, i2, ointArray, i2, i4);
                   }
                   while (i4 < i3) {
                      ointArray[i4] = p0.readInt32();
                      i4 = i4 + 1;
                   }
                   this.attachGiftIdList = ointArray;
                   p0.popLimit(i);
                }
             }else {
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                tattachGiftI = this.attachGiftIdList;
                i3 = (tattachGiftI == null)? 0: tattachGiftI.length;
                i = i + i3;
                int[] ointArray1 = new int[i];
                if (i3) {
                   System.arraycopy(tattachGiftI, i2, ointArray1, i2, i3);
                }
                i1 = i - 1;
                while (i3 < i1) {
                   ointArray1[i3] = p0.readInt32();
                   p0.readTag();
                   i3 = i3 + 1;
                }
                ointArray1[i3] = p0.readInt32();
                this.attachGiftIdList = ointArray1;
             }
          }else {
             this.recoGiftLlsid = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.recoGiftLlsid).equals(str)) {
          p0.writeString(1, this.recoGiftLlsid);
       }
       LiveAttachGiftGuideConfigMessage tattachGiftI = this.attachGiftIdList;
       int i = 0;
       if (tattachGiftI != null && tattachGiftI.length > 0) {
          int i1 = 0;
          LiveAttachGiftGuideConfigMessage tattachGiftI1 = this.attachGiftIdList;
          while (i1 < tattachGiftI1.length) {
             p0.writeInt32(2, tattachGiftI1[i1]);
             i1 = i1 + 1;
          }
       }
       tattachGiftI = this.attachGiftActivityInfo;
       if (tattachGiftI != null) {
          InternalNano.serializeMapField(p0, tattachGiftI, 3, 13, 9);
       }
       if (!(this.giftToken).equals(str)) {
          p0.writeString(4, this.giftToken);
       }
       tattachGiftI = this.attachGiftIds;
       if (tattachGiftI != null && tattachGiftI.length > 0) {
          tattachGiftI = this.attachGiftIds;
          while (i < tattachGiftI.length) {
             object oobject = tattachGiftI[i];
             if (oobject != null) {
                p0.writeMessage(5, oobject);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
