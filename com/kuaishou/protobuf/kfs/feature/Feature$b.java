package com.kuaishou.protobuf.kfs.feature.Feature$b;
import com.kuaishou.protobuf.kfs.feature.a;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.protobuf.kfs.feature.Feature;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.protobuf.kfs.feature.Feature$a;
import com.kuaishou.protobuf.kfs.feature.BytesList;
import com.kuaishou.protobuf.kfs.feature.FloatList;
import com.kuaishou.protobuf.kfs.feature.Int64List;
import com.kuaishou.protobuf.kfs.feature.Feature$KindCase;
import com.kuaishou.protobuf.kfs.feature.MetaInfo;

public final class Feature$b extends GeneratedMessageLite$Builder implements a	// class@000bef
{

    public void Feature$b(){
       super(Feature.DEFAULT_INSTANCE);
    }
    public void Feature$b(Feature$a p0){
       super(Feature.DEFAULT_INSTANCE);
    }
    public BytesList getBytesList(){
       return this.instance.getBytesList();
    }
    public FloatList getFloatList(){
       return this.instance.getFloatList();
    }
    public Int64List getInt64List(){
       return this.instance.getInt64List();
    }
    public Feature$KindCase getKindCase(){
       return this.instance.getKindCase();
    }
    public MetaInfo getMeta(){
       return this.instance.getMeta();
    }
    public boolean hasBytesList(){
       return this.instance.hasBytesList();
    }
    public boolean hasFloatList(){
       return this.instance.hasFloatList();
    }
    public boolean hasInt64List(){
       return this.instance.hasInt64List();
    }
    public boolean hasMeta(){
       return this.instance.hasMeta();
    }
}
