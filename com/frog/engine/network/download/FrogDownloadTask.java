package com.frog.engine.network.download.FrogDownloadTask;
import java.lang.Object;
import java.lang.String;
import java.util.Map;

public class FrogDownloadTask	// class@00154c
{
    public String filePath;
    public Map header;
    public String ksFilePath;
    public long timeout;
    public String url;

    public void FrogDownloadTask(){
       super();
       this.timeout = 0xea60;
    }
    public String getFilePath(){
       return this.filePath;
    }
    public Map getHeader(){
       return this.header;
    }
    public String getKsFilePath(){
       return this.ksFilePath;
    }
    public long getTimeout(){
       return this.timeout;
    }
    public String getUrl(){
       return this.url;
    }
    public void setFilePath(String p0){
       this.filePath = p0;
    }
    public void setHeader(Map p0){
       this.header = p0;
    }
    public void setKsFilePath(String p0){
       this.ksFilePath = p0;
    }
    public void setTimeout(long p0){
       this.timeout = p0;
    }
    public void setUrl(String p0){
       this.url = p0;
    }
}
