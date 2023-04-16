package com.yxcorp.gifshow.album.repo.AlbumAssetCache$AssetModule;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class AlbumAssetCache$AssetModule extends Enum	// class@001a54
{
    public static final AlbumAssetCache$AssetModule[] $VALUES;
    public static final AlbumAssetCache$AssetModule ALL;
    public static final AlbumAssetCache$AssetModule IMAGE;
    public static final AlbumAssetCache$AssetModule VIDEO;

    static {
       AlbumAssetCache$AssetModule uAssetModule1;
       AlbumAssetCache$AssetModule[] uAssetModule = new AlbumAssetCache$AssetModule[]{uAssetModule1,uAssetModule1,uAssetModule1};
       uAssetModule1 = new AlbumAssetCache$AssetModule("ALL", 0);
       AlbumAssetCache$AssetModule.ALL = uAssetModule1;
       uAssetModule1 = new AlbumAssetCache$AssetModule("VIDEO", 1);
       AlbumAssetCache$AssetModule.VIDEO = uAssetModule1;
       uAssetModule1 = new AlbumAssetCache$AssetModule("IMAGE", 2);
       AlbumAssetCache$AssetModule.IMAGE = uAssetModule1;
       AlbumAssetCache$AssetModule.$VALUES = uAssetModule;
    }
    public void AlbumAssetCache$AssetModule(String p0,int p1){
       super(p0, p1);
    }
    public static AlbumAssetCache$AssetModule valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, AlbumAssetCache$AssetModule.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(AlbumAssetCache$AssetModule.class, p0);
    }
    public static AlbumAssetCache$AssetModule[] values(){
       Object obj = PatchProxy.apply(null, null, AlbumAssetCache$AssetModule.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return AlbumAssetCache$AssetModule.$VALUES.clone();
    }
}
