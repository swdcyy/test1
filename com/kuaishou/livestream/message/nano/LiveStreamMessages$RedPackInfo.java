package com.kuaishou.livestream.message.nano.LiveStreamMessages$RedPackInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveCustomRedPackSkinMessage$CustomRedPackSkinTheme;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class LiveStreamMessages$RedPackInfo extends MessageNano	// class@00131f
{
    public UserInfos$UserInfo author;
    public long balance;
    public long closeTime;
    public int coverType;
    public long currentTime;
    public LiveCustomRedPackSkinMessage$CustomRedPackSkinTheme customRedPackSkinTheme;
    public String globalRedPackIdentity;
    public String grabToken;
    public String id;
    public long luckiestDelayMillis;
    public long maxRequestDelayMillis;
    public boolean needSendRequest;
    public long openTime;
    public long redPackId;
    public int redPackType;
    public long requestDelayMillis;
    public static LiveStreamMessages$RedPackInfo[] _emptyArray;

    public void LiveStreamMessages$RedPackInfo(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$RedPackInfo[] emptyArray(){
       if (LiveStreamMessages$RedPackInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$RedPackInfo._emptyArray == null) {
             LiveStreamMessages$RedPackInfo[] redPackInfoA = new LiveStreamMessages$RedPackInfo[0];
             LiveStreamMessages$RedPackInfo._emptyArray = redPackInfoA;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$RedPackInfo._emptyArray;
    }
    public static LiveStreamMessages$RedPackInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$RedPackInfo().mergeFrom(p0);
    }
    public static LiveStreamMessages$RedPackInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$RedPackInfo(), p0);
    }
    public LiveStreamMessages$RedPackInfo clear(){
       this.author = null;
       this.redPackId = 0;
       this.balance = 0;
       this.openTime = 0;
       this.currentTime = 0;
       this.grabToken = "";
       this.needSendRequest = false;
       this.requestDelayMillis = 0;
       this.luckiestDelayMillis = 0;
       this.id = "";
       this.coverType = 0;
       this.redPackType = 0;
       this.closeTime = 0;
       this.maxRequestDelayMillis = 0;
       this.globalRedPackIdentity = "";
       this.customRedPackSkinTheme = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$RedPackInfo tauthor = this.author;
       if (tauthor != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tauthor);
       }
       tauthor = this.redPackId;
       if (tauthor) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tauthor);
       }
       tauthor = this.balance;
       if (tauthor) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tauthor);
       }
       tauthor = this.openTime;
       if (tauthor) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tauthor);
       }
       tauthor = this.currentTime;
       if (tauthor) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, tauthor);
       }
       String str = "";
       if (!(this.grabToken).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.grabToken);
       }
       tauthor = this.needSendRequest;
       if (tauthor != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(11, tauthor);
       }
       LiveStreamMessages$RedPackInfo trequestDela = this.requestDelayMillis;
       if (trequestDela) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(12, trequestDela);
       }
       trequestDela = this.luckiestDelayMillis;
       if (trequestDela) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(13, trequestDela);
       }
       if (!(this.id).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(14, this.id);
       }
       tauthor = this.coverType;
       if (tauthor != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(15, tauthor);
       }
       tauthor = this.redPackType;
       if (tauthor != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(16, tauthor);
       }
       trequestDela = this.closeTime;
       if (trequestDela) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(17, trequestDela);
       }
       trequestDela = this.maxRequestDelayMillis;
       if (trequestDela) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(18, trequestDela);
       }
       if (!(this.globalRedPackIdentity).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(19, this.globalRedPackIdentity);
       }
       tauthor = this.customRedPackSkinTheme;
       if (tauthor != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(20, tauthor);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$RedPackInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                if (this.author == null) {
                   this.author = new UserInfos$UserInfo();
                }
                p0.readMessage(this.author);
                break;
              case 16:
                this.redPackId = p0.readUInt64();
                break;
              case 24:
                this.balance = p0.readUInt64();
                break;
              case 32:
                this.openTime = p0.readUInt64();
                break;
              case '(':
                this.currentTime = p0.readUInt64();
                break;
              case 'R':
                this.grabToken = p0.readString();
                break;
              case 'X':
                this.needSendRequest = p0.readBool();
                break;
              case '`':
                this.requestDelayMillis = p0.readUInt64();
                break;
              case 'h':
                this.luckiestDelayMillis = p0.readUInt64();
                break;
              case 'r':
                this.id = p0.readString();
                break;
              case 'x':
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   continue ;
                }else {
                   this.coverType = i;
                }
                break;
              case 128:
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   switch (i){
                       case 11:
                       case 13:
                       case 14:
                       case 15:
                       case 16:
                       case 17:
                       case 18:
                       case 19:
                       case 20:
                       case 21:
                       case 22:
                       case 23:
                       case 24:
                       case 25:
                       case 26:
                       case 27:
                       case 28:
                       case 29:
                       case 30:
                       case 31:
                       case 32:
                       case '!':
                       case '"':
                       case '#':
                       case '$':
                       case '%':
                       case '&':
                       case 39:
                       case '(':
                       case ')':
                       case '*':
                       case '+':
                       case ',':
                       case '-':
                       case '.':
                       case '/':
                       case '0':
                       case 12:
                         break;
                       default:
                   }
                }
                this.redPackType = i;
                break;
              case 136:
                this.closeTime = p0.readUInt64();
                break;
              case 144:
                this.maxRequestDelayMillis = p0.readUInt64();
                break;
              case 154:
                this.globalRedPackIdentity = p0.readString();
                break;
              case 162:
                if (this.customRedPackSkinTheme == null) {
                   this.customRedPackSkinTheme = new LiveCustomRedPackSkinMessage$CustomRedPackSkinTheme();
                }
                p0.readMessage(this.customRedPackSkinTheme);
                break;
              default:
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   return this;
                }
                continue ;
          }
       }
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStreamMessages$RedPackInfo tauthor = this.author;
       if (tauthor != null) {
          p0.writeMessage(1, tauthor);
       }
       tauthor = this.redPackId;
       if (tauthor) {
          p0.writeUInt64(2, tauthor);
       }
       tauthor = this.balance;
       if (tauthor) {
          p0.writeUInt64(3, tauthor);
       }
       tauthor = this.openTime;
       if (tauthor) {
          p0.writeUInt64(4, tauthor);
       }
       tauthor = this.currentTime;
       if (tauthor) {
          p0.writeUInt64(5, tauthor);
       }
       String str = "";
       if (!(this.grabToken).equals(str)) {
          p0.writeString(10, this.grabToken);
       }
       tauthor = this.needSendRequest;
       if (tauthor != null) {
          p0.writeBool(11, tauthor);
       }
       LiveStreamMessages$RedPackInfo trequestDela = this.requestDelayMillis;
       if (trequestDela) {
          p0.writeUInt64(12, trequestDela);
       }
       trequestDela = this.luckiestDelayMillis;
       if (trequestDela) {
          p0.writeUInt64(13, trequestDela);
       }
       if (!(this.id).equals(str)) {
          p0.writeString(14, this.id);
       }
       tauthor = this.coverType;
       if (tauthor != null) {
          p0.writeInt32(15, tauthor);
       }
       tauthor = this.redPackType;
       if (tauthor != null) {
          p0.writeInt32(16, tauthor);
       }
       trequestDela = this.closeTime;
       if (trequestDela) {
          p0.writeUInt64(17, trequestDela);
       }
       trequestDela = this.maxRequestDelayMillis;
       if (trequestDela) {
          p0.writeUInt64(18, trequestDela);
       }
       if (!(this.globalRedPackIdentity).equals(str)) {
          p0.writeString(19, this.globalRedPackIdentity);
       }
       tauthor = this.customRedPackSkinTheme;
       if (tauthor != null) {
          p0.writeMessage(20, tauthor);
       }
       super.writeTo(p0);
       return;
    }
}
