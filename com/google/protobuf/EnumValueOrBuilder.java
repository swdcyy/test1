package com.google.protobuf.EnumValueOrBuilder;
import com.google.protobuf.MessageLiteOrBuilder;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.google.protobuf.Option;
import java.util.List;

public interface abstract EnumValueOrBuilder implements MessageLiteOrBuilder	// class@000407
{

    String getName();
    ByteString getNameBytes();
    int getNumber();
    Option getOptions(int p0);
    int getOptionsCount();
    List getOptionsList();
}
