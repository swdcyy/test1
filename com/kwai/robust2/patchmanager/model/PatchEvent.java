package com.kwai.robust2.patchmanager.model.PatchEvent;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.IllegalArgumentException;

public class PatchEvent implements Serializable	// class@001422
{
    public String currentPatchId;
    public String eventType;
    public String robustId;
    public static final long serialVersionUID = 0x58c7e86eb8507aaf;

    public void PatchEvent(String p0,String p1,String p2){
       super();
       this.eventType = p0;
       this.robustId = p1;
       this.currentPatchId = p2;
    }
    public static PatchEvent newInstance(String p0,String p1,String p2){
       if (TextUtils.isEmpty(p1)) {
          throw new IllegalArgumentException("robustId is empty");
       }
       if (TextUtils.isEmpty(p2)) {
          p2 = "";
       }
       return new PatchEvent(p0, p1, p2);
    }
}
