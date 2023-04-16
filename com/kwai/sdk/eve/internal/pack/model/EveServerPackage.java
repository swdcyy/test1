package com.kwai.sdk.eve.internal.pack.model.EveServerPackage;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import com.kwai.sdk.eve.internal.pack.model.EveServerPackage$PackageItem;

public final class EveServerPackage	// class@0015a7
{
    public String baseVersion;
    public EveServerPackage$DownloadCondition condition;
    public EveServerPackage$PackageItem fullPack;
    public EveServerPackage$PackageItem incrementalPack;
    public boolean isIncremental;
    public String taskId;
    public EveServerPackage$UpdateConfig updateConfig;
    public String verifyInfo;

    public void EveServerPackage(){
       super();
    }
    public String toString(){
       EveServerPackage$PackageItem md5;
       Object[] objArray = null;
       StringBuilder obj = PatchProxy.apply(objArray, this, EveServerPackage.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "EveServerPackage{taskId = "+this.taskId+", md5 = ";
       EveServerPackage tfullPack = this.fullPack;
       md5 = (tfullPack != null)? tfullPack.md5: objArray;
       obj = obj+md5+", version = ";
       tfullPack = this.fullPack;
       if (tfullPack != null) {
          objArray = tfullPack.version;
       }
       return obj+objArray+'}';
    }
}
