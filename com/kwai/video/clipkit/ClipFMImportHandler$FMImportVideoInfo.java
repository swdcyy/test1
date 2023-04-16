package com.kwai.video.clipkit.ClipFMImportHandler$FMImportVideoInfo;
import com.kwai.video.clipkit.ClipImportHandler$ImportVideoInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.minecraft.model.nano.Minecraft$WesterosFaceMagicParam;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.io.File;
import java.lang.StringBuilder;

public class ClipFMImportHandler$FMImportVideoInfo extends ClipImportHandler$ImportVideoInfo	// class@001a1a
{
    public double duration;
    public int exportType;
    public int index;
    public boolean isImage;
    public boolean isSupportSmartCut;
    public double lastFrameAtPts;
    public long magicDuration;
    public String magicPath;
    public int showHeight;
    public int showWidth;

    public void ClipFMImportHandler$FMImportVideoInfo(){
       super();
       this.exportType = 1;
    }
    public static ClipFMImportHandler$FMImportVideoInfo createFaceMagicInfo(ClipFMImportHandler$FMImportVideoInfo p0){
       ClipFMImportHandler$FMImportVideoInfo obj = PatchProxy.applyOneRefs(p0, null, ClipFMImportHandler$FMImportVideoInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClipFMImportHandler$FMImportVideoInfo();
       obj.width = p0.width;
       obj.height = p0.height;
       obj.isImage = p0.isImage;
       obj.duration = p0.duration;
       obj.timeRange = p0.timeRange;
       ClipFMImportHandler$FMImportVideoInfo magicPath = p0.magicPath;
       obj.magicPath = magicPath;
       obj.showWidth = p0.showWidth;
       obj.showHeight = p0.showHeight;
       obj.importPath = p0.importPath;
       obj.exportPath = p0.exportPath;
       obj.exportType = p0.exportType;
       obj.magicDuration = p0.magicDuration;
       ClipImportHandler$ImportVideoInfo importVideoI = p0.faceMagicParam;
       obj.faceMagicParam = importVideoI;
       obj.lastFrameAtPts = p0.lastFrameAtPts;
       obj.isSupportSmartCut = p0.isSupportSmartCut;
       if (importVideoI == null) {
          obj.faceMagicParam = ClipFMImportHandler$FMImportVideoInfo.createFaceMagicParam(magicPath);
       }
       return obj;
    }
    public static Minecraft$WesterosFaceMagicParam createFaceMagicParam(String p0){
       Minecraft$WesterosFaceMagicParam westerosFace = null;
       File obj = PatchProxy.applyOneRefs(p0, westerosFace, ClipFMImportHandler$FMImportVideoInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(p0)) {
          return westerosFace;
       }
       obj = new File(p0);
       if (obj.exists() && obj.isDirectory()) {
          String str = p0+"/params.txt";
          File uFile = new File(str);
          if (uFile.exists() && uFile.isFile()) {
             westerosFace = new Minecraft$WesterosFaceMagicParam();
             westerosFace.setAssetDir(p0);
             westerosFace.setIndexFile(str);
             p0 = p0+"/params_720.txt";
             obj = new File(p0);
             if (obj.exists() && obj.isFile()) {
                westerosFace.setIndexFile720(p0);
             }
          }
       }
       return westerosFace;
    }
}
