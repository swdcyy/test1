package com.kuaishou.webkit.WebResourceResponse;
import java.lang.String;
import java.util.Map;
import java.io.InputStream;
import java.lang.Object;
import java.lang.IllegalStateException;
import java.io.StringBufferInputStream;
import java.lang.Class;
import java.lang.IllegalArgumentException;

public class WebResourceResponse	// class@001271
{
    public String mEncoding;
    public boolean mImmutable;
    public InputStream mInputStream;
    public String mMimeType;
    public String mReasonPhrase;
    public Map mResponseHeaders;
    public int mStatusCode;

    public void WebResourceResponse(String p0,String p1,int p2,String p3,Map p4,InputStream p5){
       super(p0, p1, p5);
       this.setStatusCodeAndReasonPhrase(p2, p3);
       this.setResponseHeaders(p4);
    }
    public void WebResourceResponse(String p0,String p1,InputStream p2){
       super();
       this.mMimeType = p0;
       this.mEncoding = p1;
       this.setData(p2);
    }
    public void WebResourceResponse(boolean p0,String p1,String p2,int p3,String p4,Map p5,InputStream p6){
       super();
       this.mImmutable = p0;
       this.mMimeType = p1;
       this.mEncoding = p2;
       this.mStatusCode = p3;
       this.mReasonPhrase = p4;
       this.mResponseHeaders = p5;
       this.mInputStream = p6;
    }
    public final void checkImmutable(){
       if (this.mImmutable == null) {
          return;
       }
       throw new IllegalStateException("This WebResourceResponse instance is immutable");
    }
    public InputStream getData(){
       return this.mInputStream;
    }
    public String getEncoding(){
       return this.mEncoding;
    }
    public String getMimeType(){
       return this.mMimeType;
    }
    public String getReasonPhrase(){
       return this.mReasonPhrase;
    }
    public Map getResponseHeaders(){
       return this.mResponseHeaders;
    }
    public int getStatusCode(){
       return this.mStatusCode;
    }
    public void setData(InputStream p0){
       this.checkImmutable();
       if (p0 != null && StringBufferInputStream.class.isAssignableFrom(p0.getClass())) {
          throw new IllegalArgumentException("StringBufferInputStream is deprecated and must not be passed to a WebResourceResponse");
       }
       this.mInputStream = p0;
       return;
    }
    public void setEncoding(String p0){
       this.checkImmutable();
       this.mEncoding = p0;
    }
    public void setMimeType(String p0){
       this.checkImmutable();
       this.mMimeType = p0;
    }
    public void setResponseHeaders(Map p0){
       this.checkImmutable();
       this.mResponseHeaders = p0;
    }
    public void setStatusCodeAndReasonPhrase(int p0,String p1){
       this.checkImmutable();
       if (p0 < 100) {
          throw new IllegalArgumentException("statusCode can\'t be less than 100.");
       }
       if (p0 > 599) {
          throw new IllegalArgumentException("statusCode can\'t be greater than 599.");
       }
       if (p0 > 299 && p0 < 400) {
          throw new IllegalArgumentException("statusCode can\'t be in the [300, 399] range.");
       }
       if (p1 == null) {
          throw new IllegalArgumentException("reasonPhrase can\'t be null.");
       }
       if ((p1.trim()).isEmpty()) {
          throw new IllegalArgumentException("reasonPhrase can\'t be empty.");
       }
       int i = 0;
       while (true) {
          if (i < p1.length()) {
             if (p1.charAt(i) <= 127) {
                i = i + 1;
             }else {
                break ;
             }
          }else {
             this.mStatusCode = p0;
             this.mReasonPhrase = p1;
             return;
          }
       }
       throw new IllegalArgumentException("reasonPhrase can\'t contain non-ASCII characters.");
    }
}
