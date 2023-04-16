package com.kwai.live.gzone.bridge.GzoneJsCommandId;
import o63.k;
import java.lang.Enum;
import com.kwai.live.gzone.bridge.GzoneJsCommandId$a;
import o63.r;
import java.lang.String;
import msd.a;
import com.kwai.live.gzone.bridge.GzoneJsCommandId$b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class GzoneJsCommandId extends Enum implements k	// class@000c73
{
    public String mCommandName;
    public a mCommandProvider;
    public r mLiveJsScene;
    public static final GzoneJsCommandId[] $VALUES;
    public static final GzoneJsCommandId HIDE_PENDANT;
    public static final GzoneJsCommandId HIDE_PLAYSTATION_POPUP;

    static {
       r d = r.d;
       GzoneJsCommandId gzoneJsComma = new GzoneJsCommandId("HIDE_PENDANT", 0, "hidePlayPendant", new GzoneJsCommandId$a(), d);
       GzoneJsCommandId.HIDE_PENDANT = v6;
       GzoneJsCommandId gzoneJsComma1 = new GzoneJsCommandId("HIDE_PLAYSTATION_POPUP", 1, "hideWanfaPanel", new GzoneJsCommandId$b(), d);
       GzoneJsCommandId.HIDE_PLAYSTATION_POPUP = gzoneJsComma;
       GzoneJsCommandId[] gzoneJsComma2 = new GzoneJsCommandId[]{v6,gzoneJsComma};
       GzoneJsCommandId.$VALUES = gzoneJsComma2;
    }
    public void GzoneJsCommandId(String p0,int p1,String p2,a p3,r p4){
       super(p0, p1);
       this.mCommandName = p2;
       this.mCommandProvider = p3;
       this.mLiveJsScene = p4;
    }
    public static GzoneJsCommandId valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, GzoneJsCommandId.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(GzoneJsCommandId.class, p0);
    }
    public static GzoneJsCommandId[] values(){
       Object obj = PatchProxy.apply(null, null, GzoneJsCommandId.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GzoneJsCommandId.$VALUES.clone();
    }
    public String getCommandName(){
       return this.mCommandName;
    }
    public a getCommandProvider(){
       return this.mCommandProvider;
    }
    public String getNameSpace(){
       return "game";
    }
    public r getSupportedScene(){
       return this.mLiveJsScene;
    }
}
