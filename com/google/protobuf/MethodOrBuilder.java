package com.google.protobuf.MethodOrBuilder;
import com.google.protobuf.MessageLiteOrBuilder;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.google.protobuf.Option;
import java.util.List;
import com.google.protobuf.Syntax;

public interface abstract MethodOrBuilder implements MessageLiteOrBuilder	// class@000484
{

    String getName();
    ByteString getNameBytes();
    Option getOptions(int p0);
    int getOptionsCount();
    List getOptionsList();
    boolean getRequestStreaming();
    String getRequestTypeUrl();
    ByteString getRequestTypeUrlBytes();
    boolean getResponseStreaming();
    String getResponseTypeUrl();
    ByteString getResponseTypeUrlBytes();
    Syntax getSyntax();
    int getSyntaxValue();
}
