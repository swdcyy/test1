package com.kuaishou.livestream.message.nano.LivePkCreditScoreMessages$LivePkPanelNoticeTipV2;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.livestream.message.nano.LivePkCreditScoreMessages$LivePkPanelNoticeTipV2$LivePkPanelNoticeTipPlaceHolder;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import com.google.protobuf.nano.MapFactories$MapFactory;
import com.google.protobuf.nano.MapFactories;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LivePkCreditScoreMessages$LivePkPanelNoticeTipV2$NoticeDiffModel;
import java.lang.System;

public final class LivePkCreditScoreMessages$LivePkPanelNoticeTipV2 extends MessageNano	// class@00120d
{
    public LivePkCreditScoreMessages$LivePkPanelNoticeTipV2$NoticeDiffModel appDiffModel;
    public Map extraInfo;
    public long noticeShowMills;
    public String noticeText;
    public String noticeTextColor;
    public int noticeType;
    public LivePkCreditScoreMessages$LivePkPanelNoticeTipV2$NoticeDiffModel pcDiffModel;
    public LivePkCreditScoreMessages$LivePkPanelNoticeTipV2$LivePkPanelNoticeTipPlaceHolder[] placeHolder;
    public static LivePkCreditScoreMessages$LivePkPanelNoticeTipV2[] _emptyArray;

    public void LivePkCreditScoreMessages$LivePkPanelNoticeTipV2(){
       super();
       this.clear();
    }
    public static LivePkCreditScoreMessages$LivePkPanelNoticeTipV2[] emptyArray(){
       if (LivePkCreditScoreMessages$LivePkPanelNoticeTipV2._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LivePkCreditScoreMessages$LivePkPanelNoticeTipV2._emptyArray == null) {
             LivePkCreditScoreMessages$LivePkPanelNoticeTipV2[] livePkPanelN = new LivePkCreditScoreMessages$LivePkPanelNoticeTipV2[0];
             LivePkCreditScoreMessages$LivePkPanelNoticeTipV2._emptyArray = livePkPanelN;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LivePkCreditScoreMessages$LivePkPanelNoticeTipV2._emptyArray;
    }
    public static LivePkCreditScoreMessages$LivePkPanelNoticeTipV2 parseFrom(CodedInputByteBufferNano p0){
       return new LivePkCreditScoreMessages$LivePkPanelNoticeTipV2().mergeFrom(p0);
    }
    public static LivePkCreditScoreMessages$LivePkPanelNoticeTipV2 parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LivePkCreditScoreMessages$LivePkPanelNoticeTipV2(), p0);
    }
    public LivePkCreditScoreMessages$LivePkPanelNoticeTipV2 clear(){
       this.noticeType = 0;
       this.noticeText = "";
       this.noticeTextColor = "";
       this.noticeShowMills = 0;
       this.placeHolder = LivePkCreditScoreMessages$LivePkPanelNoticeTipV2$LivePkPanelNoticeTipPlaceHolder.emptyArray();
       this.extraInfo = null;
       this.pcDiffModel = null;
       this.appDiffModel = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LivePkCreditScoreMessages$LivePkPanelNoticeTipV2 tnoticeType = this.noticeType;
       if (tnoticeType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tnoticeType);
       }
       String str = "";
       if (!(this.noticeText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.noticeText);
       }
       if (!(this.noticeTextColor).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.noticeTextColor);
       }
       tnoticeType = this.noticeShowMills;
       if (tnoticeType) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tnoticeType);
       }
       tnoticeType = this.placeHolder;
       if (tnoticeType != null && tnoticeType.length > 0) {
          int i1 = 0;
          LivePkCreditScoreMessages$LivePkPanelNoticeTipV2 tplaceHolder = this.placeHolder;
          while (i1 < tplaceHolder.length) {
             object oobject = tplaceHolder[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(5, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tnoticeType = this.extraInfo;
       if (tnoticeType != null) {
          i = i + InternalNano.computeMapFieldSize(tnoticeType, 6, 9, 9);
       }
       tnoticeType = this.pcDiffModel;
       if (tnoticeType != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(7, tnoticeType);
       }
       tnoticeType = this.appDiffModel;
       if (tnoticeType != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(8, tnoticeType);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LivePkCreditScoreMessages$LivePkPanelNoticeTipV2 mergeFrom(CodedInputByteBufferNano p0){
       MapFactories$MapFactory mapFactory = MapFactories.getMapFactory();
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 32) {
                      int i1 = 42;
                      if (i != i1) {
                         if (i != 50) {
                            if (i != 58) {
                               if (i != 66) {
                                  if (!WireFormatNano.parseUnknownField(p0, i)) {
                                     break ;
                                  }
                               }else if(this.appDiffModel == null){
                                  this.appDiffModel = new LivePkCreditScoreMessages$LivePkPanelNoticeTipV2$NoticeDiffModel();
                               }
                               p0.readMessage(this.appDiffModel);
                            }else if(this.pcDiffModel == null){
                               this.pcDiffModel = new LivePkCreditScoreMessages$LivePkPanelNoticeTipV2$NoticeDiffModel();
                            }
                            p0.readMessage(this.pcDiffModel);
                         }else {
                            this.extraInfo = InternalNano.mergeMapEntry(p0, this.extraInfo, mapFactory, 9, 9, null, 10, 18);
                         }
                      }else {
                         i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                         LivePkCreditScoreMessages$LivePkPanelNoticeTipV2 tplaceHolder = this.placeHolder;
                         int i2 = 0;
                         int i3 = (tplaceHolder == null)? 0: tplaceHolder.length;
                         i = i + i3;
                         LivePkCreditScoreMessages$LivePkPanelNoticeTipV2$LivePkPanelNoticeTipPlaceHolder[] livePkPanelN = new LivePkCreditScoreMessages$LivePkPanelNoticeTipV2$LivePkPanelNoticeTipPlaceHolder[i];
                         if (i3) {
                            System.arraycopy(tplaceHolder, i2, livePkPanelN, i2, i3);
                         }
                         i1 = i - 1;
                         while (i3 < i1) {
                            livePkPanelN[i3] = new LivePkCreditScoreMessages$LivePkPanelNoticeTipV2$LivePkPanelNoticeTipPlaceHolder();
                            p0.readMessage(livePkPanelN[i3]);
                            p0.readTag();
                            i3 = i3 + 1;
                         }
                         livePkPanelN[i3] = new LivePkCreditScoreMessages$LivePkPanelNoticeTipV2$LivePkPanelNoticeTipPlaceHolder();
                         p0.readMessage(livePkPanelN[i3]);
                         this.placeHolder = livePkPanelN;
                      }
                   }else {
                      this.noticeShowMills = p0.readUInt64();
                   }
                }else {
                   this.noticeTextColor = p0.readString();
                }
             }else {
                this.noticeText = p0.readString();
             }
          }else {
             i = p0.readInt32();
             if (i && (i != 1 && (i != 2 && (i != 3 && i != 4)))) {
                continue ;
             }else {
                this.noticeType = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LivePkCreditScoreMessages$LivePkPanelNoticeTipV2 tnoticeType = this.noticeType;
       if (tnoticeType != null) {
          p0.writeInt32(1, tnoticeType);
       }
       String str = "";
       if (!(this.noticeText).equals(str)) {
          p0.writeString(2, this.noticeText);
       }
       if (!(this.noticeTextColor).equals(str)) {
          p0.writeString(3, this.noticeTextColor);
       }
       tnoticeType = this.noticeShowMills;
       if (tnoticeType) {
          p0.writeUInt64(4, tnoticeType);
       }
       tnoticeType = this.placeHolder;
       if (tnoticeType != null && tnoticeType.length > 0) {
          int i = 0;
          LivePkCreditScoreMessages$LivePkPanelNoticeTipV2 tplaceHolder = this.placeHolder;
          while (i < tplaceHolder.length) {
             object oobject = tplaceHolder[i];
             if (oobject != null) {
                p0.writeMessage(5, oobject);
             }
             i = i + 1;
          }
       }
       tnoticeType = this.extraInfo;
       if (tnoticeType != null) {
          InternalNano.serializeMapField(p0, tnoticeType, 6, 9, 9);
       }
       tnoticeType = this.pcDiffModel;
       if (tnoticeType != null) {
          p0.writeMessage(7, tnoticeType);
       }
       tnoticeType = this.appDiffModel;
       if (tnoticeType != null) {
          p0.writeMessage(8, tnoticeType);
       }
       super.writeTo(p0);
       return;
    }
}
