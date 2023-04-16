package com.kuaishou.protobuf.kfs.feature.FloatList$b;
import er4.b;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.protobuf.kfs.feature.FloatList;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.protobuf.kfs.feature.FloatList$a;
import java.util.List;
import java.util.Collections;

public final class FloatList$b extends GeneratedMessageLite$Builder implements b	// class@000bf2
{

    public void FloatList$b(){
       super(FloatList.DEFAULT_INSTANCE);
    }
    public void FloatList$b(FloatList$a p0){
       super(FloatList.DEFAULT_INSTANCE);
    }
    public float getValue(int p0){
       return this.instance.getValue(p0);
    }
    public int getValueCount(){
       return this.instance.getValueCount();
    }
    public List getValueList(){
       return Collections.unmodifiableList(this.instance.getValueList());
    }
}
