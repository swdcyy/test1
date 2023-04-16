package com.kwai.video.ksuploaderkit.KSUploaderKitSegmentInfo;
import java.lang.String;
import java.lang.Object;

public class KSUploaderKitSegmentInfo	// class@000981
{
    public long crc32;
    public int durationMs;
    public byte[] editorMetadata;
    public long endPos;
    public String filePath;
    public int index;
    public long startPos;

    public void KSUploaderKitSegmentInfo(String p0,int p1,int p2){
       super();
       this.filePath = p0;
       this.index = p1;
       this.durationMs = p2;
       this.startPos = -1;
       this.endPos = -1;
    }
    public long getCrc32(){
       return this.crc32;
    }
    public int getDurationMs(){
       return this.durationMs;
    }
    public byte[] getEditorMetadata(){
       return this.editorMetadata;
    }
    public long getEndPos(){
       return this.endPos;
    }
    public String getFilePath(){
       return this.filePath;
    }
    public int getIndex(){
       return this.index;
    }
    public long getStartPos(){
       return this.startPos;
    }
    public void setCrc32(long p0){
       this.crc32 = p0;
    }
    public void setEditorMetadata(byte[] p0){
       this.editorMetadata = p0;
    }
    public void setRange(long p0,long p1){
       this.startPos = p0;
       this.endPos = p1;
    }
}
