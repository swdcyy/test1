package bi7.e$a;
import java.lang.Runnable;
import bi7.e;
import java.io.File;
import bi7.e$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import bi7.f;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.video.hodor.util.Timber;
import java.lang.Integer;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.nio.ByteBuffer;
import java.nio.Buffer;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.lang.Throwable;

public class e$a implements Runnable	// class@000418
{
    public final File b;
    public final e$b c;
    public final e d;

    public void e$a(e p0,File p1,e$b p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, e$a.class, "1")) {
          return;
       }
       e$a td = this.d;
       e$a tb = this.b;
       e$a tc = this.c;
       _monitor_enter(td);
       if (PatchProxy.applyVoidTwoRefs(tb, tc, td, e.class, "7")) {
          _monitor_exit(td);
       }else {
          File uFile = tc.a(tb);
          if (!uFile.exists()) {
             _monitor_exit(td);
          }else if(!TextUtils.equals(f.a(uFile), tc.b)){
             Object[] objArray = new Object[0];
             Timber.e("[VPP] error md5", objArray);
             _monitor_exit(td);
          }else {
             File uFile1 = tc.c(tb);
             if (uFile1.exists()) {
                String str = "[VPP] delete raw file: path=%s ret=%d";
                Object[] objArray1 = new Object[2];
                objArray1[0] = uFile1.getAbsolutePath();
                int i = (uFile1.delete())? 1: 0;
                objArray1[1] = Integer.valueOf(i);
                Timber.e(str, objArray1);
             }
             try{
                Bitmap uBitmap = BitmapFactory.decodeFile(uFile.getAbsolutePath());
                ByteBuffer uByteBuffer = ByteBuffer.allocate(uBitmap.getByteCount());
                uBitmap.copyPixelsToBuffer(uByteBuffer);
                uByteBuffer.flip();
                FileOutputStream uFileOutputS = new FileOutputStream(uFile1);
                FileChannel channel = uFileOutputS.getChannel();
                channel.write(uByteBuffer);
                channel.close();
                uFileOutputS.close();
                tc.c = uFile1.getAbsolutePath();
                Object[] objArray2 = new Object[]{tc};
                Timber.i("[VPP] generateRaw done, %s", objArray2);
             }catch(java.io.FileNotFoundException e1){
                Timber.e(e1);
             }catch(java.io.IOException e1){
                Timber.e(e1);
             }catch(java.lang.OutOfMemoryError e1){
                Timber.e(e1);
             }
             _monitor_exit(td);
          }
       }
       return;
    }
}
