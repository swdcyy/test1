package com.kuaishou.livestream.message.nano.LivePkMessages$SCPkReopenInvite;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.kuaishou.livestream.message.nano.LivePkMessages$CohesionGameReopenInfo;
import com.google.protobuf.nano.WireFormatNano;
import java.util.Objects;

public final class LivePkMessages$SCPkReopenInvite extends MessageNano	// class@00122e
{
    public String acceptButtonText;
    public String noticeSubtitle;
    public String noticeTitle;
    public String pkId;
    public int reopenSource;
    public int reopenType;
    public int reopenTypeInfoCase_;
    public Object reopenTypeInfo_;
    public long timeoutMillis;
    public long waitReopenInfoTimeoutMillis;
    public static LivePkMessages$SCPkReopenInvite[] _emptyArray;

    public void LivePkMessages$SCPkReopenInvite(){
       super();
       this.reopenTypeInfoCase_ = 0;
       this.clear();
    }
    public static LivePkMessages$SCPkReopenInvite[] emptyArray(){
       if (LivePkMessages$SCPkReopenInvite._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LivePkMessages$SCPkReopenInvite._emptyArray == null) {
             LivePkMessages$SCPkReopenInvite[] sCPkReopenIn = new LivePkMessages$SCPkReopenInvite[0];
             LivePkMessages$SCPkReopenInvite._emptyArray = sCPkReopenIn;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LivePkMessages$SCPkReopenInvite._emptyArray;
    }
    public static LivePkMessages$SCPkReopenInvite parseFrom(CodedInputByteBufferNano p0){
       return new LivePkMessages$SCPkReopenInvite().mergeFrom(p0);
    }
    public static LivePkMessages$SCPkReopenInvite parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LivePkMessages$SCPkReopenInvite(), p0);
    }
    public LivePkMessages$SCPkReopenInvite clear(){
       this.pkId = "";
       this.reopenSource = 0;
       this.timeoutMillis = 0;
       this.waitReopenInfoTimeoutMillis = 0;
       this.noticeTitle = "";
       this.noticeSubtitle = "";
       this.acceptButtonText = "";
       this.reopenType = 0;
       this.clearReopenTypeInfo();
       this.cachedSize = -1;
       return this;
    }
    public LivePkMessages$SCPkReopenInvite clearReopenTypeInfo(){
       this.reopenTypeInfoCase_ = 0;
       this.reopenTypeInfo_ = 0;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.pkId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.pkId);
       }
       LivePkMessages$SCPkReopenInvite treopenSourc = this.reopenSource;
       if (treopenSourc != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, treopenSourc);
       }
       LivePkMessages$SCPkReopenInvite ttimeoutMill = this.timeoutMillis;
       if (ttimeoutMill) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, ttimeoutMill);
       }
       ttimeoutMill = this.waitReopenInfoTimeoutMillis;
       if (ttimeoutMill) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, ttimeoutMill);
       }
       if (!(this.noticeTitle).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.noticeTitle);
       }
       if (!(this.noticeSubtitle).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.noticeSubtitle);
       }
       if (!(this.acceptButtonText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.acceptButtonText);
       }
       treopenSourc = this.reopenType;
       if (treopenSourc != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(8, treopenSourc);
       }
       if (this.reopenTypeInfoCase_ == 9) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(9, this.reopenTypeInfo_);
       }
       return i;
    }
    public LivePkMessages$CohesionGameReopenInfo getCohesionGameInfo(){
       if (this.reopenTypeInfoCase_ == 9) {
          return this.reopenTypeInfo_;
       }
       return null;
    }
    public int getReopenTypeInfoCase(){
       return this.reopenTypeInfoCase_;
    }
    public boolean hasCohesionGameInfo(){
       boolean b = (this.reopenTypeInfoCase_ == 9)? true: false;
       return b;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LivePkMessages$SCPkReopenInvite mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 32) {
                      if (i != 42) {
                         if (i != 50) {
                            if (i != 58) {
                               if (i != 64) {
                                  if (i != 74) {
                                     if (!WireFormatNano.parseUnknownField(p0, i)) {
                                        break ;
                                     }
                                  }else {
                                     int i1 = 9;
                                     if (this.reopenTypeInfoCase_ != i1) {
                                        this.reopenTypeInfo_ = new LivePkMessages$CohesionGameReopenInfo();
                                     }
                                     p0.readMessage(this.reopenTypeInfo_);
                                     this.reopenTypeInfoCase_ = i1;
                                  }
                               }else {
                                  i = p0.readInt32();
                                  if (i && (i != 1 && (i != 2 && i != 3))) {
                                     continue ;
                                  }else {
                                     this.reopenType = i;
                                  }
                               }
                            }else {
                               this.acceptButtonText = p0.readString();
                            }
                         }else {
                            this.noticeSubtitle = p0.readString();
                         }
                      }else {
                         this.noticeTitle = p0.readString();
                      }
                   }else {
                      this.waitReopenInfoTimeoutMillis = p0.readUInt64();
                   }
                }else {
                   this.timeoutMillis = p0.readUInt64();
                }
             }else {
                this.reopenSource = p0.readInt32();
             }
          }else {
             this.pkId = p0.readString();
          }
       }
       return this;
    }
    public LivePkMessages$SCPkReopenInvite setCohesionGameInfo(LivePkMessages$CohesionGameReopenInfo p0){
       Objects.requireNonNull(p0);
       this.reopenTypeInfoCase_ = 9;
       this.reopenTypeInfo_ = p0;
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.pkId).equals(str)) {
          p0.writeString(1, this.pkId);
       }
       LivePkMessages$SCPkReopenInvite treopenSourc = this.reopenSource;
       if (treopenSourc != null) {
          p0.writeInt32(2, treopenSourc);
       }
       LivePkMessages$SCPkReopenInvite ttimeoutMill = this.timeoutMillis;
       if (ttimeoutMill) {
          p0.writeUInt64(3, ttimeoutMill);
       }
       ttimeoutMill = this.waitReopenInfoTimeoutMillis;
       if (ttimeoutMill) {
          p0.writeUInt64(4, ttimeoutMill);
       }
       if (!(this.noticeTitle).equals(str)) {
          p0.writeString(5, this.noticeTitle);
       }
       if (!(this.noticeSubtitle).equals(str)) {
          p0.writeString(6, this.noticeSubtitle);
       }
       if (!(this.acceptButtonText).equals(str)) {
          p0.writeString(7, this.acceptButtonText);
       }
       treopenSourc = this.reopenType;
       if (treopenSourc != null) {
          p0.writeInt32(8, treopenSourc);
       }
       if (this.reopenTypeInfoCase_ == 9) {
          p0.writeMessage(9, this.reopenTypeInfo_);
       }
       super.writeTo(p0);
       return;
    }
}
