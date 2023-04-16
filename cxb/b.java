package cxb.b;
import cxb.c;
import java.io.File;
import android.os.Environment;
import java.lang.String;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.model.CDNUrl;
import kp.r1;
import mc6.j;
import j80.g;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.photo.download.utils.e;
import java.lang.Object;
import wkd.b;
import zwb.a;
import com.kwai.framework.model.user.QCurrentUser;
import brd.t;
import cjd.e;
import erd.o;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;

public final class b	// class@00208d
{

    public static File a(c p0){
       File uFile = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM), "Camera");
       if (uFile.exists()) {
          return uFile;
       }
       return Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);
    }
    public static File b(c p0,BaseFeed p1){
       return g.c(j.c(r1.H0(p1), p1.getId()));
    }
    public static void c(c p0,QPhoto p1,boolean p2){
       if (!e.d(p1)) {
          b.a(-258426948).c(p1.getPhotoId(), QCurrentUser.ME.getId(), p2).map(new e()).subscribe(Functions.d(), Functions.d());
       }
       return;
    }
}
