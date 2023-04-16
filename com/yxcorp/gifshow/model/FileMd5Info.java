package com.yxcorp.gifshow.model.FileMd5Info;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class FileMd5Info implements Serializable	// class@001e14
{
    public String mFileName;
    public String mMd5;
    public static final long serialVersionUID = 0xfd40f32fe2b0295e;

    public void FileMd5Info(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, FileMd5Info.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mFileName+": "+this.mMd5;
    }
}
