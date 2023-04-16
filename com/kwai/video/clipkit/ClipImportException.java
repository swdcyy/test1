package com.kwai.video.clipkit.ClipImportException;
import java.lang.Exception;
import java.lang.String;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$EditorSdkError;

public class ClipImportException extends Exception	// class@001a1e
{
    public int errorCode;
    public int errorType;
    public String inputPath;

    public void ClipImportException(int p0,int p1,String p2){
       super(p2);
       this.errorType = p0;
       this.errorCode = p1;
    }
    public void ClipImportException(EditorSdk2$EditorSdkError p0,String p1){
       String str = (p0 != null)? p0.message(): "unknown";
       super(str);
       if (p0 != null) {
          this.errorType = p0.type();
          this.errorCode = p0.code();
       }
       this.inputPath = p1;
       return;
    }
}
