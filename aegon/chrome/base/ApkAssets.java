package aegon.chrome.base.ApkAssets;
import java.lang.Object;
import java.lang.String;
import android.content.Context;
import a0.f;
import java.lang.CharSequence;
import android.text.TextUtils;
import aegon.chrome.base.BundleUtils;
import android.content.res.AssetManager;
import android.content.res.AssetFileDescriptor;
import com.kwai.plugin.dva.split.SplitAssetHelper;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.lang.StringBuilder;

public class ApkAssets	// class@000126
{

    public void ApkAssets(){
       super();
    }
    public static long[] open(String p0,String p1){
       AssetFileDescriptor uAssetFileDe = null;
       try{
          Context uContext = f.a();
          if (!TextUtils.isEmpty(p1) && BundleUtils.e(uContext, p1)) {
             uContext = BundleUtils.a(uContext, p1);
          }
          uAssetFileDe = SplitAssetHelper.openNonAssetFd(uContext.getAssets(), p0);
          long[] olongArray1 = new long[3];
          olongArray1[0] = (long)uAssetFileDe.getParcelFileDescriptor().detachFd();
          olongArray1[1] = uAssetFileDe.getStartOffset();
          long length = uAssetFileDe.getLength();
          try{
             olongArray1[2] = length;
             uAssetFileDe.close();
             return olongArray1;
          }catch(java.io.IOException e0){
          }
       }catch(java.io.IOException e8){
          if (!(e8.getMessage()).equals("") && !(e8.getMessage()).equals(p0)) {
             StringBuilder str = "Error while loading asset "+p0+": "+e8;
          }
          try{
             long[] olongArray = new long[]{-1,-1,-1};
             if (uAssetFileDe) {
                uAssetFileDe.close();
             }
             return olongArray;
          }catch(java.io.IOException e0){
          }
       }
    }
}
