package com.google.protobuf.ProtobufLists;
import java.lang.Object;
import com.google.protobuf.Internal$BooleanList;
import com.google.protobuf.BooleanArrayList;
import com.google.protobuf.Internal$DoubleList;
import com.google.protobuf.DoubleArrayList;
import com.google.protobuf.Internal$FloatList;
import com.google.protobuf.FloatArrayList;
import com.google.protobuf.Internal$IntList;
import com.google.protobuf.IntArrayList;
import com.google.protobuf.Internal$LongList;
import com.google.protobuf.LongArrayList;
import com.google.protobuf.Internal$ProtobufList;
import com.google.protobuf.ProtobufArrayList;
import java.util.List;

public final class ProtobufLists	// class@00049d
{

    public void ProtobufLists(){
       super();
    }
    public static Internal$BooleanList emptyBooleanList(){
       return BooleanArrayList.emptyList();
    }
    public static Internal$DoubleList emptyDoubleList(){
       return DoubleArrayList.emptyList();
    }
    public static Internal$FloatList emptyFloatList(){
       return FloatArrayList.emptyList();
    }
    public static Internal$IntList emptyIntList(){
       return IntArrayList.emptyList();
    }
    public static Internal$LongList emptyLongList(){
       return LongArrayList.emptyList();
    }
    public static Internal$ProtobufList emptyProtobufList(){
       return ProtobufArrayList.emptyList();
    }
    public static Internal$ProtobufList mutableCopy(Internal$ProtobufList p0){
       int i = p0.size();
       i = (!i)? 10: i * 2;
       return p0.mutableCopyWithCapacity(i);
    }
    public static Internal$BooleanList newBooleanList(){
       return new BooleanArrayList();
    }
    public static Internal$DoubleList newDoubleList(){
       return new DoubleArrayList();
    }
    public static Internal$FloatList newFloatList(){
       return new FloatArrayList();
    }
    public static Internal$IntList newIntList(){
       return new IntArrayList();
    }
    public static Internal$LongList newLongList(){
       return new LongArrayList();
    }
}
