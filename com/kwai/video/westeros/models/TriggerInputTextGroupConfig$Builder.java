package com.kwai.video.westeros.models.TriggerInputTextGroupConfig$Builder;
import com.kwai.video.westeros.models.TriggerInputTextGroupConfigOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.TriggerInputTextGroupConfig;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.TriggerInputTextGroupConfig$1;
import java.lang.String;
import com.google.protobuf.ByteString;

public final class TriggerInputTextGroupConfig$Builder extends GeneratedMessageLite$Builder implements TriggerInputTextGroupConfigOrBuilder	// class@00106b
{

    public void TriggerInputTextGroupConfig$Builder(){
       super(TriggerInputTextGroupConfig.DEFAULT_INSTANCE);
    }
    public void TriggerInputTextGroupConfig$Builder(TriggerInputTextGroupConfig$1 p0){
       super();
    }
    public TriggerInputTextGroupConfig$Builder clearDefaultGroup(){
       this.copyOnWrite();
       this.instance.clearDefaultGroup();
       return this;
    }
    public TriggerInputTextGroupConfig$Builder clearGroupMemberNum(){
       this.copyOnWrite();
       this.instance.clearGroupMemberNum();
       return this;
    }
    public TriggerInputTextGroupConfig$Builder clearGroupName(){
       this.copyOnWrite();
       this.instance.clearGroupName();
       return this;
    }
    public TriggerInputTextGroupConfig$Builder clearMaxGroup(){
       this.copyOnWrite();
       this.instance.clearMaxGroup();
       return this;
    }
    public TriggerInputTextGroupConfig$Builder clearMinGroup(){
       this.copyOnWrite();
       this.instance.clearMinGroup();
       return this;
    }
    public int getDefaultGroup(){
       return this.instance.getDefaultGroup();
    }
    public int getGroupMemberNum(){
       return this.instance.getGroupMemberNum();
    }
    public String getGroupName(){
       return this.instance.getGroupName();
    }
    public ByteString getGroupNameBytes(){
       return this.instance.getGroupNameBytes();
    }
    public int getMaxGroup(){
       return this.instance.getMaxGroup();
    }
    public int getMinGroup(){
       return this.instance.getMinGroup();
    }
    public TriggerInputTextGroupConfig$Builder setDefaultGroup(int p0){
       this.copyOnWrite();
       this.instance.setDefaultGroup(p0);
       return this;
    }
    public TriggerInputTextGroupConfig$Builder setGroupMemberNum(int p0){
       this.copyOnWrite();
       this.instance.setGroupMemberNum(p0);
       return this;
    }
    public TriggerInputTextGroupConfig$Builder setGroupName(String p0){
       this.copyOnWrite();
       this.instance.setGroupName(p0);
       return this;
    }
    public TriggerInputTextGroupConfig$Builder setGroupNameBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setGroupNameBytes(p0);
       return this;
    }
    public TriggerInputTextGroupConfig$Builder setMaxGroup(int p0){
       this.copyOnWrite();
       this.instance.setMaxGroup(p0);
       return this;
    }
    public TriggerInputTextGroupConfig$Builder setMinGroup(int p0){
       this.copyOnWrite();
       this.instance.setMinGroup(p0);
       return this;
    }
}
