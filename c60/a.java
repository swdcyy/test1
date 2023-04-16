package c60.a;
import com.lsjwzh.fonts.IFontsDownloader;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.util.resource.Category;
import boc.b;
import java.io.File;
import com.yxcorp.gifshow.util.resource.p;
import com.lsjwzh.fonts.a;
import android.os.ParcelFileDescriptor;
import qfc.a;
import java.lang.Integer;
import q87.c;
import java.io.FileNotFoundException;
import com.lsjwzh.fonts.IFontsDownloader$DownloadStatus;
import com.yxcorp.gifshow.util.resource.n;

public class a implements IFontsDownloader	// class@0002f3
{

    public void a(){
       super();
    }
    public int a(String p0){
       return -1;
    }
    public boolean b(String p0){
       return true;
    }
    public int c(String p0){
       return 0;
    }
    public long d(String p0){
       p0 = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.longValue();
       }
       File uFile = p.d(Category.EMOJI_TTF, "NotoColorEmojiCompat.ttf");
       if (uFile.exists() && uFile.length() > 0) {
          try{
             int fd = ParcelFileDescriptor.open(uFile, a.a("rw")).getFd();
             Object[] objArray = new Object[]{"fd",Integer.valueOf(fd)};
             a.C().s("ks://FontDownloader", "getFileId", objArray);
             return (long)fd;
          }catch(java.io.FileNotFoundException e9){
             e9.printStackTrace();
          }
       label_0059 :
          return v1;
       }else {
          goto label_0059 ;
       }
    }
    public IFontsDownloader$DownloadStatus e(String p0){
       p0 = PatchProxy.applyOneRefs(p0, this, a.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       IFontsDownloader$DownloadStatus dOWNLOADED = (new File(Category.EMOJI_TTF.getResourceDir()).exists())? IFontsDownloader$DownloadStatus.DOWNLOADED: IFontsDownloader$DownloadStatus.IDLE;
       Object[] objArray = new Object[]{"status",dOWNLOADED};
       a.C().s("ks://FontDownloader", "queryStatus", objArray);
       return dOWNLOADED;
    }
    public String f(String p0){
       return "";
    }
    public void g(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       Category eMOJI_TTF = Category.EMOJI_TTF;
       if (n.t(eMOJI_TTF)) {
          Object[] objArray = new Object[0];
          a.C().s("ks://FontDownloader", "downloading", objArray);
          return;
       }else {
          n.l(eMOJI_TTF);
          return;
       }
    }
    public int h(String p0){
       return -1;
    }
    public int i(String p0){
       return 0;
    }
}
