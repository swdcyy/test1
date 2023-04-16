package com.kuaishou.edit.draft.AuditFrame$b;
import z30.k;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.AuditFrame;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.AuditFrame$a;
import java.lang.String;
import com.kuaishou.edit.draft.FaceInfo;
import java.util.List;
import java.util.Collections;
import com.google.protobuf.ByteString;

public final class AuditFrame$b extends GeneratedMessageLite$Builder implements k	// class@00172e
{

    public void AuditFrame$b(){
       super(AuditFrame.DEFAULT_INSTANCE);
    }
    public void AuditFrame$b(AuditFrame$a p0){
       super(AuditFrame.DEFAULT_INSTANCE);
    }
    public AuditFrame$b a(String p0){
       this.copyOnWrite();
       this.instance.setFile(p0);
       return this;
    }
    public AuditFrame$b b(String p0){
       this.copyOnWrite();
       this.instance.setJsonFile(p0);
       return this;
    }
    public FaceInfo getFaceInfo(int p0){
       return this.instance.getFaceInfo(p0);
    }
    public int getFaceInfoCount(){
       return this.instance.getFaceInfoCount();
    }
    public List getFaceInfoList(){
       return Collections.unmodifiableList(this.instance.getFaceInfoList());
    }
    public String getFile(){
       return this.instance.getFile();
    }
    public ByteString getFileBytes(){
       return this.instance.getFileBytes();
    }
    public String getJsonFile(){
       return this.instance.getJsonFile();
    }
    public ByteString getJsonFileBytes(){
       return this.instance.getJsonFileBytes();
    }
}
