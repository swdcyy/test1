package com.kuaishou.client.log.stat.packages.nano.ClientStat$EditorSdkStatEvent;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$EditorSdkErrorStats;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$EditorSdkThumbnailGeneratorStats;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$EditorSdkPreviewPlayerStats;

public final class ClientStat$EditorSdkStatEvent extends MessageNano	// class@0007c3
{
    public ClientStat$EditorSdkErrorStats[] errorStats;
    public ClientStat$EditorSdkPreviewPlayerStats previewPlayerStats;
    public String statsSessionId;
    public ClientStat$EditorSdkThumbnailGeneratorStats thumbnailGeneratorStats;
    public ClientEvent$UrlPackage urlPackage;
    public static ClientStat$EditorSdkStatEvent[] _emptyArray;

    public void ClientStat$EditorSdkStatEvent(){
       super();
       this.clear();
    }
    public static ClientStat$EditorSdkStatEvent[] emptyArray(){
       if (ClientStat$EditorSdkStatEvent._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$EditorSdkStatEvent._emptyArray == null) {
             ClientStat$EditorSdkStatEvent[] uEditorSdkSt = new ClientStat$EditorSdkStatEvent[0];
             ClientStat$EditorSdkStatEvent._emptyArray = uEditorSdkSt;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$EditorSdkStatEvent._emptyArray;
    }
    public static ClientStat$EditorSdkStatEvent parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$EditorSdkStatEvent().mergeFrom(p0);
    }
    public static ClientStat$EditorSdkStatEvent parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$EditorSdkStatEvent(), p0);
    }
    public ClientStat$EditorSdkStatEvent clear(){
       this.previewPlayerStats = null;
       this.thumbnailGeneratorStats = null;
       this.statsSessionId = "";
       this.urlPackage = null;
       this.errorStats = ClientStat$EditorSdkErrorStats.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientStat$EditorSdkStatEvent tpreviewPlay = this.previewPlayerStats;
       if (tpreviewPlay != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tpreviewPlay);
       }
       tpreviewPlay = this.thumbnailGeneratorStats;
       if (tpreviewPlay != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tpreviewPlay);
       }
       if (!(this.statsSessionId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.statsSessionId);
       }
       tpreviewPlay = this.urlPackage;
       if (tpreviewPlay != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(4, tpreviewPlay);
       }
       tpreviewPlay = this.errorStats;
       if (tpreviewPlay != null && tpreviewPlay.length > 0) {
          int i1 = 0;
          ClientStat$EditorSdkStatEvent terrorStats = this.errorStats;
          while (i1 < terrorStats.length) {
             object oobject = terrorStats[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(5, oobject);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$EditorSdkStatEvent mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 34) {
                      int i1 = 42;
                      if (i != i1) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                         ClientStat$EditorSdkStatEvent terrorStats = this.errorStats;
                         int i2 = (terrorStats == null)? 0: terrorStats.length;
                         i = i + i2;
                         ClientStat$EditorSdkErrorStats[] uEditorSdkEr = new ClientStat$EditorSdkErrorStats[i];
                         if (i2) {
                            System.arraycopy(terrorStats, 0, uEditorSdkEr, 0, i2);
                         }
                         i1 = i - 1;
                         while (i2 < i1) {
                            uEditorSdkEr[i2] = new ClientStat$EditorSdkErrorStats();
                            p0.readMessage(uEditorSdkEr[i2]);
                            p0.readTag();
                            i2 = i2 + 1;
                         }
                         uEditorSdkEr[i2] = new ClientStat$EditorSdkErrorStats();
                         p0.readMessage(uEditorSdkEr[i2]);
                         this.errorStats = uEditorSdkEr;
                      }
                   }else if(this.urlPackage == null){
                      this.urlPackage = new ClientEvent$UrlPackage();
                   }
                   p0.readMessage(this.urlPackage);
                }else {
                   this.statsSessionId = p0.readString();
                }
             }else if(this.thumbnailGeneratorStats == null){
                this.thumbnailGeneratorStats = new ClientStat$EditorSdkThumbnailGeneratorStats();
             }
             p0.readMessage(this.thumbnailGeneratorStats);
          }else if(this.previewPlayerStats == null){
             this.previewPlayerStats = new ClientStat$EditorSdkPreviewPlayerStats();
          }
          p0.readMessage(this.previewPlayerStats);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientStat$EditorSdkStatEvent tpreviewPlay = this.previewPlayerStats;
       if (tpreviewPlay != null) {
          p0.writeMessage(1, tpreviewPlay);
       }
       tpreviewPlay = this.thumbnailGeneratorStats;
       if (tpreviewPlay != null) {
          p0.writeMessage(2, tpreviewPlay);
       }
       if (!(this.statsSessionId).equals("")) {
          p0.writeString(3, this.statsSessionId);
       }
       tpreviewPlay = this.urlPackage;
       if (tpreviewPlay != null) {
          p0.writeMessage(4, tpreviewPlay);
       }
       tpreviewPlay = this.errorStats;
       if (tpreviewPlay != null && tpreviewPlay.length > 0) {
          int i = 0;
          ClientStat$EditorSdkStatEvent terrorStats = this.errorStats;
          while (i < terrorStats.length) {
             object oobject = terrorStats[i];
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
