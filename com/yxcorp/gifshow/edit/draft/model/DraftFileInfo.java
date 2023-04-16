package com.yxcorp.gifshow.edit.draft.model.DraftFileInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.StringBuilder;

public class DraftFileInfo implements Serializable	// class@001ae7
{
    public final long mFileCount;
    public final long mFileSize;
    public final boolean mIsDirectory;
    public final int mVideoDuration;
    public static final long serialVersionUID = 0x4ecf8cb00320a65b;

    public void DraftFileInfo(long p0,int p1){
       super(p0, p1, false, 1);
    }
    public void DraftFileInfo(long p0,int p1,boolean p2,long p3){
       super();
       this.mFileSize = p0;
       this.mVideoDuration = p1;
       this.mIsDirectory = p2;
       this.mFileCount = p3;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DraftFileInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (super.equals(p0)) {
          return b;
       }
       if (!p0 instanceof DraftFileInfo) {
          return false;
       }
       if (this.mFileSize - p0.mFileSize || (this.mVideoDuration != p0.mVideoDuration || (this.mFileCount - p0.mFileCount || this.mIsDirectory != p0.mIsDirectory))) {
          b = false;
       }
       return b;
    }
    public boolean isValidInfo(){
       boolean b = true;
       if (this.mIsDirectory != null) {
          if (this.mFileSize <= 0 || this.mFileCount <= 0) {
             b = false;
          }
          return b;
       }else if(this.mFileSize > 0 && (this.mVideoDuration > null && this.mFileCount > 0)){
          b = false;
       }
       return b;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, DraftFileInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "DraftFileInfo{mFileSize="+this.mFileSize+", mVideoDuration="+this.mVideoDuration+", mFileCount="+this.mFileCount+", mIsDirectory="+this.mIsDirectory+'}';
    }
}
