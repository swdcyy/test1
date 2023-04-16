package com.kuaishou.livestream.message.nano.LiveAdSocialMessages$LiveAdSocialConversionTask;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveAdSocialMessages$LiveAdSocialConversionTask extends MessageNano	// class@0010e9
{
    public boolean conversionEnabled;
    public long conversionId;
    public long conversionLaunchedOnTime;
    public int conversionType;
    public long conversionTypeInt;
    public String entranceInfo;
    public int exceptionHandleStrategy;
    public long longMaxDelayMs;
    public long maxDelayMs;
    public long sceneId;
    public int sourceType;
    public String url;
    public long version;
    public static LiveAdSocialMessages$LiveAdSocialConversionTask[] _emptyArray;

    public void LiveAdSocialMessages$LiveAdSocialConversionTask(){
       super();
       this.clear();
    }
    public static LiveAdSocialMessages$LiveAdSocialConversionTask[] emptyArray(){
       if (LiveAdSocialMessages$LiveAdSocialConversionTask._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveAdSocialMessages$LiveAdSocialConversionTask._emptyArray == null) {
             LiveAdSocialMessages$LiveAdSocialConversionTask[] liveAdSocial = new LiveAdSocialMessages$LiveAdSocialConversionTask[0];
             LiveAdSocialMessages$LiveAdSocialConversionTask._emptyArray = liveAdSocial;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveAdSocialMessages$LiveAdSocialConversionTask._emptyArray;
    }
    public static LiveAdSocialMessages$LiveAdSocialConversionTask parseFrom(CodedInputByteBufferNano p0){
       return new LiveAdSocialMessages$LiveAdSocialConversionTask().mergeFrom(p0);
    }
    public static LiveAdSocialMessages$LiveAdSocialConversionTask parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveAdSocialMessages$LiveAdSocialConversionTask(), p0);
    }
    public LiveAdSocialMessages$LiveAdSocialConversionTask clear(){
       this.conversionEnabled = false;
       this.conversionId = 0;
       this.version = 0;
       this.conversionType = 0;
       this.url = "";
       this.sourceType = 0;
       this.sceneId = 0;
       this.exceptionHandleStrategy = 0;
       this.maxDelayMs = 0;
       this.conversionTypeInt = 0;
       this.entranceInfo = "";
       this.longMaxDelayMs = 0;
       this.conversionLaunchedOnTime = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveAdSocialMessages$LiveAdSocialConversionTask tconversionE = this.conversionEnabled;
       if (tconversionE != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(1, tconversionE);
       }
       tconversionE = this.conversionId;
       int i1 = 0;
       if (tconversionE - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tconversionE);
       }
       tconversionE = this.version;
       if (tconversionE - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tconversionE);
       }
       tconversionE = this.conversionType;
       if (tconversionE != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(4, tconversionE);
       }
       String str = "";
       if (!(this.url).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.url);
       }
       tconversionE = this.sourceType;
       if (tconversionE != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(6, tconversionE);
       }
       LiveAdSocialMessages$LiveAdSocialConversionTask tsceneId = this.sceneId;
       if (tsceneId - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(7, tsceneId);
       }
       tconversionE = this.exceptionHandleStrategy;
       if (tconversionE != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(8, tconversionE);
       }
       tsceneId = this.maxDelayMs;
       if (tsceneId - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(9, tsceneId);
       }
       tsceneId = this.conversionTypeInt;
       if (tsceneId - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(10, tsceneId);
       }
       if (!(this.entranceInfo).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(11, this.entranceInfo);
       }
       tconversionE = this.longMaxDelayMs;
       if (tconversionE - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(12, tconversionE);
       }
       tconversionE = this.conversionLaunchedOnTime;
       if (tconversionE - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(13, tconversionE);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveAdSocialMessages$LiveAdSocialConversionTask mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          int i1 = 1;
          switch (i){
              case 0:
                return this;
              case 8:
                this.conversionEnabled = p0.readBool();
                break;
              case 16:
                this.conversionId = p0.readUInt64();
                break;
              case 24:
                this.version = p0.readUInt64();
                break;
              case 32:
                i = p0.readInt32();
                if (i && (i != i1 && (i != 2 && (i != 3 && (i != 5 && i != 6))))) {
                   continue ;
                }else {
                   this.conversionType = i;
                }
                break;
              case '*':
                this.url = p0.readString();
                break;
              case '0':
                i = p0.readInt32();
                switch (i){
                    case 0:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
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
                    case '+':
                    case ',':
                    case 1:
                      break;
                    default:
                }
                this.sourceType = i;
                break;
              case '8':
                this.sceneId = p0.readUInt64();
                break;
              case '@':
                i = p0.readInt32();
                if (i && i != i1) {
                   continue ;
                }else {
                   this.exceptionHandleStrategy = i;
                }
                break;
              case 'H':
                this.maxDelayMs = p0.readUInt64();
                break;
              case 'P':
                this.conversionTypeInt = p0.readUInt64();
                break;
              case 'Z':
                this.entranceInfo = p0.readString();
                break;
              case '`':
                this.longMaxDelayMs = p0.readUInt64();
                break;
              case 'h':
                this.conversionLaunchedOnTime = p0.readUInt64();
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
       LiveAdSocialMessages$LiveAdSocialConversionTask tconversionE = this.conversionEnabled;
       if (tconversionE != null) {
          p0.writeBool(1, tconversionE);
       }
       tconversionE = this.conversionId;
       int i = 0;
       if (tconversionE - i) {
          p0.writeUInt64(2, tconversionE);
       }
       tconversionE = this.version;
       if (tconversionE - i) {
          p0.writeUInt64(3, tconversionE);
       }
       tconversionE = this.conversionType;
       if (tconversionE != null) {
          p0.writeInt32(4, tconversionE);
       }
       String str = "";
       if (!(this.url).equals(str)) {
          p0.writeString(5, this.url);
       }
       tconversionE = this.sourceType;
       if (tconversionE != null) {
          p0.writeInt32(6, tconversionE);
       }
       LiveAdSocialMessages$LiveAdSocialConversionTask tsceneId = this.sceneId;
       if (tsceneId - i) {
          p0.writeUInt64(7, tsceneId);
       }
       tconversionE = this.exceptionHandleStrategy;
       if (tconversionE != null) {
          p0.writeInt32(8, tconversionE);
       }
       tsceneId = this.maxDelayMs;
       if (tsceneId - i) {
          p0.writeUInt64(9, tsceneId);
       }
       tsceneId = this.conversionTypeInt;
       if (tsceneId - i) {
          p0.writeUInt64(10, tsceneId);
       }
       if (!(this.entranceInfo).equals(str)) {
          p0.writeString(11, this.entranceInfo);
       }
       tconversionE = this.longMaxDelayMs;
       if (tconversionE - i) {
          p0.writeUInt64(12, tconversionE);
       }
       tconversionE = this.conversionLaunchedOnTime;
       if (tconversionE - i) {
          p0.writeUInt64(13, tconversionE);
       }
       super.writeTo(p0);
       return;
    }
}
