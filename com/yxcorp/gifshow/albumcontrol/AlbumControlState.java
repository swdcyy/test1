package com.yxcorp.gifshow.albumcontrol.AlbumControlState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class AlbumControlState extends Enum	// class@001b42
{
    public static final AlbumControlState[] $VALUES;
    public static final AlbumControlState ACCESSIBLE;
    public static final AlbumControlState DENY;

    static {
       AlbumControlState uAlbumContro1;
       AlbumControlState[] uAlbumContro = new AlbumControlState[]{uAlbumContro1,uAlbumContro1};
       uAlbumContro1 = new AlbumControlState("ACCESSIBLE", 0);
       AlbumControlState.ACCESSIBLE = uAlbumContro1;
       uAlbumContro1 = new AlbumControlState("DENY", 1);
       AlbumControlState.DENY = uAlbumContro1;
       AlbumControlState.$VALUES = uAlbumContro;
    }
    public void AlbumControlState(String p0,int p1){
       super(p0, p1);
    }
    public static AlbumControlState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, AlbumControlState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(AlbumControlState.class, p0);
    }
    public static AlbumControlState[] values(){
       Object obj = PatchProxy.apply(null, null, AlbumControlState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return AlbumControlState.$VALUES.clone();
    }
}
