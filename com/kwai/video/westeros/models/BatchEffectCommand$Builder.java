package com.kwai.video.westeros.models.BatchEffectCommand$Builder;
import com.kwai.video.westeros.models.BatchEffectCommandOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.BatchEffectCommand;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.BatchEffectCommand$1;
import java.lang.Iterable;
import com.kwai.video.westeros.models.EffectCommand$Builder;
import com.kwai.video.westeros.models.EffectCommand;
import java.util.List;
import java.util.Collections;

public final class BatchEffectCommand$Builder extends GeneratedMessageLite$Builder implements BatchEffectCommandOrBuilder	// class@000ea8
{

    public void BatchEffectCommand$Builder(){
       super(BatchEffectCommand.DEFAULT_INSTANCE);
    }
    public void BatchEffectCommand$Builder(BatchEffectCommand$1 p0){
       super();
    }
    public BatchEffectCommand$Builder addAllCommands(Iterable p0){
       this.copyOnWrite();
       this.instance.addAllCommands(p0);
       return this;
    }
    public BatchEffectCommand$Builder addCommands(int p0,EffectCommand$Builder p1){
       this.copyOnWrite();
       this.instance.addCommands(p0, p1);
       return this;
    }
    public BatchEffectCommand$Builder addCommands(int p0,EffectCommand p1){
       this.copyOnWrite();
       this.instance.addCommands(p0, p1);
       return this;
    }
    public BatchEffectCommand$Builder addCommands(EffectCommand$Builder p0){
       this.copyOnWrite();
       this.instance.addCommands(p0);
       return this;
    }
    public BatchEffectCommand$Builder addCommands(EffectCommand p0){
       this.copyOnWrite();
       this.instance.addCommands(p0);
       return this;
    }
    public BatchEffectCommand$Builder clearCommands(){
       this.copyOnWrite();
       this.instance.clearCommands();
       return this;
    }
    public EffectCommand getCommands(int p0){
       return this.instance.getCommands(p0);
    }
    public int getCommandsCount(){
       return this.instance.getCommandsCount();
    }
    public List getCommandsList(){
       return Collections.unmodifiableList(this.instance.getCommandsList());
    }
    public BatchEffectCommand$Builder removeCommands(int p0){
       this.copyOnWrite();
       this.instance.removeCommands(p0);
       return this;
    }
    public BatchEffectCommand$Builder setCommands(int p0,EffectCommand$Builder p1){
       this.copyOnWrite();
       this.instance.setCommands(p0, p1);
       return this;
    }
    public BatchEffectCommand$Builder setCommands(int p0,EffectCommand p1){
       this.copyOnWrite();
       this.instance.setCommands(p0, p1);
       return this;
    }
}
