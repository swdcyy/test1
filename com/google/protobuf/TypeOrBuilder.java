package com.google.protobuf.TypeOrBuilder;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Field;
import java.util.List;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.google.protobuf.Option;
import com.google.protobuf.SourceContext;
import com.google.protobuf.Syntax;

public interface abstract TypeOrBuilder implements MessageLiteOrBuilder	// class@0004d3
{

    Field getFields(int p0);
    int getFieldsCount();
    List getFieldsList();
    String getName();
    ByteString getNameBytes();
    String getOneofs(int p0);
    ByteString getOneofsBytes(int p0);
    int getOneofsCount();
    List getOneofsList();
    Option getOptions(int p0);
    int getOptionsCount();
    List getOptionsList();
    SourceContext getSourceContext();
    Syntax getSyntax();
    int getSyntaxValue();
    boolean hasSourceContext();
}
