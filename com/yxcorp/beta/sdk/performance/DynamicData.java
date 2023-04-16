package com.yxcorp.beta.sdk.performance.DynamicData;
import java.lang.Object;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Collection;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.List;
import java.lang.StringBuilder;

public class DynamicData	// class@00119b
{
    public String activityName;
    public String name;
    public int sampleInterval;
    public String unit;
    public CopyOnWriteArrayList values;

    public void DynamicData(){
       super();
       this.sampleInterval = 1000;
       this.values = new CopyOnWriteArrayList();
    }
    public void addAllValue(Collection p0){
    }
    public void addValue(Object p0){
    }
    public void clear(){
       if (PatchProxy.applyVoid(null, this, DynamicData.class, "1")) {
          return;
       }
       this.values.clear();
       return;
    }
    public boolean equals(Object p0){
       boolean b;
       DynamicData obj = PatchProxy.applyOneRefs(p0, this, DynamicData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = null;
       if (p0 != null && p0 instanceof DynamicData) {
          b = (this.name).equals(p0.name);
       }
       return b;
    }
    public String getActivityName(){
       return this.activityName;
    }
    public String getName(){
       return this.name;
    }
    public int getSampleInterval(){
       return this.sampleInterval;
    }
    public String getUnit(){
       return this.unit;
    }
    public List getValues(){
       return this.values;
    }
    public DynamicData setActivityName(String p0){
       this.activityName = p0;
       return this;
    }
    public DynamicData setName(String p0){
       this.name = p0;
       return this;
    }
    public DynamicData setSampleInterval(int p0){
       this.sampleInterval = p0;
       return this;
    }
    public DynamicData setUnit(String p0){
       this.unit = p0;
       return this;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, DynamicData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "DynamicData{name=\'"+this.name+'''+", unit=\'"+this.unit+'''+", activityName=\'"+this.activityName+'''+", sampleInterval="+this.sampleInterval+", values="+this.values+'}';
    }
}
