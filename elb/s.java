package elb.s;
import java.util.concurrent.Callable;
import com.yxcorp.gifshow.models.QMedia;
import java.lang.String;
import java.lang.Object;
import java.lang.System;
import com.kwai.video.minecraft.model.nano.Minecraft$InputFileOptions;
import com.kwai.video.minecraft.model.nano.Minecraft$RationalV2;
import com.kwai.video.editorsdk2.EditorSdk2Utils;
import com.kwai.video.minecraft.model.EditorSdk2V2$TrackAsset;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import gq.a;
import java.lang.StringBuilder;
import ekd.k1;
import q87.c;

public final class s implements Callable	// class@002768
{
    public final QMedia b;
    public final String c;

    public void s(QMedia p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object call(){
       s tc = this.c;
       long l = System.currentTimeMillis();
       Minecraft$InputFileOptions inputFileOpt = new Minecraft$InputFileOptions();
       if (this.b.type == null) {
          inputFileOpt.setFrameRate(EditorSdk2Utils.createRationalV2(1, 2));
       }
       Object[] objArray = new Object[0];
       a.D().w("MediaTrackAssetManager", "open track asset successed, path = "+tc+", cost = "+k1.t(l), objArray);
       return EditorSdk2UtilsV2.openTrackAsset(tc, null, inputFileOpt);
    }
}
