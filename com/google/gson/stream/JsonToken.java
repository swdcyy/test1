package com.google.gson.stream.JsonToken;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class JsonToken extends Enum	// class@0005ba
{
    public static final JsonToken[] $VALUES;
    public static final JsonToken BEGIN_ARRAY;
    public static final JsonToken BEGIN_OBJECT;
    public static final JsonToken BOOLEAN;
    public static final JsonToken END_ARRAY;
    public static final JsonToken END_DOCUMENT;
    public static final JsonToken END_OBJECT;
    public static final JsonToken NAME;
    public static final JsonToken NULL;
    public static final JsonToken NUMBER;
    public static final JsonToken STRING;

    static {
       JsonToken jsonToken = new JsonToken("BEGIN_ARRAY", 0);
       JsonToken.BEGIN_ARRAY = jsonToken;
       JsonToken jsonToken1 = new JsonToken("END_ARRAY", 1);
       JsonToken.END_ARRAY = jsonToken1;
       JsonToken jsonToken2 = new JsonToken("BEGIN_OBJECT", 2);
       JsonToken.BEGIN_OBJECT = jsonToken2;
       JsonToken jsonToken3 = new JsonToken("END_OBJECT", 3);
       JsonToken.END_OBJECT = jsonToken3;
       JsonToken jsonToken4 = new JsonToken("NAME", 4);
       JsonToken.NAME = jsonToken4;
       JsonToken jsonToken5 = new JsonToken("STRING", 5);
       JsonToken.STRING = jsonToken5;
       JsonToken jsonToken6 = new JsonToken("NUMBER", 6);
       JsonToken.NUMBER = jsonToken6;
       JsonToken jsonToken7 = new JsonToken("BOOLEAN", 7);
       JsonToken.BOOLEAN = jsonToken7;
       JsonToken jsonToken8 = new JsonToken("NULL", 8);
       JsonToken.NULL = jsonToken8;
       JsonToken jsonToken9 = new JsonToken("END_DOCUMENT", 9);
       JsonToken.END_DOCUMENT = jsonToken9;
       JsonToken[] jsonTokenArr = new JsonToken[10];
       jsonTokenArr[0] = jsonToken;
       jsonTokenArr[1] = jsonToken1;
       jsonTokenArr[2] = jsonToken2;
       jsonTokenArr[3] = jsonToken3;
       jsonTokenArr[4] = jsonToken4;
       jsonTokenArr[5] = jsonToken5;
       jsonTokenArr[6] = jsonToken6;
       jsonTokenArr[7] = jsonToken7;
       jsonTokenArr[8] = jsonToken8;
       jsonTokenArr[9] = jsonToken9;
       JsonToken.$VALUES = jsonTokenArr;
    }
    public void JsonToken(String p0,int p1){
       super(p0, p1);
    }
    public static JsonToken valueOf(String p0){
       return Enum.valueOf(JsonToken.class, p0);
    }
    public static JsonToken[] values(){
       return JsonToken.$VALUES.clone();
    }
}
