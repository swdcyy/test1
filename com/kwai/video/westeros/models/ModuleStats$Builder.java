package com.kwai.video.westeros.models.ModuleStats$Builder;
import com.kwai.video.westeros.models.ModuleStatsOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.ModuleStats;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.ModuleStats$1;

public final class ModuleStats$Builder extends GeneratedMessageLite$Builder implements ModuleStatsOrBuilder	// class@000fe5
{

    public void ModuleStats$Builder(){
       super(ModuleStats.DEFAULT_INSTANCE);
    }
    public void ModuleStats$Builder(ModuleStats$1 p0){
       super();
    }
    public ModuleStats$Builder clearAvgMs(){
       this.copyOnWrite();
       this.instance.clearAvgMs();
       return this;
    }
    public ModuleStats$Builder clearEnabled(){
       this.copyOnWrite();
       this.instance.clearEnabled();
       return this;
    }
    public ModuleStats$Builder clearFrameDropRate(){
       this.copyOnWrite();
       this.instance.clearFrameDropRate();
       return this;
    }
    public ModuleStats$Builder clearMaxMs(){
       this.copyOnWrite();
       this.instance.clearMaxMs();
       return this;
    }
    public ModuleStats$Builder clearMinMs(){
       this.copyOnWrite();
       this.instance.clearMinMs();
       return this;
    }
    public float getAvgMs(){
       return this.instance.getAvgMs();
    }
    public boolean getEnabled(){
       return this.instance.getEnabled();
    }
    public int getFrameDropRate(){
       return this.instance.getFrameDropRate();
    }
    public float getMaxMs(){
       return this.instance.getMaxMs();
    }
    public float getMinMs(){
       return this.instance.getMinMs();
    }
    public ModuleStats$Builder setAvgMs(float p0){
       this.copyOnWrite();
       this.instance.setAvgMs(p0);
       return this;
    }
    public ModuleStats$Builder setEnabled(boolean p0){
       this.copyOnWrite();
       this.instance.setEnabled(p0);
       return this;
    }
    public ModuleStats$Builder setFrameDropRate(int p0){
       this.copyOnWrite();
       this.instance.setFrameDropRate(p0);
       return this;
    }
    public ModuleStats$Builder setMaxMs(float p0){
       this.copyOnWrite();
       this.instance.setMaxMs(p0);
       return this;
    }
    public ModuleStats$Builder setMinMs(float p0){
       this.copyOnWrite();
       this.instance.setMinMs(p0);
       return this;
    }
}
