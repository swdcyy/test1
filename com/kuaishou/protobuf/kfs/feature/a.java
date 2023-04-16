package com.kuaishou.protobuf.kfs.feature.a;
import com.google.protobuf.MessageLiteOrBuilder;
import com.kuaishou.protobuf.kfs.feature.BytesList;
import com.kuaishou.protobuf.kfs.feature.FloatList;
import com.kuaishou.protobuf.kfs.feature.Int64List;
import com.kuaishou.protobuf.kfs.feature.Feature$KindCase;
import com.kuaishou.protobuf.kfs.feature.MetaInfo;

public interface abstract a implements MessageLiteOrBuilder	// class@000bfa
{

    BytesList getBytesList();
    FloatList getFloatList();
    Int64List getInt64List();
    Feature$KindCase getKindCase();
    MetaInfo getMeta();
    boolean hasBytesList();
    boolean hasFloatList();
    boolean hasInt64List();
    boolean hasMeta();
}
