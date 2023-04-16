package com.yxcorp.gifshow.publish.nouipublish.NoUiPublishState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class NoUiPublishState extends Enum	// class@001610
{
    public static final NoUiPublishState[] $VALUES;
    public static final NoUiPublishState ENCODE;
    public static final NoUiPublishState INIT_DRAFT;
    public static final NoUiPublishState LOAD_PROJECT;
    public static final NoUiPublishState NONE;
    public static final NoUiPublishState UPLOAD;

    static {
       NoUiPublishState noUiPublishS1;
       NoUiPublishState[] noUiPublishS = new NoUiPublishState[]{noUiPublishS1,noUiPublishS1,noUiPublishS1,noUiPublishS1,noUiPublishS1};
       noUiPublishS1 = new NoUiPublishState("NONE", 0);
       NoUiPublishState.NONE = noUiPublishS1;
       noUiPublishS1 = new NoUiPublishState("INIT_DRAFT", 1);
       NoUiPublishState.INIT_DRAFT = noUiPublishS1;
       noUiPublishS1 = new NoUiPublishState("LOAD_PROJECT", 2);
       NoUiPublishState.LOAD_PROJECT = noUiPublishS1;
       noUiPublishS1 = new NoUiPublishState("ENCODE", 3);
       NoUiPublishState.ENCODE = noUiPublishS1;
       noUiPublishS1 = new NoUiPublishState("UPLOAD", 4);
       NoUiPublishState.UPLOAD = noUiPublishS1;
       NoUiPublishState.$VALUES = noUiPublishS;
    }
    public void NoUiPublishState(String p0,int p1){
       super(p0, p1);
    }
    public static NoUiPublishState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, NoUiPublishState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(NoUiPublishState.class, p0);
    }
    public static NoUiPublishState[] values(){
       Object obj = PatchProxy.apply(null, null, NoUiPublishState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return NoUiPublishState.$VALUES.clone();
    }
}
