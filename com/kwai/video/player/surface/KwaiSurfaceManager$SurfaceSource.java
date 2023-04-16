package com.kwai.video.player.surface.KwaiSurfaceManager$SurfaceSource;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class KwaiSurfaceManager$SurfaceSource extends Enum	// class@000ba3
{
    public static final KwaiSurfaceManager$SurfaceSource[] $VALUES;
    public static final KwaiSurfaceManager$SurfaceSource SOURCE_SURFACE;
    public static final KwaiSurfaceManager$SurfaceSource SOURCE_SURFACE_HOLDER;
    public static final KwaiSurfaceManager$SurfaceSource SOURCE_SURFACE_TEXTURE;
    public static final KwaiSurfaceManager$SurfaceSource SOURCE_UNKNOWN;

    static {
       KwaiSurfaceManager$SurfaceSource surfaceSourc = new KwaiSurfaceManager$SurfaceSource("SOURCE_UNKNOWN", 0);
       KwaiSurfaceManager$SurfaceSource.SOURCE_UNKNOWN = surfaceSourc;
       KwaiSurfaceManager$SurfaceSource surfaceSourc1 = new KwaiSurfaceManager$SurfaceSource("SOURCE_SURFACE", 1);
       KwaiSurfaceManager$SurfaceSource.SOURCE_SURFACE = surfaceSourc1;
       KwaiSurfaceManager$SurfaceSource surfaceSourc2 = new KwaiSurfaceManager$SurfaceSource("SOURCE_SURFACE_TEXTURE", 2);
       KwaiSurfaceManager$SurfaceSource.SOURCE_SURFACE_TEXTURE = surfaceSourc2;
       KwaiSurfaceManager$SurfaceSource surfaceSourc3 = new KwaiSurfaceManager$SurfaceSource("SOURCE_SURFACE_HOLDER", 3);
       KwaiSurfaceManager$SurfaceSource.SOURCE_SURFACE_HOLDER = surfaceSourc3;
       KwaiSurfaceManager$SurfaceSource[] surfaceSourc4 = new KwaiSurfaceManager$SurfaceSource[]{surfaceSourc,surfaceSourc1,surfaceSourc2,surfaceSourc3};
       KwaiSurfaceManager$SurfaceSource.$VALUES = surfaceSourc4;
    }
    public void KwaiSurfaceManager$SurfaceSource(String p0,int p1){
       super(p0, p1);
    }
    public static KwaiSurfaceManager$SurfaceSource valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KwaiSurfaceManager$SurfaceSource.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KwaiSurfaceManager$SurfaceSource.class, p0);
    }
    public static KwaiSurfaceManager$SurfaceSource[] values(){
       Object obj = PatchProxy.apply(null, null, KwaiSurfaceManager$SurfaceSource.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KwaiSurfaceManager$SurfaceSource.$VALUES.clone();
    }
}
