package com.kwai.video.clipkit.ClipExportException;
import java.lang.Exception;
import java.lang.String;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$EditorSdkError;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Number;

public class ClipExportException extends Exception	// class@001a06
{
    public final int errorCode;
    public final int errorType;

    public void ClipExportException(int p0,int p1,String p2){
       super(p2);
       this.errorType = p0;
       this.errorCode = p1;
    }
    public void ClipExportException(EditorSdk2$EditorSdkError p0){
       super(p0.message());
       this.errorType = p0.type();
       this.errorCode = p0.code();
    }
    public void ClipExportException(String p0,int p1,int p2,String p3){
       super(p1, p2, ClipExportException.generateMessage(p0, p2, p3));
    }
    public static String generateMessage(String p0,int p1,String p2){
       if (PatchProxy.isSupport(ClipExportException.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, null, ClipExportException.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       p0 = p0+" failed with exit code "+p1;
       if (!TextUtils.isEmpty(p2)) {
          p0 = p0+", message: "+p2;
       }
       return p0;
    }
    public int handleError(){
       Object obj = PatchProxy.apply(null, this, ClipExportException.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 3;
       if (!this.isErrorInArray((- this.errorCode), new int[i]{2,17,'M'})) {
          ClipExportException terrorCode = this.errorCode;
          if (terrorCode != -20002 && terrorCode != -100001) {
             if (this.errorType != i && (terrorCode == -12 || terrorCode == -100002)) {
                return 2;
             }else if(terrorCode == -20001){
                return i;
             }else if(terrorCode == -28){
                return 4;
             }else if(terrorCode == -36){
                return 5;
             }else if(terrorCode == -100003){
                return 6;
             }else {
                return 7;
             }
          }
       }
       return 1;
    }
    public final boolean isErrorInArray(int p0,int[] p1){
       int i = 0;
       while (true) {
          if (i >= p1.length) {
             return false;
          }
          if (p1[i] == p0) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return true;
    }
}
