package com.kwai.video.westeros.models.MakeupResources$Builder;
import com.kwai.video.westeros.models.MakeupResourcesOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.MakeupResources;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.MakeupResources$1;
import java.lang.Iterable;
import com.kwai.video.westeros.models.MakeupResource$Builder;
import com.kwai.video.westeros.models.MakeupResource;
import java.util.List;
import java.util.Collections;

public final class MakeupResources$Builder extends GeneratedMessageLite$Builder implements MakeupResourcesOrBuilder	// class@000faa
{

    public void MakeupResources$Builder(){
       super(MakeupResources.DEFAULT_INSTANCE);
    }
    public void MakeupResources$Builder(MakeupResources$1 p0){
       super();
    }
    public MakeupResources$Builder addAllResource(Iterable p0){
       this.copyOnWrite();
       this.instance.addAllResource(p0);
       return this;
    }
    public MakeupResources$Builder addResource(int p0,MakeupResource$Builder p1){
       this.copyOnWrite();
       this.instance.addResource(p0, p1);
       return this;
    }
    public MakeupResources$Builder addResource(int p0,MakeupResource p1){
       this.copyOnWrite();
       this.instance.addResource(p0, p1);
       return this;
    }
    public MakeupResources$Builder addResource(MakeupResource$Builder p0){
       this.copyOnWrite();
       this.instance.addResource(p0);
       return this;
    }
    public MakeupResources$Builder addResource(MakeupResource p0){
       this.copyOnWrite();
       this.instance.addResource(p0);
       return this;
    }
    public MakeupResources$Builder clearResource(){
       this.copyOnWrite();
       this.instance.clearResource();
       return this;
    }
    public MakeupResource getResource(int p0){
       return this.instance.getResource(p0);
    }
    public int getResourceCount(){
       return this.instance.getResourceCount();
    }
    public List getResourceList(){
       return Collections.unmodifiableList(this.instance.getResourceList());
    }
    public MakeupResources$Builder removeResource(int p0){
       this.copyOnWrite();
       this.instance.removeResource(p0);
       return this;
    }
    public MakeupResources$Builder setResource(int p0,MakeupResource$Builder p1){
       this.copyOnWrite();
       this.instance.setResource(p0, p1);
       return this;
    }
    public MakeupResources$Builder setResource(int p0,MakeupResource p1){
       this.copyOnWrite();
       this.instance.setResource(p0, p1);
       return this;
    }
}
