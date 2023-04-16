package com.kuaishou.webkit.MimeTypeMap;
import java.lang.Object;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.regex.Pattern;
import com.kuaishou.webkit.MimeUtils;
import com.kuaishou.webkit.URLUtil;

public class MimeTypeMap	// class@001252
{
    public static final MimeTypeMap sMimeTypeMap;

    static {
       MimeTypeMap.sMimeTypeMap = new MimeTypeMap();
    }
    public void MimeTypeMap(){
       super();
    }
    public static String getFileExtensionFromUrl(String p0){
       if (!TextUtils.isEmpty(p0)) {
          int i = p0.lastIndexOf(35);
          if (i > 0) {
             p0 = p0.substring(0, i);
          }
          i = p0.lastIndexOf(63);
          if (i > 0) {
             p0 = p0.substring(0, i);
          }
          i = p0.lastIndexOf(47);
          if (i >= 0) {
             p0 = p0.substring((i + 1));
          }
          if (!p0.isEmpty() && Pattern.matches("[a-zA-Z_0-9\\.\\-\\\(\\\)\\%]+", p0)) {
             i = p0.lastIndexOf(46);
             if (i >= 0) {
                return p0.substring((i + 1));
             }
          }
       }
    label_004a :
       return "";
    }
    public static MimeTypeMap getSingleton(){
       return MimeTypeMap.sMimeTypeMap;
    }
    public static String mimeTypeFromExtension(String p0){
       return MimeUtils.guessMimeTypeFromExtension(p0);
    }
    public String getExtensionFromMimeType(String p0){
       return MimeUtils.guessExtensionFromMimeType(p0);
    }
    public String getMimeTypeFromExtension(String p0){
       return MimeUtils.guessMimeTypeFromExtension(p0);
    }
    public boolean hasExtension(String p0){
       return MimeUtils.hasExtension(p0);
    }
    public boolean hasMimeType(String p0){
       return MimeUtils.hasMimeType(p0);
    }
    public String remapGenericMimeType(String p0,String p1,String p2){
       String str = "text/plain";
       if (str.equals(p0) || ("application/octet-stream").equals(p0)) {
          str = null;
          if (p2 != null) {
             str = URLUtil.parseContentDisposition(p2);
          }
          if (str != null) {
             p1 = str;
          }
          p1 = this.getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(p1));
          if (p1 != null) {
             p0 = p1;
          }
       }else if(("text/vnd.wap.wml").equals(p0)){
          p0 = str;
       }else if(("application/vnd.wap.xhtml+xml").equals(p0)){
          p0 = "application/xhtml+xml";
       }
       return p0;
    }
}
