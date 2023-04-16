package com.google.protobuf.ApiOrBuilder;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Method;
import java.util.List;
import com.google.protobuf.Mixin;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.google.protobuf.Option;
import com.google.protobuf.SourceContext;
import com.google.protobuf.Syntax;

public interface abstract ApiOrBuilder implements MessageLiteOrBuilder	// class@0003b3
{

    Method getMethods(int p0);
    int getMethodsCount();
    List getMethodsList();
    Mixin getMixins(int p0);
    int getMixinsCount();
    List getMixinsList();
    String getName();
    ByteString getNameBytes();
    Option getOptions(int p0);
    int getOptionsCount();
    List getOptionsList();
    SourceContext getSourceContext();
    Syntax getSyntax();
    int getSyntaxValue();
    String getVersion();
    ByteString getVersionBytes();
    boolean hasSourceContext();
}
