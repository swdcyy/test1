package com.gifshow.twitter.widget.Extractor$Entity$Type;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class Extractor$Entity$Type extends Enum	// class@0015f7
{
    public static final Extractor$Entity$Type[] $VALUES;
    public static final Extractor$Entity$Type CASHTAG;
    public static final Extractor$Entity$Type HASHTAG;
    public static final Extractor$Entity$Type MENTION;
    public static final Extractor$Entity$Type URL;

    static {
       Extractor$Entity$Type uEntity$Type = new Extractor$Entity$Type("URL", 0);
       Extractor$Entity$Type.URL = uEntity$Type;
       Extractor$Entity$Type uEntity$Type1 = new Extractor$Entity$Type("HASHTAG", 1);
       Extractor$Entity$Type.HASHTAG = uEntity$Type1;
       Extractor$Entity$Type uEntity$Type2 = new Extractor$Entity$Type("MENTION", 2);
       Extractor$Entity$Type.MENTION = uEntity$Type2;
       Extractor$Entity$Type uEntity$Type3 = new Extractor$Entity$Type("CASHTAG", 3);
       Extractor$Entity$Type.CASHTAG = uEntity$Type3;
       Extractor$Entity$Type[] uEntity$Type4 = new Extractor$Entity$Type[]{uEntity$Type,uEntity$Type1,uEntity$Type2,uEntity$Type3};
       Extractor$Entity$Type.$VALUES = uEntity$Type4;
    }
    public void Extractor$Entity$Type(String p0,int p1){
       super(p0, p1);
    }
    public static Extractor$Entity$Type valueOf(String p0){
       return Enum.valueOf(Extractor$Entity$Type.class, p0);
    }
    public static Extractor$Entity$Type[] values(){
       return Extractor$Entity$Type.$VALUES.clone();
    }
}
