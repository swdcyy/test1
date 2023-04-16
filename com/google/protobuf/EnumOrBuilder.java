package com.google.protobuf.EnumOrBuilder;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.EnumValue;
import java.util.List;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.google.protobuf.Option;
import com.google.protobuf.SourceContext;
import com.google.protobuf.Syntax;

public interface abstract EnumOrBuilder implements MessageLiteOrBuilder	// class@000403
{

    EnumValue getEnumvalue(int p0);
    int getEnumvalueCount();
    List getEnumvalueList();
    String getName();
    ByteString getNameBytes();
    Option getOptions(int p0);
    int getOptionsCount();
    List getOptionsList();
    SourceContext getSourceContext();
    Syntax getSyntax();
    int getSyntaxValue();
    boolean hasSourceContext();
}
