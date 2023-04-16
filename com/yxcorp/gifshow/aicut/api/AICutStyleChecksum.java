package com.yxcorp.gifshow.aicut.api.AICutStyleChecksum;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class AICutStyleChecksum implements Serializable	// class@00194b
{
    public String mCheckSum;
    public String mId;
    public static final long serialVersionUID = 0x6780ef35437a012e;

    public void AICutStyleChecksum(){
       super();
       this.mId = "";
       this.mCheckSum = "";
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, AICutStyleChecksum.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "mId="+this.mId+" mCheckSum="+this.mCheckSum;
    }
}
