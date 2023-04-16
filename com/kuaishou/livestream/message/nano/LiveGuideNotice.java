package com.kuaishou.livestream.message.nano.LiveGuideNotice;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveGuideNotice extends MessageNano	// class@0011c0
{
    public int bottomBarFeatureType;
    public String buttonKwaiLink;
    public String buttonText;
    public int commentUIType;
    public String desc;
    public int displayDurationMs;
    public int guideNoticeType;
    public static LiveGuideNotice[] _emptyArray;

    public void LiveGuideNotice(){
       super();
       this.clear();
    }
    public static LiveGuideNotice[] emptyArray(){
       if (LiveGuideNotice._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveGuideNotice._emptyArray == null) {
             LiveGuideNotice[] liveGuideNot = new LiveGuideNotice[0];
             LiveGuideNotice._emptyArray = liveGuideNot;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveGuideNotice._emptyArray;
    }
    public static LiveGuideNotice parseFrom(CodedInputByteBufferNano p0){
       return new LiveGuideNotice().mergeFrom(p0);
    }
    public static LiveGuideNotice parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveGuideNotice(), p0);
    }
    public LiveGuideNotice clear(){
       this.guideNoticeType = 0;
       this.displayDurationMs = 0;
       this.commentUIType = 0;
       this.desc = "";
       this.buttonText = "";
       this.buttonKwaiLink = "";
       this.bottomBarFeatureType = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveGuideNotice tguideNotice = this.guideNoticeType;
       if (tguideNotice != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, tguideNotice);
       }
       tguideNotice = this.displayDurationMs;
       if (tguideNotice != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, tguideNotice);
       }
       tguideNotice = this.commentUIType;
       if (tguideNotice != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, tguideNotice);
       }
       String str = "";
       if (!(this.desc).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.desc);
       }
       if (!(this.buttonText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.buttonText);
       }
       if (!(this.buttonKwaiLink).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.buttonKwaiLink);
       }
       tguideNotice = this.bottomBarFeatureType;
       if (tguideNotice != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(7, tguideNotice);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveGuideNotice mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 34) {
                      if (i != 42) {
                         if (i != 50) {
                            if (i != 56) {
                               if (!WireFormatNano.parseUnknownField(p0, i)) {
                                  break ;
                               }
                            }else {
                               this.bottomBarFeatureType = p0.readUInt32();
                            }
                         }else {
                            this.buttonKwaiLink = p0.readString();
                         }
                      }else {
                         this.buttonText = p0.readString();
                      }
                   }else {
                      this.desc = p0.readString();
                   }
                }else {
                   this.commentUIType = p0.readUInt32();
                }
             }else {
                this.displayDurationMs = p0.readUInt32();
             }
          }else {
             this.guideNoticeType = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveGuideNotice tguideNotice = this.guideNoticeType;
       if (tguideNotice != null) {
          p0.writeUInt32(1, tguideNotice);
       }
       tguideNotice = this.displayDurationMs;
       if (tguideNotice != null) {
          p0.writeUInt32(2, tguideNotice);
       }
       tguideNotice = this.commentUIType;
       if (tguideNotice != null) {
          p0.writeUInt32(3, tguideNotice);
       }
       String str = "";
       if (!(this.desc).equals(str)) {
          p0.writeString(4, this.desc);
       }
       if (!(this.buttonText).equals(str)) {
          p0.writeString(5, this.buttonText);
       }
       if (!(this.buttonKwaiLink).equals(str)) {
          p0.writeString(6, this.buttonKwaiLink);
       }
       tguideNotice = this.bottomBarFeatureType;
       if (tguideNotice != null) {
          p0.writeUInt32(7, tguideNotice);
       }
       super.writeTo(p0);
       return;
    }
}
