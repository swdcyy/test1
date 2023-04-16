package com.kwai.video.ksuploaderkit.apicenter.ApiManager$TokenType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ApiManager$TokenType extends Enum	// class@000988
{
    public static final ApiManager$TokenType[] $VALUES;
    public static final ApiManager$TokenType Cover;
    public static final ApiManager$TokenType Image;
    public static final ApiManager$TokenType Video;

    static {
       ApiManager$TokenType tokenType = new ApiManager$TokenType("Video", 0);
       ApiManager$TokenType.Video = tokenType;
       ApiManager$TokenType tokenType1 = new ApiManager$TokenType("Cover", 1);
       ApiManager$TokenType.Cover = tokenType1;
       ApiManager$TokenType tokenType2 = new ApiManager$TokenType("Image", 2);
       ApiManager$TokenType.Image = tokenType2;
       ApiManager$TokenType[] tokenTypeArr = new ApiManager$TokenType[]{tokenType,tokenType1,tokenType2};
       ApiManager$TokenType.$VALUES = tokenTypeArr;
    }
    public void ApiManager$TokenType(String p0,int p1){
       super(p0, p1);
    }
    public static ApiManager$TokenType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ApiManager$TokenType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ApiManager$TokenType.class, p0);
    }
    public static ApiManager$TokenType[] values(){
       Object obj = PatchProxy.apply(null, null, ApiManager$TokenType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ApiManager$TokenType.$VALUES.clone();
    }
}
