package com.kuaishou.protobuf.livestream.nano.SCLiveOfficialProgrammeDumpAudience;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class SCLiveOfficialProgrammeDumpAudience extends MessageNano	// class@000d69
{
    public int dumpType;
    public long maxDelayMs;
    public long minDelayMs;
    public int notDumpPercent;
    public String officialLiveStreamId;
    public String showLiveStreamId;
    public String tagId;
    public static SCLiveOfficialProgrammeDumpAudience[] _emptyArray;

    public void SCLiveOfficialProgrammeDumpAudience(){
       super();
       this.clear();
    }
    public static SCLiveOfficialProgrammeDumpAudience[] emptyArray(){
       if (SCLiveOfficialProgrammeDumpAudience._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveOfficialProgrammeDumpAudience._emptyArray == null) {
             SCLiveOfficialProgrammeDumpAudience[] sCLiveOffici = new SCLiveOfficialProgrammeDumpAudience[0];
             SCLiveOfficialProgrammeDumpAudience._emptyArray = sCLiveOffici;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveOfficialProgrammeDumpAudience._emptyArray;
    }
    public static SCLiveOfficialProgrammeDumpAudience parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveOfficialProgrammeDumpAudience().mergeFrom(p0);
    }
    public static SCLiveOfficialProgrammeDumpAudience parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveOfficialProgrammeDumpAudience(), p0);
    }
    public SCLiveOfficialProgrammeDumpAudience clear(){
       this.dumpType = 0;
       this.showLiveStreamId = "";
       this.officialLiveStreamId = "";
       this.minDelayMs = 0;
       this.maxDelayMs = 0;
       this.notDumpPercent = 0;
       this.tagId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCLiveOfficialProgrammeDumpAudience tdumpType = this.dumpType;
       if (tdumpType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tdumpType);
       }
       String str = "";
       if (!(this.showLiveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.showLiveStreamId);
       }
       if (!(this.officialLiveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.officialLiveStreamId);
       }
       SCLiveOfficialProgrammeDumpAudience tminDelayMs = this.minDelayMs;
       if (tminDelayMs) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tminDelayMs);
       }
       tminDelayMs = this.maxDelayMs;
       if (tminDelayMs) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, tminDelayMs);
       }
       tdumpType = this.notDumpPercent;
       if (tdumpType != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(6, tdumpType);
       }
       if (!(this.tagId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.tagId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveOfficialProgrammeDumpAudience mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 32) {
                      if (i != 40) {
                         if (i != 48) {
                            if (i != 58) {
                               if (!WireFormatNano.parseUnknownField(p0, i)) {
                                  break ;
                               }
                            }else {
                               this.tagId = p0.readString();
                            }
                         }else {
                            this.notDumpPercent = p0.readUInt32();
                         }
                      }else {
                         this.maxDelayMs = p0.readUInt64();
                      }
                   }else {
                      this.minDelayMs = p0.readUInt64();
                   }
                }else {
                   this.officialLiveStreamId = p0.readString();
                }
             }else {
                this.showLiveStreamId = p0.readString();
             }
          }else {
             i = p0.readInt32();
             if (i && (i != 1 && i != 2)) {
                continue ;
             }else {
                this.dumpType = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SCLiveOfficialProgrammeDumpAudience tdumpType = this.dumpType;
       if (tdumpType != null) {
          p0.writeInt32(1, tdumpType);
       }
       String str = "";
       if (!(this.showLiveStreamId).equals(str)) {
          p0.writeString(2, this.showLiveStreamId);
       }
       if (!(this.officialLiveStreamId).equals(str)) {
          p0.writeString(3, this.officialLiveStreamId);
       }
       SCLiveOfficialProgrammeDumpAudience tminDelayMs = this.minDelayMs;
       if (tminDelayMs) {
          p0.writeUInt64(4, tminDelayMs);
       }
       tminDelayMs = this.maxDelayMs;
       if (tminDelayMs) {
          p0.writeUInt64(5, tminDelayMs);
       }
       tdumpType = this.notDumpPercent;
       if (tdumpType != null) {
          p0.writeUInt32(6, tdumpType);
       }
       if (!(this.tagId).equals(str)) {
          p0.writeString(7, this.tagId);
       }
       super.writeTo(p0);
       return;
    }
}
