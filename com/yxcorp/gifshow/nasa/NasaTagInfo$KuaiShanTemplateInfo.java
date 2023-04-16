package com.yxcorp.gifshow.nasa.NasaTagInfo$KuaiShanTemplateInfo;
import java.io.Serializable;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class NasaTagInfo$KuaiShanTemplateInfo implements Serializable	// class@0020d0
{
    public final List icons;
    public final String name;
    public final String templateId;

    public void NasaTagInfo$KuaiShanTemplateInfo(String p0,String p1,List p2){
       a.p(p0, "templateId");
       a.p(p1, "name");
       a.p(p2, "icons");
       super();
       this.templateId = p0;
       this.name = p1;
       this.icons = p2;
    }
    public final List getIcons(){
       return this.icons;
    }
    public final String getName(){
       return this.name;
    }
    public final String getTemplateId(){
       return this.templateId;
    }
}
