package com.kuaishou.protobuf.kfs.feature.BytesList$b;
import er4.a;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.protobuf.kfs.feature.BytesList;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.protobuf.kfs.feature.BytesList$a;
import com.google.protobuf.ByteString;
import java.util.List;
import java.util.Collections;

public final class BytesList$b extends GeneratedMessageLite$Builder implements a	// class@000beb
{

    public void BytesList$b(){
       super(BytesList.DEFAULT_INSTANCE);
    }
    public void BytesList$b(BytesList$a p0){
       super(BytesList.DEFAULT_INSTANCE);
    }
    public ByteString getValue(int p0){
       return this.instance.getValue(p0);
    }
    public int getValueCount(){
       return this.instance.getValueCount();
    }
    public List getValueList(){
       return Collections.unmodifiableList(this.instance.getValueList());
    }
}
