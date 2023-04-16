package com.gifshow.kanim.parser.moshi.JsonReader$Token;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class JsonReader$Token extends Enum	// class@0015c6
{
    public static final JsonReader$Token[] $VALUES;
    public static final JsonReader$Token BEGIN_ARRAY;
    public static final JsonReader$Token BEGIN_OBJECT;
    public static final JsonReader$Token BOOLEAN;
    public static final JsonReader$Token END_ARRAY;
    public static final JsonReader$Token END_DOCUMENT;
    public static final JsonReader$Token END_OBJECT;
    public static final JsonReader$Token NAME;
    public static final JsonReader$Token NULL;
    public static final JsonReader$Token NUMBER;
    public static final JsonReader$Token STRING;

    static {
       JsonReader$Token token = new JsonReader$Token("BEGIN_ARRAY", 0);
       JsonReader$Token.BEGIN_ARRAY = token;
       JsonReader$Token token1 = new JsonReader$Token("END_ARRAY", 1);
       JsonReader$Token.END_ARRAY = token1;
       JsonReader$Token token2 = new JsonReader$Token("BEGIN_OBJECT", 2);
       JsonReader$Token.BEGIN_OBJECT = token2;
       JsonReader$Token token3 = new JsonReader$Token("END_OBJECT", 3);
       JsonReader$Token.END_OBJECT = token3;
       JsonReader$Token token4 = new JsonReader$Token("NAME", 4);
       JsonReader$Token.NAME = token4;
       JsonReader$Token token5 = new JsonReader$Token("STRING", 5);
       JsonReader$Token.STRING = token5;
       JsonReader$Token token6 = new JsonReader$Token("NUMBER", 6);
       JsonReader$Token.NUMBER = token6;
       JsonReader$Token token7 = new JsonReader$Token("BOOLEAN", 7);
       JsonReader$Token.BOOLEAN = token7;
       JsonReader$Token token8 = new JsonReader$Token("NULL", 8);
       JsonReader$Token.NULL = token8;
       JsonReader$Token token9 = new JsonReader$Token("END_DOCUMENT", 9);
       JsonReader$Token.END_DOCUMENT = token9;
       JsonReader$Token[] tokenArray = new JsonReader$Token[10];
       tokenArray[0] = token;
       tokenArray[1] = token1;
       tokenArray[2] = token2;
       tokenArray[3] = token3;
       tokenArray[4] = token4;
       tokenArray[5] = token5;
       tokenArray[6] = token6;
       tokenArray[7] = token7;
       tokenArray[8] = token8;
       tokenArray[9] = token9;
       JsonReader$Token.$VALUES = tokenArray;
    }
    public void JsonReader$Token(String p0,int p1){
       super(p0, p1);
    }
    public static JsonReader$Token valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, JsonReader$Token.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(JsonReader$Token.class, p0);
    }
    public static JsonReader$Token[] values(){
       Object obj = PatchProxy.apply(null, null, JsonReader$Token.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return JsonReader$Token.$VALUES.clone();
    }
}
