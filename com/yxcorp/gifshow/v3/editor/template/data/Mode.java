package com.yxcorp.gifshow.v3.editor.template.data.Mode;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class Mode extends Enum	// class@001319
{
    public final String s;
    public static final Mode[] $VALUES;
    public static final Mode FIRST;
    public static final Mode FIRST_OR_DEFAULT;
    public static final Mode LAST;
    public static final Mode SINGLE;

    static {
       Mode mode;
       Mode[] modeArray = new Mode[]{mode,mode,mode,mode};
       mode = new Mode("FIRST", 0, "awaitFirst");
       Mode.FIRST = mode;
       mode = new Mode("FIRST_OR_DEFAULT", 1, "awaitFirstOrDefault");
       Mode.FIRST_OR_DEFAULT = mode;
       mode = new Mode("LAST", 2, "awaitLast");
       Mode.LAST = mode;
       mode = new Mode("SINGLE", 3, "awaitSingle");
       Mode.SINGLE = mode;
       Mode.$VALUES = modeArray;
    }
    public void Mode(String p0,int p1,String p2){
       super(p0, p1);
       this.s = p2;
    }
    public static Mode valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, Mode.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(Mode.class, p0);
    }
    public static Mode[] values(){
       Object obj = PatchProxy.apply(null, null, Mode.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Mode.$VALUES.clone();
    }
    public final String getS(){
       return this.s;
    }
    public String toString(){
       return this.s;
    }
}
