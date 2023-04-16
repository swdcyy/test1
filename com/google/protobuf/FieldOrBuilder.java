package com.google.protobuf.FieldOrBuilder;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Field$Cardinality;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.google.protobuf.Field$Kind;
import com.google.protobuf.Option;
import java.util.List;

public interface abstract FieldOrBuilder implements MessageLiteOrBuilder	// class@000423
{

    Field$Cardinality getCardinality();
    int getCardinalityValue();
    String getDefaultValue();
    ByteString getDefaultValueBytes();
    String getJsonName();
    ByteString getJsonNameBytes();
    Field$Kind getKind();
    int getKindValue();
    String getName();
    ByteString getNameBytes();
    int getNumber();
    int getOneofIndex();
    Option getOptions(int p0);
    int getOptionsCount();
    List getOptionsList();
    boolean getPacked();
    String getTypeUrl();
    ByteString getTypeUrlBytes();
}
