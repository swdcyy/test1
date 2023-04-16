package mg.t4;
import com.yxcorp.utility.i$d;
import java.lang.String;
import java.util.SortedMap;
import java.util.concurrent.atomic.AtomicInteger;
import com.kwai.feature.post.api.feature.bridge.JsSelectImageResult;
import f55.g;
import java.lang.Object;
import og.l;
import java.lang.StringBuilder;
import q87.c;
import android.graphics.BitmapFactory$Options;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.kwai.feature.post.api.feature.bridge.JsSelectImageResult$a;
import com.yxcorp.utility.TextUtils;
import java.io.File;
import qkd.b;
import java.lang.Integer;
import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;
import java.lang.Throwable;

public class t4 implements i$d	// class@002665
{
    public final String a;
    public final SortedMap b;
    public final AtomicInteger c;
    public final JsSelectImageResult d;
    public final g e;

    public void t4(String p0,SortedMap p1,AtomicInteger p2,JsSelectImageResult p3,g p4){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       super();
    }
    public void a(){
    }
    public void b(String p0,int p1){
       String str = "SelectImage onBlockComplete outputPath=";
       Object[] objArray = new Object[0];
       l.D().w("SelectImageFun", str+p0+" photoPath="+this.a, objArray);
       BitmapFactory$Options options = new BitmapFactory$Options();
       options.inJustDecodeBounds = true;
       BitmapFactory.decodeFile(p0, options);
       JsSelectImageResult$a uoa = new JsSelectImageResult$a();
       uoa.mWidth = options.outWidth;
       uoa.mHeight = options.outHeight;
       uoa.mFilePath = p0;
       uoa.mOriginFilePath = this.a;
       uoa.mFileType = TextUtils.s(p0);
       uoa.mBase64Image = b.w(new File(p0));
       Object[] objArray1 = new Object[0];
       l.D().w("SelectImageFun", str+p0+" photoPath="+this.a+" options.outWidth="+options.outWidth+" options.outHeight="+options.outHeight, objArray1);
       if (uoa.mBase64Image != null) {
          Object[] objArray2 = new Object[0];
          l.D().w("SelectImageFun", "SelectImage onBlockComplete base64="+(uoa.mBase64Image).length(), objArray2);
       }
       this.b.put(Integer.valueOf(p1), uoa);
       return;
    }
    public void c(String p0,int p1){
       if (!this.c.decrementAndGet()) {
          Iterator iterator = this.b.values().iterator();
          while (iterator.hasNext()) {
             ArrayList uArrayList = new ArrayList();
             uArrayList.add(iterator.next());
             t4 td = this.d;
             td.mImageDatas = uArrayList;
             this.e.onSuccess(td);
          }
       }
       return;
    }
    public void onError(Throwable p0){
       this.c.decrementAndGet();
    }
}
