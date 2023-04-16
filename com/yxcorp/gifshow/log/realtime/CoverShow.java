package com.yxcorp.gifshow.log.realtime.CoverShow;
import java.lang.Object;
import java.lang.Long;

public class CoverShow	// class@001b2d
{
    public byte[] content;
    public Long id;
    public Long llsid;
    public Long llsidFirstPage;

    public void CoverShow(){
       super();
    }
    public void CoverShow(Long p0,Long p1,byte[] p2,Long p3){
       super();
       this.id = p0;
       this.llsid = p1;
       this.content = p2;
       this.llsidFirstPage = p3;
    }
    public byte[] getContent(){
       return this.content;
    }
    public Long getId(){
       return this.id;
    }
    public Long getLlsid(){
       return this.llsid;
    }
    public Long getLlsidFirstPage(){
       return this.llsidFirstPage;
    }
    public void setContent(byte[] p0){
       this.content = p0;
    }
    public void setId(Long p0){
       this.id = p0;
    }
    public void setLlsid(Long p0){
       this.llsid = p0;
    }
    public void setLlsidFirstPage(Long p0){
       this.llsidFirstPage = p0;
    }
}
