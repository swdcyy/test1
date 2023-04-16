package com.frog.engine.network.upload.FrogUploadTask;
import java.lang.Object;
import java.lang.String;
import java.util.Map;

public class FrogUploadTask	// class@001556
{
    public String filePath;
    public Map formData;
    public Map header;
    public String name;
    public long timeout;
    public String url;

    public void FrogUploadTask(){
       super();
    }
    public String getFilePath(){
       return this.filePath;
    }
    public Map getFormData(){
       return this.formData;
    }
    public Map getHeader(){
       return this.header;
    }
    public String getName(){
       return this.name;
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
    public void setFormData(Map p0){
       this.formData = p0;
    }
    public void setHeader(Map p0){
       this.header = p0;
    }
    public void setName(String p0){
       this.name = p0;
    }
    public void setTimeout(long p0){
       this.timeout = p0;
    }
    public void setUrl(String p0){
       this.url = p0;
    }
}
