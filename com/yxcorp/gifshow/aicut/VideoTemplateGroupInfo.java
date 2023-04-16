package com.yxcorp.gifshow.aicut.VideoTemplateGroupInfo;
import java.io.Serializable;
import com.yxcorp.gifshow.aicut.VideoTemplateGroupInfo$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;

public final class VideoTemplateGroupInfo implements Serializable	// class@001942
{
    public final String groupId;
    public final String groupName;
    public final ArrayList templates;
    public final ArrayList titles;
    public static final VideoTemplateGroupInfo$a Companion;
    public static final long serialVersionUID;

    static {
       VideoTemplateGroupInfo.Companion = new VideoTemplateGroupInfo$a(null);
       VideoTemplateGroupInfo.serialVersionUID = 1;
    }
    public void VideoTemplateGroupInfo(){
       super();
       this.groupId = "";
       this.groupName = "";
    }
    public final String getGroupId(){
       return this.groupId;
    }
    public final String getGroupName(){
       return this.groupName;
    }
    public final ArrayList getTemplates(){
       return this.templates;
    }
    public final ArrayList getTitles(){
       return this.titles;
    }
}
