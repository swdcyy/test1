package com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$LiveImportMusicPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContentWrapper$LiveImportMusicPackage extends MessageNano	// class@001320
{
    public String importMusicJobId;
    public int matchedMusicCount;
    public String musicListId;
    public int musicListLeftAvailableMusicCount;
    public int musicListOriginalMusicCount;
    public int selectedMatchedMusicCount;
    public static ClientContentWrapper$LiveImportMusicPackage[] _emptyArray;

    public void ClientContentWrapper$LiveImportMusicPackage(){
       super();
       this.clear();
    }
    public static ClientContentWrapper$LiveImportMusicPackage[] emptyArray(){
       if (ClientContentWrapper$LiveImportMusicPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContentWrapper$LiveImportMusicPackage._emptyArray == null) {
             ClientContentWrapper$LiveImportMusicPackage[] liveImportMu = new ClientContentWrapper$LiveImportMusicPackage[0];
             ClientContentWrapper$LiveImportMusicPackage._emptyArray = liveImportMu;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContentWrapper$LiveImportMusicPackage._emptyArray;
    }
    public static ClientContentWrapper$LiveImportMusicPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContentWrapper$LiveImportMusicPackage().mergeFrom(p0);
    }
    public static ClientContentWrapper$LiveImportMusicPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContentWrapper$LiveImportMusicPackage(), p0);
    }
    public ClientContentWrapper$LiveImportMusicPackage clear(){
       this.selectedMatchedMusicCount = 0;
       this.matchedMusicCount = 0;
       this.musicListLeftAvailableMusicCount = 0;
       this.musicListOriginalMusicCount = 0;
       this.musicListId = "";
       this.importMusicJobId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContentWrapper$LiveImportMusicPackage tselectedMat = this.selectedMatchedMusicCount;
       if (tselectedMat != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, tselectedMat);
       }
       tselectedMat = this.matchedMusicCount;
       if (tselectedMat != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, tselectedMat);
       }
       tselectedMat = this.musicListLeftAvailableMusicCount;
       if (tselectedMat != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, tselectedMat);
       }
       tselectedMat = this.musicListOriginalMusicCount;
       if (tselectedMat != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(4, tselectedMat);
       }
       String str = "";
       if (!(this.musicListId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.musicListId);
       }
       if (!(this.importMusicJobId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.importMusicJobId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContentWrapper$LiveImportMusicPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 32) {
                      if (i != 42) {
                         if (i != 50) {
                            if (!WireFormatNano.parseUnknownField(p0, i)) {
                               break ;
                            }
                         }else {
                            this.importMusicJobId = p0.readString();
                         }
                      }else {
                         this.musicListId = p0.readString();
                      }
                   }else {
                      this.musicListOriginalMusicCount = p0.readUInt32();
                   }
                }else {
                   this.musicListLeftAvailableMusicCount = p0.readUInt32();
                }
             }else {
                this.matchedMusicCount = p0.readUInt32();
             }
          }else {
             this.selectedMatchedMusicCount = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientContentWrapper$LiveImportMusicPackage tselectedMat = this.selectedMatchedMusicCount;
       if (tselectedMat != null) {
          p0.writeUInt32(1, tselectedMat);
       }
       tselectedMat = this.matchedMusicCount;
       if (tselectedMat != null) {
          p0.writeUInt32(2, tselectedMat);
       }
       tselectedMat = this.musicListLeftAvailableMusicCount;
       if (tselectedMat != null) {
          p0.writeUInt32(3, tselectedMat);
       }
       tselectedMat = this.musicListOriginalMusicCount;
       if (tselectedMat != null) {
          p0.writeUInt32(4, tselectedMat);
       }
       String str = "";
       if (!(this.musicListId).equals(str)) {
          p0.writeString(5, this.musicListId);
       }
       if (!(this.importMusicJobId).equals(str)) {
          p0.writeString(6, this.importMusicJobId);
       }
       super.writeTo(p0);
       return;
    }
}
